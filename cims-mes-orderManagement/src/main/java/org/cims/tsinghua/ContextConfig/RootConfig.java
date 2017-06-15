package org.cims.tsinghua.ContextConfig;

//import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.cims.tsinghua.models.ProductionOrder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@MapperScan("org.cims.tsinghua.daos")
@PropertySource("classpath:/META-INF/mysql.properties")
public class RootConfig {
  @Autowired
  Environment env;

  @Bean
  public DriverManagerDataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl(env.getProperty("spring.datasource.url"));
    dataSource.setUsername(env.getProperty("spring.datasource.name"));
    dataSource.setPassword(env.getProperty("spring.datasource.password"));
    return dataSource;
  }

  @Bean
  public DataSourceTransactionManager transactionManager(DriverManagerDataSource dataSource) {
    DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
    return transactionManager;
  }

  // MyBatis
  @Bean
  public SqlSessionFactory sqlSessionFactory() throws Exception {
    SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
    sqlSessionFactory.setDataSource(dataSource());
    sqlSessionFactory.setTypeAliasesPackage("org.cims.tsinghua.models");

    // ClassPathResource classpathresource = new
    // ClassPathResource("classpath:/META-INF/mappers/StudentMapper.xml");
    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    sqlSessionFactory.setMapperLocations(resolver.getResources("classpath:/mappers/*.xml"));
    return (SqlSessionFactory) sqlSessionFactory.getObject();
  }

  @Bean
  public ProductionOrder productionOrder() {
    return new ProductionOrder();
  }


}
