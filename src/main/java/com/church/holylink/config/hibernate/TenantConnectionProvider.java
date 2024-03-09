package com.church.holylink.config.hibernate;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TenantConnectionProvider implements MultiTenantConnectionProvider {
  private static final Logger log = LoggerFactory.getLogger(TenantConnectionProvider.class);
  private final DataSource dataSource;

  public TenantConnectionProvider(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public Connection getAnyConnection() throws SQLException {
    return this.dataSource.getConnection();
  }

  public void releaseAnyConnection(Connection connection) throws SQLException {
    connection.close();
  }

  public Connection getConnection(String tenantIdentifier) throws SQLException {
    log.info("Get connection for tenant {}", tenantIdentifier);
    Connection connection = this.getAnyConnection();
    connection.setSchema(tenantIdentifier);
    return connection;
  }

  public void releaseConnection(String tenantIdentifier, Connection connection) throws SQLException {
    log.info("Release connection for tenant {}", tenantIdentifier);
    connection.setSchema("public");
    this.releaseAnyConnection(connection);
  }

  public boolean supportsAggressiveRelease() {
    return false;
  }

  public boolean isUnwrappableAs(Class aClass) {
    return false;
  }

  public <T> T unwrap(Class<T> aClass) {
    return null;
  }
}
