package p387o0OOoo0o;

import android.support.v4.media.OooO00o;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.UByte;
import p650o0ooOoO.e;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OOO implements o0o0Oo {
    public static byte[] OooO0O0(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) ((i >> ((3 - i2) * 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        return bArr;
    }

    public static final long OooO0OO(int i) {
        long j = (((long) i) << 32) | (((long) 0) & 4294967295L);
        e.OooO00o oooO00o = e.f51128OooO00o;
        return j;
    }

    public static int OooO0Oo(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            throw new IllegalAccessError();
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= bArr[0 + i2] & UByte.MAX_VALUE;
            if (i2 == 3) {
                break;
            }
            i <<= 8;
        }
        return i;
    }

    public static DateFormat OooO0o(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(OooO00o.OooO00o("Unknown DateFormat style: ", i));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(OooO00o.OooO00o("Unknown DateFormat style: ", i2));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static final int OooO0o0(float f) {
        return (int) Math.ceil(f);
    }

    public static boolean OooO0oO(byte b) {
        return b > -65;
    }

    @Override // p387o0OOoo0o.o0o0Oo
    public Object OooO00o() {
        return new LinkedHashMap();
    }
}
