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
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.OooOo;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;
import o0OOO0OO.OooO0O0;
import p071o000O0o.OooO0o;
import p084o000Ooo.o0OOO0o;
import p338o0OO0o0O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends MaterialShapeDrawable implements Drawable.Callback, OooOo.OooO0O0 {

    /* JADX INFO: renamed from: o000O00, reason: collision with root package name */
    public static final int[] f16787o000O00 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: o000O00O, reason: collision with root package name */
    public static final ShapeDrawable f16788o000O00O = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: o000, reason: collision with root package name */
    public boolean f16789o000;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public float f16790o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    @Nullable
    public Drawable f16791o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    @Nullable
    public SpannableStringBuilder f16792o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public boolean f16793o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public boolean f16794o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    @Nullable
    public OooOo00 f16795o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    @Nullable
    public ColorStateList f16796o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    @Nullable
    public OooOo00 f16797o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public float f16798o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public float f16799o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public float f16800o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public float f16801o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public final PointF f16802o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    public final Paint f16803o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public float f16804o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public final Paint.FontMetrics f16805o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    @NonNull
    public final OooOo f16806o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public final Path f16807o0000OO0;

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    @ColorInt
    public int f16808o0000OOO;

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    @ColorInt
    public int f16809o0000OOo;

    /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
    @ColorInt
    public int f16810o0000Oo;

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    @ColorInt
    public int f16811o0000Oo0;

    /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
    @ColorInt
    public int f16812o0000OoO;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public float f16813o0000Ooo;

    /* JADX INFO: renamed from: o0000o, reason: collision with root package name */
    public int f16814o0000o;

    /* JADX INFO: renamed from: o0000o0, reason: collision with root package name */
    @ColorInt
    public int f16815o0000o0;

    /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
    public boolean f16816o0000o0O;

    /* JADX INFO: renamed from: o0000o0o, reason: collision with root package name */
    @ColorInt
    public int f16817o0000o0o;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    @NonNull
    public final Context f16818o0000oO;

    /* JADX INFO: renamed from: o0000oO0, reason: collision with root package name */
    @Nullable
    public ColorFilter f16819o0000oO0;

    /* JADX INFO: renamed from: o0000oOO, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f16820o0000oOO;

    /* JADX INFO: renamed from: o0000oOo, reason: collision with root package name */
    @Nullable
    public ColorStateList f16821o0000oOo;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public float f16822o0000oo;

    /* JADX INFO: renamed from: o0000oo0, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f16823o0000oo0;

    /* JADX INFO: renamed from: o0000ooO, reason: collision with root package name */
    public int[] f16824o0000ooO;

    /* JADX INFO: renamed from: o000O000, reason: collision with root package name */
    @Nullable
    public ColorStateList f16825o000O000;

    /* JADX INFO: renamed from: o000O0O, reason: collision with root package name */
    public int f16826o000O0O;

    /* JADX INFO: renamed from: o000O0o, reason: collision with root package name */
    public TextUtils.TruncateAt f16827o000O0o;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public final RectF f16828o000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public float f16829o000OOo;
    public boolean o000Oo0;

    /* JADX INFO: renamed from: o000OoO, reason: collision with root package name */
    @NonNull
    public WeakReference<InterfaceC0106OooO00o> f16830o000OoO;

    /* JADX INFO: renamed from: o000Ooo, reason: collision with root package name */
    public boolean f16831o000Ooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16832o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public float f16833o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public float f16834o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16835o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f16836o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @Nullable
    public CharSequence f16837o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public float f16838o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    @Nullable
    public ColorStateList f16839o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    @Nullable
    public Drawable f16840o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public boolean f16841o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public boolean f16842o0Oo0oo;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @Nullable
    public Drawable f16843o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @Nullable
    public ColorStateList f16844o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public float f16845o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @Nullable
    public ColorStateList f16846oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    @Nullable
    public RippleDrawable f16847oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16848ooOO;

    /* JADX INFO: renamed from: com.google.android.material.chip.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0106OooO00o {
        void OooO00o();
    }

    public OooO00o(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, Chip.f16749Ooooooo);
        this.f16834o00Ooo = -1.0f;
        this.f16803o0000O0 = new Paint(1);
        this.f16805o0000O0O = new Paint.FontMetrics();
        this.f16828o000OO = new RectF();
        this.f16802o0000O = new PointF();
        this.f16807o0000OO0 = new Path();
        this.f16814o0000o = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f16823o0000oo0 = PorterDuff.Mode.SRC_IN;
        this.f16830o000OoO = new WeakReference<>(null);
        OooOOO0(context);
        this.f16818o0000oO = context;
        OooOo oooOo = new OooOo(this);
        this.f16806o0000OO = oooOo;
        this.f16837o00oO0o = "";
        oooOo.f17324OooO00o.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f16787o000O00;
        setState(iArr);
        Oooooo(iArr);
        this.f16831o000Ooo = true;
        int[] iArr2 = OooO0O0.f38129OooO00o;
        f16788o000O00O.setTint(-1);
    }

    public static boolean Oooo0OO(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean Oooo0o0(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @Override // com.google.android.material.internal.OooOo.OooO0O0
    public final void OooO00o() {
        Oooo0o();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060 A[PHI: r1
      0x0060: PHI (r1v3 float) = (r1v2 float), (r1v2 float), (r1v10 float) binds: [B:15:0x003f, B:16:0x0041, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooOoo(@NonNull Rect rect, @NonNull RectF rectF) {
        float intrinsicHeight;
        rectF.setEmpty();
        if (o00oO0O() || o00oO0o()) {
            float f = this.f16798o00000Oo + this.f16799o00000o0;
            float fOooo0O0 = Oooo0O0();
            if (o0OOO0o.OooO0O0(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + fOooo0O0;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - fOooo0O0;
            }
            Drawable drawable = this.f16816o0000o0O ? this.f16791o00000 : this.f16843o0ooOO0;
            float fCeil = this.f16845o0ooOoO;
            if (fCeil > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || drawable == null) {
                intrinsicHeight = fCeil;
            } else {
                fCeil = (float) Math.ceil(o00Ooo.OooO0O0(this.f16818o0000oO, 24));
                if (drawable.getIntrinsicHeight() <= fCeil) {
                    intrinsicHeight = drawable.getIntrinsicHeight();
                } else {
                    intrinsicHeight = fCeil;
                }
            }
            float fExactCenterY = rect.exactCenterY() - (intrinsicHeight / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + intrinsicHeight;
        }
    }

    public final void OooOoo0(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        o0OOO0o.OooO0OO(drawable, o0OOO0o.OooO0O0(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f16840o0OO00O) {
            if (drawable.isStateful()) {
                drawable.setState(this.f16824o0000ooO);
            }
            o0OOO0o.OooO0O0.OooO0oo(drawable, this.f16839o0O0O00);
            return;
        }
        Drawable drawable2 = this.f16843o0ooOO0;
        if (drawable == drawable2 && this.f16841o0OOO0o) {
            o0OOO0o.OooO0O0.OooO0oo(drawable2, this.f16844o0ooOOo);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final float OooOooO() {
        if (!o00oO0O() && !o00oO0o()) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        return Oooo0O0() + this.f16799o00000o0 + this.f16813o0000Ooo;
    }

    public final void OooOooo(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (o0ooOO0()) {
            float f = this.f16822o0000oo + this.f16804o0000O00;
            if (o0OOO0o.OooO0O0(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f16829o000OOo;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f16829o000OOo;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.f16829o000OOo;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public final void Oooo(@Nullable Drawable drawable) {
        if (this.f16791o00000 != drawable) {
            float fOooOooO = OooOooO();
            this.f16791o00000 = drawable;
            float fOooOooO2 = OooOooO();
            o0ooOOo(this.f16791o00000);
            OooOoo0(this.f16791o00000);
            invalidateSelf();
            if (fOooOooO != fOooOooO2) {
                Oooo0o();
            }
        }
    }

    @Nullable
    public final Drawable Oooo0() {
        Drawable drawable = this.f16840o0OO00O;
        if (drawable != null) {
            return o0OOO0o.OooO0Oo(drawable);
        }
        return null;
    }

    public final void Oooo000(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (o0ooOO0()) {
            float f = this.f16822o0000oo + this.f16804o0000O00 + this.f16829o000OOo + this.f16790o0000 + this.f16801o00000oo;
            if (o0OOO0o.OooO0O0(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public final float Oooo00O() {
        return o0ooOO0() ? this.f16790o0000 + this.f16829o000OOo + this.f16804o0000O00 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final float Oooo00o() {
        return this.o000Oo0 ? OooOO0O() : this.f16834o00Ooo;
    }

    public final float Oooo0O0() {
        Drawable drawable = this.f16816o0000o0O ? this.f16791o00000 : this.f16843o0ooOO0;
        float f = this.f16845o0ooOoO;
        return (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public final void Oooo0o() {
        InterfaceC0106OooO00o interfaceC0106OooO00o = this.f16830o000OoO.get();
        if (interfaceC0106OooO00o != null) {
            interfaceC0106OooO00o.OooO00o();
        }
    }

    public final boolean Oooo0oO(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f16848ooOO;
        int iOooO0Oo = OooO0Oo(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f16808o0000OOO) : 0);
        boolean state = true;
        if (this.f16808o0000OOO != iOooO0Oo) {
            this.f16808o0000OOO = iOooO0Oo;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f16832o00O0O;
        int iOooO0Oo2 = OooO0Oo(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f16809o0000OOo) : 0);
        if (this.f16809o0000OOo != iOooO0Oo2) {
            this.f16809o0000OOo = iOooO0Oo2;
            zOnStateChange = true;
        }
        int iOooO0O0 = OooO0o.OooO0O0(iOooO0Oo2, iOooO0Oo);
        if ((this.f16811o0000Oo0 != iOooO0O0) | (this.f17510Oooo0o.f17536OooO0OO == null)) {
            this.f16811o0000Oo0 = iOooO0O0;
            OooOOOo(ColorStateList.valueOf(iOooO0O0));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f16835o00o0O;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f16810o0000Oo) : 0;
        if (this.f16810o0000Oo != colorForState) {
            this.f16810o0000Oo = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f16825o000O000 == null || !OooO0O0.OooO0Oo(iArr)) ? 0 : this.f16825o000O000.getColorForState(iArr, this.f16812o0000OoO);
        if (this.f16812o0000OoO != colorForState2) {
            this.f16812o0000OoO = colorForState2;
            if (this.f16789o000) {
                zOnStateChange = true;
            }
        }
        o0OOO0O.OooO0o oooO0o = this.f16806o0000OO.f17328OooO0o;
        int colorForState3 = (oooO0o == null || (colorStateList = oooO0o.f38044OooOO0) == null) ? 0 : colorStateList.getColorForState(iArr, this.f16815o0000o0);
        if (this.f16815o0000o0 != colorForState3) {
            this.f16815o0000o0 = colorForState3;
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
        boolean z3 = z && this.f16793o000000O;
        if (this.f16816o0000o0O == z3 || this.f16791o00000 == null) {
            z2 = false;
        } else {
            float fOooOooO = OooOooO();
            this.f16816o0000o0O = z3;
            if (fOooOooO != OooOooO()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                zOnStateChange = true;
                z2 = false;
            }
        }
        ColorStateList colorStateList5 = this.f16821o0000oOo;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f16817o0000o0o) : 0;
        if (this.f16817o0000o0o != colorForState4) {
            this.f16817o0000o0o = colorForState4;
            this.f16820o0000oOO = p342o0OO0oo0.OooO0O0.OooO0O0(this, this.f16821o0000oOo, this.f16823o0000oo0);
        } else {
            state = zOnStateChange;
        }
        if (Oooo0o0(this.f16843o0ooOO0)) {
            state |= this.f16843o0ooOO0.setState(iArr);
        }
        if (Oooo0o0(this.f16791o00000)) {
            state |= this.f16791o00000.setState(iArr);
        }
        if (Oooo0o0(this.f16840o0OO00O)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f16840o0OO00O.setState(iArr3);
        }
        int[] iArr4 = OooO0O0.f38129OooO00o;
        if (Oooo0o0(this.f16847oo0o0Oo)) {
            state |= this.f16847oo0o0Oo.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            Oooo0o();
        }
        return state;
    }

    public final void Oooo0oo(boolean z) {
        if (this.f16793o000000O != z) {
            this.f16793o000000O = z;
            float fOooOooO = OooOooO();
            if (!z && this.f16816o0000o0O) {
                this.f16816o0000o0O = false;
            }
            float fOooOooO2 = OooOooO();
            invalidateSelf();
            if (fOooOooO != fOooOooO2) {
                Oooo0o();
            }
        }
    }

    @Deprecated
    public final void OoooO(float f) {
        if (this.f16834o00Ooo != f) {
            this.f16834o00Ooo = f;
            setShapeAppearanceModel(this.f17510Oooo0o.f17534OooO00o.OooO0oO(f));
        }
    }

    public final void OoooO0(boolean z) {
        if (this.f16794o000000o != z) {
            boolean zO00oO0o = o00oO0o();
            this.f16794o000000o = z;
            boolean zO00oO0o2 = o00oO0o();
            if (zO00oO0o != zO00oO0o2) {
                if (zO00oO0o2) {
                    OooOoo0(this.f16791o00000);
                } else {
                    o0ooOOo(this.f16791o00000);
                }
                invalidateSelf();
                Oooo0o();
            }
        }
    }

    public final void OoooO00(@Nullable ColorStateList colorStateList) {
        if (this.f16796o00000O0 != colorStateList) {
            this.f16796o00000O0 = colorStateList;
            if (this.f16794o000000o && this.f16791o00000 != null && this.f16793o000000O) {
                o0OOO0o.OooO0O0.OooO0oo(this.f16791o00000, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void OoooO0O(@Nullable ColorStateList colorStateList) {
        if (this.f16832o00O0O != colorStateList) {
            this.f16832o00O0O = colorStateList;
            onStateChange(getState());
        }
    }

    public final void OoooOO0(float f) {
        if (this.f16822o0000oo != f) {
            this.f16822o0000oo = f;
            invalidateSelf();
            Oooo0o();
        }
    }

    public final void OoooOOO(float f) {
        if (this.f16845o0ooOoO != f) {
            float fOooOooO = OooOooO();
            this.f16845o0ooOoO = f;
            float fOooOooO2 = OooOooO();
            invalidateSelf();
            if (fOooOooO != fOooOooO2) {
                Oooo0o();
            }
        }
    }

    public final void OoooOOo(@Nullable ColorStateList colorStateList) {
        this.f16841o0OOO0o = true;
        if (this.f16844o0ooOOo != colorStateList) {
            this.f16844o0ooOOo = colorStateList;
            if (o00oO0O()) {
                o0OOO0o.OooO0O0.OooO0oo(this.f16843o0ooOO0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void OoooOo0(boolean z) {
        if (this.f16836o00oO0O != z) {
            boolean zO00oO0O = o00oO0O();
            this.f16836o00oO0O = z;
            boolean zO00oO0O2 = o00oO0O();
            if (zO00oO0O != zO00oO0O2) {
                if (zO00oO0O2) {
                    OooOoo0(this.f16843o0ooOO0);
                } else {
                    o0ooOOo(this.f16843o0ooOO0);
                }
                invalidateSelf();
                Oooo0o();
            }
        }
    }

    public final void OoooOoO(float f) {
        if (this.f16833o00Oo0 != f) {
            this.f16833o00Oo0 = f;
            invalidateSelf();
            Oooo0o();
        }
    }

    public final void OoooOoo(float f) {
        if (this.f16798o00000Oo != f) {
            this.f16798o00000Oo = f;
            invalidateSelf();
            Oooo0o();
        }
    }

    public final void Ooooo00(@Nullable ColorStateList colorStateList) {
        if (this.f16835o00o0O != colorStateList) {
            this.f16835o00o0O = colorStateList;
            if (this.o000Oo0) {
                OooOo0o(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Ooooo0o(float f) {
        if (this.f16838o00ooo != f) {
            this.f16838o00ooo = f;
            this.f16803o0000O0.setStrokeWidth(f);
            if (this.o000Oo0) {
                OooOo(f);
            }
            invalidateSelf();
        }
    }

    public final void OooooO0(@Nullable Drawable drawable) {
        Drawable drawableOooo0 = Oooo0();
        if (drawableOooo0 != drawable) {
            float fOooo00O = Oooo00O();
            this.f16840o0OO00O = drawable != null ? o0OOO0o.OooO0o0(drawable).mutate() : null;
            int[] iArr = OooO0O0.f38129OooO00o;
            this.f16847oo0o0Oo = new RippleDrawable(OooO0O0.OooO0OO(this.f16846oo000o), this.f16840o0OO00O, f16788o000O00O);
            float fOooo00O2 = Oooo00O();
            o0ooOOo(drawableOooo0);
            if (o0ooOO0()) {
                OooOoo0(this.f16840o0OO00O);
            }
            invalidateSelf();
            if (fOooo00O != fOooo00O2) {
                Oooo0o();
            }
        }
    }

    public final void OooooOO(float f) {
        if (this.f16804o0000O00 != f) {
            this.f16804o0000O00 = f;
            invalidateSelf();
            if (o0ooOO0()) {
                Oooo0o();
            }
        }
    }

    public final void OooooOo(float f) {
        if (this.f16829o000OOo != f) {
            this.f16829o000OOo = f;
            invalidateSelf();
            if (o0ooOO0()) {
                Oooo0o();
            }
        }
    }

    public final boolean Oooooo(@NonNull int[] iArr) {
        if (Arrays.equals(this.f16824o0000ooO, iArr)) {
            return false;
        }
        this.f16824o0000ooO = iArr;
        if (o0ooOO0()) {
            return Oooo0oO(getState(), iArr);
        }
        return false;
    }

    public final void Oooooo0(float f) {
        if (this.f16790o0000 != f) {
            this.f16790o0000 = f;
            invalidateSelf();
            if (o0ooOO0()) {
                Oooo0o();
            }
        }
    }

    public final void OoooooO(@Nullable ColorStateList colorStateList) {
        if (this.f16839o0O0O00 != colorStateList) {
            this.f16839o0O0O00 = colorStateList;
            if (o0ooOO0()) {
                o0OOO0o.OooO0O0.OooO0oo(this.f16840o0OO00O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Ooooooo(boolean z) {
        if (this.f16842o0Oo0oo != z) {
            boolean zO0ooOO0 = o0ooOO0();
            this.f16842o0Oo0oo = z;
            boolean zO0ooOO1 = o0ooOO0();
            if (zO0ooOO0 != zO0ooOO1) {
                if (zO0ooOO1) {
                    OooOoo0(this.f16840o0OO00O);
                } else {
                    o0ooOOo(this.f16840o0OO00O);
                }
                invalidateSelf();
                Oooo0o();
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i;
        int iSaveLayerAlpha;
        int i2;
        int i3;
        int i4;
        int i5;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f16814o0000o) == 0) {
            return;
        }
        if (i < 255) {
            float f = bounds.left;
            float f2 = bounds.top;
            float f3 = bounds.right;
            float f4 = bounds.bottom;
            iSaveLayerAlpha = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
        } else {
            iSaveLayerAlpha = 0;
        }
        if (!this.o000Oo0) {
            this.f16803o0000O0.setColor(this.f16808o0000OOO);
            this.f16803o0000O0.setStyle(Paint.Style.FILL);
            this.f16828o000OO.set(bounds);
            canvas.drawRoundRect(this.f16828o000OO, Oooo00o(), Oooo00o(), this.f16803o0000O0);
        }
        if (!this.o000Oo0) {
            this.f16803o0000O0.setColor(this.f16809o0000OOo);
            this.f16803o0000O0.setStyle(Paint.Style.FILL);
            Paint paint = this.f16803o0000O0;
            ColorFilter colorFilter = this.f16819o0000oO0;
            if (colorFilter == null) {
                colorFilter = this.f16820o0000oOO;
            }
            paint.setColorFilter(colorFilter);
            this.f16828o000OO.set(bounds);
            canvas.drawRoundRect(this.f16828o000OO, Oooo00o(), Oooo00o(), this.f16803o0000O0);
        }
        if (this.o000Oo0) {
            super.draw(canvas);
        }
        if (this.f16838o00ooo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && !this.o000Oo0) {
            this.f16803o0000O0.setColor(this.f16810o0000Oo);
            this.f16803o0000O0.setStyle(Paint.Style.STROKE);
            if (!this.o000Oo0) {
                Paint paint2 = this.f16803o0000O0;
                ColorFilter colorFilter2 = this.f16819o0000oO0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f16820o0000oOO;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.f16828o000OO;
            float f5 = bounds.left;
            float f6 = this.f16838o00ooo / 2.0f;
            rectF.set(f5 + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.f16834o00Ooo - (this.f16838o00ooo / 2.0f);
            canvas.drawRoundRect(this.f16828o000OO, f7, f7, this.f16803o0000O0);
        }
        this.f16803o0000O0.setColor(this.f16812o0000OoO);
        this.f16803o0000O0.setStyle(Paint.Style.FILL);
        this.f16828o000OO.set(bounds);
        if (this.o000Oo0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f16807o0000OO0;
            com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17525OooooO0;
            MaterialShapeDrawable.OooO0O0 oooO0O1 = this.f17510Oooo0o;
            oooO0O0.OooO0O0(oooO0O1.f17534OooO00o, oooO0O1.f17542OooOO0, rectF2, this.f17524Ooooo0o, path);
            i2 = 0;
            OooO0o(canvas, this.f16803o0000O0, this.f16807o0000OO0, this.f17510Oooo0o.f17534OooO00o, OooO0oo());
        } else {
            canvas.drawRoundRect(this.f16828o000OO, Oooo00o(), Oooo00o(), this.f16803o0000O0);
            i2 = 0;
        }
        if (o00oO0O()) {
            OooOoo(bounds, this.f16828o000OO);
            RectF rectF3 = this.f16828o000OO;
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.f16843o0ooOO0.setBounds(i2, i2, (int) this.f16828o000OO.width(), (int) this.f16828o000OO.height());
            this.f16843o0ooOO0.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (o00oO0o()) {
            OooOoo(bounds, this.f16828o000OO);
            RectF rectF4 = this.f16828o000OO;
            float f10 = rectF4.left;
            float f11 = rectF4.top;
            canvas.translate(f10, f11);
            this.f16791o00000.setBounds(i2, i2, (int) this.f16828o000OO.width(), (int) this.f16828o000OO.height());
            this.f16791o00000.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (!this.f16831o000Ooo || this.f16837o00oO0o == null) {
            i3 = iSaveLayerAlpha;
            i4 = KotlinVersion.MAX_COMPONENT_VALUE;
            i5 = 0;
        } else {
            PointF pointF = this.f16802o0000O;
            pointF.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Paint.Align align = Paint.Align.LEFT;
            if (this.f16837o00oO0o != null) {
                float fOooOooO = OooOooO() + this.f16798o00000Oo + this.f16800o00000oO;
                if (o0OOO0o.OooO0O0(this) == 0) {
                    pointF.x = bounds.left + fOooOooO;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fOooOooO;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                this.f16806o0000OO.f17324OooO00o.getFontMetrics(this.f16805o0000O0O);
                Paint.FontMetrics fontMetrics = this.f16805o0000O0O;
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF5 = this.f16828o000OO;
            rectF5.setEmpty();
            if (this.f16837o00oO0o != null) {
                float fOooOooO2 = OooOooO() + this.f16798o00000Oo + this.f16800o00000oO;
                float fOooo00O = Oooo00O() + this.f16822o0000oo + this.f16801o00000oo;
                if (o0OOO0o.OooO0O0(this) == 0) {
                    rectF5.left = bounds.left + fOooOooO2;
                    rectF5.right = bounds.right - fOooo00O;
                } else {
                    rectF5.left = bounds.left + fOooo00O;
                    rectF5.right = bounds.right - fOooOooO2;
                }
                rectF5.top = bounds.top;
                rectF5.bottom = bounds.bottom;
            }
            OooOo oooOo = this.f16806o0000OO;
            if (oooOo.f17328OooO0o != null) {
                oooOo.f17324OooO00o.drawableState = getState();
                OooOo oooOo2 = this.f16806o0000OO;
                oooOo2.f17328OooO0o.OooO0o0(this.f16818o0000oO, oooOo2.f17324OooO00o, oooOo2.f17325OooO0O0);
            }
            this.f16806o0000OO.f17324OooO00o.setTextAlign(align);
            boolean z = Math.round(this.f16806o0000OO.OooO00o(this.f16837o00oO0o.toString())) > Math.round(this.f16828o000OO.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.f16828o000OO);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f16837o00oO0o;
            if (z && this.f16827o000O0o != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f16806o0000OO.f17324OooO00o, this.f16828o000OO.width(), this.f16827o000O0o);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF2 = this.f16802o0000O;
            float f12 = pointF2.x;
            float f13 = pointF2.y;
            TextPaint textPaint = this.f16806o0000OO.f17324OooO00o;
            i5 = 0;
            i4 = KotlinVersion.MAX_COMPONENT_VALUE;
            i3 = iSaveLayerAlpha;
            canvas.drawText(charSequence, 0, length, f12, f13, textPaint);
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
        if (o0ooOO0()) {
            OooOooo(bounds, this.f16828o000OO);
            RectF rectF6 = this.f16828o000OO;
            float f14 = rectF6.left;
            float f15 = rectF6.top;
            canvas.translate(f14, f15);
            this.f16840o0OO00O.setBounds(i5, i5, (int) this.f16828o000OO.width(), (int) this.f16828o000OO.height());
            int[] iArr = OooO0O0.f38129OooO00o;
            this.f16847oo0o0Oo.setBounds(this.f16840o0OO00O.getBounds());
            this.f16847oo0o0Oo.jumpToCurrentState();
            this.f16847oo0o0Oo.draw(canvas);
            canvas.translate(-f14, -f15);
        }
        if (this.f16814o0000o < i4) {
            canvas.restoreToCount(i3);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16814o0000o;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final ColorFilter getColorFilter() {
        return this.f16819o0000oO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f16833o00Oo0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(Oooo00O() + this.f16806o0000OO.OooO00o(this.f16837o00oO0o.toString()) + OooOooO() + this.f16798o00000Oo + this.f16800o00000oO + this.f16801o00000oo + this.f16822o0000oo), this.f16826o000O0O);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        if (this.o000Oo0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f16833o00Oo0, this.f16834o00Ooo);
        } else {
            outline.setRoundRect(bounds, this.f16834o00Ooo);
        }
        outline.setAlpha(this.f16814o0000o / 255.0f);
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
        if (!Oooo0OO(this.f16848ooOO) && !Oooo0OO(this.f16832o00O0O) && !Oooo0OO(this.f16835o00o0O) && (!this.f16789o000 || !Oooo0OO(this.f16825o000O000))) {
            o0OOO0O.OooO0o oooO0o = this.f16806o0000OO.f17328OooO0o;
            if (!((oooO0o == null || (colorStateList = oooO0o.f38044OooOO0) == null || !colorStateList.isStateful()) ? false : true)) {
                if (!(this.f16794o000000o && this.f16791o00000 != null && this.f16793o000000O) && !Oooo0o0(this.f16843o0ooOO0) && !Oooo0o0(this.f16791o00000) && !Oooo0OO(this.f16821o0000oOo)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void o000oOoO(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f16843o0ooOO0;
        Drawable drawableOooO0Oo = drawable2 != null ? o0OOO0o.OooO0Oo(drawable2) : null;
        if (drawableOooO0Oo != drawable) {
            float fOooOooO = OooOooO();
            this.f16843o0ooOO0 = drawable != null ? o0OOO0o.OooO0o0(drawable).mutate() : null;
            float fOooOooO2 = OooOooO();
            o0ooOOo(drawableOooO0Oo);
            if (o00oO0O()) {
                OooOoo0(this.f16843o0ooOO0);
            }
            invalidateSelf();
            if (fOooOooO != fOooOooO2) {
                Oooo0o();
            }
        }
    }

    public final void o00O0O(@Nullable ColorStateList colorStateList) {
        if (this.f16846oo000o != colorStateList) {
            this.f16846oo000o = colorStateList;
            this.f16825o000O000 = this.f16789o000 ? OooO0O0.OooO0OO(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final void o00Oo0(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f16837o00oO0o, charSequence)) {
            return;
        }
        this.f16837o00oO0o = charSequence;
        this.f16806o0000OO.f17327OooO0Oo = true;
        invalidateSelf();
        Oooo0o();
    }

    public final void o00Ooo(@Nullable o0OOO0O.OooO0o oooO0o) {
        this.f16806o0000OO.OooO0O0(oooO0o, this.f16818o0000oO);
    }

    public final void o00o0O(float f) {
        if (this.f16801o00000oo != f) {
            this.f16801o00000oo = f;
            invalidateSelf();
            Oooo0o();
        }
    }

    public final boolean o00oO0O() {
        return this.f16836o00oO0O && this.f16843o0ooOO0 != null;
    }

    public final boolean o00oO0o() {
        return this.f16794o000000o && this.f16791o00000 != null && this.f16816o0000o0O;
    }

    public final void o00ooo(float f) {
        if (this.f16800o00000oO != f) {
            this.f16800o00000oO = f;
            invalidateSelf();
            Oooo0o();
        }
    }

    public final void o0OoOo0(float f) {
        if (this.f16813o0000Ooo != f) {
            float fOooOooO = OooOooO();
            this.f16813o0000Ooo = f;
            float fOooOooO2 = OooOooO();
            invalidateSelf();
            if (fOooOooO != fOooOooO2) {
                Oooo0o();
            }
        }
    }

    public final boolean o0ooOO0() {
        return this.f16842o0Oo0oo && this.f16840o0OO00O != null;
    }

    public final void o0ooOOo(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (o00oO0O()) {
            zOnLayoutDirectionChanged |= o0OOO0o.OooO0OO(this.f16843o0ooOO0, i);
        }
        if (o00oO0o()) {
            zOnLayoutDirectionChanged |= o0OOO0o.OooO0OO(this.f16791o00000, i);
        }
        if (o0ooOO0()) {
            zOnLayoutDirectionChanged |= o0OOO0o.OooO0OO(this.f16840o0OO00O, i);
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
        if (o00oO0O()) {
            zOnLevelChange |= this.f16843o0ooOO0.setLevel(i);
        }
        if (o00oO0o()) {
            zOnLevelChange |= this.f16791o00000.setLevel(i);
        }
        if (o0ooOO0()) {
            zOnLevelChange |= this.f16840o0OO00O.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.OooOo.OooO0O0
    public final boolean onStateChange(@NonNull int[] iArr) {
        if (this.o000Oo0) {
            super.onStateChange(iArr);
        }
        return Oooo0oO(iArr, this.f16824o0000ooO);
    }

    public final void oo000o() {
        if (this.f16789o000) {
            this.f16789o000 = false;
            this.f16825o000O000 = null;
            onStateChange(getState());
        }
    }

    public final void ooOO(float f) {
        if (this.f16799o00000o0 != f) {
            float fOooOooO = OooOooO();
            this.f16799o00000o0 = f;
            float fOooOooO2 = OooOooO();
            invalidateSelf();
            if (fOooOooO != fOooOooO2) {
                Oooo0o();
            }
        }
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
        if (this.f16814o0000o != i) {
            this.f16814o0000o = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.f16819o0000oO0 != colorFilter) {
            this.f16819o0000oO0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.f16821o0000oOo != colorStateList) {
            this.f16821o0000oOo = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f16823o0000oo0 != mode) {
            this.f16823o0000oo0 = mode;
            this.f16820o0000oOO = p342o0OO0oo0.OooO0O0.OooO0O0(this, this.f16821o0000oOo, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (o00oO0O()) {
            visible |= this.f16843o0ooOO0.setVisible(z, z2);
        }
        if (o00oO0o()) {
            visible |= this.f16791o00000.setVisible(z, z2);
        }
        if (o0ooOO0()) {
            visible |= this.f16840o0OO00O.setVisible(z, z2);
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
