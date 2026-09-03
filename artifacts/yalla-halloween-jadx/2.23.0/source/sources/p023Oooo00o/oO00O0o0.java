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
public final class oO00O0o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final oO0O0OoO f960OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final String f961OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @GuardedBy("this")
    public final HashMap f959OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public oO0OO00o f962OooO0Oo = null;

    public oO00O0o0(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f960OooO0O0 = new oO000o00(cameraCharacteristics);
        } else {
            this.f960OooO0O0 = new oO0O0OoO(cameraCharacteristics);
        }
        this.f961OooO0OO = str;
    }

    @Nullable
    public final <T> T OooO00o(@NonNull CameraCharacteristics.Key<T> key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return (T) this.f960OooO0O0.f977OooO00o.get(key);
        }
        synchronized (this) {
            T t = (T) this.f959OooO00o.get(key);
            if (t != null) {
                return t;
            }
            T t2 = (T) this.f960OooO0O0.f977OooO00o.get(key);
            if (t2 != null) {
                this.f959OooO00o.put(key, t2);
            }
            return t2;
        }
    }

    @NonNull
    public final oO0OO00o OooO0O0() {
        if (this.f962OooO0Oo == null) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) OooO00o(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null) {
                throw new IllegalArgumentException("StreamConfigurationMap is null!");
            }
            this.f962OooO0Oo = new oO0OO00o(streamConfigurationMap, new o0000(this.f961OooO0OO));
        }
        return this.f962OooO0Oo;
    }
}
