package p133o00OO0oO;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import o00OO0O.OooO0O0;
import p126o00O0oOo.o00000;
import p127o00O0oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements o00O0O<Bitmap, byte[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Bitmap.CompressFormat f37316OooO00o = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f37317OooO0O0 = 100;

    @Override // p133o00OO0oO.o00O0O
    @Nullable
    public final o0000<byte[]> OooO00o(@NonNull o0000<Bitmap> o0000Var, @NonNull o00000 o00000Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o0000Var.get().compress(this.f37316OooO00o, this.f37317OooO0O0, byteArrayOutputStream);
        o0000Var.OooO00o();
        return new OooO0O0(byteArrayOutputStream.toByteArray());
    }
}
