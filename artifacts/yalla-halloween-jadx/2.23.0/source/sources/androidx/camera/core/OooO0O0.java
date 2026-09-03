package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends CameraState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CameraState.Type f3438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CameraState.OooO00o f3439OooO0O0;

    public OooO0O0(CameraState.Type type, @Nullable OooO0OO oooO0OO) {
        if (type == null) {
            throw new NullPointerException("Null type");
        }
        this.f3438OooO00o = type;
        this.f3439OooO0O0 = oooO0OO;
    }

    @Override // androidx.camera.core.CameraState
    @Nullable
    public final CameraState.OooO00o OooO00o() {
        return this.f3439OooO0O0;
    }

    @Override // androidx.camera.core.CameraState
    @NonNull
    public final CameraState.Type OooO0O0() {
        return this.f3438OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        if (this.f3438OooO00o.equals(cameraState.OooO0O0())) {
            CameraState.OooO00o oooO00o = this.f3439OooO0O0;
            if (oooO00o == null) {
                if (cameraState.OooO00o() == null) {
                    return true;
                }
            } else if (oooO00o.equals(cameraState.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f3438OooO00o.hashCode() ^ 1000003) * 1000003;
        CameraState.OooO00o oooO00o = this.f3439OooO0O0;
        return iHashCode ^ (oooO00o == null ? 0 : oooO00o.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + this.f3438OooO00o + ", error=" + this.f3439OooO0O0 + "}";
    }
}
