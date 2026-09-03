package com.amazonaws.util;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class StringInputStream extends ByteArrayInputStream {
    public StringInputStream(String str) throws UnsupportedEncodingException {
        super(str.getBytes(StringUtils.f11186OooO00o));
    }
}
