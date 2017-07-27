package com.holiday.holiday;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication
//@EntityScan(basePackages = {"com.holiday.holiday.model"} )
//@EnableJpaRepositories(basePackages = {"com.holiday"})
@ComponentScan("com.holiday.holiday") 
@EnableWebMvc
public class HolidayApplication /*implements CommandLineRunner*/ {

		 

		   /* @Autowired
		    HolidayRepository customerRepository;*/

		    public static void main(String[] args) throws Exception {
		        SpringApplication.run(HolidayApplication.class, args);
		    }
		   	

		   /* @Override
		    public void run(String... args) throws Exception {

		        //System.out.println("DATASOURCE = " + dataSource);

		        /// Get dbcp2 datasource settings
		        // BasicDataSource newds = (BasicDataSource) dataSource;
		        // System.out.println("BasicDataSource = " + newds.getInitialSize());

		        System.out.println("Display all customers...");
		        List<Holiday> list = customerRepository.findAll();
		        list.forEach(x -> System.out.println(x));

		        System.out.println("Done!");

		      //  exit(0);
		    }*/
	
}
