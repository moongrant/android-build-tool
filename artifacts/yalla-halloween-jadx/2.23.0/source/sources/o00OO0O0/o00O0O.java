package o00OO0O0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p129o00O0ooo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends OooOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f37225OooO0O0 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(p126o00O0oOo.o000OOo.f36731OooO00o);

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f37225OooO0O0);
    }

    @Override // o00OO0O0.OooOOO
    public final Bitmap OooO0OO(@NonNull o0000oo o0000ooVar, @NonNull Bitmap bitmap, int i, int i2) {
        return o0OO00O.OooO0O0(o0000ooVar, bitmap, i, i2);
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        return obj instanceof o00O0O;
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        return 1572326941;
    }
}
