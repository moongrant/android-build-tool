package p653o0ooOooo;

import android.annotation.TargetApi;
import java.util.List;
import p655o0ooo0.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(11)
public final class lj {
    public static o00O0OO0 OooO00o(List<o00O0OO0> list, int i) {
        o00O0OO0 o00o0oo1;
        if (i >= 0 && i <= list.size() - 1) {
            return list.get(i);
        }
        o00O0OO0 o00o0oo2 = new o00O0OO0();
        if (i < 0) {
            o00o0oo1 = list.get(0);
        } else {
            i = (i - list.size()) + 1;
            o00o0oo1 = list.get(list.size() - 1);
        }
        int i2 = o00o0oo1.f51172OooO00o;
        int i3 = o00o0oo1.f51174OooO0OO;
        o00o0oo2.f51172OooO00o = ((i3 - i2) * i) + i2;
        o00o0oo2.f51173OooO0O0 = o00o0oo1.f51173OooO0O0;
        int i4 = o00o0oo1.f51172OooO00o;
        o00o0oo2.f51174OooO0OO = ((i3 - i4) * i) + i3;
        o00o0oo2.f51175OooO0Oo = o00o0oo1.f51175OooO0Oo;
        int i5 = o00o0oo1.f51177OooO0o0;
        int i6 = o00o0oo1.f51174OooO0OO;
        o00o0oo2.f51177OooO0o0 = ((i6 - i4) * i) + i5;
        o00o0oo2.f51176OooO0o = o00o0oo1.f51176OooO0o;
        o00o0oo2.f51178OooO0oO = ((i6 - i4) * i) + o00o0oo1.f51178OooO0oO;
        o00o0oo2.f51179OooO0oo = o00o0oo1.f51179OooO0oo;
        return o00o0oo2;
    }
}
