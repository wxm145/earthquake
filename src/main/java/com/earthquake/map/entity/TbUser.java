package com.earthquake.map.entity;

import lombok.Data;

import java.util.StringJoiner;


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
