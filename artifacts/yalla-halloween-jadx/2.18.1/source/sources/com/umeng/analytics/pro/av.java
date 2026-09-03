package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class av extends ByteArrayOutputStream {
    public av(int i) {
        super(i);
    }

    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public int b() {
        return ((ByteArrayOutputStream) this).count;
    }

    public av() {
    }
}
