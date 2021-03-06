package com.netease.explore.shopping.service.user;

import com.netease.explore.shopping.BaseMockTest;
import com.netease.explore.shopping.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseMockTest {

  @Autowired
  private UserService userService;

  @Test
  public void testTransaction() {
    userService.transaction();
  }

  @Test
  public void testFindById() {
    User user = userService.findById("1");
    Assert.assertNotNull(user);
  }

  @Test
  public void testInsert() {
    User user = new User();
    user.setName("testHelloMock test");
    userService.insert(user);
  }
}