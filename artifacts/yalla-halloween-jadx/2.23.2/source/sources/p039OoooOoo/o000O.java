package p039OoooOoo;

import androidx.annotation.NonNull;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes.dex */
public final class o000O extends o00O000o.OooO00o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f1612OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final String f1613OooOO0O;

    public o000O(int i, String str) {
        this.f1612OooOO0 = i;
        this.f1613OooOO0O = str;
    }

    @Override // OoooOoo.o00O000o.OooO00o
    @NonNull
    public final String OooO00o() {
        return this.f1613OooOO0O;
    }

    @Override // OoooOoo.o00O000o.OooO00o
    public final int OooO0O0() {
        return this.f1612OooOO0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O000o.OooO00o)) {
            return false;
        }
        o00O000o.OooO00o oooO00o = (o00O000o.OooO00o) obj;
        return this.f1612OooOO0 == oooO00o.OooO0O0() && this.f1613OooOO0O.equals(oooO00o.OooO00o());
    }

    public final int hashCode() {
        return ((this.f1612OooOO0 ^ 1000003) * 1000003) ^ this.f1613OooOO0O.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.f1612OooOO0);
        sb.append(", name=");
        return o0oOO.OooO0O0(sb, this.f1613OooOO0O, "}");
    }
}
