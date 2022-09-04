package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    @org.junit.jupiter.api.Test
    public void test4() {
        Assertions.assertEquals(1, service.remain(999));
    }

    @org.junit.jupiter.api.Test
    public void test5() {
        Assertions.assertEquals(999, service.remain(1001));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(0, service.remain(1000));
    }
}
