package com.yalla.yalla.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CommonListResult<T> extends CommonModel {
    public List<T> data;
    private boolean isFirst;
    private List<T> labledata;
    private ArrayList<T> users;

    public List<T> getLabledata() {
        return this.labledata;
    }

    public ArrayList<T> getUsers() {
        return this.users;
    }

    public boolean hasData() {
        List<T> list = this.data;
        return list != null && list.size() > 0;
    }

    public boolean isFirst() {
        return this.isFirst;
    }
}
