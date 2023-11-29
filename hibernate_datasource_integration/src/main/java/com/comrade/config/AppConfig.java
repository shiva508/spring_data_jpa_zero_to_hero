package com.comrade.config;

import java.util.Properties;
import javax.sql.DataSource;

import com.comrade.entity.User;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScans(value= {
		@ComponentScan("com.shiva.service"),
		@ComponentScan("com.shiva.dao")
})
public class AppConfig {
	@Autowired
	private Environment ev;
	@Bean
	public DataSource getDataSource()
	{
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName(ev.getProperty("db.driver"));
		dataSource.setUrl(ev.getProperty("db.url"));
		dataSource.setUsername(ev.getProperty("db.username"));
		dataSource.setPassword(ev.getProperty("db.password"));
		return dataSource;
	}
	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{ 
		LocalSessionFactoryBean factoryBean=new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDataSource());
		Properties prop=new Properties();
		prop.put("hibernate.show_sql", ev.getProperty("hibernate.show_sql"));
		prop.put("hibernate.hbm2ddl.auto", ev.getProperty("hibernate.hbm2ddl.auto"));
		factoryBean.setHibernateProperties(prop);
		factoryBean.setAnnotatedClasses(User.class);
		return factoryBean;
	}
	
	@Bean
	   public HibernateTransactionManager getTransactionManager() {
	      HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	      transactionManager.setSessionFactory(getSessionFactory().getObject());
	      return transactionManager;
	   }
}
