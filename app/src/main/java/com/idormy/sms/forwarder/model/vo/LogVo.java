package com.idormy.sms.forwarder.model.vo;

import com.idormy.sms.forwarder.R;

public class LogVo {
    private Long id;
    private String from;
    private String content;
    private String simInfo;
    private String rule;
    private int senderImageId;
    private String time;

    public LogVo(Long id, String from, String content, String simInfo, String time, String rule, int senderImageId) {
        this.id = id;
        this.from = from;
        this.content = content;
        this.simInfo = simInfo;
        this.time = time;
        this.rule = rule;
        this.senderImageId = senderImageId;
    }

    public LogVo() {

    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSimInfo() {
        return simInfo;
    }

    public void setSimInfo(String simInfo) {
        this.simInfo = simInfo;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getTime() {
        return time;
    }

    public int getSenderImageId() {
        return senderImageId;
    }

    public void setSenderImageId(int senderImageId) {
        this.senderImageId = senderImageId;
    }

    public int getSimImageId() {
        if (this.simInfo != null && !this.simInfo.isEmpty()
                && this.simInfo.replace("-", "").substring(0, 4).equals("SIM2")) {
            return R.mipmap.sim2;
        }

        return R.mipmap.sim1;
    }
}
