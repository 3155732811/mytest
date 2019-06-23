package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.ItemDao;
import com.itheima.ssm.domain.Item;
import com.itheima.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;
    @Override
    public Item findById(String id) {
        return itemDao.findById(id);
    }
}
