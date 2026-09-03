package androidx.camera.lifecycle;

import androidx.annotation.NonNull;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends LifecycleCameraRepository.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LifecycleOwner f3862OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CameraUseCaseAdapter.OooO00o f3863OooO0O0;

    public OooO00o(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.OooO00o oooO00o) {
        if (lifecycleOwner == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f3862OooO00o = lifecycleOwner;
        if (oooO00o == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f3863OooO0O0 = oooO00o;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.OooO00o
    @NonNull
    public final CameraUseCaseAdapter.OooO00o OooO00o() {
        return this.f3863OooO0O0;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.OooO00o
    @NonNull
    public final LifecycleOwner OooO0O0() {
        return this.f3862OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.OooO00o)) {
            return false;
        }
        LifecycleCameraRepository.OooO00o oooO00o = (LifecycleCameraRepository.OooO00o) obj;
        return this.f3862OooO00o.equals(oooO00o.OooO0O0()) && this.f3863OooO0O0.equals(oooO00o.OooO00o());
    }

    public final int hashCode() {
        return ((this.f3862OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3863OooO0O0.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f3862OooO00o + ", cameraId=" + this.f3863OooO0O0 + "}";
    }
}
