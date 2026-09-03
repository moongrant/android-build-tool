package o0O0O00;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements o0O0O00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final OooOOOO f35244Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final IntrinsicMinMax f35245Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final IntrinsicWidthHeight f35246Oooo0oo;

    public OooOO0O(@NotNull OooOOOO measurable, @NotNull IntrinsicMinMax minMax, @NotNull IntrinsicWidthHeight widthHeight) {
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        this.f35244Oooo0o = measurable;
        this.f35245Oooo0oO = minMax;
        this.f35246Oooo0oo = widthHeight;
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOOO(int i) {
        return this.f35244Oooo0o.OooOOO(i);
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOoo(int i) {
        return this.f35244Oooo0o.OooOoo(i);
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOooO(int i) {
        return this.f35244Oooo0o.OooOooO(i);
    }

    @Override // o0O0O00.o0O0O00
    @NotNull
    public final o000O000 Oooo000(long j) {
        if (this.f35246Oooo0oo == IntrinsicWidthHeight.Width) {
            return new OooOOO0(this.f35245Oooo0oO == IntrinsicMinMax.Max ? this.f35244Oooo0o.OooOooO(o0000O0O.OooO0O0.OooO0oO(j)) : this.f35244Oooo0o.OooOoo(o0000O0O.OooO0O0.OooO0oO(j)), o0000O0O.OooO0O0.OooO0oO(j));
        }
        return new OooOOO0(o0000O0O.OooO0O0.OooO0oo(j), this.f35245Oooo0oO == IntrinsicMinMax.Max ? this.f35244Oooo0o.OooOOO(o0000O0O.OooO0O0.OooO0oo(j)) : this.f35244Oooo0o.OoooO(o0000O0O.OooO0O0.OooO0oo(j)));
    }

    @Override // o0O0O00.OooOOOO
    @Nullable
    public final Object Oooo0o() {
        return this.f35244Oooo0o.Oooo0o();
    }

    @Override // o0O0O00.OooOOOO
    public final int OoooO(int i) {
        return this.f35244Oooo0o.OoooO(i);
    }
}
