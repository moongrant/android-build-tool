package p032OoooO0;

import androidx.compose.runtime.Immutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p054o00000oo.o00O0;
import p054o00000oo.o00O000o;
import p054o00000oo.oo00o;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3036OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f3037OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3038OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f3039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f3035OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o000O0 f3034OooO0o = new o000O0(0, 15);

    public static final class OooO00o {
    }

    public o000O0(int i, int i2) {
        boolean z = (i2 & 2) != 0;
        i = (i2 & 4) != 0 ? 1 : i;
        int i3 = (i2 & 8) == 0 ? 0 : 1;
        this.f3036OooO00o = 0;
        this.f3037OooO0O0 = z;
        this.f3038OooO0OO = i;
        this.f3039OooO0Oo = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O0)) {
            return false;
        }
        o000O0 o000o0 = (o000O0) obj;
        if (!(this.f3036OooO00o == o000o0.f3036OooO00o) || this.f3037OooO0O0 != o000o0.f3037OooO0O0) {
            return false;
        }
        if (this.f3038OooO0OO == o000o0.f3038OooO0OO) {
            return this.f3039OooO0Oo == o000o0.f3039OooO0Oo;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f3036OooO00o * 31) + (this.f3037OooO0O0 ? 1231 : 1237)) * 31) + this.f3038OooO0OO) * 31) + this.f3039OooO0Oo;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("KeyboardOptions(capitalization=");
        sbOooO0o0.append((Object) oo00o.OooO00o(this.f3036OooO00o));
        sbOooO0o0.append(", autoCorrect=");
        sbOooO0o0.append(this.f3037OooO0O0);
        sbOooO0o0.append(", keyboardType=");
        sbOooO0o0.append((Object) o00O0.OooO00o(this.f3038OooO0OO));
        sbOooO0o0.append(", imeAction=");
        sbOooO0o0.append((Object) o00O000o.OooO00o(this.f3039OooO0Oo));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
