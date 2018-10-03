package com.netease.explore.shopping.dao;

import com.netease.explore.shopping.domain.AccountDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountDao {

  int insertSelective(@Param("account") AccountDO account);

  int insertList(@Param("accounts") List<AccountDO> accounts);

  AccountDO findByUserIdAndType(@Param("userId") String userId, @Param("type") String type);
}
