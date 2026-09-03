package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class RestrictedCameraControl extends o000O0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CameraControlInternal f3615OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile boolean f3616OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @CameraOperation
    public volatile Set<Integer> f3617OooO0o0;

    public @interface CameraOperation {
    }

    public RestrictedCameraControl(@NonNull CameraControlInternal cameraControlInternal) {
        super(cameraControlInternal);
        this.f3616OooO0Oo = false;
        this.f3615OooO0OO = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.o000O0o, androidx.camera.core.CameraControl
    @NonNull
    public final com.google.common.util.concurrent.OooO00o<Void> OooO0O0(float f) {
        return !OooOO0(0) ? new OoooO.Oooo0.OooO00o(new IllegalStateException("Zoom is not supported")) : this.f3615OooO0OO.OooO0O0(f);
    }

    @Override // androidx.camera.core.impl.o000O0o, androidx.camera.core.CameraControl
    @NonNull
    public final com.google.common.util.concurrent.OooO00o<Void> OooO0o0(boolean z) {
        return !OooOO0(6) ? new OoooO.Oooo0.OooO00o(new IllegalStateException("Torch is not supported")) : this.f3615OooO0OO.OooO0o0(z);
    }

    public final boolean OooOO0(@NonNull @CameraOperation int... iArr) {
        if (!this.f3616OooO0Oo || this.f3617OooO0o0 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int iOooO00o = 0;
        while (iOooO00o < length) {
            iOooO00o = p003OooO0o0.o0O0O00.OooO00o(iArr[iOooO00o], arrayList, iOooO00o, 1);
        }
        return this.f3617OooO0o0.containsAll(arrayList);
    }
}
