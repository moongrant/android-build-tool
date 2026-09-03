package com.app.base.model;

import OooO00o.OooO00o;
import com.app.base.bean.AbsJavaBean;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public class BannerModel<T> extends AbsJavaBean {
    public static final int EXTYPE_ROOM = 1;
    public static final int EXTYPE_WEB = 0;
    public static final int TYPE_ORDINARY = 0;
    public static final int TYPE_WEEK_GIFT = 1;
    private String barid;
    private int extype;
    public String id;
    private String imageurl;
    private int isshare;
    private int jumptype;
    private String roomserverip;
    private String title;
    private int type;
    private String url;

    public String getBarid() {
        return this.barid;
    }

    public int getExtype() {
        return this.extype;
    }

    public String getImageurl() {
        return this.imageurl;
    }

    public int getJumptype() {
        return this.jumptype;
    }

    public String getRoomserverip() {
        return this.roomserverip;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int isIsshare() {
        return this.isshare;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("BannerModel{jumptype=");
        sbOooO0o0.append(this.jumptype);
        sbOooO0o0.append(", type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", imageurl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.imageurl, '\'', ", url='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.url, '\'', ", title='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.title, '\'', ", barid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barid, '\'', ", roomserverip='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.roomserverip, '\'', ", extype=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.extype, '}');
    }
}
