package o00OO0O0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p127o00O0oo.o0000;
import p129o00O0ooo.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 28)
public final class OooOO0O implements o00000O0<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O0 f37205OooO00o = new o0000O0();

    @Override // p126o00O0oOo.o00000O0
    public final /* bridge */ /* synthetic */ o0000<Bitmap> OooO00o(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        return OooO0OO(OooO0o.OooO00o(source), i, i2, o00000Var);
    }

    @Override // p126o00O0oOo.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(@NonNull ImageDecoder.Source source, @NonNull o00000 o00000Var) throws IOException {
        OooO.OooO00o(source);
        return true;
    }

    public final OooOOO0 OooO0OO(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new o00OO0.OooOO0O(i, i2, o00000Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new OooOOO0(bitmapDecodeBitmap, this.f37205OooO00o);
    }
}
