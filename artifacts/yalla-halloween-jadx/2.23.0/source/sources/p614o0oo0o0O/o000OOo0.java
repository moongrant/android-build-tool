package p614o0oo0o0O;

import androidx.compose.foundation.layout.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f57023OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f57024OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f57025OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f57026OooO0Oo;

    public o000OOo0(int i, int i2, int i3, int i4) {
        this.f57023OooO00o = i;
        this.f57024OooO0O0 = i2;
        this.f57025OooO0OO = i3;
        this.f57026OooO0Oo = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000OOo0)) {
            return false;
        }
        o000OOo0 o000ooo1 = (o000OOo0) obj;
        return this.f57023OooO00o == o000ooo1.f57023OooO00o && this.f57024OooO0O0 == o000ooo1.f57024OooO0O0 && this.f57025OooO0OO == o000ooo1.f57025OooO0OO && this.f57026OooO0Oo == o000ooo1.f57026OooO0Oo;
    }

    public final int hashCode() {
        return (((((this.f57023OooO00o * 31) + this.f57024OooO0O0) * 31) + this.f57025OooO0OO) * 31) + this.f57026OooO0Oo;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PointRect(x=");
        sb.append(this.f57023OooO00o);
        sb.append(", y=");
        sb.append(this.f57024OooO0O0);
        sb.append(", w=");
        sb.append(this.f57025OooO0OO);
        sb.append(", h=");
        return OooO0O0.OooO00o(sb, this.f57026OooO0Oo, ')');
    }
}
