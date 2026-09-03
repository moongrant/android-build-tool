package com.amazonaws.util;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class StringInputStream extends ByteArrayInputStream {
    public StringInputStream(String str) throws UnsupportedEncodingException {
        super(str.getBytes(StringUtils.f12681OooO00o));
    }
}
