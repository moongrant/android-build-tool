package p230o00oOo0O;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p226o00oOOo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements OooOo00<Bitmap, byte[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Bitmap.CompressFormat f33897OooO00o = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f33898OooO0O0 = 100;

    @Override // p230o00oOo0O.OooOo00
    @Nullable
    public final o00OOOO0<byte[]> OooO00o(@NonNull o00OOOO0<Bitmap> o00oooo1, @NonNull o00000 o00000Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o00oooo1.get().compress(this.f33897OooO00o, this.f33898OooO0O0, byteArrayOutputStream);
        o00oooo1.OooO00o();
        return new o0oOOo(byteArrayOutputStream.toByteArray());
    }
}
