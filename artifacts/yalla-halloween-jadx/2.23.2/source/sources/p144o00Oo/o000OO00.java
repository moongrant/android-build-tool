package p144o00Oo;

import androidx.annotation.NonNull;
import p154o00Oo0oo.o0OOO0o;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00<Z> implements o00oOoo<Z> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f37652OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f37653OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00oOoo<Z> f37654OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f37655OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f37656OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0OOO0o f37657OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f37658OooOO0;

    public interface OooO00o {
        void OooO00o(o0OOO0o o0ooo0o2, o000OO00<?> o000oo01);
    }

    public o000OO00(o00oOoo<Z> o00oooo2, boolean z, boolean z2, o0OOO0o o0ooo0o2, OooO00o oooO00o) {
        o00OO00O.OooO0O0(o00oooo2);
        this.f37654OooO0o = o00oooo2;
        this.f37653OooO0Oo = z;
        this.f37655OooO0o0 = z2;
        this.f37657OooO0oo = o0ooo0o2;
        o00OO00O.OooO0O0(oooO00o);
        this.f37656OooO0oO = oooO00o;
    }

    @Override // p144o00Oo.o00oOoo
    public final synchronized void OooO00o() {
        if (this.f37652OooO > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f37658OooOO0) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f37658OooOO0 = true;
        if (this.f37655OooO0o0) {
            this.f37654OooO0o.OooO00o();
        }
    }

    public final synchronized void OooO0O0() {
        if (this.f37658OooOO0) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f37652OooO++;
    }

    @Override // p144o00Oo.o00oOoo
    @NonNull
    public final Class<Z> OooO0OO() {
        return this.f37654OooO0o.OooO0OO();
    }

    public final void OooO0Oo() {
        boolean z;
        synchronized (this) {
            int i = this.f37652OooO;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f37652OooO = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f37656OooO0oO.OooO00o(this.f37657OooO0oo, this);
        }
    }

    @Override // p144o00Oo.o00oOoo
    @NonNull
    public final Z get() {
        return this.f37654OooO0o.get();
    }

    @Override // p144o00Oo.o00oOoo
    public final int getSize() {
        return this.f37654OooO0o.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f37653OooO0Oo + ", listener=" + this.f37656OooO0oO + ", key=" + this.f37657OooO0oo + ", acquired=" + this.f37652OooO + ", isRecycled=" + this.f37658OooOO0 + ", resource=" + this.f37654OooO0o + '}';
    }
}
