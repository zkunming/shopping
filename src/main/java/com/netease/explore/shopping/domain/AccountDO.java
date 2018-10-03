package com.netease.explore.shopping.domain;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 账户表
 */
public class AccountDO {

  /**
   * 用户id
   */
  private String userId;

  /**
   * 账户类型
   */
  private String type;
  /**
   * 账户余额
   */
  private BigDecimal balance;
  /**
   * 冻结金额
   */
  private BigInteger freeMoney;

  /**
   * 版本【数据库乐观锁控制】
   */
  private Integer version;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BigInteger getFreeMoney() {
    return freeMoney;
  }

  public void setFreeMoney(BigInteger freeMoney) {
    this.freeMoney = freeMoney;
  }

}
