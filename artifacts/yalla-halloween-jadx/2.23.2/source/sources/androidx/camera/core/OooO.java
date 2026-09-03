package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends SurfaceRequest.Result {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3430OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Surface f3431OooO0O0;

    public OooO(int i, Surface surface) {
        this.f3430OooO00o = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f3431OooO0O0 = surface;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public final int OooO00o() {
        return this.f3430OooO00o;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    @NonNull
    public final Surface OooO0O0() {
        return this.f3431OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.Result)) {
            return false;
        }
        SurfaceRequest.Result result = (SurfaceRequest.Result) obj;
        return this.f3430OooO00o == result.OooO00o() && this.f3431OooO0O0.equals(result.OooO0O0());
    }

    public final int hashCode() {
        return ((this.f3430OooO00o ^ 1000003) * 1000003) ^ this.f3431OooO0O0.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.f3430OooO00o + ", surface=" + this.f3431OooO0O0 + "}";
    }
}
