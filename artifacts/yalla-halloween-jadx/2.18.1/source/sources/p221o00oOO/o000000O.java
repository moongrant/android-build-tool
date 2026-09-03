package p221o00oOO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.Queue;
import p243o00oo00O.o000OO;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O extends o000OO<o00000.OooO00o<Object>, Object> {
    public o000000O() {
        super(500L);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p243o00oo00O.o000OO
    public final void OooO0OO(@NonNull o00000.OooO00o<Object> oooO00o, @Nullable Object obj) {
        o00000.OooO00o<Object> oooO00o2 = oooO00o;
        Objects.requireNonNull(oooO00o2);
        Queue<o00000.OooO00o<?>> queue = o00000.OooO00o.f33692OooO0Oo;
        synchronized (queue) {
            queue.offer((o00000.OooO00o<?>) oooO00o2);
        }
    }
}
