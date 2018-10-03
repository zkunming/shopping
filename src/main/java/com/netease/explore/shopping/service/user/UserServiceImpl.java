package com.netease.explore.shopping.service.user;

import com.netease.explore.shopping.dao.UserDao;
import com.netease.explore.shopping.domain.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangkunming
 */
@Service
public class UserServiceImpl implements UserService {

  private UserDao userDao;

  @Override
  public List<User> findByName(String name) {
    return null;
  }

  @Override
  public void transaction() {

  }

  @Override
  public void insert(User user) {

  }

  @Override
  public User findById(String id) {
    return userDao.findById(id);
  }
}
