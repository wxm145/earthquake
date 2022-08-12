package com.earthquake.map.entity;

import lombok.Data;

import java.util.StringJoiner;

/**
 * @author wangxiaomiao
 * @create 2022-08-03 10:53
 */
@Data
public class TbUser {
    private String id;
    private String name;

    @Override
    public String toString() {
        return new StringJoiner(", ", TbUser.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .toString();
    }
}
