package com.app.base.model;

import OooO00o.OooO00o;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public class SkillCardListModel {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public String f11889code;
    public List<DataBean> data;
    public List<DataBean> data1;
    public List<DataBean> data2;
    public String message;

    public static class DataBean {
        public int activityType;
        public String discountprice;

        @SerializedName("limitDay")
        public int limitDay = 0;
        public int lowestVIPLv;
        public String num;
        public String picurl;
        public String price;
        public String promotionprice;
        public String shopid;
        public int state;
        public String waresname;
        public int warestype;
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SkillCardListModel{code='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f11889code, '\'', ", message='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.message, '\'', ", data=");
        return o000O0Oo.OooO00o(sbOooO0o0, this.data, '}');
    }
}
