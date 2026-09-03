package com.amazonaws.util;

import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class StringUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f12681OooO00o = Charset.forName("UTF-8");

    public static String OooO00o(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? "" : str.toLowerCase(Locale.ENGLISH);
    }
}
