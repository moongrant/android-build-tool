package p655o0ooo0O;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOOO0o f59445OooO00o = new o0OOOO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59446OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final String[] f59447OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final String[] f59448OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final String[] f59449OooO0o0;

    static {
        ByteString byteString = ByteString.f60193OooO0oO;
        f59446OooO0O0 = ByteString.OooO00o.OooO0OO("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f59447OooO0OO = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f59448OooO0Oo = new String[64];
        String[] strArr = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i2] = StringsKt__StringsJVMKt.replace$default(oO000o00.OooO("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f59449OooO0o0 = strArr;
        String[] strArr2 = f59448OooO0Oo;
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
            String[] strArr3 = f59448OooO0Oo;
            int i7 = i6 | i5;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i6]);
            sb.append('|');
            sb.append((Object) strArr3[i5]);
            strArr3[i7] = sb.toString();
            strArr3[i7 | 8] = ((Object) strArr3[i6]) + '|' + ((Object) strArr3[i5]) + "|PADDED";
        }
        int length = f59448OooO0Oo.length;
        while (i < length) {
            int i8 = i + 1;
            String[] strArr4 = f59448OooO0Oo;
            if (strArr4[i] == null) {
                strArr4[i] = f59449OooO0o0[i];
            }
            i = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    @NotNull
    public static String OooO00o(int i, int i2, int i3, int i4, boolean z) {
        String strReplace$default;
        String str;
        String[] strArr = f59447OooO0OO;
        String strOooO = i3 < strArr.length ? strArr[i3] : oO000o00.OooO("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strReplace$default = "";
        } else {
            String[] strArr2 = f59449OooO0o0;
            if (i3 == 2 || i3 == 3) {
                strReplace$default = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strReplace$default = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == 8) {
                strReplace$default = strArr2[i4];
            } else {
                String[] strArr3 = f59448OooO0Oo;
                if (i4 < strArr3.length) {
                    str = strArr3[i4];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = strArr2[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strReplace$default = (i3 != 0 || (i4 & 32) == 0) ? str : StringsKt__StringsJVMKt.replace$default(str, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
                } else {
                    strReplace$default = StringsKt__StringsJVMKt.replace$default(str, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                }
            }
        }
        return oO000o00.OooO("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strOooO, strReplace$default);
    }
}
