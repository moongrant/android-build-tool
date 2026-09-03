package com.yalla.yalla.ui.adapter.setting;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class SettingModel extends AbsJavaBean {
    private boolean isOpen;
    private boolean isTop;
    private boolean showRedPoint;
    private SettingTag tag;
    private String title;

    public SettingModel(String str, boolean z, SettingTag settingTag) {
        this.title = str;
        this.isTop = z;
        this.tag = settingTag;
    }

    public SettingTag getTag() {
        return this.tag;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public boolean isShowRedPoint() {
        return this.showRedPoint;
    }

    public boolean isTop() {
        return this.isTop;
    }

    public SettingModel setOpen(boolean z) {
        this.isOpen = z;
        return this;
    }

    public SettingModel setShowRedPoint(boolean z) {
        this.showRedPoint = z;
        return this;
    }

    public SettingModel setTag(SettingTag settingTag) {
        this.tag = settingTag;
        return this;
    }

    public SettingModel setTitle(String str) {
        this.title = str;
        return this;
    }

    public SettingModel setTop(boolean z) {
        this.isTop = z;
        return this;
    }
}
