package com.flaming.common.util;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Flaming
 * @Time: 2019-12-21 12:42
 */
public class ChunkUtil {

    /** 默认列表拆分大小 */
    private static final Integer DEFAULT_LIST_SIZE_FOR_SPLIT = 50;

    /**
     * 将大的列表拆分为小的列表的列表(拆分大小为50)
     *
     * @param list 大的列表
     * @param <T>  列表元素类型
     * @return 拆分后的列表的列表
     */
    public static <T> List<List<T>> getChunk(List<T> list) {
        return getChunk(list, DEFAULT_LIST_SIZE_FOR_SPLIT);
    }

    /**
     * 将大的列表拆分为小的列表的列表(拆分大小为50)
     *
     * @param list      大的列表
     * @param chunkSize 拆分成列表的容量大小
     * @param <T>       列表元素类型
     * @return 拆分后的列表的列表
     */
    public static <T> List<List<T>> getChunk(List<T> list, int chunkSize) {
        if (CollectionUtils.isEmpty(list) || chunkSize <= 0) {
            return new ArrayList<>();
        }

        return Lists.partition(list, chunkSize);
    }

}
