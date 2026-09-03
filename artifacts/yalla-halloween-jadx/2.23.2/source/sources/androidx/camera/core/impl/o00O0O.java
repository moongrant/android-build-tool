package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.ExifData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O {
    @NonNull
    public static CaptureResult OooO00o() {
        return OooO00o();
    }

    public static void OooO0O0(o00Oo0 o00oo1, @NonNull ExifData.OooO0O0 oooO0O0) {
        int i;
        CameraCaptureMetaData$FlashState cameraCaptureMetaData$FlashStateOooO0Oo = o00oo1.OooO0Oo();
        if (cameraCaptureMetaData$FlashStateOooO0Oo == CameraCaptureMetaData$FlashState.UNKNOWN) {
            return;
        }
        int i2 = ExifData.OooO00o.f3791OooO00o[cameraCaptureMetaData$FlashStateOooO0Oo.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 32;
        } else {
            if (i2 != 3) {
                p028Oooo0oO.o00O0O0.OooO0oo("ExifData", "Unknown flash state: " + cameraCaptureMetaData$FlashStateOooO0Oo);
                return;
            }
            i = 1;
        }
        int i3 = i & 1;
        ArrayList arrayList = oooO0O0.f3797OooO00o;
        if (i3 == 1) {
            oooO0O0.OooO0OO("LightSource", String.valueOf(4), arrayList);
        }
        oooO0O0.OooO0OO("Flash", String.valueOf(i), arrayList);
    }
}
