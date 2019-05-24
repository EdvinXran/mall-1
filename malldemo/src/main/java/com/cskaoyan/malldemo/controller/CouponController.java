package com.cskaoyan.malldemo.controller;

import com.cskaoyan.malldemo.bean.Coupon;
import com.cskaoyan.malldemo.service.CouponService;
import com.cskaoyan.malldemo.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Autowired
    CouponService couponService;
    @RequestMapping("list")
    public Vo list(int page,int limit,Coupon coupon){
        Vo vo = new Vo();
        List<Coupon> allCoupon = couponService.findAllCoupon(page, limit,coupon);
        int i =(int) couponService.CouponCount();
        HashMap<String, Object> map = new HashMap<>();
        map.put("items",allCoupon);
        map.put("total",i);
        vo.setData(map);
        vo.setErrmsg("成功");
        vo.setErrno(0);
        return vo;
    }
    // 删除
    @RequestMapping("delete")
    public Map delete(@RequestBody Coupon coupon){
        int i = couponService.deleteCoupon(coupon);
        HashMap<String, Object> map = new HashMap<>();
        if(i!=0){
            map.put("errmsg","成功");
            map.put("errno",0);
        }
        return map;
    }
}
