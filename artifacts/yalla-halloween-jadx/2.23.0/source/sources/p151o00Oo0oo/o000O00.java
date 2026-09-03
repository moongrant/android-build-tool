package p151o00Oo0oo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f38042OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38043OooO0O0;

    public o000O00(int i, int i2) {
        this.f38042OooO00o = i;
        this.f38043OooO0O0 = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O00)) {
            return false;
        }
        o000O00 o000o01 = (o000O00) obj;
        return this.f38042OooO00o == o000o01.f38042OooO00o && this.f38043OooO0O0 == o000o01.f38043OooO0O0;
    }

    public final int hashCode() {
        return (this.f38042OooO00o * 31) + this.f38043OooO0O0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInfo(textWidth=");
        sb.append(this.f38042OooO00o);
        sb.append(", containerWidth=");
        return OooOO0.OooO0O0(sb, this.f38043OooO0O0, ")");
    }
}
