package com.flaming.common.util;

import java.text.DecimalFormat;
import java.util.Optional;

/**
 * @Author: Flaming
 * @Time: 2019-12-28 10:36
 */
public class NumberUtil {

    /**
     * 若值为null，则返回数字0
     *
     * @param value 需要检测的值
     * @return 非 null 的值或0
     */
    public static int nullToIntZero(Integer value){
        return Optional.ofNullable(value).orElse(0);
    }

    /**
     * 判断字符串是否为 Long 型数据
     * 
     * @param numberStr 字符串
     * @return 是否为 Long 型数据
     */
    public static boolean isLong(String numberStr){
        if(StringUtils.isEmpty(numberStr)){
            return false;
        }
        
        try{
            Long.parseLong(numberStr);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    /**
     * 判断字符串是否为 Integer 型数据
     *
     * @param numberStr 字符串
     * @return 是否为 Integer 型数据
     */
    public static boolean isInteger(String numberStr){
        if(StringUtils.isEmpty(numberStr)){
            return false;
        }

        try{
            Integer.parseInt(numberStr);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    /**
     * 将 double 类型的数据四舍五入为 int
     *
     * @param value double 数据
     * @return int 数据
     */
    public static int roundDoubleToInteger(double value){
        return Integer.parseInt(new DecimalFormat("0").format(value));
    }

}
