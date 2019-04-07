package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({TestCategoryB.class})
public class TaskTest {

    @Test
    public void createTaskTest(){
        Assert.assertFalse(false);
    }
}
