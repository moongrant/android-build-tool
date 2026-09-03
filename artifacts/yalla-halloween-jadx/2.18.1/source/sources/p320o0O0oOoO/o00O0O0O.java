package p320o0O0oOoO;

import androidx.annotation.Nullable;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f36794OooO00o;

    public o00O0O0O(String str) {
        this.f36794OooO00o = str;
    }

    @Nullable
    public static o00O0O0O OooO00o(o000 o000Var) {
        String str;
        o000Var.OooOoo0(2);
        int iOooOOo0 = o000Var.OooOOo0();
        int i = iOooOOo0 >> 1;
        int iOooOOo1 = ((o000Var.OooOOo0() >> 3) & 31) | ((iOooOOo0 & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder(str.length() + 26);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(".0");
        sb.append(iOooOOo1);
        return new o00O0O0O(sb.toString());
    }
}
