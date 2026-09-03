package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
public class ValidationUtils {
    public static <T> T OooO00o(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(String.format("%s cannot be null", str));
    }

    public static void OooO0O0(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String OooO0OO(String str, String str2) {
        OooO00o(str, str2);
        if (str.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", str2));
        }
        return str;
    }
}
