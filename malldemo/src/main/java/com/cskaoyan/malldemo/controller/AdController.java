package com.cskaoyan.malldemo.controller;

import com.cskaoyan.malldemo.bean.Ad;
import com.cskaoyan.malldemo.service.AdService;
import com.cskaoyan.malldemo.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/ad")
public class AdController {
    @Autowired
    AdService adService;
    @RequestMapping("list")
    public Vo list(int page,int limit){
        List<Ad> allAd = adService.findAllAd(page, limit);
        HashMap<String, Object> map = new HashMap<>();
        map.put("")

        int count = (int)adService.selectCount();
        Vo vo = new Vo();
        vo.setData();
    }
}
