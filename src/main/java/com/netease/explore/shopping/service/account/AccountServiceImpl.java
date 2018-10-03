package com.netease.explore.shopping.service.account;

import com.netease.explore.shopping.dao.AccountDao;
import com.netease.explore.shopping.domain.AccountDO;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

  @Autowired
  private AccountDao accountDao;

  @Override
  public void insert(AccountDO account) {
    accountDao.insertList(Lists.newArrayList(account));
  }
}
