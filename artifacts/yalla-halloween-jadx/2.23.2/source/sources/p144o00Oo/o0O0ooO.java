package p144o00Oo;

import androidx.annotation.NonNull;
import p279o0O00o0.OooO;
import p279o0O00o0.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0ooO<Z> implements o00oOoo<Z>, OooO0O0.OooO0o {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO0O0.OooO0OO f37728OooO0oo = OooO0O0.OooO00o(20, new OooO00o());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO.OooO00o f37729OooO0Oo = new OooO.OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f37730OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00oOoo<Z> f37731OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f37732OooO0oO;

    public class OooO00o implements OooO0O0.InterfaceC0441OooO0O0<o0O0ooO<?>> {
        @Override // p279o0O00o0.OooO0O0.InterfaceC0441OooO0O0
        public final o0O0ooO<?> OooO00o() {
            return new o0O0ooO<>();
        }
    }

    @Override // p144o00Oo.o00oOoo
    public final synchronized void OooO00o() {
        this.f37729OooO0Oo.OooO00o();
        this.f37732OooO0oO = true;
        if (!this.f37730OooO0o) {
            this.f37731OooO0o0.OooO00o();
            this.f37731OooO0o0 = null;
            f37728OooO0oo.OooO00o(this);
        }
    }

    @Override // o0O00o0.OooO0O0.OooO0o
    @NonNull
    public final OooO.OooO00o OooO0O0() {
        return this.f37729OooO0Oo;
    }

    @Override // p144o00Oo.o00oOoo
    @NonNull
    public final Class<Z> OooO0OO() {
        return this.f37731OooO0o0.OooO0OO();
    }

    public final synchronized void OooO0Oo() {
        this.f37729OooO0Oo.OooO00o();
        if (!this.f37730OooO0o) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f37730OooO0o = false;
        if (this.f37732OooO0oO) {
            OooO00o();
        }
    }

    @Override // p144o00Oo.o00oOoo
    @NonNull
    public final Z get() {
        return this.f37731OooO0o0.get();
    }

    @Override // p144o00Oo.o00oOoo
    public final int getSize() {
        return this.f37731OooO0o0.getSize();
    }
}
