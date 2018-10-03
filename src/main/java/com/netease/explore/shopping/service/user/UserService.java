package com.netease.explore.shopping.service.user;

import com.netease.explore.shopping.domain.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhangkunming
 */
public interface UserService {


  List<User> findByName(@Param("name") String name);

  /**
   * 事务测试
   **/
  void transaction();

  void insert(@Param("user") User user);

  User findById(String id);
}