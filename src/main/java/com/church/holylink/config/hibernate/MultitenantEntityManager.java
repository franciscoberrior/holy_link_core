package com.church.holylink.config.hibernate;

import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.hibernate.MultiTenancyStrategy;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class MultitenantEntityManager extends LocalContainerEntityManagerFactoryBean {
  public MultitenantEntityManager(JpaProperties jpaProperties, DataSource dataSource, String packageToScan) {
    Map<String, Object> jpaPropertiesMap = new HashMap(jpaProperties.getProperties());
    jpaPropertiesMap.put("hibernate.multiTenancy", MultiTenancyStrategy.SCHEMA);
    jpaPropertiesMap.put("hibernate.multi_tenant_connection_provider", new TenantConnectionProvider(dataSource));
    jpaPropertiesMap.put("hibernate.tenant_identifier_resolver", new TenantSchemaResolver());
    this.setDataSource(dataSource);
    this.setPackagesToScan(packageToScan);
    this.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
    this.setJpaPropertyMap(jpaPropertiesMap);
  }
}
