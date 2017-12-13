package com.juphoon.rcsrunner.service;

import com.juphoon.rcsrunner.entity.CaseProcess;

import java.util.List;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/7.
 * @Description:
 */
public interface ICaseProcessService {
    List<CaseProcess> findAll();
    List<CaseProcess> findByCaseId(String caseId);
}
