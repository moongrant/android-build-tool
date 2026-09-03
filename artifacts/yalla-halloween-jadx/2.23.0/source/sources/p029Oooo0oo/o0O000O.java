package p029Oooo0oo;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCapture;
import p037OoooOo0.o000O00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000O extends o0O0O0Oo.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O00O<byte[]> f1241OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ImageCapture.OooOO0O f1242OooO0O0;

    public o0O000O(o000O00O<byte[]> o000o00o2, ImageCapture.OooOO0O oooOO0O) {
        if (o000o00o2 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f1241OooO00o = o000o00o2;
        this.f1242OooO0O0 = oooOO0O;
    }

    @Override // Oooo0oo.o0O0O0Oo.OooO00o
    @NonNull
    public final ImageCapture.OooOO0O OooO00o() {
        return this.f1242OooO0O0;
    }

    @Override // Oooo0oo.o0O0O0Oo.OooO00o
    @NonNull
    public final o000O00O<byte[]> OooO0O0() {
        return this.f1241OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O0O0Oo.OooO00o)) {
            return false;
        }
        o0O0O0Oo.OooO00o oooO00o = (o0O0O0Oo.OooO00o) obj;
        return this.f1241OooO00o.equals(oooO00o.OooO0O0()) && this.f1242OooO0O0.equals(oooO00o.OooO00o());
    }

    public final int hashCode() {
        return ((this.f1241OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1242OooO0O0.hashCode();
    }

    public final String toString() {
        return "In{packet=" + this.f1241OooO00o + ", outputFileOptions=" + this.f1242OooO0O0 + "}";
    }
}
