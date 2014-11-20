package jiawei.kuang.common.util;

import static org.junit.Assert.*;
import jiawei.kuang.common.exception.InvalidIntegerException;

import org.junit.Before;
import org.junit.Test;

public class NumUtilTest {
    
    private NumUtil numUtil;
    
    @Before
    public void initialization() {
        numUtil = new NumUtil();
    }

    @Test
    public void testST() {
        assertEquals("1st", numUtil.convertNumToOrdinal(1));
        assertEquals("21st", numUtil.convertNumToOrdinal(21));
        assertEquals("131st", numUtil.convertNumToOrdinal(131));
    }
    
    @Test
    public void testND() {
        assertEquals("2nd", numUtil.convertNumToOrdinal(2));
        assertEquals("32nd", numUtil.convertNumToOrdinal(32));
        assertEquals("142nd", numUtil.convertNumToOrdinal(142));
    }
    
    @Test
    public void testRD() {
        assertEquals("3rd", numUtil.convertNumToOrdinal(3));
        assertEquals("33rd", numUtil.convertNumToOrdinal(33));
        assertEquals("113rd", numUtil.convertNumToOrdinal(113));
    }
    
    @Test
    public void testTH() {
        assertEquals("7th", numUtil.convertNumToOrdinal(7));
        assertEquals("88th", numUtil.convertNumToOrdinal(88));
    }
    
    @Test(expected = InvalidIntegerException.class)
    public void testException() {
        numUtil.convertNumToOrdinal(0);
        numUtil.convertNumToOrdinal(-2);
    }

}
