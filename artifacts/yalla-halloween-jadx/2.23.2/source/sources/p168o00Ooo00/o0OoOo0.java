package p168o00Ooo00;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.oo0o0Oo;
import p161o00OoOOo.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements oo000o<Bitmap, byte[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Bitmap.CompressFormat f38228OooO00o = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38229OooO0O0 = 100;

    @Override // p168o00Ooo00.oo000o
    @Nullable
    public final o00oOoo<byte[]> OooO00o(@NonNull o00oOoo<Bitmap> o00oooo2, @NonNull oo0o0Oo oo0o0oo) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o00oooo2.get().compress(this.f38228OooO00o, this.f38229OooO0O0, byteArrayOutputStream);
        o00oooo2.OooO00o();
        return new o0000O(byteArrayOutputStream.toByteArray());
    }
}
