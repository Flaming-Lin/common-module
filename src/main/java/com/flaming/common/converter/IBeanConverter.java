package com.flaming.common.converter;

import com.flaming.common.struct.exception.UnImplementException;

/**
 * 类转换器
 *
 * @Author: Flaming
 * @Time: 2020-01-11 11:25
 */
public interface IBeanConverter<SOURCE, TARGET> {

    /**
     * 【泛型专用】将 SOURCE 类型转换为 TARGET 类型
     * 为泛型实现提供了 clazz 入参，避免泛型擦除
     *
     * @param source SOURCE类型
     * @param clazz  TARGET的类
     * @return TARGET 类型
     * @throws UnImplementException 未实现方法异常
     */
    default TARGET convert(SOURCE source, Class<TARGET> clazz) throws UnImplementException {
        throw new UnImplementException("Can not find implement of this method");
    }

    /**
     * 【实体类专用】将 SOURCE 类型转换为 TARGET 类型
     *
     * @param source SOURCE类型
     * @return TARGET 类型
     * @throws UnImplementException 未实现方法异常
     */
    default TARGET convert(SOURCE source) throws UnImplementException {
        throw new UnImplementException("Can not find implement of this method");
    }

}
