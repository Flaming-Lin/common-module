package com.flaming.common.converter;

import org.springframework.beans.BeanUtils;

/**
 * 基于 Spring BeanUtils 的泛型类转换器
 *
 * @Author: Flaming
 * @Time: 2020-01-11 11:29
 */
public class BeanCopyConverter<T> implements IBeanConverter<Object, T> {

    @Override
    public T convert(Object o, Class<T> clazz) {
        if (null == o) {
            return null;
        }

        try {
            T newObj = clazz.newInstance();
            BeanUtils.copyProperties(o, newObj);
            return newObj;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
