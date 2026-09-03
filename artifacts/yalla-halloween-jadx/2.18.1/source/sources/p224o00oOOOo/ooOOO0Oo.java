package p224o00oOOOo;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.security.MessageDigest;
import p217o00oO00o.o000000;
import p219o00oO0O0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class ooOOO0Oo extends oOo0oooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f33852OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(o000000.f33631OooO00o);

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f33852OooO0O0);
    }

    @Override // p224o00oOOOo.oOo0oooO
    public final Bitmap OooO0OO(@NonNull o0oOOo o0oooo2, @NonNull Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = oOO000.f33835OooO00o;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width2 = bitmap.getWidth() * i2;
        int height2 = bitmap.getHeight() * i;
        float width3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (width2 > height2) {
            width = i2 / bitmap.getHeight();
            width3 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width3 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapOooO0OO = o0oooo2.OooO0OO(i, i2, oOO000.OooO0OO(bitmap));
        bitmapOooO0OO.setHasAlpha(bitmap.hasAlpha());
        oOO000.OooO00o(bitmap, bitmapOooO0OO, matrix);
        return bitmapOooO0OO;
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        return obj instanceof ooOOO0Oo;
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        return -599754482;
    }
}
