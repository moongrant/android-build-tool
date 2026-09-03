package p039OoooOoo;

import androidx.annotation.NonNull;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 extends o000OOo0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O000o f1614OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1615OooO0OO;

    public o000O0(o000O o000o, int i) {
        if (o000o == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f1614OooO0O0 = o000o;
        this.f1615OooO0OO = i;
    }

    @Override // OoooOoo.o000OOo0.OooO00o
    @NonNull
    public final o00O000o OooO00o() {
        return this.f1614OooO0O0;
    }

    @Override // OoooOoo.o000OOo0.OooO00o
    public final int OooO0O0() {
        return this.f1615OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000OOo0.OooO00o)) {
            return false;
        }
        o000OOo0.OooO00o oooO00o = (o000OOo0.OooO00o) obj;
        return this.f1614OooO0O0.equals(oooO00o.OooO00o()) && this.f1615OooO0OO == oooO00o.OooO0O0();
    }

    public final int hashCode() {
        return ((this.f1614OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f1615OooO0OO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.f1614OooO0O0);
        sb.append(", fallbackRule=");
        return OooOO0.OooO00o(sb, this.f1615OooO0OO, "}");
    }
}
