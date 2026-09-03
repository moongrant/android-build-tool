package com.yalla.yalla.model.bean;

import com.google.gson.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public class BasicGsonConvert {
    private static OooOOO0 gson;

    private static OooOOO0 create() {
        if (gson == null) {
            gson = new OooOOO0();
        }
        return gson;
    }

    public static String toJson(Object obj) {
        return create().OooO0oo(obj);
    }
}
