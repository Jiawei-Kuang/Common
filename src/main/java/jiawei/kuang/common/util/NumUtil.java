package jiawei.kuang.common.util;

import jiawei.kuang.common.exception.InvalidIntegerException;

public class NumUtil {
    
    /**
     * 
     * @param num input integer number
     * @return String ordinal number
     * @throws InvalidIntegerException if the input number is less than or equals to 0
     * @since Nov. 17, 2014
     */
    public String convertNumToOrdinal(int num) {
        if (num <= 0) {
            throw new InvalidIntegerException("Input number is not positive, so cannot parse to ordinal.");
        }
        
        StringBuffer sb = new StringBuffer();
        sb.append(num);
        int remain = num % 10;
        if (remain == 1) {
            sb.append("st");
        } else if (remain == 2) {
            sb.append("nd");
        } else if (remain == 3) {
            sb.append("rd");
        } else {
            sb.append("th");
        }
        return sb.toString();
    }
}