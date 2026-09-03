package o00OO0O0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p127o00O0oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 28)
public final class OooOo00 implements o00000O0<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f37210OooO00o = new OooOO0O();

    @Override // p126o00O0oOo.o00000O0
    public final o0000<Bitmap> OooO00o(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        return this.f37210OooO00o.OooO0OO(ImageDecoder.createSource(byteBuffer), i, i2, o00000Var);
    }

    @Override // p126o00O0oOo.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull o00000 o00000Var) throws IOException {
        return true;
    }
}
