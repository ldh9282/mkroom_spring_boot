package com.beatphobia.mkroom;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class AppConfig {
	@Bean
	public FilterRegistrationBean<CharacterEncodingFilter> encodingFilterRegistration() {
		FilterRegistrationBean<CharacterEncodingFilter> registrationBean = new FilterRegistrationBean<>();
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		registrationBean.setFilter(characterEncodingFilter);
		registrationBean.addUrlPatterns("/*");
		return registrationBean;
	}
}
