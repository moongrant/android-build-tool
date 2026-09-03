package o00O00OO;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p053o00000oo.o00Ooo;
import p058o0000Ooo.o0OoOo0;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends o00O00OO.OooOOO0 {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final PorterDuff.Mode f36050OooOOO0 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f36051OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public PorterDuffColorFilter f36052OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOO0O f36053OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ColorFilter f36054OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f36055OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f36056OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Matrix f36057OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Rect f36058OooOO0o;

    public static class OooO00o extends OooO {
        public OooO00o() {
        }

        public OooO00o(OooO00o oooO00o) {
            super(oooO00o);
        }
    }

    public static abstract class OooO0o {
        public boolean OooO00o() {
            return false;
        }

        public boolean OooO0O0(int[] iArr) {
            return false;
        }
    }

    public static class OooOO0O extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f36102OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f36103OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooOO0 f36104OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ColorStateList f36105OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public PorterDuff.Mode f36106OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Bitmap f36107OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f36108OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ColorStateList f36109OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public PorterDuff.Mode f36110OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f36111OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f36112OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Paint f36113OooOO0o;

        public OooOO0O(OooOO0O oooOO0O) {
            this.f36105OooO0OO = null;
            this.f36106OooO0Oo = OooOOO.f36050OooOOO0;
            if (oooOO0O != null) {
                this.f36103OooO00o = oooOO0O.f36103OooO00o;
                OooOO0 oooOO1 = new OooOO0(oooOO0O.f36104OooO0O0);
                this.f36104OooO0O0 = oooOO1;
                if (oooOO0O.f36104OooO0O0.f36093OooO0o0 != null) {
                    oooOO1.f36093OooO0o0 = new Paint(oooOO0O.f36104OooO0O0.f36093OooO0o0);
                }
                if (oooOO0O.f36104OooO0O0.f36091OooO0Oo != null) {
                    this.f36104OooO0O0.f36091OooO0Oo = new Paint(oooOO0O.f36104OooO0O0.f36091OooO0Oo);
                }
                this.f36105OooO0OO = oooOO0O.f36105OooO0OO;
                this.f36106OooO0Oo = oooOO0O.f36106OooO0Oo;
                this.f36108OooO0o0 = oooOO0O.f36108OooO0o0;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36103OooO00o;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new OooOOO(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new OooOOO(this);
        }

        public OooOO0O() {
            this.f36105OooO0OO = null;
            this.f36106OooO0Oo = OooOOO.f36050OooOOO0;
            this.f36104OooO0O0 = new OooOO0();
        }
    }

    public OooOOO() {
        this.f36051OooO = true;
        this.f36056OooOO0 = new float[9];
        this.f36057OooOO0O = new Matrix();
        this.f36058OooOO0o = new Rect();
        this.f36053OooO0o0 = new OooOO0O();
    }

    public final PorterDuffColorFilter OooO00o(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable == null) {
            return false;
        }
        o00Ooo.OooO0O0.OooO0O0(drawable);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f36058OooOO0o;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f36054OooO0oO;
        if (colorFilter == null) {
            colorFilter = this.f36052OooO0o;
        }
        Matrix matrix = this.f36057OooOO0O;
        canvas.getMatrix(matrix);
        float[] fArr = this.f36056OooOO0;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && o00Ooo.OooO0OO.OooO00o(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        OooOO0O oooOO0O = this.f36053OooO0o0;
        Bitmap bitmap = oooOO0O.f36107OooO0o;
        if (bitmap == null) {
            oooOO0O.f36107OooO0o = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oooOO0O.f36112OooOO0O = true;
        } else {
            if (!(iMin == bitmap.getWidth() && iMin2 == oooOO0O.f36107OooO0o.getHeight())) {
                oooOO0O.f36107OooO0o = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                oooOO0O.f36112OooOO0O = true;
            }
        }
        if (this.f36051OooO) {
            OooOO0O oooOO0O2 = this.f36053OooO0o0;
            if (!(!oooOO0O2.f36112OooOO0O && oooOO0O2.f36109OooO0oO == oooOO0O2.f36105OooO0OO && oooOO0O2.f36110OooO0oo == oooOO0O2.f36106OooO0Oo && oooOO0O2.f36111OooOO0 == oooOO0O2.f36108OooO0o0 && oooOO0O2.f36102OooO == oooOO0O2.f36104OooO0O0.getRootAlpha())) {
                OooOO0O oooOO0O3 = this.f36053OooO0o0;
                oooOO0O3.f36107OooO0o.eraseColor(0);
                Canvas canvas2 = new Canvas(oooOO0O3.f36107OooO0o);
                OooOO0 oooOO1 = oooOO0O3.f36104OooO0O0;
                oooOO1.OooO00o(oooOO1.f36094OooO0oO, OooOO0.f36086OooOOOo, canvas2, iMin, iMin2);
                OooOO0O oooOO0O4 = this.f36053OooO0o0;
                oooOO0O4.f36109OooO0oO = oooOO0O4.f36105OooO0OO;
                oooOO0O4.f36110OooO0oo = oooOO0O4.f36106OooO0Oo;
                oooOO0O4.f36102OooO = oooOO0O4.f36104OooO0O0.getRootAlpha();
                oooOO0O4.f36111OooOO0 = oooOO0O4.f36108OooO0o0;
                oooOO0O4.f36112OooOO0O = false;
            }
        } else {
            OooOO0O oooOO0O5 = this.f36053OooO0o0;
            oooOO0O5.f36107OooO0o.eraseColor(0);
            Canvas canvas3 = new Canvas(oooOO0O5.f36107OooO0o);
            OooOO0 oooOO2 = oooOO0O5.f36104OooO0O0;
            oooOO2.OooO00o(oooOO2.f36094OooO0oO, OooOO0.f36086OooOOOo, canvas3, iMin, iMin2);
        }
        OooOO0O oooOO0O6 = this.f36053OooO0o0;
        if ((oooOO0O6.f36104OooO0O0.getRootAlpha() < 255) || colorFilter != null) {
            if (oooOO0O6.f36113OooOO0o == null) {
                Paint paint2 = new Paint();
                oooOO0O6.f36113OooOO0o = paint2;
                paint2.setFilterBitmap(true);
            }
            oooOO0O6.f36113OooOO0o.setAlpha(oooOO0O6.f36104OooO0O0.getRootAlpha());
            oooOO0O6.f36113OooOO0o.setColorFilter(colorFilter);
            paint = oooOO0O6.f36113OooOO0o;
        } else {
            paint = null;
        }
        canvas.drawBitmap(oooOO0O6.f36107OooO0o, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f36115OooO0Oo;
        return drawable != null ? o00Ooo.OooO00o.OooO00o(drawable) : this.f36053OooO0o0.f36104OooO0O0.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f36115OooO0Oo;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f36053OooO0o0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f36115OooO0Oo;
        return drawable != null ? o00Ooo.OooO0O0.OooO0OO(drawable) : this.f36054OooO0oO;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f36115OooO0Oo != null && Build.VERSION.SDK_INT >= 24) {
            return new OooOOO0(this.f36115OooO0Oo.getConstantState());
        }
        this.f36053OooO0o0.f36103OooO00o = getChangingConfigurations();
        return this.f36053OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f36115OooO0Oo;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f36053OooO0o0.f36104OooO0O0.f36087OooO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f36115OooO0Oo;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f36053OooO0o0.f36104OooO0O0.f36095OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f36115OooO0Oo;
        return drawable != null ? o00Ooo.OooO00o.OooO0Oo(drawable) : this.f36053OooO0o0.f36108OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            OooOO0O oooOO0O = this.f36053OooO0o0;
            if (oooOO0O != null) {
                OooOO0 oooOO1 = oooOO0O.f36104OooO0O0;
                if (oooOO1.f36099OooOOO == null) {
                    oooOO1.f36099OooOOO = Boolean.valueOf(oooOO1.f36094OooO0oO.OooO00o());
                }
                if (oooOO1.f36099OooOOO.booleanValue() || ((colorStateList = this.f36053OooO0o0.f36105OooO0OO) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f36055OooO0oo && super.mutate() == this) {
            this.f36053OooO0o0 = new OooOO0O(this.f36053OooO0o0);
            this.f36055OooO0oo = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        OooOO0O oooOO0O = this.f36053OooO0o0;
        ColorStateList colorStateList = oooOO0O.f36105OooO0OO;
        if (colorStateList == null || (mode = oooOO0O.f36106OooO0Oo) == null) {
            z = false;
        } else {
            this.f36052OooO0o = OooO00o(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        OooOO0 oooOO1 = oooOO0O.f36104OooO0O0;
        if (oooOO1.f36099OooOOO == null) {
            oooOO1.f36099OooOOO = Boolean.valueOf(oooOO1.f36094OooO0oO.OooO00o());
        }
        if (oooOO1.f36099OooOOO.booleanValue()) {
            boolean zOooO0O0 = oooOO0O.f36104OooO0O0.f36094OooO0oO.OooO0O0(iArr);
            oooOO0O.f36112OooOO0O |= zOooO0O0;
            if (zOooO0O0) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f36053OooO0o0.f36104OooO0O0.getRootAlpha() != i) {
            this.f36053OooO0o0.f36104OooO0O0.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO00o.OooO0o0(drawable, z);
        } else {
            this.f36053OooO0o0.f36108OooO0o0 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f36054OooO0oO = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO00o(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO0O0.OooO0oo(drawable, colorStateList);
            return;
        }
        OooOO0O oooOO0O = this.f36053OooO0o0;
        if (oooOO0O.f36105OooO0OO != colorStateList) {
            oooOO0O.f36105OooO0OO = colorStateList;
            this.f36052OooO0o = OooO00o(colorStateList, oooOO0O.f36106OooO0Oo);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO0O0.OooO(drawable, mode);
            return;
        }
        OooOO0O oooOO0O = this.f36053OooO0o0;
        if (oooOO0O.f36106OooO0Oo != mode) {
            oooOO0O.f36106OooO0Oo = mode;
            this.f36052OooO0o = OooO00o(oooOO0O.f36105OooO0OO, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f36115OooO0Oo;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi(24)
    public static class OooOOO0 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Drawable.ConstantState f36114OooO00o;

        public OooOOO0(Drawable.ConstantState constantState) {
            this.f36114OooO00o = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f36114OooO00o.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36114OooO00o.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            OooOOO oooOOO = new OooOOO();
            oooOOO.f36115OooO0Oo = (VectorDrawable) this.f36114OooO00o.newDrawable();
            return oooOOO;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            OooOOO oooOOO = new OooOOO();
            oooOOO.f36115OooO0Oo = (VectorDrawable) this.f36114OooO00o.newDrawable(resources);
            return oooOOO;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            OooOOO oooOOO = new OooOOO();
            oooOOO.f36115OooO0Oo = (VectorDrawable) this.f36114OooO00o.newDrawable(resources, theme);
            return oooOOO;
        }
    }

    public static abstract class OooO extends OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o00000oO.OooOOO.OooO00o[] f36059OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f36060OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f36061OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f36062OooO0Oo;

        public OooO() {
            this.f36059OooO00o = null;
            this.f36061OooO0OO = 0;
        }

        public o00000oO.OooOOO.OooO00o[] getPathData() {
            return this.f36059OooO00o;
        }

        public String getPathName() {
            return this.f36060OooO0O0;
        }

        public void setPathData(o00000oO.OooOOO.OooO00o[] oooO00oArr) {
            if (!p052o00000oO.OooOOO.OooO00o(this.f36059OooO00o, oooO00oArr)) {
                this.f36059OooO00o = p052o00000oO.OooOOO.OooO0o0(oooO00oArr);
                return;
            }
            o00000oO.OooOOO.OooO00o[] oooO00oArr2 = this.f36059OooO00o;
            for (int i = 0; i < oooO00oArr.length; i++) {
                oooO00oArr2[i].f33478OooO00o = oooO00oArr[i].f33478OooO00o;
                int i2 = 0;
                while (true) {
                    float[] fArr = oooO00oArr[i].f33479OooO0O0;
                    if (i2 < fArr.length) {
                        oooO00oArr2[i].f33479OooO0O0[i2] = fArr[i2];
                        i2++;
                    }
                }
            }
        }

        public OooO(OooO oooO) {
            this.f36059OooO00o = null;
            this.f36061OooO0OO = 0;
            this.f36060OooO0O0 = oooO.f36060OooO0O0;
            this.f36062OooO0Oo = oooO.f36062OooO0Oo;
            this.f36059OooO00o = p052o00000oO.OooOOO.OooO0o0(oooO.f36059OooO00o);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        char c;
        ArrayDeque arrayDeque;
        int i;
        int i2;
        int i3;
        OooO0O0 oooO0O0;
        TypedArray typedArray;
        Drawable drawable = this.f36115OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO0O0.OooO0Oo(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        OooOO0O oooOO0O = this.f36053OooO0o0;
        oooOO0O.f36104OooO0O0 = new OooOO0();
        TypedArray typedArrayOooO0oo = oo000o.OooO0oo(resources, theme, attributeSet, o00O00OO.OooO00o.f36024OooO00o);
        OooOO0O oooOO0O2 = this.f36053OooO0o0;
        OooOO0 oooOO1 = oooOO0O2.f36104OooO0O0;
        int iOooO0o0 = oo000o.OooO0o0(typedArrayOooO0oo, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i4 = 3;
        if (iOooO0o0 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iOooO0o0 != 5) {
            if (iOooO0o0 != 9) {
                switch (iOooO0o0) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oooOO0O2.f36106OooO0Oo = mode;
        int i5 = 1;
        ColorStateList colorStateListOooO0O0 = oo000o.OooO0O0(typedArrayOooO0oo, xmlPullParser, theme, "tint", 1);
        if (colorStateListOooO0O0 != null) {
            oooOO0O2.f36105OooO0OO = colorStateListOooO0O0;
        }
        oooOO0O2.f36108OooO0o0 = oo000o.OooO00o(typedArrayOooO0oo, xmlPullParser, "autoMirrored", 5, oooOO0O2.f36108OooO0o0);
        oooOO1.f36096OooOO0 = oo000o.OooO0Oo(typedArrayOooO0oo, xmlPullParser, "viewportWidth", 7, oooOO1.f36096OooOO0);
        char c2 = '\b';
        float fOooO0Oo = oo000o.OooO0Oo(typedArrayOooO0oo, xmlPullParser, "viewportHeight", 8, oooOO1.f36097OooOO0O);
        oooOO1.f36097OooOO0O = fOooO0Oo;
        if (oooOO1.f36096OooOO0 <= 0.0f) {
            throw new XmlPullParserException(typedArrayOooO0oo.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fOooO0Oo > 0.0f) {
            oooOO1.f36095OooO0oo = typedArrayOooO0oo.getDimension(3, oooOO1.f36095OooO0oo);
            int i6 = 2;
            float dimension = typedArrayOooO0oo.getDimension(2, oooOO1.f36087OooO);
            oooOO1.f36087OooO = dimension;
            if (oooOO1.f36095OooO0oo <= 0.0f) {
                throw new XmlPullParserException(typedArrayOooO0oo.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                oooOO1.setAlpha(oo000o.OooO0Oo(typedArrayOooO0oo, xmlPullParser, "alpha", 4, oooOO1.getAlpha()));
                int i7 = 0;
                String string = typedArrayOooO0oo.getString(0);
                if (string != null) {
                    oooOO1.f36100OooOOO0 = string;
                    oooOO1.f36101OooOOOO.put(string, oooOO1);
                }
                typedArrayOooO0oo.recycle();
                oooOO0O.f36103OooO00o = getChangingConfigurations();
                oooOO0O.f36112OooOO0O = true;
                OooOO0O oooOO0O3 = this.f36053OooO0o0;
                OooOO0 oooOO2 = oooOO0O3.f36104OooO0O0;
                ArrayDeque arrayDeque2 = new ArrayDeque();
                arrayDeque2.push(oooOO2.f36094OooO0oO);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z = true;
                while (eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i4)) {
                    if (eventType == i6) {
                        String name = xmlPullParser.getName();
                        OooO0OO oooO0OO = (OooO0OO) arrayDeque2.peek();
                        boolean zEquals = "path".equals(name);
                        p190o00o0O.OooO<String, Object> oooO = oooOO2.f36101OooOOOO;
                        if (zEquals) {
                            OooO0O0 oooO0O1 = new OooO0O0();
                            TypedArray typedArrayOooO0oo2 = oo000o.OooO0oo(resources, theme, attributeSet, o00O00OO.OooO00o.f36026OooO0OO);
                            if (oo000o.OooO0oO(xmlPullParser, "pathData")) {
                                String string2 = typedArrayOooO0oo2.getString(i7);
                                if (string2 != null) {
                                    oooO0O1.f36060OooO0O0 = string2;
                                }
                                String string3 = typedArrayOooO0oo2.getString(2);
                                if (string3 != null) {
                                    oooO0O1.f36059OooO00o = p052o00000oO.OooOOO.OooO0OO(string3);
                                }
                                oooO0O0 = oooO0O1;
                                oooO0O0.f36066OooO0oO = oo000o.OooO0OO(typedArrayOooO0oo2, xmlPullParser, theme, "fillColor", 1, 0);
                                oooO0O0.f36063OooO = oo000o.OooO0Oo(typedArrayOooO0oo2, xmlPullParser, "fillAlpha", 12, oooO0O0.f36063OooO);
                                int iOooO0o1 = oo000o.OooO0o0(typedArrayOooO0oo2, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = oooO0O0.f36072OooOOO0;
                                if (iOooO0o1 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (iOooO0o1 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (iOooO0o1 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                oooO0O0.f36072OooOOO0 = cap;
                                int iOooO0o2 = oo000o.OooO0o0(typedArrayOooO0oo2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = oooO0O0.f36071OooOOO;
                                if (iOooO0o2 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (iOooO0o2 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (iOooO0o2 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                oooO0O0.f36071OooOOO = join;
                                oooO0O0.f36073OooOOOO = oo000o.OooO0Oo(typedArrayOooO0oo2, xmlPullParser, "strokeMiterLimit", 10, oooO0O0.f36073OooOOOO);
                                c = '\b';
                                typedArray = typedArrayOooO0oo2;
                                oooO0O0.f36065OooO0o0 = oo000o.OooO0OO(typedArrayOooO0oo2, xmlPullParser, theme, "strokeColor", 3, 0);
                                oooO0O0.f36067OooO0oo = oo000o.OooO0Oo(typedArray, xmlPullParser, "strokeAlpha", 11, oooO0O0.f36067OooO0oo);
                                oooO0O0.f36064OooO0o = oo000o.OooO0Oo(typedArray, xmlPullParser, "strokeWidth", 4, oooO0O0.f36064OooO0o);
                                oooO0O0.f36069OooOO0O = oo000o.OooO0Oo(typedArray, xmlPullParser, "trimPathEnd", 6, oooO0O0.f36069OooOO0O);
                                oooO0O0.f36070OooOO0o = oo000o.OooO0Oo(typedArray, xmlPullParser, "trimPathOffset", 7, oooO0O0.f36070OooOO0o);
                                oooO0O0.f36068OooOO0 = oo000o.OooO0Oo(typedArray, xmlPullParser, "trimPathStart", 5, oooO0O0.f36068OooOO0);
                                oooO0O0.f36061OooO0OO = oo000o.OooO0o0(typedArray, xmlPullParser, "fillType", 13, oooO0O0.f36061OooO0OO);
                            } else {
                                oooO0O0 = oooO0O1;
                                c = '\b';
                                typedArray = typedArrayOooO0oo2;
                            }
                            typedArray.recycle();
                            oooO0OO.f36076OooO0O0.add(oooO0O0);
                            if (oooO0O0.getPathName() != null) {
                                oooO.put(oooO0O0.getPathName(), oooO0O0);
                            }
                            oooOO0O3.f36103OooO00o |= oooO0O0.f36062OooO0Oo;
                            arrayDeque = arrayDeque2;
                            i3 = 0;
                            i2 = 2;
                            z = false;
                        } else {
                            ArrayDeque arrayDeque3 = arrayDeque2;
                            oooOO2 = oooOO2;
                            depth = depth;
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                OooO00o oooO00o = new OooO00o();
                                if (oo000o.OooO0oO(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayOooO0oo3 = oo000o.OooO0oo(resources, theme, attributeSet, o00O00OO.OooO00o.f36027OooO0Oo);
                                    String string4 = typedArrayOooO0oo3.getString(0);
                                    if (string4 != null) {
                                        oooO00o.f36060OooO0O0 = string4;
                                    }
                                    String string5 = typedArrayOooO0oo3.getString(1);
                                    if (string5 != null) {
                                        oooO00o.f36059OooO00o = p052o00000oO.OooOOO.OooO0OO(string5);
                                    }
                                    oooO00o.f36061OooO0OO = oo000o.OooO0o0(typedArrayOooO0oo3, xmlPullParser, "fillType", 2, 0);
                                    typedArrayOooO0oo3.recycle();
                                }
                                oooO0OO.f36076OooO0O0.add(oooO00o);
                                if (oooO00o.getPathName() != null) {
                                    oooO.put(oooO00o.getPathName(), oooO00o);
                                }
                                oooOO0O3.f36103OooO00o = oooO00o.f36062OooO0Oo | oooOO0O3.f36103OooO00o;
                            } else if ("group".equals(name)) {
                                OooO0OO oooO0OO2 = new OooO0OO();
                                TypedArray typedArrayOooO0oo4 = oo000o.OooO0oo(resources, theme, attributeSet, o00O00OO.OooO00o.f36025OooO0O0);
                                oooO0OO2.f36077OooO0OO = oo000o.OooO0Oo(typedArrayOooO0oo4, xmlPullParser, "rotation", 5, oooO0OO2.f36077OooO0OO);
                                oooO0OO2.f36078OooO0Oo = typedArrayOooO0oo4.getFloat(1, oooO0OO2.f36078OooO0Oo);
                                i2 = 2;
                                oooO0OO2.f36080OooO0o0 = typedArrayOooO0oo4.getFloat(2, oooO0OO2.f36080OooO0o0);
                                oooO0OO2.f36079OooO0o = oo000o.OooO0Oo(typedArrayOooO0oo4, xmlPullParser, "scaleX", 3, oooO0OO2.f36079OooO0o);
                                oooO0OO2.f36081OooO0oO = oo000o.OooO0Oo(typedArrayOooO0oo4, xmlPullParser, "scaleY", 4, oooO0OO2.f36081OooO0oO);
                                oooO0OO2.f36082OooO0oo = oo000o.OooO0Oo(typedArrayOooO0oo4, xmlPullParser, "translateX", 6, oooO0OO2.f36082OooO0oo);
                                oooO0OO2.f36074OooO = oo000o.OooO0Oo(typedArrayOooO0oo4, xmlPullParser, "translateY", 7, oooO0OO2.f36074OooO);
                                i3 = 0;
                                String string6 = typedArrayOooO0oo4.getString(0);
                                if (string6 != null) {
                                    oooO0OO2.f36085OooOO0o = string6;
                                }
                                oooO0OO2.OooO0OO();
                                typedArrayOooO0oo4.recycle();
                                oooO0OO.f36076OooO0O0.add(oooO0OO2);
                                arrayDeque = arrayDeque3;
                                arrayDeque.push(oooO0OO2);
                                if (oooO0OO2.getGroupName() != null) {
                                    oooO.put(oooO0OO2.getGroupName(), oooO0OO2);
                                }
                                oooOO0O3.f36103OooO00o = oooO0OO2.f36084OooOO0O | oooOO0O3.f36103OooO00o;
                            }
                            arrayDeque = arrayDeque3;
                            i3 = 0;
                            i2 = 2;
                        }
                        i = 3;
                    } else {
                        oooOO2 = oooOO2;
                        depth = depth;
                        c = c2;
                        arrayDeque = arrayDeque2;
                        i = i4;
                        int i8 = i7;
                        i2 = i6;
                        i3 = i8;
                        if (eventType == i && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i4 = i;
                    arrayDeque2 = arrayDeque;
                    c2 = c;
                    depth = depth;
                    oooOO2 = oooOO2;
                    i5 = 1;
                    int i9 = i2;
                    i7 = i3;
                    i6 = i9;
                }
                if (!z) {
                    this.f36052OooO0o = OooO00o(oooOO0O.f36105OooO0OO, oooOO0O.f36106OooO0Oo);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayOooO0oo.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayOooO0oo.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public OooOOO(@NonNull OooOO0O oooOO0O) {
        this.f36051OooO = true;
        this.f36056OooOO0 = new float[9];
        this.f36057OooOO0O = new Matrix();
        this.f36058OooOO0o = new Rect();
        this.f36053OooO0o0 = oooOO0O;
        this.f36052OooO0o = OooO00o(oooOO0O.f36105OooO0OO, oooOO0O.f36106OooO0Oo);
    }

    public static class OooO0O0 extends OooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f36063OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f36064OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0OoOo0 f36065OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public o0OoOo0 f36066OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f36067OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f36068OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f36069OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f36070OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Paint.Join f36071OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Paint.Cap f36072OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public float f36073OooOOOO;

        public OooO0O0() {
            this.f36064OooO0o = 0.0f;
            this.f36067OooO0oo = 1.0f;
            this.f36063OooO = 1.0f;
            this.f36068OooOO0 = 0.0f;
            this.f36069OooOO0O = 1.0f;
            this.f36070OooOO0o = 0.0f;
            this.f36072OooOOO0 = Paint.Cap.BUTT;
            this.f36071OooOOO = Paint.Join.MITER;
            this.f36073OooOOOO = 4.0f;
        }

        @Override // o00O00OO.OooOOO.OooO0o
        public final boolean OooO00o() {
            return this.f36066OooO0oO.OooO0O0() || this.f36065OooO0o0.OooO0O0();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0036  */
        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        @Override // o00O00OO.OooOOO.OooO0o
        public final boolean OooO0O0(int[] iArr) {
            boolean z;
            o0OoOo0 o0oooo1 = this.f36066OooO0oO;
            boolean z2 = true;
            if (o0oooo1.OooO0O0()) {
                ColorStateList colorStateList = o0oooo1.f33740OooO0O0;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != o0oooo1.f33741OooO0OO) {
                    o0oooo1.f33741OooO0OO = colorForState;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            o0OoOo0 o0oooo2 = this.f36065OooO0o0;
            if (o0oooo2.OooO0O0()) {
                ColorStateList colorStateList2 = o0oooo2.f33740OooO0O0;
                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                if (colorForState2 != o0oooo2.f33741OooO0OO) {
                    o0oooo2.f33741OooO0OO = colorForState2;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            return z2 | z;
        }

        public float getFillAlpha() {
            return this.f36063OooO;
        }

        @ColorInt
        public int getFillColor() {
            return this.f36066OooO0oO.f33741OooO0OO;
        }

        public float getStrokeAlpha() {
            return this.f36067OooO0oo;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f36065OooO0o0.f33741OooO0OO;
        }

        public float getStrokeWidth() {
            return this.f36064OooO0o;
        }

        public float getTrimPathEnd() {
            return this.f36069OooOO0O;
        }

        public float getTrimPathOffset() {
            return this.f36070OooOO0o;
        }

        public float getTrimPathStart() {
            return this.f36068OooOO0;
        }

        public void setFillAlpha(float f) {
            this.f36063OooO = f;
        }

        public void setFillColor(int i) {
            this.f36066OooO0oO.f33741OooO0OO = i;
        }

        public void setStrokeAlpha(float f) {
            this.f36067OooO0oo = f;
        }

        public void setStrokeColor(int i) {
            this.f36065OooO0o0.f33741OooO0OO = i;
        }

        public void setStrokeWidth(float f) {
            this.f36064OooO0o = f;
        }

        public void setTrimPathEnd(float f) {
            this.f36069OooOO0O = f;
        }

        public void setTrimPathOffset(float f) {
            this.f36070OooOO0o = f;
        }

        public void setTrimPathStart(float f) {
            this.f36068OooOO0 = f;
        }

        public OooO0O0(OooO0O0 oooO0O0) {
            super(oooO0O0);
            this.f36064OooO0o = 0.0f;
            this.f36067OooO0oo = 1.0f;
            this.f36063OooO = 1.0f;
            this.f36068OooOO0 = 0.0f;
            this.f36069OooOO0O = 1.0f;
            this.f36070OooOO0o = 0.0f;
            this.f36072OooOOO0 = Paint.Cap.BUTT;
            this.f36071OooOOO = Paint.Join.MITER;
            this.f36073OooOOOO = 4.0f;
            this.f36065OooO0o0 = oooO0O0.f36065OooO0o0;
            this.f36064OooO0o = oooO0O0.f36064OooO0o;
            this.f36067OooO0oo = oooO0O0.f36067OooO0oo;
            this.f36066OooO0oO = oooO0O0.f36066OooO0oO;
            this.f36061OooO0OO = oooO0O0.f36061OooO0OO;
            this.f36063OooO = oooO0O0.f36063OooO;
            this.f36068OooOO0 = oooO0O0.f36068OooOO0;
            this.f36069OooOO0O = oooO0O0.f36069OooOO0O;
            this.f36070OooOO0o = oooO0O0.f36070OooOO0o;
            this.f36072OooOOO0 = oooO0O0.f36072OooOOO0;
            this.f36071OooOOO = oooO0O0.f36071OooOOO;
            this.f36073OooOOOO = oooO0O0.f36073OooOOOO;
        }
    }

    public static class OooO0OO extends OooO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f36074OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f36075OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO0o> f36076OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f36077OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f36078OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f36079OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f36080OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f36081OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f36082OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final Matrix f36083OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f36084OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public String f36085OooOO0o;

        public OooO0OO() {
            this.f36075OooO00o = new Matrix();
            this.f36076OooO0O0 = new ArrayList<>();
            this.f36077OooO0OO = 0.0f;
            this.f36078OooO0Oo = 0.0f;
            this.f36080OooO0o0 = 0.0f;
            this.f36079OooO0o = 1.0f;
            this.f36081OooO0oO = 1.0f;
            this.f36082OooO0oo = 0.0f;
            this.f36074OooO = 0.0f;
            this.f36083OooOO0 = new Matrix();
            this.f36085OooOO0o = null;
        }

        @Override // o00O00OO.OooOOO.OooO0o
        public final boolean OooO00o() {
            int i = 0;
            while (true) {
                ArrayList<OooO0o> arrayList = this.f36076OooO0O0;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).OooO00o()) {
                    return true;
                }
                i++;
            }
        }

        @Override // o00O00OO.OooOOO.OooO0o
        public final boolean OooO0O0(int[] iArr) {
            int i = 0;
            boolean zOooO0O0 = false;
            while (true) {
                ArrayList<OooO0o> arrayList = this.f36076OooO0O0;
                if (i >= arrayList.size()) {
                    return zOooO0O0;
                }
                zOooO0O0 |= arrayList.get(i).OooO0O0(iArr);
                i++;
            }
        }

        public final void OooO0OO() {
            Matrix matrix = this.f36083OooOO0;
            matrix.reset();
            matrix.postTranslate(-this.f36078OooO0Oo, -this.f36080OooO0o0);
            matrix.postScale(this.f36079OooO0o, this.f36081OooO0oO);
            matrix.postRotate(this.f36077OooO0OO, 0.0f, 0.0f);
            matrix.postTranslate(this.f36082OooO0oo + this.f36078OooO0Oo, this.f36074OooO + this.f36080OooO0o0);
        }

        public String getGroupName() {
            return this.f36085OooOO0o;
        }

        public Matrix getLocalMatrix() {
            return this.f36083OooOO0;
        }

        public float getPivotX() {
            return this.f36078OooO0Oo;
        }

        public float getPivotY() {
            return this.f36080OooO0o0;
        }

        public float getRotation() {
            return this.f36077OooO0OO;
        }

        public float getScaleX() {
            return this.f36079OooO0o;
        }

        public float getScaleY() {
            return this.f36081OooO0oO;
        }

        public float getTranslateX() {
            return this.f36082OooO0oo;
        }

        public float getTranslateY() {
            return this.f36074OooO;
        }

        public void setPivotX(float f) {
            if (f != this.f36078OooO0Oo) {
                this.f36078OooO0Oo = f;
                OooO0OO();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f36080OooO0o0) {
                this.f36080OooO0o0 = f;
                OooO0OO();
            }
        }

        public void setRotation(float f) {
            if (f != this.f36077OooO0OO) {
                this.f36077OooO0OO = f;
                OooO0OO();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f36079OooO0o) {
                this.f36079OooO0o = f;
                OooO0OO();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f36081OooO0oO) {
                this.f36081OooO0oO = f;
                OooO0OO();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f36082OooO0oo) {
                this.f36082OooO0oo = f;
                OooO0OO();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f36074OooO) {
                this.f36074OooO = f;
                OooO0OO();
            }
        }

        public OooO0OO(OooO0OO oooO0OO, p190o00o0O.OooO<String, Object> oooO) {
            OooO oooO00o;
            this.f36075OooO00o = new Matrix();
            this.f36076OooO0O0 = new ArrayList<>();
            this.f36077OooO0OO = 0.0f;
            this.f36078OooO0Oo = 0.0f;
            this.f36080OooO0o0 = 0.0f;
            this.f36079OooO0o = 1.0f;
            this.f36081OooO0oO = 1.0f;
            this.f36082OooO0oo = 0.0f;
            this.f36074OooO = 0.0f;
            Matrix matrix = new Matrix();
            this.f36083OooOO0 = matrix;
            this.f36085OooOO0o = null;
            this.f36077OooO0OO = oooO0OO.f36077OooO0OO;
            this.f36078OooO0Oo = oooO0OO.f36078OooO0Oo;
            this.f36080OooO0o0 = oooO0OO.f36080OooO0o0;
            this.f36079OooO0o = oooO0OO.f36079OooO0o;
            this.f36081OooO0oO = oooO0OO.f36081OooO0oO;
            this.f36082OooO0oo = oooO0OO.f36082OooO0oo;
            this.f36074OooO = oooO0OO.f36074OooO;
            String str = oooO0OO.f36085OooOO0o;
            this.f36085OooOO0o = str;
            this.f36084OooOO0O = oooO0OO.f36084OooOO0O;
            if (str != null) {
                oooO.put(str, this);
            }
            matrix.set(oooO0OO.f36083OooOO0);
            ArrayList<OooO0o> arrayList = oooO0OO.f36076OooO0O0;
            for (int i = 0; i < arrayList.size(); i++) {
                OooO0o oooO0o = arrayList.get(i);
                if (oooO0o instanceof OooO0OO) {
                    this.f36076OooO0O0.add(new OooO0OO((OooO0OO) oooO0o, oooO));
                } else {
                    if (oooO0o instanceof OooO0O0) {
                        oooO00o = new OooO0O0((OooO0O0) oooO0o);
                    } else if (oooO0o instanceof OooO00o) {
                        oooO00o = new OooO00o((OooO00o) oooO0o);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f36076OooO0O0.add(oooO00o);
                    String str2 = oooO00o.f36060OooO0O0;
                    if (str2 != null) {
                        oooO.put(str2, oooO00o);
                    }
                }
            }
        }
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final Matrix f36086OooOOOo = new Matrix();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f36087OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Path f36088OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Path f36089OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Matrix f36090OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Paint f36091OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public PathMeasure f36092OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Paint f36093OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooO0OO f36094OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f36095OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f36096OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f36097OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f36098OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Boolean f36099OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public String f36100OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final p190o00o0O.OooO<String, Object> f36101OooOOOO;

        public OooOO0() {
            this.f36090OooO0OO = new Matrix();
            this.f36095OooO0oo = 0.0f;
            this.f36087OooO = 0.0f;
            this.f36096OooOO0 = 0.0f;
            this.f36097OooOO0O = 0.0f;
            this.f36098OooOO0o = 255;
            this.f36100OooOOO0 = null;
            this.f36099OooOOO = null;
            this.f36101OooOOOO = new p190o00o0O.OooO<>();
            this.f36094OooO0oO = new OooO0OO();
            this.f36088OooO00o = new Path();
            this.f36089OooO0O0 = new Path();
        }

        public final void OooO00o(OooO0OO oooO0OO, Matrix matrix, Canvas canvas, int i, int i2) {
            int i3;
            float f;
            boolean z;
            oooO0OO.f36075OooO00o.set(matrix);
            Matrix matrix2 = oooO0OO.f36075OooO00o;
            matrix2.preConcat(oooO0OO.f36083OooOO0);
            canvas.save();
            char c = 0;
            int i4 = 0;
            while (true) {
                ArrayList<OooO0o> arrayList = oooO0OO.f36076OooO0O0;
                if (i4 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                OooO0o oooO0o = arrayList.get(i4);
                if (oooO0o instanceof OooO0OO) {
                    OooO00o((OooO0OO) oooO0o, matrix2, canvas, i, i2);
                } else {
                    if (oooO0o instanceof OooO) {
                        OooO oooO = (OooO) oooO0o;
                        float f2 = i / this.f36096OooOO0;
                        float f3 = i2 / this.f36097OooOO0O;
                        float fMin = Math.min(f2, f3);
                        Matrix matrix3 = this.f36090OooO0OO;
                        matrix3.set(matrix2);
                        matrix3.postScale(f2, f3);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                        i3 = i4;
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f4 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                        if (fAbs != 0.0f) {
                            oooO.getClass();
                            Path path = this.f36088OooO00o;
                            path.reset();
                            o00000oO.OooOOO.OooO00o[] oooO00oArr = oooO.f36059OooO00o;
                            if (oooO00oArr != null) {
                                o00000oO.OooOOO.OooO00o.OooO0O0(oooO00oArr, path);
                            }
                            Path path2 = this.f36089OooO0O0;
                            path2.reset();
                            if (oooO instanceof OooO00o) {
                                path2.setFillType(oooO.f36061OooO0OO == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                path2.addPath(path, matrix3);
                                canvas.clipPath(path2);
                            } else {
                                OooO0O0 oooO0O0 = (OooO0O0) oooO;
                                float f5 = oooO0O0.f36068OooOO0;
                                if (f5 != 0.0f || oooO0O0.f36069OooOO0O != 1.0f) {
                                    float f6 = oooO0O0.f36070OooOO0o;
                                    float f7 = (f5 + f6) % 1.0f;
                                    float f8 = (oooO0O0.f36069OooOO0O + f6) % 1.0f;
                                    if (this.f36092OooO0o == null) {
                                        this.f36092OooO0o = new PathMeasure();
                                    }
                                    this.f36092OooO0o.setPath(path, false);
                                    float length = this.f36092OooO0o.getLength();
                                    float f9 = f7 * length;
                                    float f10 = f8 * length;
                                    path.reset();
                                    if (f9 > f10) {
                                        this.f36092OooO0o.getSegment(f9, length, path, true);
                                        f = 0.0f;
                                        this.f36092OooO0o.getSegment(0.0f, f10, path, true);
                                    } else {
                                        f = 0.0f;
                                        this.f36092OooO0o.getSegment(f9, f10, path, true);
                                    }
                                    path.rLineTo(f, f);
                                }
                                path2.addPath(path, matrix3);
                                o0OoOo0 o0oooo1 = oooO0O0.f36066OooO0oO;
                                if ((o0oooo1.f33739OooO00o != null) || o0oooo1.f33741OooO0OO != 0) {
                                    if (this.f36093OooO0o0 == null) {
                                        Paint paint = new Paint(1);
                                        this.f36093OooO0o0 = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f36093OooO0o0;
                                    Shader shader = o0oooo1.f33739OooO00o;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(oooO0O0.f36063OooO * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i5 = o0oooo1.f33741OooO0OO;
                                        float f11 = oooO0O0.f36063OooO;
                                        PorterDuff.Mode mode = OooOOO.f36050OooOOO0;
                                        paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    path2.setFillType(oooO0O0.f36061OooO0OO == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(path2, paint2);
                                }
                                o0OoOo0 o0oooo2 = oooO0O0.f36065OooO0o0;
                                if ((o0oooo2.f33739OooO00o != null) || o0oooo2.f33741OooO0OO != 0) {
                                    if (this.f36091OooO0Oo == null) {
                                        z = true;
                                        Paint paint3 = new Paint(1);
                                        this.f36091OooO0Oo = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    } else {
                                        z = true;
                                    }
                                    Paint paint4 = this.f36091OooO0Oo;
                                    Paint.Join join = oooO0O0.f36071OooOOO;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = oooO0O0.f36072OooOOO0;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(oooO0O0.f36073OooOOOO);
                                    Shader shader2 = o0oooo2.f33739OooO00o;
                                    if (shader2 == null) {
                                        z = false;
                                    }
                                    if (z) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(oooO0O0.f36067OooO0oo * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i6 = o0oooo2.f33741OooO0OO;
                                        float f12 = oooO0O0.f36067OooO0oo;
                                        PorterDuff.Mode mode2 = OooOOO.f36050OooOOO0;
                                        paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f12)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(oooO0O0.f36064OooO0o * fAbs * fMin);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                    }
                    i4 = i3 + 1;
                    c = 0;
                }
                i3 = i4;
                i4 = i3 + 1;
                c = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f36098OooOO0o;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f36098OooOO0o = i;
        }

        public OooOO0(OooOO0 oooOO1) {
            this.f36090OooO0OO = new Matrix();
            this.f36095OooO0oo = 0.0f;
            this.f36087OooO = 0.0f;
            this.f36096OooOO0 = 0.0f;
            this.f36097OooOO0O = 0.0f;
            this.f36098OooOO0o = 255;
            this.f36100OooOOO0 = null;
            this.f36099OooOOO = null;
            p190o00o0O.OooO<String, Object> oooO = new p190o00o0O.OooO<>();
            this.f36101OooOOOO = oooO;
            this.f36094OooO0oO = new OooO0OO(oooOO1.f36094OooO0oO, oooO);
            this.f36088OooO00o = new Path(oooOO1.f36088OooO00o);
            this.f36089OooO0O0 = new Path(oooOO1.f36089OooO0O0);
            this.f36095OooO0oo = oooOO1.f36095OooO0oo;
            this.f36087OooO = oooOO1.f36087OooO;
            this.f36096OooOO0 = oooOO1.f36096OooOO0;
            this.f36097OooOO0O = oooOO1.f36097OooOO0O;
            this.f36098OooOO0o = oooOO1.f36098OooOO0o;
            this.f36100OooOOO0 = oooOO1.f36100OooOOO0;
            String str = oooOO1.f36100OooOOO0;
            if (str != null) {
                oooO.put(str, this);
            }
            this.f36099OooOOO = oooOO1.f36099OooOOO;
        }
    }
}
