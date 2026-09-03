package p028Oooo0o0;

import OooO00o.OooO00o;
import Oooo000.o000O00O;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o0O00O implements o0O00O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f2125OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f2126OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f2127OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f2128OooO0Oo;

    public o0O00O(float f, float f2, float f3, float f4) {
        this.f2125OooO00o = f;
        this.f2126OooO0O0 = f2;
        this.f2127OooO0OO = f3;
        this.f2128OooO0Oo = f4;
    }

    @Override // p028Oooo0o0.o0O00O0o
    public final float OooO00o() {
        return this.f2128OooO0Oo;
    }

    @Override // p028Oooo0o0.o0O00O0o
    public final float OooO0O0(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.f2125OooO00o : this.f2127OooO0OO;
    }

    @Override // p028Oooo0o0.o0O00O0o
    public final float OooO0OO(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.f2127OooO0OO : this.f2125OooO00o;
    }

    @Override // p028Oooo0o0.o0O00O0o
    public final float OooO0Oo() {
        return this.f2126OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o0O00O)) {
            return false;
        }
        o0O00O o0o00o2 = (o0O00O) obj;
        return OooOOO0.OooO00o(this.f2125OooO00o, o0o00o2.f2125OooO00o) && OooOOO0.OooO00o(this.f2126OooO0O0, o0o00o2.f2126OooO0O0) && OooOOO0.OooO00o(this.f2127OooO0OO, o0o00o2.f2127OooO0OO) && OooOOO0.OooO00o(this.f2128OooO0Oo, o0o00o2.f2128OooO0Oo);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2128OooO0Oo) + o000O00O.OooO00o(this.f2127OooO0OO, o000O00O.OooO00o(this.f2126OooO0O0, Float.floatToIntBits(this.f2125OooO00o) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("PaddingValues(start=");
        sbOooO0o0.append((Object) OooOOO0.OooO0O0(this.f2125OooO00o));
        sbOooO0o0.append(", top=");
        sbOooO0o0.append((Object) OooOOO0.OooO0O0(this.f2126OooO0O0));
        sbOooO0o0.append(", end=");
        sbOooO0o0.append((Object) OooOOO0.OooO0O0(this.f2127OooO0OO));
        sbOooO0o0.append(", bottom=");
        sbOooO0o0.append((Object) OooOOO0.OooO0O0(this.f2128OooO0Oo));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
