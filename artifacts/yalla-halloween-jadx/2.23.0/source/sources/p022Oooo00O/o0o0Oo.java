package p022Oooo00O;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o000000O;
import com.google.common.util.concurrent.OooO00o;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface o0o0Oo {
    @NonNull
    OooO00o<Void> OooO00o(@NonNull SessionConfig sessionConfig, @NonNull CameraDevice cameraDevice, @NonNull o0oOo0O0 o0ooo0o1);

    void OooO0O0(@NonNull List<o000000O> list);

    void OooO0OO();

    void OooO0Oo(@NonNull HashMap map);

    @Nullable
    SessionConfig OooO0o();

    @NonNull
    List<o000000O> OooO0o0();

    void OooO0oO(@Nullable SessionConfig sessionConfig);

    void close();

    @NonNull
    OooO00o release();
}
