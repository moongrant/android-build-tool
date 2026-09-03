package com.app.base.model;

import OooO00o.OooO00o;
import com.yalla.yalla.common.model.UserInfoModel;
import java.util.List;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public class VisitorModel extends CommonModel {
    public String count;
    public List<Visitor> data;
    public String datesort;

    public static class Visitor extends UserInfoModel {
        public String isnew;
        public String vid;
        public String visittime;
        public long vtime;
    }

    @Override // com.app.base.model.CommonModel, com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("VistorModel{index='");
        sbOooO0o0.append(this.index);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", count='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.count, '\'', ", datesort='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.datesort, '\'', ", data=");
        return o000O0Oo.OooO00o(sbOooO0o0, this.data, '}');
    }
}
