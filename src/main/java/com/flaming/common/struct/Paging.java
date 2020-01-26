package com.flaming.common.struct;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Flaming
 * @Time: 2020-01-26 20:03
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Paging {

    /**
     * 偏移量
     */
    private Integer offset;

    /**
     * 限制
     */
    private Integer limit;

}
