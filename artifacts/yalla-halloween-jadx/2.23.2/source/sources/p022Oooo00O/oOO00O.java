package p022Oooo00O;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00O0OO;
import androidx.camera.core.impl.o00Oo0;
import androidx.camera.core.impl.oo0O;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p026Oooo0o.OooOo00;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oOO00O {

    @RequiresApi(23)
    public static class OooO00o {
        @DoNotInline
        public static CaptureRequest.Builder OooO00o(@NonNull CameraDevice cameraDevice, @NonNull TotalCaptureResult totalCaptureResult) throws CameraAccessException {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public static void OooO00o(CaptureRequest.Builder builder, Config config) {
        OooOo00 oooOo00OooO0OO = OooOo00.OooO00o.OooO0Oo(config).OooO0OO();
        for (Config.OooO00o oooO00o : o00O0OO.OooO0O0(oooOo00OooO0OO)) {
            CaptureRequest.Key key = (CaptureRequest.Key) oooO00o.OooO0OO();
            try {
                builder.set(key, o00O0OO.OooO0OO(oooOo00OooO0OO, oooO00o));
            } catch (IllegalArgumentException unused) {
                o00O0O0.OooO0O0("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    @Nullable
    public static CaptureRequest OooO0O0(@NonNull o000000O o000000o2, @Nullable CameraDevice cameraDevice, @NonNull HashMap map) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        o00Oo0 o00oo1;
        if (cameraDevice == null) {
            return null;
        }
        List<DeferrableSurface> listOooO00o = o000000o2.OooO00o();
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = listOooO00o.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i = o000000o2.f3648OooO0OO;
        if (i == 5 && (o00oo1 = o000000o2.f3653OooO0oo) != null && (o00oo1.OooO0o0() instanceof TotalCaptureResult)) {
            o00O0O0.OooO00o("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = OooO00o.OooO00o(cameraDevice, (TotalCaptureResult) o00oo1.OooO0o0());
        } else {
            o00O0O0.OooO00o("Camera2CaptureRequestBuilder", "createCaptureRequest");
            builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        }
        Config config = o000000o2.f3647OooO0O0;
        OooO00o(builderCreateCaptureRequest, config);
        if (!OooOo00.OooO00o.OooO0Oo(config).OooO0OO().OooO0o0(Oooo000.OooO00o.Oooo0O0(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE))) {
            Range<Integer> range = oo0O.f3780OooO00o;
            Range<Integer> range2 = o000000o2.f3649OooO0Oo;
            if (!range2.equals(range)) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            }
        }
        OooO0o oooO0o = o000000O.f3644OooO;
        if (config.OooO0o0(oooO0o)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) config.OooO0O0(oooO0o));
        }
        OooO0o oooO0o2 = o000000O.f3645OooOO0;
        if (config.OooO0o0(oooO0o2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) config.OooO0O0(oooO0o2)).byteValue()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(o000000o2.f3652OooO0oO);
        return builderCreateCaptureRequest.build();
    }
}
