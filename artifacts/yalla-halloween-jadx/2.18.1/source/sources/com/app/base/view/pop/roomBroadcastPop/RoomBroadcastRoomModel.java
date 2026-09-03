package com.app.base.view.pop.roomBroadcastPop;

import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
public class RoomBroadcastRoomModel extends AbsJavaBean {
    private long id;
    private String roomIp;

    private void setIpInfo(String str) {
        this.roomIp = str;
    }

    public long getId() {
        return this.id;
    }

    public String getRoomIp() {
        return this.roomIp;
    }

    public void setData(long j, String str) {
        this.id = j;
        setIpInfo(str);
    }

    public void setId(long j) {
        this.id = j;
    }
}
