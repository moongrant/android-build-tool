package p029Oooo0oo;

import p022Oooo00O.OooOO0;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOoOo extends o0O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0o<o0O.OooO0O0> f1335OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1336OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1337OooO0OO;

    public o0OoOoOo(o000O0o<o0O.OooO0O0> o000o0o2, int i, int i2) {
        this.f1335OooO00o = o000o0o2;
        this.f1336OooO0O0 = i;
        this.f1337OooO0OO = i2;
    }

    @Override // Oooo0oo.o0O.OooO00o
    public final o000O0o<o0O.OooO0O0> OooO00o() {
        return this.f1335OooO00o;
    }

    @Override // Oooo0oo.o0O.OooO00o
    public final int OooO0O0() {
        return this.f1336OooO0O0;
    }

    @Override // Oooo0oo.o0O.OooO00o
    public final int OooO0OO() {
        return this.f1337OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O.OooO00o)) {
            return false;
        }
        o0O.OooO00o oooO00o = (o0O.OooO00o) obj;
        return this.f1335OooO00o.equals(oooO00o.OooO00o()) && this.f1336OooO0O0 == oooO00o.OooO0O0() && this.f1337OooO0OO == oooO00o.OooO0OO();
    }

    public final int hashCode() {
        return ((((this.f1335OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1336OooO0O0) * 1000003) ^ this.f1337OooO0OO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.f1335OooO00o);
        sb.append(", inputFormat=");
        sb.append(this.f1336OooO0O0);
        sb.append(", outputFormat=");
        return OooOO0.OooO0O0(sb, this.f1337OooO0OO, "}");
    }
}
