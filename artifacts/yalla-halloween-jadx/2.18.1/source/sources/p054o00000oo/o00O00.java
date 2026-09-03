package p054o00000oo;

import androidx.compose.runtime.Immutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00O00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27169OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final o00O00 f27170OooO0oO = new o00O00();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f27171OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27172OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f27173OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f27174OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f27175OooO0o0;

    public static final class OooO00o {
    }

    public o00O00() {
        this.f27171OooO00o = false;
        this.f27172OooO0O0 = 0;
        this.f27173OooO0OO = true;
        this.f27174OooO0Oo = 1;
        this.f27175OooO0o0 = 1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O00)) {
            return false;
        }
        o00O00 o00o01 = (o00O00) obj;
        if (this.f27171OooO00o != o00o01.f27171OooO00o) {
            return false;
        }
        if (!(this.f27172OooO0O0 == o00o01.f27172OooO0O0) || this.f27173OooO0OO != o00o01.f27173OooO0OO) {
            return false;
        }
        if (this.f27174OooO0Oo == o00o01.f27174OooO0Oo) {
            return this.f27175OooO0o0 == o00o01.f27175OooO0o0;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f27171OooO00o ? 1231 : 1237) * 31) + this.f27172OooO0O0) * 31) + (this.f27173OooO0OO ? 1231 : 1237)) * 31) + this.f27174OooO0Oo) * 31) + this.f27175OooO0o0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ImeOptions(singleLine=");
        sbOooO0o0.append(this.f27171OooO00o);
        sbOooO0o0.append(", capitalization=");
        sbOooO0o0.append((Object) oo00o.OooO00o(this.f27172OooO0O0));
        sbOooO0o0.append(", autoCorrect=");
        sbOooO0o0.append(this.f27173OooO0OO);
        sbOooO0o0.append(", keyboardType=");
        sbOooO0o0.append((Object) o00O0.OooO00o(this.f27174OooO0Oo));
        sbOooO0o0.append(", imeAction=");
        sbOooO0o0.append((Object) o00O000o.OooO00o(this.f27175OooO0o0));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public o00O00(boolean z, int i, boolean z2, int i2, int i3) {
        this.f27171OooO00o = z;
        this.f27172OooO0O0 = i;
        this.f27173OooO0OO = z2;
        this.f27174OooO0Oo = i2;
        this.f27175OooO0o0 = i3;
    }
}
