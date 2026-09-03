package p127o00O0oo;

import androidx.annotation.NonNull;
import o00OOO.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo<Z> implements o0000<Z>, o00OOO.OooO00o.OooO0o {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o00OOO.OooO00o.OooO0OO f36767OooO0oo = o00OOO.OooO00o.OooO00o(20, new OooO00o());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o.OooO00o f36768OooO0Oo = new OooO0o.OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f36769OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0000<Z> f36770OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f36771OooO0oO;

    public class OooO00o implements o00OOO.OooO00o.OooO0O0<o0000Ooo<?>> {
        @Override // o00OOO.OooO00o.OooO0O0
        public final o0000Ooo<?> OooO00o() {
            return new o0000Ooo<>();
        }
    }

    @Override // p127o00O0oo.o0000
    public final synchronized void OooO00o() {
        this.f36768OooO0Oo.OooO00o();
        this.f36771OooO0oO = true;
        if (!this.f36769OooO0o) {
            this.f36770OooO0o0.OooO00o();
            this.f36770OooO0o0 = null;
            f36767OooO0oo.OooO00o(this);
        }
    }

    @Override // p127o00O0oo.o0000
    @NonNull
    public final Class<Z> OooO0O0() {
        return this.f36770OooO0o0.OooO0O0();
    }

    @Override // o00OOO.OooO00o.OooO0o
    @NonNull
    public final OooO0o.OooO00o OooO0OO() {
        return this.f36768OooO0Oo;
    }

    public final synchronized void OooO0Oo() {
        this.f36768OooO0Oo.OooO00o();
        if (!this.f36769OooO0o) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f36769OooO0o = false;
        if (this.f36771OooO0oO) {
            OooO00o();
        }
    }

    @Override // p127o00O0oo.o0000
    @NonNull
    public final Z get() {
        return this.f36770OooO0o0.get();
    }

    @Override // p127o00O0oo.o0000
    public final int getSize() {
        return this.f36770OooO0o0.getSize();
    }
}
