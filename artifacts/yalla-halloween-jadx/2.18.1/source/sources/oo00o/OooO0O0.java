package oo00o;

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
import android.os.SystemClock;
import coil.size.Scale;
import coil.transform.PixelOpacity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103o000oo00.OooOO0O;
import p115o00O00oO.Oooo000;
import p119o00O0Oo0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Scale f53285Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Movie f53286Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final p113o00O00Oo.OooO0O0 f53287Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f53288Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Rect f53289OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final List<OooOO0O> f53290OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final Paint f53291OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final Rect f53292OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public Canvas f53293OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f53294OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f53295OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f53296OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f53297OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f53298OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f53299Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f53300Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f53301OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public o00O0OOO.OooO00o f53302OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public Picture f53303OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f53304Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public PixelOpacity f53305Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public Bitmap f53306o000oOoO;

    @JvmOverloads
    public OooO0O0(@NotNull Movie movie, @NotNull p113o00O00Oo.OooO0O0 pool, @NotNull Bitmap.Config config, @NotNull Scale scale) {
        Intrinsics.checkNotNullParameter(movie, "movie");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.f53286Oooo0o = movie;
        this.f53287Oooo0oO = pool;
        this.f53288Oooo0oo = config;
        this.f53285Oooo = scale;
        this.f53291OoooO00 = new Paint(3);
        this.f53290OoooO0 = new ArrayList();
        this.f53292OoooO0O = new Rect();
        this.f53289OoooO = new Rect();
        this.f53294OoooOOO = 1.0f;
        this.f53295OoooOOo = 1.0f;
        this.f53301OooooO0 = -1;
        this.f53305Oooooo0 = PixelOpacity.UNCHANGED;
        if (!(!oo000o.OooO00o(config))) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.".toString());
        }
    }

    public final void OooO00o(Canvas canvas) {
        Canvas canvas2 = this.f53293OoooOO0;
        Bitmap bitmap = this.f53306o000oOoO;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.f53294OoooOOO;
            canvas2.scale(f, f);
            this.f53286Oooo0o.draw(canvas2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f53291OoooO00);
            Picture picture = this.f53303OooooOo;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.f53296OoooOo0, this.f53297OoooOoO);
                float f2 = this.f53295OoooOOo;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f53291OoooO00);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    public final void OooO0O0() {
        this.f53302OooooOO = null;
        this.f53303OooooOo = null;
        this.f53305Oooooo0 = PixelOpacity.UNCHANGED;
        this.f53304Oooooo = false;
        invalidateSelf();
    }

    public final void OooO0OO(Rect rect) {
        if (Intrinsics.areEqual(this.f53292OoooO0O, rect)) {
            return;
        }
        this.f53292OoooO0O.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int iWidth2 = this.f53286Oooo0o.width();
        int iHeight2 = this.f53286Oooo0o.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        double dOooO0O0 = Oooo000.OooO0O0(iWidth2, iHeight2, iWidth, iHeight, this.f53285Oooo);
        if (!this.f53304Oooooo) {
            dOooO0O0 = RangesKt___RangesKt.coerceAtMost(dOooO0O0, 1.0d);
        }
        float f = (float) dOooO0O0;
        this.f53294OoooOOO = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapOooO0OO = this.f53287Oooo0oO.OooO0OO(i, i2, this.f53288Oooo0oo);
        Bitmap bitmap = this.f53306o000oOoO;
        if (bitmap != null) {
            this.f53287Oooo0oO.OooO0O0(bitmap);
        }
        this.f53306o000oOoO = bitmapOooO0OO;
        this.f53293OoooOO0 = new Canvas(bitmapOooO0OO);
        if (this.f53304Oooooo) {
            this.f53295OoooOOo = 1.0f;
            this.f53296OoooOo0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f53297OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            return;
        }
        float fOooO0O0 = (float) Oooo000.OooO0O0(i, i2, iWidth, iHeight, this.f53285Oooo);
        this.f53295OoooOOo = fOooO0O0;
        float f2 = iWidth - (i * fOooO0O0);
        float f3 = 2;
        this.f53296OoooOo0 = (f2 / f3) + rect.left;
        this.f53297OoooOoO = ((iHeight - (fOooO0O0 * i2)) / f3) + rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iDuration = this.f53286Oooo0o.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z = false;
        } else {
            if (this.f53298OoooOoo) {
                this.f53300Ooooo0o = SystemClock.uptimeMillis();
            }
            int i = (int) (this.f53300Ooooo0o - this.f53299Ooooo00);
            int i2 = i / iDuration;
            int i3 = this.f53301OooooO0;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                iDuration = i - (i2 * iDuration);
            }
        }
        this.f53286Oooo0o.setTime(iDuration);
        if (this.f53304Oooooo) {
            Rect rect = this.f53289OoooO;
            rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
            OooO0OO(rect);
            int iSave = canvas.save();
            try {
                float f = 1 / this.f53294OoooOOO;
                canvas.scale(f, f);
                OooO00o(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            Rect bounds = getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
            OooO0OO(bounds);
            OooO00o(canvas);
        }
        if (this.f53298OoooOoo && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f53286Oooo0o.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f53286Oooo0o.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        PixelOpacity pixelOpacity;
        return (this.f53291OoooO00.getAlpha() == 255 && ((pixelOpacity = this.f53305Oooooo0) == PixelOpacity.OPAQUE || (pixelOpacity == PixelOpacity.UNCHANGED && this.f53286Oooo0o.isOpaque()))) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f53298OoooOoo;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        boolean z = false;
        if (i >= 0 && i <= 255) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid alpha: ", Integer.valueOf(i)).toString());
        }
        this.f53291OoooO00.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f53291OoooO00.setColorFilter(colorFilter);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List, java.util.List<o000oo00.OooOO0O>] */
    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f53298OoooOoo) {
            return;
        }
        this.f53298OoooOoo = true;
        int i = 0;
        this.f53299Ooooo00 = SystemClock.uptimeMillis();
        ?? r1 = this.f53290OoooO0;
        int size = r1.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                ((OooOO0O) r1.get(i)).OooO0O0();
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List, java.util.List<o000oo00.OooOO0O>] */
    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (!this.f53298OoooOoo) {
            return;
        }
        int i = 0;
        this.f53298OoooOoo = false;
        ?? r1 = this.f53290OoooO0;
        int size = r1.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            ((OooOO0O) r1.get(i)).OooO00o();
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }
}
