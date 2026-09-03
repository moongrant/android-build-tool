package com.app.base.view.pop.selectPop;

import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
public class SelectItemModel extends AbsJavaBean {
    private long id;
    private String name;
    private boolean state;

    public SelectItemModel(String str, boolean z, long j) {
        this.name = str;
        this.state = z;
        this.id = j;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isState() {
        return this.state;
    }

    public SelectItemModel setState(boolean z) {
        this.state = z;
        return this;
    }

    public SelectItemModel(String str, boolean z) {
        this.name = str;
        this.state = z;
    }
}
