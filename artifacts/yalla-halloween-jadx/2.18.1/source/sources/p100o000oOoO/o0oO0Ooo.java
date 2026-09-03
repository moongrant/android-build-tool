package p100o000oOoO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0oO0Ooo<N> implements o00O000<N> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O000<N> f29668OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f29669OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f29670OooO0OO;

    public o0oO0Ooo(@NotNull o00O000<N> applier, int i) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.f29668OooO00o = applier;
        this.f29669OooO0O0 = i;
    }

    @Override // p100o000oOoO.o00O000
    public final /* synthetic */ void OooO() {
    }

    @Override // p100o000oOoO.o00O000
    public final N OooO00o() {
        return this.f29668OooO00o.OooO00o();
    }

    @Override // p100o000oOoO.o00O000
    public final void OooO0O0(int i, N n) {
        this.f29668OooO00o.OooO0O0(i + (this.f29670OooO0OO == 0 ? this.f29669OooO0O0 : 0), n);
    }

    @Override // p100o000oOoO.o00O000
    public final void OooO0OO(N n) {
        this.f29670OooO0OO++;
        this.f29668OooO00o.OooO0OO(n);
    }

    @Override // p100o000oOoO.o00O000
    public final /* synthetic */ void OooO0Oo() {
    }

    @Override // p100o000oOoO.o00O000
    public final void OooO0o(int i, int i2) {
        this.f29668OooO00o.OooO0o(i + (this.f29670OooO0OO == 0 ? this.f29669OooO0O0 : 0), i2);
    }

    @Override // p100o000oOoO.o00O000
    public final void OooO0o0(int i, int i2, int i3) {
        int i4 = this.f29670OooO0OO == 0 ? this.f29669OooO0O0 : 0;
        this.f29668OooO00o.OooO0o0(i + i4, i2 + i4, i3);
    }

    @Override // p100o000oOoO.o00O000
    public final void OooO0oO() {
        int i = this.f29670OooO0OO;
        if (!(i > 0)) {
            oo0o0O0.OooO0Oo("OffsetApplier up called with no corresponding down".toString());
            throw null;
        }
        this.f29670OooO0OO = i - 1;
        this.f29668OooO00o.OooO0oO();
    }

    @Override // p100o000oOoO.o00O000
    public final void OooO0oo(int i, N n) {
        this.f29668OooO00o.OooO0oo(i + (this.f29670OooO0OO == 0 ? this.f29669OooO0O0 : 0), n);
    }

    @Override // p100o000oOoO.o00O000
    public final void clear() {
        oo0o0O0.OooO0Oo("Clear is not valid on OffsetApplier".toString());
        throw null;
    }
}
