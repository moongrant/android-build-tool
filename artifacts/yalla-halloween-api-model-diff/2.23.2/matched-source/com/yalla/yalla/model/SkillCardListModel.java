package com.yalla.yalla.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SkillCardListModel {
    public String code;
    public List<DataBean> data;
    public List<DataBean> data1;
    public List<DataBean> data2;
    public String message;

    public static class DataBean {
        public int activityType;
        public String discountprice;
        public int lowestVIPLv;
        public int num;
        public String picurl;
        public String price;
        public String promotionprice;
        public String shopid;
        public int state;
        public String waresname;
        public int warestype;
        public String activityMsg = null;

        @SerializedName("limitDay")
        public int limitDay = 0;
    }

    public String toString() {
        return "SkillCardListModel{code='" + this.code + "', message='" + this.message + "', data=" + this.data + '}';
    }
}
