package test.art.com.testproject.test;

import org.junit.Before;
import org.junit.Test;

import test.art.com.testproject.utils.Calculator;

import static org.junit.Assert.assertEquals;

/**
 * ==================================================
 * 项目名称：TestProject
 * 创建人：wangxiaolong
 * 创建时间：16/7/14 下午4:21
 * 备注：
 * Version：
 * ==================================================
 */

public class CalculatorTest {
    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);

    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(-4d, mCalculator.substract(1d, 5d), 0);

    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(6d, mCalculator.divide(6d , 1d) ,1d );


    }

    @Test
    public void testMutiply() throws Exception {
        assertEquals(6d, mCalculator.mutiply(6d , 1d) ,1d );
    }
}