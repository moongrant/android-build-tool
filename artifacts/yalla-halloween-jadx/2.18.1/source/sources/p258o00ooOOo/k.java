package p258o00ooOOo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f34657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34658OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f34659OooO0OO;

    public k(int i, int i2, int i3) {
        this.f34657OooO00o = i;
        this.f34658OooO0O0 = i2;
        this.f34659OooO0OO = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f34657OooO00o == kVar.f34657OooO00o && this.f34658OooO0O0 == kVar.f34658OooO0O0 && this.f34659OooO0OO == kVar.f34659OooO0OO;
    }

    public final int hashCode() {
        return (((this.f34657OooO00o * 31) + this.f34658OooO0O0) * 31) + this.f34659OooO0OO;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34657OooO00o);
        sb.append('-');
        sb.append(this.f34658OooO0O0 + 1);
        sb.append('-');
        sb.append(this.f34659OooO0OO);
        return sb.toString();
    }
}
