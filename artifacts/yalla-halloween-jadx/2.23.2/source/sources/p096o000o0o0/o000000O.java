package p096o000o0o0;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.OooO0OO;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f35279OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35280OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f35281OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f35282OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f35283OooO0o0;

    public o000000O(int i, int i2, int i3, int i4, int i5) {
        this.f35279OooO00o = i;
        this.f35280OooO0O0 = i2;
        this.f35281OooO0OO = i3;
        this.f35282OooO0Oo = i4;
        this.f35283OooO0o0 = i5;
    }

    @Nullable
    public static o000000O OooO00o(String str) {
        o00Oo0.OooO00o(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strOooO00o = OooO0OO.OooO00o(strArrSplit[i5].trim());
            strOooO00o.getClass();
            switch (strOooO00o) {
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
        return new o000000O(i, i2, i3, i4, strArrSplit.length);
    }
}
