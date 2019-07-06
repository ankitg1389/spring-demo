package com.ak.jks.jksdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {
	
	@GetMapping
	public String hello() {
		return "Secure Method";
	}
	
//	keytool -genkey -alias cert-dev -storetype JKS -keyalg RSA -keysize 1024 -validity 365 -keystore cert-dev.jks

}