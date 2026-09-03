package o00OO00O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import p532o0o0Oo.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends o00000OO<o000oOoO.OooO00o<Object>, Object> {
    public Oooo0() {
        super(500L);
    }

    @Override // p532o0o0Oo.o00000OO
    public final void OooO0OO(@NonNull o000oOoO.OooO00o<Object> oooO00o, @Nullable Object obj) {
        o000oOoO.OooO00o<Object> oooO00o2 = oooO00o;
        oooO00o2.getClass();
        ArrayDeque arrayDeque = o000oOoO.OooO00o.f37121OooO0Oo;
        synchronized (arrayDeque) {
            arrayDeque.offer(oooO00o2);
        }
    }
}
