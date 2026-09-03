package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import io.agora.rtc.internal.RtcEngineEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class CameraAccessExceptionCompat extends Exception {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f3383OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @VisibleForTesting
    public static final Set<Integer> f3382OooO0o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    public static final Set<Integer> f3381OooO0o = Collections.unmodifiableSet(new HashSet(Arrays.asList(Integer.valueOf(RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS), 10002)));

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface AccessError {
    }

    public CameraAccessExceptionCompat(@Nullable RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f3383OooO0Oo = RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS;
        if (f3382OooO0o0.contains(Integer.valueOf(RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS))) {
            new CameraAccessException(RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS, null, runtimeException);
        }
    }

    @NonNull
    public static CameraAccessExceptionCompat OooO00o(@NonNull CameraAccessException cameraAccessException) {
        return new CameraAccessExceptionCompat(cameraAccessException);
    }

    public CameraAccessExceptionCompat(@NonNull CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f3383OooO0Oo = cameraAccessException.getReason();
    }

    public CameraAccessExceptionCompat(@Nullable AssertionError assertionError, @Nullable String str) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.f3383OooO0Oo = 10002;
        if (f3382OooO0o0.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
