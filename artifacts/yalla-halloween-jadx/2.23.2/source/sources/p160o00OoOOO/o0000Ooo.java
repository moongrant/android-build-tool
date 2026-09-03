package p160o00OoOOO;

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
import p154o00Oo0oo.o0OOO0o;
import p156o00OoO00.OooOO0;
import p174o00OooOo.o00OO00O;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo extends oo000o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f38083OooO0OO = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(o0OOO0o.f37833OooO00o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38084OooO0O0;

    public o0000Ooo(int i) {
        o00OO00O.OooO00o(i > 0, "roundingRadius must be greater than 0.");
        this.f38084OooO0O0 = i;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f38083OooO0OO);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f38084OooO0O0).array());
    }

    @Override // p160o00OoOOO.oo000o
    public final Bitmap OooO0OO(@NonNull OooOO0 oooOO1, @NonNull Bitmap bitmap, int i, int i2) {
        Bitmap bitmapOooO0o0;
        Paint paint = o0000.f38050OooO00o;
        int i3 = this.f38084OooO0O0;
        o00OO00O.OooO00o(i3 > 0, "roundingRadius must be greater than 0.");
        int i4 = Build.VERSION.SDK_INT;
        Bitmap.Config config = (i4 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = (i4 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
        if (config2.equals(bitmap.getConfig())) {
            bitmapOooO0o0 = bitmap;
        } else {
            bitmapOooO0o0 = oooOO1.OooO0o0(bitmap.getWidth(), bitmap.getHeight(), config2);
            new Canvas(bitmapOooO0o0).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapOooO0o1 = oooOO1.OooO0o0(bitmapOooO0o0.getWidth(), bitmapOooO0o0.getHeight(), config);
        bitmapOooO0o1.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapOooO0o0, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapOooO0o1.getWidth(), bitmapOooO0o1.getHeight());
        Lock lock = o0000.f38051OooO0O0;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapOooO0o1);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapOooO0o0.equals(bitmap)) {
                oooOO1.OooO0Oo(bitmapOooO0o0);
            }
            return bitmapOooO0o1;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        return (obj instanceof o0000Ooo) && this.f38084OooO0O0 == ((o0000Ooo) obj).f38084OooO0O0;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        char[] cArr = o00OO0O0.f38351OooO00o;
        return ((this.f38084OooO0O0 + 527) * 31) - 569625254;
    }
}
