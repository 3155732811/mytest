package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Item;
import com.itheima.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/findById")
    public String findById(String id, Model model){
        Item item = itemService.findById(id);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
