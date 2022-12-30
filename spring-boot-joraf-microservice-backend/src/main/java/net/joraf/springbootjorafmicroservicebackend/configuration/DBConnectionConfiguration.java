package net.joraf.springbootjorafmicroservicebackend.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableConfigurationProperties(DBConfiguration.class)
public class DBConnectionConfiguration {

    private DBConfiguration dbConfiguration;

    public DBConnectionConfiguration(DBConfiguration dbConfiguration) {
        this.dbConfiguration = dbConfiguration;
    }
    //DEV
    @Profile("dev")
    @Bean
    public String devDBConnection(){
        System.out.println("DB Connection for DEV");
        System.out.println(dbConfiguration.getUri());
        System.out.println(dbConfiguration.getPort());
        System.out.println(dbConfiguration.getUsername());
        System.out.println(dbConfiguration.getPassword());
        System.out.println(dbConfiguration.getMongodb());
        return "DB Connection for DEV";

    }

    //PROD
    @Profile("prod")
    @Bean
    public String prodDBConnection(){
        System.out.println("DB Connection for PROD");
        System.out.println(dbConfiguration.getUri());
        System.out.println(dbConfiguration.getPort());
        System.out.println(dbConfiguration.getUsername());
        System.out.println(dbConfiguration.getPassword());
        System.out.println(dbConfiguration.getMongodb());
        return "DB Connection for PROD";
    }
}
