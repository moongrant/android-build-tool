package p029Oooo0oo;

import androidx.camera.core.OooOOO0;
import p022Oooo00O.OooOO0;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0000O extends o0O00o00.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0o<OooOOO0> f1237OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O0o<o0OO000> f1238OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1239OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f1240OooO0Oo;

    public o0O0000O(o000O0o<OooOOO0> o000o0o2, o000O0o<o0OO000> o000o0o3, int i, int i2) {
        this.f1237OooO00o = o000o0o2;
        this.f1238OooO0O0 = o000o0o3;
        this.f1239OooO0OO = i;
        this.f1240OooO0Oo = i2;
    }

    @Override // Oooo0oo.o0O00o00.OooO0OO
    public final o000O0o<OooOOO0> OooO00o() {
        return this.f1237OooO00o;
    }

    @Override // Oooo0oo.o0O00o00.OooO0OO
    public final int OooO0O0() {
        return this.f1239OooO0OO;
    }

    @Override // Oooo0oo.o0O00o00.OooO0OO
    public final int OooO0OO() {
        return this.f1240OooO0Oo;
    }

    @Override // Oooo0oo.o0O00o00.OooO0OO
    public final o000O0o<o0OO000> OooO0Oo() {
        return this.f1238OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O00o00.OooO0OO)) {
            return false;
        }
        o0O00o00.OooO0OO oooO0OO = (o0O00o00.OooO0OO) obj;
        return this.f1237OooO00o.equals(oooO0OO.OooO00o()) && this.f1238OooO0O0.equals(oooO0OO.OooO0Oo()) && this.f1239OooO0OO == oooO0OO.OooO0O0() && this.f1240OooO0Oo == oooO0OO.OooO0OO();
    }

    public final int hashCode() {
        return ((((((this.f1237OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1238OooO0O0.hashCode()) * 1000003) ^ this.f1239OooO0OO) * 1000003) ^ this.f1240OooO0Oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Out{imageEdge=");
        sb.append(this.f1237OooO00o);
        sb.append(", requestEdge=");
        sb.append(this.f1238OooO0O0);
        sb.append(", inputFormat=");
        sb.append(this.f1239OooO0OO);
        sb.append(", outputFormat=");
        return OooOO0.OooO0O0(sb, this.f1240OooO0Oo, "}");
    }
}
