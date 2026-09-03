package com.yalla.yalla.ui.view.pop.passwordSettingPop;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes5.dex */
public class PasswordSettingModel extends AbsJavaBean {
    private String barId;
    private boolean isUnLock = false;
    private String password;

    public PasswordSettingModel(String str) {
        this.barId = str;
    }

    public String getBarId() {
        return this.barId;
    }

    public String getPassword() {
        if (this.password == null) {
            this.password = "";
        }
        return this.password;
    }

    public boolean isUnLock() {
        return this.isUnLock;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setUnLock(boolean z) {
        this.isUnLock = z;
    }
}
