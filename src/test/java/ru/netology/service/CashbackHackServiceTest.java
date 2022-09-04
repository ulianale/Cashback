package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void test1() {
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void test2() {
        Assert.assertEquals(999, service.remain(1001));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, service.remain(1000));
    }
}
