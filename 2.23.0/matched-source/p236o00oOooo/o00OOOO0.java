package p236o00oOooo;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.OooO0OO;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f40305OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f40306OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f40307OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40308OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f40309OooO0o0;

    public o00OOOO0(int i, int i2, int i3, int i4, int i5) {
        this.f40305OooO00o = i;
        this.f40306OooO0O0 = i2;
        this.f40307OooO0OO = i3;
        this.f40308OooO0Oo = i4;
        this.f40309OooO0o0 = i5;
    }

    @Nullable
    public static o00OOOO0 OooO00o(String str) {
        o00O000o.OooO00o(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strOooO0O0 = OooO0OO.OooO0O0(strArrSplit[i5].trim());
            strOooO0O0.getClass();
            switch (strOooO0O0) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new o00OOOO0(i, i2, i3, i4, strArrSplit.length);
    }
}
