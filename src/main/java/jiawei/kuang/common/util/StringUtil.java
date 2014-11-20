package jiawei.kuang.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StringUtil {
    
    /**
     * This function partitions a String into several subStrings by some
     * characters in a set. e.g.
     * Partition "Who are you? I am Peter." into
     * ["Who are you?", "I am Peter."]
     * 
     * @param originalString
     * @param seperators is a set containing all the separator characters
     * @return List<String> by partitioning originalString by separators
     */
    public List<String> partitionString(String originalString, Set<Character> separators) {
        List<String> strs = new ArrayList<String>();
        char[] originalCharArr = originalString.toCharArray();
        int len = originalString.length();
        for (int i = 0; i < len; i++) {
            StringBuffer sb = new StringBuffer();
            while (i < len - 1 && !separators.contains(originalCharArr[i])) {
                sb.append(originalCharArr[i++]);
            }
            sb.append(originalCharArr[i]);
            String str = sb.toString().trim();
            if (!str.isEmpty()) {
                strs.add(str);
            }
        }
        return strs;
    }

}
