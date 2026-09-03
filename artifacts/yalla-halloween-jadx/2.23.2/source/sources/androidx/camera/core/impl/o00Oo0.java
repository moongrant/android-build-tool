package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface o00Oo0 {
    void OooO00o(@NonNull ExifData.OooO0O0 oooO0O0);

    @NonNull
    o00OOO0 OooO0O0();

    long OooO0OO();

    @NonNull
    CameraCaptureMetaData$FlashState OooO0Oo();

    @NonNull
    CameraCaptureMetaData$AfState OooO0o();

    @NonNull
    CaptureResult OooO0o0();

    @NonNull
    CameraCaptureMetaData$AwbState OooO0oO();

    @NonNull
    CameraCaptureMetaData$AeState OooO0oo();
}
