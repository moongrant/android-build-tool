package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class ct {
    public static void AFInAppEventParameterName(char[] cArr, char[] cArr2, int i) {
        int i2 = cArr[i % 4] * 32718;
        char c = cArr2[(i + 2) % 4];
        int i3 = (i + 3) % 4;
        cArr2[i3] = (char) (((cArr[i3] * 32718) + c) / 65535);
        cArr[i3] = (char) ((i2 + c) % 65535);
    }
}
