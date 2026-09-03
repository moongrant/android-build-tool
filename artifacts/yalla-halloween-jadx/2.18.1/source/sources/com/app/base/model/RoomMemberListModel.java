package com.app.base.model;

import com.app.base.bean.AbsJavaBeanApi;

/* JADX INFO: loaded from: classes.dex */
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
