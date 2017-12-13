package com.juphoon.rcsrunner.service.impl;

import com.juphoon.rcsrunner.entity.TestCase;
import com.juphoon.rcsrunner.mapper.TestCaseMapper;
import com.juphoon.rcsrunner.service.ITestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/7.
 * @Description:
 */
@Service
public class TestCaseServiceImpl implements ITestCaseService {
    @Autowired
    private TestCaseMapper testCaseMapper;
    @Override
    public List<TestCase> findAll() {
        return testCaseMapper.findAll();
    }
}
