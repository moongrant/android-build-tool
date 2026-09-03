package p100o000oOoO;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00oOoo;
import p043OooooO0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOo000<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final AtomicReference<o0O0ooO> f29661OooO00o = new AtomicReference<>(o00oOoo.f3994OooO00o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Object f29662OooO0O0 = new Object();

    @Nullable
    public final T OooO00o() {
        o0O0ooO o0o0ooo = this.f29661OooO00o.get();
        int iOooO00o = o0o0ooo.OooO00o(Thread.currentThread().getId());
        if (iOooO00o >= 0) {
            return (T) o0o0ooo.f3997OooO0OO[iOooO00o];
        }
        return null;
    }

    public final void OooO0O0(@Nullable T t) {
        boolean z;
        long id = Thread.currentThread().getId();
        synchronized (this.f29662OooO0O0) {
            o0O0ooO o0o0ooo = this.f29661OooO00o.get();
            int iOooO00o = o0o0ooo.OooO00o(id);
            if (iOooO00o < 0) {
                z = false;
            } else {
                o0o0ooo.f3997OooO0OO[iOooO00o] = t;
                z = true;
            }
            if (z) {
                return;
            }
            this.f29661OooO00o.set(o0o0ooo.OooO0O0(id, t));
            Unit unit = Unit.INSTANCE;
        }
    }
}
