package com.cs.tmt;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class JettyServerConfiguration {

	@Bean
	public JettyServletWebServerFactory tomcatFactory() {

		return new JettyServletWebServerFactory() {

			@Override
			protected void postProcessWebAppContext(WebAppContext webAppContext) {
				super.postProcessWebAppContext(webAppContext);

				DataSource dataSource = DataSourceBuilder.create().url("jdbc:h2:mem:testdb").username("sa").password("").driverClassName("org.h2.Driver").build();

				/*   resource.setType(DataSource.class.getName());
               resource.setName("j4s");
               resource.setProperty("factory", "org.apache.tomcat.jdbc.pool.DataSourceFactory");
               resource.setProperty("driverClassName", "com.mysql.jdbc.Driver");
               resource.setProperty("url", "jdbc:mysql://localhost/test");
               resource.setProperty("username", "java4s");
               resource.setProperty("password", "java4s");*/

				try {
					new org.eclipse.jetty.plus.jndi.Resource(webAppContext.getServer(), "jdbc/jcgDS", dataSource);
				} catch (NamingException e) {
				}

				//webAppContext.getCurrentContext().getNamingResources().addResource(resource);

			}
			/* @Override
	           protected TomcatEmbeddedServletContainer getTomcatEmbeddedServletContainer(Tomcat tomcat) 
	           {
	                tomcat.enableNaming();
	                return super.getTomcatEmbeddedServletContainer(tomcat);
	            }*/

			/*  @Override
	            protected void postProcessContext(Context context) 
	            {
	                ContextResource resource = new ContextResource();

	                resource.setType(DataSource.class.getName());
	                resource.setName("j4s");
	                resource.setProperty("factory", "org.apache.tomcat.jdbc.pool.DataSourceFactory");
	                resource.setProperty("driverClassName", "com.mysql.jdbc.Driver");
	                resource.setProperty("url", "jdbc:mysql://localhost/test");
	                resource.setProperty("username", "java4s");
	                resource.setProperty("password", "java4s");

	                context.getNamingResources().addResource(resource);
	            }*/


		};
	}

	@Bean
	public DataSource jndiDataSource() throws IllegalArgumentException, NamingException, SQLException 
	{
		JndiObjectFactoryBean bean = new JndiObjectFactoryBean();    
		bean.setJndiName("jdbc/jcgDS");
		bean.setProxyInterface(DataSource.class);
		bean.setLookupOnStartup(false);
		bean.afterPropertiesSet();

		DataSource datasource = (DataSource) bean.getObject();
		System.out.println("Hurrayyyy ==== >>>>> "+datasource.getConnection());
		return datasource;

	}

}
