package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.bean.HelloBean;
import com.example.demo.bean.HelloMessageGenerator;
import com.example.demo.bean.PrototypeScopeBean;

import jakarta.annotation.Resource;

@Configuration
public class AppConfig implements WebMvcConfigurer {

	@Bean
	public HelloBean bean()
	{
		return new HelloBean();
	}
	
	@Bean("ProtoypeBean")
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public PrototypeScopeBean createPrototype()
	{
		return new PrototypeScopeBean();
	}
	
	@Bean
	@RequestScope
	public HelloMessageGenerator RequestScopeBean()
	{
		return new HelloMessageGenerator();
	}
	
}
