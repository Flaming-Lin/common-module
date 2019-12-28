package com.flaming.util;

/**
 * @Author: Flaming
 * @Time: 2019-12-21 12:32
 */
public class StringUtils {

    /**
     * 判断字符串是否为空
     *
     * @param cs 字符串
     * @return 是否为空
     */
    public static boolean isEmpty(final CharSequence cs){
        return null == cs || cs.length() == 0;
    }

    /**
     * 判断字符串是否非空
     *
     * @param cs 字符串
     * @return 是否非空
     */
    public static boolean isNotEmpty(final CharSequence cs){
        return !isEmpty(cs);
    }

}
