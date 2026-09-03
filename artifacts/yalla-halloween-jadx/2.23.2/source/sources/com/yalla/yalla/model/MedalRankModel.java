package com.yalla.yalla.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MedalRankModel {
    public String code;
    public List<DataBean> data;
    public String message;

    public static class DataBean {
        public String imageurl;
        public String nickname;
        public int num;
        public String sex;
        public String sumstars;
        public String userid;
    }
}
