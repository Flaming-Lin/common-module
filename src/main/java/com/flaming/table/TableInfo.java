package com.flaming.table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Flaming
 * @Time: 2019-12-28 11:17
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TableInfo {

    /**
     * 表格标题
     */
    private String title;

    /**
     * 标题行
     */
    private TableRow header;

    /**
     * 表格内容（不包含标题）
     */
    private List<TableRow> rows;

    /**
     * 结果总数（非必填，为正整数时才有意义）
     */
    private Integer totalCount;

    /**
     * 表格类型
     */
    private Object tableType;

    /**
     * 分页展示数目（若为0则不分页）
     */
    private int rowsPerPage;

    /**
     * 原始信息
     */
    private Object rawInfo;

}
