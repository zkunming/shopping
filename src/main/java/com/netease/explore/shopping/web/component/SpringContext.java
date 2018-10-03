package com.netease.explore.shopping.web.component;

import org.springframework.context.ApplicationContext;

/**
 * shopping-bean 上下文
 */
public class SpringContext {

  private static ApplicationContext applicationContext;

  public ApplicationContext getApplicationContext() {
    return applicationContext;
  }

  public static void setApplicationContext(ApplicationContext applicationContext) {
    applicationContext = applicationContext;
  }
}
