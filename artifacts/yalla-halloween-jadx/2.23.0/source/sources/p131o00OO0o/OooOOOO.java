package p131o00OO0o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.io.IOException;
import o00OO0O0.OooOOO0;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p127o00O0oo.o0000;
import p129o00O0ooo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements o00000O0<GifDecoder, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000oo f37308OooO00o;

    public OooOOOO(o0000oo o0000ooVar) {
        this.f37308OooO00o = o0000ooVar;
    }

    @Override // p126o00O0oOo.o00000O0
    public final o0000<Bitmap> OooO00o(@NonNull GifDecoder gifDecoder, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        return OooOOO0.OooO0OO(gifDecoder.OooO00o(), this.f37308OooO00o);
    }

    @Override // p126o00O0oOo.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(@NonNull GifDecoder gifDecoder, @NonNull o00000 o00000Var) throws IOException {
        return true;
    }
}
