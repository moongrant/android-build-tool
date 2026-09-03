package p028Oooo0o0;

import OooO00o.OooO00o;
import androidx.compose.runtime.Immutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f2092OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f2093OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f2094OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f2095OooO0Oo;

    public o00OO00O(int i, int i2, int i3, int i4) {
        this.f2092OooO00o = i;
        this.f2093OooO0O0 = i2;
        this.f2094OooO0OO = i3;
        this.f2095OooO0Oo = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00OO00O)) {
            return false;
        }
        o00OO00O o00oo00o = (o00OO00O) obj;
        return this.f2092OooO00o == o00oo00o.f2092OooO00o && this.f2093OooO0O0 == o00oo00o.f2093OooO0O0 && this.f2094OooO0OO == o00oo00o.f2094OooO0OO && this.f2095OooO0Oo == o00oo00o.f2095OooO0Oo;
    }

    public final int hashCode() {
        return (((((this.f2092OooO00o * 31) + this.f2093OooO0O0) * 31) + this.f2094OooO0OO) * 31) + this.f2095OooO0Oo;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("InsetsValues(left=");
        sbOooO0o0.append(this.f2092OooO00o);
        sbOooO0o0.append(", top=");
        sbOooO0o0.append(this.f2093OooO0O0);
        sbOooO0o0.append(", right=");
        sbOooO0o0.append(this.f2094OooO0OO);
        sbOooO0o0.append(", bottom=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f2095OooO0Oo, ')');
    }
}
