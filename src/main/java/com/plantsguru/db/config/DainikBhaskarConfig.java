package com.plantsguru.db.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
  entityManagerFactoryRef = "dbEntityManagerFactory",
  transactionManagerRef = "dbTransactionManager",
  basePackages = { "com.plantsguru.db.repo" }
)
public class DainikBhaskarConfig {
 
  @Bean(name = "dbDataSource")
  @ConfigurationProperties(prefix = "db.datasource")
  public DataSource dataSource() {
    return DataSourceBuilder.create().build();
  }
  
  @Bean(name = "dbEntityManagerFactory")
  public LocalContainerEntityManagerFactoryBean dbEntityManagerFactory(
    EntityManagerFactoryBuilder builder,
    @Qualifier("dbDataSource") DataSource dataSource) {
    return
      builder
        .dataSource(dataSource)
        .packages("com.plantsguru.db.model")
        .persistenceUnit("db")
        .build();
  }
  @Bean(name = "dbTransactionManager")
  public PlatformTransactionManager dbTransactionManager(
    @Qualifier("dbEntityManagerFactory") EntityManagerFactory
    dbEntityManagerFactory) {
    return new JpaTransactionManager(dbEntityManagerFactory);
  }
}