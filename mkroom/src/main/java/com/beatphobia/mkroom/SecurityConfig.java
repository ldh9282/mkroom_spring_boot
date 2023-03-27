package com.beatphobia.mkroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.beatphobia.mkroom.common.security.AccessDeniedHandler;
import com.beatphobia.mkroom.common.security.MemberUserDetailsService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private MemberUserDetailsService memberUserDetailsService;


	@Autowired
	private AccessDeniedHandler accessDeniedHandler;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/resources/**").permitAll()
		.antMatchers("/*").permitAll()
		.antMatchers("/member/register").permitAll()
		.antMatchers("/qna/qnalist").permitAll()
		.antMatchers("/qna/qnadetail").permitAll()
		.antMatchers("/eventboard/list").permitAll()
		.antMatchers("/eventboard/detail").permitAll()
		.antMatchers("/validateUserId/*").permitAll()
		.antMatchers("/checkUserId/*").permitAll()
		.anyRequest().authenticated()
	.and()
		.formLogin()
		.loginPage("/login")
		.loginProcessingUrl("/login")
		.usernameParameter("username")
		.passwordParameter("password")
		.defaultSuccessUrl("/")
		.failureUrl("/login?error=true")
		.permitAll()
	.and()
		.logout()
		.logoutUrl("/logout")
		.logoutSuccessUrl("/")
		.invalidateHttpSession(true)
		.permitAll()
	.and()
		.rememberMe()
		.tokenValiditySeconds(2592000)
		.rememberMeParameter("remember-me")
		.userDetailsService(memberUserDetailsService)
	.and()
		.exceptionHandling()
		.accessDeniedHandler(accessDeniedHandler);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(memberUserDetailsService)
			.passwordEncoder(passwordEncoder());
	}


}
