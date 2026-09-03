package p039OoooOoo;

import androidx.annotation.NonNull;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 extends o00O00O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O000o f1619OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1620OooO0O0;

    public o000O0O0(o00O000o o00o000o2, int i) {
        if (o00o000o2 == null) {
            throw new NullPointerException("Null quality");
        }
        this.f1619OooO00o = o00o000o2;
        this.f1620OooO0O0 = i;
    }

    @Override // OoooOoo.o00O00O.OooO00o
    public final int OooO00o() {
        return this.f1620OooO0O0;
    }

    @Override // OoooOoo.o00O00O.OooO00o
    @NonNull
    public final o00O000o OooO0O0() {
        return this.f1619OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O00O.OooO00o)) {
            return false;
        }
        o00O00O.OooO00o oooO00o = (o00O00O.OooO00o) obj;
        return this.f1619OooO00o.equals(oooO00o.OooO0O0()) && this.f1620OooO0O0 == oooO00o.OooO00o();
    }

    public final int hashCode() {
        return ((this.f1619OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1620OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.f1619OooO00o);
        sb.append(", aspectRatio=");
        return OooOO0.OooO00o(sb, this.f1620OooO0O0, "}");
    }
}
