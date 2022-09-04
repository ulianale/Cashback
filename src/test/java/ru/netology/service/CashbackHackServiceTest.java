package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void test1() {
        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void test2() {
        Assert.assertEquals(service.remain(1001), 999);
    }

    @Test
    public void test3() {
        Assert.assertEquals(service.remain(1000), 0);
    }

}
