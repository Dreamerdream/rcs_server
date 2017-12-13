package com.juphoon.rcsrunner.run;


import com.juphoon.rcsrunner.entity.CaseProcess;
import com.juphoon.rcsrunner.entity.TestCase;
import com.juphoon.rcsrunner.service.ICaseProcessService;
import com.juphoon.rcsrunner.service.ITestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by hgh on 2017/11/28.
 * 项目启动时
 */
@Component
public class MyApplicationRunner implements CommandLineRunner {

    @Autowired
    private ICaseProcessService caseProcessService;
    @Autowired
    private ITestCaseService testCaseService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("我启动啦");

        //所用用例
        List<TestCase> testCases = testCaseService.findAll();
        if (testCases != null && testCases.size() != 0){
            for (TestCase testCase:testCases) {
                String caseId = testCase.getCaseId();
                //根据用例编号得到用例流程
                List<CaseProcess> caseProcesses = caseProcessService.findByCaseId(caseId);
                //存redis
                redisTemplate.opsForValue().set(caseId,caseProcesses);
            }
        }


//        List<CaseProcess> caseProcesses = caseProcessService.findAll();
//        if (caseProcesses != null && caseProcesses.size() != 0){
//            for (CaseProcess caseProcess: caseProcesses) {
//                redisTemplate.opsForValue().set(caseProcess.getId()+"",caseProcess);
//            }
//        }

    }
}
