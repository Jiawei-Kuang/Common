package jiawei.kuang.common.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class StringUtilTest {
    
    private StringUtil stringUtil;
    
    @Before
    public void initialization() {
        stringUtil = new StringUtil();
    }
    
    @Test
    public void test() {
        String string = "     Tom has a dog.   This dog is so cute. Tom love it very much! ";
        List<String> expected = new ArrayList<String>();
        expected.add("Tom has a dog.");
        expected.add("This dog is so cute.");
        expected.add("Tom love it very much!");
        Set<Character> separators = new HashSet<Character>();
        separators.add('.');
        separators.add('!');
        assertEquals(expected, stringUtil.partitionString(string, separators));
    }


}
