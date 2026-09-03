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
import androidx.core.view.o000O0Oo;
import io.agora.rtc.Constants;
import java.util.WeakHashMap;
import p545o0oO0Ooo.a1;
import p545o0oO0Ooo.d1;
import p545o0oO0Ooo.h1;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final RectF f17208OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f17209OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f17210OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f17211OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f17212OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f17213OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f17214OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final Rect f17215OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final Rect f17216OooO0oo;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ColorStateList f17220OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ColorStateList f17222OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f17223OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f17224OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f17225OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f17226OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Typeface f17227OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f17228OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f17229OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f17230OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Typeface f17231OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Typeface f17232OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Typeface f17233OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Typeface f17234OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Typeface f17235OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Typeface f17236OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public a1 f17237OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public a1 f17238OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f17239Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f17240Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public CharSequence f17242Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public CharSequence f17243Oooo00o;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public Bitmap f17245Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f17246Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f17247Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f17248Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f17249Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NonNull
    public final TextPaint f17250OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int[] f17251OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f17252OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f17253OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NonNull
    public final TextPaint f17254OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TimeInterpolator f17255OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f17256OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f17257OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f17258OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ColorStateList f17259OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f17260Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f17261Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f17262OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ColorStateList f17263OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public float f17264OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f17265Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public float f17266Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public StaticLayout f17267OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public float f17268Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TimeInterpolator f17269o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public CharSequence f17270o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public float f17275o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public float f17276ooOO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f17217OooOO0 = 16;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f17218OooOO0O = 16;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f17219OooOO0o = 15.0f;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f17221OooOOO0 = 15.0f;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextUtils.TruncateAt f17241Oooo000 = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f17244Oooo0O0 = true;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f17271o00Oo0 = 1;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public float f17272o00Ooo = 0.0f;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public float f17273o00o0O = 1.0f;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f17274o00ooo = 1;

    public class OooO00o implements a1.OooO00o {
        public OooO00o() {
        }

        @Override // o0oO0Ooo.a1.OooO00o
        public final void OooO00o(Typeface typeface) {
            OooO0OO oooO0OO = OooO0OO.this;
            if (oooO0OO.OooOOO0(typeface)) {
                oooO0OO.OooO(false);
            }
        }
    }

    public class OooO0O0 implements a1.OooO00o {
        public OooO0O0() {
        }

        @Override // o0oO0Ooo.a1.OooO00o
        public final void OooO00o(Typeface typeface) {
            OooO0OO oooO0OO = OooO0OO.this;
            if (oooO0OO.OooOOOO(typeface)) {
                oooO0OO.OooO(false);
            }
        }
    }

    public OooO0OO(View view) {
        this.f17209OooO00o = view;
        TextPaint textPaint = new TextPaint(Constants.ERR_WATERMARK_READ);
        this.f17250OoooO = textPaint;
        this.f17254OoooOO0 = new TextPaint(textPaint);
        this.f17216OooO0oo = new Rect();
        this.f17215OooO0oO = new Rect();
        this.f17208OooO = new RectF();
        float f = this.f17212OooO0Oo;
        this.f17214OooO0o0 = OooOo.OooO0o.OooO00o(1.0f, f, 0.5f, f);
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
        LinearInterpolator linearInterpolator = o0O000.OooO0O0.f41571OooO00o;
        return OooOo.OooO0o.OooO00o(f2, f, f3, f);
    }

    public final void OooO(boolean z) {
        float fMeasureText;
        float f;
        StaticLayout staticLayout;
        View view = this.f17209OooO00o;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z) {
            return;
        }
        OooO0OO(1.0f, z);
        CharSequence charSequence = this.f17243Oooo00o;
        TextPaint textPaint = this.f17250OoooO;
        if (charSequence != null && (staticLayout = this.f17267OoooooO) != null) {
            this.f17270o00O0O = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f17241Oooo000);
        }
        CharSequence charSequence2 = this.f17270o00O0O;
        if (charSequence2 != null) {
            this.f17268Ooooooo = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f17268Ooooooo = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f17218OooOO0O, this.f17240Oooo0 ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f17216OooO0oo;
        if (i == 48) {
            this.f17224OooOOo = rect.top;
        } else if (i != 80) {
            this.f17224OooOOo = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f17224OooOOo = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f17229OooOo00 = rect.centerX() - (this.f17268Ooooooo / 2.0f);
        } else if (i2 != 5) {
            this.f17229OooOo00 = rect.left;
        } else {
            this.f17229OooOo00 = rect.right - this.f17268Ooooooo;
        }
        OooO0OO(0.0f, z);
        StaticLayout staticLayout2 = this.f17267OoooooO;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f17267OoooooO;
        if (staticLayout3 == null || this.f17271o00Oo0 <= 1) {
            CharSequence charSequence3 = this.f17243Oooo00o;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f17267OoooooO;
        this.f17223OooOOOo = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f17217OooOO0, this.f17240Oooo0 ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f17215OooO0oO;
        if (i3 == 48) {
            this.f17225OooOOo0 = rect2.top;
        } else if (i3 != 80) {
            this.f17225OooOOo0 = rect2.centerY() - (height / 2.0f);
        } else {
            this.f17225OooOOo0 = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f17226OooOOoo = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f17226OooOOoo = rect2.left;
        } else {
            this.f17226OooOOoo = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f17245Oooo0OO;
        if (bitmap != null) {
            bitmap.recycle();
            this.f17245Oooo0OO = null;
        }
        OooOOo0(this.f17210OooO0O0);
        float f2 = this.f17210OooO0O0;
        boolean z2 = this.f17211OooO0OO;
        RectF rectF = this.f17208OooO;
        if (z2) {
            if (f2 < this.f17214OooO0o0) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = OooO0oO(rect2.left, rect.left, f2, this.f17269o000oOoO);
            rectF.top = OooO0oO(this.f17225OooOOo0, this.f17224OooOOo, f2, this.f17269o000oOoO);
            rectF.right = OooO0oO(rect2.right, rect.right, f2, this.f17269o000oOoO);
            rectF.bottom = OooO0oO(rect2.bottom, rect.bottom, f2, this.f17269o000oOoO);
        }
        if (!this.f17211OooO0OO) {
            this.f17228OooOo0 = OooO0oO(this.f17226OooOOoo, this.f17229OooOo00, f2, this.f17269o000oOoO);
            this.f17230OooOo0O = OooO0oO(this.f17225OooOOo0, this.f17224OooOOo, f2, this.f17269o000oOoO);
            OooOOo0(f2);
            f = f2;
        } else if (f2 < this.f17214OooO0o0) {
            this.f17228OooOo0 = this.f17226OooOOoo;
            this.f17230OooOo0O = this.f17225OooOOo0;
            OooOOo0(0.0f);
            f = 0.0f;
        } else {
            this.f17228OooOo0 = this.f17229OooOo00;
            this.f17230OooOo0O = this.f17224OooOOo - Math.max(0, this.f17213OooO0o);
            OooOOo0(1.0f);
            f = 1.0f;
        }
        p064o0000oO0.OooOO0 oooOO1 = o0O000.OooO0O0.f41572OooO0O0;
        this.f17275o0OoOo0 = 1.0f - OooO0oO(0.0f, 1.0f, 1.0f - f2, oooOO1);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOO0O(view);
        this.f17276ooOO = OooO0oO(1.0f, 0.0f, f2, oooOO1);
        ViewCompat.OooO0o.OooOO0O(view);
        ColorStateList colorStateList = this.f17222OooOOOO;
        ColorStateList colorStateList2 = this.f17220OooOOO;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(OooO00o(OooO0o(colorStateList2), f, OooO0o(this.f17222OooOOOO)));
        } else {
            textPaint.setColor(OooO0o(colorStateList));
        }
        float f3 = this.f17264OooooOo;
        float f4 = this.f17266Oooooo0;
        if (f3 != f4) {
            textPaint.setLetterSpacing(OooO0oO(f4, f3, f2, oooOO1));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.f17248Oooo0oO = OooO0oO(this.f17260Ooooo00, this.f17256OoooOOo, f2, null);
        this.f17249Oooo0oo = OooO0oO(this.f17261Ooooo0o, this.f17257OoooOo0, f2, null);
        this.f17239Oooo = OooO0oO(this.f17262OooooO0, this.f17258OoooOoO, f2, null);
        int iOooO00o = OooO00o(OooO0o(this.f17263OooooOO), f2, OooO0o(this.f17259OoooOoo));
        this.f17252OoooO00 = iOooO00o;
        textPaint.setShadowLayer(this.f17248Oooo0oO, this.f17249Oooo0oo, this.f17239Oooo, iOooO00o);
        if (this.f17211OooO0OO) {
            int alpha = textPaint.getAlpha();
            float f5 = this.f17214OooO0o0;
            textPaint.setAlpha((int) ((f2 <= f5 ? o0O000.OooO0O0.OooO00o(1.0f, 0.0f, this.f17212OooO0Oo, f5, f2) : o0O000.OooO0O0.OooO00o(0.0f, 1.0f, f5, 1.0f, f2)) * alpha));
        }
        ViewCompat.OooO0o.OooOO0O(view);
    }

    public final boolean OooO0O0(@NonNull CharSequence charSequence) {
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(this.f17209OooO00o) == 1;
        if (this.f17244Oooo0O0) {
            return (z ? o0000O0O.o00Ooo.f34110OooO0Oo : o0000O0O.o00Ooo.f34109OooO0OO).OooO0O0(charSequence, charSequence.length());
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
        if (this.f17242Oooo00O == null) {
            return;
        }
        float fWidth = this.f17216OooO0oo.width();
        float fWidth2 = this.f17215OooO0oO.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f17221OooOOO0;
            f3 = this.f17264OooooOo;
            this.f17247Oooo0o0 = 1.0f;
            typeface = this.f17231OooOo0o;
        } else {
            float f4 = this.f17219OooOO0o;
            float f5 = this.f17266Oooooo0;
            Typeface typeface2 = this.f17232OooOoO;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f17247Oooo0o0 = 1.0f;
            } else {
                this.f17247Oooo0o0 = OooO0oO(this.f17219OooOO0o, this.f17221OooOOO0, f, this.f17255OoooOOO) / this.f17219OooOO0o;
            }
            float f6 = this.f17221OooOOO0 / this.f17219OooOO0o;
            fWidth = (!z && fWidth2 * f6 > fWidth) ? Math.min(fWidth / f6, fWidth2) : fWidth2;
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f17250OoooO;
        if (fWidth > 0.0f) {
            boolean z3 = this.f17246Oooo0o != f2;
            boolean z4 = this.f17265Oooooo != f3;
            boolean z5 = this.f17235OooOoo != typeface;
            StaticLayout staticLayout = this.f17267OoooooO;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f17253OoooO0O;
            this.f17246Oooo0o = f2;
            this.f17265Oooooo = f3;
            this.f17235OooOoo = typeface;
            this.f17253OoooO0O = false;
            textPaint.setLinearText(this.f17247Oooo0o0 != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f17243Oooo00o == null || z2) {
            textPaint.setTextSize(this.f17246Oooo0o);
            textPaint.setTypeface(this.f17235OooOoo);
            textPaint.setLetterSpacing(this.f17265Oooooo);
            boolean zOooO0O0 = OooO0O0(this.f17242Oooo00O);
            this.f17240Oooo0 = zOooO0O0;
            int i = this.f17271o00Oo0;
            if (!(i > 1 && (!zOooO0O0 || this.f17211OooO0OO))) {
                i = 1;
            }
            try {
                if (i == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f17217OooOO0, zOooO0O0 ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        alignment = this.f17240Oooo0 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = this.f17240Oooo0 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    }
                }
                o00O0O o00o0o2 = new o00O0O(this.f17242Oooo00O, textPaint, (int) fWidth);
                o00o0o2.f17312OooOO0o = this.f17241Oooo000;
                o00o0o2.f17311OooOO0O = zOooO0O0;
                o00o0o2.f17307OooO0o0 = alignment;
                o00o0o2.f17310OooOO0 = false;
                o00o0o2.f17306OooO0o = i;
                float f7 = this.f17272o00Ooo;
                float f8 = this.f17273o00o0O;
                o00o0o2.f17308OooO0oO = f7;
                o00o0o2.f17309OooO0oo = f8;
                o00o0o2.f17301OooO = this.f17274o00ooo;
                staticLayoutOooO00o = o00o0o2.OooO00o();
            } catch (o00O0O.OooO00o e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayoutOooO00o = null;
            }
            staticLayoutOooO00o.getClass();
            this.f17267OoooooO = staticLayoutOooO00o;
            this.f17243Oooo00o = staticLayoutOooO00o.getText();
        }
    }

    public final void OooO0Oo(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.f17243Oooo00o != null) {
            RectF rectF = this.f17208OooO;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.f17250OoooO;
            textPaint.setTextSize(this.f17246Oooo0o);
            float f = this.f17228OooOo0;
            float f2 = this.f17230OooOo0O;
            float f3 = this.f17247Oooo0o0;
            if (f3 != 1.0f && !this.f17211OooO0OO) {
                canvas.scale(f3, f3, f, f2);
            }
            boolean z = true;
            if (this.f17271o00Oo0 <= 1 || (this.f17240Oooo0 && !this.f17211OooO0OO)) {
                z = false;
            }
            if (!z || (this.f17211OooO0OO && this.f17210OooO0O0 <= this.f17214OooO0o0)) {
                canvas.translate(f, f2);
                this.f17267OoooooO.draw(canvas);
            } else {
                float lineStart = this.f17228OooOo0 - this.f17267OoooooO.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f2);
                if (!this.f17211OooO0OO) {
                    textPaint.setAlpha((int) (this.f17276ooOO * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.f17248Oooo0oO, this.f17249Oooo0oo, this.f17239Oooo, p272o0O000oo.OooOOO.OooO00o(this.f17252OoooO00, textPaint.getAlpha()));
                    }
                    this.f17267OoooooO.draw(canvas);
                }
                if (!this.f17211OooO0OO) {
                    textPaint.setAlpha((int) (this.f17275o0OoOo0 * alpha));
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f17248Oooo0oO, this.f17249Oooo0oo, this.f17239Oooo, p272o0O000oo.OooOOO.OooO00o(this.f17252OoooO00, textPaint.getAlpha()));
                }
                int lineBaseline = this.f17267OoooooO.getLineBaseline(0);
                CharSequence charSequence = this.f17270o00O0O;
                float f4 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, textPaint);
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f17248Oooo0oO, this.f17249Oooo0oo, this.f17239Oooo, this.f17252OoooO00);
                }
                if (!this.f17211OooO0OO) {
                    String strTrim = this.f17270o00O0O.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f17267OoooooO.getLineEnd(0), str.length()), 0.0f, f4, (Paint) textPaint);
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
        int[] iArr = this.f17251OoooO0;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final float OooO0o0() {
        TextPaint textPaint = this.f17254OoooOO0;
        textPaint.setTextSize(this.f17221OooOOO0);
        textPaint.setTypeface(this.f17231OooOo0o);
        textPaint.setLetterSpacing(this.f17264OooooOo);
        return -textPaint.ascent();
    }

    public final void OooO0oo(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f17233OooOoO0;
            if (typeface != null) {
                this.f17227OooOo = h1.OooO00o(configuration, typeface);
            }
            Typeface typeface2 = this.f17236OooOoo0;
            if (typeface2 != null) {
                this.f17234OooOoOO = h1.OooO00o(configuration, typeface2);
            }
            Typeface typeface3 = this.f17227OooOo;
            if (typeface3 == null) {
                typeface3 = this.f17233OooOoO0;
            }
            this.f17231OooOo0o = typeface3;
            Typeface typeface4 = this.f17234OooOoOO;
            if (typeface4 == null) {
                typeface4 = this.f17236OooOoo0;
            }
            this.f17232OooOoO = typeface4;
            OooO(true);
        }
    }

    public final void OooOO0(@Nullable ColorStateList colorStateList) {
        if (this.f17222OooOOOO == colorStateList && this.f17220OooOOO == colorStateList) {
            return;
        }
        this.f17222OooOOOO = colorStateList;
        this.f17220OooOOO = colorStateList;
        OooO(false);
    }

    public final void OooOO0O(int i) {
        View view = this.f17209OooO00o;
        d1 d1Var = new d1(view.getContext(), i);
        ColorStateList colorStateList = d1Var.f55821OooOO0;
        if (colorStateList != null) {
            this.f17222OooOOOO = colorStateList;
        }
        float f = d1Var.f55822OooOO0O;
        if (f != 0.0f) {
            this.f17221OooOOO0 = f;
        }
        ColorStateList colorStateList2 = d1Var.f55813OooO00o;
        if (colorStateList2 != null) {
            this.f17259OoooOoo = colorStateList2;
        }
        this.f17257OoooOo0 = d1Var.f55818OooO0o0;
        this.f17258OoooOoO = d1Var.f55817OooO0o;
        this.f17256OoooOOo = d1Var.f55819OooO0oO;
        this.f17264OooooOo = d1Var.f55812OooO;
        a1 a1Var = this.f17238OooOooo;
        if (a1Var != null) {
            a1Var.f55811OooO0OO = true;
        }
        OooO00o oooO00o = new OooO00o();
        d1Var.OooO00o();
        this.f17238OooOooo = new a1(oooO00o, d1Var.f55824OooOOO);
        d1Var.OooO0OO(view.getContext(), this.f17238OooOooo);
        OooO(false);
    }

    public final void OooOO0o(int i) {
        if (this.f17218OooOO0O != i) {
            this.f17218OooOO0O = i;
            OooO(false);
        }
    }

    public final void OooOOO(int i) {
        View view = this.f17209OooO00o;
        d1 d1Var = new d1(view.getContext(), i);
        ColorStateList colorStateList = d1Var.f55821OooOO0;
        if (colorStateList != null) {
            this.f17220OooOOO = colorStateList;
        }
        float f = d1Var.f55822OooOO0O;
        if (f != 0.0f) {
            this.f17219OooOO0o = f;
        }
        ColorStateList colorStateList2 = d1Var.f55813OooO00o;
        if (colorStateList2 != null) {
            this.f17263OooooOO = colorStateList2;
        }
        this.f17261Ooooo0o = d1Var.f55818OooO0o0;
        this.f17262OooooO0 = d1Var.f55817OooO0o;
        this.f17260Ooooo00 = d1Var.f55819OooO0oO;
        this.f17266Oooooo0 = d1Var.f55812OooO;
        a1 a1Var = this.f17237OooOooO;
        if (a1Var != null) {
            a1Var.f55811OooO0OO = true;
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        d1Var.OooO00o();
        this.f17237OooOooO = new a1(oooO0O0, d1Var.f55824OooOOO);
        d1Var.OooO0OO(view.getContext(), this.f17237OooOooO);
        OooO(false);
    }

    public final boolean OooOOO0(Typeface typeface) {
        a1 a1Var = this.f17238OooOooo;
        if (a1Var != null) {
            a1Var.f55811OooO0OO = true;
        }
        if (this.f17233OooOoO0 == typeface) {
            return false;
        }
        this.f17233OooOoO0 = typeface;
        Typeface typefaceOooO00o = h1.OooO00o(this.f17209OooO00o.getContext().getResources().getConfiguration(), typeface);
        this.f17227OooOo = typefaceOooO00o;
        if (typefaceOooO00o == null) {
            typefaceOooO00o = this.f17233OooOoO0;
        }
        this.f17231OooOo0o = typefaceOooO00o;
        return true;
    }

    public final boolean OooOOOO(Typeface typeface) {
        a1 a1Var = this.f17237OooOooO;
        if (a1Var != null) {
            a1Var.f55811OooO0OO = true;
        }
        if (this.f17236OooOoo0 == typeface) {
            return false;
        }
        this.f17236OooOoo0 = typeface;
        Typeface typefaceOooO00o = h1.OooO00o(this.f17209OooO00o.getContext().getResources().getConfiguration(), typeface);
        this.f17234OooOoOO = typefaceOooO00o;
        if (typefaceOooO00o == null) {
            typefaceOooO00o = this.f17236OooOoo0;
        }
        this.f17232OooOoO = typefaceOooO00o;
        return true;
    }

    public final void OooOOOo(float f) {
        float f2;
        float fOooO00o = o0000O00.OooO00o.OooO00o(f, 0.0f, 1.0f);
        if (fOooO00o != this.f17210OooO0O0) {
            this.f17210OooO0O0 = fOooO00o;
            boolean z = this.f17211OooO0OO;
            RectF rectF = this.f17208OooO;
            Rect rect = this.f17216OooO0oo;
            Rect rect2 = this.f17215OooO0oO;
            if (z) {
                if (fOooO00o < this.f17214OooO0o0) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = OooO0oO(rect2.left, rect.left, fOooO00o, this.f17269o000oOoO);
                rectF.top = OooO0oO(this.f17225OooOOo0, this.f17224OooOOo, fOooO00o, this.f17269o000oOoO);
                rectF.right = OooO0oO(rect2.right, rect.right, fOooO00o, this.f17269o000oOoO);
                rectF.bottom = OooO0oO(rect2.bottom, rect.bottom, fOooO00o, this.f17269o000oOoO);
            }
            if (!this.f17211OooO0OO) {
                this.f17228OooOo0 = OooO0oO(this.f17226OooOOoo, this.f17229OooOo00, fOooO00o, this.f17269o000oOoO);
                this.f17230OooOo0O = OooO0oO(this.f17225OooOOo0, this.f17224OooOOo, fOooO00o, this.f17269o000oOoO);
                OooOOo0(fOooO00o);
                f2 = fOooO00o;
            } else if (fOooO00o < this.f17214OooO0o0) {
                this.f17228OooOo0 = this.f17226OooOOoo;
                this.f17230OooOo0O = this.f17225OooOOo0;
                OooOOo0(0.0f);
                f2 = 0.0f;
            } else {
                this.f17228OooOo0 = this.f17229OooOo00;
                this.f17230OooOo0O = this.f17224OooOOo - Math.max(0, this.f17213OooO0o);
                OooOOo0(1.0f);
                f2 = 1.0f;
            }
            p064o0000oO0.OooOO0 oooOO1 = o0O000.OooO0O0.f41572OooO0O0;
            this.f17275o0OoOo0 = 1.0f - OooO0oO(0.0f, 1.0f, 1.0f - fOooO00o, oooOO1);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            View view = this.f17209OooO00o;
            ViewCompat.OooO0o.OooOO0O(view);
            this.f17276ooOO = OooO0oO(1.0f, 0.0f, fOooO00o, oooOO1);
            ViewCompat.OooO0o.OooOO0O(view);
            ColorStateList colorStateList = this.f17222OooOOOO;
            ColorStateList colorStateList2 = this.f17220OooOOO;
            TextPaint textPaint = this.f17250OoooO;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(OooO00o(OooO0o(colorStateList2), f2, OooO0o(this.f17222OooOOOO)));
            } else {
                textPaint.setColor(OooO0o(colorStateList));
            }
            float f3 = this.f17264OooooOo;
            float f4 = this.f17266Oooooo0;
            if (f3 != f4) {
                textPaint.setLetterSpacing(OooO0oO(f4, f3, fOooO00o, oooOO1));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f17248Oooo0oO = OooO0oO(this.f17260Ooooo00, this.f17256OoooOOo, fOooO00o, null);
            this.f17249Oooo0oo = OooO0oO(this.f17261Ooooo0o, this.f17257OoooOo0, fOooO00o, null);
            this.f17239Oooo = OooO0oO(this.f17262OooooO0, this.f17258OoooOoO, fOooO00o, null);
            int iOooO00o = OooO00o(OooO0o(this.f17263OooooOO), fOooO00o, OooO0o(this.f17259OoooOoo));
            this.f17252OoooO00 = iOooO00o;
            textPaint.setShadowLayer(this.f17248Oooo0oO, this.f17249Oooo0oo, this.f17239Oooo, iOooO00o);
            if (this.f17211OooO0OO) {
                int alpha = textPaint.getAlpha();
                float f5 = this.f17214OooO0o0;
                textPaint.setAlpha((int) ((fOooO00o <= f5 ? o0O000.OooO0O0.OooO00o(1.0f, 0.0f, this.f17212OooO0Oo, f5, fOooO00o) : o0O000.OooO0O0.OooO00o(0.0f, 1.0f, f5, 1.0f, fOooO00o)) * alpha));
            }
            ViewCompat.OooO0o.OooOO0O(view);
        }
    }

    public final boolean OooOOo(int[] iArr) {
        ColorStateList colorStateList;
        this.f17251OoooO0 = iArr;
        ColorStateList colorStateList2 = this.f17222OooOOOO;
        if (!((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f17220OooOOO) != null && colorStateList.isStateful()))) {
            return false;
        }
        OooO(false);
        return true;
    }

    public final void OooOOo0(float f) {
        OooO0OO(f, false);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOO0O(this.f17209OooO00o);
    }
}
