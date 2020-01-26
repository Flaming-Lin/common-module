package com.flaming.common.struct;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Flaming
 * @Time: 2020-01-26 20:09
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageDto<T> {

    /**
     * 总数
     */
    private Long total = 0L;

    /**
     * 结果列表
     */
    private List<T> list = new ArrayList<>();

}
