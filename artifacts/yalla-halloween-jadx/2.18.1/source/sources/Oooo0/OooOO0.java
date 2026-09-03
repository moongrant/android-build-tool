package Oooo0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public p145o00Oo0.o0000oo f497OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public p145o00Oo0.o0O0O00 f498OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public p191o00o0O.o00Oo0 f499OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public p145o00Oo0.o000O0o f500OooO0Oo;

    public OooOO0() {
        this(null, null, null, null, 15, null);
    }

    public OooOO0(p145o00Oo0.o0000oo o0000ooVar, p145o00Oo0.o0O0O00 o0o0o00, p191o00o0O.o00Oo0 o00oo1, p145o00Oo0.o000O0o o000o0o2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.f497OooO00o = null;
        this.f498OooO0O0 = null;
        this.f499OooO0OO = null;
        this.f500OooO0Oo = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0)) {
            return false;
        }
        OooOO0 oooOO1 = (OooOO0) obj;
        return Intrinsics.areEqual(this.f497OooO00o, oooOO1.f497OooO00o) && Intrinsics.areEqual(this.f498OooO0O0, oooOO1.f498OooO0O0) && Intrinsics.areEqual(this.f499OooO0OO, oooOO1.f499OooO0OO) && Intrinsics.areEqual(this.f500OooO0Oo, oooOO1.f500OooO0Oo);
    }

    public final int hashCode() {
        p145o00Oo0.o0000oo o0000ooVar = this.f497OooO00o;
        int iHashCode = (o0000ooVar == null ? 0 : o0000ooVar.hashCode()) * 31;
        p145o00Oo0.o0O0O00 o0o0o00 = this.f498OooO0O0;
        int iHashCode2 = (iHashCode + (o0o0o00 == null ? 0 : o0o0o00.hashCode())) * 31;
        p191o00o0O.o00Oo0 o00oo1 = this.f499OooO0OO;
        int iHashCode3 = (iHashCode2 + (o00oo1 == null ? 0 : o00oo1.hashCode())) * 31;
        p145o00Oo0.o000O0o o000o0o2 = this.f500OooO0Oo;
        return iHashCode3 + (o000o0o2 != null ? o000o0o2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("BorderCache(imageBitmap=");
        sbOooO0o0.append(this.f497OooO00o);
        sbOooO0o0.append(", canvas=");
        sbOooO0o0.append(this.f498OooO0O0);
        sbOooO0o0.append(", canvasDrawScope=");
        sbOooO0o0.append(this.f499OooO0OO);
        sbOooO0o0.append(", borderPath=");
        sbOooO0o0.append(this.f500OooO0Oo);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
