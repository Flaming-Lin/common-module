package com.flaming.common.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 【Mybatis增强】枚举值装换 Handler
 *
 * @Author: Flaming
 * @Time: 2019-12-31 08:25
 */
public class EnumCodeTypeHandler<E extends Enum<?> & BaseEnum> extends BaseTypeHandler<BaseEnum> {

    private Class<E> enumClass;

    public EnumCodeTypeHandler(Class<E> enumClass) {
        if (null == enumClass) {
            throw new IllegalArgumentException("Enum class can not be null!");
        }
        this.enumClass = enumClass;
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, BaseEnum baseEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, baseEnum.getCode());
    }

    @Override
    public E getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int code = resultSet.getInt(s);
        return resultSet.wasNull() ? null : EnumUtil.getEnumByCode(this.enumClass, code);
    }

    @Override
    public E getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int code = resultSet.getInt(i);
        return resultSet.wasNull() ? null : EnumUtil.getEnumByCode(this.enumClass, code);
    }

    @Override
    public E getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int code = callableStatement.getInt(i);
        return callableStatement.wasNull() ? null : EnumUtil.getEnumByCode(this.enumClass, code);
    }
}
