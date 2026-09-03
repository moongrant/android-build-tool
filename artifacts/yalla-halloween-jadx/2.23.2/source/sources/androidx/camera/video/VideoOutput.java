package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.oo00o;
import p039OoooOoo.o00Oo00;

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
    oo00o<MediaSpec> OooO0O0();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    oo00o<OooOOO> OooO0OO();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void OooO0Oo(@NonNull SourceState sourceState);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    o00Oo00 OooO0o0(@NonNull CameraInfo cameraInfo);
}
