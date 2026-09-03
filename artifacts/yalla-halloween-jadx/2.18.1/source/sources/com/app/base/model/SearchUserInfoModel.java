package com.app.base.model;

import com.app.base.bean.AbsJavaBean;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SearchUserInfoModel extends AbsJavaBean {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public String f11882code;
    public List<UserInfo> data;
    public String message;

    public static class UserInfo {
        public String headurl;
        public String id;
        public String idx;
        public int isprettyid;
        public int isprettypara;
        public String nickname = "";
        public int role;
        public String sex;
        public int vip;
        public int viplevel;
    }
}
