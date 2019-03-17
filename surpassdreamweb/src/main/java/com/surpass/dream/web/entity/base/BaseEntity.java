package com.surpass.dream.web.entity.base;

import com.alibaba.fastjson.JSON;

/**
 * Created by li on 2019/3/17.
 */
public class BaseEntity {
    private String id;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {

        return id;
    }
}
