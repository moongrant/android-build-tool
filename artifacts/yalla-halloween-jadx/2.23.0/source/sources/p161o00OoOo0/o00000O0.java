package p161o00OoOo0;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f38505OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38506OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f38507OooO0OO;

    public o00000O0(int i, int i2, int i3) {
        this.f38505OooO00o = i;
        this.f38506OooO0O0 = i2;
        this.f38507OooO0OO = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000O0)) {
            return false;
        }
        o00000O0 o00000o1 = (o00000O0) obj;
        return this.f38505OooO00o == o00000o1.f38505OooO00o && this.f38506OooO0O0 == o00000o1.f38506OooO0O0 && this.f38507OooO0OO == o00000o1.f38507OooO0OO;
    }

    public final int hashCode() {
        return (((this.f38505OooO00o * 31) + this.f38506OooO0O0) * 31) + this.f38507OooO0OO;
    }

    @NotNull
    public final String toString() {
        return this.f38505OooO00o + "-" + (this.f38506OooO0O0 + 1) + "-" + this.f38507OooO0OO;
    }
}
