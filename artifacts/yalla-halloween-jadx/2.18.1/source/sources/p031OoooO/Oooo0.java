package p031OoooO;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Immutable;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p145o00Oo0.o00000O0;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class Oooo0 implements OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f2590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f2591OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f2592OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f2593OooO0Oo;

    public Oooo0(long j, long j2, long j3, long j4) {
        this.f2590OooO00o = j;
        this.f2591OooO0O0 = j2;
        this.f2592OooO0OO = j3;
        this.f2593OooO0Oo = j4;
    }

    @Override // p031OoooO.OooO0O0
    @Composable
    @NotNull
    public final oO0Oo OooO00o(boolean z, @Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(-655254499);
        oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(new o00000O0(z ? this.f2590OooO00o : this.f2592OooO0OO), ooo00o);
        ooo00o.Oooo0o0();
        return oo0ooOooO0o;
    }

    @Override // p031OoooO.OooO0O0
    @Composable
    @NotNull
    public final oO0Oo OooO0O0(boolean z, @Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(-2133647540);
        oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(new o00000O0(z ? this.f2591OooO0O0 : this.f2593OooO0Oo), ooo00o);
        ooo00o.Oooo0o0();
        return oo0ooOooO0o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(Oooo0.class), Reflection.getOrCreateKotlinClass(obj.getClass()))) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return o00000O0.OooO0Oo(this.f2590OooO00o, oooo0.f2590OooO00o) && o00000O0.OooO0Oo(this.f2591OooO0O0, oooo0.f2591OooO0O0) && o00000O0.OooO0Oo(this.f2592OooO0OO, oooo0.f2592OooO0OO) && o00000O0.OooO0Oo(this.f2593OooO0Oo, oooo0.f2593OooO0Oo);
    }

    public final int hashCode() {
        long j = this.f2590OooO00o;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        return ULong.m686hashCodeimpl(this.f2593OooO0Oo) + ((ULong.m686hashCodeimpl(this.f2592OooO0OO) + ((ULong.m686hashCodeimpl(this.f2591OooO0O0) + (ULong.m686hashCodeimpl(j) * 31)) * 31)) * 31);
    }
}
