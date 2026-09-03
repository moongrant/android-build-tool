package p214o00oO0;

import androidx.annotation.NonNull;
import java.util.Objects;
import o000OO0O.OooO;
import p241o00oo0.o0O00000;
import p241o00oo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0o0Oo<Z> implements o00OOOO0<Z>, o0oOOo.OooO0o {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final OooO<o0o0Oo<?>> f33534OoooO00 = (o0oOOo.OooO0OO) o0oOOo.OooO00o(20, new OooO00o());

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f33535Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0O00000.OooO00o f33536Oooo0o = new o0O00000.OooO00o();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o00OOOO0<Z> f33537Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f33538Oooo0oo;

    public class OooO00o implements o0oOOo.OooO0O0<o0o0Oo<?>> {
        @Override // o00oo0.o0oOOo.OooO0O0
        public final o0o0Oo<?> OooO00o() {
            return new o0o0Oo<>();
        }
    }

    @NonNull
    public static <Z> o0o0Oo<Z> OooO0Oo(o00OOOO0<Z> o00oooo1) {
        o0o0Oo<Z> o0o0oo = (o0o0Oo) f33534OoooO00.OooO0O0();
        Objects.requireNonNull(o0o0oo, "Argument must not be null");
        o0o0oo.f33535Oooo = false;
        o0o0oo.f33538Oooo0oo = true;
        o0o0oo.f33537Oooo0oO = o00oooo1;
        return o0o0oo;
    }

    @Override // p214o00oO0.o00OOOO0
    public final synchronized void OooO00o() {
        this.f33536Oooo0o.OooO00o();
        this.f33535Oooo = true;
        if (!this.f33538Oooo0oo) {
            this.f33537Oooo0oO.OooO00o();
            this.f33537Oooo0oO = null;
            f33534OoooO00.OooO00o(this);
        }
    }

    @Override // o00oo0.o0oOOo.OooO0o
    @NonNull
    public final o0O00000 OooO0O0() {
        return this.f33536Oooo0o;
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Class<Z> OooO0OO() {
        return this.f33537Oooo0oO.OooO0OO();
    }

    public final synchronized void OooO0o0() {
        this.f33536Oooo0o.OooO00o();
        if (!this.f33538Oooo0oo) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f33538Oooo0oo = false;
        if (this.f33535Oooo) {
            OooO00o();
        }
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Z get() {
        return this.f33537Oooo0oO.get();
    }

    @Override // p214o00oO0.o00OOOO0
    public final int getSize() {
        return this.f33537Oooo0oO.getSize();
    }
}
