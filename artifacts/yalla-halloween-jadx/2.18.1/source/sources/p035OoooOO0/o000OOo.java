package p035OoooOO0;

import Oooo0.o00O0000;
import Oooo0.o0O0ooO;
import Oooo000.o000O00O;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026Oooo0OO.o0000OO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p145o00Oo0.o00000O0;

/* JADX INFO: loaded from: classes.dex */
@Stable
public abstract class o000OOo implements o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f3632OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f3633OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o00000O0> f3634OooO0OO;

    public o000OOo(boolean z, float f, oO0Oo oo0oo, DefaultConstructorMarker defaultConstructorMarker) {
        this.f3632OooO00o = z;
        this.f3633OooO0O0 = f;
        this.f3634OooO0OO = oo0oo;
    }

    @Override // Oooo0.o00O0000
    @Composable
    @NotNull
    public final o0O0ooO OooO00o(@NotNull o0000OO0 interactionSource, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        ooo00o.OooO0o0(988743187);
        o0000oo o0000ooVar = (o0000oo) ooo00o.OooOO0o(o0000O0.f3611OooO00o);
        ooo00o.OooO0o0(-1524341038);
        long j = this.f3634OooO0OO.getValue().f32070OooO00o;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        long jOooO00o = (j > o00000O0.f32062OooO ? 1 : (j == o00000O0.f32062OooO ? 0 : -1)) != 0 ? this.f3634OooO0OO.getValue().f32070OooO00o : o0000ooVar.OooO00o(ooo00o);
        ooo00o.Oooo0o0();
        o0000 o0000VarOooO0O0 = OooO0O0(interactionSource, this.f3632OooO00o, this.f3633OooO0O0, o0OOO00.OooO0o(new o00000O0(jOooO00o), ooo00o), o0OOO00.OooO0o(o0000ooVar.OooO0O0(ooo00o), ooo00o), ooo00o);
        o00Oo00.OooO0Oo(o0000VarOooO0O0, interactionSource, new o0O0O00(interactionSource, o0000VarOooO0O0, null), ooo00o);
        ooo00o.Oooo0o0();
        return o0000VarOooO0O0;
    }

    @Composable
    @NotNull
    public abstract o0000 OooO0O0(@NotNull o0000OO0 o0000oo1, boolean z, float f, @NotNull oO0Oo oo0oo, @NotNull oO0Oo oo0oo2, @Nullable oOO00O ooo00o);

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000OOo)) {
            return false;
        }
        o000OOo o000ooo2 = (o000OOo) obj;
        return this.f3632OooO00o == o000ooo2.f3632OooO00o && OooOOO0.OooO00o(this.f3633OooO0O0, o000ooo2.f3633OooO0O0) && Intrinsics.areEqual(this.f3634OooO0OO, o000ooo2.f3634OooO0OO);
    }

    public final int hashCode() {
        return this.f3634OooO0OO.hashCode() + o000O00O.OooO00o(this.f3633OooO0O0, (this.f3632OooO00o ? 1231 : 1237) * 31, 31);
    }
}
