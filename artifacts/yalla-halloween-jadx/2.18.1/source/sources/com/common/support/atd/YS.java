package com.common.support.atd;

/* JADX INFO: loaded from: classes.dex */
public class YS {
    public static native boolean A();

    public static native boolean B();

    public static native boolean C();

    public static native String F(String str);

    public static void init() {
        System.loadLibrary("ylshield");
        System.loadLibrary("sgavmpro");
    }
}
