package org.example.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestVWOlogin {

    @Test
    public  void testLoginPositive() {
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

    }
}
