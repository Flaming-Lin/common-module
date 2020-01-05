package com.flaming.common.table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Flaming
 * @Time: 2019-12-28 11:20
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TableRow {

    /**
     * 单元格信息
     */
    private List<Object> cells;

}
