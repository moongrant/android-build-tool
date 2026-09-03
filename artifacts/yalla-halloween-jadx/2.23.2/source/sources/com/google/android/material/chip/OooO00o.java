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
import p052o00000oO.OooOO0;
import p053o00000oo.o00Ooo;
import p276o0O00OoO.OooO;
import p277o0O00Ooo.OooOOOO;
import p280o0O00o0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends MaterialShapeDrawable implements Drawable.Callback, o00Oo0.OooO0O0 {

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public static final int[] f16250o00000OO = {R.attr.state_enabled};

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public static final ShapeDrawable f16251o00000Oo = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16252OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f16253OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public ColorStateList f16254OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f16255OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public ColorStateList f16256OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public RippleDrawable f16257Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f16258Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f16259Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16260Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public CharSequence f16261Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public Drawable f16262Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16263Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f16264Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f16265Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f16266Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Drawable f16267Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f16268OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f16269OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public ColorStateList f16270OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public SpannableStringBuilder f16271OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f16272OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16273OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public OooOOO f16274OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public OooOOO f16275OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f16276OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f16277OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f16278Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f16279Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f16280OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public float f16281OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public float f16282OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NonNull
    public final Context f16283Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public float f16284Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final Paint f16285OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final Paint.FontMetrics f16286Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public boolean f16287o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    @Nullable
    public ColorStateList f16288o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    @NonNull
    public WeakReference<InterfaceC0217OooO00o> f16289o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public TextUtils.TruncateAt f16290o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public boolean f16291o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public int f16292o00000O0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f16293o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public Drawable f16294o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final Path f16295o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NonNull
    public final o00Oo0 f16296o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @ColorInt
    public int f16297o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @ColorInt
    public int f16298o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @ColorInt
    public int f16299o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @ColorInt
    public int f16300o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @ColorInt
    public int f16301o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int[] f16302o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16303o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    @Nullable
    public ColorFilter f16304o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f16305o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final RectF f16306o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f16307o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @ColorInt
    public int f16308o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public int f16309o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @ColorInt
    public int f16310oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f16311oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final PointF f16312ooOO;

    /* JADX INFO: renamed from: com.google.android.material.chip.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0217OooO00o {
        void OooO00o();
    }

    public OooO00o(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, Chip.f16214OooOoOO);
        this.f16255OooOooO = -1.0f;
        this.f16285OoooooO = new Paint(1);
        this.f16286Ooooooo = new Paint.FontMetrics();
        this.f16306o0OoOo0 = new RectF();
        this.f16312ooOO = new PointF();
        this.f16295o00O0O = new Path();
        this.f16309o0ooOoO = 255;
        this.f16311oo0o0Oo = PorterDuff.Mode.SRC_IN;
        this.f16289o000000O = new WeakReference<>(null);
        OooOO0O(context);
        this.f16283Oooooo = context;
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f16296o00Oo0 = o00oo1;
        this.f16261Oooo00o = "";
        o00oo1.f16840OooO00o.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f16250o00000OO;
        setState(iArr);
        if (!Arrays.equals(this.f16302o0O0O00, iArr)) {
            this.f16302o0O0O00 = iArr;
            if (Ooooo0o()) {
                Oooo000(getState(), iArr);
            }
        }
        this.f16287o00000 = true;
        int[] iArr2 = OooOOOO.f41031OooO00o;
        f16251o00000Oo.setTint(-1);
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
        if (drawable == this.f16267Oooo0oo) {
            if (drawable.isStateful()) {
                drawable.setState(this.f16302o0O0O00);
            }
            o00Ooo.OooO0O0.OooO0oo(drawable, this.f16270OoooO00);
            return;
        }
        Drawable drawable2 = this.f16262Oooo0O0;
        if (drawable == drawable2 && this.f16264Oooo0o) {
            o00Ooo.OooO0O0.OooO0oo(drawable2, this.f16263Oooo0OO);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final float OooOoO() {
        if (!Ooooo00() && !OoooOoo()) {
            return 0.0f;
        }
        float f = this.f16277OoooOoo;
        Drawable drawable = this.f16307o0ooOO0 ? this.f16294o000oOoO : this.f16262Oooo0O0;
        float intrinsicWidth = this.f16265Oooo0o0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f16278Ooooo00;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[PHI: r1
      0x0072: PHI (r1v10 float) = (r1v9 float), (r1v9 float), (r1v17 float) binds: [B:23:0x0051, B:24:0x0053, B:26:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooOoO0(@NonNull Rect rect, @NonNull RectF rectF) {
        float intrinsicHeight;
        rectF.setEmpty();
        if (Ooooo00() || OoooOoo()) {
            float f = this.f16276OoooOoO + this.f16277OoooOoo;
            Drawable drawable = this.f16307o0ooOO0 ? this.f16294o000oOoO : this.f16262Oooo0O0;
            float intrinsicWidth = this.f16265Oooo0o0;
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
            Drawable drawable2 = this.f16307o0ooOO0 ? this.f16294o000oOoO : this.f16262Oooo0O0;
            float fCeil = this.f16265Oooo0o0;
            if (fCeil > 0.0f || drawable2 == null) {
                intrinsicHeight = fCeil;
            } else {
                fCeil = (float) Math.ceil(oo0o0Oo.OooO0O0(24, this.f16283Oooooo));
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
            return this.f16281OooooOO + this.f16269OoooO0 + this.f16282OooooOo;
        }
        return 0.0f;
    }

    public final float OooOoo0() {
        return this.f16291o00000O ? OooOO0() : this.f16255OooOooO;
    }

    public final void OooOooo() {
        InterfaceC0217OooO00o interfaceC0217OooO00o = this.f16289o000000O.get();
        if (interfaceC0217OooO00o != null) {
            interfaceC0217OooO00o.OooO00o();
        }
    }

    public final void Oooo(@Nullable ColorStateList colorStateList) {
        if (this.f16256OooOooo != colorStateList) {
            this.f16256OooOooo = colorStateList;
            if (this.f16291o00000O) {
                OooOOoo(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Oooo0(@Nullable ColorStateList colorStateList) {
        if (this.f16273OoooOOO != colorStateList) {
            this.f16273OoooOOO = colorStateList;
            if (this.f16272OoooOO0 && this.f16294o000oOoO != null && this.f16268OoooO) {
                o00Ooo.OooO0O0.OooO0oo(this.f16294o000oOoO, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean Oooo000(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f16252OooOoOO;
        int iOooO0Oo = OooO0Oo(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f16297o00Ooo) : 0);
        boolean state = true;
        if (this.f16297o00Ooo != iOooO0Oo) {
            this.f16297o00Ooo = iOooO0Oo;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f16254OooOoo0;
        int iOooO0Oo2 = OooO0Oo(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f16298o00o0O) : 0);
        if (this.f16298o00o0O != iOooO0Oo2) {
            this.f16298o00o0O = iOooO0Oo2;
            zOnStateChange = true;
        }
        int iOooO0OO = OooOO0.OooO0OO(iOooO0Oo2, iOooO0Oo);
        if ((this.f16301o00ooo != iOooO0OO) | (this.f17105OooO0Oo.f17130OooO0OO == null)) {
            this.f16301o00ooo = iOooO0OO;
            OooOOO(ColorStateList.valueOf(iOooO0OO));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f16256OooOooo;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f16310oo000o) : 0;
        if (this.f16310oo000o != colorForState) {
            this.f16310oo000o = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f16288o000000 == null || !OooOOOO.OooO0Oo(iArr)) ? 0 : this.f16288o000000.getColorForState(iArr, this.f16300o00oO0o);
        if (this.f16300o00oO0o != colorForState2) {
            this.f16300o00oO0o = colorForState2;
            if (this.f16293o000OOo) {
                zOnStateChange = true;
            }
        }
        OooO oooO = this.f16296o00Oo0.f16844OooO0o;
        int colorForState3 = (oooO == null || (colorStateList = oooO.f41017OooOO0) == null) ? 0 : colorStateList.getColorForState(iArr, this.f16299o00oO0O);
        if (this.f16299o00oO0O != colorForState3) {
            this.f16299o00oO0O = colorForState3;
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
        boolean z3 = z && this.f16268OoooO;
        if (this.f16307o0ooOO0 == z3 || this.f16294o000oOoO == null) {
            z2 = false;
        } else {
            float fOooOoO = OooOoO();
            this.f16307o0ooOO0 = z3;
            if (fOooOoO != OooOoO()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f16303o0OO00O;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f16308o0ooOOo) : 0;
        if (this.f16308o0ooOOo != colorForState4) {
            this.f16308o0ooOOo = colorForState4;
            ColorStateList colorStateList6 = this.f16303o0OO00O;
            PorterDuff.Mode mode = this.f16311oo0o0Oo;
            this.f16305o0Oo0oo = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (OooOooO(this.f16262Oooo0O0)) {
            state |= this.f16262Oooo0O0.setState(iArr);
        }
        if (OooOooO(this.f16294o000oOoO)) {
            state |= this.f16294o000oOoO.setState(iArr);
        }
        if (OooOooO(this.f16267Oooo0oo)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f16267Oooo0oo.setState(iArr3);
        }
        int[] iArr4 = OooOOOO.f41031OooO00o;
        if (OooOooO(this.f16257Oooo)) {
            state |= this.f16257Oooo.setState(iArr2);
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
        if (this.f16268OoooO != z) {
            this.f16268OoooO = z;
            float fOooOoO = OooOoO();
            if (!z && this.f16307o0ooOO0) {
                this.f16307o0ooOO0 = false;
            }
            float fOooOoO2 = OooOoO();
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void Oooo00o(@Nullable Drawable drawable) {
        if (this.f16294o000oOoO != drawable) {
            float fOooOoO = OooOoO();
            this.f16294o000oOoO = drawable;
            float fOooOoO2 = OooOoO();
            OooooO0(this.f16294o000oOoO);
            OooOo(this.f16294o000oOoO);
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void Oooo0O0(boolean z) {
        if (this.f16272OoooOO0 != z) {
            boolean zOoooOoo = OoooOoo();
            this.f16272OoooOO0 = z;
            boolean zOoooOoo2 = OoooOoo();
            if (zOoooOoo != zOoooOoo2) {
                if (zOoooOoo2) {
                    OooOo(this.f16294o000oOoO);
                } else {
                    OooooO0(this.f16294o000oOoO);
                }
                invalidateSelf();
                OooOooo();
            }
        }
    }

    @Deprecated
    public final void Oooo0OO(float f) {
        if (this.f16255OooOooO != f) {
            this.f16255OooOooO = f;
            setShapeAppearanceModel(this.f17105OooO0Oo.f17128OooO00o.OooO0oO(f));
        }
    }

    public final void Oooo0o(float f) {
        if (this.f16265Oooo0o0 != f) {
            float fOooOoO = OooOoO();
            this.f16265Oooo0o0 = f;
            float fOooOoO2 = OooOoO();
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void Oooo0o0(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f16262Oooo0O0;
        Drawable drawableOooO0Oo = drawable2 != null ? o00Ooo.OooO0Oo(drawable2) : null;
        if (drawableOooO0Oo != drawable) {
            float fOooOoO = OooOoO();
            this.f16262Oooo0O0 = drawable != null ? drawable.mutate() : null;
            float fOooOoO2 = OooOoO();
            OooooO0(drawableOooO0Oo);
            if (Ooooo00()) {
                OooOo(this.f16262Oooo0O0);
            }
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void Oooo0oO(@Nullable ColorStateList colorStateList) {
        this.f16264Oooo0o = true;
        if (this.f16263Oooo0OO != colorStateList) {
            this.f16263Oooo0OO = colorStateList;
            if (Ooooo00()) {
                o00Ooo.OooO0O0.OooO0oo(this.f16262Oooo0O0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Oooo0oo(boolean z) {
        if (this.f16258Oooo0 != z) {
            boolean zOoooo00 = Ooooo00();
            this.f16258Oooo0 = z;
            boolean zOoooo01 = Ooooo00();
            if (zOoooo00 != zOoooo01) {
                if (zOoooo01) {
                    OooOo(this.f16262Oooo0O0);
                } else {
                    OooooO0(this.f16262Oooo0O0);
                }
                invalidateSelf();
                OooOooo();
            }
        }
    }

    public final void OoooO(float f) {
        if (this.f16269OoooO0 != f) {
            this.f16269OoooO0 = f;
            invalidateSelf();
            if (Ooooo0o()) {
                OooOooo();
            }
        }
    }

    public final void OoooO0(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f16267Oooo0oo;
        Drawable drawableOooO0Oo = drawable2 != null ? o00Ooo.OooO0Oo(drawable2) : null;
        if (drawableOooO0Oo != drawable) {
            float fOooOoOO = OooOoOO();
            this.f16267Oooo0oo = drawable != null ? drawable.mutate() : null;
            int[] iArr = OooOOOO.f41031OooO00o;
            this.f16257Oooo = new RippleDrawable(OooOOOO.OooO0OO(this.f16260Oooo00O), this.f16267Oooo0oo, f16251o00000Oo);
            float fOooOoOO2 = OooOoOO();
            OooooO0(drawableOooO0Oo);
            if (Ooooo0o()) {
                OooOo(this.f16267Oooo0oo);
            }
            invalidateSelf();
            if (fOooOoOO != fOooOoOO2) {
                OooOooo();
            }
        }
    }

    public final void OoooO00(float f) {
        if (this.f16259Oooo000 != f) {
            this.f16259Oooo000 = f;
            this.f16285OoooooO.setStrokeWidth(f);
            if (this.f16291o00000O) {
                OooOo00(f);
            }
            invalidateSelf();
        }
    }

    public final void OoooO0O(float f) {
        if (this.f16282OooooOo != f) {
            this.f16282OooooOo = f;
            invalidateSelf();
            if (Ooooo0o()) {
                OooOooo();
            }
        }
    }

    public final void OoooOO0(float f) {
        if (this.f16281OooooOO != f) {
            this.f16281OooooOO = f;
            invalidateSelf();
            if (Ooooo0o()) {
                OooOooo();
            }
        }
    }

    public final void OoooOOO(boolean z) {
        if (this.f16266Oooo0oO != z) {
            boolean zOoooo0o = Ooooo0o();
            this.f16266Oooo0oO = z;
            boolean zOoooo0o2 = Ooooo0o();
            if (zOoooo0o != zOoooo0o2) {
                if (zOoooo0o2) {
                    OooOo(this.f16267Oooo0oo);
                } else {
                    OooooO0(this.f16267Oooo0oo);
                }
                invalidateSelf();
                OooOooo();
            }
        }
    }

    public final void OoooOOo(float f) {
        if (this.f16278Ooooo00 != f) {
            float fOooOoO = OooOoO();
            this.f16278Ooooo00 = f;
            float fOooOoO2 = OooOoO();
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void OoooOo0(float f) {
        if (this.f16277OoooOoo != f) {
            float fOooOoO = OooOoO();
            this.f16277OoooOoo = f;
            float fOooOoO2 = OooOoO();
            invalidateSelf();
            if (fOooOoO != fOooOoO2) {
                OooOooo();
            }
        }
    }

    public final void OoooOoO(@Nullable ColorStateList colorStateList) {
        if (this.f16260Oooo00O != colorStateList) {
            this.f16260Oooo00O = colorStateList;
            this.f16288o000000 = this.f16293o000OOo ? OooOOOO.OooO0OO(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean OoooOoo() {
        return this.f16272OoooOO0 && this.f16294o000oOoO != null && this.f16307o0ooOO0;
    }

    public final boolean Ooooo00() {
        return this.f16258Oooo0 && this.f16262Oooo0O0 != null;
    }

    public final boolean Ooooo0o() {
        return this.f16266Oooo0oO && this.f16267Oooo0oo != null;
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
        if (bounds.isEmpty() || (i = this.f16309o0ooOoO) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z = this.f16291o00000O;
        Paint paint = this.f16285OoooooO;
        RectF rectF3 = this.f16306o0OoOo0;
        if (!z) {
            paint.setColor(this.f16297o00Ooo);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, OooOoo0(), OooOoo0(), paint);
        }
        if (!this.f16291o00000O) {
            paint.setColor(this.f16298o00o0O);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f16304o0OOO0o;
            if (colorFilter == null) {
                colorFilter = this.f16305o0Oo0oo;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, OooOoo0(), OooOoo0(), paint);
        }
        if (this.f16291o00000O) {
            super.draw(canvas);
        }
        if (this.f16259Oooo000 > 0.0f && !this.f16291o00000O) {
            paint.setColor(this.f16310oo000o);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f16291o00000O) {
                ColorFilter colorFilter2 = this.f16304o0OOO0o;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f16305o0Oo0oo;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f16259Oooo000 / 2.0f;
            rectF3.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f16255OooOooO - (this.f16259Oooo000 / 2.0f);
            canvas.drawRoundRect(rectF3, f3, f3, paint);
        }
        paint.setColor(this.f16300o00oO0o);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f16291o00000O) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f16295o00O0O;
            o000oOoO o000oooo2 = this.f17121OooOo0;
            MaterialShapeDrawable.OooO0O0 oooO0O0 = this.f17105OooO0Oo;
            o000oooo2.OooO00o(oooO0O0.f17128OooO00o, oooO0O0.f17136OooOO0, rectF4, this.f17122OooOo00, path);
            OooO0o(canvas, paint, path, this.f17105OooO0Oo.f17128OooO00o, OooO0oo());
        } else {
            canvas.drawRoundRect(rectF3, OooOoo0(), OooOoo0(), paint);
        }
        if (Ooooo00()) {
            OooOoO0(bounds, rectF3);
            float f4 = rectF3.left;
            float f5 = rectF3.top;
            canvas.translate(f4, f5);
            this.f16262Oooo0O0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f16262Oooo0O0.draw(canvas);
            canvas.translate(-f4, -f5);
        }
        if (OoooOoo()) {
            OooOoO0(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.f16294o000oOoO.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f16294o000oOoO.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (!this.f16287o00000 || this.f16261Oooo00o == null) {
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f16312ooOO;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f16261Oooo00o;
            o00Oo0 o00oo1 = this.f16296o00Oo0;
            if (charSequence != null) {
                float fOooOoO = OooOoO() + this.f16276OoooOoO + this.f16279Ooooo0o;
                if (o00Ooo.OooO0OO.OooO00o(this) == 0) {
                    pointF.x = bounds.left + fOooOoO;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fOooOoO;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = o00oo1.f16840OooO00o;
                Paint.FontMetrics fontMetrics = this.f16286Ooooooo;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f16261Oooo00o != null) {
                float fOooOoO2 = OooOoO() + this.f16276OoooOoO + this.f16279Ooooo0o;
                float fOooOoOO = OooOoOO() + this.f16284Oooooo0 + this.f16280OooooO0;
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
            OooO oooO = o00oo1.f16844OooO0o;
            TextPaint textPaint2 = o00oo1.f16840OooO00o;
            if (oooO != null) {
                textPaint2.drawableState = getState();
                o00oo1.f16844OooO0o.OooO0o0(this.f16283Oooooo, textPaint2, o00oo1.f16841OooO0O0);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(o00oo1.OooO00o(this.f16261Oooo00o.toString())) > Math.round(rectF3.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f16261Oooo00o;
            if (z2 && this.f16290o000000o != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f16290o000000o);
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
                float f10 = this.f16284Oooooo0 + this.f16282OooooOo;
                if (o00Ooo.OooO0OO.OooO00o(this) == 0) {
                    float f11 = bounds.right - f10;
                    rectF2 = rectF;
                    rectF2.right = f11;
                    rectF2.left = f11 - this.f16269OoooO0;
                } else {
                    rectF2 = rectF;
                    float f12 = bounds.left + f10;
                    rectF2.left = f12;
                    rectF2.right = f12 + this.f16269OoooO0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.f16269OoooO0;
                float f14 = fExactCenterY - (f13 / 2.0f);
                rectF2.top = f14;
                rectF2.bottom = f14 + f13;
            } else {
                rectF2 = rectF;
            }
            float f15 = rectF2.left;
            float f16 = rectF2.top;
            canvas.translate(f15, f16);
            this.f16267Oooo0oo.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = OooOOOO.f41031OooO00o;
            this.f16257Oooo.setBounds(this.f16267Oooo0oo.getBounds());
            this.f16257Oooo.jumpToCurrentState();
            this.f16257Oooo.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (this.f16309o0ooOoO < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16309o0ooOoO;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final ColorFilter getColorFilter() {
        return this.f16304o0OOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f16253OooOoo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(OooOoOO() + this.f16296o00Oo0.OooO00o(this.f16261Oooo00o.toString()) + OooOoO() + this.f16276OoooOoO + this.f16279Ooooo0o + this.f16280OooooO0 + this.f16284Oooooo0), this.f16292o00000O0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        if (this.f16291o00000O) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f16253OooOoo, this.f16255OooOooO);
        } else {
            outline.setRoundRect(bounds, this.f16255OooOooO);
        }
        outline.setAlpha(this.f16309o0ooOoO / 255.0f);
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
        if (OooOoo(this.f16252OooOoOO) || OooOoo(this.f16254OooOoo0) || OooOoo(this.f16256OooOooo)) {
            return true;
        }
        if (this.f16293o000OOo && OooOoo(this.f16288o000000)) {
            return true;
        }
        OooO oooO = this.f16296o00Oo0.f16844OooO0o;
        if ((oooO == null || (colorStateList = oooO.f41017OooOO0) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.f16272OoooOO0 && this.f16294o000oOoO != null && this.f16268OoooO) || OooOooO(this.f16262Oooo0O0) || OooOooO(this.f16294o000oOoO) || OooOoo(this.f16303o0OO00O);
    }

    public final void o000oOoO(@Nullable ColorStateList colorStateList) {
        if (this.f16270OoooO00 != colorStateList) {
            this.f16270OoooO00 = colorStateList;
            if (Ooooo0o()) {
                o00Ooo.OooO0O0.OooO0oo(this.f16267Oooo0oo, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Ooooo00()) {
            zOnLayoutDirectionChanged |= o00Ooo.OooO0OO.OooO0O0(this.f16262Oooo0O0, i);
        }
        if (OoooOoo()) {
            zOnLayoutDirectionChanged |= o00Ooo.OooO0OO.OooO0O0(this.f16294o000oOoO, i);
        }
        if (Ooooo0o()) {
            zOnLayoutDirectionChanged |= o00Ooo.OooO0OO.OooO0O0(this.f16267Oooo0oo, i);
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
            zOnLevelChange |= this.f16262Oooo0O0.setLevel(i);
        }
        if (OoooOoo()) {
            zOnLevelChange |= this.f16294o000oOoO.setLevel(i);
        }
        if (Ooooo0o()) {
            zOnLevelChange |= this.f16267Oooo0oo.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.o00Oo0.OooO0O0
    public final boolean onStateChange(@NonNull int[] iArr) {
        if (this.f16291o00000O) {
            super.onStateChange(iArr);
        }
        return Oooo000(iArr, this.f16302o0O0O00);
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
        if (this.f16309o0ooOoO != i) {
            this.f16309o0ooOoO = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.f16304o0OOO0o != colorFilter) {
            this.f16304o0OOO0o = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.f16303o0OO00O != colorStateList) {
            this.f16303o0OO00O = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f16311oo0o0Oo != mode) {
            this.f16311oo0o0Oo = mode;
            ColorStateList colorStateList = this.f16303o0OO00O;
            this.f16305o0Oo0oo = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (Ooooo00()) {
            visible |= this.f16262Oooo0O0.setVisible(z, z2);
        }
        if (OoooOoo()) {
            visible |= this.f16294o000oOoO.setVisible(z, z2);
        }
        if (Ooooo0o()) {
            visible |= this.f16267Oooo0oo.setVisible(z, z2);
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
