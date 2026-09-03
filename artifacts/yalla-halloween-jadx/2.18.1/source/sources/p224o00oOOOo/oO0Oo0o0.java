package p224o00oOOOo;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p217o00oO00o.o000000;
import p219o00oO0O0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class oO0Oo0o0 extends oOo0oooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f33814OooO0O0 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(o000000.f33631OooO00o);

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f33814OooO0O0);
    }

    @Override // p224o00oOOOo.oOo0oooO
    public final Bitmap OooO0OO(@NonNull o0oOOo o0oooo2, @NonNull Bitmap bitmap, int i, int i2) {
        return oOO000.OooO0O0(o0oooo2, bitmap, i, i2);
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        return obj instanceof oO0Oo0o0;
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        return 1572326941;
    }
}
