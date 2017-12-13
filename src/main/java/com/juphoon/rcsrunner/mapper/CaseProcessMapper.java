package com.juphoon.rcsrunner.mapper;

import com.juphoon.rcsrunner.entity.CaseProcess;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/7.
 * @Description:
 */
public interface CaseProcessMapper {
    List<CaseProcess> findAll();
    List<CaseProcess> findByCaseId(@Param("caseId")String caseId);
}
