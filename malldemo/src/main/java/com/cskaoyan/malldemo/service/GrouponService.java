package com.cskaoyan.malldemo.service;

import com.cskaoyan.malldemo.bean.Groupon_rules;

import java.util.List;

public interface GrouponService {
    List<Groupon_rules> findAllGroupon(int page, int limit, Groupon_rules grouponRules);

    long grouponCount();

    int deleteGroup(Groupon_rules grouponRules);
}
