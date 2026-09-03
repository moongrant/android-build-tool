package p123o00O0o0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import coil.size.Scale;
import coil.transform.PixelOpacity;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o00O.OooO00o;
import o00O00OO.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p124o00O0o00.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Movie f36483OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Scale f36484OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f36485OooO0o0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Canvas f36489OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Bitmap f36490OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f36493OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f36494OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f36495OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f36496OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f36497OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f36498OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public OooO00o f36499OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public Picture f36501OooOo0O;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Paint f36486OooO0oO = new Paint(3);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f36487OooO0oo = new ArrayList();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Rect f36482OooO = new Rect();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Rect f36488OooOO0 = new Rect();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f36492OooOOO0 = 1.0f;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f36491OooOOO = 1.0f;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f36500OooOo00 = -1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public PixelOpacity f36502OooOo0o = PixelOpacity.UNCHANGED;

    @JvmOverloads
    public Oooo0(@NotNull Movie movie, @NotNull Bitmap.Config config, @NotNull Scale scale) {
        this.f36483OooO0Oo = movie;
        this.f36485OooO0o0 = config;
        this.f36484OooO0o = scale;
        if (!(!(Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE))) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.".toString());
        }
    }

    public final void OooO00o(Canvas canvas) {
        Canvas canvas2 = this.f36489OooOO0O;
        Bitmap bitmap = this.f36490OooOO0o;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.f36492OooOOO0;
            canvas2.scale(f, f);
            Movie movie = this.f36483OooO0Oo;
            Paint paint = this.f36486OooO0oO;
            movie.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.f36501OooOo0O;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.f36493OooOOOO, this.f36494OooOOOo);
                float f2 = this.f36491OooOOO;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    public final void OooO0O0(Rect rect) {
        Rect rect2 = this.f36482OooO;
        if (Intrinsics.areEqual(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.f36483OooO0Oo;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        Scale scale = this.f36484OooO0o;
        double dOooO00o = OooOOO.OooO00o(iWidth2, iHeight2, iWidth, iHeight, scale);
        if (!this.f36498OooOo) {
            dOooO00o = RangesKt___RangesKt.coerceAtMost(dOooO00o, 1.0d);
        }
        float f = (float) dOooO00o;
        this.f36492OooOOO0 = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.f36485OooO0o0);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        Bitmap bitmap = this.f36490OooOO0o;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f36490OooOO0o = bitmapCreateBitmap;
        this.f36489OooOO0O = new Canvas(bitmapCreateBitmap);
        if (this.f36498OooOo) {
            this.f36491OooOOO = 1.0f;
            this.f36493OooOOOO = 0.0f;
            this.f36494OooOOOo = 0.0f;
            return;
        }
        float fOooO00o = (float) OooOOO.OooO00o(i, i2, iWidth, iHeight, scale);
        this.f36491OooOOO = fOooO00o;
        float f2 = iWidth - (i * fOooO00o);
        float f3 = 2;
        this.f36493OooOOOO = (f2 / f3) + rect.left;
        this.f36494OooOOOo = ((iHeight - (fOooO00o * i2)) / f3) + rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        boolean z;
        Movie movie = this.f36483OooO0Oo;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z = false;
        } else {
            if (this.f36496OooOOo0) {
                this.f36497OooOOoo = SystemClock.uptimeMillis();
            }
            int i = (int) (this.f36497OooOOoo - this.f36495OooOOo);
            int i2 = i / iDuration;
            int i3 = this.f36500OooOo00;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                iDuration = i - (i2 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.f36498OooOo) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.f36488OooOO0;
            rect.set(0, 0, width, height);
            OooO0O0(rect);
            int iSave = canvas.save();
            try {
                float f = 1 / this.f36492OooOOO0;
                canvas.scale(f, f);
                OooO00o(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            OooO0O0(getBounds());
            OooO00o(canvas);
        }
        if (this.f36496OooOOo0 && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f36483OooO0Oo.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f36483OooO0Oo.width();
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        PixelOpacity pixelOpacity;
        return (this.f36486OooO0oO.getAlpha() == 255 && ((pixelOpacity = this.f36502OooOo0o) == PixelOpacity.OPAQUE || (pixelOpacity == PixelOpacity.UNCHANGED && this.f36483OooO0Oo.isOpaque()))) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f36496OooOOo0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        boolean z = false;
        if (i >= 0 && i < 256) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid alpha: ", i).toString());
        }
        this.f36486OooO0oO.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f36486OooO0oO.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f36496OooOOo0) {
            return;
        }
        this.f36496OooOOo0 = true;
        this.f36495OooOOo = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f36487OooO0oo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OooO0OO) arrayList.get(i)).OooO0O0(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f36496OooOOo0) {
            this.f36496OooOOo0 = false;
            ArrayList arrayList = this.f36487OooO0oo;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((OooO0OO) arrayList.get(i)).OooO00o(this);
            }
        }
    }
}
