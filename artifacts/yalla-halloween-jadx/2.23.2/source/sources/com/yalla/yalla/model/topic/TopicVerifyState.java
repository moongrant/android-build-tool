package com.yalla.yalla.model.topic;

import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class TopicVerifyState extends AbsJavaBean {
    public static final int circleDissolution = 2;
    public static final int noEntry = 1;
    public static final int normal = 0;

    @SerializedName("state")
    private int state = 0;

    public int getState() {
        return this.state;
    }

    public void setState(int i) {
        this.state = i;
    }
}
