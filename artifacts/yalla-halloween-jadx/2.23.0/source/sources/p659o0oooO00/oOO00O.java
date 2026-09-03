package p659o0oooO00;

import androidx.appcompat.widget.o0000O0;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes5.dex */
@JvmName(name = "Utf8")
public final class oOO00O {
    public static long OooO00o(String str) {
        int i;
        int length = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(length >= 0)) {
            throw new IllegalArgumentException(OooOO0.OooO00o("endIndex < beginIndex: ", length, " < ", 0).toString());
        }
        if (!(length <= str.length())) {
            StringBuilder sbOooO00o = o0000O0.OooO00o("endIndex > string.length: ", length, " > ");
            sbOooO00o.append(str.length());
            throw new IllegalArgumentException(sbOooO00o.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return j;
    }
}
