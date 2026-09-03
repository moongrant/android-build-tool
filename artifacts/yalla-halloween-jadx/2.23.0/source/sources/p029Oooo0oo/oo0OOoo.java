package p029Oooo0oo;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.OooOOO0;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.o000000O;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p031OoooO0.o00O0O;
import p031OoooO0.o0OO00O;
import p034OoooOO0.o0OoOo0;
import p037OoooOo0.o000O00O;
import p099o000oOoO.o00000;
import p099o000oOoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class oo0OOoo {
    @NonNull
    public final Object OooO00o(@NonNull Object obj) throws ImageCaptureException {
        o00O0O o00o0o2;
        boolean z;
        o0O.OooO0O0 oooO0O0 = (o0O.OooO0O0) obj;
        OooOOO0 oooOOO0OooO00o = oooO0O0.OooO00o();
        o0OO000 o0oo000OooO0O0 = oooO0O0.OooO0O0();
        if (oooOOO0OooO00o.getFormat() == 256) {
            try {
                o00O0O.OooO00o oooO00o = o00O0O.f1399OooO0O0;
                ByteBuffer byteBufferOooO0O0 = oooOOO0OooO00o.OooooOO()[0].OooO0O0();
                byteBufferOooO0O0.rewind();
                byte[] bArr = new byte[byteBufferOooO0O0.capacity()];
                byteBufferOooO0O0.get(bArr);
                o00O0O o00o0o3 = new o00O0O(new ExifInterface(new ByteArrayInputStream(bArr)));
                oooOOO0OooO00o.OooooOO()[0].OooO0O0().rewind();
                o00o0o2 = o00o0o3;
            } catch (IOException e) {
                throw new ImageCaptureException(e, "Failed to extract EXIF data.");
            }
        } else {
            o00o0o2 = null;
        }
        if (((o00000O0) o00000.OooO00o(o00000O0.class)) != null) {
            OooO0o oooO0o = o000000O.f3645OooO;
            z = false;
        } else {
            z = true;
        }
        if (!(z && oooOOO0OooO00o.getFormat() == 256)) {
            return o000O00O.OooO(oooOOO0OooO00o, o00o0o2, new Size(oooOOO0OooO00o.getWidth(), oooOOO0OooO00o.getHeight()), o0oo000OooO0O0.f1286OooO0O0, o0oo000OooO0O0.f1287OooO0OO, o0oo000OooO0O0.f1290OooO0o0, ((o0OoOo0) oooOOO0OooO00o.o00000OO()).f1461OooO00o);
        }
        o000OO.OooOOO0.OooO0o0(o00o0o2, "JPEG image must have exif.");
        Size size = new Size(oooOOO0OooO00o.getWidth(), oooOOO0OooO00o.getHeight());
        int iOooO0O0 = o0oo000OooO0O0.f1287OooO0OO - o00o0o2.OooO0O0();
        RectF rectF = o0OO00O.f1413OooO00o;
        Size size2 = o0OO00O.OooO0OO(((iOooO0O0 % 360) + 360) % 360) ? new Size(size.getHeight(), size.getWidth()) : size;
        Matrix matrixOooO00o = o0OO00O.OooO00o(iOooO0O0, new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), false);
        RectF rectF2 = new RectF(o0oo000OooO0O0.f1286OooO0O0);
        matrixOooO00o.mapRect(rectF2);
        rectF2.sort();
        Rect rect = new Rect();
        rectF2.round(rect);
        int iOooO0O1 = o00o0o2.OooO0O0();
        Matrix matrix = new Matrix(o0oo000OooO0O0.f1290OooO0o0);
        matrix.postConcat(matrixOooO00o);
        return o000O00O.OooO(oooOOO0OooO00o, o00o0o2, size2, rect, iOooO0O1, matrix, ((o0OoOo0) oooOOO0OooO00o.o00000OO()).f1461OooO00o);
    }
}
