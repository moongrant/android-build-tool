package androidx.compose.foundation.lazy.layout;

import java.util.LinkedHashSet;
import p036OoooOOO.o000OOo;
import p387o0OOoo0o.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements o0o0Oo {
    public static final int OooO0O0(o000OOo o000ooo2, int i) {
        int i2 = o000ooo2.f3664Oooo0oo - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = o000ooo2.f3662Oooo0o;
            int i5 = ((OooO0O0.OooO00o) objArr[i4]).f5793OooO00o;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((OooO0O0.OooO00o) objArr[i3]).f5793OooO00o) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    @Override // p387o0OOoo0o.o0o0Oo
    public Object OooO00o() {
        return new LinkedHashSet();
    }
}
