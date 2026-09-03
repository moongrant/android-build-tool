package oo0O;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p532o0o0Oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<o0000> f60891OooO00o = new AtomicReference<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p188o00o0O.OooOO0<o0000, List<Class<?>>> f60892OooO0O0 = new p188o00o0O.OooOO0<>();

    public final void OooO00o(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f60892OooO0O0) {
            this.f60892OooO0O0.put(new o0000(cls, cls2, cls3), list);
        }
    }
}
