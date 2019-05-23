package com.cskaoyan.malldemo.service;

import com.cskaoyan.malldemo.bean.Ad;

import java.util.List;

public interface AdService {
    List<Ad> findAllAd(int page, int limit);

    long selectCount();
}
