package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void testAddition() {
        App app = new App();
        Assert.assertEquals(app.add(2, 3), 5, "Addition test failed!");
    }
}
	