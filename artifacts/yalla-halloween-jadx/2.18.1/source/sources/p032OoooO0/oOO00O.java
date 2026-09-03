package p032OoooO0;

import androidx.compose.foundation.text.InternalFoundationTextApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o00000O.OooO;
import o00000O.OooO00o;
import o00000O.OooO0o;
import o00000O.Oooo000;
import o00000O.o0O0O00;
import o00000O.o0OOO0o;
import o00000O.o0ooOOo;
import o00000O.oo0o0Oo;
import o0000O0O.OooO0O0;
import o0000O0O.OooO0OO;
import o0000O0O.o0OoOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p053o00000oO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
@Stable
@InternalFoundationTextApi
public final class oOO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO f3389OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f3390OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo f3391OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3392OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f3393OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0000O0O.OooO f3394OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f3395OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o000OOo.OooO0O0 f3396OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final List<OooO00o.OooO0O0<Oooo000>> f3397OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public LayoutDirection f3398OooOO0;

    public oOO00O(OooO00o oooO00o, oo0o0Oo oo0o0oo, int i, boolean z, int i2, o0000O0O.OooO oooO, o000OOo.OooO0O0 oooO0O0, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this.f3390OooO00o = oooO00o;
        this.f3391OooO0O0 = oo0o0oo;
        this.f3392OooO0OO = i;
        this.f3393OooO0Oo = z;
        this.f3395OooO0o0 = i2;
        this.f3394OooO0o = oooO;
        this.f3396OooO0oO = oooO0O0;
        this.f3397OooO0oo = list;
        if (!(i > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int OooO00o() {
        return (int) Math.ceil(OooO0O0().OooO0OO());
    }

    public final OooO OooO0O0() {
        OooO oooO = this.f3389OooO;
        if (oooO != null) {
            return oooO;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Code duplicated, block: B:79:0x016b  */
    @NotNull
    public final o0OOO0o OooO0OO(long j, @NotNull LayoutDirection layoutDirection, @Nullable o0OOO0o canReuse) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (canReuse != null) {
            OooO00o text = this.f3390OooO00o;
            oo0o0Oo other = this.f3391OooO0O0;
            List<OooO00o.OooO0O0<Oooo000>> placeholders = this.f3397OooO0oo;
            int i = this.f3392OooO0OO;
            boolean z4 = this.f3393OooO0Oo;
            int i2 = this.f3395OooO0o0;
            o0000O0O.OooO density = this.f3394OooO0o;
            o000OOo.OooO0O0 fontFamilyResolver = this.f3396OooO0oO;
            Intrinsics.checkNotNullParameter(canReuse, "$this$canReuse");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(other, "style");
            Intrinsics.checkNotNullParameter(placeholders, "placeholders");
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
            o0ooOOo o0ooooo2 = canReuse.f26877OooO00o;
            if (!canReuse.f26878OooO0O0.f26773OooO00o.OooO00o() && Intrinsics.areEqual(o0ooooo2.f26885OooO00o, text)) {
                oo0o0Oo oo0o0oo = o0ooooo2.f26886OooO0O0;
                Objects.requireNonNull(oo0o0oo);
                Intrinsics.checkNotNullParameter(other, "other");
                if ((oo0o0oo == other || (Intrinsics.areEqual(oo0o0oo.f26902OooO0O0, other.f26902OooO0O0) && oo0o0oo.f26901OooO00o.OooO0OO(other.f26901OooO00o))) && Intrinsics.areEqual(o0ooooo2.f26887OooO0OO, placeholders) && o0ooooo2.f26888OooO0Oo == i && o0ooooo2.f26890OooO0o0 == z4) {
                    if (!(o0ooooo2.f26889OooO0o == i2) || !Intrinsics.areEqual(o0ooooo2.f26891OooO0oO, density) || o0ooooo2.f26892OooO0oo != layoutDirection || !Intrinsics.areEqual(o0ooooo2.f26884OooO, fontFamilyResolver) || OooO0O0.OooOO0(j) != OooO0O0.OooOO0(o0ooooo2.f26893OooOO0)) {
                        z3 = false;
                    } else if (!z4) {
                        if (i2 == 2) {
                            if (OooO0O0.OooO0oo(j) == OooO0O0.OooO0oo(o0ooooo2.f26893OooOO0)) {
                            }
                            z3 = false;
                        }
                        z3 = true;
                    } else if (OooO0O0.OooO0oo(j) == OooO0O0.OooO0oo(o0ooooo2.f26893OooOO0) || OooO0O0.OooO0oO(j) != OooO0O0.OooO0oO(o0ooooo2.f26893OooOO0)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (z3) {
                o0ooOOo o0ooooo3 = canReuse.f26877OooO00o;
                o0ooOOo layoutInput = new o0ooOOo(o0ooooo3.f26885OooO00o, this.f3391OooO0O0, o0ooooo3.f26887OooO0OO, o0ooooo3.f26888OooO0Oo, o0ooooo3.f26890OooO0o0, o0ooooo3.f26889OooO0o, o0ooooo3.f26891OooO0oO, o0ooooo3.f26892OooO0oo, o0ooooo3.f26884OooO, j, null);
                long jOooO0OO = OooO0OO.OooO0OO(j, o0OoOo0.OooO00o((int) Math.ceil(canReuse.f26878OooO0O0.f26776OooO0Oo), (int) Math.ceil(canReuse.f26878OooO0O0.f26778OooO0o0)));
                Intrinsics.checkNotNullParameter(layoutInput, "layoutInput");
                return new o0OOO0o(layoutInput, canReuse.f26878OooO0O0, jOooO0OO);
            }
        }
        OooO0Oo(layoutDirection);
        int iOooOO0 = OooO0O0.OooOO0(j);
        if (this.f3393OooO0Oo) {
            z = true;
        } else {
            if (this.f3395OooO0o0 == 2) {
                z = true;
            } else {
                z = false;
            }
        }
        int iOooO0oo = (z && OooO0O0.OooO0Oo(j)) ? OooO0O0.OooO0oo(j) : Integer.MAX_VALUE;
        if (this.f3393OooO0Oo) {
            z2 = false;
        } else {
            if (this.f3395OooO0o0 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        int i3 = z2 ? 1 : this.f3392OooO0OO;
        if (iOooOO0 != iOooO0oo) {
            iOooO0oo = RangesKt.coerceIn(OooO00o(), iOooOO0, iOooO0oo);
        }
        OooO0o oooO0o = new OooO0o(OooO0O0(), OooO0OO.OooO0O0(iOooO0oo, OooO0O0.OooO0oO(j), 5), i3, this.f3395OooO0o0 == 2);
        return new o0OOO0o(new o0ooOOo(this.f3390OooO00o, this.f3391OooO0O0, this.f3397OooO0oo, this.f3392OooO0OO, this.f3393OooO0Oo, this.f3395OooO0o0, this.f3394OooO0o, layoutDirection, this.f3396OooO0oO, j, null), oooO0o, OooO0OO.OooO0OO(j, o0OoOo0.OooO00o((int) Math.ceil(oooO0o.f26776OooO0Oo), (int) Math.ceil(oooO0o.f26778OooO0o0))));
    }

    public final void OooO0Oo(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        OooO oooO = this.f3389OooO;
        if (oooO == null || layoutDirection != this.f3398OooOO0 || oooO.OooO00o()) {
            this.f3398OooOO0 = layoutDirection;
            oooO = new OooO(this.f3390OooO00o, o0O0O00.OooO00o(this.f3391OooO0O0, layoutDirection), this.f3397OooO0oo, this.f3394OooO0o, this.f3396OooO0oO);
        }
        this.f3389OooO = oooO;
    }

    public /* synthetic */ oOO00O(OooO00o oooO00o, oo0o0Oo oo0o0oo, int i, boolean z, int i2, o0000O0O.OooO oooO, o000OOo.OooO0O0 oooO0O0, int i3) {
        this(oooO00o, oo0o0oo, (i3 & 4) != 0 ? Integer.MAX_VALUE : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? 1 : i2, oooO, oooO0O0, (i3 & 128) != 0 ? CollectionsKt.emptyList() : null, null);
    }
}
