package p165o00OoOoo;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.io.IOException;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooOO0;
import p160o00OoOOO.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o implements o0O0O00<GifDecoder, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f38202OooO00o;

    public o00O000o(OooOO0 oooOO1) {
        this.f38202OooO00o = oooOO1;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull GifDecoder gifDecoder, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return true;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final o00oOoo<Bitmap> OooO0O0(@NonNull GifDecoder gifDecoder, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return o00Ooo.OooO0O0(gifDecoder.OooO00o(), this.f38202OooO00o);
    }
}
