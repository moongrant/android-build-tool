package p023Oooo00O;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0<V extends o0O0O00> implements o00Oo00<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1026OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1027OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000oo f1028OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0oOO<V> f1029OooO0Oo;

    public o0(int i, int i2, @NotNull o0000oo easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.f1026OooO00o = i;
        this.f1027OooO0O0 = i2;
        this.f1028OooO0OO = easing;
        this.f1029OooO0Oo = new o0oOO<>(new o000(i, i2, easing));
    }

    @Override // p023Oooo00O.o00OOO00
    public final /* synthetic */ boolean OooO00o() {
        return false;
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0O0(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (V) this.f1029OooO0Oo.OooO0O0(j, initialValue, targetValue, initialVelocity);
    }

    @Override // p023Oooo00O.o00Oo00
    public final int OooO0OO() {
        return this.f1027OooO0O0;
    }

    @Override // p023Oooo00O.o00OOO00
    public final /* synthetic */ long OooO0Oo(o0O0O00 o0o0o00, o0O0O00 o0o0o01, o0O0O00 o0o0o02) {
        return o00OOOOo.OooO00o(this, o0o0o00, o0o0o01, o0o0o02);
    }

    @Override // p023Oooo00O.o00Oo00
    public final int OooO0o() {
        return this.f1026OooO00o;
    }

    @Override // p023Oooo00O.o00OOO00
    public final /* synthetic */ o0O0O00 OooO0o0(o0O0O00 o0o0o00, o0O0O00 o0o0o01, o0O0O00 o0o0o02) {
        return o00OO.OooO00o(this, o0o0o00, o0o0o01, o0o0o02);
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0oO(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (V) this.f1029OooO0Oo.OooO0oO(j, initialValue, targetValue, initialVelocity);
    }
}
