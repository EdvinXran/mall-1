package com.cskaoyan.malldemo.service.impl;

import com.cskaoyan.malldemo.bean.Groupon_rules;
import com.cskaoyan.malldemo.bean.Groupon_rulesExample;
import com.cskaoyan.malldemo.mapper.Groupon_rulesMapper;
import com.cskaoyan.malldemo.service.GrouponService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrouponServiceImpl implements GrouponService {
    @Autowired
    Groupon_rulesMapper grouponRulesMapper;
    @Override
    public List<Groupon_rules> findAllGroupon(int page, int limit, Groupon_rules grouponRules) {
        List<Groupon_rules> allGroupon = grouponRulesMapper.findAllGroupon(grouponRules);
        return allGroupon;
    }

    @Override
    public long grouponCount() {
        Groupon_rulesExample example = new Groupon_rulesExample();
        long count = grouponRulesMapper.countByExample(example);
        return count;
    }

    @Override
    public int deleteGroup(Groupon_rules grouponRules) {
        int i = grouponRulesMapper.deleteGroup(grouponRules);
        return i;
    }
}
