package p311o0O0oO;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f36500OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36501OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f36502OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f36503OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f36504OooO0o0;

    public OooO0OO(int i, int i2, int i3, int i4, int i5) {
        this.f36500OooO00o = i;
        this.f36501OooO0O0 = i2;
        this.f36502OooO0OO = i3;
        this.f36503OooO0Oo = i4;
        this.f36504OooO0o0 = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    @Nullable
    public static OooO0OO OooO00o(String str) {
        byte b;
        o00000O0.OooO00o(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strOooo0 = o000OOo0.Oooo0(strArrSplit[i5].trim());
            Objects.requireNonNull(strOooo0);
            switch (strOooo0) {
                case "end":
                    b = 0;
                    break;
                case "text":
                    b = 1;
                    break;
                case "start":
                    b = 2;
                    break;
                case "style":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i2 = i5;
            } else if (b == 1) {
                i4 = i5;
            } else if (b == 2) {
                i = i5;
            } else if (b == 3) {
                i3 = i5;
            }
        }
        if (i == -1 || i2 == -1) {
            return null;
        }
        return new OooO0OO(i, i2, i3, i4, strArrSplit.length);
    }
}
