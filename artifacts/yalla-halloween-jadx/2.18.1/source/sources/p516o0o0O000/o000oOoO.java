package p516o0o0O000;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {
    static {
        o000O0O0.OooO00o(-43133528415760L);
    }

    public static String OooO00o(String str) {
        if (str == null) {
            return o000O0O0.OooO00o(-42497873255952L);
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance(o000O0O0.OooO00o(-42502168223248L)).digest(str.getBytes(o000O0O0.OooO00o(-42519348092432L)));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & UByte.MAX_VALUE;
                if (i < 16) {
                    sb.append(o000O0O0.OooO00o(-42811405868560L));
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(o000O0O0.OooO00o(-42673966915088L), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(o000O0O0.OooO00o(-42545117896208L), e2);
        }
    }

    public static String OooO0O0(String str) {
        if (str == null) {
            str = o000O0O0.OooO00o(-42888715279888L);
        }
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            stringBuffer.append(o000O0O0.OooO00o(-42893010247184L));
            String hexString = Integer.toHexString(cCharAt >>> '\b');
            if (hexString.length() == 1) {
                stringBuffer.append(o000O0O0.OooO00o(-42905895149072L));
            }
            stringBuffer.append(hexString);
            String hexString2 = Integer.toHexString(cCharAt & 255);
            if (hexString2.length() == 1) {
                stringBuffer.append(o000O0O0.OooO00o(-42914485083664L));
            }
            stringBuffer.append(hexString2);
        }
        return new String(stringBuffer);
    }
}
