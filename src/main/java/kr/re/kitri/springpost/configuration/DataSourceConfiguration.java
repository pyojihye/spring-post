package kr.re.kitri.springpost.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:/application.properties")
public class DataSourceConfiguration {
    private static Logger log = LoggerFactory.getLogger(DataSourceConfiguration.class);

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")   //application.properties에서 prefix로 지정된 이름을 참고하라는 뜻
    public HikariConfig hikariConfig(){
        return new HikariConfig();
    }

    @Bean
    public DataSource dataSource(){
        DataSource dataSource = new HikariDataSource(hikariConfig());
        log.debug("datasource : {}", dataSource);
        System.out.println(dataSource);
        return dataSource;
    }
}
