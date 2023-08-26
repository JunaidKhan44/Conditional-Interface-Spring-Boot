/**
 * 
 */
package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.springboot.condition.VerifyStudentCondition;

/**
 * @author Junaid.Khan
 *
 */
@Configuration
public class StudentConfig {

	@Conditional(VerifyStudentCondition.class)
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
