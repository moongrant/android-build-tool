package p169o00Ooo0O;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p174o00OooOo.o00OO000;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<o00OO000> f38235OooO00o = new AtomicReference<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO<o00OO000, List<Class<?>>> f38236OooO0O0 = new OooO<>();

    public final void OooO00o(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f38236OooO0O0) {
            this.f38236OooO0O0.put(new o00OO000(cls, cls2, cls3), list);
        }
    }
}
