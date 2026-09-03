package p029Oooo0oo;

import android.graphics.Bitmap;
import p022Oooo00O.OooOO0;
import p037OoooOo0.o000O00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends o0O00.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O00O<Bitmap> f1217OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1218OooO0O0;

    public o0(o000O00O<Bitmap> o000o00o2, int i) {
        if (o000o00o2 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f1217OooO00o = o000o00o2;
        this.f1218OooO0O0 = i;
    }

    @Override // Oooo0oo.o0O00.OooO00o
    public final int OooO00o() {
        return this.f1218OooO0O0;
    }

    @Override // Oooo0oo.o0O00.OooO00o
    public final o000O00O<Bitmap> OooO0O0() {
        return this.f1217OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O00.OooO00o)) {
            return false;
        }
        o0O00.OooO00o oooO00o = (o0O00.OooO00o) obj;
        return this.f1217OooO00o.equals(oooO00o.OooO0O0()) && this.f1218OooO0O0 == oooO00o.OooO00o();
    }

    public final int hashCode() {
        return ((this.f1217OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1218OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.f1217OooO00o);
        sb.append(", jpegQuality=");
        return OooOO0.OooO0O0(sb, this.f1218OooO0O0, "}");
    }
}
