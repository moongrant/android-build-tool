package p103o000oo00;

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

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final PorterDuff.Mode f29856o000oOoO = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ColorFilter f29857Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooOO0O f29858Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public PorterDuffColorFilter f29859Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Matrix f29860OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f29861OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f29862OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final float[] f29863OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final Rect f29864OoooOO0;

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
        public int f29908OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f29909OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooOO0 f29910OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ColorStateList f29911OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public PorterDuff.Mode f29912OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Bitmap f29913OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f29914OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ColorStateList f29915OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public PorterDuff.Mode f29916OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f29917OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f29918OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Paint f29919OooOO0o;

        public OooOO0O(OooOO0O oooOO0O) {
            this.f29911OooO0OO = null;
            this.f29912OooO0Oo = OooOo.f29856o000oOoO;
            if (oooOO0O != null) {
                this.f29909OooO00o = oooOO0O.f29909OooO00o;
                OooOO0 oooOO1 = new OooOO0(oooOO0O.f29910OooO0O0);
                this.f29910OooO0O0 = oooOO1;
                if (oooOO0O.f29910OooO0O0.f29899OooO0o0 != null) {
                    oooOO1.f29899OooO0o0 = new Paint(oooOO0O.f29910OooO0O0.f29899OooO0o0);
                }
                if (oooOO0O.f29910OooO0O0.f29897OooO0Oo != null) {
                    this.f29910OooO0O0.f29897OooO0Oo = new Paint(oooOO0O.f29910OooO0O0.f29897OooO0Oo);
                }
                this.f29911OooO0OO = oooOO0O.f29911OooO0OO;
                this.f29912OooO0Oo = oooOO0O.f29912OooO0Oo;
                this.f29914OooO0o0 = oooOO0O.f29914OooO0o0;
            }
        }

        public final boolean OooO00o() {
            OooOO0 oooOO1 = this.f29910OooO0O0;
            if (oooOO1.f29905OooOOO == null) {
                oooOO1.f29905OooOOO = Boolean.valueOf(oooOO1.f29900OooO0oO.OooO00o());
            }
            return oooOO1.f29905OooOOO.booleanValue();
        }

        public final void OooO0O0(int i, int i2) {
            this.f29913OooO0o.eraseColor(0);
            Canvas canvas = new Canvas(this.f29913OooO0o);
            OooOO0 oooOO1 = this.f29910OooO0O0;
            oooOO1.OooO00o(oooOO1.f29900OooO0oO, OooOO0.f29892OooOOOo, canvas, i, i2);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29909OooO00o;
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
            this.f29911OooO0OO = null;
            this.f29912OooO0Oo = OooOo.f29856o000oOoO;
            this.f29910OooO0O0 = new OooOO0();
        }
    }

    public OooOo() {
        this.f29861OoooO0 = true;
        this.f29863OoooO0O = new float[9];
        this.f29860OoooO = new Matrix();
        this.f29864OoooOO0 = new Rect();
        this.f29858Oooo0oO = new OooOO0O();
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
        Drawable drawable = this.f29921Oooo0o;
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
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f29864OoooOO0);
        if (this.f29864OoooOO0.width() <= 0 || this.f29864OoooOO0.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f29857Oooo;
        if (colorFilter == null) {
            colorFilter = this.f29859Oooo0oo;
        }
        canvas.getMatrix(this.f29860OoooO);
        this.f29860OoooO.getValues(this.f29863OoooO0O);
        float fAbs = Math.abs(this.f29863OoooO0O[0]);
        float fAbs2 = Math.abs(this.f29863OoooO0O[4]);
        float fAbs3 = Math.abs(this.f29863OoooO0O[1]);
        float fAbs4 = Math.abs(this.f29863OoooO0O[3]);
        if (fAbs3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || fAbs4 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f29864OoooOO0.width() * fAbs);
        int iHeight = (int) (this.f29864OoooOO0.height() * fAbs2);
        int iMin = Math.min(RecyclerView.oo0o0Oo.FLAG_MOVED, iWidth);
        int iMin2 = Math.min(RecyclerView.oo0o0Oo.FLAG_MOVED, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f29864OoooOO0;
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && o0OOO0o.OooO0O0(this) == 1) {
            canvas.translate(this.f29864OoooOO0.width(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f29864OoooOO0.offsetTo(0, 0);
        OooOO0O oooOO0O = this.f29858Oooo0oO;
        Bitmap bitmap = oooOO0O.f29913OooO0o;
        if (bitmap == null) {
            oooOO0O.f29913OooO0o = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oooOO0O.f29918OooOO0O = true;
        } else {
            if (!(iMin == bitmap.getWidth() && iMin2 == oooOO0O.f29913OooO0o.getHeight())) {
                oooOO0O.f29913OooO0o = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                oooOO0O.f29918OooOO0O = true;
            }
        }
        if (this.f29861OoooO0) {
            OooOO0O oooOO0O2 = this.f29858Oooo0oO;
            if (!(!oooOO0O2.f29918OooOO0O && oooOO0O2.f29915OooO0oO == oooOO0O2.f29911OooO0OO && oooOO0O2.f29916OooO0oo == oooOO0O2.f29912OooO0Oo && oooOO0O2.f29917OooOO0 == oooOO0O2.f29914OooO0o0 && oooOO0O2.f29908OooO == oooOO0O2.f29910OooO0O0.getRootAlpha())) {
                this.f29858Oooo0oO.OooO0O0(iMin, iMin2);
                OooOO0O oooOO0O3 = this.f29858Oooo0oO;
                oooOO0O3.f29915OooO0oO = oooOO0O3.f29911OooO0OO;
                oooOO0O3.f29916OooO0oo = oooOO0O3.f29912OooO0Oo;
                oooOO0O3.f29908OooO = oooOO0O3.f29910OooO0O0.getRootAlpha();
                oooOO0O3.f29917OooOO0 = oooOO0O3.f29914OooO0o0;
                oooOO0O3.f29918OooOO0O = false;
            }
        } else {
            this.f29858Oooo0oO.OooO0O0(iMin, iMin2);
        }
        OooOO0O oooOO0O4 = this.f29858Oooo0oO;
        Rect rect2 = this.f29864OoooOO0;
        if ((oooOO0O4.f29910OooO0O0.getRootAlpha() < 255) || colorFilter != null) {
            if (oooOO0O4.f29919OooOO0o == null) {
                Paint paint2 = new Paint();
                oooOO0O4.f29919OooOO0o = paint2;
                paint2.setFilterBitmap(true);
            }
            oooOO0O4.f29919OooOO0o.setAlpha(oooOO0O4.f29910OooO0O0.getRootAlpha());
            oooOO0O4.f29919OooOO0o.setColorFilter(colorFilter);
            paint = oooOO0O4.f29919OooOO0o;
        } else {
            paint = null;
        }
        canvas.drawBitmap(oooOO0O4.f29913OooO0o, (Rect) null, rect2, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? o0OOO0o.OooO00o.OooO00o(drawable) : this.f29858Oooo0oO.f29910OooO0O0.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f29858Oooo0oO.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? o0OOO0o.OooO0O0.OooO0OO(drawable) : this.f29857Oooo;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f29921Oooo0o != null && Build.VERSION.SDK_INT >= 24) {
            return new OooOOO0(this.f29921Oooo0o.getConstantState());
        }
        this.f29858Oooo0oO.f29909OooO00o = getChangingConfigurations();
        return this.f29858Oooo0oO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f29858Oooo0oO.f29910OooO0O0.f29893OooO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f29858Oooo0oO.f29910OooO0O0.f29901OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? o0OOO0o.OooO00o.OooO0Oo(drawable) : this.f29858Oooo0oO.f29914OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        OooOO0O oooOO0O;
        ColorStateList colorStateList;
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((oooOO0O = this.f29858Oooo0oO) != null && (oooOO0O.OooO00o() || ((colorStateList = this.f29858Oooo0oO.f29911OooO0OO) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f29862OoooO00 && super.mutate() == this) {
            this.f29858Oooo0oO = new OooOO0O(this.f29858Oooo0oO);
            this.f29862OoooO00 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        OooOO0O oooOO0O = this.f29858Oooo0oO;
        ColorStateList colorStateList = oooOO0O.f29911OooO0OO;
        if (colorStateList != null && (mode = oooOO0O.f29912OooO0Oo) != null) {
            this.f29859Oooo0oo = OooO0O0(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (oooOO0O.OooO00o()) {
            boolean zOooO0O0 = oooOO0O.f29910OooO0O0.f29900OooO0oO.OooO0O0(iArr);
            oooOO0O.f29918OooOO0O |= zOooO0O0;
            if (zOooO0O0) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f29858Oooo0oO.f29910OooO0O0.getRootAlpha() != i) {
            this.f29858Oooo0oO.f29910OooO0O0.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO00o.OooO0o0(drawable, z);
        } else {
            this.f29858Oooo0oO.f29914OooO0o0 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f29857Oooo = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0oO(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0oo(drawable, colorStateList);
            return;
        }
        OooOO0O oooOO0O = this.f29858Oooo0oO;
        if (oooOO0O.f29911OooO0OO != colorStateList) {
            oooOO0O.f29911OooO0OO = colorStateList;
            this.f29859Oooo0oo = OooO0O0(colorStateList, oooOO0O.f29912OooO0Oo);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO(drawable, mode);
            return;
        }
        OooOO0O oooOO0O = this.f29858Oooo0oO;
        if (oooOO0O.f29912OooO0Oo != mode) {
            oooOO0O.f29912OooO0Oo = mode;
            this.f29859Oooo0oo = OooO0O0(oooOO0O.f29911OooO0OO, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi(24)
    public static class OooOOO0 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Drawable.ConstantState f29920OooO00o;

        public OooOOO0(Drawable.ConstantState constantState) {
            this.f29920OooO00o = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f29920OooO00o.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29920OooO00o.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            OooOo oooOo = new OooOo();
            oooOo.f29921Oooo0o = (VectorDrawable) this.f29920OooO00o.newDrawable();
            return oooOo;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            OooOo oooOo = new OooOo();
            oooOo.f29921Oooo0o = (VectorDrawable) this.f29920OooO00o.newDrawable(resources);
            return oooOo;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            OooOo oooOo = new OooOo();
            oooOo.f29921Oooo0o = (VectorDrawable) this.f29920OooO00o.newDrawable(resources, theme);
            return oooOo;
        }
    }

    public static abstract class OooO extends OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o000O0o.OooOO0O.OooO00o[] f29865OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f29866OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f29867OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f29868OooO0Oo;

        public OooO() {
            this.f29865OooO00o = null;
            this.f29867OooO0OO = 0;
        }

        public o000O0o.OooOO0O.OooO00o[] getPathData() {
            return this.f29865OooO00o;
        }

        public String getPathName() {
            return this.f29866OooO0O0;
        }

        public void setPathData(o000O0o.OooOO0O.OooO00o[] oooO00oArr) {
            if (!p071o000O0o.OooOO0O.OooO00o(this.f29865OooO00o, oooO00oArr)) {
                this.f29865OooO00o = p071o000O0o.OooOO0O.OooO0o0(oooO00oArr);
                return;
            }
            o000O0o.OooOO0O.OooO00o[] oooO00oArr2 = this.f29865OooO00o;
            for (int i = 0; i < oooO00oArr.length; i++) {
                oooO00oArr2[i].f28168OooO00o = oooO00oArr[i].f28168OooO00o;
                for (int i2 = 0; i2 < oooO00oArr[i].f28169OooO0O0.length; i2++) {
                    oooO00oArr2[i].f28169OooO0O0[i2] = oooO00oArr[i].f28169OooO0O0[i2];
                }
            }
        }

        public OooO(OooO oooO) {
            this.f29865OooO00o = null;
            this.f29867OooO0OO = 0;
            this.f29866OooO0O0 = oooO.f29866OooO0O0;
            this.f29868OooO0Oo = oooO.f29868OooO0Oo;
            this.f29865OooO00o = p071o000O0o.OooOO0O.OooO0o0(oooO.f29865OooO00o);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Resources resources2 = resources;
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0Oo(drawable, resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        OooOO0O oooOO0O = this.f29858Oooo0oO;
        oooOO0O.f29910OooO0O0 = new OooOO0();
        TypedArray typedArrayOooOO0 = o00oO0o.OooOO0(resources2, theme, attributeSet, p103o000oo00.OooOO0.f29832OooO00o);
        OooOO0O oooOO0O2 = this.f29858Oooo0oO;
        OooOO0 oooOO1 = oooOO0O2.f29910OooO0O0;
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
        oooOO0O2.f29912OooO0Oo = mode;
        ColorStateList colorStateListOooO0OO = o00oO0o.OooO0OO(typedArrayOooOO0, xmlPullParser, theme);
        if (colorStateListOooO0OO != null) {
            oooOO0O2.f29911OooO0OO = colorStateListOooO0OO;
        }
        oooOO0O2.f29914OooO0o0 = o00oO0o.OooO00o(typedArrayOooOO0, xmlPullParser, "autoMirrored", 5, oooOO0O2.f29914OooO0o0);
        oooOO1.f29902OooOO0 = o00oO0o.OooO0o0(typedArrayOooOO0, xmlPullParser, "viewportWidth", 7, oooOO1.f29902OooOO0);
        float fOooO0o0 = o00oO0o.OooO0o0(typedArrayOooOO0, xmlPullParser, "viewportHeight", 8, oooOO1.f29903OooOO0O);
        oooOO1.f29903OooOO0O = fOooO0o0;
        if (oooOO1.f29902OooOO0 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            throw new XmlPullParserException(typedArrayOooOO0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fOooO0o0 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            oooOO1.f29901OooO0oo = typedArrayOooOO0.getDimension(3, oooOO1.f29901OooO0oo);
            int i = 2;
            float dimension = typedArrayOooOO0.getDimension(2, oooOO1.f29893OooO);
            oooOO1.f29893OooO = dimension;
            if (oooOO1.f29901OooO0oo <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                throw new XmlPullParserException(typedArrayOooOO0.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                oooOO1.setAlpha(o00oO0o.OooO0o0(typedArrayOooOO0, xmlPullParser, "alpha", 4, oooOO1.getAlpha()));
                String string = typedArrayOooOO0.getString(0);
                if (string != null) {
                    oooOO1.f29906OooOOO0 = string;
                    oooOO1.f29907OooOOOO.put(string, oooOO1);
                }
                typedArrayOooOO0.recycle();
                oooOO0O.f29909OooO00o = getChangingConfigurations();
                int i2 = 1;
                oooOO0O.f29918OooOO0O = true;
                OooOO0O oooOO0O3 = this.f29858Oooo0oO;
                OooOO0 oooOO2 = oooOO0O3.f29910OooO0O0;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(oooOO2.f29900OooO0oO);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z = true;
                for (int i3 = 3; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != i3); i3 = 3) {
                    if (eventType == i) {
                        String name = xmlPullParser.getName();
                        OooO0OO oooO0OO = (OooO0OO) arrayDeque.peek();
                        if ("path".equals(name)) {
                            OooO0O0 oooO0O0 = new OooO0O0();
                            TypedArray typedArrayOooOO1 = o00oO0o.OooOO0(resources2, theme, attributeSet, p103o000oo00.OooOO0.f29834OooO0OO);
                            if (o00oO0o.OooO(xmlPullParser, "pathData")) {
                                String string2 = typedArrayOooOO1.getString(0);
                                if (string2 != null) {
                                    oooO0O0.f29866OooO0O0 = string2;
                                }
                                String string3 = typedArrayOooOO1.getString(2);
                                if (string3 != null) {
                                    oooO0O0.f29865OooO00o = p071o000O0o.OooOO0O.OooO0OO(string3);
                                }
                                oooO0O0.f29872OooO0oO = o00oO0o.OooO0Oo(typedArrayOooOO1, xmlPullParser, theme, "fillColor", 1);
                                oooO0O0.f29869OooO = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "fillAlpha", 12, oooO0O0.f29869OooO);
                                int iOooO0o2 = o00oO0o.OooO0o(typedArrayOooOO1, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = oooO0O0.f29878OooOOO0;
                                if (iOooO0o2 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (iOooO0o2 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (iOooO0o2 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                oooO0O0.f29878OooOOO0 = cap;
                                int iOooO0o3 = o00oO0o.OooO0o(typedArrayOooOO1, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = oooO0O0.f29877OooOOO;
                                if (iOooO0o3 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (iOooO0o3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (iOooO0o3 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                oooO0O0.f29877OooOOO = join;
                                oooO0O0.f29879OooOOOO = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "strokeMiterLimit", 10, oooO0O0.f29879OooOOOO);
                                oooO0O0.f29871OooO0o0 = o00oO0o.OooO0Oo(typedArrayOooOO1, xmlPullParser, theme, "strokeColor", 3);
                                oooO0O0.f29873OooO0oo = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "strokeAlpha", 11, oooO0O0.f29873OooO0oo);
                                oooO0O0.f29870OooO0o = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "strokeWidth", 4, oooO0O0.f29870OooO0o);
                                oooO0O0.f29875OooOO0O = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "trimPathEnd", 6, oooO0O0.f29875OooOO0O);
                                oooO0O0.f29876OooOO0o = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "trimPathOffset", 7, oooO0O0.f29876OooOO0o);
                                oooO0O0.f29874OooOO0 = o00oO0o.OooO0o0(typedArrayOooOO1, xmlPullParser, "trimPathStart", 5, oooO0O0.f29874OooOO0);
                                oooO0O0.f29867OooO0OO = o00oO0o.OooO0o(typedArrayOooOO1, xmlPullParser, "fillType", 13, oooO0O0.f29867OooO0OO);
                            }
                            typedArrayOooOO1.recycle();
                            oooO0OO.f29882OooO0O0.add(oooO0O0);
                            if (oooO0O0.getPathName() != null) {
                                oooOO2.f29907OooOOOO.put(oooO0O0.getPathName(), oooO0O0);
                            }
                            oooOO0O3.f29909OooO00o = oooO0O0.f29868OooO0Oo | oooOO0O3.f29909OooO00o;
                            z = false;
                        } else {
                            depth = depth;
                            if ("clip-path".equals(name)) {
                                OooO00o oooO00o = new OooO00o();
                                if (o00oO0o.OooO(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayOooOO2 = o00oO0o.OooOO0(resources2, theme, attributeSet, p103o000oo00.OooOO0.f29835OooO0Oo);
                                    String string4 = typedArrayOooOO2.getString(0);
                                    if (string4 != null) {
                                        oooO00o.f29866OooO0O0 = string4;
                                    }
                                    String string5 = typedArrayOooOO2.getString(1);
                                    if (string5 != null) {
                                        oooO00o.f29865OooO00o = p071o000O0o.OooOO0O.OooO0OO(string5);
                                    }
                                    oooO00o.f29867OooO0OO = o00oO0o.OooO0o(typedArrayOooOO2, xmlPullParser, "fillType", 2, 0);
                                    typedArrayOooOO2.recycle();
                                }
                                oooO0OO.f29882OooO0O0.add(oooO00o);
                                if (oooO00o.getPathName() != null) {
                                    oooOO2.f29907OooOOOO.put(oooO00o.getPathName(), oooO00o);
                                }
                                oooOO0O3.f29909OooO00o |= oooO00o.f29868OooO0Oo;
                            } else if ("group".equals(name)) {
                                OooO0OO oooO0OO2 = new OooO0OO();
                                TypedArray typedArrayOooOO3 = o00oO0o.OooOO0(resources2, theme, attributeSet, p103o000oo00.OooOO0.f29833OooO0O0);
                                oooO0OO2.f29883OooO0OO = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "rotation", 5, oooO0OO2.f29883OooO0OO);
                                oooO0OO2.f29884OooO0Oo = typedArrayOooOO3.getFloat(1, oooO0OO2.f29884OooO0Oo);
                                oooO0OO2.f29886OooO0o0 = typedArrayOooOO3.getFloat(2, oooO0OO2.f29886OooO0o0);
                                oooO0OO2.f29885OooO0o = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "scaleX", 3, oooO0OO2.f29885OooO0o);
                                oooO0OO2.f29887OooO0oO = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "scaleY", 4, oooO0OO2.f29887OooO0oO);
                                oooO0OO2.f29888OooO0oo = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "translateX", 6, oooO0OO2.f29888OooO0oo);
                                oooO0OO2.f29880OooO = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "translateY", 7, oooO0OO2.f29880OooO);
                                String string6 = typedArrayOooOO3.getString(0);
                                if (string6 != null) {
                                    oooO0OO2.f29891OooOO0o = string6;
                                }
                                oooO0OO2.OooO0OO();
                                typedArrayOooOO3.recycle();
                                oooO0OO.f29882OooO0O0.add(oooO0OO2);
                                arrayDeque.push(oooO0OO2);
                                if (oooO0OO2.getGroupName() != null) {
                                    oooOO2.f29907OooOOOO.put(oooO0OO2.getGroupName(), oooO0OO2);
                                }
                                oooOO0O3.f29909OooO00o = oooO0OO2.f29890OooOO0O | oooOO0O3.f29909OooO00o;
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
                    this.f29859Oooo0oo = OooO0O0(oooOO0O.f29911OooO0OO, oooOO0O.f29912OooO0Oo);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayOooOO0.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayOooOO0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public OooOo(@NonNull OooOO0O oooOO0O) {
        this.f29861OoooO0 = true;
        this.f29863OoooO0O = new float[9];
        this.f29860OoooO = new Matrix();
        this.f29864OoooOO0 = new Rect();
        this.f29858Oooo0oO = oooOO0O;
        this.f29859Oooo0oo = OooO0O0(oooOO0O.f29911OooO0OO, oooOO0O.f29912OooO0Oo);
    }

    public static class OooO0O0 extends OooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f29869OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f29870OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o000oOoO f29871OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public o000oOoO f29872OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f29873OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f29874OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f29875OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f29876OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Paint.Join f29877OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Paint.Cap f29878OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public float f29879OooOOOO;

        public OooO0O0() {
            this.f29870OooO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29873OooO0oo = 1.0f;
            this.f29869OooO = 1.0f;
            this.f29874OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29875OooOO0O = 1.0f;
            this.f29876OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29878OooOOO0 = Paint.Cap.BUTT;
            this.f29877OooOOO = Paint.Join.MITER;
            this.f29879OooOOOO = 4.0f;
        }

        @Override // o000oo00.OooOo.OooO0o
        public final boolean OooO00o() {
            return this.f29872OooO0oO.OooO0OO() || this.f29871OooO0o0.OooO0OO();
        }

        @Override // o000oo00.OooOo.OooO0o
        public final boolean OooO0O0(int[] iArr) {
            return this.f29871OooO0o0.OooO0Oo(iArr) | this.f29872OooO0oO.OooO0Oo(iArr);
        }

        public float getFillAlpha() {
            return this.f29869OooO;
        }

        @ColorInt
        public int getFillColor() {
            return this.f29872OooO0oO.f28336OooO0OO;
        }

        public float getStrokeAlpha() {
            return this.f29873OooO0oo;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f29871OooO0o0.f28336OooO0OO;
        }

        public float getStrokeWidth() {
            return this.f29870OooO0o;
        }

        public float getTrimPathEnd() {
            return this.f29875OooOO0O;
        }

        public float getTrimPathOffset() {
            return this.f29876OooOO0o;
        }

        public float getTrimPathStart() {
            return this.f29874OooOO0;
        }

        public void setFillAlpha(float f) {
            this.f29869OooO = f;
        }

        public void setFillColor(int i) {
            this.f29872OooO0oO.f28336OooO0OO = i;
        }

        public void setStrokeAlpha(float f) {
            this.f29873OooO0oo = f;
        }

        public void setStrokeColor(int i) {
            this.f29871OooO0o0.f28336OooO0OO = i;
        }

        public void setStrokeWidth(float f) {
            this.f29870OooO0o = f;
        }

        public void setTrimPathEnd(float f) {
            this.f29875OooOO0O = f;
        }

        public void setTrimPathOffset(float f) {
            this.f29876OooOO0o = f;
        }

        public void setTrimPathStart(float f) {
            this.f29874OooOO0 = f;
        }

        public OooO0O0(OooO0O0 oooO0O0) {
            super(oooO0O0);
            this.f29870OooO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29873OooO0oo = 1.0f;
            this.f29869OooO = 1.0f;
            this.f29874OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29875OooOO0O = 1.0f;
            this.f29876OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29878OooOOO0 = Paint.Cap.BUTT;
            this.f29877OooOOO = Paint.Join.MITER;
            this.f29879OooOOOO = 4.0f;
            this.f29871OooO0o0 = oooO0O0.f29871OooO0o0;
            this.f29870OooO0o = oooO0O0.f29870OooO0o;
            this.f29873OooO0oo = oooO0O0.f29873OooO0oo;
            this.f29872OooO0oO = oooO0O0.f29872OooO0oO;
            this.f29867OooO0OO = oooO0O0.f29867OooO0OO;
            this.f29869OooO = oooO0O0.f29869OooO;
            this.f29874OooOO0 = oooO0O0.f29874OooOO0;
            this.f29875OooOO0O = oooO0O0.f29875OooOO0O;
            this.f29876OooOO0o = oooO0O0.f29876OooOO0o;
            this.f29878OooOOO0 = oooO0O0.f29878OooOOO0;
            this.f29877OooOOO = oooO0O0.f29877OooOOO;
            this.f29879OooOOOO = oooO0O0.f29879OooOOOO;
        }
    }

    public static class OooO0OO extends OooO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f29880OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f29881OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO0o> f29882OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f29883OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f29884OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f29885OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f29886OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f29887OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f29888OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final Matrix f29889OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f29890OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public String f29891OooOO0o;

        public OooO0OO() {
            this.f29881OooO00o = new Matrix();
            this.f29882OooO0O0 = new ArrayList<>();
            this.f29883OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29884OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29886OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29885OooO0o = 1.0f;
            this.f29887OooO0oO = 1.0f;
            this.f29888OooO0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29880OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29889OooOO0 = new Matrix();
            this.f29891OooOO0o = null;
        }

        @Override // o000oo00.OooOo.OooO0o
        public final boolean OooO00o() {
            for (int i = 0; i < this.f29882OooO0O0.size(); i++) {
                if (this.f29882OooO0O0.get(i).OooO00o()) {
                    return true;
                }
            }
            return false;
        }

        @Override // o000oo00.OooOo.OooO0o
        public final boolean OooO0O0(int[] iArr) {
            boolean zOooO0O0 = false;
            for (int i = 0; i < this.f29882OooO0O0.size(); i++) {
                zOooO0O0 |= this.f29882OooO0O0.get(i).OooO0O0(iArr);
            }
            return zOooO0O0;
        }

        public final void OooO0OO() {
            this.f29889OooOO0.reset();
            this.f29889OooOO0.postTranslate(-this.f29884OooO0Oo, -this.f29886OooO0o0);
            this.f29889OooOO0.postScale(this.f29885OooO0o, this.f29887OooO0oO);
            this.f29889OooOO0.postRotate(this.f29883OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f29889OooOO0.postTranslate(this.f29888OooO0oo + this.f29884OooO0Oo, this.f29880OooO + this.f29886OooO0o0);
        }

        public String getGroupName() {
            return this.f29891OooOO0o;
        }

        public Matrix getLocalMatrix() {
            return this.f29889OooOO0;
        }

        public float getPivotX() {
            return this.f29884OooO0Oo;
        }

        public float getPivotY() {
            return this.f29886OooO0o0;
        }

        public float getRotation() {
            return this.f29883OooO0OO;
        }

        public float getScaleX() {
            return this.f29885OooO0o;
        }

        public float getScaleY() {
            return this.f29887OooO0oO;
        }

        public float getTranslateX() {
            return this.f29888OooO0oo;
        }

        public float getTranslateY() {
            return this.f29880OooO;
        }

        public void setPivotX(float f) {
            if (f != this.f29884OooO0Oo) {
                this.f29884OooO0Oo = f;
                OooO0OO();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f29886OooO0o0) {
                this.f29886OooO0o0 = f;
                OooO0OO();
            }
        }

        public void setRotation(float f) {
            if (f != this.f29883OooO0OO) {
                this.f29883OooO0OO = f;
                OooO0OO();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f29885OooO0o) {
                this.f29885OooO0o = f;
                OooO0OO();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f29887OooO0oO) {
                this.f29887OooO0oO = f;
                OooO0OO();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f29888OooO0oo) {
                this.f29888OooO0oo = f;
                OooO0OO();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f29880OooO) {
                this.f29880OooO = f;
                OooO0OO();
            }
        }

        public OooO0OO(OooO0OO oooO0OO, Oooo0<String, Object> oooo0) {
            OooO oooO00o;
            this.f29881OooO00o = new Matrix();
            this.f29882OooO0O0 = new ArrayList<>();
            this.f29883OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29884OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29886OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29885OooO0o = 1.0f;
            this.f29887OooO0oO = 1.0f;
            this.f29888OooO0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29880OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Matrix matrix = new Matrix();
            this.f29889OooOO0 = matrix;
            this.f29891OooOO0o = null;
            this.f29883OooO0OO = oooO0OO.f29883OooO0OO;
            this.f29884OooO0Oo = oooO0OO.f29884OooO0Oo;
            this.f29886OooO0o0 = oooO0OO.f29886OooO0o0;
            this.f29885OooO0o = oooO0OO.f29885OooO0o;
            this.f29887OooO0oO = oooO0OO.f29887OooO0oO;
            this.f29888OooO0oo = oooO0OO.f29888OooO0oo;
            this.f29880OooO = oooO0OO.f29880OooO;
            String str = oooO0OO.f29891OooOO0o;
            this.f29891OooOO0o = str;
            this.f29890OooOO0O = oooO0OO.f29890OooOO0O;
            if (str != null) {
                oooo0.put(str, this);
            }
            matrix.set(oooO0OO.f29889OooOO0);
            ArrayList<OooO0o> arrayList = oooO0OO.f29882OooO0O0;
            for (int i = 0; i < arrayList.size(); i++) {
                OooO0o oooO0o = arrayList.get(i);
                if (oooO0o instanceof OooO0OO) {
                    this.f29882OooO0O0.add(new OooO0OO((OooO0OO) oooO0o, oooo0));
                } else {
                    if (oooO0o instanceof OooO0O0) {
                        oooO00o = new OooO0O0((OooO0O0) oooO0o);
                    } else if (oooO0o instanceof OooO00o) {
                        oooO00o = new OooO00o((OooO00o) oooO0o);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f29882OooO0O0.add(oooO00o);
                    String str2 = oooO00o.f29866OooO0O0;
                    if (str2 != null) {
                        oooo0.put(str2, oooO00o);
                    }
                }
            }
        }
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final Matrix f29892OooOOOo = new Matrix();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f29893OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Path f29894OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Path f29895OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Matrix f29896OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Paint f29897OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public PathMeasure f29898OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Paint f29899OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooO0OO f29900OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f29901OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f29902OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f29903OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f29904OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Boolean f29905OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public String f29906OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final Oooo0<String, Object> f29907OooOOOO;

        public OooOO0() {
            this.f29896OooO0OO = new Matrix();
            this.f29901OooO0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29893OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29902OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29903OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29904OooOO0o = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f29906OooOOO0 = null;
            this.f29905OooOOO = null;
            this.f29907OooOOOO = new Oooo0<>();
            this.f29900OooO0oO = new OooO0OO();
            this.f29894OooO00o = new Path();
            this.f29895OooO0O0 = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r9v14 */
        public final void OooO00o(OooO0OO oooO0OO, Matrix matrix, Canvas canvas, int i, int i2) {
            oooO0OO.f29881OooO00o.set(matrix);
            oooO0OO.f29881OooO00o.preConcat(oooO0OO.f29889OooOO0);
            canvas.save();
            ?? r9 = 0;
            OooOO0 oooOO1 = this;
            int i3 = 0;
            while (i3 < oooO0OO.f29882OooO0O0.size()) {
                OooO0o oooO0o = oooO0OO.f29882OooO0O0.get(i3);
                if (oooO0o instanceof OooO0OO) {
                    OooO00o((OooO0OO) oooO0o, oooO0OO.f29881OooO00o, canvas, i, i2);
                } else {
                    if (oooO0o instanceof OooO) {
                        OooO oooO = (OooO) oooO0o;
                        float f = i / oooOO1.f29902OooOO0;
                        float f2 = i2 / oooOO1.f29903OooOO0O;
                        float fMin = Math.min(f, f2);
                        Matrix matrix2 = oooO0OO.f29881OooO00o;
                        oooOO1.f29896OooO0OO.set(matrix2);
                        oooOO1.f29896OooO0OO.postScale(f, f2);
                        float[] fArr = {ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE};
                        matrix2.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[r9], fArr[1]);
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f3 = (fArr[r9] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Math.abs(f3) / fMax : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        if (fAbs != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            Path path = this.f29894OooO00o;
                            Objects.requireNonNull(oooO);
                            path.reset();
                            o000O0o.OooOO0O.OooO00o[] oooO00oArr = oooO.f29865OooO00o;
                            if (oooO00oArr != null) {
                                o000O0o.OooOO0O.OooO00o.OooO0O0(oooO00oArr, path);
                            }
                            Path path2 = this.f29894OooO00o;
                            this.f29895OooO0O0.reset();
                            if (oooO instanceof OooO00o) {
                                this.f29895OooO0O0.setFillType(oooO.f29867OooO0OO == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                this.f29895OooO0O0.addPath(path2, this.f29896OooO0OO);
                                canvas.clipPath(this.f29895OooO0O0);
                            } else {
                                OooO0O0 oooO0O0 = (OooO0O0) oooO;
                                float f4 = oooO0O0.f29874OooOO0;
                                if (f4 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || oooO0O0.f29875OooOO0O != 1.0f) {
                                    float f5 = oooO0O0.f29876OooOO0o;
                                    float f6 = (f4 + f5) % 1.0f;
                                    float f7 = (oooO0O0.f29875OooOO0O + f5) % 1.0f;
                                    if (this.f29898OooO0o == null) {
                                        this.f29898OooO0o = new PathMeasure();
                                    }
                                    this.f29898OooO0o.setPath(this.f29894OooO00o, r9);
                                    float length = this.f29898OooO0o.getLength();
                                    float f8 = f6 * length;
                                    float f9 = f7 * length;
                                    path2.reset();
                                    if (f8 > f9) {
                                        this.f29898OooO0o.getSegment(f8, length, path2, true);
                                        this.f29898OooO0o.getSegment(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f9, path2, true);
                                    } else {
                                        this.f29898OooO0o.getSegment(f8, f9, path2, true);
                                    }
                                    path2.rLineTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                }
                                this.f29895OooO0O0.addPath(path2, this.f29896OooO0OO);
                                if (oooO0O0.f29872OooO0oO.OooO0o0()) {
                                    o000oOoO o000oooo2 = oooO0O0.f29872OooO0oO;
                                    if (this.f29899OooO0o0 == null) {
                                        Paint paint = new Paint(1);
                                        this.f29899OooO0o0 = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f29899OooO0o0;
                                    if (o000oooo2.OooO0O0()) {
                                        Shader shader = o000oooo2.f28334OooO00o;
                                        shader.setLocalMatrix(this.f29896OooO0OO);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(oooO0O0.f29869OooO * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                        int i4 = o000oooo2.f28336OooO0OO;
                                        float f10 = oooO0O0.f29869OooO;
                                        PorterDuff.Mode mode = OooOo.f29856o000oOoO;
                                        paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f10)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    this.f29895OooO0O0.setFillType(oooO0O0.f29867OooO0OO == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(this.f29895OooO0O0, paint2);
                                }
                                if (oooO0O0.f29871OooO0o0.OooO0o0()) {
                                    o000oOoO o000oooo3 = oooO0O0.f29871OooO0o0;
                                    if (this.f29897OooO0Oo == null) {
                                        Paint paint3 = new Paint(1);
                                        this.f29897OooO0Oo = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = this.f29897OooO0Oo;
                                    Paint.Join join = oooO0O0.f29877OooOOO;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = oooO0O0.f29878OooOOO0;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(oooO0O0.f29879OooOOOO);
                                    if (o000oooo3.OooO0O0()) {
                                        Shader shader2 = o000oooo3.f28334OooO00o;
                                        shader2.setLocalMatrix(this.f29896OooO0OO);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(oooO0O0.f29873OooO0oo * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                        int i5 = o000oooo3.f28336OooO0OO;
                                        float f11 = oooO0O0.f29873OooO0oo;
                                        PorterDuff.Mode mode2 = OooOo.f29856o000oOoO;
                                        paint4.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(oooO0O0.f29870OooO0o * fAbs * fMin);
                                    canvas.drawPath(this.f29895OooO0O0, paint4);
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
            return this.f29904OooOO0o;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f29904OooOO0o = i;
        }

        public OooOO0(OooOO0 oooOO1) {
            this.f29896OooO0OO = new Matrix();
            this.f29901OooO0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29893OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29902OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29903OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f29904OooOO0o = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f29906OooOOO0 = null;
            this.f29905OooOOO = null;
            Oooo0<String, Object> oooo0 = new Oooo0<>();
            this.f29907OooOOOO = oooo0;
            this.f29900OooO0oO = new OooO0OO(oooOO1.f29900OooO0oO, oooo0);
            this.f29894OooO00o = new Path(oooOO1.f29894OooO00o);
            this.f29895OooO0O0 = new Path(oooOO1.f29895OooO0O0);
            this.f29901OooO0oo = oooOO1.f29901OooO0oo;
            this.f29893OooO = oooOO1.f29893OooO;
            this.f29902OooOO0 = oooOO1.f29902OooOO0;
            this.f29903OooOO0O = oooOO1.f29903OooOO0O;
            this.f29904OooOO0o = oooOO1.f29904OooOO0o;
            this.f29906OooOOO0 = oooOO1.f29906OooOOO0;
            String str = oooOO1.f29906OooOOO0;
            if (str != null) {
                oooo0.put(str, this);
            }
            this.f29905OooOOO = oooOO1.f29905OooOOO;
        }
    }
}
