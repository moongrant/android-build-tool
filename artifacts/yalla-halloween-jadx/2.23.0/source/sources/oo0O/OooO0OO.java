package oo0O;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p127o00O0oo.o00000OO;
import p127o00O0oo.o0OO00O;
import p133o00OO0oO.o00Ooo;
import p532o0o0Oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00000OO<?, ?, ?> f60888OooO0OO = new o00000OO<>(Object.class, Object.class, Object.class, Collections.singletonList(new o0OO00O(Object.class, Object.class, Object.class, Collections.emptyList(), new o00Ooo(), null)), null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p188o00o0O.OooOO0<o0000, o00000OO<?, ?, ?>> f60889OooO00o = new p188o00o0O.OooOO0<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicReference<o0000> f60890OooO0O0 = new AtomicReference<>();

    public final void OooO00o(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable o00000OO<?, ?, ?> o00000oo2) {
        synchronized (this.f60889OooO00o) {
            p188o00o0O.OooOO0<o0000, o00000OO<?, ?, ?>> oooOO1 = this.f60889OooO00o;
            o0000 o0000Var = new o0000(cls, cls2, cls3);
            if (o00000oo2 == null) {
                o00000oo2 = f60888OooO0OO;
            }
            oooOO1.put(o0000Var, o00000oo2);
        }
    }
}
