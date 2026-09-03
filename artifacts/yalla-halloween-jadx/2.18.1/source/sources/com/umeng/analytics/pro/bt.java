package com.umeng.analytics.pro;

/* JADX INFO: loaded from: classes2.dex */
public class bt extends az {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private static final long h = 1;
    public int g;

    public bt() {
        this.g = 0;
    }

    public int a() {
        return this.g;
    }

    public bt(int i) {
        this.g = i;
    }

    public bt(int i, String str) {
        super(str);
        this.g = i;
    }

    public bt(String str) {
        super(str);
        this.g = 0;
    }

    public bt(int i, Throwable th) {
        super(th);
        this.g = i;
    }

    public bt(Throwable th) {
        super(th);
        this.g = 0;
    }

    public bt(String str, Throwable th) {
        super(str, th);
        this.g = 0;
    }

    public bt(int i, String str, Throwable th) {
        super(str, th);
        this.g = i;
    }
}
