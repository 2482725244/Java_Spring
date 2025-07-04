package com.xing.config;

import com.xing.interceptor.LoginIntceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login","/users/**","/movies/**","/doLogin","/static/**");
    }
}
