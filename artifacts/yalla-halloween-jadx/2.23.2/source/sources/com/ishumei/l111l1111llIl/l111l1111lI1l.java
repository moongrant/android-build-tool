package com.ishumei.l111l1111llIl;

import android.text.TextUtils;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.facebook.appevents.AppEventsConstants;
import java.util.Locale;
import java.util.Random;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class l111l1111lI1l {
    public static String l1111l111111Il() {
        return String.format(Locale.CHINA, "%d-%05d", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(new Random().nextInt(AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength)));
    }

    public static boolean l111l11111I1l(String str) {
        return l1111l111111Il(str == null ? null : str.trim());
    }

    public static String l111l11111Il(String str) {
        return new String(l111l11111lIl(l111l1111lIl(str)));
    }

    public static boolean l111l11111lIl(String str) {
        return !l1111l111111Il(str);
    }

    private static String l111l1111l1Il(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    private static String l111l1111lI1l(String str) {
        return str == null ? "" : str;
    }

    private static byte[] l111l1111lIl(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) Integer.parseInt(new String(bytes, i, 2), 16);
        }
        return bArr;
    }

    private static boolean l111l1111llIl(String str) {
        return !l111l11111I1l(str);
    }

    private static String l11l1111lIIl(String str) {
        byte[] bArrL111l11111lIl = l111l11111lIl(str.getBytes());
        StringBuilder sb = new StringBuilder(bArrL111l11111lIl.length << 1);
        for (int i : bArrL111l11111lIl) {
            while (i < 0) {
                i += PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if (i < 16) {
                sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
            sb.append(Integer.toString(i, 16));
        }
        return sb.toString();
    }

    private static String l1111l111111Il(int i) {
        char[] cArr = new char[i];
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = (char) (random.nextInt(26) + 97);
        }
        return new String(cArr);
    }

    private static byte[] l111l11111lIl(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (~bArr[i]);
        }
        return bArr2;
    }

    private static String l1111l111111Il(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (int i : bArr) {
            while (i < 0) {
                i += PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if (i < 16) {
                sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
            sb.append(Integer.toString(i, 16));
        }
        return sb.toString();
    }

    public static boolean l1111l111111Il(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean l1111l111111Il(String str, String str2) {
        return TextUtils.equals(str, str2);
    }
}
