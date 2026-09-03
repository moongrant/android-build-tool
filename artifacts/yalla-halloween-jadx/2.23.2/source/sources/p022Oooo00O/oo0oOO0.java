package p022Oooo00O;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.facebook.appevents.AppEventsConstants;
import java.util.List;
import p023Oooo00o.oO00o000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oo0oOO0 {
    public static String OooO00o(oO00o000 oo00o000, Integer num, List<String> list) throws CameraAccessExceptionCompat {
        if (num == null || !list.contains(AppEventsConstants.EVENT_PARAM_VALUE_NO) || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) oo00o000.OooO0O0(AppEventsConstants.EVENT_PARAM_VALUE_NO).OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) oo00o000.OooO0O0("1").OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        return null;
    }
}
