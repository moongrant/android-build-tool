package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import io.agora.rtc.Constants;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final RectF f16735OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f16736OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f16737OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f16738OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f16739OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16740OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f16741OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final Rect f16742OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final Rect f16743OooO0oo;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ColorStateList f16747OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ColorStateList f16749OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f16750OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f16751OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f16752OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f16753OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Typeface f16754OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f16755OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f16756OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f16757OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Typeface f16758OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Typeface f16759OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Typeface f16760OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Typeface f16761OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Typeface f16762OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Typeface f16763OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public p276o0O00OoO.OooO0O0 f16764OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public p276o0O00OoO.OooO0O0 f16765OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f16766Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f16767Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public CharSequence f16769Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public CharSequence f16770Oooo00o;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public Bitmap f16772Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f16773Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f16774Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f16775Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f16776Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NonNull
    public final TextPaint f16777OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int[] f16778OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f16779OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f16780OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NonNull
    public final TextPaint f16781OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TimeInterpolator f16782OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f16783OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f16784OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f16785OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ColorStateList f16786OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f16787Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f16788Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f16789OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ColorStateList f16790OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public float f16791OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f16792Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public float f16793Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public StaticLayout f16794OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public float f16795Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TimeInterpolator f16796o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public CharSequence f16797o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public float f16802o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public float f16803ooOO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f16744OooOO0 = 16;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f16745OooOO0O = 16;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f16746OooOO0o = 15.0f;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f16748OooOOO0 = 15.0f;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextUtils.TruncateAt f16768Oooo000 = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f16771Oooo0O0 = true;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f16798o00Oo0 = 1;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public float f16799o00Ooo = 0.0f;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public float f16800o00o0O = 1.0f;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f16801o00ooo = 1;

    public class OooO00o implements o0O00OoO.OooO0O0.OooO00o {
        public OooO00o() {
        }

        @Override // o0O00OoO.OooO0O0.OooO00o
        public final void OooO00o(Typeface typeface) {
            OooO0OO oooO0OO = OooO0OO.this;
            if (oooO0OO.OooOOO0(typeface)) {
                oooO0OO.OooO(false);
            }
        }
    }

    public class OooO0O0 implements o0O00OoO.OooO0O0.OooO00o {
        public OooO0O0() {
        }

        @Override // o0O00OoO.OooO0O0.OooO00o
        public final void OooO00o(Typeface typeface) {
            OooO0OO oooO0OO = OooO0OO.this;
            if (oooO0OO.OooOOOO(typeface)) {
                oooO0OO.OooO(false);
            }
        }
    }

    public OooO0OO(View view) {
        this.f16736OooO00o = view;
        TextPaint textPaint = new TextPaint(Constants.ERR_WATERMARK_READ);
        this.f16777OoooO = textPaint;
        this.f16781OoooOO0 = new TextPaint(textPaint);
        this.f16743OooO0oo = new Rect();
        this.f16742OooO0oO = new Rect();
        this.f16735OooO = new RectF();
        float f = this.f16739OooO0Oo;
        this.f16741OooO0o0 = OooOo.OooO0o.OooO00o(1.0f, f, 0.5f, f);
        OooO0oo(view.getContext().getResources().getConfiguration());
    }

    @ColorInt
    public static int OooO00o(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f, @ColorInt int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float OooO0oO(float f, float f2, float f3, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = o0O000.OooO0O0.f40880OooO00o;
        return OooOo.OooO0o.OooO00o(f2, f, f3, f);
    }

    public final void OooO(boolean z) {
        float fMeasureText;
        float f;
        StaticLayout staticLayout;
        View view = this.f16736OooO00o;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z) {
            return;
        }
        OooO0OO(1.0f, z);
        CharSequence charSequence = this.f16770Oooo00o;
        TextPaint textPaint = this.f16777OoooO;
        if (charSequence != null && (staticLayout = this.f16794OoooooO) != null) {
            this.f16797o00O0O = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f16768Oooo000);
        }
        CharSequence charSequence2 = this.f16797o00O0O;
        if (charSequence2 != null) {
            this.f16795Ooooooo = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f16795Ooooooo = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f16745OooOO0O, this.f16767Oooo0 ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f16743OooO0oo;
        if (i == 48) {
            this.f16751OooOOo = rect.top;
        } else if (i != 80) {
            this.f16751OooOOo = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f16751OooOOo = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f16756OooOo00 = rect.centerX() - (this.f16795Ooooooo / 2.0f);
        } else if (i2 != 5) {
            this.f16756OooOo00 = rect.left;
        } else {
            this.f16756OooOo00 = rect.right - this.f16795Ooooooo;
        }
        OooO0OO(0.0f, z);
        StaticLayout staticLayout2 = this.f16794OoooooO;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f16794OoooooO;
        if (staticLayout3 == null || this.f16798o00Oo0 <= 1) {
            CharSequence charSequence3 = this.f16770Oooo00o;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f16794OoooooO;
        this.f16750OooOOOo = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f16744OooOO0, this.f16767Oooo0 ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f16742OooO0oO;
        if (i3 == 48) {
            this.f16752OooOOo0 = rect2.top;
        } else if (i3 != 80) {
            this.f16752OooOOo0 = rect2.centerY() - (height / 2.0f);
        } else {
            this.f16752OooOOo0 = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f16753OooOOoo = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f16753OooOOoo = rect2.left;
        } else {
            this.f16753OooOOoo = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f16772Oooo0OO;
        if (bitmap != null) {
            bitmap.recycle();
            this.f16772Oooo0OO = null;
        }
        OooOOo0(this.f16737OooO0O0);
        float f2 = this.f16737OooO0O0;
        boolean z2 = this.f16738OooO0OO;
        RectF rectF = this.f16735OooO;
        if (z2) {
            if (f2 < this.f16741OooO0o0) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = OooO0oO(rect2.left, rect.left, f2, this.f16796o000oOoO);
            rectF.top = OooO0oO(this.f16752OooOOo0, this.f16751OooOOo, f2, this.f16796o000oOoO);
            rectF.right = OooO0oO(rect2.right, rect.right, f2, this.f16796o000oOoO);
            rectF.bottom = OooO0oO(rect2.bottom, rect.bottom, f2, this.f16796o000oOoO);
        }
        if (!this.f16738OooO0OO) {
            this.f16755OooOo0 = OooO0oO(this.f16753OooOOoo, this.f16756OooOo00, f2, this.f16796o000oOoO);
            this.f16757OooOo0O = OooO0oO(this.f16752OooOOo0, this.f16751OooOOo, f2, this.f16796o000oOoO);
            OooOOo0(f2);
            f = f2;
        } else if (f2 < this.f16741OooO0o0) {
            this.f16755OooOo0 = this.f16753OooOOoo;
            this.f16757OooOo0O = this.f16752OooOOo0;
            OooOOo0(0.0f);
            f = 0.0f;
        } else {
            this.f16755OooOo0 = this.f16756OooOo00;
            this.f16757OooOo0O = this.f16751OooOOo - Math.max(0, this.f16740OooO0o);
            OooOOo0(1.0f);
            f = 1.0f;
        }
        p064o0000oO0.OooOO0 oooOO1 = o0O000.OooO0O0.f40881OooO0O0;
        this.f16802o0OoOo0 = 1.0f - OooO0oO(0.0f, 1.0f, 1.0f - f2, oooOO1);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOO0O(view);
        this.f16803ooOO = OooO0oO(1.0f, 0.0f, f2, oooOO1);
        ViewCompat.OooO0o.OooOO0O(view);
        ColorStateList colorStateList = this.f16749OooOOOO;
        ColorStateList colorStateList2 = this.f16747OooOOO;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(OooO00o(OooO0o(colorStateList2), f, OooO0o(this.f16749OooOOOO)));
        } else {
            textPaint.setColor(OooO0o(colorStateList));
        }
        float f3 = this.f16791OooooOo;
        float f4 = this.f16793Oooooo0;
        if (f3 != f4) {
            textPaint.setLetterSpacing(OooO0oO(f4, f3, f2, oooOO1));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.f16775Oooo0oO = OooO0oO(this.f16787Ooooo00, this.f16783OoooOOo, f2, null);
        this.f16776Oooo0oo = OooO0oO(this.f16788Ooooo0o, this.f16784OoooOo0, f2, null);
        this.f16766Oooo = OooO0oO(this.f16789OooooO0, this.f16785OoooOoO, f2, null);
        int iOooO00o = OooO00o(OooO0o(this.f16790OooooOO), f2, OooO0o(this.f16786OoooOoo));
        this.f16779OoooO00 = iOooO00o;
        textPaint.setShadowLayer(this.f16775Oooo0oO, this.f16776Oooo0oo, this.f16766Oooo, iOooO00o);
        if (this.f16738OooO0OO) {
            int alpha = textPaint.getAlpha();
            float f5 = this.f16741OooO0o0;
            textPaint.setAlpha((int) ((f2 <= f5 ? o0O000.OooO0O0.OooO00o(1.0f, 0.0f, this.f16739OooO0Oo, f5, f2) : o0O000.OooO0O0.OooO00o(0.0f, 1.0f, f5, 1.0f, f2)) * alpha));
        }
        ViewCompat.OooO0o.OooOO0O(view);
    }

    public final boolean OooO0O0(@NonNull CharSequence charSequence) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(this.f16736OooO00o) == 1;
        if (this.f16771Oooo0O0) {
            return (z ? o0000O0O.o00Ooo.f33597OooO0Oo : o0000O0O.o00Ooo.f33596OooO0OO).OooO0O0(charSequence, charSequence.length());
        }
        return z;
    }

    public final void OooO0OO(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        StaticLayout staticLayoutOooO00o;
        Layout.Alignment alignment;
        if (this.f16769Oooo00O == null) {
            return;
        }
        float fWidth = this.f16743OooO0oo.width();
        float fWidth2 = this.f16742OooO0oO.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f16748OooOOO0;
            f3 = this.f16791OooooOo;
            this.f16774Oooo0o0 = 1.0f;
            typeface = this.f16758OooOo0o;
        } else {
            float f4 = this.f16746OooOO0o;
            float f5 = this.f16793Oooooo0;
            Typeface typeface2 = this.f16759OooOoO;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f16774Oooo0o0 = 1.0f;
            } else {
                this.f16774Oooo0o0 = OooO0oO(this.f16746OooOO0o, this.f16748OooOOO0, f, this.f16782OoooOOO) / this.f16746OooOO0o;
            }
            float f6 = this.f16748OooOOO0 / this.f16746OooOO0o;
            fWidth = (!z && fWidth2 * f6 > fWidth) ? Math.min(fWidth / f6, fWidth2) : fWidth2;
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f16777OoooO;
        if (fWidth > 0.0f) {
            boolean z3 = this.f16773Oooo0o != f2;
            boolean z4 = this.f16792Oooooo != f3;
            boolean z5 = this.f16762OooOoo != typeface;
            StaticLayout staticLayout = this.f16794OoooooO;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f16780OoooO0O;
            this.f16773Oooo0o = f2;
            this.f16792Oooooo = f3;
            this.f16762OooOoo = typeface;
            this.f16780OoooO0O = false;
            textPaint.setLinearText(this.f16774Oooo0o0 != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f16770Oooo00o == null || z2) {
            textPaint.setTextSize(this.f16773Oooo0o);
            textPaint.setTypeface(this.f16762OooOoo);
            textPaint.setLetterSpacing(this.f16792Oooooo);
            boolean zOooO0O0 = OooO0O0(this.f16769Oooo00O);
            this.f16767Oooo0 = zOooO0O0;
            int i = this.f16798o00Oo0;
            if (!(i > 1 && (!zOooO0O0 || this.f16738OooO0OO))) {
                i = 1;
            }
            try {
                if (i == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f16744OooOO0, zOooO0O0 ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        alignment = this.f16767Oooo0 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = this.f16767Oooo0 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    }
                }
                o00O0O o00o0o2 = new o00O0O(this.f16769Oooo00O, textPaint, (int) fWidth);
                o00o0o2.f16839OooOO0o = this.f16768Oooo000;
                o00o0o2.f16838OooOO0O = zOooO0O0;
                o00o0o2.f16834OooO0o0 = alignment;
                o00o0o2.f16837OooOO0 = false;
                o00o0o2.f16833OooO0o = i;
                float f7 = this.f16799o00Ooo;
                float f8 = this.f16800o00o0O;
                o00o0o2.f16835OooO0oO = f7;
                o00o0o2.f16836OooO0oo = f8;
                o00o0o2.f16828OooO = this.f16801o00ooo;
                staticLayoutOooO00o = o00o0o2.OooO00o();
            } catch (o00O0O.OooO00o e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayoutOooO00o = null;
            }
            staticLayoutOooO00o.getClass();
            this.f16794OoooooO = staticLayoutOooO00o;
            this.f16770Oooo00o = staticLayoutOooO00o.getText();
        }
    }

    public final void OooO0Oo(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.f16770Oooo00o != null) {
            RectF rectF = this.f16735OooO;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.f16777OoooO;
            textPaint.setTextSize(this.f16773Oooo0o);
            float f = this.f16755OooOo0;
            float f2 = this.f16757OooOo0O;
            float f3 = this.f16774Oooo0o0;
            if (f3 != 1.0f && !this.f16738OooO0OO) {
                canvas.scale(f3, f3, f, f2);
            }
            boolean z = true;
            if (this.f16798o00Oo0 <= 1 || (this.f16767Oooo0 && !this.f16738OooO0OO)) {
                z = false;
            }
            if (!z || (this.f16738OooO0OO && this.f16737OooO0O0 <= this.f16741OooO0o0)) {
                canvas.translate(f, f2);
                this.f16794OoooooO.draw(canvas);
            } else {
                float lineStart = this.f16755OooOo0 - this.f16794OoooooO.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f2);
                if (!this.f16738OooO0OO) {
                    textPaint.setAlpha((int) (this.f16803ooOO * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.f16775Oooo0oO, this.f16776Oooo0oo, this.f16766Oooo, p274o0O000oo.OooOOO0.OooO00o(this.f16779OoooO00, textPaint.getAlpha()));
                    }
                    this.f16794OoooooO.draw(canvas);
                }
                if (!this.f16738OooO0OO) {
                    textPaint.setAlpha((int) (this.f16802o0OoOo0 * alpha));
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f16775Oooo0oO, this.f16776Oooo0oo, this.f16766Oooo, p274o0O000oo.OooOOO0.OooO00o(this.f16779OoooO00, textPaint.getAlpha()));
                }
                int lineBaseline = this.f16794OoooooO.getLineBaseline(0);
                CharSequence charSequence = this.f16797o00O0O;
                float f4 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, textPaint);
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f16775Oooo0oO, this.f16776Oooo0oo, this.f16766Oooo, this.f16779OoooO00);
                }
                if (!this.f16738OooO0OO) {
                    String strTrim = this.f16797o00O0O.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f16794OoooooO.getLineEnd(0), str.length()), 0.0f, f4, (Paint) textPaint);
                }
            }
            canvas.restoreToCount(iSave);
        }
    }

    @ColorInt
    public final int OooO0o(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f16778OoooO0;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final float OooO0o0() {
        TextPaint textPaint = this.f16781OoooOO0;
        textPaint.setTextSize(this.f16748OooOOO0);
        textPaint.setTypeface(this.f16758OooOo0o);
        textPaint.setLetterSpacing(this.f16791OooooOo);
        return -textPaint.ascent();
    }

    public final void OooO0oo(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f16760OooOoO0;
            if (typeface != null) {
                this.f16754OooOo = p276o0O00OoO.OooOOO.OooO00o(configuration, typeface);
            }
            Typeface typeface2 = this.f16763OooOoo0;
            if (typeface2 != null) {
                this.f16761OooOoOO = p276o0O00OoO.OooOOO.OooO00o(configuration, typeface2);
            }
            Typeface typeface3 = this.f16754OooOo;
            if (typeface3 == null) {
                typeface3 = this.f16760OooOoO0;
            }
            this.f16758OooOo0o = typeface3;
            Typeface typeface4 = this.f16761OooOoOO;
            if (typeface4 == null) {
                typeface4 = this.f16763OooOoo0;
            }
            this.f16759OooOoO = typeface4;
            OooO(true);
        }
    }

    public final void OooOO0(@Nullable ColorStateList colorStateList) {
        if (this.f16749OooOOOO == colorStateList && this.f16747OooOOO == colorStateList) {
            return;
        }
        this.f16749OooOOOO = colorStateList;
        this.f16747OooOOO = colorStateList;
        OooO(false);
    }

    public final void OooOO0O(int i) {
        View view = this.f16736OooO00o;
        p276o0O00OoO.OooO oooO = new p276o0O00OoO.OooO(view.getContext(), i);
        ColorStateList colorStateList = oooO.f41017OooOO0;
        if (colorStateList != null) {
            this.f16749OooOOOO = colorStateList;
        }
        float f = oooO.f41018OooOO0O;
        if (f != 0.0f) {
            this.f16748OooOOO0 = f;
        }
        ColorStateList colorStateList2 = oooO.f41009OooO00o;
        if (colorStateList2 != null) {
            this.f16786OoooOoo = colorStateList2;
        }
        this.f16784OoooOo0 = oooO.f41014OooO0o0;
        this.f16785OoooOoO = oooO.f41013OooO0o;
        this.f16783OoooOOo = oooO.f41015OooO0oO;
        this.f16791OooooOo = oooO.f41008OooO;
        p276o0O00OoO.OooO0O0 oooO0O0 = this.f16765OooOooo;
        if (oooO0O0 != null) {
            oooO0O0.f41026OooO0OO = true;
        }
        OooO00o oooO00o = new OooO00o();
        oooO.OooO00o();
        this.f16765OooOooo = new p276o0O00OoO.OooO0O0(oooO00o, oooO.f41020OooOOO);
        oooO.OooO0OO(view.getContext(), this.f16765OooOooo);
        OooO(false);
    }

    public final void OooOO0o(int i) {
        if (this.f16745OooOO0O != i) {
            this.f16745OooOO0O = i;
            OooO(false);
        }
    }

    public final void OooOOO(int i) {
        View view = this.f16736OooO00o;
        p276o0O00OoO.OooO oooO = new p276o0O00OoO.OooO(view.getContext(), i);
        ColorStateList colorStateList = oooO.f41017OooOO0;
        if (colorStateList != null) {
            this.f16747OooOOO = colorStateList;
        }
        float f = oooO.f41018OooOO0O;
        if (f != 0.0f) {
            this.f16746OooOO0o = f;
        }
        ColorStateList colorStateList2 = oooO.f41009OooO00o;
        if (colorStateList2 != null) {
            this.f16790OooooOO = colorStateList2;
        }
        this.f16788Ooooo0o = oooO.f41014OooO0o0;
        this.f16789OooooO0 = oooO.f41013OooO0o;
        this.f16787Ooooo00 = oooO.f41015OooO0oO;
        this.f16793Oooooo0 = oooO.f41008OooO;
        p276o0O00OoO.OooO0O0 oooO0O0 = this.f16764OooOooO;
        if (oooO0O0 != null) {
            oooO0O0.f41026OooO0OO = true;
        }
        OooO0O0 oooO0O1 = new OooO0O0();
        oooO.OooO00o();
        this.f16764OooOooO = new p276o0O00OoO.OooO0O0(oooO0O1, oooO.f41020OooOOO);
        oooO.OooO0OO(view.getContext(), this.f16764OooOooO);
        OooO(false);
    }

    public final boolean OooOOO0(Typeface typeface) {
        p276o0O00OoO.OooO0O0 oooO0O0 = this.f16765OooOooo;
        if (oooO0O0 != null) {
            oooO0O0.f41026OooO0OO = true;
        }
        if (this.f16760OooOoO0 == typeface) {
            return false;
        }
        this.f16760OooOoO0 = typeface;
        Typeface typefaceOooO00o = p276o0O00OoO.OooOOO.OooO00o(this.f16736OooO00o.getContext().getResources().getConfiguration(), typeface);
        this.f16754OooOo = typefaceOooO00o;
        if (typefaceOooO00o == null) {
            typefaceOooO00o = this.f16760OooOoO0;
        }
        this.f16758OooOo0o = typefaceOooO00o;
        return true;
    }

    public final boolean OooOOOO(Typeface typeface) {
        p276o0O00OoO.OooO0O0 oooO0O0 = this.f16764OooOooO;
        if (oooO0O0 != null) {
            oooO0O0.f41026OooO0OO = true;
        }
        if (this.f16763OooOoo0 == typeface) {
            return false;
        }
        this.f16763OooOoo0 = typeface;
        Typeface typefaceOooO00o = p276o0O00OoO.OooOOO.OooO00o(this.f16736OooO00o.getContext().getResources().getConfiguration(), typeface);
        this.f16761OooOoOO = typefaceOooO00o;
        if (typefaceOooO00o == null) {
            typefaceOooO00o = this.f16763OooOoo0;
        }
        this.f16759OooOoO = typefaceOooO00o;
        return true;
    }

    public final void OooOOOo(float f) {
        float f2;
        float fOooO00o = o0000O00.OooO00o.OooO00o(f, 0.0f, 1.0f);
        if (fOooO00o != this.f16737OooO0O0) {
            this.f16737OooO0O0 = fOooO00o;
            boolean z = this.f16738OooO0OO;
            RectF rectF = this.f16735OooO;
            Rect rect = this.f16743OooO0oo;
            Rect rect2 = this.f16742OooO0oO;
            if (z) {
                if (fOooO00o < this.f16741OooO0o0) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = OooO0oO(rect2.left, rect.left, fOooO00o, this.f16796o000oOoO);
                rectF.top = OooO0oO(this.f16752OooOOo0, this.f16751OooOOo, fOooO00o, this.f16796o000oOoO);
                rectF.right = OooO0oO(rect2.right, rect.right, fOooO00o, this.f16796o000oOoO);
                rectF.bottom = OooO0oO(rect2.bottom, rect.bottom, fOooO00o, this.f16796o000oOoO);
            }
            if (!this.f16738OooO0OO) {
                this.f16755OooOo0 = OooO0oO(this.f16753OooOOoo, this.f16756OooOo00, fOooO00o, this.f16796o000oOoO);
                this.f16757OooOo0O = OooO0oO(this.f16752OooOOo0, this.f16751OooOOo, fOooO00o, this.f16796o000oOoO);
                OooOOo0(fOooO00o);
                f2 = fOooO00o;
            } else if (fOooO00o < this.f16741OooO0o0) {
                this.f16755OooOo0 = this.f16753OooOOoo;
                this.f16757OooOo0O = this.f16752OooOOo0;
                OooOOo0(0.0f);
                f2 = 0.0f;
            } else {
                this.f16755OooOo0 = this.f16756OooOo00;
                this.f16757OooOo0O = this.f16751OooOOo - Math.max(0, this.f16740OooO0o);
                OooOOo0(1.0f);
                f2 = 1.0f;
            }
            p064o0000oO0.OooOO0 oooOO1 = o0O000.OooO0O0.f40881OooO0O0;
            this.f16802o0OoOo0 = 1.0f - OooO0oO(0.0f, 1.0f, 1.0f - fOooO00o, oooOO1);
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            View view = this.f16736OooO00o;
            ViewCompat.OooO0o.OooOO0O(view);
            this.f16803ooOO = OooO0oO(1.0f, 0.0f, fOooO00o, oooOO1);
            ViewCompat.OooO0o.OooOO0O(view);
            ColorStateList colorStateList = this.f16749OooOOOO;
            ColorStateList colorStateList2 = this.f16747OooOOO;
            TextPaint textPaint = this.f16777OoooO;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(OooO00o(OooO0o(colorStateList2), f2, OooO0o(this.f16749OooOOOO)));
            } else {
                textPaint.setColor(OooO0o(colorStateList));
            }
            float f3 = this.f16791OooooOo;
            float f4 = this.f16793Oooooo0;
            if (f3 != f4) {
                textPaint.setLetterSpacing(OooO0oO(f4, f3, fOooO00o, oooOO1));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f16775Oooo0oO = OooO0oO(this.f16787Ooooo00, this.f16783OoooOOo, fOooO00o, null);
            this.f16776Oooo0oo = OooO0oO(this.f16788Ooooo0o, this.f16784OoooOo0, fOooO00o, null);
            this.f16766Oooo = OooO0oO(this.f16789OooooO0, this.f16785OoooOoO, fOooO00o, null);
            int iOooO00o = OooO00o(OooO0o(this.f16790OooooOO), fOooO00o, OooO0o(this.f16786OoooOoo));
            this.f16779OoooO00 = iOooO00o;
            textPaint.setShadowLayer(this.f16775Oooo0oO, this.f16776Oooo0oo, this.f16766Oooo, iOooO00o);
            if (this.f16738OooO0OO) {
                int alpha = textPaint.getAlpha();
                float f5 = this.f16741OooO0o0;
                textPaint.setAlpha((int) ((fOooO00o <= f5 ? o0O000.OooO0O0.OooO00o(1.0f, 0.0f, this.f16739OooO0Oo, f5, fOooO00o) : o0O000.OooO0O0.OooO00o(0.0f, 1.0f, f5, 1.0f, fOooO00o)) * alpha));
            }
            ViewCompat.OooO0o.OooOO0O(view);
        }
    }

    public final boolean OooOOo(int[] iArr) {
        ColorStateList colorStateList;
        this.f16778OoooO0 = iArr;
        ColorStateList colorStateList2 = this.f16749OooOOOO;
        if (!((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f16747OooOOO) != null && colorStateList.isStateful()))) {
            return false;
        }
        OooO(false);
        return true;
    }

    public final void OooOOo0(float f) {
        OooO0OO(f, false);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOO0O(this.f16736OooO00o);
    }
}
