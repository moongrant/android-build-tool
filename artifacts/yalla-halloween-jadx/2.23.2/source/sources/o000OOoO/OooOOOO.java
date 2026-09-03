package o000OOoO;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f34688OooO00o;

    public OooOOOO(String str) {
        this.f34688OooO00o = str;
    }

    @Nullable
    public static OooOOOO OooO00o(o000O000 o000o001) {
        String str;
        o000o001.Oooo00o(2);
        int iOooOo0O = o000o001.OooOo0O();
        int i = iOooOo0O >> 1;
        int iOooOo0O2 = ((o000o001.OooOo0O() >> 3) & 31) | ((iOooOo0O & 1) << 5);
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
        return new OooOOOO(sb.toString());
    }
}
