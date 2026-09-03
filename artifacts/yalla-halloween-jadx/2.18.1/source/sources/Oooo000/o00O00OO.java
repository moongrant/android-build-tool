package Oooo000;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o000O00 f934OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o00oOoo f935OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0Oo0oo f936OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o000O f937OooO0Oo;

    public o00O00OO() {
        this(null, null, null, null, 15);
    }

    public o00O00OO(@Nullable o000O00 o000o01, @Nullable o00oOoo o00oooo2, @Nullable o0Oo0oo o0oo0oo2, @Nullable o000O o000o) {
        this.f934OooO00o = o000o01;
        this.f935OooO0O0 = o00oooo2;
        this.f936OooO0OO = o0oo0oo2;
        this.f937OooO0Oo = o000o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O00OO)) {
            return false;
        }
        o00O00OO o00o00oo2 = (o00O00OO) obj;
        return Intrinsics.areEqual(this.f934OooO00o, o00o00oo2.f934OooO00o) && Intrinsics.areEqual(this.f935OooO0O0, o00o00oo2.f935OooO0O0) && Intrinsics.areEqual(this.f936OooO0OO, o00o00oo2.f936OooO0OO) && Intrinsics.areEqual(this.f937OooO0Oo, o00o00oo2.f937OooO0Oo);
    }

    public final int hashCode() {
        o000O00 o000o01 = this.f934OooO00o;
        int iHashCode = (o000o01 == null ? 0 : o000o01.hashCode()) * 31;
        o00oOoo o00oooo2 = this.f935OooO0O0;
        int iHashCode2 = (iHashCode + (o00oooo2 == null ? 0 : o00oooo2.hashCode())) * 31;
        o0Oo0oo o0oo0oo2 = this.f936OooO0OO;
        int iHashCode3 = (iHashCode2 + (o0oo0oo2 == null ? 0 : o0oo0oo2.hashCode())) * 31;
        o000O o000o = this.f937OooO0Oo;
        return iHashCode3 + (o000o != null ? o000o.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TransitionData(fade=");
        sbOooO0o0.append(this.f934OooO00o);
        sbOooO0o0.append(", slide=");
        sbOooO0o0.append(this.f935OooO0O0);
        sbOooO0o0.append(", changeSize=");
        sbOooO0o0.append(this.f936OooO0OO);
        sbOooO0o0.append(", scale=");
        sbOooO0o0.append(this.f937OooO0Oo);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public /* synthetic */ o00O00OO(o000O00 o000o01, o00oOoo o00oooo2, o0Oo0oo o0oo0oo2, o000O o000o, int i) {
        this((i & 1) != 0 ? null : o000o01, (i & 2) != 0 ? null : o00oooo2, (i & 4) != 0 ? null : o0oo0oo2, (i & 8) != 0 ? null : o000o);
    }
}
