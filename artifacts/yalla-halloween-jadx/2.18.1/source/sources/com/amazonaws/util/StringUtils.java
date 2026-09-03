package com.amazonaws.util;

import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class StringUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f11186OooO00o = Charset.forName("UTF-8");

    public static String OooO00o(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? "" : str.toLowerCase(Locale.ENGLISH);
    }

    public static String OooO0O0(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? "" : str.toUpperCase(Locale.ENGLISH);
    }
}
