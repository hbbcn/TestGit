package com.atguigu.admin.service;

import com.atguigu.admin.bean.City;
import com.atguigu.admin.mapper.CityMapper;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@ClassName CityService
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/6 12:23
 *@Version 1.0
 */
@Service
public class CityService{

    @Autowired
    CityMapper cityMapper;

    Counter counter;

    public CityService(MeterRegistry meterRegistry) {

        counter = meterRegistry.counter("cityService.saveCity.count");

    }

    public City getById(Long id){
        return cityMapper.getById(id);
    }

    public void saveCity(City city){

        counter.increment();
        cityMapper.insert(city);
    }
}

