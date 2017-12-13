package com.juphoon.rcsrunner.service;

import com.juphoon.rcsrunner.entity.TestCase;

import java.util.List;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/7.
 * @Description:
 */
public interface ITestCaseService {
    List<TestCase> findAll();
}
