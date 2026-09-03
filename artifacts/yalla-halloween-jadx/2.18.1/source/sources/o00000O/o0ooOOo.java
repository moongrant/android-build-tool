package o00000O;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o00000oO.o000OOo.OooO0O0 f26884OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f26885OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo f26886OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<OooO00o.OooO0O0<Oooo000>> f26887OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f26888OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f26889OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f26890OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0000O0O.OooO f26891OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f26892OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f26893OooOO0;

    public o0ooOOo(OooO00o oooO00o, oo0o0Oo oo0o0oo, List list, int i, boolean z, int i2, o0000O0O.OooO oooO, LayoutDirection layoutDirection, o00000oO.o000OOo.OooO0O0 oooO0O0, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.f26885OooO00o = oooO00o;
        this.f26886OooO0O0 = oo0o0oo;
        this.f26887OooO0OO = list;
        this.f26888OooO0Oo = i;
        this.f26890OooO0o0 = z;
        this.f26889OooO0o = i2;
        this.f26891OooO0oO = oooO;
        this.f26892OooO0oo = layoutDirection;
        this.f26884OooO = oooO0O0;
        this.f26893OooOO0 = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0ooOOo)) {
            return false;
        }
        o0ooOOo o0ooooo2 = (o0ooOOo) obj;
        if (Intrinsics.areEqual(this.f26885OooO00o, o0ooooo2.f26885OooO00o) && Intrinsics.areEqual(this.f26886OooO0O0, o0ooooo2.f26886OooO0O0) && Intrinsics.areEqual(this.f26887OooO0OO, o0ooooo2.f26887OooO0OO) && this.f26888OooO0Oo == o0ooooo2.f26888OooO0Oo && this.f26890OooO0o0 == o0ooooo2.f26890OooO0o0) {
            return (this.f26889OooO0o == o0ooooo2.f26889OooO0o) && Intrinsics.areEqual(this.f26891OooO0oO, o0ooooo2.f26891OooO0oO) && this.f26892OooO0oo == o0ooooo2.f26892OooO0oo && Intrinsics.areEqual(this.f26884OooO, o0ooooo2.f26884OooO) && o0000O0O.OooO0O0.OooO0O0(this.f26893OooOO0, o0ooooo2.f26893OooOO0);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f26884OooO.hashCode() + ((this.f26892OooO0oo.hashCode() + ((this.f26891OooO0oO.hashCode() + ((((((((this.f26887OooO0OO.hashCode() + ((this.f26886OooO0O0.hashCode() + (this.f26885OooO00o.hashCode() * 31)) * 31)) * 31) + this.f26888OooO0Oo) * 31) + (this.f26890OooO0o0 ? 1231 : 1237)) * 31) + this.f26889OooO0o) * 31)) * 31)) * 31)) * 31;
        long j = this.f26893OooOO0;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TextLayoutInput(text=");
        sbOooO0o0.append((Object) this.f26885OooO00o);
        sbOooO0o0.append(", style=");
        sbOooO0o0.append(this.f26886OooO0O0);
        sbOooO0o0.append(", placeholders=");
        sbOooO0o0.append(this.f26887OooO0OO);
        sbOooO0o0.append(", maxLines=");
        sbOooO0o0.append(this.f26888OooO0Oo);
        sbOooO0o0.append(", softWrap=");
        sbOooO0o0.append(this.f26890OooO0o0);
        sbOooO0o0.append(", overflow=");
        int i = this.f26889OooO0o;
        if (i == 1) {
            str = "Clip";
        } else {
            if (i == 2) {
                str = "Ellipsis";
            } else {
                str = i == 3 ? "Visible" : "Invalid";
            }
        }
        sbOooO0o0.append((Object) str);
        sbOooO0o0.append(", density=");
        sbOooO0o0.append(this.f26891OooO0oO);
        sbOooO0o0.append(", layoutDirection=");
        sbOooO0o0.append(this.f26892OooO0oo);
        sbOooO0o0.append(", fontFamilyResolver=");
        sbOooO0o0.append(this.f26884OooO);
        sbOooO0o0.append(", constraints=");
        sbOooO0o0.append((Object) o0000O0O.OooO0O0.OooOO0O(this.f26893OooOO0));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
