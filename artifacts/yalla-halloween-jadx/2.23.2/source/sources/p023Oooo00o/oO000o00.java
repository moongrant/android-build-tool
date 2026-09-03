package p023Oooo00o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import p025Oooo0OO.o0000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oO000o00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final oO000Oo f943OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final String f944OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @GuardedBy("this")
    public final HashMap f942OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public oOo00o0o f945OooO0Oo = null;

    public oO000o00(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f943OooO0O0 = new oO000Oo0(cameraCharacteristics);
        } else {
            this.f943OooO0O0 = new oO000Oo(cameraCharacteristics);
        }
        this.f944OooO0OO = str;
    }

    @Nullable
    public final <T> T OooO00o(@NonNull CameraCharacteristics.Key<T> key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return (T) this.f943OooO0O0.f941OooO00o.get(key);
        }
        synchronized (this) {
            T t = (T) this.f942OooO00o.get(key);
            if (t != null) {
                return t;
            }
            T t2 = (T) this.f943OooO0O0.f941OooO00o.get(key);
            if (t2 != null) {
                this.f942OooO00o.put(key, t2);
            }
            return t2;
        }
    }

    @NonNull
    public final oOo00o0o OooO0O0() {
        if (this.f945OooO0Oo == null) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) OooO00o(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null) {
                throw new IllegalArgumentException("StreamConfigurationMap is null!");
            }
            this.f945OooO0Oo = new oOo00o0o(streamConfigurationMap, new o0000(this.f944OooO0OO));
        }
        return this.f945OooO0Oo;
    }
}
