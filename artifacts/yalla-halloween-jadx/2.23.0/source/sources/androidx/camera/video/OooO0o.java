package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.SurfaceRequest;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f3907OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final SurfaceRequest.OooO0OO f3908OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO.OooO00o f3909OooO0o0;

    public OooO0o(int i, OooOOO.OooO00o oooO00o, @Nullable SurfaceRequest.OooO0OO oooO0OO) {
        this.f3907OooO0Oo = i;
        if (oooO00o == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f3909OooO0o0 = oooO00o;
        this.f3908OooO0o = oooO0OO;
    }

    @Override // androidx.camera.video.OooOOO
    public final int OooO00o() {
        return this.f3907OooO0Oo;
    }

    @Override // androidx.camera.video.OooOOO
    @Nullable
    public final SurfaceRequest.OooO0OO OooO0O0() {
        return this.f3908OooO0o;
    }

    @Override // androidx.camera.video.OooOOO
    @NonNull
    public final OooOOO.OooO00o OooO0OO() {
        return this.f3909OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        if (this.f3907OooO0Oo == oooOOO.OooO00o() && this.f3909OooO0o0.equals(oooOOO.OooO0OO())) {
            SurfaceRequest.OooO0OO oooO0OO = this.f3908OooO0o;
            if (oooO0OO == null) {
                if (oooOOO.OooO0O0() == null) {
                    return true;
                }
            } else if (oooO0OO.equals(oooOOO.OooO0O0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f3907OooO0Oo ^ 1000003) * 1000003) ^ this.f3909OooO0o0.hashCode()) * 1000003;
        SurfaceRequest.OooO0OO oooO0OO = this.f3908OooO0o;
        return iHashCode ^ (oooO0OO == null ? 0 : oooO0OO.hashCode());
    }

    public final String toString() {
        return "StreamInfo{id=" + this.f3907OooO0Oo + ", streamState=" + this.f3909OooO0o0 + ", inProgressTransformationInfo=" + this.f3908OooO0o + "}";
    }
}
