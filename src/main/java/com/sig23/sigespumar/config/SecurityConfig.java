package com.sig23.sigespumar.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by kevin on 06-17-17.
 */
/*
* Kevin Rivera
* Fecha: 06-17-17
* Descripción: 
*/
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/tactico/**").access("hasAnyRole('TACTICO','ADMIN')")
                .antMatchers("/estrategico/**").access("hasAnyRole('ESTRATEGICO','ADMIN')")
                .and()
                .formLogin();

    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //
        auth.inMemoryAuthentication()
                .withUser("tactico").password("123456").roles("TACTICO").and()
                .withUser("administrador").password("admin123").roles("ADMIN").and()
                .withUser("estrategico").password("123456").roles("ESTRATEGICO");
    }
}
