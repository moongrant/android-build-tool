package p034OoooO0O;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o00000O.OooO00o;
import o00000O.o0OO00O;
import o00000O.o0OOO0o;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032OoooO0.o00oOoo;
import p034OoooO0O.o0OoOo0;
import p042Ooooo0o.o000O0O0;
import p054o00000oo.o00O0O00;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0OoOo0<T extends o0OoOo0<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f3560OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f3561OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0OOO0o f3562OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00O0O00 f3563OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f3564OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o000O000 f3565OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public OooO00o f3566OooO0oO;

    public o0OoOo0(OooO00o oooO00o, long j, o0OOO0o o0ooo0o2, o00O0O00 o00o0o01, o000O000 o000o001) {
        this.f3560OooO00o = oooO00o;
        this.f3561OooO0O0 = j;
        this.f3562OooO0OO = o0ooo0o2;
        this.f3563OooO0Oo = o00o0o01;
        this.f3565OooO0o0 = o000o001;
        this.f3564OooO0o = j;
        this.f3566OooO0oO = oooO00o;
    }

    @NotNull
    public final T OooO() {
        o0OOO0o o0ooo0o2;
        if ((this.f3566OooO0oO.f26756Oooo0o.length() > 0) && (o0ooo0o2 = this.f3562OooO0OO) != null) {
            OooOoo0(OooO0oo(o0ooo0o2, 1));
        }
        return this;
    }

    @Nullable
    public final Integer OooO00o() {
        o0OOO0o o0ooo0o2 = this.f3562OooO0OO;
        if (o0ooo0o2 == null) {
            return null;
        }
        return Integer.valueOf(this.f3563OooO0Oo.OooO00o(o0ooo0o2.OooO0o(o0ooo0o2.OooO0oO(this.f3563OooO0Oo.OooO0O0(o0OO00O.OooO0o(this.f3564OooO0o))), true)));
    }

    @Nullable
    public final Integer OooO0O0() {
        o0OOO0o o0ooo0o2 = this.f3562OooO0OO;
        if (o0ooo0o2 == null) {
            return null;
        }
        return Integer.valueOf(this.f3563OooO0Oo.OooO00o(o0ooo0o2.OooOO0O(o0ooo0o2.OooO0oO(this.f3563OooO0Oo.OooO0O0(o0OO00O.OooO0oO(this.f3564OooO0o))))));
    }

    public final int OooO0OO() {
        String str = this.f3566OooO0oO.f26756Oooo0o;
        int iOooO0Oo = o0OO00O.OooO0Oo(this.f3564OooO0o);
        Intrinsics.checkNotNullParameter(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(iOooO0Oo);
    }

    public final int OooO0Oo(o0OOO0o o0ooo0o2, int i) {
        if (i >= this.f3560OooO00o.length()) {
            return this.f3560OooO00o.length();
        }
        long jOooOOOO = o0ooo0o2.OooOOOO(RangesKt.coerceAtMost(i, this.f3566OooO0oO.f26756Oooo0o.length() - 1));
        return o0OO00O.OooO0Oo(jOooOOOO) <= i ? OooO0Oo(o0ooo0o2, i + 1) : this.f3563OooO0Oo.OooO00o(o0OO00O.OooO0Oo(jOooOOOO));
    }

    public final int OooO0o(o0OOO0o o0ooo0o2, int i) {
        if (i < 0) {
            return 0;
        }
        int iOooOOOO = (int) (o0ooo0o2.OooOOOO(RangesKt.coerceAtMost(i, this.f3566OooO0oO.f26756Oooo0o.length() - 1)) >> 32);
        return iOooOOOO >= i ? OooO0o(o0ooo0o2, i - 1) : this.f3563OooO0Oo.OooO00o(iOooOOOO);
    }

    public final int OooO0o0() {
        String str = this.f3566OooO0oO.f26756Oooo0o;
        int iOooO0Oo = o0OO00O.OooO0Oo(this.f3564OooO0o);
        Intrinsics.checkNotNullParameter(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(iOooO0Oo);
    }

    public final boolean OooO0oO() {
        o0OOO0o o0ooo0o2 = this.f3562OooO0OO;
        return (o0ooo0o2 != null ? o0ooo0o2.OooOOO(o0OO00O.OooO0Oo(this.f3564OooO0o)) : null) != ResolvedTextDirection.Rtl;
    }

    public final int OooO0oo(o0OOO0o o0ooo0o2, int i) {
        int iOooOoo = OooOoo();
        o000O000 o000o001 = this.f3565OooO0o0;
        if (o000o001.f3530OooO00o == null) {
            o000o001.f3530OooO00o = Float.valueOf(o0ooo0o2.OooO0OO(iOooOoo).f30404OooO00o);
        }
        int iOooO0oO = o0ooo0o2.OooO0oO(iOooOoo) + i;
        if (iOooO0oO < 0) {
            return 0;
        }
        if (iOooO0oO >= o0ooo0o2.f26878OooO0O0.f26777OooO0o) {
            return this.f3566OooO0oO.f26756Oooo0o.length();
        }
        float fOooO0o0 = o0ooo0o2.OooO0o0(iOooO0oO) - 1;
        Float f = this.f3565OooO0o0.f3530OooO00o;
        Intrinsics.checkNotNull(f);
        float fFloatValue = f.floatValue();
        if ((OooO0oO() && fFloatValue >= o0ooo0o2.OooOO0(iOooO0oO)) || (!OooO0oO() && fFloatValue <= o0ooo0o2.OooO(iOooO0oO))) {
            return o0ooo0o2.OooO0o(iOooO0oO, true);
        }
        return this.f3563OooO0Oo.OooO00o(o0ooo0o2.OooOOO0(OooOO0.OooO00o(f.floatValue(), fOooO0o0)));
    }

    @NotNull
    public final T OooOO0() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            if (OooO0oO()) {
                OooOOOO();
            } else {
                OooOO0o();
            }
        }
        return this;
    }

    @NotNull
    public final T OooOO0O() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            if (OooO0oO()) {
                OooOOo0();
            } else {
                OooOOO();
            }
        }
        return this;
    }

    public final T OooOO0o() {
        int iOooO0OO;
        this.f3565OooO0o0.f3530OooO00o = null;
        if ((this.f3566OooO0oO.f26756Oooo0o.length() > 0) && (iOooO0OO = OooO0OO()) != -1) {
            OooOoo0(iOooO0OO);
        }
        return this;
    }

    public final T OooOOO() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            o0OOO0o o0ooo0o2 = this.f3562OooO0OO;
            Integer numValueOf = o0ooo0o2 != null ? Integer.valueOf(OooO0Oo(o0ooo0o2, OooOoo())) : null;
            if (numValueOf != null) {
                OooOoo0(numValueOf.intValue());
            }
        }
        return this;
    }

    @NotNull
    public final T OooOOO0() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            OooOoo0(o00oOoo.OooO00o(this.f3566OooO0oO.f26756Oooo0o, o0OO00O.OooO0o(this.f3564OooO0o)));
        }
        return this;
    }

    public final T OooOOOO() {
        int iOooO0o0;
        this.f3565OooO0o0.f3530OooO00o = null;
        if ((this.f3566OooO0oO.f26756Oooo0o.length() > 0) && (iOooO0o0 = OooO0o0()) != -1) {
            OooOoo0(iOooO0o0);
        }
        return this;
    }

    @NotNull
    public final T OooOOOo() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            OooOoo0(o00oOoo.OooO0O0(this.f3566OooO0oO.f26756Oooo0o, o0OO00O.OooO0oO(this.f3564OooO0o)));
        }
        return this;
    }

    @NotNull
    public final T OooOOo() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            if (OooO0oO()) {
                OooOO0o();
            } else {
                OooOOOO();
            }
        }
        return this;
    }

    public final T OooOOo0() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            o0OOO0o o0ooo0o2 = this.f3562OooO0OO;
            Integer numValueOf = o0ooo0o2 != null ? Integer.valueOf(OooO0o(o0ooo0o2, OooOoo())) : null;
            if (numValueOf != null) {
                OooOoo0(numValueOf.intValue());
            }
        }
        return this;
    }

    @NotNull
    public final T OooOOoo() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            if (OooO0oO()) {
                OooOOO();
            } else {
                OooOOo0();
            }
        }
        return this;
    }

    @NotNull
    public final T OooOo() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            if (OooO0oO()) {
                OooOo0O();
            } else {
                OooOoO0();
            }
        }
        return this;
    }

    @NotNull
    public final T OooOo0() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            OooOoo0(0);
        }
        return this;
    }

    @NotNull
    public final T OooOo00() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            OooOoo0(this.f3566OooO0oO.f26756Oooo0o.length());
        }
        return this;
    }

    @NotNull
    public final T OooOo0O() {
        Integer numOooO00o;
        this.f3565OooO0o0.f3530OooO00o = null;
        if ((this.f3566OooO0oO.f26756Oooo0o.length() > 0) && (numOooO00o = OooO00o()) != null) {
            OooOoo0(numOooO00o.intValue());
        }
        return this;
    }

    @NotNull
    public final T OooOo0o() {
        this.f3565OooO0o0.f3530OooO00o = null;
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            if (OooO0oO()) {
                OooOoO0();
            } else {
                OooOo0O();
            }
        }
        return this;
    }

    @NotNull
    public final T OooOoO() {
        o0OOO0o o0ooo0o2;
        if ((this.f3566OooO0oO.f26756Oooo0o.length() > 0) && (o0ooo0o2 = this.f3562OooO0OO) != null) {
            OooOoo0(OooO0oo(o0ooo0o2, -1));
        }
        return this;
    }

    @NotNull
    public final T OooOoO0() {
        Integer numOooO0O0;
        this.f3565OooO0o0.f3530OooO00o = null;
        if ((this.f3566OooO0oO.f26756Oooo0o.length() > 0) && (numOooO0O0 = OooO0O0()) != null) {
            OooOoo0(numOooO0O0.intValue());
        }
        return this;
    }

    @NotNull
    public final T OooOoOO() {
        if (this.f3566OooO0oO.f26756Oooo0o.length() > 0) {
            long j = this.f3561OooO0O0;
            o0OO00O.OooO00o oooO00o = o0OO00O.f26874OooO0O0;
            this.f3564OooO0o = o000O0O0.OooO00o((int) (j >> 32), o0OO00O.OooO0Oo(this.f3564OooO0o));
        }
        return this;
    }

    public final int OooOoo() {
        return this.f3563OooO0Oo.OooO0O0(o0OO00O.OooO0Oo(this.f3564OooO0o));
    }

    public final void OooOoo0(int i) {
        this.f3564OooO0o = o000O0O0.OooO00o(i, i);
    }
}
