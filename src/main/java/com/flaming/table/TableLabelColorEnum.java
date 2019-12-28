package com.flaming.table;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 彩色标签 label
 * 标签颜色可参考：https://cube.elemecdn.com/e/5e/ec2c7cd7157dc86cf2665ce2c5b47png.png
 *
 * @Author: Flaming
 * @Time: 2019-12-28 11:28
 */
@Getter
@AllArgsConstructor
public enum TableLabelColorEnum {

    /**
     * 红色标签
     */
    CUBE_LABEL_RED("#f44336", "cube-label-red");

    /**
     * 颜色编码
     */
    private String hex;
    /**
     * 颜色 class 名
     */
    private String className;

}
