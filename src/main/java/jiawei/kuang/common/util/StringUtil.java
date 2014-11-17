package jiawei.kuang.common.util;

public class StringUtil {
    
    public String[] splitString(String string, String regex) {
        String[] strs = string.split(regex);
        for (String str: strs) {
            str.trim();
        }
        return strs;
    }

}
