package p104o000oo00;

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
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p021OooOooo.Oooo0;
import p081o000OoO.o000oOoO;
import p081o000OoO.o00oO0o;
import p084o000Ooo.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends OooOo00 {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final PorterDuff.Mode f29874OoooOo0 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f29875OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public PorterDuffColorFilter f29876OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooOO0O f29877OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ColorFilter f29878OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f29879OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final Matrix f29880OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final Rect f29881OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final float[] f29882o000oOoO;

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
        public int f29926OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f29927OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooOO0 f29928OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ColorStateList f29929OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public PorterDuff.Mode f29930OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Bitmap f29931OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f29932OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ColorStateList f29933OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public PorterDuff.Mode f29934OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f29935OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f29936OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Paint f29937OooOO0o;

        public OooOO0O(OooOO0O oooOO0O) {
            this.f29929OooO0OO = null;
            this.f29930OooO0Oo = OooOo.f29874OoooOo0;
            if (oooOO0O != null) {
                this.f29927OooO00o = oooOO0O.f29927OooO00o;
                OooOO0 oooOO1 = new OooOO0(oooOO0O.f29928OooO0O0);
                this.f29928OooO0O0 = oooOO1;
                if (oooOO0O.f29928OooO0O0.f29917OooO0o0 != null) {
                    oooOO1.f29917OooO0o0 = new Paint(oooOO0O.f29928OooO0O0.f29917OooO0o0);
                }
                if (oooOO0O.f29928OooO0O0.f29915OooO0Oo != null) {
                    this.f29928OooO0O0.f29915OooO0Oo = new Paint(oooOO0O.f29928OooO0O0.f29915OooO0Oo);
                }
                this.f29929OooO0OO = oooOO0O.f29929OooO0OO;
                this.f29930OooO0Oo = oooOO0O.f29930OooO0Oo;
                this.f29932OooO0o0 = oooOO0O.f29932OooO0o0;
            }
        }

        public final boolean OooO00o() {
            OooOO0 oooOO1 = this.f29928OooO0O0;
            if (oooOO1.f29923OooOOO == null) {
                oooOO1.f29923OooOOO = Boolean.valueOf(oooOO1.f29918OooO0oO.OooO00o());
            }
            return oooOO1.f29923OooOOO.booleanValue();
        }

        public final void OooO0O0(int i, int i2) {
            this.f29931OooO0o.eraseColor(0);
            Canvas canvas = new Canvas(this.f29931OooO0o);
            OooOO0 oooOO1 = this.f29928OooO0O0;
            oooOO1.OooO00o(oooOO1.f29918OooO0oO, OooOO0.f29910OooOOOo, canvas, i, i2);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29927OooO00o;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new OooOo(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new OooOo(this);
        }

        public OooOO0O() {
            this.f29929OooO0OO = null;
            this.f29930OooO0Oo = OooOo.f29874OoooOo0;
            this.f29928OooO0O0 = new OooOO0();
        }
    }

    public OooOo() {
        this.f29879OoooOO0 = true;
        this.f29882o000oOoO = new float[9];
        this.f29880OoooOOO = new Matrix();
        this.f29881OoooOOo = new Rect();
        this.f29877OoooO00 = new OooOO0O();
    }

    public static OooOo OooO00o(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        OooOo oooOo = new OooOo();
        oooOo.inflate(resources, xmlPullParser, attributeSet, theme);
        return oooOo;
    }

    public final PorterDuffColorFilter OooO0O0(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f29939Oooo;
        if (drawable == null) {
            return false;
        }
        o0OOO0o.OooO0O0.OooO0O0(drawable);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f29881OoooOOo);
        if (this.f29881OoooOOo.width() <= 0 || this.f29881OoooOOo.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f29878OoooO0O;
        if (colorFilter == null) {
            colorFilter = this.f29876OoooO0;
        }
        canvas.getMatrix(this.f29880OoooOOO);
        this.f29880OoooOOO.getValues(this.f29882o000oOoO);
        float fAbs = Math.abs(this.f29882o000oOoO[0]);
        float fAbs2 = Math.abs(this.f29882o000oOoO[4]);
        float fAbs3 = Math.abs(this.f29882o000oOoO[1]);
        float fAbs4 = Math.abs(this.f29882o000oOoO[3]);
        if (fAbs3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || fAbs4 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f29881OoooOOo.width() * fAbs);
        int iHeight = (int) (this.f29881OoooOOo.height() * fAbs2);
        int iMin = Math.min(RecyclerView.oo0o0Oo.FLAG_MOVED, iWidth);
        int iMin2 = Math.min(RecyclerView.oo0o0Oo.FLAG_MOVED, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f29881OoooOOo;
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && o0OOO0o.OooO0O0(this) == 1) {
            canvas.translate(this.f29881OoooOOo.width(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f29881OoooOOo.offsetTo(0, 0);
        OooOO0O oooOO0O = this.f29877OoooO00;
        Bitmap bitmap = oooOO0O.f29931OooO0o;
        if (bitmap == null) {
            oooOO0O.f29931OooO0o = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oooOO0O.f29936OooOO0O = true;
        } else {
            if (!(iMin == bitmap.getWidth() && iMin2 == oooOO0O.f29931OooO0o.getHeight())) {
                oooOO0O.f29931OooO0o = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                oooOO0O.f29936OooOO0O = true;
            }
        }
        if (this.f29879OoooOO0) {
            OooOO0O oooOO0O2 = this.f29877OoooO00;
            if (!(!oooOO0O2.f29936OooOO0O && oooOO0O2.f29933OooO0oO == oooOO0O2.f29929OooO0OO && oooOO0O2.f29934OooO0oo == oooOO0O2.f29930OooO0Oo && oooOO0O2.f29935OooOO0 == oooOO0O2.f29932OooO0o0 && oooOO0O2.f29926OooO == oooOO0O2.f29928OooO0O0.getRootAlpha())) {
                this.f29877OoooO00.OooO0O0(iMin, iMin2);
                OooOO0O oooOO0O3 = this.f29877OoooO00;
                oooOO0O3.f29933OooO0oO = oooOO0O3.f29929OooO0OO;
                oooOO0O3.f29934OooO0oo = oooOO0O3.f29930OooO0Oo;
                oooOO0O3.f29926OooO = oooOO0O3.f29928OooO0O0.getRootAlpha();
                oooOO0O3.f29935OooOO0 = oooOO0O3.f29932OooO0o0;
                oooOO0O3.f29936OooOO0O = false;
            }
        } else {
            this.f29877OoooO00.OooO0O0(iMin, iMin2);
        }
        OooOO0O oooOO0O4 = this.f29877OoooO00;
        Rect rect2 = this.f29881OoooOOo;
        if ((oooOO0O4.f29928OooO0O0.getRootAlpha() < 255) || colorFilter != null) {
            if (oooOO0O4.f29937OooOO0o == null) {
                Paint paint2 = new Paint();
                oooOO0O4.f29937OooOO0o = paint2;
                paint2.setFilterBitmap(true);
            }
            oooOO0O4.f29937OooOO0o.setAlpha(oooOO0O4.f29928OooO0O0.getRootAlpha());
            oooOO0O4.f29937OooOO0o.setColorFilter(colorFilter);
            paint = oooOO0O4.f29937OooOO0o;
        } else {
            paint = null;
        }
        canvas.drawBitmap(oooOO0O4.f29931OooO0o, (Rect) null, rect2, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f29939Oooo;
        return drawable != null ? o0OOO0o.OooO00o.OooO00o(drawable) : this.f29877OoooO00.f29928OooO0O0.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f29939Oooo;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f29877OoooO00.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f29939Oooo;
        return drawable != null ? o0OOO0o.OooO0O0.OooO0OO(drawable) : this.f29878OoooO0O;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f29939Oooo != null && Build.VERSION.SDK_INT >= 24) {
            return new OooOOO0(this.f29939Oooo.getConstantState());
        }
        this.f29877OoooO00.f29927OooO00o = getChangingConfigurations();
        return this.f29877OoooO00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f29939Oooo;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f29877OoooO00.f29928OooO0O0.f29911OooO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f29939Oooo;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f29877OoooO00.f29928OooO0O0.f29919OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f29939Oooo;
        return drawable != null ? o0OOO0o.OooO00o.OooO0Oo(drawable) : this.f29877OoooO00.f29932OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        OooOO0O oooOO0O;
        ColorStateList colorStateList;
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((oooOO0O = this.f29877OoooO00) != null && (oooOO0O.OooO00o() || ((colorStateList = this.f29877OoooO00.f29929OooO0OO) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f29875OoooO && super.mutate() == this) {
            this.f29877OoooO00 = new OooOO0O(this.f29877OoooO00);
            this.f29875OoooO = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        OooOO0O oooOO0O = this.f29877OoooO00;
        ColorStateList colorStateList = oooOO0O.f29929OooO0OO;
        if (colorStateList != null && (mode = oooOO0O.f29930OooO0Oo) != null) {
            this.f29876OoooO0 = OooO0O0(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (oooOO0O.OooO00o()) {
            boolean zOooO0O0 = oooOO0O.f29928OooO0O0.f29918OooO0oO.OooO0O0(iArr);
            oooOO0O.f29936OooOO0O |= zOooO0O0;
            if (zOooO0O0) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f29877OoooO00.f29928OooO0O0.getRootAlpha() != i) {
            this.f29877OoooO00.f29928OooO0O0.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            o0OOO0o.OooO00o.OooO0o0(drawable, z);
        } else {
            this.f29877OoooO00.f29932OooO0o0 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f29878OoooO0O = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0oO(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0oo(drawable, colorStateList);
            return;
        }
        OooOO0O oooOO0O = this.f29877OoooO00;
        if (oooOO0O.f29929OooO0OO != colorStateList) {
            oooOO0O.f29929OooO0OO = colorStateList;
            this.f29876OoooO0 = OooO0O0(colorStateList, oooOO0O.f29930OooO0Oo);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO(drawable, mode);
            return;
        }
        OooOO0O oooOO0O = this.f29877OoooO00;
        if (oooOO0O.f29930OooO0Oo != mode) {
            oooOO0O.f29930OooO0Oo = mode;
            this.f29876OoooO0 = OooO0O0(oooOO0O.f29929OooO0OO, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f29939Oooo;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi(24)
    public static class OooOOO0 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Drawable.ConstantState f29938OooO00o;

        public OooOOO0(Drawable.ConstantState constantState) {
            this.f29938OooO00o = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f29938OooO00o.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29938OooO00o.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            OooOo oooOo = new OooOo();
            oooOo.f29939Oooo = (VectorDrawable) this.f29938OooO00o.newDrawable();
            return oooOo;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            OooOo oooOo = new OooOo();
            oooOo.f29939Oooo = (VectorDrawable) this.f29938OooO00o.newDrawable(resources);
            return oooOo;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            OooOo oooOo = new OooOo();
            oooOo.f29939Oooo = (VectorDrawable) this.f29938OooO00o.newDrawable(resources, theme);
            return oooOo;
        }
    }

    public static abstract class OooO extends OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o000O0o.OooOO0O.OooO00o[] f29883OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f29884OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f29885OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f29886OooO0Oo;

        public OooO() {
            this.f29883OooO00o = null;
            this.f29885OooO0OO = 0;
        }

        public o000O0o.OooOO0O.OooO00o[] getPathData() {
            return this.f29883OooO00o;
        }

        public String getPathName() {
            return this.f29884OooO0O0;
        }

        public void setPathData(o000O0o.OooOO0O.OooO00o[] oooO00oArr) {
            if (!p071o000O0o.OooOO0O.OooO00o(this.f29883OooO00o, oooO00oArr)) {
                this.f29883OooO00o = p071o000O0o.OooOO0O.OooO0o0(oooO00oArr);
                return;
            }
            o000O0o.OooOO0O.OooO00o[] oooO00oArr2 = this.f29883OooO00o;
            for (int i = 0; i < oooO00oArr.length; i++) {
                oooO00oArr2[i].f28188OooO00o = oooO00oArr[i].f28188OooO00o;
                for (int i2 = 0; i2 < oooO00oArr[i].f28189OooO0O0.length; i2++) {
                    oooO00oArr2[i].f28189OooO0O0[i2] = oooO00oArr[i].f28189OooO0O0[i2];
                }
            }
        }

        public OooO(OooO oooO) {
            this.f29883OooO00o = null;
            this.f29885OooO0OO = 0;
            this.f29884OooO0O0 = oooO.f29884OooO0O0;
            this.f29886OooO0Oo = oooO.f29886OooO0Oo;
            this.f29883OooO00o = p071o000O0o.OooOO0O.OooO0o0(oooO.f29883OooO00o);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Resources resources2 = resources;
        Drawable drawable = this.f29939Oooo;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0Oo(drawable, resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        OooOO0O oooOO0O = this.f29877OoooO00;
        oooOO0O.f29928OooO0O0 = new OooOO0();
        TypedArray typedArrayOooOO0 = o00oO0o.OooOO0(resources2, theme, attributeSet, p104o000oo00.OooOO0.f29850OooO00o);
        OooOO0O oooOO0O2 = this.f29877OoooO00;
        OooOO0 oooOO1 = oooOO0O2.f29928OooO0O0;
        int iOooO0o = o00oO0o.OooO0o(typedArrayOooOO0, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (iOooO0o == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iOooO0o != 5) {
            if (iOooO0o != 9) {
                switch (iOooO0o) {
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
        oooOO0O2.f29930OooO0Oo = mode;
        ColorStateList colorStateListOooO0OO = o00oO0o.OooO0OO(typedArrayOooOO0, xmlPullParser, theme);
        if (colorStateListOooO0OO != null) {
            oooOO0O2.f29929OooO0OO = colorStateListOooO0OO;
        }
        oooOO0O2.f29932OooO0o0 = o00oO0o.OooO00o(typedArrayOooOO0, xmlPullParser, "autoMirrored", 5, oooOO0O2.f29932OooO0o0);
        oooOO1.f29920OooOO0 = o00oO0o.OooO0o0(typedArrayOooOO0, xmlPullParser, "viewportWidth", 7, oooOO1.f29920OooOO0);
        float fOooO0o0 = o00oO0o.OooO0o0(typedArrayOooOO0, xmlPullParser, "viewportHeight", 8, oooOO1.f29921OooOO0O);
        oooOO1.f29921OooOO0O = fOooO0o0;
        if (oooOO1.f29920OooOO0 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            throw new XmlPullParserException(typedArrayOooOO0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fOooO0o0 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            oooOO1.f29919OooO0oo = typedArrayOooOO0.getDimension(3, oooOO1.f29919OooO0oo);
            int i = 2;
            float dimension = typedArrayOooOO0.getDimension(2, oooOO1.f29911OooO);
            oooOO1.f29911OooO = dimension;
            if (oooOO1.f29919OooO0oo <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                throw new XmlPullParserException(typedArrayOooOO0.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                oooOO1.setAlpha(o00oO0o.OooO0o0(typedArrayOooOO0, xmlPullParser, "alpha", 4, oooOO1.getAlpha()));
                String string = typedArrayOooOO0.getString(0);
                if (string != null) {
                    oooOO1.f29924OooOOO0 = string;
                    oooOO1.f29925OooOOOO.put(string, oooOO1);
                }
                typedArrayOooOO0.recycle();
                oooOO0O.f29927OooO00o = getChangingConfigurations();
                int i2 = 1;
                oooOO0O.f29936OooOO0O = true;
                OooOO0O oooOO0O3 = this.f29877OoooO00;
                OooOO0 oooOO2 = oooOO0O3.f29928OooO0O0;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(oooOO2.f29918OooO0oO);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z = true;
                for (int i3 = 3; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != i3); i3 = 3) {
                    if (eventType == i) {
                        String name = xmlPullParser.getName();
                        OooO0OO oooO0OO = (OooO0OO) arrayDeque.peek();
                        if ("path".equals(name)) {
                            OooO0O0 oooO0O0 = new OooO0O0();
                            TypedArray typedArrayOooOO1 = o00oO0o.OooOO0(resources2, theme, attributeSet, p104o000oo00.OooOO0.f29852OooO0OO);
                            if (o00oO0o.OooO(xmlPullParser, "pathData")) {
                                String string2 = typedArrayOooOO1.getString(0);
                                if (string2 != null) {
                                    oooO0O0.f29884OooO0O0 = string2;
                                }
                                String string3 = typedArrayOooOO1.getString(2);
                                if (string3 != null) {
                                    oooO0O0.f29883OooO00o = p071o000O0o.OooOO0O.OooO0OO(string3);
                                }
                                oooO0O0.f29890OooO0oO = o00oO0o.OooO0Oo(typedArrayOooOO1, xmlPullParser, theme, "fillColor", 1);
                                oooO0O0.f29887OooO = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "fillAlpha", 12, oooO0O0.f29887OooO);
                                int iOooO0o2 = o00oO0o.OooO0o(typedArrayOooOO1, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = oooO0O0.f29896OooOOO0;
                                if (iOooO0o2 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (iOooO0o2 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (iOooO0o2 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                oooO0O0.f29896OooOOO0 = cap;
                                int iOooO0o3 = o00oO0o.OooO0o(typedArrayOooOO1, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = oooO0O0.f29895OooOOO;
                                if (iOooO0o3 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (iOooO0o3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (iOooO0o3 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                oooO0O0.f29895OooOOO = join;
                                oooO0O0.f29897OooOOOO = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "strokeMiterLimit", 10, oooO0O0.f29897OooOOOO);
                                oooO0O0.f29889OooO0o0 = o00oO0o.OooO0Oo(typedArrayOooOO1, xmlPullParser, theme, "strokeColor", 3);
                                oooO0O0.f29891OooO0oo = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "strokeAlpha", 11, oooO0O0.f29891OooO0oo);
                                oooO0O0.f29888OooO0o = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "strokeWidth", 4, oooO0O0.f29888OooO0o);
                                oooO0O0.f29893OooOO0O = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "trimPathEnd", 6, oooO0O0.f29893OooOO0O);
                                oooO0O0.f29894OooOO0o = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "trimPathOffset", 7, oooO0O0.f29894OooOO0o);
                                oooO0O0.f29892OooOO0 = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "trimPathStart", 5, oooO0O0.f29892OooOO0);
                                oooO0O0.f29885OooO0OO = o00oO0o.OooO0o(typedArrayOooOO1, xmlPullParser, "fillType", 13, oooO0O0.f29885OooO0OO);
                            }
                            typedArrayOooOO1.recycle();
                            oooO0OO.f29900OooO0O0.add(oooO0O0);
                            if (oooO0O0.getPathName() != null) {
                                oooOO2.f29925OooOOOO.put(oooO0O0.getPathName(), oooO0O0);
                            }
                            oooOO0O3.f29927OooO00o = oooO0O0.f29886OooO0Oo | oooOO0O3.f29927OooO00o;
                            z = false;
                        } else {
                            depth = depth;
                            if ("clip-path".equals(name)) {
                                OooO00o oooO00o = new OooO00o();
                                if (o00oO0o.OooO(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayOooOO2 = o00oO0o.OooOO0(resources2, theme, attributeSet, p104o000oo00.OooOO0.f29853OooO0Oo);
                                    String string4 = typedArrayOooOO2.getString(0);
                                    if (string4 != null) {
                                        oooO00o.f29884OooO0O0 = string4;
                                    }
                                    String string5 = typedArrayOooOO2.getString(1);
                                    if (string5 != null) {
                                        oooO00o.f29883OooO00o = p071o000O0o.OooOO0O.OooO0OO(string5);
                                    }
                                    oooO00o.f29885OooO0OO = o00oO0o.OooO0o(typedArrayOooOO2, xmlPullParser, "fillType", 2, 0);
                                    typedArrayOooOO2.recycle();
                                }
                                oooO0OO.f29900OooO0O0.add(oooO00o);
                                if (oooO00o.getPathName() != null) {
                                    oooOO2.f29925OooOOOO.put(oooO00o.getPathName(), oooO00o);
                                }
                                oooOO0O3.f29927OooO00o |= oooO00o.f29886OooO0Oo;
                            } else if ("group".equals(name)) {
                                OooO0OO oooO0OO2 = new OooO0OO();
                                TypedArray typedArrayOooOO3 = o00oO0o.OooOO0(resources2, theme, attributeSet, p104o000oo00.OooOO0.f29851OooO0O0);
                                oooO0OO2.f29901OooO0OO = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "rotation", 5, oooO0OO2.f29901OooO0OO);
                                oooO0OO2.f29902OooO0Oo = typedArrayOooOO3.getFloat(1, oooO0OO2.f29902OooO0Oo);
                                oooO0OO2.f29904OooO0o0 = typedArrayOooOO3.getFloat(2, oooO0OO2.f29904OooO0o0);
                                oooO0OO2.f29903OooO0o = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "scaleX", 3, oooO0OO2.f29903OooO0o);
                                oooO0OO2.f29905OooO0oO = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "scaleY", 4, oooO0OO2.f29905OooO0oO);
                                oooO0OO2.f29906OooO0oo = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "translateX", 6, oooO0OO2.f29906OooO0oo);
                                oooO0OO2.f29898OooO = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "translateY", 7, oooO0OO2.f29898OooO);
                                String string6 = typedArrayOooOO3.getString(0);
                                if (string6 != null) {
                                    oooO0OO2.f29909OooOO0o = string6;
                                }
                                oooO0OO2.OooO0OO();
                                typedArrayOooOO3.recycle();
                                oooO0OO.f29900OooO0O0.add(oooO0OO2);
                                arrayDeque.push(oooO0OO2);
                                if (oooO0OO2.getGroupName() != null) {
                                    oooOO2.f29925OooOOOO.put(oooO0OO2.getGroupName(), oooO0OO2);
                                }
                                oooOO0O3.f29927OooO00o = oooO0OO2.f29908OooOO0O | oooOO0O3.f29927OooO00o;
                            }
                        }
                    } else {
                        depth = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    resources2 = resources;
                    depth = depth;
                    i2 = 1;
                    i = 2;
                }
                if (!z) {
                    this.f29876OoooO0 = OooO0O0(oooOO0O.f29929OooO0OO, oooOO0O.f29930OooO0Oo);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayOooOO0.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayOooOO0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public OooOo(@NonNull OooOO0O oooOO0O) {
        this.f29879OoooOO0 = true;
        this.f29882o000oOoO = new float[9];
        this.f29880OoooOOO = new Matrix();
        this.f29881OoooOOo = new Rect();
        this.f29877OoooO00 = oooOO0O;
        this.f29876OoooO0 = OooO0O0(oooOO0O.f29929OooO0OO, oooOO0O.f29930OooO0Oo);
    }

    public static class OooO0O0 extends OooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f29887OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f29888OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o000oOoO f29889OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public o000oOoO f29890OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f29891OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f29892OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f29893OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f29894OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Paint.Join f29895OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Paint.Cap f29896OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public float f29897OooOOOO;

        public OooO0O0() {
            this.f29888OooO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29891OooO0oo = 1.0f;
            this.f29887OooO = 1.0f;
            this.f29892OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29893OooOO0O = 1.0f;
            this.f29894OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29896OooOOO0 = Paint.Cap.BUTT;
            this.f29895OooOOO = Paint.Join.MITER;
            this.f29897OooOOOO = 4.0f;
        }

        @Override // o000oo00.OooOo.OooO0o
        public final boolean OooO00o() {
            return this.f29890OooO0oO.OooO0OO() || this.f29889OooO0o0.OooO0OO();
        }

        @Override // o000oo00.OooOo.OooO0o
        public final boolean OooO0O0(int[] iArr) {
            return this.f29889OooO0o0.OooO0Oo(iArr) | this.f29890OooO0oO.OooO0Oo(iArr);
        }

        public float getFillAlpha() {
            return this.f29887OooO;
        }

        @ColorInt
        public int getFillColor() {
            return this.f29890OooO0oO.f28355OooO0OO;
        }

        public float getStrokeAlpha() {
            return this.f29891OooO0oo;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f29889OooO0o0.f28355OooO0OO;
        }

        public float getStrokeWidth() {
            return this.f29888OooO0o;
        }

        public float getTrimPathEnd() {
            return this.f29893OooOO0O;
        }

        public float getTrimPathOffset() {
            return this.f29894OooOO0o;
        }

        public float getTrimPathStart() {
            return this.f29892OooOO0;
        }

        public void setFillAlpha(float f) {
            this.f29887OooO = f;
        }

        public void setFillColor(int i) {
            this.f29890OooO0oO.f28355OooO0OO = i;
        }

        public void setStrokeAlpha(float f) {
            this.f29891OooO0oo = f;
        }

        public void setStrokeColor(int i) {
            this.f29889OooO0o0.f28355OooO0OO = i;
        }

        public void setStrokeWidth(float f) {
            this.f29888OooO0o = f;
        }

        public void setTrimPathEnd(float f) {
            this.f29893OooOO0O = f;
        }

        public void setTrimPathOffset(float f) {
            this.f29894OooOO0o = f;
        }

        public void setTrimPathStart(float f) {
            this.f29892OooOO0 = f;
        }

        public OooO0O0(OooO0O0 oooO0O0) {
            super(oooO0O0);
            this.f29888OooO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29891OooO0oo = 1.0f;
            this.f29887OooO = 1.0f;
            this.f29892OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29893OooOO0O = 1.0f;
            this.f29894OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29896OooOOO0 = Paint.Cap.BUTT;
            this.f29895OooOOO = Paint.Join.MITER;
            this.f29897OooOOOO = 4.0f;
            this.f29889OooO0o0 = oooO0O0.f29889OooO0o0;
            this.f29888OooO0o = oooO0O0.f29888OooO0o;
            this.f29891OooO0oo = oooO0O0.f29891OooO0oo;
            this.f29890OooO0oO = oooO0O0.f29890OooO0oO;
            this.f29885OooO0OO = oooO0O0.f29885OooO0OO;
            this.f29887OooO = oooO0O0.f29887OooO;
            this.f29892OooOO0 = oooO0O0.f29892OooOO0;
            this.f29893OooOO0O = oooO0O0.f29893OooOO0O;
            this.f29894OooOO0o = oooO0O0.f29894OooOO0o;
            this.f29896OooOOO0 = oooO0O0.f29896OooOOO0;
            this.f29895OooOOO = oooO0O0.f29895OooOOO;
            this.f29897OooOOOO = oooO0O0.f29897OooOOOO;
        }
    }

    public static class OooO0OO extends OooO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f29898OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f29899OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO0o> f29900OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f29901OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f29902OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f29903OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f29904OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f29905OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f29906OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final Matrix f29907OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f29908OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public String f29909OooOO0o;

        public OooO0OO() {
            this.f29899OooO00o = new Matrix();
            this.f29900OooO0O0 = new ArrayList<>();
            this.f29901OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29902OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29904OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29903OooO0o = 1.0f;
            this.f29905OooO0oO = 1.0f;
            this.f29906OooO0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29898OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29907OooOO0 = new Matrix();
            this.f29909OooOO0o = null;
        }

        @Override // o000oo00.OooOo.OooO0o
        public final boolean OooO00o() {
            for (int i = 0; i < this.f29900OooO0O0.size(); i++) {
                if (this.f29900OooO0O0.get(i).OooO00o()) {
                    return true;
                }
            }
            return false;
        }

        @Override // o000oo00.OooOo.OooO0o
        public final boolean OooO0O0(int[] iArr) {
            boolean zOooO0O0 = false;
            for (int i = 0; i < this.f29900OooO0O0.size(); i++) {
                zOooO0O0 |= this.f29900OooO0O0.get(i).OooO0O0(iArr);
            }
            return zOooO0O0;
        }

        public final void OooO0OO() {
            this.f29907OooOO0.reset();
            this.f29907OooOO0.postTranslate(-this.f29902OooO0Oo, -this.f29904OooO0o0);
            this.f29907OooOO0.postScale(this.f29903OooO0o, this.f29905OooO0oO);
            this.f29907OooOO0.postRotate(this.f29901OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f29907OooOO0.postTranslate(this.f29906OooO0oo + this.f29902OooO0Oo, this.f29898OooO + this.f29904OooO0o0);
        }

        public String getGroupName() {
            return this.f29909OooOO0o;
        }

        public Matrix getLocalMatrix() {
            return this.f29907OooOO0;
        }

        public float getPivotX() {
            return this.f29902OooO0Oo;
        }

        public float getPivotY() {
            return this.f29904OooO0o0;
        }

        public float getRotation() {
            return this.f29901OooO0OO;
        }

        public float getScaleX() {
            return this.f29903OooO0o;
        }

        public float getScaleY() {
            return this.f29905OooO0oO;
        }

        public float getTranslateX() {
            return this.f29906OooO0oo;
        }

        public float getTranslateY() {
            return this.f29898OooO;
        }

        public void setPivotX(float f) {
            if (f != this.f29902OooO0Oo) {
                this.f29902OooO0Oo = f;
                OooO0OO();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f29904OooO0o0) {
                this.f29904OooO0o0 = f;
                OooO0OO();
            }
        }

        public void setRotation(float f) {
            if (f != this.f29901OooO0OO) {
                this.f29901OooO0OO = f;
                OooO0OO();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f29903OooO0o) {
                this.f29903OooO0o = f;
                OooO0OO();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f29905OooO0oO) {
                this.f29905OooO0oO = f;
                OooO0OO();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f29906OooO0oo) {
                this.f29906OooO0oo = f;
                OooO0OO();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f29898OooO) {
                this.f29898OooO = f;
                OooO0OO();
            }
        }

        public OooO0OO(OooO0OO oooO0OO, Oooo0<String, Object> oooo0) {
            OooO oooO00o;
            this.f29899OooO00o = new Matrix();
            this.f29900OooO0O0 = new ArrayList<>();
            this.f29901OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29902OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29904OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29903OooO0o = 1.0f;
            this.f29905OooO0oO = 1.0f;
            this.f29906OooO0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29898OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Matrix matrix = new Matrix();
            this.f29907OooOO0 = matrix;
            this.f29909OooOO0o = null;
            this.f29901OooO0OO = oooO0OO.f29901OooO0OO;
            this.f29902OooO0Oo = oooO0OO.f29902OooO0Oo;
            this.f29904OooO0o0 = oooO0OO.f29904OooO0o0;
            this.f29903OooO0o = oooO0OO.f29903OooO0o;
            this.f29905OooO0oO = oooO0OO.f29905OooO0oO;
            this.f29906OooO0oo = oooO0OO.f29906OooO0oo;
            this.f29898OooO = oooO0OO.f29898OooO;
            String str = oooO0OO.f29909OooOO0o;
            this.f29909OooOO0o = str;
            this.f29908OooOO0O = oooO0OO.f29908OooOO0O;
            if (str != null) {
                oooo0.put(str, this);
            }
            matrix.set(oooO0OO.f29907OooOO0);
            ArrayList<OooO0o> arrayList = oooO0OO.f29900OooO0O0;
            for (int i = 0; i < arrayList.size(); i++) {
                OooO0o oooO0o = arrayList.get(i);
                if (oooO0o instanceof OooO0OO) {
                    this.f29900OooO0O0.add(new OooO0OO((OooO0OO) oooO0o, oooo0));
                } else {
                    if (oooO0o instanceof OooO0O0) {
                        oooO00o = new OooO0O0((OooO0O0) oooO0o);
                    } else if (oooO0o instanceof OooO00o) {
                        oooO00o = new OooO00o((OooO00o) oooO0o);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f29900OooO0O0.add(oooO00o);
                    String str2 = oooO00o.f29884OooO0O0;
                    if (str2 != null) {
                        oooo0.put(str2, oooO00o);
                    }
                }
            }
        }
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final Matrix f29910OooOOOo = new Matrix();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f29911OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Path f29912OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Path f29913OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Matrix f29914OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Paint f29915OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public PathMeasure f29916OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Paint f29917OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooO0OO f29918OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f29919OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f29920OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f29921OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f29922OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Boolean f29923OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public String f29924OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final Oooo0<String, Object> f29925OooOOOO;

        public OooOO0() {
            this.f29914OooO0OO = new Matrix();
            this.f29919OooO0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29911OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29920OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29921OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29922OooOO0o = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f29924OooOOO0 = null;
            this.f29923OooOOO = null;
            this.f29925OooOOOO = new Oooo0<>();
            this.f29918OooO0oO = new OooO0OO();
            this.f29912OooO00o = new Path();
            this.f29913OooO0O0 = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r9v14 */
        public final void OooO00o(OooO0OO oooO0OO, Matrix matrix, Canvas canvas, int i, int i2) {
            oooO0OO.f29899OooO00o.set(matrix);
            oooO0OO.f29899OooO00o.preConcat(oooO0OO.f29907OooOO0);
            canvas.save();
            ?? r9 = 0;
            OooOO0 oooOO1 = this;
            int i3 = 0;
            while (i3 < oooO0OO.f29900OooO0O0.size()) {
                OooO0o oooO0o = oooO0OO.f29900OooO0O0.get(i3);
                if (oooO0o instanceof OooO0OO) {
                    OooO00o((OooO0OO) oooO0o, oooO0OO.f29899OooO00o, canvas, i, i2);
                } else {
                    if (oooO0o instanceof OooO) {
                        OooO oooO = (OooO) oooO0o;
                        float f = i / oooOO1.f29920OooOO0;
                        float f2 = i2 / oooOO1.f29921OooOO0O;
                        float fMin = Math.min(f, f2);
                        Matrix matrix2 = oooO0OO.f29899OooO00o;
                        oooOO1.f29914OooO0OO.set(matrix2);
                        oooOO1.f29914OooO0OO.postScale(f, f2);
                        float[] fArr = {ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE};
                        matrix2.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[r9], fArr[1]);
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f3 = (fArr[r9] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Math.abs(f3) / fMax : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        if (fAbs != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            Path path = this.f29912OooO00o;
                            Objects.requireNonNull(oooO);
                            path.reset();
                            o000O0o.OooOO0O.OooO00o[] oooO00oArr = oooO.f29883OooO00o;
                            if (oooO00oArr != null) {
                                o000O0o.OooOO0O.OooO00o.OooO0O0(oooO00oArr, path);
                            }
                            Path path2 = this.f29912OooO00o;
                            this.f29913OooO0O0.reset();
                            if (oooO instanceof OooO00o) {
                                this.f29913OooO0O0.setFillType(oooO.f29885OooO0OO == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                this.f29913OooO0O0.addPath(path2, this.f29914OooO0OO);
                                canvas.clipPath(this.f29913OooO0O0);
                            } else {
                                OooO0O0 oooO0O0 = (OooO0O0) oooO;
                                float f4 = oooO0O0.f29892OooOO0;
                                if (f4 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || oooO0O0.f29893OooOO0O != 1.0f) {
                                    float f5 = oooO0O0.f29894OooOO0o;
                                    float f6 = (f4 + f5) % 1.0f;
                                    float f7 = (oooO0O0.f29893OooOO0O + f5) % 1.0f;
                                    if (this.f29916OooO0o == null) {
                                        this.f29916OooO0o = new PathMeasure();
                                    }
                                    this.f29916OooO0o.setPath(this.f29912OooO00o, r9);
                                    float length = this.f29916OooO0o.getLength();
                                    float f8 = f6 * length;
                                    float f9 = f7 * length;
                                    path2.reset();
                                    if (f8 > f9) {
                                        this.f29916OooO0o.getSegment(f8, length, path2, true);
                                        this.f29916OooO0o.getSegment(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f9, path2, true);
                                    } else {
                                        this.f29916OooO0o.getSegment(f8, f9, path2, true);
                                    }
                                    path2.rLineTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                }
                                this.f29913OooO0O0.addPath(path2, this.f29914OooO0OO);
                                if (oooO0O0.f29890OooO0oO.OooO0o0()) {
                                    o000oOoO o000oooo2 = oooO0O0.f29890OooO0oO;
                                    if (this.f29917OooO0o0 == null) {
                                        Paint paint = new Paint(1);
                                        this.f29917OooO0o0 = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f29917OooO0o0;
                                    if (o000oooo2.OooO0O0()) {
                                        Shader shader = o000oooo2.f28353OooO00o;
                                        shader.setLocalMatrix(this.f29914OooO0OO);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(oooO0O0.f29887OooO * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                        int i4 = o000oooo2.f28355OooO0OO;
                                        float f10 = oooO0O0.f29887OooO;
                                        PorterDuff.Mode mode = OooOo.f29874OoooOo0;
                                        paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f10)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    this.f29913OooO0O0.setFillType(oooO0O0.f29885OooO0OO == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(this.f29913OooO0O0, paint2);
                                }
                                if (oooO0O0.f29889OooO0o0.OooO0o0()) {
                                    o000oOoO o000oooo3 = oooO0O0.f29889OooO0o0;
                                    if (this.f29915OooO0Oo == null) {
                                        Paint paint3 = new Paint(1);
                                        this.f29915OooO0Oo = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = this.f29915OooO0Oo;
                                    Paint.Join join = oooO0O0.f29895OooOOO;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = oooO0O0.f29896OooOOO0;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(oooO0O0.f29897OooOOOO);
                                    if (o000oooo3.OooO0O0()) {
                                        Shader shader2 = o000oooo3.f28353OooO00o;
                                        shader2.setLocalMatrix(this.f29914OooO0OO);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(oooO0O0.f29891OooO0oo * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                        int i5 = o000oooo3.f28355OooO0OO;
                                        float f11 = oooO0O0.f29891OooO0oo;
                                        PorterDuff.Mode mode2 = OooOo.f29874OoooOo0;
                                        paint4.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(oooO0O0.f29888OooO0o * fAbs * fMin);
                                    canvas.drawPath(this.f29913OooO0O0, paint4);
                                }
                            }
                        }
                        oooOO1 = this;
                    }
                    i3++;
                    r9 = 0;
                }
                i3++;
                r9 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f29922OooOO0o;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f29922OooOO0o = i;
        }

        public OooOO0(OooOO0 oooOO1) {
            this.f29914OooO0OO = new Matrix();
            this.f29919OooO0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29911OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29920OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29921OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29922OooOO0o = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f29924OooOOO0 = null;
            this.f29923OooOOO = null;
            Oooo0<String, Object> oooo0 = new Oooo0<>();
            this.f29925OooOOOO = oooo0;
            this.f29918OooO0oO = new OooO0OO(oooOO1.f29918OooO0oO, oooo0);
            this.f29912OooO00o = new Path(oooOO1.f29912OooO00o);
            this.f29913OooO0O0 = new Path(oooOO1.f29913OooO0O0);
            this.f29919OooO0oo = oooOO1.f29919OooO0oo;
            this.f29911OooO = oooOO1.f29911OooO;
            this.f29920OooOO0 = oooOO1.f29920OooOO0;
            this.f29921OooOO0O = oooOO1.f29921OooOO0O;
            this.f29922OooOO0o = oooOO1.f29922OooOO0o;
            this.f29924OooOOO0 = oooOO1.f29924OooOOO0;
            String str = oooOO1.f29924OooOOO0;
            if (str != null) {
                oooo0.put(str, this);
            }
            this.f29923OooOOO = oooOO1.f29923OooOOO;
        }
    }
}
