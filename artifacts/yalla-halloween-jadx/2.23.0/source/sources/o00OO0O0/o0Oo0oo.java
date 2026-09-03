package o00OO0O0;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p129o00O0ooo.o0000oo;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo extends OooOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f37243OooO0OO = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(p126o00O0oOo.o000OOo.f36731OooO00o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f37244OooO0O0;

    public o0Oo0oo(int i) {
        o0000O00.OooO00o(i > 0, "roundingRadius must be greater than 0.");
        this.f37244OooO0O0 = i;
    }

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f37243OooO0OO);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f37244OooO0O0).array());
    }

    @Override // o00OO0O0.OooOOO
    public final Bitmap OooO0OO(@NonNull o0000oo o0000ooVar, @NonNull Bitmap bitmap, int i, int i2) {
        Bitmap bitmapOooO0o0;
        Paint paint = o0OO00O.f37239OooO00o;
        int i3 = this.f37244OooO0O0;
        o0000O00.OooO00o(i3 > 0, "roundingRadius must be greater than 0.");
        int i4 = Build.VERSION.SDK_INT;
        Bitmap.Config config = (i4 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = (i4 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
        if (config2.equals(bitmap.getConfig())) {
            bitmapOooO0o0 = bitmap;
        } else {
            bitmapOooO0o0 = o0000ooVar.OooO0o0(bitmap.getWidth(), bitmap.getHeight(), config2);
            new Canvas(bitmapOooO0o0).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapOooO0o1 = o0000ooVar.OooO0o0(bitmapOooO0o0.getWidth(), bitmapOooO0o0.getHeight(), config);
        bitmapOooO0o1.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapOooO0o0, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapOooO0o1.getWidth(), bitmapOooO0o1.getHeight());
        Lock lock = o0OO00O.f37240OooO0O0;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapOooO0o1);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapOooO0o0.equals(bitmap)) {
                o0000ooVar.OooO0Oo(bitmapOooO0o0);
            }
            return bitmapOooO0o1;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        return (obj instanceof o0Oo0oo) && this.f37244OooO0O0 == ((o0Oo0oo) obj).f37244OooO0O0;
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        char[] cArr = p532o0o0Oo.o0000oo.f54571OooO00o;
        return ((this.f37244OooO0O0 + 527) * 31) - 569625254;
    }
}
