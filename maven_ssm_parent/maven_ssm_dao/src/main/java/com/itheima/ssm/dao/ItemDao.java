package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Item;

public interface ItemDao {
    Item findById(String id);
}
