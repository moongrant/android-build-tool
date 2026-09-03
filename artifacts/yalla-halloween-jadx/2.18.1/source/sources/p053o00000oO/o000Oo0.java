package p053o00000oO;

import OooO00o.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o000OOo f27146OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0000O00 f27147OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f27148OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f27149OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Object f27150OooO0o0;

    public o000Oo0(o000OOo o000ooo2, o0000O00 o0000o00, int i, int i2, Object obj) {
        this.f27146OooO00o = o000ooo2;
        this.f27147OooO0O0 = o0000o00;
        this.f27148OooO0OO = i;
        this.f27149OooO0Oo = i2;
        this.f27150OooO0o0 = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000Oo0)) {
            return false;
        }
        o000Oo0 o000oo1 = (o000Oo0) obj;
        if (!Intrinsics.areEqual(this.f27146OooO00o, o000oo1.f27146OooO00o) || !Intrinsics.areEqual(this.f27147OooO0O0, o000oo1.f27147OooO0O0)) {
            return false;
        }
        if (this.f27148OooO0OO == o000oo1.f27148OooO0OO) {
            return (this.f27149OooO0Oo == o000oo1.f27149OooO0Oo) && Intrinsics.areEqual(this.f27150OooO0o0, o000oo1.f27150OooO0o0);
        }
        return false;
    }

    public final int hashCode() {
        o000OOo o000ooo2 = this.f27146OooO00o;
        int iHashCode = (((((((o000ooo2 == null ? 0 : o000ooo2.hashCode()) * 31) + this.f27147OooO0O0.f27133Oooo0o) * 31) + this.f27148OooO0OO) * 31) + this.f27149OooO0Oo) * 31;
        Object obj = this.f27150OooO0o0;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TypefaceRequest(fontFamily=");
        sbOooO0o0.append(this.f27146OooO00o);
        sbOooO0o0.append(", fontWeight=");
        sbOooO0o0.append(this.f27147OooO0O0);
        sbOooO0o0.append(", fontStyle=");
        sbOooO0o0.append((Object) o0000Ooo.OooO00o(this.f27148OooO0OO));
        sbOooO0o0.append(", fontSynthesis=");
        sbOooO0o0.append((Object) o0000.OooO00o(this.f27149OooO0Oo));
        sbOooO0o0.append(", resourceLoaderCacheKey=");
        return o0.OooO00o(sbOooO0o0, this.f27150OooO0o0, ')');
    }
}
