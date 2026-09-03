package p022Oooo00O;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.o00O0O;
import androidx.camera.core.impl.o00OOO0;
import androidx.camera.core.impl.o00Oo0;
import androidx.camera.core.impl.utils.ExifData;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOOO implements o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OOO0 f445OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CaptureResult f446OooO0O0;

    public OooOOOO(@NonNull o00OOO0 o00ooo1, @NonNull CaptureResult captureResult) {
        this.f445OooO00o = o00ooo1;
        this.f446OooO0O0 = captureResult;
    }

    @NonNull
    public final CameraCaptureMetaData$AfMode OooO() {
        Integer num = (Integer) this.f446OooO0O0.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return CameraCaptureMetaData$AfMode.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return CameraCaptureMetaData$AfMode.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return CameraCaptureMetaData$AfMode.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                o00O0O0.OooO0O0("C2CameraCaptureResult", "Undefined af mode: " + num);
                return CameraCaptureMetaData$AfMode.UNKNOWN;
            }
        }
        return CameraCaptureMetaData$AfMode.OFF;
    }

    @Override // androidx.camera.core.impl.o00Oo0
    public final void OooO00o(@NonNull ExifData.OooO0O0 oooO0O0) {
        String strValueOf;
        Integer num;
        o00O0O.OooO0O0(this, oooO0O0);
        CaptureResult.Key key = CaptureResult.SCALER_CROP_REGION;
        CaptureResult captureResult = this.f446OooO0O0;
        Rect rect = (Rect) captureResult.get(key);
        ArrayList arrayList = oooO0O0.f3797OooO00o;
        if (rect != null) {
            oooO0O0.OooO0OO("ImageWidth", String.valueOf(rect.width()), arrayList);
            oooO0O0.OooO0OO("ImageLength", String.valueOf(rect.height()), arrayList);
        }
        try {
            Integer num2 = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num2 != null) {
                oooO0O0.OooO0Oo(num2.intValue());
            }
        } catch (BufferUnderflowException unused) {
            o00O0O0.OooO0oo("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            oooO0O0.OooO0OO("ExposureTime", String.valueOf(l.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            oooO0O0.OooO0OO("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            oooO0O0.OooO0OO("SensitivityType", String.valueOf(3), arrayList);
            oooO0O0.OooO0OO("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            oooO0O0.OooO0OO("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            ExifData.WhiteBalanceMode whiteBalanceMode = ExifData.WhiteBalanceMode.AUTO;
            if (num3.intValue() == 0) {
                whiteBalanceMode = ExifData.WhiteBalanceMode.MANUAL;
            }
            int i = ExifData.OooO00o.f3792OooO0O0[whiteBalanceMode.ordinal()];
            if (i != 1) {
                strValueOf = i != 2 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            oooO0O0.OooO0OO("WhiteBalance", strValueOf, arrayList);
        }
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final o00OOO0 OooO0O0() {
        return this.f445OooO00o;
    }

    @Override // androidx.camera.core.impl.o00Oo0
    public final long OooO0OO() {
        Long l = (Long) this.f446OooO0O0.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final CameraCaptureMetaData$FlashState OooO0Oo() {
        Integer num = (Integer) this.f446OooO0O0.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return CameraCaptureMetaData$FlashState.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return CameraCaptureMetaData$FlashState.NONE;
        }
        if (iIntValue == 2) {
            return CameraCaptureMetaData$FlashState.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return CameraCaptureMetaData$FlashState.FIRED;
        }
        o00O0O0.OooO0O0("C2CameraCaptureResult", "Undefined flash state: " + num);
        return CameraCaptureMetaData$FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final CameraCaptureMetaData$AfState OooO0o() {
        Integer num = (Integer) this.f446OooO0O0.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return CameraCaptureMetaData$AfState.INACTIVE;
            case 1:
            case 3:
                return CameraCaptureMetaData$AfState.SCANNING;
            case 2:
                return CameraCaptureMetaData$AfState.PASSIVE_FOCUSED;
            case 4:
                return CameraCaptureMetaData$AfState.LOCKED_FOCUSED;
            case 5:
                return CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED;
            case 6:
                return CameraCaptureMetaData$AfState.PASSIVE_NOT_FOCUSED;
            default:
                o00O0O0.OooO0O0("C2CameraCaptureResult", "Undefined af state: " + num);
                return CameraCaptureMetaData$AfState.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final CaptureResult OooO0o0() {
        return this.f446OooO0O0;
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final CameraCaptureMetaData$AwbState OooO0oO() {
        Integer num = (Integer) this.f446OooO0O0.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AwbState.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return CameraCaptureMetaData$AwbState.INACTIVE;
        }
        if (iIntValue == 1) {
            return CameraCaptureMetaData$AwbState.METERING;
        }
        if (iIntValue == 2) {
            return CameraCaptureMetaData$AwbState.CONVERGED;
        }
        if (iIntValue == 3) {
            return CameraCaptureMetaData$AwbState.LOCKED;
        }
        o00O0O0.OooO0O0("C2CameraCaptureResult", "Undefined awb state: " + num);
        return CameraCaptureMetaData$AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final CameraCaptureMetaData$AeState OooO0oo() {
        Integer num = (Integer) this.f446OooO0O0.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AeState.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return CameraCaptureMetaData$AeState.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return CameraCaptureMetaData$AeState.CONVERGED;
            }
            if (iIntValue == 3) {
                return CameraCaptureMetaData$AeState.LOCKED;
            }
            if (iIntValue == 4) {
                return CameraCaptureMetaData$AeState.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                o00O0O0.OooO0O0("C2CameraCaptureResult", "Undefined ae state: " + num);
                return CameraCaptureMetaData$AeState.UNKNOWN;
            }
        }
        return CameraCaptureMetaData$AeState.SEARCHING;
    }
}
