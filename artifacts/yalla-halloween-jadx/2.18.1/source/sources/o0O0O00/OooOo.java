package o0O0O00;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo implements o00000O0, o0000O0O.OooO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f35247Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000O0O.OooO f35248Oooo0oO;

    public OooOo(@NotNull o0000O0O.OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f35247Oooo0o = layoutDirection;
        this.f35248Oooo0oO = density;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OooO0o0(int i) {
        return this.f35248Oooo0oO.OooO0o0(i);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long OooOoOO(float f) {
        return this.f35248Oooo0oO.OooOoOO(f);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long OooOoo0(long j) {
        return this.f35248Oooo0oO.OooOoo0(j);
    }

    @Override // o0O0O00.o00000O0
    public final /* synthetic */ o000000O OooOooo(int i, int i2, Map map, Function1 function1) {
        return o00000.OooO00o(this, i, i2, map, function1);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOO0(float f) {
        return this.f35248Oooo0oO.OoooOO0(f);
    }

    @Override // o0000O0O.OooO
    public final float OoooOOo() {
        return this.f35248Oooo0oO.OoooOOo();
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOoo(float f) {
        return this.f35248Oooo0oO.OoooOoo(f);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OooooOO(long j) {
        return this.f35248Oooo0oO.OooooOO(j);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OoooooO(float f) {
        return this.f35248Oooo0oO.OoooooO(f);
    }

    @Override // o0000O0O.OooO
    public final float getDensity() {
        return this.f35248Oooo0oO.getDensity();
    }

    @Override // o0O0O00.OooOo00
    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.f35247Oooo0o;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long o00ooo(long j) {
        return this.f35248Oooo0oO.o00ooo(j);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float oo000o(long j) {
        return this.f35248Oooo0oO.oo000o(j);
    }
}
