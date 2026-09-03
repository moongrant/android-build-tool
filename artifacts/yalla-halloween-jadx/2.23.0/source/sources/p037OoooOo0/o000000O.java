package p037OoooOo0;

import android.opengl.EGLSurface;
import androidx.annotation.NonNull;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O extends o000O00.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EGLSurface f1497OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1498OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1499OooO0OO;

    public o000000O(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f1497OooO00o = eGLSurface;
        this.f1498OooO0O0 = i;
        this.f1499OooO0OO = i2;
    }

    @Override // OoooOo0.o000O00.OooO00o
    @NonNull
    public final EGLSurface OooO00o() {
        return this.f1497OooO00o;
    }

    @Override // OoooOo0.o000O00.OooO00o
    public final int OooO0O0() {
        return this.f1499OooO0OO;
    }

    @Override // OoooOo0.o000O00.OooO00o
    public final int OooO0OO() {
        return this.f1498OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000O00.OooO00o)) {
            return false;
        }
        o000O00.OooO00o oooO00o = (o000O00.OooO00o) obj;
        return this.f1497OooO00o.equals(oooO00o.OooO00o()) && this.f1498OooO0O0 == oooO00o.OooO0OO() && this.f1499OooO0OO == oooO00o.OooO0O0();
    }

    public final int hashCode() {
        return ((((this.f1497OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1498OooO0O0) * 1000003) ^ this.f1499OooO0OO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.f1497OooO00o);
        sb.append(", width=");
        sb.append(this.f1498OooO0O0);
        sb.append(", height=");
        return OooOO0.OooO0O0(sb, this.f1499OooO0OO, "}");
    }
}
