package o0000O0O;

import androidx.compose.runtime.Immutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27317OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27318OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f27319OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f27320OooO0Oo;

    public Oooo0(int i, int i2, int i3, int i4) {
        this.f27317OooO00o = i;
        this.f27318OooO0O0 = i2;
        this.f27319OooO0OO = i3;
        this.f27320OooO0Oo = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return this.f27317OooO00o == oooo0.f27317OooO00o && this.f27318OooO0O0 == oooo0.f27318OooO0O0 && this.f27319OooO0OO == oooo0.f27319OooO0OO && this.f27320OooO0Oo == oooo0.f27320OooO0Oo;
    }

    public final int hashCode() {
        return (((((this.f27317OooO00o * 31) + this.f27318OooO0O0) * 31) + this.f27319OooO0OO) * 31) + this.f27320OooO0Oo;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("IntRect.fromLTRB(");
        sbOooO0o0.append(this.f27317OooO00o);
        sbOooO0o0.append(", ");
        sbOooO0o0.append(this.f27318OooO0O0);
        sbOooO0o0.append(", ");
        sbOooO0o0.append(this.f27319OooO0OO);
        sbOooO0o0.append(", ");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f27320OooO0Oo, ')');
    }
}
