package com.juphoon.rcsrunner.entity;

import java.util.Date;
/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/07.
 * @Description: 测试用例表
 */
public class TestCase {
    private int id; //id
    private String caseId; //用例编号
    private String caseName; //用例名称
    private String workType; //业务类型
    private String workScene; //业务场景
    private String versionCode; //版本号
    private String technologyType; //技术类型
    private String protocolSimulate; //协议模拟
    private String involvecCaseId; //相关用例编号
    private Date createTime; //创建时间
    private String purpose; //测试目的
    private String gist; //测试依据
    private String condition; //预置条件
    private String step; //测试步骤
    private String inspectExplain; //检查点说明
    private String refreProcess; //参考流程
    private String UPcaseId; //UP用例编号
    private String caseType; //用例类型
    private String expectResult;//预期结果
    private String collectStep; //汇集步骤
    private String serverSupport; //模拟服务器支持
    private String splitFlag;//拆分标志
    private String splitUPCaseId;//被拆分UP用例编号
    private String protocolName;//协议名称
    private String usingFlag;//启动标志
    private String comment;//备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getWorkScene() {
        return workScene;
    }

    public void setWorkScene(String workScene) {
        this.workScene = workScene;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getTechnologyType() {
        return technologyType;
    }

    public void setTechnologyType(String technologyType) {
        this.technologyType = technologyType;
    }

    public String getProtocolSimulate() {
        return protocolSimulate;
    }

    public void setProtocolSimulate(String protocolSimulate) {
        this.protocolSimulate = protocolSimulate;
    }

    public String getInvolvecCaseId() {
        return involvecCaseId;
    }

    public void setInvolvecCaseId(String involvecCaseId) {
        this.involvecCaseId = involvecCaseId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getGist() {
        return gist;
    }

    public void setGist(String gist) {
        this.gist = gist;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getInspectExplain() {
        return inspectExplain;
    }

    public void setInspectExplain(String inspectExplain) {
        this.inspectExplain = inspectExplain;
    }

    public String getRefreProcess() {
        return refreProcess;
    }

    public void setRefreProcess(String refreProcess) {
        this.refreProcess = refreProcess;
    }

    public String getUPcaseId() {
        return UPcaseId;
    }

    public void setUPcaseId(String UPcaseId) {
        this.UPcaseId = UPcaseId;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getExpectResult() {
        return expectResult;
    }

    public void setExpectResult(String expectResult) {
        this.expectResult = expectResult;
    }

    public String getCollectStep() {
        return collectStep;
    }

    public void setCollectStep(String collectStep) {
        this.collectStep = collectStep;
    }

    public String getServerSupport() {
        return serverSupport;
    }

    public void setServerSupport(String serverSupport) {
        this.serverSupport = serverSupport;
    }

    public String getSplitFlag() {
        return splitFlag;
    }

    public void setSplitFlag(String splitFlag) {
        this.splitFlag = splitFlag;
    }

    public String getSplitUPCaseId() {
        return splitUPCaseId;
    }

    public void setSplitUPCaseId(String splitUPCaseId) {
        this.splitUPCaseId = splitUPCaseId;
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    public String getUsingFlag() {
        return usingFlag;
    }

    public void setUsingFlag(String usingFlag) {
        this.usingFlag = usingFlag;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
