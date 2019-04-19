package com.sunnada.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sunnada.idao.TbBrandMapper;
import com.sunnada.pojo.TbBrand;
import com.sunnada.service.TbBrandDubboService;

import javax.annotation.Resource;
import java.util.List;

public class TbBrandDubboServiceImpl implements TbBrandDubboService {
    @Resource
    private TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> selAll() {
        return tbBrandMapper.selectByExample(null);
    }
}
