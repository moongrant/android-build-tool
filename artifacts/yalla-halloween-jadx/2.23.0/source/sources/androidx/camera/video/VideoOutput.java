package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.o00O00o0;
import p039OoooOoo.o00OOO0O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface VideoOutput {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public enum SourceState {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void OooO00o(@NonNull SurfaceRequest surfaceRequest, @NonNull Timebase timebase);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    o00O00o0<MediaSpec> OooO0O0();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    o00O00o0<OooOOO> OooO0OO();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void OooO0Oo(@NonNull SourceState sourceState);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    o00OOO0O OooO0o0(@NonNull CameraInfo cameraInfo);
}
