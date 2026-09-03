package com.yalla.yalla.model.moment;

import com.yalla.yalla.model.bean.AbsJavaBeanApi;

/* JADX INFO: loaded from: classes4.dex */
public class MomentBarGetServerIpModel extends AbsJavaBeanApi {
    private long idx;
    private long roomid;
    private String roomserverip;
    public String websocketaddr;

    public long getIdx() {
        return this.idx;
    }

    public long getRoomid() {
        return this.roomid;
    }

    public String getRoomserverip() {
        return this.roomserverip;
    }
}
