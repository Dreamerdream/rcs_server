package com.juphoon.rcsrunner.entity;

import java.io.Serializable;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/7.
 * @Description:用例业务流程
 */
public class CaseProcess implements Serializable {
    private int id; //id
    private String caseId; //用例编号
    private String signalId; //信令编号
    private String signalName; //信令名称
    private String checked; //是否必查
    private String role; //角色
    private int sequenceNumber; //顺序号
    private int segmentNumber; //段号
    private String segmentType; //段类别
    private String protocolName; //协议名称
    private String protocolMethod; //协议方法
    private String workType; //业务类别
    private int msgRespNumber; //消息回执组号
    private String workScene; //业务场景
    private String orientation; //方向
    private String discuss; //是否协商
    private String comment; //备注

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

    public String getSignalId() {
        return signalId;
    }

    public void setSignalId(String signalId) {
        this.signalId = signalId;
    }

    public String getSignalName() {
        return signalName;
    }

    public void setSignalName(String signalName) {
        this.signalName = signalName;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public int getSegmentNumber() {
        return segmentNumber;
    }

    public void setSegmentNumber(int segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    public String getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    public String getProtocolMethod() {
        return protocolMethod;
    }

    public void setProtocolMethod(String protocolMethod) {
        this.protocolMethod = protocolMethod;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }


    public int getMsgRespNumber() {
        return msgRespNumber;
    }

    public void setMsgRespNumber(int msgRespNumber) {
        this.msgRespNumber = msgRespNumber;
    }

    public String getWorkScene() {
        return workScene;
    }

    public void setWorkScene(String workScene) {
        this.workScene = workScene;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getDiscuss() {
        return discuss;
    }

    public void setDiscuss(String discuss) {
        this.discuss = discuss;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CaseProcess{" +
                "id=" + id +
                ", caseId='" + caseId + '\'' +
                ", signalId='" + signalId + '\'' +
                ", signalName='" + signalName + '\'' +
                ", checked='" + checked + '\'' +
                ", role='" + role + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                ", segmentNumber=" + segmentNumber +
                ", segmentType='" + segmentType + '\'' +
                ", protocolName='" + protocolName + '\'' +
                ", protocolMethod='" + protocolMethod + '\'' +
                ", workType='" + workType + '\'' +
                ", MsgRespNumber=" + msgRespNumber +
                ", workScene='" + workScene + '\'' +
                ", orientation='" + orientation + '\'' +
                ", discuss='" + discuss + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
