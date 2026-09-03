package com.app.base.model;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RedPaperList extends CommonModel {
    public String amount;
    public String balance;
    public List<Data> data;
    public String getnum;
    public String headurl;
    public String myamount;
    public String nickname;
    public String num;
    public int type;

    public static class Data {
        public String amount;
        public String bestluck;
        public String headurl;
        public String nickname;
        public String stime;
        public long stimetamp;
    }
}
