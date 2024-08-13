package com.example.demo.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.bean.HelloBean;
import com.example.demo.bean.HelloMessageGenerator;
import com.example.demo.bean.PrototypeScopeBean;
import com.example.demo.servlet.HelloWorldServlet;

import jakarta.servlet.http.HttpServlet;

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
	//servlet
	@Bean
	public ServletRegistrationBean<HttpServlet> helloServlet() {
		ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
		servRegBean.setServlet(new HelloWorldServlet());
		servRegBean.addUrlMappings("/hello/*");
		servRegBean.setLoadOnStartup(1);
		return servRegBean;
	}
	
	
}
