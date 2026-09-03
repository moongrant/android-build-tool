package p620o0oo0oO0;

import androidx.compose.foundation.layout.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f57588OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f57589OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f57590OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f57591OooO0Oo;

    public o000OO0O(int i, int i2, int i3, int i4) {
        this.f57588OooO00o = i;
        this.f57589OooO0O0 = i2;
        this.f57590OooO0OO = i3;
        this.f57591OooO0Oo = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000OO0O)) {
            return false;
        }
        o000OO0O o000oo0o2 = (o000OO0O) obj;
        return this.f57588OooO00o == o000oo0o2.f57588OooO00o && this.f57589OooO0O0 == o000oo0o2.f57589OooO0O0 && this.f57590OooO0OO == o000oo0o2.f57590OooO0OO && this.f57591OooO0Oo == o000oo0o2.f57591OooO0Oo;
    }

    public final int hashCode() {
        return (((((this.f57588OooO00o * 31) + this.f57589OooO0O0) * 31) + this.f57590OooO0OO) * 31) + this.f57591OooO0Oo;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PointRect(x=");
        sb.append(this.f57588OooO00o);
        sb.append(", y=");
        sb.append(this.f57589OooO0O0);
        sb.append(", w=");
        sb.append(this.f57590OooO0OO);
        sb.append(", h=");
        return OooO0O0.OooO00o(sb, this.f57591OooO0Oo, ')');
    }
}
