package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends o00O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Surface f3581OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Size f3582OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3583OooO0OO;

    public OooOOO(Surface surface, Size size, int i) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f3581OooO00o = surface;
        this.f3582OooO0O0 = size;
        this.f3583OooO0OO = i;
    }

    @Override // androidx.camera.core.impl.o00O0O0
    public final int OooO00o() {
        return this.f3583OooO0OO;
    }

    @Override // androidx.camera.core.impl.o00O0O0
    @NonNull
    public final Size OooO0O0() {
        return this.f3582OooO0O0;
    }

    @Override // androidx.camera.core.impl.o00O0O0
    @NonNull
    public final Surface OooO0OO() {
        return this.f3581OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O0O0)) {
            return false;
        }
        o00O0O0 o00o0o0 = (o00O0O0) obj;
        return this.f3581OooO00o.equals(o00o0o0.OooO0OO()) && this.f3582OooO0O0.equals(o00o0o0.OooO0O0()) && this.f3583OooO0OO == o00o0o0.OooO00o();
    }

    public final int hashCode() {
        return ((((this.f3581OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3582OooO0O0.hashCode()) * 1000003) ^ this.f3583OooO0OO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{surface=");
        sb.append(this.f3581OooO00o);
        sb.append(", size=");
        sb.append(this.f3582OooO0O0);
        sb.append(", imageFormat=");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f3583OooO0OO, "}");
    }
}
