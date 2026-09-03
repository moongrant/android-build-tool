package p029Oooo0oo;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.OooOOO0;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.exifinterface.media.ExifInterface;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import p031OoooO0.o00O0O;
import p031OoooO0.o0OO00O;
import p037OoooOo0.o00000;
import p037OoooOo0.o000O00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0O00oO0 {

    @AutoValue
    public static abstract class OooO00o {
        public abstract int OooO00o();

        public abstract o000O00O<OooOOO0> OooO0O0();
    }

    public static o00000 OooO0O0(@NonNull o0O000 o0o001) {
        o000O00O<OooOOO0> o000o00o2 = o0o001.f1228OooO00o;
        OooOOO0 oooOOO0OooO0OO = o000o00o2.OooO0OO();
        if (oooOOO0OooO0OO.getFormat() != 256) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + oooOOO0OooO0OO.getFormat());
        }
        ByteBuffer byteBufferOooO0O0 = oooOOO0OooO0OO.OooooOO()[0].OooO0O0();
        byte[] bArr = new byte[byteBufferOooO0O0.capacity()];
        byteBufferOooO0O0.rewind();
        byteBufferOooO0O0.get(bArr);
        o00O0O o00o0oOooO0Oo = o000o00o2.OooO0Oo();
        Objects.requireNonNull(o00o0oOooO0Oo);
        return o000O00O.OooOO0(bArr, o00o0oOooO0Oo, o000o00o2.OooO0oo(), o000o00o2.OooO0O0(), o000o00o2.OooO0o(), o000o00o2.OooO0oO(), o000o00o2.OooO00o());
    }

    public static o00000 OooO0OO(@NonNull o0O000 o0o001) throws ImageCaptureException {
        o000O00O<OooOOO0> o000o00o2 = o0o001.f1228OooO00o;
        OooOOO0 oooOOO0OooO0OO = o000o00o2.OooO0OO();
        Rect rectOooO0O0 = o000o00o2.OooO0O0();
        try {
            byte[] bArrOooO00o = ImageUtil.OooO00o(oooOOO0OooO0OO, rectOooO0O0, o0o001.f1229OooO0O0, o000o00o2.OooO0o());
            try {
                o00O0O o00o0o2 = new o00O0O(new ExifInterface(new ByteArrayInputStream(bArrOooO00o)));
                Size size = new Size(rectOooO0O0.width(), rectOooO0O0.height());
                Rect rect = new Rect(0, 0, rectOooO0O0.width(), rectOooO0O0.height());
                int iOooO0o = o000o00o2.OooO0o();
                Matrix matrixOooO0oO = o000o00o2.OooO0oO();
                RectF rectF = o0OO00O.f1413OooO00o;
                Matrix matrix = new Matrix(matrixOooO0oO);
                matrix.postTranslate(-rectOooO0O0.left, -rectOooO0O0.top);
                return o000O00O.OooOO0(bArrOooO00o, o00o0o2, size, rect, iOooO0o, matrix, o000o00o2.OooO00o());
            } catch (IOException e) {
                throw new ImageCaptureException(e, "Failed to extract Exif from YUV-generated JPEG");
            }
        } catch (ImageUtil.CodecFailedException e2) {
            throw new ImageCaptureException(e2, "Failed to encode the image to JPEG.");
        }
    }

    @NonNull
    public final Object OooO00o(@NonNull Object obj) throws Exception {
        o00000 o00000VarOooO0OO;
        OooO00o oooO00o = (OooO00o) obj;
        try {
            int iOooO0o0 = oooO00o.OooO0O0().OooO0o0();
            if (iOooO0o0 == 35) {
                o00000VarOooO0OO = OooO0OO((o0O000) oooO00o);
            } else {
                if (iOooO0o0 != 256) {
                    throw new IllegalArgumentException("Unexpected format: " + iOooO0o0);
                }
                o00000VarOooO0OO = OooO0O0((o0O000) oooO00o);
            }
            oooO00o.OooO0O0().OooO0OO().close();
            return o00000VarOooO0OO;
        } catch (Throwable th) {
            oooO00o.OooO0O0().OooO0OO().close();
            throw th;
        }
    }
}
