package o00OoO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import p174o00OooOo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends oo0oOO0<o000oOoO.OooO00o<Object>, Object> {
    public Oooo0() {
        super(500L);
    }

    @Override // p174o00OooOo.oo0oOO0
    public final void OooO0OO(@NonNull o000oOoO.OooO00o<Object> oooO00o, @Nullable Object obj) {
        o000oOoO.OooO00o<Object> oooO00o2 = oooO00o;
        oooO00o2.getClass();
        ArrayDeque arrayDeque = o000oOoO.OooO00o.f37883OooO0Oo;
        synchronized (arrayDeque) {
            arrayDeque.offer(oooO00o2);
        }
    }
}
