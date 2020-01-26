package com.flaming.common.struct;

import com.flaming.common.mybatis.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: Flaming
 * @Time: 2020-01-05 16:46
 */
@Getter
@AllArgsConstructor
public enum ValidEnum implements BaseEnum {

    /**
     * 无效
     */
    INVALID(0, "无效"),

    /**
     * 有效
     */
    VALID(1, "有效");

    private Integer value;

    private String description;

    public ValidEnum getEnumByCode(int value) {
        for (ValidEnum validEnum : ValidEnum.values()) {
            if (validEnum.getValue() == value) {
                return validEnum;
            }
        }
        return null;
    }


    @Override
    public int getCode() {
        return this.value;
    }
}
