package com.yalla.yalla.model.room;

import com.yalla.yalla.model.bean.AbsJavaBeanApi;

/* JADX INFO: loaded from: classes4.dex */
public class RoomMemberListModel<Model> extends AbsJavaBeanApi<Model> {
    private int maxcount;
    private int pagecount;
    public int pageindex;

    public int getMaxcount() {
        return this.maxcount;
    }

    public int getPagecount() {
        return this.pagecount;
    }
}
