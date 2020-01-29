package com.flaming.common.util;

import java.util.Collection;
import java.util.Map;

/**
 * @Author: Flaming
 * @Time: 2019-12-21 12:32
 */
public class CommonVerifier {

    /**
     * 检测多个元素中是否至少一个为 null 或 空值
     *
     * @param objects 需要检查的元素列表
     * @return 是否至少有一个为 null 或 空值
     */
    public static boolean isAnyEmptyOrNull(Object... objects) {
        if (null == objects) {
            return true;
        }

        for (Object o : objects) {
            if (isAnyNull(o)) {
                return true;
            } else if (o instanceof Collection) {
                ((Collection) o).remove(null);
                if (CollectionUtils.isEmpty((Collection) o)) {
                    return true;
                }
            } else if (o instanceof Map) {
                if (CollectionUtils.isEmpty((Map) o)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 检测多个元素中是否有至少一个为 null
     *
     * @param objects 需要检查的元素列表
     * @return 是否有至少一个为 null
     */
    public static boolean isAnyNull(Object... objects) {
        if (null == objects) {
            return true;
        }

        for (Object o : objects) {
            if (null == o) {
                return true;
            }
        }
        return false;
    }

}
