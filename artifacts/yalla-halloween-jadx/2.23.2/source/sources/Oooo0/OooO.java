package Oooo0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import java.util.Set;
import p023Oooo00o.oO000o00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f399OooO00o;

    public interface OooO00o {
        @NonNull
        Set<DynamicRange> OooO00o();

        @Nullable
        DynamicRangeProfiles OooO0O0();

        @NonNull
        Set<DynamicRange> OooO0OO(@NonNull DynamicRange dynamicRange);
    }

    public OooO(@NonNull OooO00o oooO00o) {
        this.f399OooO00o = oooO00o;
    }

    @NonNull
    public static OooO OooO00o(@NonNull oO000o00 oo000o00) {
        DynamicRangeProfiles dynamicRangeProfilesOooO00o;
        int i = Build.VERSION.SDK_INT;
        OooO oooO = null;
        if (i >= 33 && (dynamicRangeProfilesOooO00o = OooO0o.OooO00o(oo000o00.OooO00o(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            o000OO.OooOOO0.OooO0o("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            oooO = new OooO(new OooOO0(dynamicRangeProfilesOooO00o));
        }
        return oooO == null ? OooOO0O.f403OooO00o : oooO;
    }
}
