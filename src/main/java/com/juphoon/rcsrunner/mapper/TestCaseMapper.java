package com.juphoon.rcsrunner.mapper;

import com.juphoon.rcsrunner.entity.TestCase;

import java.util.List;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/7.
 * @Description:
 */
public interface TestCaseMapper {
    List<TestCase> findAll();
}
