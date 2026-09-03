package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class CameraCaptureFailure {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Reason f3521OooO00o;

    public enum Reason {
        ERROR
    }

    public CameraCaptureFailure(@NonNull Reason reason) {
        this.f3521OooO00o = reason;
    }
}
