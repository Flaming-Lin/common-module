package com.flaming.mybatis;

/**
 * 用于 Mybatis 的枚举基类，使用
 *
 * @Author: Flaming
 * @Time: 2019-12-31 08:20
 */
public interface BaseEnum {

    /**
     * 获取枚举值的Code，该Code将储存于数据库
     *
     * @return code
     */
    int getCode();

}
