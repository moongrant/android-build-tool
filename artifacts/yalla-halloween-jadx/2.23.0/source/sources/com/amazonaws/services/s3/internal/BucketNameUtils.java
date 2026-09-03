package com.amazonaws.services.s3.internal;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public enum BucketNameUtils {
    ;

    private static final Pattern IP_ADDRESS_PATTERN = Pattern.compile("(\\d+\\.){3}\\d+");
    private static final int MAX_BUCKET_NAME_LENGTH = 63;
    private static final int MIN_BUCKET_NAME_LENGTH = 3;

    public static boolean OooO00o(String str) {
        if (str == null || str.length() < 3 || str.length() > 63 || IP_ADDRESS_PATTERN.matcher(str).matches()) {
            return false;
        }
        int i = 0;
        char c = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n') {
                return false;
            }
            if (cCharAt == '.') {
                if (c == 0 || c == '.' || c == '-') {
                    return false;
                }
            } else if (cCharAt == '-') {
                if (c == '.' || c == 0) {
                    return false;
                }
            } else {
                if (cCharAt < '0') {
                    return false;
                }
                if ((cCharAt > '9' && cCharAt < 'a') || cCharAt > 'z') {
                    return false;
                }
            }
            i++;
            c = cCharAt;
        }
        return (c == '.' || c == '-' || str.contains(".")) ? false : true;
    }
}
