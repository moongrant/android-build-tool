package p245o00oo0o;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O00o0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O00o0 f40618OooO0OO = new o0O00o0(-1, -1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f40619OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f40620OooO0O0;

    static {
        new o0O00o0(0, 0);
    }

    public o0O00o0(int i, int i2) {
        o00O000o.OooO00o((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f40619OooO00o = i;
        this.f40620OooO0O0 = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O00o0)) {
            return false;
        }
        o0O00o0 o0o00o1 = (o0O00o0) obj;
        return this.f40619OooO00o == o0o00o1.f40619OooO00o && this.f40620OooO0O0 == o0o00o1.f40620OooO0O0;
    }

    public final int hashCode() {
        int i = this.f40619OooO00o;
        return ((i >>> 16) | (i << 16)) ^ this.f40620OooO0O0;
    }

    public final String toString() {
        return this.f40619OooO00o + "x" + this.f40620OooO0O0;
    }
}
