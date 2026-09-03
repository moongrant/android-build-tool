package p214o00oO0;

import androidx.annotation.NonNull;
import java.util.Objects;
import p217o00oO00o.o000000;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO<Z> implements o00OOOO0<Z> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO00o f33433Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f33434Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f33435Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o00OOOO0<Z> f33436Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f33437OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final o000000 f33438OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f33439OoooO0O;

    public interface OooO00o {
        void OooO00o(o000000 o000000Var, o00OO<?> o00oo2);
    }

    public o00OO(o00OOOO0<Z> o00oooo1, boolean z, boolean z2, o000000 o000000Var, OooO00o oooO00o) {
        Objects.requireNonNull(o00oooo1, "Argument must not be null");
        this.f33436Oooo0oo = o00oooo1;
        this.f33434Oooo0o = z;
        this.f33435Oooo0oO = z2;
        this.f33438OoooO00 = o000000Var;
        Objects.requireNonNull(oooO00o, "Argument must not be null");
        this.f33433Oooo = oooO00o;
    }

    @Override // p214o00oO0.o00OOOO0
    public final synchronized void OooO00o() {
        if (this.f33437OoooO0 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f33439OoooO0O) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f33439OoooO0O = true;
        if (this.f33435Oooo0oO) {
            this.f33436Oooo0oo.OooO00o();
        }
    }

    public final synchronized void OooO0O0() {
        if (this.f33439OoooO0O) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f33437OoooO0++;
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Class<Z> OooO0OO() {
        return this.f33436Oooo0oo.OooO0OO();
    }

    public final void OooO0Oo() {
        boolean z;
        synchronized (this) {
            int i = this.f33437OoooO0;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f33437OoooO0 = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f33433Oooo.OooO00o(this.f33438OoooO00, this);
        }
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Z get() {
        return this.f33436Oooo0oo.get();
    }

    @Override // p214o00oO0.o00OOOO0
    public final int getSize() {
        return this.f33436Oooo0oo.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f33434Oooo0o + ", listener=" + this.f33433Oooo + ", key=" + this.f33438OoooO00 + ", acquired=" + this.f33437OoooO0 + ", isRecycled=" + this.f33439OoooO0O + ", resource=" + this.f33436Oooo0oo + '}';
    }
}
