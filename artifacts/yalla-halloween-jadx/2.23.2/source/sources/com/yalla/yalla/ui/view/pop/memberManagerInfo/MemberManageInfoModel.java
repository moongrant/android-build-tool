package com.yalla.yalla.ui.view.pop.memberManagerInfo;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class MemberManageInfoModel extends AbsJavaBean {
    private String content;
    private String del;
    private String manager;
    private String master;
    private String member;
    private String title;

    public MemberManageInfoModel(String str, String str2, String str3, String str4, String str5, String str6) {
        this.title = str;
        this.master = str2;
        this.manager = str3;
        this.member = str4;
        this.del = str5;
        this.content = str6;
    }

    public String getContent() {
        return this.content;
    }

    public String getDel() {
        return this.del;
    }

    public String getManager() {
        return this.manager;
    }

    public String getMaster() {
        return this.master;
    }

    public String getMember() {
        return this.member;
    }

    public String getTitle() {
        return this.title;
    }
}
