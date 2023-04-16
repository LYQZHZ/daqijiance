package com.fusheng.daqijiance.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/index.html", "/img/**", "/fonts/**", "/favicon.ico", "/verifyCode", "/dqjc/**", "/userBjh/**");
    }

    //配置采用哪种密码加密算法
    @Bean
    public PasswordEncoder passwordEncoder() {
        //不使用密码加密
        //return NoOpPasswordEncoder.getInstance();

        //使用默认的BCryptPasswordEncoder加密方案
        return new BCryptPasswordEncoder();

        //strength=10，即密钥的迭代次数(strength取值在4~31之间，默认为10)
        //return new BCryptPasswordEncoder(10);

        //利用工厂类PasswordEncoderFactories实现,工厂类内部采用的是委派密码编码方案.
        //return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}
