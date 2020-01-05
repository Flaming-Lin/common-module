package com.flaming.common.struct;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: Flaming
 * @Time: 2020-01-05 16:46
 */
@Getter
@AllArgsConstructor
public enum ValidEnum {

    /**
     * 无效
     */
    INVALID(0, "无效"),

    /**
     * 有效
     */
    VALID(1, "有效");

    private Integer code;

    private String description;

    public ValidEnum getEnumByCode(int code) {
        for (ValidEnum validEnum : ValidEnum.values()) {
            if (validEnum.getCode() == code) {
                return validEnum;
            }
        }
        return null;
    }

}
