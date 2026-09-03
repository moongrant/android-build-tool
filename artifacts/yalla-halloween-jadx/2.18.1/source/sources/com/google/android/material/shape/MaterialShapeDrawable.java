package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.ULong;
import p084o000Ooo.o0Oo0oo;
import p343o0OO0ooO.o0OOOO0o;
import p347o0OOO0o0.o00000;
import p347o0OOO0o0.o000000;
import p347o0OOO0o0.o00oO0o;
import p347o0OOO0o0.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialShapeDrawable extends Drawable implements o0Oo0oo, o00000 {

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final String f17507Ooooooo = MaterialShapeDrawable.class.getSimpleName();

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final Paint f17508o0OoOo0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final BitSet f17509Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0O0 f17510Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO0OO.OooOO0O[] f17511Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO0OO.OooOO0O[] f17512Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Path f17513OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Matrix f17514OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f17515OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Path f17516OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final RectF f17517OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final Region f17518OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final Region f17519OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public com.google.android.material.shape.OooO00o f17520OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final Paint f17521OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final Paint f17522OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final p345o0OOO0Oo.OooO0OO f17523Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NonNull
    public final OooO00o f17524Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final com.google.android.material.shape.OooO0O0 f17525OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f17526OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f17527OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NonNull
    public final RectF f17528Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f17529Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f17530OoooooO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final RectF f17531o000oOoO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    public class OooO00o implements com.google.android.material.shape.OooO0O0.InterfaceC0111OooO0O0 {
        public OooO00o() {
        }
    }

    static {
        Paint paint = new Paint(1);
        f17508o0OoOo0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new com.google.android.material.shape.OooO00o());
    }

    @NonNull
    public final RectF OooO() {
        this.f17531o000oOoO.set(OooO0oo());
        float strokeWidth = OooOO0o() ? this.f17522OoooOoo.getStrokeWidth() / 2.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f17531o000oOoO.inset(strokeWidth, strokeWidth);
        return this.f17531o000oOoO;
    }

    public final void OooO0O0(@NonNull RectF rectF, @NonNull Path path) {
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17525OooooO0;
        OooO0O0 oooO0O1 = this.f17510Oooo0o;
        oooO0O0.OooO0O0(oooO0O1.f17534OooO00o, oooO0O1.f17542OooOO0, rectF, this.f17524Ooooo0o, path);
        if (this.f17510Oooo0o.f17533OooO != 1.0f) {
            this.f17514OoooO0.reset();
            Matrix matrix = this.f17514OoooO0;
            float f = this.f17510Oooo0o.f17533OooO;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f17514OoooO0);
        }
        path.computeBounds(this.f17528Oooooo, true);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    @NonNull
    public final PorterDuffColorFilter OooO0OO(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = OooO0Oo(colorForState);
            }
            this.f17529Oooooo0 = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            int iOooO0Oo = OooO0Oo(color);
            this.f17529Oooooo0 = iOooO0Oo;
            if (iOooO0Oo != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(iOooO0Oo, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int OooO0Oo(@ColorInt int i) {
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        float f = oooO0O0.f17545OooOOO + oooO0O0.f17547OooOOOO + oooO0O0.f17546OooOOO0;
        o0OOOO0o o0oooo0o2 = oooO0O0.f17535OooO0O0;
        return o0oooo0o2 != null ? o0oooo0o2.OooO00o(i, f) : i;
    }

    public final void OooO0o(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull com.google.android.material.shape.OooO00o oooO00o, @NonNull RectF rectF) {
        if (!oooO00o.OooO0o(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fOooO00o = oooO00o.f17560OooO0o.OooO00o(rectF) * this.f17510Oooo0o.f17542OooOO0;
            canvas.drawRoundRect(rectF, fOooO00o, fOooO00o, paint);
        }
    }

    public final void OooO0o0(@NonNull Canvas canvas) {
        if (this.f17509Oooo.cardinality() > 0) {
            Log.w(f17507Ooooooo, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f17510Oooo0o.f17549OooOOo != 0) {
            canvas.drawPath(this.f17516OoooO0O, this.f17523Ooooo00.f38138OooO00o);
        }
        for (int i = 0; i < 4; i++) {
            OooO0OO.OooOO0O oooOO0O = this.f17511Oooo0oO[i];
            p345o0OOO0Oo.OooO0OO oooO0OO = this.f17523Ooooo00;
            int i2 = this.f17510Oooo0o.f17550OooOOo0;
            Matrix matrix = OooO0OO.OooOO0O.f17616OooO00o;
            oooOO0O.OooO00o(matrix, oooO0OO, i2, canvas);
            this.f17512Oooo0oo[i].OooO00o(matrix, this.f17523Ooooo00, this.f17510Oooo0o.f17550OooOOo0, canvas);
        }
        if (this.f17530OoooooO) {
            OooO0O0 oooO0O0 = this.f17510Oooo0o;
            int iSin = (int) (Math.sin(Math.toRadians(oooO0O0.f17551OooOOoo)) * ((double) oooO0O0.f17549OooOOo));
            int iOooOO0 = OooOO0();
            canvas.translate(-iSin, -iOooOO0);
            canvas.drawPath(this.f17516OoooO0O, f17508o0OoOo0);
            canvas.translate(iSin, iOooOO0);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0oO(@NonNull Canvas canvas) {
        OooO0o(canvas, this.f17522OoooOoo, this.f17513OoooO, this.f17520OoooOo0, OooO());
    }

    @NonNull
    public final RectF OooO0oo() {
        this.f17517OoooOO0.set(getBounds());
        return this.f17517OoooOO0;
    }

    public final int OooOO0() {
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        return (int) (Math.cos(Math.toRadians(oooO0O0.f17551OooOOoo)) * ((double) oooO0O0.f17549OooOOo));
    }

    public final float OooOO0O() {
        return this.f17510Oooo0o.f17534OooO00o.f17561OooO0o0.OooO00o(OooO0oo());
    }

    public final boolean OooOO0o() {
        Paint.Style style = this.f17510Oooo0o.f17552OooOo0;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f17522OoooOoo.getStrokeWidth() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooOOO() {
        return this.f17510Oooo0o.f17534OooO00o.OooO0o(OooO0oo());
    }

    public final void OooOOO0(Context context) {
        this.f17510Oooo0o.f17535OooO0O0 = new o0OOOO0o(context);
        OooOoOO();
    }

    public final void OooOOOO(float f) {
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        if (oooO0O0.f17545OooOOO != f) {
            oooO0O0.f17545OooOOO = f;
            OooOoOO();
        }
    }

    public final void OooOOOo(@Nullable ColorStateList colorStateList) {
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        if (oooO0O0.f17536OooO0OO != colorStateList) {
            oooO0O0.f17536OooO0OO = colorStateList;
            onStateChange(getState());
        }
    }

    public final void OooOOo(Paint.Style style) {
        this.f17510Oooo0o.f17552OooOo0 = style;
        super.invalidateSelf();
    }

    public final void OooOOo0(float f) {
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        if (oooO0O0.f17542OooOO0 != f) {
            oooO0O0.f17542OooOO0 = f;
            this.f17515OoooO00 = true;
            invalidateSelf();
        }
    }

    public final void OooOOoo() {
        this.f17523Ooooo00.OooO00o(-12303292);
        this.f17510Oooo0o.f17553OooOo00 = false;
        super.invalidateSelf();
    }

    public final void OooOo(float f) {
        this.f17510Oooo0o.f17543OooOO0O = f;
        invalidateSelf();
    }

    public final void OooOo0(float f, @ColorInt int i) {
        OooOo(f);
        OooOo0o(ColorStateList.valueOf(i));
    }

    public final void OooOo00() {
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        if (oooO0O0.f17548OooOOOo != 2) {
            oooO0O0.f17548OooOOOo = 2;
            super.invalidateSelf();
        }
    }

    public final void OooOo0O(float f, @Nullable ColorStateList colorStateList) {
        OooOo(f);
        OooOo0o(colorStateList);
    }

    public final void OooOo0o(@Nullable ColorStateList colorStateList) {
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        if (oooO0O0.f17537OooO0Oo != colorStateList) {
            oooO0O0.f17537OooO0Oo = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean OooOoO() {
        PorterDuffColorFilter porterDuffColorFilter = this.f17526OooooOO;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f17527OooooOo;
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        this.f17526OooooOO = OooO0OO(oooO0O0.f17538OooO0o, oooO0O0.f17540OooO0oO, this.f17521OoooOoO, true);
        OooO0O0 oooO0O1 = this.f17510Oooo0o;
        this.f17527OooooOo = OooO0OO(oooO0O1.f17539OooO0o0, oooO0O1.f17540OooO0oO, this.f17522OoooOoo, false);
        OooO0O0 oooO0O2 = this.f17510Oooo0o;
        if (oooO0O2.f17553OooOo00) {
            this.f17523Ooooo00.OooO00o(oooO0O2.f17538OooO0o.getColorForState(getState(), 0));
        }
        return (o000OO0O.OooO0OO.OooO00o(porterDuffColorFilter, this.f17526OooooOO) && o000OO0O.OooO0OO.OooO00o(porterDuffColorFilter2, this.f17527OooooOo)) ? false : true;
    }

    public final boolean OooOoO0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f17510Oooo0o.f17536OooO0OO == null || color2 == (colorForState2 = this.f17510Oooo0o.f17536OooO0OO.getColorForState(iArr, (color2 = this.f17521OoooOoO.getColor())))) {
            z = false;
        } else {
            this.f17521OoooOoO.setColor(colorForState2);
            z = true;
        }
        if (this.f17510Oooo0o.f17537OooO0Oo == null || color == (colorForState = this.f17510Oooo0o.f17537OooO0Oo.getColorForState(iArr, (color = this.f17522OoooOoo.getColor())))) {
            return z;
        }
        this.f17522OoooOoo.setColor(colorForState);
        return true;
    }

    public final void OooOoOO() {
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        float f = oooO0O0.f17545OooOOO + oooO0O0.f17547OooOOOO;
        oooO0O0.f17550OooOOo0 = (int) Math.ceil(0.75f * f);
        this.f17510Oooo0o.f17549OooOOo = (int) Math.ceil(f * 0.25f);
        OooOoO();
        super.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        boolean z;
        this.f17521OoooOoO.setColorFilter(this.f17526OooooOO);
        int alpha = this.f17521OoooOoO.getAlpha();
        Paint paint = this.f17521OoooOoO;
        int i = this.f17510Oooo0o.f17544OooOO0o;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        this.f17522OoooOoo.setColorFilter(this.f17527OooooOo);
        this.f17522OoooOoo.setStrokeWidth(this.f17510Oooo0o.f17543OooOO0O);
        int alpha2 = this.f17522OoooOoo.getAlpha();
        Paint paint2 = this.f17522OoooOoo;
        int i2 = this.f17510Oooo0o.f17544OooOO0o;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        if (this.f17515OoooO00) {
            float f = -(OooOO0o() ? this.f17522OoooOoo.getStrokeWidth() / 2.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            com.google.android.material.shape.OooO00o oooO00o = this.f17510Oooo0o.f17534OooO00o;
            Objects.requireNonNull(oooO00o);
            com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o(oooO00o);
            o0ooOOo o00oo0o2 = oooO00o.f17561OooO0o0;
            if (!(o00oo0o2 instanceof o000000)) {
                o00oo0o2 = new o00oO0o(f, o00oo0o2);
            }
            c0110OooO00o.f17573OooO0o0 = o00oo0o2;
            o0ooOOo o00oo0o3 = oooO00o.f17560OooO0o;
            if (!(o00oo0o3 instanceof o000000)) {
                o00oo0o3 = new o00oO0o(f, o00oo0o3);
            }
            c0110OooO00o.f17572OooO0o = o00oo0o3;
            o0ooOOo o00oo0o4 = oooO00o.f17563OooO0oo;
            if (!(o00oo0o4 instanceof o000000)) {
                o00oo0o4 = new o00oO0o(f, o00oo0o4);
            }
            c0110OooO00o.f17575OooO0oo = o00oo0o4;
            o0ooOOo o00oo0o5 = oooO00o.f17562OooO0oO;
            if (!(o00oo0o5 instanceof o000000)) {
                o00oo0o5 = new o00oO0o(f, o00oo0o5);
            }
            c0110OooO00o.f17574OooO0oO = o00oo0o5;
            com.google.android.material.shape.OooO00o OooO00o2 = c0110OooO00o.OooO00o();
            this.f17520OoooOo0 = OooO00o2;
            this.f17525OooooO0.OooO00o(OooO00o2, this.f17510Oooo0o.f17542OooOO0, OooO(), this.f17513OoooO);
            OooO0O0(OooO0oo(), this.f17516OoooO0O);
            this.f17515OoooO00 = false;
        }
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        int i3 = oooO0O0.f17548OooOOOo;
        if (i3 == 1 || oooO0O0.f17550OooOOo0 <= 0) {
            z = false;
        } else {
            if (i3 != 2) {
                if (!((OooOOO() || this.f17516OoooO0O.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true)) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            canvas.save();
            OooO0O0 oooO0O1 = this.f17510Oooo0o;
            canvas.translate((int) (Math.sin(Math.toRadians(oooO0O1.f17551OooOOoo)) * ((double) oooO0O1.f17549OooOOo)), OooOO0());
            if (this.f17530OoooooO) {
                int iWidth = (int) (this.f17528Oooooo.width() - getBounds().width());
                int iHeight = (int) (this.f17528Oooooo.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f17510Oooo0o.f17550OooOOo0 * 2) + ((int) this.f17528Oooooo.width()) + iWidth, (this.f17510Oooo0o.f17550OooOOo0 * 2) + ((int) this.f17528Oooooo.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f2 = (getBounds().left - this.f17510Oooo0o.f17550OooOOo0) - iWidth;
                float f3 = (getBounds().top - this.f17510Oooo0o.f17550OooOOo0) - iHeight;
                canvas2.translate(-f2, -f3);
                OooO0o0(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                OooO0o0(canvas);
                canvas.restore();
            }
        }
        OooO0O0 oooO0O2 = this.f17510Oooo0o;
        Paint.Style style = oooO0O2.f17552OooOo0;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            OooO0o(canvas, this.f17521OoooOoO, this.f17516OoooO0O, oooO0O2.f17534OooO00o, OooO0oo());
        }
        if (OooOO0o()) {
            OooO0oO(canvas);
        }
        this.f17521OoooOoO.setAlpha(alpha);
        this.f17522OoooOoo.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17510Oooo0o.f17544OooOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.f17510Oooo0o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f17510Oooo0o.f17548OooOOOo == 2) {
            return;
        }
        if (OooOOO()) {
            outline.setRoundRect(getBounds(), OooOO0O() * this.f17510Oooo0o.f17542OooOO0);
            return;
        }
        OooO0O0(OooO0oo(), this.f17516OoooO0O);
        if (this.f17516OoooO0O.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f17516OoooO0O);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f17510Oooo0o.f17541OooO0oo;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.f17518OoooOOO.set(getBounds());
        OooO0O0(OooO0oo(), this.f17516OoooO0O);
        this.f17519OoooOOo.setPath(this.f17516OoooO0O, this.f17518OoooOOO);
        this.f17518OoooOOO.op(this.f17519OoooOOo, Region.Op.DIFFERENCE);
        return this.f17518OoooOOO;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f17515OoooO00 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f17510Oooo0o.f17538OooO0o) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f17510Oooo0o.f17539OooO0o0) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f17510Oooo0o.f17537OooO0Oo) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f17510Oooo0o.f17536OooO0OO) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        this.f17510Oooo0o = new OooO0O0(this.f17510Oooo0o);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f17515OoooO00 = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.OooOo.OooO0O0
    public boolean onStateChange(int[] iArr) {
        boolean z = OooOoO0(iArr) || OooOoO();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = ULong.MIN_VALUE, to = 255) int i) {
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        if (oooO0O0.f17544OooOO0o != i) {
            oooO0O0.f17544OooOO0o = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Objects.requireNonNull(this.f17510Oooo0o);
        super.invalidateSelf();
    }

    @Override // p347o0OOO0o0.o00000
    public final void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        this.f17510Oooo0o.f17534OooO00o = oooO00o;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f17510Oooo0o.f17538OooO0o = colorStateList;
        OooOoO();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        OooO0O0 oooO0O0 = this.f17510Oooo0o;
        if (oooO0O0.f17540OooO0oO != mode) {
            oooO0O0.f17540OooO0oO = mode;
            OooOoO();
            super.invalidateSelf();
        }
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this(com.google.android.material.shape.OooO00o.OooO0OO(context, attributeSet, i, i2).OooO00o());
    }

    public MaterialShapeDrawable(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        this(new OooO0O0(oooO00o));
    }

    public MaterialShapeDrawable(@NonNull OooO0O0 oooO0O0) {
        com.google.android.material.shape.OooO0O0 oooO0O1;
        this.f17511Oooo0oO = new OooO0OO.OooOO0O[4];
        this.f17512Oooo0oo = new OooO0OO.OooOO0O[4];
        this.f17509Oooo = new BitSet(8);
        this.f17514OoooO0 = new Matrix();
        this.f17516OoooO0O = new Path();
        this.f17513OoooO = new Path();
        this.f17517OoooOO0 = new RectF();
        this.f17531o000oOoO = new RectF();
        this.f17518OoooOOO = new Region();
        this.f17519OoooOOo = new Region();
        Paint paint = new Paint(1);
        this.f17521OoooOoO = paint;
        Paint paint2 = new Paint(1);
        this.f17522OoooOoo = paint2;
        this.f17523Ooooo00 = new p345o0OOO0Oo.OooO0OO();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oooO0O1 = com.google.android.material.shape.OooO0O0.OooO00o.f17591OooO00o;
        } else {
            oooO0O1 = new com.google.android.material.shape.OooO0O0();
        }
        this.f17525OooooO0 = oooO0O1;
        this.f17528Oooooo = new RectF();
        this.f17530OoooooO = true;
        this.f17510Oooo0o = oooO0O0;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        OooOoO();
        OooOoO0(getState());
        this.f17524Ooooo0o = new OooO00o();
    }

    public static final class OooO0O0 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f17533OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public com.google.android.material.shape.OooO00o f17534OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public o0OOOO0o f17535OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public ColorStateList f17536OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public ColorStateList f17537OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public ColorStateList f17538OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public ColorStateList f17539OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public PorterDuff.Mode f17540OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public Rect f17541OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f17542OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f17543OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f17544OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float f17545OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public float f17546OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public float f17547OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f17548OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f17549OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f17550OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f17551OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public Paint.Style f17552OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f17553OooOo00;

        public OooO0O0(com.google.android.material.shape.OooO00o oooO00o) {
            this.f17536OooO0OO = null;
            this.f17537OooO0Oo = null;
            this.f17539OooO0o0 = null;
            this.f17538OooO0o = null;
            this.f17540OooO0oO = PorterDuff.Mode.SRC_IN;
            this.f17541OooO0oo = null;
            this.f17533OooO = 1.0f;
            this.f17542OooOO0 = 1.0f;
            this.f17544OooOO0o = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f17546OooOOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f17545OooOOO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f17547OooOOOO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f17548OooOOOo = 0;
            this.f17550OooOOo0 = 0;
            this.f17549OooOOo = 0;
            this.f17551OooOOoo = 0;
            this.f17553OooOo00 = false;
            this.f17552OooOo0 = Paint.Style.FILL_AND_STROKE;
            this.f17534OooO00o = oooO00o;
            this.f17535OooO0O0 = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f17515OoooO00 = true;
            return materialShapeDrawable;
        }

        public OooO0O0(@NonNull OooO0O0 oooO0O0) {
            this.f17536OooO0OO = null;
            this.f17537OooO0Oo = null;
            this.f17539OooO0o0 = null;
            this.f17538OooO0o = null;
            this.f17540OooO0oO = PorterDuff.Mode.SRC_IN;
            this.f17541OooO0oo = null;
            this.f17533OooO = 1.0f;
            this.f17542OooOO0 = 1.0f;
            this.f17544OooOO0o = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f17546OooOOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f17545OooOOO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f17547OooOOOO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f17548OooOOOo = 0;
            this.f17550OooOOo0 = 0;
            this.f17549OooOOo = 0;
            this.f17551OooOOoo = 0;
            this.f17553OooOo00 = false;
            this.f17552OooOo0 = Paint.Style.FILL_AND_STROKE;
            this.f17534OooO00o = oooO0O0.f17534OooO00o;
            this.f17535OooO0O0 = oooO0O0.f17535OooO0O0;
            this.f17543OooOO0O = oooO0O0.f17543OooOO0O;
            this.f17536OooO0OO = oooO0O0.f17536OooO0OO;
            this.f17537OooO0Oo = oooO0O0.f17537OooO0Oo;
            this.f17540OooO0oO = oooO0O0.f17540OooO0oO;
            this.f17538OooO0o = oooO0O0.f17538OooO0o;
            this.f17544OooOO0o = oooO0O0.f17544OooOO0o;
            this.f17533OooO = oooO0O0.f17533OooO;
            this.f17549OooOOo = oooO0O0.f17549OooOOo;
            this.f17548OooOOOo = oooO0O0.f17548OooOOOo;
            this.f17553OooOo00 = oooO0O0.f17553OooOo00;
            this.f17542OooOO0 = oooO0O0.f17542OooOO0;
            this.f17546OooOOO0 = oooO0O0.f17546OooOOO0;
            this.f17545OooOOO = oooO0O0.f17545OooOOO;
            this.f17547OooOOOO = oooO0O0.f17547OooOOOO;
            this.f17550OooOOo0 = oooO0O0.f17550OooOOo0;
            this.f17551OooOOoo = oooO0O0.f17551OooOOoo;
            this.f17539OooO0o0 = oooO0O0.f17539OooO0o0;
            this.f17552OooOo0 = oooO0O0.f17552OooOo0;
            if (oooO0O0.f17541OooO0oo != null) {
                this.f17541OooO0oo = new Rect(oooO0O0.f17541OooO0oo);
            }
        }
    }
}
