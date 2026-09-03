package com.amazonaws.util;

import com.facebook.appevents.AppEventsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class BinaryUtils {
    public static byte[] OooO00o(String str) {
        byte[] bArr = new byte[(str.length() + 1) / 2];
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 2;
            bArr[i2] = (byte) Integer.parseInt(str.substring(i, i3), 16);
            i = i3;
            i2++;
        }
        return bArr;
    }

    public static String OooO0O0(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b);
            if (hexString.length() == 1) {
                sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            } else if (hexString.length() == 8) {
                hexString = hexString.substring(6);
            }
            sb.append(hexString);
        }
        return StringUtils.OooO00o(sb.toString());
    }
}
