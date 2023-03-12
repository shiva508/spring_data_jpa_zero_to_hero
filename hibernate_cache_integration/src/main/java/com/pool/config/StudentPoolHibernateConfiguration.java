package com.shiva.config;

import java.util.Properties;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import static org.hibernate.cfg.Environment.*;
@Configuration
@EnableTransactionManagement
@EnableCaching
@ComponentScan(basePackages = { "com.shiva" })
@PropertySource(value = { "classpath:application.properties" })
public class StudentPoolHibernateConfiguration {
	@Autowired
	private Environment env;

	@Bean
	public DataSource securityDataSource() {
		 
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		  dataSource.setDriverClassName(env.getProperty("mysql.driverClassName"));
		  dataSource.setUrl(env.getProperty("mysql.url"));
		  dataSource.setUsername(env.getProperty("mysql.username"));
		  dataSource.setPassword(env.getProperty("mysql.password")); 
		  return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(securityDataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.shiva.model" });
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	public Properties hibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("org.hibernate.dialect.Dialect", env.getRequiredProperty("hibernate.dialect"));
		hibernateProperties.put(org.hibernate.cfg.Environment.SHOW_SQL, env.getRequiredProperty("hibernate.show_sql"));
		hibernateProperties.put(org.hibernate.cfg.Environment.FORMAT_SQL, env.getRequiredProperty("hibernate.format_sql"));
		hibernateProperties.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO, env.getRequiredProperty("hibernate.hbm2ddl.auto"));
		/*CACHE PROPERTIES*/
		/*hibernateProperties.put("hibernate.cache.use_second_level_cache", true);
		hibernateProperties.put("hibernate.cache.use_query_cache", true);
		hibernateProperties.put("hibernate.cache.region.factory_class", "ehcache");*/
		/*hibernateProperties.put("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.EhCacheRegionFactory");*/
		hibernateProperties.put("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.EhCacheRegionFactory");
		hibernateProperties.put("hibernate.cache.use_second_level_cache",Boolean.TRUE.toString());
		/*hibernateProperties.put("hibernate.cache.use_query_cache", Boolean.TRUE.toString());*/
		hibernateProperties.put("net.sf.ehcache.configurationResourceName", "ehcache.xml");
		
		//C3P0
		hibernateProperties.put(C3P0_MIN_SIZE, env.getProperty("hibernate.c3p0.min_size"));
		hibernateProperties.put(C3P0_MAX_SIZE, env.getProperty("hibernate.c3p0.max_size"));
		hibernateProperties.put(C3P0_ACQUIRE_INCREMENT,env.getProperty("hibernate.c3p0.acquire_increment"));
		hibernateProperties.put(C3P0_TIMEOUT, env.getProperty("hibernate.c3p0.timeout"));
		hibernateProperties.put(C3P0_MAX_STATEMENTS, env.getProperty("hibernate.c3p0.max_statements"));
		// HikariCP settings
        // Maximum waiting time for a connection from the pool
		hibernateProperties.put("hibernate.hikari.connectionTimeout", "20000");
        // Minimum number of ideal connections in the pool
		hibernateProperties.put("hibernate.hikari.minimumIdle", "10");
        // Maximum number of actual connection in the pool
		hibernateProperties.put("hibernate.hikari.maximumPoolSize", "20");
        // Maximum time that a connection is allowed to sit ideal in the pool
		hibernateProperties.put("hibernate.hikari.idleTimeout", "300000");
		return hibernateProperties;
		
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

}
