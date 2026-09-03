package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.o00Oo0;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o0O000.OooOOO;
import o0O00o00.Oooo000;
import p052o00000oO.OooOO0;
import p053o00000oo.o00Ooo;
import p274o0O00OoO.OooO0OO;
import p545o0oO0Ooo.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends MaterialShapeDrawable implements Drawable.Callback, o00Oo0.OooO0O0 {

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public static final int[] f16723o00000OO = {R.attr.state_enabled};

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public static final ShapeDrawable f16724o00000Oo = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16725OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f16726OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public ColorStateList f16727OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f16728OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public ColorStateList f16729OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public RippleDrawable f16730Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f16731Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f16732Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16733Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public CharSequence f16734Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public Drawable f16735Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16736Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f16737Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f16738Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f16739Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Drawable f16740Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f16741OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f16742OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public ColorStateList f16743OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public SpannableStringBuilder f16744OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f16745OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16746OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public OooOOO f16747OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public OooOOO f16748OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f16749OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f16750OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f16751Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f16752Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f16753OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public float f16754OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public float f16755OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NonNull
    public final Context f16756Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public float f16757Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final Paint f16758OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final Paint.FontMetrics f16759Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public boolean f16760o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    @Nullable
    public ColorStateList f16761o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    @NonNull
    public WeakReference<InterfaceC0220OooO00o> f16762o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public TextUtils.TruncateAt f16763o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public boolean f16764o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public int f16765o00000O0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f16766o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public Drawable f16767o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final Path f16768o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NonNull
    public final o00Oo0 f16769o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @ColorInt
    public int f16770o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @ColorInt
    public int f16771o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @ColorInt
    public int f16772o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @ColorInt
    public int f16773o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @ColorInt
    public int f16774o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int[] f16775o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16776o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    @Nullable
    public ColorFilter f16777o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f16778o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final RectF f16779o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f16780o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @ColorInt
    public int f16781o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public int f16782o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @ColorInt
    public int f16783oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f16784oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final PointF f16785ooOO;

    /* JADX INFO: renamed from: com.google.android.material.chip.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0220OooO00o {
        void OooO00o();
    }

    public OooO00o(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, Chip.f16687OooOoOO);
        this.f16728OooOooO = -1.0f;
        this.f16758OoooooO = new Paint(1);
        this.f16759Ooooooo = new Paint.FontMetrics();
        this.f16779o0OoOo0 = new RectF();
        this.f16785ooOO = new PointF();
        this.f16768o00O0O = new Path();
        this.f16782o0ooOoO = 255;
        this.f16784oo0o0Oo = PorterDuff.Mode.SRC_IN;
        this.f16762o000000O = new WeakReference<>(null);
        OooOO0O(context);
        this.f16756Oooooo = context;
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f16769o00Oo0 = o00oo1;
        this.f16734Oooo00o = "";
        o00oo1.f17313OooO00o.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f16723o00000OO;
        setState(iArr);
        if (!Arrays.equals(this.f16775o0O0O00, iArr)) {
            this.f16775o0O0O00 = iArr;
            if (Ooooo0o()) {
                Oooo000(getState(), iArr);
            }
        }
        this.f16760o00000 = true;
        int[] iArr2 = OooO0OO.f41776OooO00o;
        f16724o00000Oo.setTint(-1);
    }

    public static boolean OooOoo(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean OooOooO(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void OooooO0(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, com.google.android.material.internal.o00Oo0.OooO0O0
    public final void OooO00o() {
        OooOooo();
        invalidateSelf();
    }

    public final void OooOo(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        o00Ooo.OooO0OO.OooO0O0(drawable, o00Ooo.OooO0OO.OooO00o(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f16740Oooo0oo) {
            if (drawable.isStateful()) {
                drawable.setState(this.f16775o0O0O00);
            }
            o00Ooo.OooO0O0.OooO0oo(drawable, this.f16743OoooO00);
            return;
        }
        Drawable drawable2 = this.f16735Oooo0O0;
        if (drawable == drawable2 && this.f16737Oooo0o) {
            o00Ooo.OooO0O0.OooO0oo(drawable2, this.f16736Oooo0OO);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final float OooOoO() {
        if (!Ooooo00() && !OoooOoo()) {
            return 0.0f;
        }
        float f = this.f16750OoooOoo;
        Drawable drawable = this.f16780o0ooOO0 ? this.f16767o000oOoO : this.f16735Oooo0O0;
        float intrinsicWidth = this.f16738Oooo0o0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f16751Ooooo00;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[PHI: r1
      0x0072: PHI (r1v10 float) = (r1v9 float), (r1v9 float), (r1v17 float) binds: [B:23:0x0051, B:24:0x0053, B:26:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooOoO0(@NonNull Rect rect, @NonNull RectF rectF) {
        float intrinsicHeight;
        rectF.setEmpty();
        if (Ooooo00() || OoooOoo()) {
            float f = this.f16749OoooOoO + this.f16750OoooOoo;
            Drawable drawable = this.f16780o0ooOO0 ? this.f16767o000oOoO : this.f16735Oooo0O0;
            float intrinsicWidth = this.f16738Oooo0o0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (o00Ooo.OooO0OO.OooO00o(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f16780o0ooOO0 ? this.f16767o000oOoO : this.f16735Oooo0O0;
            float fCeil = this.f16738Oooo0o0;
            if (fCeil > 0.0f || drawable2 == null) {
                intrinsicHeight = fCeil;
            } else {
                fCeil = (float) Math.ceil(oo0o0Oo.OooO0O0(24, this.f16756Oooooo));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    intrinsicHeight = drawable2.getIntrinsicHeight();
                } else {
                    intrinsicHeight = fCeil;
                }
            }
            float fExactCenterY = rect.exactCenterY() - (intrinsicHeight / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + intrinsicHeight;
        }
    }

    public final float OooOoOO() {
        if (Ooooo0o()) {
            return this.f16754OooooOO + this.f16742OoooO0 + this.f16755OooooOo;
        }
        return 0.0f;
    }

    public final float OooOoo0() {
        return this.f16764o00000O ? OooOO0() : this.f16728OooOooO;
    }

    public final void OooOooo() {
        InterfaceC0220OooO00o interfaceC0220OooO00o = this.f16762o000000O.get();
        if (interfaceC0220OooO00o != null) {
            interfaceC0220OooO00o.OooO00o();
        }
    }

    public final void Oooo(@Nullable ColorStateList colorStateList) {
        if (this.f16729OooOooo != colorStateList) {
            this.f16729OooOooo = colorStateList;
            if (this.f16764o00000O) {
                OooOOoo(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Oooo0(@Nullable ColorStateList colorStateList) {
        if (this.f16746OoooOOO != colorStateList) {
            this.f16746OoooOOO = colorStateList;
            if (this.f16745OoooOO0 && this.f16767o000oOoO != null && this.f16741OoooO) {
                o00Ooo.OooO0O0.OooO0oo(this.f16767o000oOoO, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean Oooo000(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f16725OooOoOO;
        int iOooO0Oo = OooO0Oo(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f16770o00Ooo) : 0);
        boolean state = true;
        if (this.f16770o00Ooo != iOooO0Oo) {
            this.f16770o00Ooo = iOooO0Oo;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f16727OooOoo0;
        int iOooO0Oo2 = OooO0Oo(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f16771o00o0O) : 0);
        if (this.f16771o00o0O != iOooO0Oo2) {
            this.f16771o00o0O = iOooO0Oo2;
            zOnStateChange = true;
        }
        int iOooO0OO = OooOO0.OooO0OO(iOooO0Oo2, iOooO0Oo);
        if ((this.f16774o00ooo != iOooO0OO) | (this.f17582OooO0Oo.f17607OooO0OO == null)) {
            this.f16774o00ooo = iOooO0OO;
            OooOOO(ColorStateList.valueOf(iOooO0OO));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f16729OooOooo;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f16783oo000o) : 0;
        if (this.f16783oo000o != colorForState) {
            this.f16783oo000o = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f16761o000000 == null || !OooO0OO.OooO0Oo(iArr)) ? 0 : this.f16761o000000.getColorForState(iArr, this.f16773o00oO0o);
        if (this.f16773o00oO0o != colorForState2) {
            this.f16773o00oO0o = colorForState2;
            if (this.f16766o000OOo) {
                zOnStateChange = true;
            }
        }
        d1 d1Var = this.f16769o00Oo0.f17317OooO0o;
        int colorForState3 = (d1Var == null || (colorStateList = d1Var.f55821OooOO0) == null) ? 0 : colorStateList.getColorForState(iArr, this.f16772o00oO0O);
        if (this.f16772o00oO0O != colorForState3) {
            this.f16772o00oO0O = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (state2[i] == 16842912) {
                    z = true;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        boolean z3 = z && this.f16741OoooO;
        if (this.f16780o0ooOO0 == z3 || this.f16767o000oOoO == null) {
            z2 = false;
        } else {
            float fOooOoO = OooOoO();
            this.f16780o0ooOO0 = z3;
            if (fOooOoO != OooOoO()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f16776o0OO00O;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f16781o0ooOOo) : 0;
        if (this.f16781o0ooOOo != colorForState4) {
            this.f16781o0ooOOo = colorForState4;
            ColorStateList colorStateList6 = this.f16776o0OO00O;
            PorterDuff.Mode mode = this.f16784oo0o0Oo;
            this.f16778o0Oo0oo = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (OooOooO(this.f16735Oooo0O0)) {
            state |= this.f16735Oooo0O0.setState(iArr);
        }
        if (OooOooO(this.f16767o000oOoO)) {
            state |= this.f16767o000oOoO.setState(iArr);
        }
        if (OooOooO(this.f16740Oooo0oo)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f16740Oooo0oo.setState(iArr3);
        }
        int[] iArr4 = OooO0OO.f41776OooO00o;
        if (OooOooO(this.f16730Oooo)) {
            state |= this.f16730Oooo.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            OooOooo();
        }
        return state;
    }

    public final void Oooo00O(boolean z) {
        if (this.f16741OoooO != z) {
            this.f16741OoooO = z;
            float fOooOoO = OooOoO();
            if (!z && this.f16780o0ooOO0) {
                this.f16780o0ooOO0 = false;
            }
            float fOooOoO2 = OooOoO();
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void Oooo00o(@Nullable Drawable drawable) {
        if (this.f16767o000oOoO != drawable) {
            float fOooOoO = OooOoO();
            this.f16767o000oOoO = drawable;
            float fOooOoO2 = OooOoO();
            OooooO0(this.f16767o000oOoO);
            OooOo(this.f16767o000oOoO);
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void Oooo0O0(boolean z) {
        if (this.f16745OoooOO0 != z) {
            boolean zOoooOoo = OoooOoo();
            this.f16745OoooOO0 = z;
            boolean zOoooOoo2 = OoooOoo();
            if (zOoooOoo != zOoooOoo2) {
                if (zOoooOoo2) {
                    OooOo(this.f16767o000oOoO);
                } else {
                    OooooO0(this.f16767o000oOoO);
                }
                invalidateSelf();
                OooOooo();
            }
        }
    }

    @Deprecated
    public final void Oooo0OO(float f) {
        if (this.f16728OooOooO != f) {
            this.f16728OooOooO = f;
            setShapeAppearanceModel(this.f17582OooO0Oo.f17605OooO00o.OooO0oO(f));
        }
    }

    public final void Oooo0o(float f) {
        if (this.f16738Oooo0o0 != f) {
            float fOooOoO = OooOoO();
            this.f16738Oooo0o0 = f;
            float fOooOoO2 = OooOoO();
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void Oooo0o0(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f16735Oooo0O0;
        Drawable drawableOooO0Oo = drawable2 != null ? o00Ooo.OooO0Oo(drawable2) : null;
        if (drawableOooO0Oo != drawable) {
            float fOooOoO = OooOoO();
            this.f16735Oooo0O0 = drawable != null ? drawable.mutate() : null;
            float fOooOoO2 = OooOoO();
            OooooO0(drawableOooO0Oo);
            if (Ooooo00()) {
                OooOo(this.f16735Oooo0O0);
            }
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void Oooo0oO(@Nullable ColorStateList colorStateList) {
        this.f16737Oooo0o = true;
        if (this.f16736Oooo0OO != colorStateList) {
            this.f16736Oooo0OO = colorStateList;
            if (Ooooo00()) {
                o00Ooo.OooO0O0.OooO0oo(this.f16735Oooo0O0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Oooo0oo(boolean z) {
        if (this.f16731Oooo0 != z) {
            boolean zOoooo00 = Ooooo00();
            this.f16731Oooo0 = z;
            boolean zOoooo01 = Ooooo00();
            if (zOoooo00 != zOoooo01) {
                if (zOoooo01) {
                    OooOo(this.f16735Oooo0O0);
                } else {
                    OooooO0(this.f16735Oooo0O0);
                }
                invalidateSelf();
                OooOooo();
            }
        }
    }

    public final void OoooO(float f) {
        if (this.f16742OoooO0 != f) {
            this.f16742OoooO0 = f;
            invalidateSelf();
            if (Ooooo0o()) {
                OooOooo();
            }
        }
    }

    public final void OoooO0(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f16740Oooo0oo;
        Drawable drawableOooO0Oo = drawable2 != null ? o00Ooo.OooO0Oo(drawable2) : null;
        if (drawableOooO0Oo != drawable) {
            float fOooOoOO = OooOoOO();
            this.f16740Oooo0oo = drawable != null ? drawable.mutate() : null;
            int[] iArr = OooO0OO.f41776OooO00o;
            this.f16730Oooo = new RippleDrawable(OooO0OO.OooO0OO(this.f16733Oooo00O), this.f16740Oooo0oo, f16724o00000Oo);
            float fOooOoOO2 = OooOoOO();
            OooooO0(drawableOooO0Oo);
            if (Ooooo0o()) {
                OooOo(this.f16740Oooo0oo);
            }
            invalidateSelf();
            if (fOooOoOO != fOooOoOO2) {
                OooOooo();
            }
        }
    }

    public final void OoooO00(float f) {
        if (this.f16732Oooo000 != f) {
            this.f16732Oooo000 = f;
            this.f16758OoooooO.setStrokeWidth(f);
            if (this.f16764o00000O) {
                OooOo00(f);
            }
            invalidateSelf();
        }
    }

    public final void OoooO0O(float f) {
        if (this.f16755OooooOo != f) {
            this.f16755OooooOo = f;
            invalidateSelf();
            if (Ooooo0o()) {
                OooOooo();
            }
        }
    }

    public final void OoooOO0(float f) {
        if (this.f16754OooooOO != f) {
            this.f16754OooooOO = f;
            invalidateSelf();
            if (Ooooo0o()) {
                OooOooo();
            }
        }
    }

    public final void OoooOOO(boolean z) {
        if (this.f16739Oooo0oO != z) {
            boolean zOoooo0o = Ooooo0o();
            this.f16739Oooo0oO = z;
            boolean zOoooo0o2 = Ooooo0o();
            if (zOoooo0o != zOoooo0o2) {
                if (zOoooo0o2) {
                    OooOo(this.f16740Oooo0oo);
                } else {
                    OooooO0(this.f16740Oooo0oo);
                }
                invalidateSelf();
                OooOooo();
            }
        }
    }

    public final void OoooOOo(float f) {
        if (this.f16751Ooooo00 != f) {
            float fOooOoO = OooOoO();
            this.f16751Ooooo00 = f;
            float fOooOoO2 = OooOoO();
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void OoooOo0(float f) {
        if (this.f16750OoooOoo != f) {
            float fOooOoO = OooOoO();
            this.f16750OoooOoo = f;
            float fOooOoO2 = OooOoO();
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void OoooOoO(@Nullable ColorStateList colorStateList) {
        if (this.f16733Oooo00O != colorStateList) {
            this.f16733Oooo00O = colorStateList;
            this.f16761o000000 = this.f16766o000OOo ? OooO0OO.OooO0OO(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean OoooOoo() {
        return this.f16745OoooOO0 && this.f16767o000oOoO != null && this.f16780o0ooOO0;
    }

    public final boolean Ooooo00() {
        return this.f16731Oooo0 && this.f16735Oooo0O0 != null;
    }

    public final boolean Ooooo0o() {
        return this.f16739Oooo0oO && this.f16740Oooo0oo != null;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f16782o0ooOoO) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z = this.f16764o00000O;
        Paint paint = this.f16758OoooooO;
        RectF rectF3 = this.f16779o0OoOo0;
        if (!z) {
            paint.setColor(this.f16770o00Ooo);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, OooOoo0(), OooOoo0(), paint);
        }
        if (!this.f16764o00000O) {
            paint.setColor(this.f16771o00o0O);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f16777o0OOO0o;
            if (colorFilter == null) {
                colorFilter = this.f16778o0Oo0oo;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, OooOoo0(), OooOoo0(), paint);
        }
        if (this.f16764o00000O) {
            super.draw(canvas);
        }
        if (this.f16732Oooo000 > 0.0f && !this.f16764o00000O) {
            paint.setColor(this.f16783oo000o);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f16764o00000O) {
                ColorFilter colorFilter2 = this.f16777o0OOO0o;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f16778o0Oo0oo;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f16732Oooo000 / 2.0f;
            rectF3.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f16728OooOooO - (this.f16732Oooo000 / 2.0f);
            canvas.drawRoundRect(rectF3, f3, f3, paint);
        }
        paint.setColor(this.f16773o00oO0o);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f16764o00000O) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f16768o00O0O;
            Oooo000 oooo000 = this.f17598OooOo0;
            MaterialShapeDrawable.OooO0O0 oooO0O0 = this.f17582OooO0Oo;
            oooo000.OooO00o(oooO0O0.f17605OooO00o, oooO0O0.f17613OooOO0, rectF4, this.f17599OooOo00, path);
            OooO0o(canvas, paint, path, this.f17582OooO0Oo.f17605OooO00o, OooO0oo());
        } else {
            canvas.drawRoundRect(rectF3, OooOoo0(), OooOoo0(), paint);
        }
        if (Ooooo00()) {
            OooOoO0(bounds, rectF3);
            float f4 = rectF3.left;
            float f5 = rectF3.top;
            canvas.translate(f4, f5);
            this.f16735Oooo0O0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f16735Oooo0O0.draw(canvas);
            canvas.translate(-f4, -f5);
        }
        if (OoooOoo()) {
            OooOoO0(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.f16767o000oOoO.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f16767o000oOoO.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (!this.f16760o00000 || this.f16734Oooo00o == null) {
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f16785ooOO;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f16734Oooo00o;
            o00Oo0 o00oo1 = this.f16769o00Oo0;
            if (charSequence != null) {
                float fOooOoO = OooOoO() + this.f16749OoooOoO + this.f16752Ooooo0o;
                if (o00Ooo.OooO0OO.OooO00o(this) == 0) {
                    pointF.x = bounds.left + fOooOoO;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fOooOoO;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = o00oo1.f17313OooO00o;
                Paint.FontMetrics fontMetrics = this.f16759Ooooooo;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f16734Oooo00o != null) {
                float fOooOoO2 = OooOoO() + this.f16749OoooOoO + this.f16752Ooooo0o;
                float fOooOoOO = OooOoOO() + this.f16757Oooooo0 + this.f16753OooooO0;
                if (o00Ooo.OooO0OO.OooO00o(this) == 0) {
                    rectF3.left = bounds.left + fOooOoO2;
                    rectF3.right = bounds.right - fOooOoOO;
                } else {
                    rectF3.left = bounds.left + fOooOoOO;
                    rectF3.right = bounds.right - fOooOoO2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            d1 d1Var = o00oo1.f17317OooO0o;
            TextPaint textPaint2 = o00oo1.f17313OooO00o;
            if (d1Var != null) {
                textPaint2.drawableState = getState();
                o00oo1.f17317OooO0o.OooO0o0(this.f16756Oooooo, textPaint2, o00oo1.f17314OooO0O0);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(o00oo1.OooO00o(this.f16734Oooo00o.toString())) > Math.round(rectF3.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f16734Oooo00o;
            if (z2 && this.f16763o000000o != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f16763o000000o);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f8 = pointF.x;
            float f9 = pointF.y;
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence2, 0, length, f8, f9, textPaint2);
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
        if (Ooooo0o()) {
            rectF.setEmpty();
            if (Ooooo0o()) {
                float f10 = this.f16757Oooooo0 + this.f16755OooooOo;
                if (o00Ooo.OooO0OO.OooO00o(this) == 0) {
                    float f11 = bounds.right - f10;
                    rectF2 = rectF;
                    rectF2.right = f11;
                    rectF2.left = f11 - this.f16742OoooO0;
                } else {
                    rectF2 = rectF;
                    float f12 = bounds.left + f10;
                    rectF2.left = f12;
                    rectF2.right = f12 + this.f16742OoooO0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.f16742OoooO0;
                float f14 = fExactCenterY - (f13 / 2.0f);
                rectF2.top = f14;
                rectF2.bottom = f14 + f13;
            } else {
                rectF2 = rectF;
            }
            float f15 = rectF2.left;
            float f16 = rectF2.top;
            canvas.translate(f15, f16);
            this.f16740Oooo0oo.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = OooO0OO.f41776OooO00o;
            this.f16730Oooo.setBounds(this.f16740Oooo0oo.getBounds());
            this.f16730Oooo.jumpToCurrentState();
            this.f16730Oooo.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (this.f16782o0ooOoO < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16782o0ooOoO;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final ColorFilter getColorFilter() {
        return this.f16777o0OOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f16726OooOoo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(OooOoOO() + this.f16769o00Oo0.OooO00o(this.f16734Oooo00o.toString()) + OooOoO() + this.f16749OoooOoO + this.f16752Ooooo0o + this.f16753OooooO0 + this.f16757Oooooo0), this.f16765o00000O0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        if (this.f16764o00000O) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f16726OooOoo, this.f16728OooOooO);
        } else {
            outline.setRoundRect(bounds, this.f16728OooOooO);
        }
        outline.setAlpha(this.f16782o0ooOoO / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (OooOoo(this.f16725OooOoOO) || OooOoo(this.f16727OooOoo0) || OooOoo(this.f16729OooOooo)) {
            return true;
        }
        if (this.f16766o000OOo && OooOoo(this.f16761o000000)) {
            return true;
        }
        d1 d1Var = this.f16769o00Oo0.f17317OooO0o;
        if ((d1Var == null || (colorStateList = d1Var.f55821OooOO0) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.f16745OoooOO0 && this.f16767o000oOoO != null && this.f16741OoooO) || OooOooO(this.f16735Oooo0O0) || OooOooO(this.f16767o000oOoO) || OooOoo(this.f16776o0OO00O);
    }

    public final void o000oOoO(@Nullable ColorStateList colorStateList) {
        if (this.f16743OoooO00 != colorStateList) {
            this.f16743OoooO00 = colorStateList;
            if (Ooooo0o()) {
                o00Ooo.OooO0O0.OooO0oo(this.f16740Oooo0oo, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Ooooo00()) {
            zOnLayoutDirectionChanged |= o00Ooo.OooO0OO.OooO0O0(this.f16735Oooo0O0, i);
        }
        if (OoooOoo()) {
            zOnLayoutDirectionChanged |= o00Ooo.OooO0OO.OooO0O0(this.f16767o000oOoO, i);
        }
        if (Ooooo0o()) {
            zOnLayoutDirectionChanged |= o00Ooo.OooO0OO.OooO0O0(this.f16740Oooo0oo, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (Ooooo00()) {
            zOnLevelChange |= this.f16735Oooo0O0.setLevel(i);
        }
        if (OoooOoo()) {
            zOnLevelChange |= this.f16767o000oOoO.setLevel(i);
        }
        if (Ooooo0o()) {
            zOnLevelChange |= this.f16740Oooo0oo.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.o00Oo0.OooO0O0
    public final boolean onStateChange(@NonNull int[] iArr) {
        if (this.f16764o00000O) {
            super.onStateChange(iArr);
        }
        return Oooo000(iArr, this.f16775o0O0O00);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f16782o0ooOoO != i) {
            this.f16782o0ooOoO = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.f16777o0OOO0o != colorFilter) {
            this.f16777o0OOO0o = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.f16776o0OO00O != colorStateList) {
            this.f16776o0OO00O = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f16784oo0o0Oo != mode) {
            this.f16784oo0o0Oo = mode;
            ColorStateList colorStateList = this.f16776o0OO00O;
            this.f16778o0Oo0oo = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (Ooooo00()) {
            visible |= this.f16735Oooo0O0.setVisible(z, z2);
        }
        if (OoooOoo()) {
            visible |= this.f16767o000oOoO.setVisible(z, z2);
        }
        if (Ooooo0o()) {
            visible |= this.f16740Oooo0oo.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
