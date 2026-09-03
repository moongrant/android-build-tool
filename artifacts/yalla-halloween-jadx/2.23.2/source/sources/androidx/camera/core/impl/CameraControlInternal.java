package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface CameraControlInternal extends CameraControl {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f3525OooO00o = new OooO00o();

    public static final class CameraControlException extends Exception {
    }

    public class OooO00o implements CameraControlInternal {
        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void OooO() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public final com.google.common.util.concurrent.OooOO0O<List<Void>> OooO00o(@NonNull List<o000000O> list, int i, int i2) {
            return p030OoooO.OooOo.OooO0Oo(Collections.emptyList());
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public final com.google.common.util.concurrent.OooOO0O<Void> OooO0O0(float f) {
            return p030OoooO.OooOo.OooO0Oo(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public final Rect OooO0OO() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void OooO0Oo(int i) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public final Config OooO0o() {
            return null;
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public final com.google.common.util.concurrent.OooOO0O<Void> OooO0o0(boolean z) {
            return p030OoooO.OooOo.OooO0Oo(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void OooO0oO(@NonNull Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void OooO0oo(@NonNull SessionConfig.OooO0O0 oooO0O0) {
        }
    }

    public interface OooO0O0 {
    }

    void OooO();

    @NonNull
    com.google.common.util.concurrent.OooOO0O<List<Void>> OooO00o(@NonNull List<o000000O> list, int i, int i2);

    @NonNull
    Rect OooO0OO();

    void OooO0Oo(int i);

    @NonNull
    Config OooO0o();

    void OooO0oO(@NonNull Config config);

    void OooO0oo(@NonNull SessionConfig.OooO0O0 oooO0O0);
}
