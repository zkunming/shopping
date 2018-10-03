package com.netease.explore.shopping.service.account;

import com.netease.explore.shopping.BaseMockTest;
import com.netease.explore.shopping.domain.AccountDO;
import java.math.BigDecimal;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceTest extends BaseMockTest {

  @Autowired
  private AccountService accountService;

  @Test
  public void insert() {
    AccountDO account = new AccountDO();
    account.setBalance(new BigDecimal("1000"));
    account.setType("cyn");
    account.setVersion(1);

    accountService.insert(account);
  }

  @Test
  public void insertSelective() {
  }

  @Test
  public void insertList() {
  }

  @Test
  public void update() {
  }
}