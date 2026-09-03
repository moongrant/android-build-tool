package p029Oooo0oo;

import androidx.annotation.NonNull;
import androidx.camera.core.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000Oo extends o0O.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO000 f1243OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f1244OooO0O0;

    public o0O000Oo(o0OO000 o0oo000, OooOOO0 oooOOO0) {
        if (o0oo000 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f1243OooO00o = o0oo000;
        if (oooOOO0 == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f1244OooO0O0 = oooOOO0;
    }

    @Override // Oooo0oo.o0O.OooO0O0
    @NonNull
    public final OooOOO0 OooO00o() {
        return this.f1244OooO0O0;
    }

    @Override // Oooo0oo.o0O.OooO0O0
    @NonNull
    public final o0OO000 OooO0O0() {
        return this.f1243OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O.OooO0O0)) {
            return false;
        }
        o0O.OooO0O0 oooO0O0 = (o0O.OooO0O0) obj;
        return this.f1243OooO00o.equals(oooO0O0.OooO0O0()) && this.f1244OooO0O0.equals(oooO0O0.OooO00o());
    }

    public final int hashCode() {
        return ((this.f1243OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1244OooO0O0.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f1243OooO00o + ", imageProxy=" + this.f1244OooO0O0 + "}";
    }
}
