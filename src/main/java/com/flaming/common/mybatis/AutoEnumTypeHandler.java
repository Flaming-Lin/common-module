package com.flaming.common.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.EnumTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 【Mybatis增强】默认枚举值装换 Handler
 * 实现了 BaseNum 接口的枚举类可以自适应存储 code
 *
 * @Author: Flaming
 * @Time: 2020-01-01 10:52
 */
@SuppressWarnings("unchecked")
public class AutoEnumTypeHandler<E extends Enum<E>> extends BaseTypeHandler<E> {

    private BaseTypeHandler typeHandler;

    public AutoEnumTypeHandler(Class<E> enumClass) {
        if (null == enumClass) {
            throw new IllegalArgumentException("Enum class can not be null!");
        }

        if (BaseEnum.class.isAssignableFrom(enumClass)) {
            this.typeHandler = new EnumCodeTypeHandler(enumClass);
        } else {
            this.typeHandler = new EnumTypeHandler(enumClass);
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, E e, JdbcType jdbcType) throws SQLException {
        this.typeHandler.setNonNullParameter(preparedStatement, i, e, jdbcType);
    }

    @Override
    public E getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return (E) this.typeHandler.getNullableResult(resultSet, s);
    }

    @Override
    public E getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return (E) this.typeHandler.getNullableResult(resultSet, i);
    }

    @Override
    public E getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return (E) this.typeHandler.getNullableResult(callableStatement, i);
    }
}
