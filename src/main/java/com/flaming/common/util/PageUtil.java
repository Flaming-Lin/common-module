package com.flaming.common.util;

import com.flaming.common.struct.Paging;

/**
 * @Author: Flaming
 * @Time: 2020-01-26 20:16
 */
public class PageUtil {

    /**
     * 检验 paging 参数是否为空
     *
     * @param paging     paging参数
     * @param validLimit limit上限校验参数
     * @throws IllegalArgumentException 检验失败异常
     */
    public static void validPaging(Paging paging, Integer validLimit) throws IllegalArgumentException {
        validPaging(paging);

        if (null == validLimit) {
            return;
        }
        if (validLimit < 0) {
            throw new IllegalArgumentException("validLimit 小于0！");
        }
        if (paging.getLimit() > validLimit) {
            throw new IllegalArgumentException(String.format(
                    "Paging limit exceed! validLimit: %s, paramLimit: %s", validLimit, paging.getLimit()));
        }
    }

    /**
     * 检验 paging 参数是否为空
     *
     * @param paging 参数
     * @throws IllegalArgumentException 检验失败异常
     */
    public static void validPaging(Paging paging) throws IllegalArgumentException {
        if (null == paging || null == paging.getLimit() || null == paging.getOffset()) {
            throw new IllegalArgumentException("分页参数为空！");
        }

        if (paging.getLimit() < 0 || paging.getOffset() < 0) {
            throw new IllegalArgumentException(String.format("分页参数不合法！limit: %s, offset: %s", paging.getLimit(), paging.getOffset()));
        }
    }

}
