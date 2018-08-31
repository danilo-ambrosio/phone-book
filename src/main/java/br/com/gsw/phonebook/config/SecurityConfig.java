/*
 * @(#)SecurityConfig.java 1.0 26/04/2018
 *
 * Copyright (c) 2018, Plena. All rights reserved.
 */

package br.com.gsw.phonebook.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * {@code SecurityConfig}
 *
 * @author Danilo Ambrosio
 * @version 1.0 31/08/2018
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests().antMatchers("/country", "/contact").permitAll();
    }
}