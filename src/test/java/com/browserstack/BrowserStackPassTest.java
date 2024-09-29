package com.browserstack;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class BrowserStackPassTest {

    @Test(invocationCount = 2)
    public void failureTest(ITestContext testContext) throws Exception {
    int x = 5;
    int y = 6;
    int sum = x + y;
    System.out.println(sum);
    }
}
