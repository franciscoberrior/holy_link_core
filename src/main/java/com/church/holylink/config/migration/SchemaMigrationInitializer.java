package com.church.holylink.config.migration;

import java.util.List;
import javax.sql.DataSource;
import org.flywaydb.core.Flyway;

public class SchemaMigrationInitializer {
  private final String scriptLocation;
  private final DataSource dataSource;
  private final List<String> schemas;

  public void migrate() {
    this.schemas.forEach((tenant) -> {
      Flyway flyway = Flyway.configure().locations(new String[]{this.scriptLocation}).baselineOnMigrate(Boolean.TRUE).dataSource(this.dataSource).schemas(new String[]{tenant}).load();
      flyway.migrate();
    });
  }

  public SchemaMigrationInitializer(String scriptLocation, DataSource dataSource, List<String> schemas) {
    this.scriptLocation = scriptLocation;
    this.dataSource = dataSource;
    this.schemas = schemas;
  }
}