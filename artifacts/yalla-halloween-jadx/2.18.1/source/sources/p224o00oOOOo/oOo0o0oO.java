package p224o00oOOOo;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
public final class oOo0o0oO implements o00000O0<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0O0O00 f33850OooO00o = new oO0O0O00();

    @Override // p217o00oO00o.o00000O0
    @Nullable
    public final o00OOOO0<Bitmap> OooO00o(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        return this.f33850OooO00o.OooO00o(ImageDecoder.createSource(byteBuffer), i, i2, o00000Var);
    }

    @Override // p217o00oO00o.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull o00000 o00000Var) throws IOException {
        return true;
    }
}
