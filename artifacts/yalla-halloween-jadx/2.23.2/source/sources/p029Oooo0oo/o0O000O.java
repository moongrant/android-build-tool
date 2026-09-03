package p029Oooo0oo;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCapture;
import p037OoooOo0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000O extends o0O0O0Oo.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O00<byte[]> f1226OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ImageCapture.OooOO0O f1227OooO0O0;

    public o0O000O(o000O00<byte[]> o000o01, ImageCapture.OooOO0O oooOO0O) {
        if (o000o01 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f1226OooO00o = o000o01;
        this.f1227OooO0O0 = oooOO0O;
    }

    @Override // Oooo0oo.o0O0O0Oo.OooO00o
    @NonNull
    public final ImageCapture.OooOO0O OooO00o() {
        return this.f1227OooO0O0;
    }

    @Override // Oooo0oo.o0O0O0Oo.OooO00o
    @NonNull
    public final o000O00<byte[]> OooO0O0() {
        return this.f1226OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O0O0Oo.OooO00o)) {
            return false;
        }
        o0O0O0Oo.OooO00o oooO00o = (o0O0O0Oo.OooO00o) obj;
        return this.f1226OooO00o.equals(oooO00o.OooO0O0()) && this.f1227OooO0O0.equals(oooO00o.OooO00o());
    }

    public final int hashCode() {
        return ((this.f1226OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1227OooO0O0.hashCode();
    }

    public final String toString() {
        return "In{packet=" + this.f1226OooO00o + ", outputFileOptions=" + this.f1227OooO0O0 + "}";
    }
}
