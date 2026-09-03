package p633o0ooO0Oo;

import android.annotation.TargetApi;
import java.util.List;
import p637o0ooO0oo.o0O0O0O;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(11)
public final class o0O00 {
    public static o0O0O0O OooO00o(int i, List list) {
        o0O0O0O o0o0o0o;
        if (i >= 0 && i <= list.size() - 1) {
            return (o0O0O0O) list.get(i);
        }
        o0O0O0O o0o0o0o2 = new o0O0O0O();
        if (i < 0) {
            o0o0o0o = (o0O0O0O) list.get(0);
        } else {
            i = (i - list.size()) + 1;
            o0o0o0o = (o0O0O0O) list.get(list.size() - 1);
        }
        int i2 = o0o0o0o.f57700OooO00o;
        int i3 = o0o0o0o.f57702OooO0OO;
        o0o0o0o2.f57700OooO00o = ((i3 - i2) * i) + i2;
        o0o0o0o2.f57701OooO0O0 = o0o0o0o.f57701OooO0O0;
        int i4 = o0o0o0o.f57700OooO00o;
        o0o0o0o2.f57702OooO0OO = ((i3 - i4) * i) + i3;
        o0o0o0o2.f57703OooO0Oo = o0o0o0o.f57703OooO0Oo;
        int i5 = o0o0o0o.f57705OooO0o0;
        int i6 = o0o0o0o.f57702OooO0OO;
        o0o0o0o2.f57705OooO0o0 = ((i6 - i4) * i) + i5;
        o0o0o0o2.f57704OooO0o = o0o0o0o.f57704OooO0o;
        o0o0o0o2.f57706OooO0oO = ((i6 - i4) * i) + o0o0o0o.f57706OooO0oO;
        o0o0o0o2.f57707OooO0oo = o0o0o0o.f57707OooO0oo;
        return o0o0o0o2;
    }
}
