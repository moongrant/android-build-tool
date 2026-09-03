package p247o00oo0oO;

import androidx.annotation.Nullable;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f40751OooO00o;

    public o00O0OOO(String str) {
        this.f40751OooO00o = str;
    }

    @Nullable
    public static o00O0OOO OooO00o(o00Oo00 o00oo00) {
        String str;
        o00oo00.Oooo00o(2);
        int iOooOo0O = o00oo00.OooOo0O();
        int i = iOooOo0O >> 1;
        int iOooOo0O2 = ((o00oo00.OooOo0O() >> 3) & 31) | ((iOooOo0O & 1) << 5);
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
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iOooOo0O2 >= 10 ? "." : ".0");
        sb.append(iOooOo0O2);
        return new o00O0OOO(sb.toString());
    }
}
