package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public class cm {
    public static void AFKeystoreWrapper(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
