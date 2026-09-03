package p224o00oOOOo;

import OooO00o.OooO00o;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import p214o00oO0.o00OOOO0;
import p219o00oO0O0.o0O0o;
import p223o00oOOOO.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
public final class oO0O0O00 extends oO0O00<Bitmap> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0o f33808OooO0O0 = new o0O0o();

    @Override // p223o00oOOOO.oO0O00
    public final o00OOOO0<Bitmap> OooO0OO(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Decoded [");
            sbOooO0o0.append(bitmapDecodeBitmap.getWidth());
            sbOooO0o0.append("x");
            sbOooO0o0.append(bitmapDecodeBitmap.getHeight());
            sbOooO0o0.append("] for [");
            sbOooO0o0.append(i);
            sbOooO0o0.append("x");
            sbOooO0o0.append(i2);
            sbOooO0o0.append("]");
            Log.v("BitmapImageDecoder", sbOooO0o0.toString());
        }
        return new oO0O0O0o(bitmapDecodeBitmap, this.f33808OooO0O0);
    }
}
