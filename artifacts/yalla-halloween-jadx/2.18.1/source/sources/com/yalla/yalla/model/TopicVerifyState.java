package com.yalla.yalla.model;

import com.app.base.bean.AbsJavaBean;
import com.facebook.internal.ServerProtocol;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class TopicVerifyState extends AbsJavaBean {
    public static final int circleDissolution = 2;
    public static final int noEntry = 1;
    public static final int normal = 0;

    @SerializedName(ServerProtocol.DIALOG_PARAM_STATE)
    private int state = 0;

    public int getState() {
        return this.state;
    }

    public void setState(int i) {
        this.state = i;
    }
}
