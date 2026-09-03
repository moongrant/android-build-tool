package o00000O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p053o00000oO.o0000;
import p053o00000oO.o0000O00;
import p053o00000oO.o0000Ooo;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000OO00;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f26899OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final oo0o0Oo f26900OooO0o0 = new oo0o0Oo(0, 0, null, null, null, 0, null, null, 0, 262143);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f26901OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo00 f26902OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0OoOo0 f26903OooO0OO;

    public static final class OooO00o {
    }

    public oo0o0Oo(@NotNull o00Oo0 spanStyle, @NotNull OooOo00 paragraphStyle, @ExperimentalTextApi @Nullable o0OoOo0 o0oooo1) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        this.f26901OooO00o = spanStyle;
        this.f26902OooO0O0 = paragraphStyle;
        this.f26903OooO0OO = o0oooo1;
    }

    public static oo0o0Oo OooO00o(oo0o0Oo oo0o0oo, p053o00000oO.o000OOo o000ooo2, o0000O0.OooO0o oooO0o, int i) {
        o0000O0.OooOOO0 oooO0O0;
        long jOooO0O0 = (i & 1) != 0 ? oo0o0oo.f26901OooO00o.OooO0O0() : 0L;
        long j = (i & 2) != 0 ? oo0o0oo.f26901OooO00o.f26860OooO0O0 : 0L;
        o0000O00 o0000o00 = (i & 4) != 0 ? oo0o0oo.f26901OooO00o.f26861OooO0OO : null;
        o0000Ooo o0000ooo = (i & 8) != 0 ? oo0o0oo.f26901OooO00o.f26862OooO0Oo : null;
        o0000 o0000Var = (i & 16) != 0 ? oo0o0oo.f26901OooO00o.f26864OooO0o0 : null;
        p053o00000oO.o000OOo o000ooo3 = (i & 32) != 0 ? oo0o0oo.f26901OooO00o.f26863OooO0o : o000ooo2;
        String str = (i & 64) != 0 ? oo0o0oo.f26901OooO00o.f26865OooO0oO : null;
        long j2 = (i & 128) != 0 ? oo0o0oo.f26901OooO00o.f26866OooO0oo : 0L;
        o0000O0.OooO00o oooO00o = (i & 256) != 0 ? oo0o0oo.f26901OooO00o.f26858OooO : null;
        o0000O0.OooOOO oooOOO = (i & 512) != 0 ? oo0o0oo.f26901OooO00o.f26867OooOO0 : null;
        o0000.OooO oooO = (i & 1024) != 0 ? oo0o0oo.f26901OooO00o.f26868OooOO0O : null;
        long j3 = (i & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0 ? oo0o0oo.f26901OooO00o.f26869OooOO0o : 0L;
        o0000O0.OooO oooO2 = (i & 4096) != 0 ? oo0o0oo.f26901OooO00o.f26871OooOOO0 : null;
        o000OO00 o000oo01 = (i & 8192) != 0 ? oo0o0oo.f26901OooO00o.f26870OooOOO : null;
        o0000O0.OooO0o oooO0o2 = (i & 16384) != 0 ? oo0o0oo.f26902OooO0O0.f26793OooO00o : oooO0o;
        o0000O0.OooOO0 oooOO1 = (32768 & i) != 0 ? oo0o0oo.f26902OooO0O0.f26794OooO0O0 : null;
        long j4 = (65536 & i) != 0 ? oo0o0oo.f26902OooO0O0.f26795OooO0OO : 0L;
        o0000O0.OooOOOO oooOOOO = (i & 131072) != 0 ? oo0o0oo.f26902OooO0O0.f26796OooO0Oo : null;
        if (o00000O0.OooO0Oo(jOooO0O0, oo0o0oo.f26901OooO00o.OooO0O0())) {
            oooO0O0 = oo0o0oo.f26901OooO00o.f26859OooO00o;
        } else {
            o00000O0.OooO00o oooO00o2 = o00000O0.f32063OooO0O0;
            oooO0O0 = (jOooO0O0 > o00000O0.f32062OooO ? 1 : (jOooO0O0 == o00000O0.f32062OooO ? 0 : -1)) != 0 ? new o0000O0.OooO0O0(jOooO0O0) : o0000O0.OooOOO0.OooO00o.f27268OooO00o;
        }
        o0000O0.OooOOO0 oooOOO0 = oooO0O0;
        Objects.requireNonNull(oo0o0oo.f26901OooO00o);
        o00Oo0 o00oo1 = new o00Oo0(oooOOO0, j, o0000o00, o0000ooo, o0000Var, o000ooo3, str, j2, oooO00o, oooOOO, oooO, j3, oooO2, o000oo01);
        OooOo00 oooOo00 = oo0o0oo.f26902OooO0O0;
        return new oo0o0Oo(o00oo1, new OooOo00(oooO0o2, oooOO1, j4, oooOOOO, oooOo00.f26798OooO0o0, oooOo00.f26797OooO0o), oo0o0oo.f26903OooO0OO);
    }

    @ExperimentalTextApi
    @Nullable
    public final p145o00Oo0.o0Oo0oo OooO0O0() {
        return this.f26901OooO00o.OooO00o();
    }

    public final long OooO0OO() {
        return this.f26901OooO00o.OooO0O0();
    }

    @Stable
    @NotNull
    public final oo0o0Oo OooO0Oo(@Nullable oo0o0Oo oo0o0oo) {
        return (oo0o0oo == null || Intrinsics.areEqual(oo0o0oo, f26900OooO0o0)) ? this : new oo0o0Oo(this.f26901OooO00o.OooO0Oo(oo0o0oo.f26901OooO00o), this.f26902OooO0O0.OooO00o(oo0o0oo.f26902OooO0O0));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0o0Oo)) {
            return false;
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
        return Intrinsics.areEqual(this.f26901OooO00o, oo0o0oo.f26901OooO00o) && Intrinsics.areEqual(this.f26902OooO0O0, oo0o0oo.f26902OooO0O0) && Intrinsics.areEqual(this.f26903OooO0OO, oo0o0oo.f26903OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = (this.f26902OooO0O0.hashCode() + (this.f26901OooO00o.hashCode() * 31)) * 31;
        o0OoOo0 o0oooo1 = this.f26903OooO0OO;
        return iHashCode + (o0oooo1 != null ? o0oooo1.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TextStyle(color=");
        sbOooO0o0.append((Object) o00000O0.OooOO0(OooO0OO()));
        sbOooO0o0.append(", brush=");
        sbOooO0o0.append(OooO0O0());
        sbOooO0o0.append(", fontSize=");
        sbOooO0o0.append((Object) o0000O0O.o00O0O.OooO0o0(this.f26901OooO00o.f26860OooO0O0));
        sbOooO0o0.append(", fontWeight=");
        sbOooO0o0.append(this.f26901OooO00o.f26861OooO0OO);
        sbOooO0o0.append(", fontStyle=");
        sbOooO0o0.append(this.f26901OooO00o.f26862OooO0Oo);
        sbOooO0o0.append(", fontSynthesis=");
        sbOooO0o0.append(this.f26901OooO00o.f26864OooO0o0);
        sbOooO0o0.append(", fontFamily=");
        sbOooO0o0.append(this.f26901OooO00o.f26863OooO0o);
        sbOooO0o0.append(", fontFeatureSettings=");
        sbOooO0o0.append(this.f26901OooO00o.f26865OooO0oO);
        sbOooO0o0.append(", letterSpacing=");
        sbOooO0o0.append((Object) o0000O0O.o00O0O.OooO0o0(this.f26901OooO00o.f26866OooO0oo));
        sbOooO0o0.append(", baselineShift=");
        sbOooO0o0.append(this.f26901OooO00o.f26858OooO);
        sbOooO0o0.append(", textGeometricTransform=");
        sbOooO0o0.append(this.f26901OooO00o.f26867OooOO0);
        sbOooO0o0.append(", localeList=");
        sbOooO0o0.append(this.f26901OooO00o.f26868OooOO0O);
        sbOooO0o0.append(", background=");
        sbOooO0o0.append((Object) o00000O0.OooOO0(this.f26901OooO00o.f26869OooOO0o));
        sbOooO0o0.append(", textDecoration=");
        sbOooO0o0.append(this.f26901OooO00o.f26871OooOOO0);
        sbOooO0o0.append(", shadow=");
        sbOooO0o0.append(this.f26901OooO00o.f26870OooOOO);
        sbOooO0o0.append(", textAlign=");
        sbOooO0o0.append(this.f26902OooO0O0.f26793OooO00o);
        sbOooO0o0.append(", textDirection=");
        sbOooO0o0.append(this.f26902OooO0O0.f26794OooO0O0);
        sbOooO0o0.append(", lineHeight=");
        sbOooO0o0.append((Object) o0000O0O.o00O0O.OooO0o0(this.f26902OooO0O0.f26795OooO0OO));
        sbOooO0o0.append(", textIndent=");
        sbOooO0o0.append(this.f26902OooO0O0.f26796OooO0Oo);
        sbOooO0o0.append(", platformStyle=");
        sbOooO0o0.append(this.f26903OooO0OO);
        sbOooO0o0.append("lineHeightStyle=");
        sbOooO0o0.append(this.f26902OooO0O0.f26797OooO0o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oo0o0Oo(@NotNull o00Oo0 spanStyle, @NotNull OooOo00 paragraphStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        Objects.requireNonNull(spanStyle);
        Oooo0 oooo0 = paragraphStyle.f26798OooO0o0;
        this(spanStyle, paragraphStyle, oooo0 == null ? null : new o0OoOo0(oooo0));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oo0o0Oo(long j, long j2, o0000O00 o0000o00, o0000Ooo o0000ooo, p053o00000oO.o000OOo o000ooo2, long j3, o0000O0.OooO oooO, o0000O0.OooO0o oooO0o, long j4, int i) {
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        if ((i & 1) != 0) {
            o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
            j5 = o00000O0.f32062OooO;
        } else {
            j5 = j;
        }
        if ((i & 2) != 0) {
            o0000O0O.o00O0O.OooO00o oooO00o2 = o0000O0O.o00O0O.f27323OooO0O0;
            j6 = o0000O0O.o00O0O.f27325OooO0Oo;
        } else {
            j6 = j2;
        }
        o0000O00 o0000o01 = (i & 4) != 0 ? null : o0000o00;
        o0000Ooo o0000ooo2 = (i & 8) != 0 ? null : o0000ooo;
        p053o00000oO.o000OOo o000ooo3 = (i & 32) != 0 ? null : o000ooo2;
        if ((i & 128) != 0) {
            o0000O0O.o00O0O.OooO00o oooO00o3 = o0000O0O.o00O0O.f27323OooO0O0;
            j7 = o0000O0O.o00O0O.f27325OooO0Oo;
        } else {
            j7 = j3;
        }
        if ((i & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0) {
            o00000O0.OooO00o oooO00o4 = o00000O0.f32063OooO0O0;
            j8 = o00000O0.f32062OooO;
        } else {
            j8 = 0;
        }
        o0000O0.OooO oooO2 = (i & 4096) != 0 ? null : oooO;
        o0000O0.OooO0o oooO0o2 = (i & 16384) != 0 ? null : oooO0o;
        if ((i & 65536) != 0) {
            o0000O0O.o00O0O.OooO00o oooO00o5 = o0000O0O.o00O0O.f27323OooO0O0;
            j9 = o0000O0O.o00O0O.f27325OooO0Oo;
        } else {
            j9 = j4;
        }
        this(new o00Oo0(j5, j6, o0000o01, o0000ooo2, null, o000ooo3, null, j7, null, null, null, j8, oooO2, null, null, null), new OooOo00(oooO0o2, null, j9, null, null, null), (o0OoOo0) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oo0o0Oo(long j, o0OoOo0 o0oooo1, int i) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6 = 0;
        if ((i & 1) != 0) {
            o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
            j2 = o00000O0.f32062OooO;
        } else {
            j2 = 0;
        }
        if ((i & 2) != 0) {
            o0000O0O.o00O0O.OooO00o oooO00o2 = o0000O0O.o00O0O.f27323OooO0O0;
            j3 = o0000O0O.o00O0O.f27325OooO0Oo;
        } else {
            j3 = 0;
        }
        if ((i & 128) != 0) {
            o0000O0O.o00O0O.OooO00o oooO00o3 = o0000O0O.o00O0O.f27323OooO0O0;
            j4 = o0000O0O.o00O0O.f27325OooO0Oo;
        } else {
            j4 = 0;
        }
        if ((i & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0) {
            o00000O0.OooO00o oooO00o4 = o00000O0.f32063OooO0O0;
            j6 = o00000O0.f32062OooO;
        }
        long j7 = j6;
        if ((65536 & i) != 0) {
            o0000O0O.o00O0O.OooO00o oooO00o5 = o0000O0O.o00O0O.f27323OooO0O0;
            j5 = o0000O0O.o00O0O.f27325OooO0Oo;
        } else {
            j5 = j;
        }
        o0OoOo0 o0oooo2 = (i & 262144) != 0 ? null : o0oooo1;
        this(new o00Oo0(j2, j3, null, null, null, null, null, j4, null, null, null, j7, null, null, null, null), new OooOo00(null, null, j5, null, o0oooo2 != null ? o0oooo2.f26883OooO00o : null, null), o0oooo2);
    }
}
