package p238o00oOooO;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.io.IOException;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;
import p219o00oO0O0.o0oOOo;
import p224o00oOOOo.oO0O0O0o;

/* JADX INFO: loaded from: classes.dex */
public final class oo00 implements o00000O0<GifDecoder, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0oOOo f34085OooO00o;

    public oo00(o0oOOo o0oooo2) {
        this.f34085OooO00o = o0oooo2;
    }

    @Override // p217o00oO00o.o00000O0
    public final o00OOOO0<Bitmap> OooO00o(@NonNull GifDecoder gifDecoder, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        return oO0O0O0o.OooO0O0(gifDecoder.OooO00o(), this.f34085OooO00o);
    }

    @Override // p217o00oO00o.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(@NonNull GifDecoder gifDecoder, @NonNull o00000 o00000Var) throws IOException {
        return true;
    }
}
