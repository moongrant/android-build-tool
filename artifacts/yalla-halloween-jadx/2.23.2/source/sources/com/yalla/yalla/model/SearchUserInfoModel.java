package com.yalla.yalla.model;

import com.yalla.yalla.model.bean.AbsJavaBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SearchUserInfoModel extends AbsJavaBean {
    public String code;
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
