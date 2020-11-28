package com.service.impl;

import com.mapper.PopularizationsMapper;
import com.pojo.Popularizations;
import com.service.PopularizationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopularizationsServiceImpl implements PopularizationsService {

    @Autowired
    private PopularizationsMapper mapper;

    @Override
    public List<Popularizations> queryPopularizations(Popularizations popularizations) {
        return mapper.queryPopularizationsList(popularizations);
    }

    @Override
    public void createPopularization(Popularizations popularizations) {
        mapper.createPopularization(popularizations);
    }

    @Override
    public List<Popularizations> fuzzyQueryPopularizations(Popularizations popularizations) {
        return mapper.fuzzyQueryPopularizations(popularizations);
    }
}
