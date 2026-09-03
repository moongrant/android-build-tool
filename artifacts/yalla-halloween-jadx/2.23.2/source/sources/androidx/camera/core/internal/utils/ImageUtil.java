package androidx.camera.core.internal.utils;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.OooOOO0;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.impl.utils.OooO00o;
import androidx.camera.core.impl.utils.OooO0O0;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p031OoooO0.oo000o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ImageUtil {

    public static final class CodecFailedException extends Exception {

        public enum FailureType {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException() {
            super("YuvImage failed to encode jpeg.");
        }
    }

    @NonNull
    public static byte[] OooO00o(@NonNull OooOOO0 oooOOO0, @Nullable Rect rect, @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i, int i2) throws CodecFailedException {
        if (oooOOO0.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + oooOOO0.getFormat());
        }
        OooOOO0.OooO00o oooO00o = oooOOO0.OooooOo()[0];
        OooOOO0.OooO00o oooO00o2 = oooOOO0.OooooOo()[1];
        OooOOO0.OooO00o oooO00o3 = oooOOO0.OooooOo()[2];
        ByteBuffer byteBufferOooO0O0 = oooO00o.OooO0O0();
        ByteBuffer byteBufferOooO0O1 = oooO00o2.OooO0O0();
        ByteBuffer byteBufferOooO0O2 = oooO00o3.OooO0O0();
        byteBufferOooO0O0.rewind();
        byteBufferOooO0O1.rewind();
        byteBufferOooO0O2.rewind();
        int iRemaining = byteBufferOooO0O0.remaining();
        byte[] bArr = new byte[((oooOOO0.getHeight() * oooOOO0.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i3 = 0; i3 < oooOOO0.getHeight(); i3++) {
            byteBufferOooO0O0.get(bArr, width, oooOOO0.getWidth());
            width += oooOOO0.getWidth();
            byteBufferOooO0O0.position(Math.min(iRemaining, oooO00o.OooO0OO() + (byteBufferOooO0O0.position() - oooOOO0.getWidth())));
        }
        int height = oooOOO0.getHeight() / 2;
        int width2 = oooOOO0.getWidth() / 2;
        int iOooO0OO = oooO00o3.OooO0OO();
        int iOooO0OO2 = oooO00o2.OooO0OO();
        int iOooO0Oo = oooO00o3.OooO0Oo();
        int iOooO0Oo2 = oooO00o2.OooO0Oo();
        byte[] bArr2 = new byte[iOooO0OO];
        byte[] bArr3 = new byte[iOooO0OO2];
        for (int i4 = 0; i4 < height; i4++) {
            byteBufferOooO0O2.get(bArr2, 0, Math.min(iOooO0OO, byteBufferOooO0O2.remaining()));
            byteBufferOooO0O1.get(bArr3, 0, Math.min(iOooO0OO2, byteBufferOooO0O1.remaining()));
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < width2; i7++) {
                int i8 = width + 1;
                bArr[width] = bArr2[i5];
                width = i8 + 1;
                bArr[i8] = bArr3[i6];
                i5 += iOooO0Oo;
                i6 += iOooO0Oo2;
            }
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, oooOOO0.getWidth(), oooOOO0.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        oo000o[] oo000oVarArr = ExifData.f3786OooO0OO;
        ExifData.OooO0O0 oooO0O0 = new ExifData.OooO0O0(ByteOrder.BIG_ENDIAN);
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = oooO0O0.f3797OooO00o;
        oooO0O0.OooO0OO("Orientation", strValueOf, arrayList);
        oooO0O0.OooO0OO("XResolution", "72/1", arrayList);
        oooO0O0.OooO0OO("YResolution", "72/1", arrayList);
        oooO0O0.OooO0OO("ResolutionUnit", String.valueOf(2), arrayList);
        oooO0O0.OooO0OO("YCbCrPositioning", String.valueOf(1), arrayList);
        oooO0O0.OooO0OO("Make", Build.MANUFACTURER, arrayList);
        oooO0O0.OooO0OO("Model", Build.MODEL, arrayList);
        if (oooOOO0.o00000Oo() != null) {
            oooOOO0.o00000Oo().OooO00o(oooO0O0);
        }
        oooO0O0.OooO0Oo(i2);
        oooO0O0.OooO0OO("ImageWidth", String.valueOf(oooOOO0.getWidth()), arrayList);
        oooO0O0.OooO0OO("ImageLength", String.valueOf(oooOOO0.getHeight()), arrayList);
        ArrayList list = Collections.list(new OooO00o(oooO0O0));
        if (!((Map) list.get(1)).isEmpty()) {
            oooO0O0.OooO0O0("ExposureProgram", String.valueOf(0), list);
            oooO0O0.OooO0O0("ExifVersion", "0230", list);
            oooO0O0.OooO0O0("ComponentsConfiguration", "1,2,3,0", list);
            oooO0O0.OooO0O0("MeteringMode", String.valueOf(0), list);
            oooO0O0.OooO0O0("LightSource", String.valueOf(0), list);
            oooO0O0.OooO0O0("FlashpixVersion", "0100", list);
            oooO0O0.OooO0O0("FocalPlaneResolutionUnit", String.valueOf(2), list);
            oooO0O0.OooO0O0("FileSource", String.valueOf(3), list);
            oooO0O0.OooO0O0("SceneType", String.valueOf(1), list);
            oooO0O0.OooO0O0("CustomRendered", String.valueOf(0), list);
            oooO0O0.OooO0O0("SceneCaptureType", String.valueOf(0), list);
            oooO0O0.OooO0O0("Contrast", String.valueOf(0), list);
            oooO0O0.OooO0O0("Saturation", String.valueOf(0), list);
            oooO0O0.OooO0O0("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            oooO0O0.OooO0O0("GPSVersionID", "2300", list);
            oooO0O0.OooO0O0("GPSSpeedRef", "K", list);
            oooO0O0.OooO0O0("GPSTrackRef", "T", list);
            oooO0O0.OooO0O0("GPSImgDirectionRef", "T", list);
            oooO0O0.OooO0O0("GPSDestBearingRef", "T", list);
            oooO0O0.OooO0O0("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, oooOOO0.getWidth(), oooOOO0.getHeight()) : rect, i, new OooO0O0(byteArrayOutputStream, new ExifData(oooO0O0.f3798OooO0O0, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException();
    }
}
