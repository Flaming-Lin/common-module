package com.flaming.common.mybatis;

/**
 * @Author: Flaming
 * @Time: 2019-12-31 08:21
 */
public class EnumUtil {

    /**
     * 根据 Code 获取枚举类型（必须实现 {@link BaseEnum} 接口）
     *
     * @param enumClass 枚举类
     * @param code      code
     * @param <E>       限定为实现了 {@link BaseEnum} 的枚举类
     * @return 枚举类型
     */
    public static <E extends Enum<?> & BaseEnum> E getEnumByCode(Class<E> enumClass, int code) {
        E[] enumConstants = enumClass.getEnumConstants();
        for (E e : enumConstants) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }

}
