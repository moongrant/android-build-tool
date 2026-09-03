package p127o00O0oo;

import androidx.annotation.NonNull;
import p126o00O0oOo.o000OOo;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000<Z> implements o0000<Z> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f36732OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f36733OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000<Z> f36734OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f36735OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f36736OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000OOo f36737OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f36738OooOO0;

    public interface OooO00o {
        void OooO00o(o000OOo o000ooo2, o00000<?> o00000Var);
    }

    public o00000(o0000<Z> o0000Var, boolean z, boolean z2, o000OOo o000ooo2, OooO00o oooO00o) {
        o0000O00.OooO0O0(o0000Var);
        this.f36734OooO0o = o0000Var;
        this.f36733OooO0Oo = z;
        this.f36735OooO0o0 = z2;
        this.f36737OooO0oo = o000ooo2;
        o0000O00.OooO0O0(oooO00o);
        this.f36736OooO0oO = oooO00o;
    }

    @Override // p127o00O0oo.o0000
    public final synchronized void OooO00o() {
        if (this.f36732OooO > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f36738OooOO0) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f36738OooOO0 = true;
        if (this.f36735OooO0o0) {
            this.f36734OooO0o.OooO00o();
        }
    }

    @Override // p127o00O0oo.o0000
    @NonNull
    public final Class<Z> OooO0O0() {
        return this.f36734OooO0o.OooO0O0();
    }

    public final synchronized void OooO0OO() {
        if (this.f36738OooOO0) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f36732OooO++;
    }

    public final void OooO0Oo() {
        boolean z;
        synchronized (this) {
            int i = this.f36732OooO;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f36732OooO = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f36736OooO0oO.OooO00o(this.f36737OooO0oo, this);
        }
    }

    @Override // p127o00O0oo.o0000
    @NonNull
    public final Z get() {
        return this.f36734OooO0o.get();
    }

    @Override // p127o00O0oo.o0000
    public final int getSize() {
        return this.f36734OooO0o.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f36733OooO0Oo + ", listener=" + this.f36736OooO0oO + ", key=" + this.f36737OooO0oo + ", acquired=" + this.f36732OooO + ", isRecycled=" + this.f36738OooOO0 + ", resource=" + this.f36734OooO0o + '}';
    }
}
