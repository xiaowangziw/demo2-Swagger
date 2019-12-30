package com.example.demo.pojo;

import com.example.demo.untils.ExcelElement;

import java.io.Serializable;

public class MessageSendStatusPojo implements Serializable {

    @ExcelElement("错误详情")
    private String error_detail;
    @ExcelElement("sid")
    private String sid;
    @ExcelElement("uid")
    private String uid;
    @ExcelElement("接收时间")
    private String user_receive_time;
    @ExcelElement("错误信息")
    private String error_msg;
    @ExcelElement("手机号")
    private String mobile;
    @ExcelElement("接收状态")
    private String report_status;
    @ExcelElement("签名")
    private String _sign;

    public String get_sign() {
        return _sign;
    }

    public void set_sign(String _sign) {
        this._sign = _sign;
    }

    public String getError_detail() {
        return error_detail;
    }

    public void setError_detail(String error_detail) {
        this.error_detail = error_detail;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUser_receive_time() {
        return user_receive_time;
    }

    public void setUser_receive_time(String user_receive_time) {
        this.user_receive_time = user_receive_time;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getReport_status() {
        return report_status;
    }

    public void setReport_status(String report_status) {
        this.report_status = report_status;
    }

    @Override
    public String toString() {
        return "MessageSendStatusPojo{" +
                "error_detail='" + error_detail + '\'' +
                ", sid='" + sid + '\'' +
                ", uid='" + uid + '\'' +
                ", user_receive_time='" + user_receive_time + '\'' +
                ", error_msg='" + error_msg + '\'' +
                ", mobile='" + mobile + '\'' +
                ", report_status='" + report_status + '\'' +
                ", _sign='" + _sign + '\'' +
                '}';
    }
}
