package com.flaming.common.util;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: Flaming
 * @Time: 2019-12-21 12:32
 */
public class CollectionUtils {

    /**
     * 列表容器是否为空
     *
     * @param collection 列表容器
     * @return 容器是否为空
     */
    public static boolean isEmpty(final Collection<?> collection) {
        return null == collection || collection.isEmpty();
    }

    /**
     * 列表容器是否非空
     *
     * @param collection 列表容器
     * @return 容器是否非空
     */
    public static boolean isNotEmpty(final Collection<?> collection) {
        return !isEmpty(collection);
    }

    /**
     * Map 容器是否为空
     *
     * @param map Map 容器
     * @return 容器是否为空
     */
    public static boolean isEmpty(final Map<?, ?> map) {
        return null == map || map.isEmpty();
    }

    /**
     * Map 容器是否非空
     *
     * @param map Map 容器
     * @return 容器是否非空
     */
    public static boolean isNotEmpty(final Map<?, ?> map) {
        return !isEmpty(map);
    }

    /**
     * 过滤列表中的 null 值及使列表 distinct
     *
     * @param originalList 原始列表
     * @param <T> 元素类型
     * @return 过滤 null 及 distinct 后的列表
     */
    public static <T> List<T> filterNullAndGetDistinct(List<T> originalList){
        if(isEmpty(originalList)){
            return new ArrayList<>();
        }

        return originalList.stream().filter(Objects::nonNull).distinct().collect(Collectors.toList());
    }
}
