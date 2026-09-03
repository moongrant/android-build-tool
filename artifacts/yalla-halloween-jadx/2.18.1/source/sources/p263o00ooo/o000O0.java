package p263o00ooo;

import OooO00o.OooO00o;
import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import o0000O0O.OooOo;
import o0000O0O.o000oOoO;
import o0000O0O.o0OoOo0;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O;
import p145o00Oo0.o0000oo;
import p191o00o0O.o0OOO0o;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 extends o000OO0O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final long f34891OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final o0000oo f34892OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final long f34893OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f34894OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f34895OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public o00000O f34896OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final long f34897o000oOoO;

    public o000O0(o0000oo o0000ooVar) {
        int i;
        OooOo.OooO00o oooO00o = OooOo.f27310OooO0O0;
        long j = OooOo.f27311OooO0OO;
        long jOooO00o = o0OoOo0.OooO00o(o0000ooVar.getWidth(), o0000ooVar.getHeight());
        this.f34892OoooO0 = o0000ooVar;
        this.f34893OoooO0O = j;
        this.f34891OoooO = jOooO00o;
        this.f34894OoooOO0 = 1;
        OooOo.OooO00o oooO00o2 = OooOo.f27310OooO0O0;
        if (!(((int) (j >> 32)) >= 0 && OooOo.OooO0OO(j) >= 0 && (i = (int) (jOooO00o >> 32)) >= 0 && o000oOoO.OooO0O0(jOooO00o) >= 0 && i <= o0000ooVar.getWidth() && o000oOoO.OooO0O0(jOooO00o) <= o0000ooVar.getHeight())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f34897o000oOoO = jOooO00o;
        this.f34895OoooOOO = 1.0f;
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0OO(float f) {
        this.f34895OoooOOO = f;
        return true;
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0o0(@Nullable o00000O o00000o) {
        this.f34896OoooOOo = o00000o;
        return true;
    }

    @Override // p263o00ooo.o000OO0O
    public final long OooO0oo() {
        return o0OoOo0.OooO0O0(this.f34897o000oOoO);
    }

    @Override // p263o00ooo.o000OO0O
    public final void OooOO0(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        o0OOO0o.OooO0Oo(o0oo0oo2, this.f34892OoooO0, this.f34893OoooO0O, this.f34891OoooO, 0L, o0OoOo0.OooO00o(MathKt.roundToInt(OooOo00.OooO0Oo(o0oo0oo2.OooO0OO())), MathKt.roundToInt(OooOo00.OooO0O0(o0oo0oo2.OooO0OO()))), this.f34895OoooOOO, null, this.f34896OoooOOo, 0, this.f34894OoooOO0, 328, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O0)) {
            return false;
        }
        o000O0 o000o0 = (o000O0) obj;
        if (Intrinsics.areEqual(this.f34892OoooO0, o000o0.f34892OoooO0) && OooOo.OooO0O0(this.f34893OoooO0O, o000o0.f34893OoooO0O) && o000oOoO.OooO00o(this.f34891OoooO, o000o0.f34891OoooO)) {
            return this.f34894OoooOO0 == o000o0.f34894OoooOO0;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f34892OoooO0.hashCode() * 31;
        long j = this.f34893OoooO0O;
        OooOo.OooO00o oooO00o = OooOo.f27310OooO0O0;
        return ((o000oOoO.OooO0OO(this.f34891OoooO) + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + this.f34894OoooOO0;
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("BitmapPainter(image=");
        sbOooO0o0.append(this.f34892OoooO0);
        sbOooO0o0.append(", srcOffset=");
        sbOooO0o0.append((Object) OooOo.OooO0Oo(this.f34893OoooO0O));
        sbOooO0o0.append(", srcSize=");
        sbOooO0o0.append((Object) o000oOoO.OooO0Oo(this.f34891OoooO));
        sbOooO0o0.append(", filterQuality=");
        int i = this.f34894OoooOO0;
        if (i == 0) {
            str = "None";
        } else {
            if (i == 1) {
                str = "Low";
            } else {
                if (i == 2) {
                    str = "Medium";
                } else {
                    str = i == 3 ? "High" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                }
            }
        }
        sbOooO0o0.append((Object) str);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
