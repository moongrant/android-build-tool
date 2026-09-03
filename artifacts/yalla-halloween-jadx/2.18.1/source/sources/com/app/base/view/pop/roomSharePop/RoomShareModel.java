package com.app.base.view.pop.roomSharePop;

import OooO00o.OooO00o;
import com.app.base.bean.AbsJavaBean;
import com.app.base.fragment.ContributionFragment;
import com.google.gson.annotations.SerializedName;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public class RoomShareModel extends AbsJavaBean {
    private String content;
    private String imagesUrl;
    private String roomIdx;

    @SerializedName(alternate = {ContributionFragment.ARG_1}, value = "roomid")
    private String roomid;
    private String title;
    private int type;
    private String url;

    public RoomShareModel(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.title = str;
        this.content = str2;
        this.url = str3;
        this.imagesUrl = str4;
        this.roomid = str5;
        this.roomIdx = str6;
        this.type = i;
    }

    public String getContent() {
        return this.content;
    }

    public String getImageUrl() {
        return this.imagesUrl;
    }

    public String getRoomIdx() {
        return this.roomIdx;
    }

    public String getRoomid() {
        return this.roomid;
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

    public RoomShareModel setRoomIdx(String str) {
        this.roomIdx = str;
        return this;
    }

    public void setRoomid(String str) {
        this.roomid = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RoomShareModel{title='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.title, '\'', ", content='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.content, '\'', ", url='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.url, '\'', ", imagesUrl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.imagesUrl, '\'', ", roomId='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.roomid, '\'', ", roomIdx='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.roomIdx, '\'', ", type=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.type, '}');
    }
}
