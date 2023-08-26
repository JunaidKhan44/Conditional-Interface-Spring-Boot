/**
 * 
 */
package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Junaid.Khan
 *
 */

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String getRequest() {
		return restTemplate.getForObject("http://localhost:8080/token", String.class);

	}
	
	@GetMapping("/")
	public String getIndex() {
		return "hello";

	}
}
