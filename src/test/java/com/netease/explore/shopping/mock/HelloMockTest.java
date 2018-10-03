package com.netease.explore.shopping.mock;

import com.netease.explore.shopping.BaseMockTest;
import java.time.Instant;
import mockit.Expectations;
import mockit.Mocked;
import org.junit.Test;

public class HelloMockTest extends BaseMockTest {

  @Mocked
  private HelloMock helloMock;

  @Test
  public void testHelloMock() {
    final String helloParam = "Hi world!";
    new Expectations() {
      {
        helloMock.hello(helloParam);
        result = "I coming!";
      }
    };

    String hello = helloMock.hello(helloParam);
    System.out.println(hello);

    Instant instant = null;

  }
}
