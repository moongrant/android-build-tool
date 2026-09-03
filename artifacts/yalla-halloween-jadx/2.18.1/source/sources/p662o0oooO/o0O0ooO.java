package p662o0oooO;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p058o0000OoO.OooO;
import p659o0ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String[] f51714OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0O0ooO f51715OooO0o0 = new o0O0ooO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f51711OooO00o = ByteString.f53047OoooO00.OooO0OO("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f51712OooO0O0 = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f51713OooO0OO = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            Intrinsics.checkNotNullExpressionValue(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = StringsKt__StringsJVMKt.replace$default(o00OOO00.OooOO0("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f51714OooO0Oo = strArr;
        String[] strArr2 = f51713OooO0OO;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f51713OooO0OO;
            strArr3[i3 | 8] = Intrinsics.stringPlus(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = f51713OooO0OO;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f51713OooO0OO;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i7]);
                sb.append("|");
                strArr5[i8 | 8] = OooO.OooO00o(sb, strArr5[i5], "|PADDED");
            }
        }
        int length = f51713OooO0OO.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = f51713OooO0OO;
            if (strArr6[i9] == null) {
                strArr6[i9] = f51714OooO0Oo[i9];
            }
        }
    }

    @NotNull
    public final String OooO00o(int i) {
        String[] strArr = f51712OooO0O0;
        return i < strArr.length ? strArr[i] : o00OOO00.OooOO0("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    @NotNull
    public final String OooO0O0(boolean z, int i, int i2, int i3, int i4) {
        String strOooOo00;
        String str;
        String strOooO00o = OooO00o(i3);
        if (i4 == 0) {
            strOooOo00 = "";
        } else if (i3 == 2 || i3 == 3) {
            strOooOo00 = f51714OooO0Oo[i4];
        } else if (i3 == 4 || i3 == 6) {
            strOooOo00 = i4 == 1 ? "ACK" : f51714OooO0Oo[i4];
        } else if (i3 == 7 || i3 == 8) {
            strOooOo00 = f51714OooO0Oo[i4];
        } else {
            String[] strArr = f51713OooO0OO;
            if (i4 < strArr.length) {
                str = strArr[i4];
                Intrinsics.checkNotNull(str);
            } else {
                str = f51714OooO0Oo[i4];
            }
            if (i3 != 5 || (i4 & 4) == 0) {
                strOooOo00 = (i3 != 0 || (i4 & 32) == 0) ? str : StringsKt.OooOo00(str, "PRIORITY", "COMPRESSED");
            } else {
                strOooOo00 = StringsKt.OooOo00(str, "HEADERS", "PUSH_PROMISE");
            }
        }
        return o00OOO00.OooOO0("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strOooO00o, strOooOo00);
    }
}
