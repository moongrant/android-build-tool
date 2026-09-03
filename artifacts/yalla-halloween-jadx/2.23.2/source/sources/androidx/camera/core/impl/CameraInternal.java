package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface CameraInternal extends p028Oooo0oO.o000O0Oo, androidx.camera.core.Oooo0.OooO0o {

    public enum State {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);

        private final boolean mHoldsCameraSlot;

        State(boolean z) {
            this.mHoldsCameraSlot = z;
        }

        public final boolean OooO00o() {
            return this.mHoldsCameraSlot;
        }
    }

    @NonNull
    o0Oo0oo OooO();

    @Override // p028Oooo0oO.o000O0Oo
    @NonNull
    CameraInfo OooO00o();

    @NonNull
    oo00o<State> OooO0O0();

    @NonNull
    CameraControlInternal OooO0o();

    @NonNull
    CameraConfig OooO0oO();

    void OooO0oo(boolean z);

    boolean OooOO0();

    void OooOO0o(@Nullable CameraConfig cameraConfig);

    void OooOOO(@NonNull ArrayList arrayList);

    void OooOOO0(@NonNull ArrayList arrayList);

    boolean OooOOOO();
}
