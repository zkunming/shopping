package com.netease.explore.shopping.web.config;

import com.netease.explore.shopping.web.component.SpringContext;
import com.netease.explore.shopping.web.component.interceptor.LogInterceptor;
import org.assertj.core.util.Lists;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer, ApplicationContextAware {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    //日志拦截器
    registry.addInterceptor(new LogInterceptor()).addPathPatterns(Lists.newArrayList("/**"));
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    SpringContext.setApplicationContext(applicationContext);
  }
}