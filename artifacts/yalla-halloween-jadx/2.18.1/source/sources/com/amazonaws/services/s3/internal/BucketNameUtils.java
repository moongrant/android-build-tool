package com.amazonaws.services.s3.internal;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public enum BucketNameUtils {
    ;

    private static final Pattern IP_ADDRESS_PATTERN = Pattern.compile("(\\d+\\.){3}\\d+");
    private static final int MAX_BUCKET_NAME_LENGTH = 63;
    private static final int MIN_BUCKET_NAME_LENGTH = 3;

    public static void OooO00o(boolean z, String str) {
        if (z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean OooO0O0(String str, boolean z) {
        if (str == null) {
            OooO00o(z, "Bucket name cannot be null");
            return false;
        }
        if (str.length() < 3 || str.length() > 63) {
            OooO00o(z, "Bucket name should be between 3 and 63 characters long");
            return false;
        }
        if (IP_ADDRESS_PATTERN.matcher(str).matches()) {
            OooO00o(z, "Bucket name must not be formatted as an IP Address");
            return false;
        }
        int i = 0;
        char c = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                OooO00o(z, "Bucket name should not contain uppercase characters");
                return false;
            }
            if (cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n') {
                OooO00o(z, "Bucket name should not contain white space");
                return false;
            }
            if (cCharAt == '.') {
                if (c == 0) {
                    OooO00o(z, "Bucket name should not begin with a period");
                    return false;
                }
                if (c == '.') {
                    OooO00o(z, "Bucket name should not contain two adjacent periods");
                    return false;
                }
                if (c == '-') {
                    OooO00o(z, "Bucket name should not contain dashes next to periods");
                    return false;
                }
            } else if (cCharAt == '-') {
                if (c == '.') {
                    OooO00o(z, "Bucket name should not contain dashes next to periods");
                    return false;
                }
                if (c == 0) {
                    OooO00o(z, "Bucket name should not begin with a '-'");
                    return false;
                }
            } else if (cCharAt < '0' || ((cCharAt > '9' && cCharAt < 'a') || cCharAt > 'z')) {
                OooO00o(z, "Bucket name should not contain '" + cCharAt + "'");
                return false;
            }
            i++;
            c = cCharAt;
        }
        if (c != '.' && c != '-') {
            return !str.contains(".");
        }
        OooO00o(z, "Bucket name should not end with '-' or '.'");
        return false;
    }
}
