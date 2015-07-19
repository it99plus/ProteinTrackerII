package com.sipleprogram.proteintracker;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(GoodTestCategory.class)
public class HelloJUnitTest {

    @Test
    public void HelloTest() {
        System.out.println("Hello JUnit.");
    }
}