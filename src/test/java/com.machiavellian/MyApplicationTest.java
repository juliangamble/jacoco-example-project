package com.machiavellian;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyApplicationTest {
    private MyApplication myApplication = new MyApplication();

    @Test
    public void testAdd() {
        Object result = myApplication.add(1, 1);
        assertEquals(result, 2);
    }
}
