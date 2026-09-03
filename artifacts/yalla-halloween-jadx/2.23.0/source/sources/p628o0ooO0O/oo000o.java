package p628o0ooO0O;

import android.annotation.TargetApi;
import java.util.List;
import p633o0ooO0o0.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(11)
public final class oo000o {
    public static o0000O00 OooO00o(int i, List list) {
        o0000O00 o0000o00;
        if (i >= 0 && i <= list.size() - 1) {
            return (o0000O00) list.get(i);
        }
        o0000O00 o0000o01 = new o0000O00();
        if (i < 0) {
            o0000o00 = (o0000O00) list.get(0);
        } else {
            i = (i - list.size()) + 1;
            o0000o00 = (o0000O00) list.get(list.size() - 1);
        }
        int i2 = o0000o00.f57126OooO00o;
        int i3 = o0000o00.f57128OooO0OO;
        o0000o01.f57126OooO00o = ((i3 - i2) * i) + i2;
        o0000o01.f57127OooO0O0 = o0000o00.f57127OooO0O0;
        int i4 = o0000o00.f57126OooO00o;
        o0000o01.f57128OooO0OO = ((i3 - i4) * i) + i3;
        o0000o01.f57129OooO0Oo = o0000o00.f57129OooO0Oo;
        int i5 = o0000o00.f57131OooO0o0;
        int i6 = o0000o00.f57128OooO0OO;
        o0000o01.f57131OooO0o0 = ((i6 - i4) * i) + i5;
        o0000o01.f57130OooO0o = o0000o00.f57130OooO0o;
        o0000o01.f57132OooO0oO = ((i6 - i4) * i) + o0000o00.f57132OooO0oO;
        o0000o01.f57133OooO0oo = o0000o00.f57133OooO0oo;
        return o0000o01;
    }
}
