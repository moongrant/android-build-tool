package com.app.base.bean;

import p386o0OOoo0O.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public class BasicGsonConvert {
    private static o000OOo0 gson;

    private static o000OOo0 create() {
        if (gson == null) {
            gson = new o000OOo0();
        }
        return gson;
    }

    public static String toJson(Object obj) {
        return create().OooO0oo(obj);
    }
}
