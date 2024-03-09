package com.church.holylink.config.multitenant;

import com.church.holylink.config.hibernate.MultitenantEntityManager;
import com.church.holylink.config.interceptor.PathMatchingConfigurationAdapter;
import com.church.holylink.config.interceptor.RequestInterceptor;
import com.church.holylink.config.migration.SchemaMigrationInitializer;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
public class MultitenantConfig {
  @Value("#{'${multitenant.schemas:public}'.split(',')}")
  private List<String> schemas;
  @Value("${multitenant.package:com.app.api}")
  private String packageToScan;
  @Value("${multitenant.scripts:db/migration}")
  private String scriptsLocation;

  public MultitenantConfig() {
  }

  @Bean(initMethod = "migrate")
  public SchemaMigrationInitializer flywayMigrationInitializer(DataSource dataSource) {
    return new SchemaMigrationInitializer(this.scriptsLocation, dataSource, this.schemas);
  }

  @Bean
  public PathMatchingConfigurationAdapter pathMatchingConfigurationAdapter(
      RequestInterceptor requestInterceptor) {
    return new PathMatchingConfigurationAdapter(requestInterceptor);
  }

  @Bean
  @DependsOn({"flywayMigrationInitializer"})
  public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaProperties jpaProperties) {
    return new MultitenantEntityManager(jpaProperties, dataSource, this.packageToScan);
  }
}
