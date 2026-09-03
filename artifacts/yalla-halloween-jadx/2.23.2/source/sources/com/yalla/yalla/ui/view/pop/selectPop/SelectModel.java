package com.yalla.yalla.ui.view.pop.selectPop;

import com.yalla.yalla.model.bean.AbsJavaBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SelectModel extends AbsJavaBean {
    private String cancel;
    private List<SelectItemModel> mList;
    private String ok;
    private String title;

    public SelectModel(String str, String str2, String str3) {
        this.title = str;
        this.ok = str2;
        this.cancel = str3;
    }

    public String getCancel() {
        return this.cancel;
    }

    public List<SelectItemModel> getList() {
        if (this.mList == null) {
            this.mList = new ArrayList();
        }
        return this.mList;
    }

    public String getOk() {
        return this.ok;
    }

    public String getTitle() {
        return this.title;
    }
}
