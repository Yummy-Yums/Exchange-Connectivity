package com.kepf.Exchangeconnectivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController

public class ExchangeConnectivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeConnectivityApplication.class, args);
	}

	@RequestMapping(method = {RequestMethod.GET},path = "api/v1")
	public String getApi(){
		return "This is the Exchange-Connectivity Api v1";
	}

}
