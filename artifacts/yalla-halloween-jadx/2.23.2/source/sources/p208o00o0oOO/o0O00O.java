package p208o00o0oOO;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f39635OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39636OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39637OooO0OO;

    public o0O00O(int i, int i2, int i3) {
        this.f39635OooO00o = i;
        this.f39636OooO0O0 = i2;
        this.f39637OooO0OO = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O00O)) {
            return false;
        }
        o0O00O o0o00o2 = (o0O00O) obj;
        return this.f39635OooO00o == o0o00o2.f39635OooO00o && this.f39636OooO0O0 == o0o00o2.f39636OooO0O0 && this.f39637OooO0OO == o0o00o2.f39637OooO0OO;
    }

    public final int hashCode() {
        return (((this.f39635OooO00o * 31) + this.f39636OooO0O0) * 31) + this.f39637OooO0OO;
    }

    @NotNull
    public final String toString() {
        return this.f39635OooO00o + "-" + (this.f39636OooO0O0 + 1) + "-" + this.f39637OooO0OO;
    }
}
