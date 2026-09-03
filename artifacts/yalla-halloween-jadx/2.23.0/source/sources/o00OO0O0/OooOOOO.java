package o00OO0O0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p127o00O0oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements o00000O0<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.OooO00o f37208OooO00o;

    public OooOOOO(com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o) {
        this.f37208OooO00o = oooO00o;
    }

    @Override // p126o00O0oOo.o00000O0
    public final o0000<Bitmap> OooO00o(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o = this.f37208OooO00o;
        List<ImageHeaderParser> list = oooO00o.f10002OooO0Oo;
        return oooO00o.OooO00o(new com.bumptech.glide.load.resource.bitmap.OooO0O0.OooO00o(oooO00o.f10001OooO0OO, byteBuffer, list), i, i2, o00000Var, com.bumptech.glide.load.resource.bitmap.OooO00o.f9996OooOO0O);
    }

    @Override // p126o00O0oOo.o00000O0
    public final boolean OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull o00000 o00000Var) throws IOException {
        this.f37208OooO00o.getClass();
        return true;
    }
}
