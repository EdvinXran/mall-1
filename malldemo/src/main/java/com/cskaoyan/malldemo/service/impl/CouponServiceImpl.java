package com.cskaoyan.malldemo.service.impl;

import com.cskaoyan.malldemo.bean.Coupon;
import com.cskaoyan.malldemo.bean.CouponExample;
import com.cskaoyan.malldemo.mapper.CouponMapper;
import com.cskaoyan.malldemo.service.CouponService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    CouponMapper couponMapper;
    @Override
    public List<Coupon> findAllCoupon(int page,int limit,Coupon coupon) {
        PageHelper.startPage(page,limit);
        List<Coupon> allCoupon = couponMapper.findAllCoupon(coupon);
        return allCoupon;
    }

    @Override
    public long CouponCount() {
        CouponExample couponExample = new CouponExample();
        long i = couponMapper.countByExample(couponExample);
        return i;
    }

    @Override
    public int deleteCoupon(Coupon coupon) {
        int i = couponMapper.deleteCoupon(coupon);
        return i;
    }
}
