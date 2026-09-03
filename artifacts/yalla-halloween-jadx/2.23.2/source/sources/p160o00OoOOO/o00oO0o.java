package p160o00OoOOO;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.OooO00o;
import com.bumptech.glide.load.resource.bitmap.OooO0O0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o implements o0O0O00<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f38089OooO00o;

    public o00oO0o(OooO00o oooO00o) {
        this.f38089OooO00o = oooO00o;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final boolean OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        this.f38089OooO00o.getClass();
        return true;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final o00oOoo<Bitmap> OooO0O0(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        OooO00o oooO00o = this.f38089OooO00o;
        List<ImageHeaderParser> list = oooO00o.f13093OooO0Oo;
        return oooO00o.OooO00o(new OooO0O0.OooO00o(oooO00o.f13092OooO0OO, byteBuffer, list), i, i2, oo0o0oo, OooO00o.f13087OooOO0O);
    }
}
