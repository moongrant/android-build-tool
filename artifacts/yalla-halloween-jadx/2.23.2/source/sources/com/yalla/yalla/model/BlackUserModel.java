package com.yalla.yalla.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BlackUserModel {
    public String code;
    public String count;
    public List<DataBean> data;
    public String datesort;
    public int index;
    public String message;

    public static class DataBean {
        public String headurl;
        public String isfollow;
        public String nickname;
        public int sex;
        public String sign;
        public String userid;
        public String userlevel;
        public int vip;
        public int viplevel;
    }
}
