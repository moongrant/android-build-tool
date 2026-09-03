package p508o0o00oOo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000OO00 extends Drawable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public RectF f41861OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Paint f41863OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Paint f41864OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f41865OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f41867OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final int[] f41869OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f41862OooO00o = 1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f41866OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f41868OooO0oO = 0;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f41870OooO00o = 12;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f41871OooO0O0 = Color.parseColor("#4d000000");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f41872OooO0OO = 18;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public int[] f41873OooO0Oo = {0};
    }

    public o000OO00(int[] iArr, int i, int i2, int i3) {
        this.f41869OooO0oo = iArr;
        this.f41867OooO0o0 = i;
        this.f41865OooO0Oo = i3;
        Paint paint = new Paint();
        this.f41863OooO0O0 = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        float f = 0;
        paint.setShadowLayer(i3, f, f, i2);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        Paint paint2 = new Paint();
        this.f41864OooO0OO = paint2;
        paint2.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int[] iArr = this.f41869OooO0oo;
        if (iArr != null) {
            if (iArr.length == 1) {
                this.f41864OooO0OO.setColor(iArr[0]);
            } else {
                Paint paint = this.f41864OooO0OO;
                RectF rectF = this.f41861OooO;
                Intrinsics.checkNotNull(rectF);
                float f = rectF.left;
                RectF rectF2 = this.f41861OooO;
                Intrinsics.checkNotNull(rectF2);
                float f2 = 2;
                float fHeight = rectF2.height() / f2;
                RectF rectF3 = this.f41861OooO;
                Intrinsics.checkNotNull(rectF3);
                float f3 = rectF3.right;
                RectF rectF4 = this.f41861OooO;
                Intrinsics.checkNotNull(rectF4);
                paint.setShader(new LinearGradient(f, fHeight, f3, rectF4.height() / f2, this.f41869OooO0oo, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        if (this.f41862OooO00o == 1) {
            RectF rectF5 = this.f41861OooO;
            Intrinsics.checkNotNull(rectF5);
            int i = this.f41867OooO0o0;
            canvas.drawRoundRect(rectF5, i, i, this.f41863OooO0O0);
            RectF rectF6 = this.f41861OooO;
            Intrinsics.checkNotNull(rectF6);
            int i2 = this.f41867OooO0o0;
            canvas.drawRoundRect(rectF6, i2, i2, this.f41864OooO0OO);
            return;
        }
        RectF rectF7 = this.f41861OooO;
        Intrinsics.checkNotNull(rectF7);
        float fCenterX = rectF7.centerX();
        RectF rectF8 = this.f41861OooO;
        Intrinsics.checkNotNull(rectF8);
        float fCenterY = rectF8.centerY();
        RectF rectF9 = this.f41861OooO;
        Intrinsics.checkNotNull(rectF9);
        float fWidth = rectF9.width();
        RectF rectF10 = this.f41861OooO;
        Intrinsics.checkNotNull(rectF10);
        float f4 = 2;
        canvas.drawCircle(fCenterX, fCenterY, Math.min(fWidth, rectF10.height()) / f4, this.f41863OooO0O0);
        RectF rectF11 = this.f41861OooO;
        Intrinsics.checkNotNull(rectF11);
        float fCenterX2 = rectF11.centerX();
        RectF rectF12 = this.f41861OooO;
        Intrinsics.checkNotNull(rectF12);
        float fCenterY2 = rectF12.centerY();
        RectF rectF13 = this.f41861OooO;
        Intrinsics.checkNotNull(rectF13);
        float fWidth2 = rectF13.width();
        RectF rectF14 = this.f41861OooO;
        Intrinsics.checkNotNull(rectF14);
        canvas.drawCircle(fCenterX2, fCenterY2, Math.min(fWidth2, rectF14.height()) / f4, this.f41864OooO0OO);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f41863OooO0O0.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.f41865OooO0Oo;
        int i6 = this.f41866OooO0o;
        int i7 = this.f41868OooO0oO;
        this.f41861OooO = new RectF((i + i5) - i6, (i2 + i5) - i7, (i3 - i5) - i6, (i4 - i5) - i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f41863OooO0O0.setColorFilter(colorFilter);
    }
}
