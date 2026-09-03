package p080o000OoO;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o000Oo0 f34984OooO0OO = new o000Oo0(-1, -1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f34985OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34986OooO0O0;

    static {
        new o000Oo0(0, 0);
    }

    public o000Oo0(int i, int i2) {
        o00Oo0.OooO00o((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f34985OooO00o = i;
        this.f34986OooO0O0 = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000Oo0)) {
            return false;
        }
        o000Oo0 o000oo1 = (o000Oo0) obj;
        return this.f34985OooO00o == o000oo1.f34985OooO00o && this.f34986OooO0O0 == o000oo1.f34986OooO0O0;
    }

    public final int hashCode() {
        int i = this.f34985OooO00o;
        return ((i >>> 16) | (i << 16)) ^ this.f34986OooO0O0;
    }

    public final String toString() {
        return this.f34985OooO00o + "x" + this.f34986OooO0O0;
    }
}
