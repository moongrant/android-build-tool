package p160o00OoOOO;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooOO0O;
import p158o00OoOO.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 28)
public final class o00Oo0 implements o0O0O00<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f38086OooO00o = new OooOO0O();

    @Override // p154o00Oo0oo.o0O0O00
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull ImageDecoder.Source source, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        o0OoOo0.OooO00o(source);
        return true;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final /* bridge */ /* synthetic */ o00oOoo<Bitmap> OooO0O0(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return OooO0OO(o000oOoO.OooO00o(source), i, i2, oo0o0oo);
    }

    public final o00Ooo OooO0OO(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new o00O0O(i, i2, oo0o0oo));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new o00Ooo(bitmapDecodeBitmap, this.f38086OooO00o);
    }
}
