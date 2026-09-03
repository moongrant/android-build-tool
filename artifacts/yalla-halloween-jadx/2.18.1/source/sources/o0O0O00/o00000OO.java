package o0O0O00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO implements o0O0O00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final OooOOOO f35255Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o0000 f35256Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o0000O00 f35257Oooo0oo;

    public o00000OO(@NotNull OooOOOO measurable, @NotNull o0000 minMax, @NotNull o0000O00 widthHeight) {
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        this.f35255Oooo0o = measurable;
        this.f35256Oooo0oO = minMax;
        this.f35257Oooo0oo = widthHeight;
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOOO(int i) {
        return this.f35255Oooo0o.OooOOO(i);
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOoo(int i) {
        return this.f35255Oooo0o.OooOoo(i);
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOooO(int i) {
        return this.f35255Oooo0o.OooOooO(i);
    }

    @Override // o0O0O00.o0O0O00
    @NotNull
    public final o000O000 Oooo000(long j) {
        if (this.f35257Oooo0oo == o0000O00.Width) {
            return new o0000Ooo(this.f35256Oooo0oO == o0000.Max ? this.f35255Oooo0o.OooOooO(o0000O0O.OooO0O0.OooO0oO(j)) : this.f35255Oooo0o.OooOoo(o0000O0O.OooO0O0.OooO0oO(j)), o0000O0O.OooO0O0.OooO0oO(j));
        }
        return new o0000Ooo(o0000O0O.OooO0O0.OooO0oo(j), this.f35256Oooo0oO == o0000.Max ? this.f35255Oooo0o.OooOOO(o0000O0O.OooO0O0.OooO0oo(j)) : this.f35255Oooo0o.OoooO(o0000O0O.OooO0O0.OooO0oo(j)));
    }

    @Override // o0O0O00.OooOOOO
    @Nullable
    public final Object Oooo0o() {
        return this.f35255Oooo0o.Oooo0o();
    }

    @Override // o0O0O00.OooOOOO
    public final int OoooO(int i) {
        return this.f35255Oooo0o.OoooO(i);
    }
}
