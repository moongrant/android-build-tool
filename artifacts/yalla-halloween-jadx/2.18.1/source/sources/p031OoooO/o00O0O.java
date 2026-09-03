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
public final class o00O0O implements o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f2864OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f2865OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f2866OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f2867OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f2868OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f2869OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f2870OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f2871OooO0oo;

    public o00O0O(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f2864OooO00o = j;
        this.f2865OooO0O0 = j2;
        this.f2866OooO0OO = j3;
        this.f2867OooO0Oo = j4;
        this.f2869OooO0o0 = j5;
        this.f2868OooO0o = j6;
        this.f2870OooO0oO = j7;
        this.f2871OooO0oo = j8;
    }

    @Override // p031OoooO.o000O000
    @Composable
    @NotNull
    public final oO0Oo OooO00o(boolean z, boolean z2, @Nullable oOO00O ooo00o) {
        long j;
        ooo00o.OooO0o0(-1176343362);
        if (z) {
            j = z2 ? this.f2865OooO0O0 : this.f2867OooO0Oo;
        } else {
            j = z2 ? this.f2868OooO0o : this.f2871OooO0oo;
        }
        oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(new o00000O0(j), ooo00o);
        ooo00o.Oooo0o0();
        return oo0ooOooO0o;
    }

    @Override // p031OoooO.o000O000
    @Composable
    @NotNull
    public final oO0Oo OooO0O0(boolean z, boolean z2, @Nullable oOO00O ooo00o) {
        long j;
        ooo00o.OooO0o0(-66424183);
        if (z) {
            j = z2 ? this.f2864OooO00o : this.f2866OooO0OO;
        } else {
            j = z2 ? this.f2869OooO0o0 : this.f2870OooO0oO;
        }
        oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(new o00000O0(j), ooo00o);
        ooo00o.Oooo0o0();
        return oo0ooOooO0o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(o00O0O.class), Reflection.getOrCreateKotlinClass(obj.getClass()))) {
            return false;
        }
        o00O0O o00o0o2 = (o00O0O) obj;
        return o00000O0.OooO0Oo(this.f2864OooO00o, o00o0o2.f2864OooO00o) && o00000O0.OooO0Oo(this.f2865OooO0O0, o00o0o2.f2865OooO0O0) && o00000O0.OooO0Oo(this.f2866OooO0OO, o00o0o2.f2866OooO0OO) && o00000O0.OooO0Oo(this.f2867OooO0Oo, o00o0o2.f2867OooO0Oo) && o00000O0.OooO0Oo(this.f2869OooO0o0, o00o0o2.f2869OooO0o0) && o00000O0.OooO0Oo(this.f2868OooO0o, o00o0o2.f2868OooO0o) && o00000O0.OooO0Oo(this.f2870OooO0oO, o00o0o2.f2870OooO0oO) && o00000O0.OooO0Oo(this.f2871OooO0oo, o00o0o2.f2871OooO0oo);
    }

    public final int hashCode() {
        long j = this.f2864OooO00o;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        return ULong.m686hashCodeimpl(this.f2871OooO0oo) + ((ULong.m686hashCodeimpl(this.f2870OooO0oO) + ((ULong.m686hashCodeimpl(this.f2868OooO0o) + ((ULong.m686hashCodeimpl(this.f2869OooO0o0) + ((ULong.m686hashCodeimpl(this.f2867OooO0Oo) + ((ULong.m686hashCodeimpl(this.f2866OooO0OO) + ((ULong.m686hashCodeimpl(this.f2865OooO0O0) + (ULong.m686hashCodeimpl(j) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
