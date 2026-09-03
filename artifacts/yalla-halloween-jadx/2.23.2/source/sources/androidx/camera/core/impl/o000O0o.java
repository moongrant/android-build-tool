package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o000O0o implements CameraControlInternal {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CameraControlInternal f3703OooO0O0;

    public o000O0o(@NonNull CameraControlInternal cameraControlInternal) {
        this.f3703OooO0O0 = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void OooO() {
        this.f3703OooO0O0.OooO();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public com.google.common.util.concurrent.OooOO0O<List<Void>> OooO00o(@NonNull List<o000000O> list, int i, int i2) {
        return this.f3703OooO0O0.OooO00o(list, i, i2);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.OooOO0O<Void> OooO0O0(float f) {
        return this.f3703OooO0O0.OooO0O0(f);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public final Rect OooO0OO() {
        return this.f3703OooO0O0.OooO0OO();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void OooO0Oo(int i) {
        this.f3703OooO0O0.OooO0Oo(i);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public final Config OooO0o() {
        return this.f3703OooO0O0.OooO0o();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.OooOO0O<Void> OooO0o0(boolean z) {
        return this.f3703OooO0O0.OooO0o0(z);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void OooO0oO(@NonNull Config config) {
        this.f3703OooO0O0.OooO0oO(config);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void OooO0oo(@NonNull SessionConfig.OooO0O0 oooO0O0) {
        this.f3703OooO0O0.OooO0oo(oooO0O0);
    }
}
