package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
    }

    @NonNull
    com.google.common.util.concurrent.OooO00o<Void> OooO0O0(float f);

    @NonNull
    com.google.common.util.concurrent.OooO00o<Void> OooO0o0(boolean z);
}
