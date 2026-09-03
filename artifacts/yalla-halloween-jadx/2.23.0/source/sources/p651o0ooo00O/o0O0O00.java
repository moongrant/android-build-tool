package p651o0ooo00O;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O00 f59985OooO00o = new o0O0O00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59986OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final String[] f59987OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final String[] f59988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final String[] f59989OooO0o0;

    static {
        ByteString byteString = ByteString.f60866OooO0oO;
        f59986OooO0O0 = ByteString.OooO00o.OooO0OO("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f59987OooO0OO = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f59988OooO0Oo = new String[64];
        String[] strArr = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i2] = StringsKt__StringsJVMKt.replace$default(o0O000o0.OooO("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f59989OooO0o0 = strArr;
        String[] strArr2 = f59988OooO0Oo;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = Intrinsics.stringPlus(strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i4 = 0;
        while (i4 < 3) {
            int i5 = iArr2[i4];
            i4++;
            int i6 = iArr[0];
            String[] strArr3 = f59988OooO0Oo;
            int i7 = i6 | i5;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i6]);
            sb.append('|');
            sb.append((Object) strArr3[i5]);
            strArr3[i7] = sb.toString();
            strArr3[i7 | 8] = ((Object) strArr3[i6]) + '|' + ((Object) strArr3[i5]) + "|PADDED";
        }
        int length = f59988OooO0Oo.length;
        while (i < length) {
            int i8 = i + 1;
            String[] strArr4 = f59988OooO0Oo;
            if (strArr4[i] == null) {
                strArr4[i] = f59989OooO0o0[i];
            }
            i = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    @NotNull
    public static String OooO00o(int i, int i2, int i3, int i4, boolean z) {
        String strOooOoO;
        String str;
        String[] strArr = f59987OooO0OO;
        String strOooO = i3 < strArr.length ? strArr[i3] : o0O000o0.OooO("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strOooOoO = "";
        } else {
            String[] strArr2 = f59989OooO0o0;
            if (i3 == 2 || i3 == 3) {
                strOooOoO = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strOooOoO = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == 8) {
                strOooOoO = strArr2[i4];
            } else {
                String[] strArr3 = f59988OooO0Oo;
                if (i4 < strArr3.length) {
                    str = strArr3[i4];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = strArr2[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strOooOoO = (i3 != 0 || (i4 & 32) == 0) ? str : StringsKt.OooOoO(str, "PRIORITY", "COMPRESSED");
                } else {
                    strOooOoO = StringsKt.OooOoO(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return o0O000o0.OooO("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strOooO, strOooOoO);
    }
}
