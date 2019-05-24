package com.cskaoyan.malldemo.controller;

import com.cskaoyan.malldemo.bean.Groupon_rules;
import com.cskaoyan.malldemo.service.GrouponService;
import com.cskaoyan.malldemo.vo.Vo;
import org.omg.CORBA.portable.ValueOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("groupon")
public class GrouponController {
    @Autowired
    GrouponService grouponService;
    @RequestMapping("list")
    public Vo list(int page, int limit, Groupon_rules grouponRules){
        List<Groupon_rules> allGroupon = grouponService.findAllGroupon(page, limit, grouponRules);
        int count = (int)grouponService.grouponCount();
        Vo vo = new Vo();
        HashMap<String, Object> map = new HashMap<>();
        map.put("items",allGroupon);
        map.put("total",count);
        vo.setData(map);
        vo.setErrno(0);
        vo.setErrmsg("成功");
        return vo;
    }
    //删除
    @RequestMapping("delete")
    public Map delete(@RequestBody Groupon_rules grouponRules){
        int i = grouponService.deleteGroup(grouponRules);
        HashMap<String, Object> map = new HashMap<>();
        if(i != 0){
            map.put("errmsg","成功");
            map.put("errno",0);
        }
        return map;
    }
}
