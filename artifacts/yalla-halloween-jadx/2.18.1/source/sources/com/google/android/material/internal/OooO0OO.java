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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final Rect f17207OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f17208OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f17209OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f17210OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f17211OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f17212OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f17213OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f17214OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final Rect f17215OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final RectF f17216OooOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ColorStateList f17221OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public ColorStateList f17222OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f17223OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f17224OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f17225OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Typeface f17226OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f17227OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f17228OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f17229OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f17230OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Typeface f17231OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Typeface f17232OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Typeface f17233OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Typeface f17234OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Typeface f17235OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Typeface f17236OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public o0OOO0O.OooO00o f17237OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f17238Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f17239Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public o0OOO0O.OooO00o f17240Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public CharSequence f17241Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public CharSequence f17242Oooo00o;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public Bitmap f17244Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f17245Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f17246Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f17247Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f17248Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NonNull
    public final TextPaint f17249OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int[] f17250OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f17251OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f17252OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NonNull
    public final TextPaint f17253OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TimeInterpolator f17254OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f17255OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f17256OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f17257OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ColorStateList f17258OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f17259Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f17260Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f17261OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ColorStateList f17262OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public float f17263OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f17264Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public float f17265Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public StaticLayout f17266OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public float f17267Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TimeInterpolator f17268o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public CharSequence f17269o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public float f17274o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public float f17275ooOO;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f17217OooOO0O = 16;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f17218OooOO0o = 16;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f17220OooOOO0 = 15.0f;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f17219OooOOO = 15.0f;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f17243Oooo0O0 = true;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f17270o00Oo0 = 1;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public float f17271o00Ooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public float f17272o00o0O = 1.0f;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f17273o00ooo = OooOo00.f17332OooOOO0;

    public class OooO00o implements o0OOO0O.OooO00o.InterfaceC0374OooO00o {
        public OooO00o() {
        }

        @Override // o0OOO0O.OooO00o.InterfaceC0374OooO00o
        public final void OooO00o(Typeface typeface) {
            OooO0OO oooO0OO = OooO0OO.this;
            if (oooO0OO.OooOOo(typeface)) {
                oooO0OO.OooOOO0(false);
            }
        }
    }

    public class OooO0O0 implements o0OOO0O.OooO00o.InterfaceC0374OooO00o {
        public OooO0O0() {
        }

        @Override // o0OOO0O.OooO00o.InterfaceC0374OooO00o
        public final void OooO00o(Typeface typeface) {
            OooO0OO oooO0OO = OooO0OO.this;
            if (oooO0OO.OooOo0o(typeface)) {
                oooO0OO.OooOOO0(false);
            }
        }
    }

    public OooO0OO(View view) {
        this.f17208OooO00o = view;
        TextPaint textPaint = new TextPaint(Constants.ERR_WATERMARK_READ);
        this.f17249OoooO = textPaint;
        this.f17253OoooOO0 = new TextPaint(textPaint);
        this.f17207OooO = new Rect();
        this.f17215OooO0oo = new Rect();
        this.f17216OooOO0 = new RectF();
        float f = this.f17213OooO0o0;
        this.f17212OooO0o = Oooo000.OooO00o.OooO00o(1.0f, f, 0.5f, f);
        OooOO0O(view.getContext().getResources().getConfiguration());
    }

    @ColorInt
    public static int OooO00o(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float OooOO0(float f, float f2, float f3, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = p338o0OO0o0O.OooO0o.f37972OooO00o;
        return Oooo000.OooO00o.OooO00o(f2, f, f3, f);
    }

    @ColorInt
    public final int OooO(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f17250OoooO0;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final boolean OooO0O0(@NonNull CharSequence charSequence) {
        View view = this.f17208OooO00o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(view) == 1;
        if (this.f17243Oooo0O0) {
            return (z ? o000O0Oo.OooO0o.f28157OooO0Oo : o000O0Oo.OooO0o.f28156OooO0OO).OooO0O0(charSequence, charSequence.length());
        }
        return z;
    }

    public final void OooO0OO(float f) {
        float f2;
        if (this.f17211OooO0Oo) {
            this.f17216OooOO0.set(f < this.f17212OooO0o ? this.f17215OooO0oo : this.f17207OooO);
        } else {
            this.f17216OooOO0.left = OooOO0(this.f17215OooO0oo.left, this.f17207OooO.left, f, this.f17268o000oOoO);
            this.f17216OooOO0.top = OooOO0(this.f17223OooOOo, this.f17225OooOOoo, f, this.f17268o000oOoO);
            this.f17216OooOO0.right = OooOO0(this.f17215OooO0oo.right, this.f17207OooO.right, f, this.f17268o000oOoO);
            this.f17216OooOO0.bottom = OooOO0(this.f17215OooO0oo.bottom, this.f17207OooO.bottom, f, this.f17268o000oOoO);
        }
        if (!this.f17211OooO0Oo) {
            this.f17229OooOo0O = OooOO0(this.f17228OooOo00, this.f17227OooOo0, f, this.f17268o000oOoO);
            this.f17230OooOo0o = OooOO0(this.f17223OooOOo, this.f17225OooOOoo, f, this.f17268o000oOoO);
            OooOoO0(f);
            f2 = f;
        } else if (f < this.f17212OooO0o) {
            this.f17229OooOo0O = this.f17228OooOo00;
            this.f17230OooOo0o = this.f17223OooOOo;
            OooOoO0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            this.f17229OooOo0O = this.f17227OooOo0;
            this.f17230OooOo0o = this.f17225OooOOoo - Math.max(0, this.f17214OooO0oO);
            OooOoO0(1.0f);
            f2 = 1.0f;
        }
        p077o000Oo.OooO0OO oooO0OO = p338o0OO0o0O.OooO0o.f37973OooO0O0;
        this.f17274o0OoOo0 = 1.0f - OooOO0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0f - f, oooO0OO);
        View view = this.f17208OooO00o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOO0O(view);
        this.f17275ooOO = OooOO0(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, oooO0OO);
        ViewCompat.OooO0o.OooOO0O(this.f17208OooO00o);
        ColorStateList colorStateList = this.f17222OooOOOo;
        ColorStateList colorStateList2 = this.f17221OooOOOO;
        if (colorStateList != colorStateList2) {
            this.f17249OoooO.setColor(OooO00o(OooO(colorStateList2), OooO0oo(), f2));
        } else {
            this.f17249OoooO.setColor(OooO0oo());
        }
        float f3 = this.f17263OooooOo;
        float f4 = this.f17265Oooooo0;
        if (f3 != f4) {
            this.f17249OoooO.setLetterSpacing(OooOO0(f4, f3, f, oooO0OO));
        } else {
            this.f17249OoooO.setLetterSpacing(f3);
        }
        this.f17247Oooo0oO = OooOO0(this.f17259Ooooo00, this.f17255OoooOOo, f, null);
        this.f17248Oooo0oo = OooOO0(this.f17260Ooooo0o, this.f17256OoooOo0, f, null);
        this.f17238Oooo = OooOO0(this.f17261OooooO0, this.f17257OoooOoO, f, null);
        int iOooO00o = OooO00o(OooO(this.f17262OooooOO), OooO(this.f17258OoooOoo), f);
        this.f17251OoooO00 = iOooO00o;
        this.f17249OoooO.setShadowLayer(this.f17247Oooo0oO, this.f17248Oooo0oo, this.f17238Oooo, iOooO00o);
        if (this.f17211OooO0Oo) {
            int alpha = this.f17249OoooO.getAlpha();
            float f5 = this.f17212OooO0o;
            this.f17249OoooO.setAlpha((int) ((f <= f5 ? p338o0OO0o0O.OooO0o.OooO00o(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f17213OooO0o0, f5, f) : p338o0OO0o0O.OooO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, f5, 1.0f, f)) * alpha));
        }
        ViewCompat.OooO0o.OooOO0O(this.f17208OooO00o);
    }

    public final void OooO0Oo(float f, boolean z) {
        boolean z2;
        float f2;
        float f3;
        StaticLayout staticLayoutOooO00o;
        Layout.Alignment alignment;
        if (this.f17241Oooo00O == null) {
            return;
        }
        float fWidth = this.f17207OooO.width();
        float fWidth2 = this.f17215OooO0oo.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f17219OooOOO;
            f3 = this.f17263OooooOo;
            this.f17246Oooo0o0 = 1.0f;
            Typeface typeface = this.f17236OooOooO;
            Typeface typeface2 = this.f17226OooOo;
            if (typeface != typeface2) {
                this.f17236OooOooO = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f4 = this.f17220OooOOO0;
            float f5 = this.f17265Oooooo0;
            Typeface typeface3 = this.f17236OooOooO;
            Typeface typeface4 = this.f17233OooOoOO;
            if (typeface3 != typeface4) {
                this.f17236OooOooO = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) < 1.0E-5f) {
                this.f17246Oooo0o0 = 1.0f;
            } else {
                this.f17246Oooo0o0 = OooOO0(this.f17220OooOOO0, this.f17219OooOOO, f, this.f17254OoooOOO) / this.f17220OooOOO0;
            }
            float f6 = this.f17219OooOOO / this.f17220OooOOO0;
            fWidth = (!z && fWidth2 * f6 > fWidth) ? Math.min(fWidth / f6, fWidth2) : fWidth2;
            f2 = f4;
            f3 = f5;
        }
        if (fWidth > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            z2 = ((this.f17245Oooo0o > f2 ? 1 : (this.f17245Oooo0o == f2 ? 0 : -1)) != 0) || ((this.f17264Oooooo > f3 ? 1 : (this.f17264Oooooo == f3 ? 0 : -1)) != 0) || this.f17252OoooO0O || z2;
            this.f17245Oooo0o = f2;
            this.f17264Oooooo = f3;
            this.f17252OoooO0O = false;
        }
        if (this.f17242Oooo00o == null || z2) {
            this.f17249OoooO.setTextSize(this.f17245Oooo0o);
            this.f17249OoooO.setTypeface(this.f17236OooOooO);
            this.f17249OoooO.setLetterSpacing(this.f17264Oooooo);
            this.f17249OoooO.setLinearText(this.f17246Oooo0o0 != 1.0f);
            boolean zOooO0O0 = OooO0O0(this.f17241Oooo00O);
            this.f17239Oooo0 = zOooO0O0;
            int i = this.f17270o00Oo0;
            if (!(i > 1 && (!zOooO0O0 || this.f17211OooO0Oo))) {
                i = 1;
            }
            try {
                if (i == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f17217OooOO0O, zOooO0O0 ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        alignment = this.f17239Oooo0 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = this.f17239Oooo0 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    }
                }
                OooOo00 oooOo00 = new OooOo00(this.f17241Oooo00O, this.f17249OoooO, (int) fWidth);
                oooOo00.f17346OooOO0o = TextUtils.TruncateAt.END;
                oooOo00.f17345OooOO0O = zOooO0O0;
                oooOo00.f17341OooO0o0 = alignment;
                oooOo00.f17344OooOO0 = false;
                oooOo00.f17340OooO0o = i;
                float f7 = this.f17271o00Ooo;
                float f8 = this.f17272o00o0O;
                oooOo00.f17342OooO0oO = f7;
                oooOo00.f17343OooO0oo = f8;
                oooOo00.f17335OooO = this.f17273o00ooo;
                staticLayoutOooO00o = oooOo00.OooO00o();
            } catch (OooOo00.OooO00o e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayoutOooO00o = null;
            }
            Objects.requireNonNull(staticLayoutOooO00o);
            this.f17266OoooooO = staticLayoutOooO00o;
            this.f17242Oooo00o = staticLayoutOooO00o.getText();
        }
    }

    public final void OooO0o(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.f17242Oooo00o == null || !this.f17209OooO0O0) {
            return;
        }
        this.f17249OoooO.setTextSize(this.f17245Oooo0o);
        float f = this.f17229OooOo0O;
        float f2 = this.f17230OooOo0o;
        float f3 = this.f17246Oooo0o0;
        if (f3 != 1.0f && !this.f17211OooO0Oo) {
            canvas.scale(f3, f3, f, f2);
        }
        boolean z = true;
        if (this.f17270o00Oo0 <= 1 || (this.f17239Oooo0 && !this.f17211OooO0Oo)) {
            z = false;
        }
        if (!z || (this.f17211OooO0Oo && this.f17210OooO0OO <= this.f17212OooO0o)) {
            canvas.translate(f, f2);
            this.f17266OoooooO.draw(canvas);
        } else {
            float lineStart = this.f17229OooOo0O - this.f17266OoooooO.getLineStart(0);
            int alpha = this.f17249OoooO.getAlpha();
            canvas.translate(lineStart, f2);
            float f4 = alpha;
            this.f17249OoooO.setAlpha((int) (this.f17275ooOO * f4));
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                TextPaint textPaint = this.f17249OoooO;
                textPaint.setShadowLayer(this.f17247Oooo0oO, this.f17248Oooo0oo, this.f17238Oooo, o0O0000O.OooO00o(this.f17251OoooO00, textPaint.getAlpha()));
            }
            this.f17266OoooooO.draw(canvas);
            this.f17249OoooO.setAlpha((int) (this.f17274o0OoOo0 * f4));
            if (i >= 31) {
                TextPaint textPaint2 = this.f17249OoooO;
                textPaint2.setShadowLayer(this.f17247Oooo0oO, this.f17248Oooo0oo, this.f17238Oooo, o0O0000O.OooO00o(this.f17251OoooO00, textPaint2.getAlpha()));
            }
            int lineBaseline = this.f17266OoooooO.getLineBaseline(0);
            CharSequence charSequence = this.f17269o00O0O;
            float f5 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f5, this.f17249OoooO);
            if (i >= 31) {
                this.f17249OoooO.setShadowLayer(this.f17247Oooo0oO, this.f17248Oooo0oo, this.f17238Oooo, this.f17251OoooO00);
            }
            if (!this.f17211OooO0Oo) {
                String strTrim = this.f17269o00O0O.toString().trim();
                if (strTrim.endsWith("…")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                String str = strTrim;
                this.f17249OoooO.setAlpha(alpha);
                canvas.drawText(str, 0, Math.min(this.f17266OoooooO.getLineEnd(0), str.length()), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f5, (Paint) this.f17249OoooO);
            }
        }
        canvas.restoreToCount(iSave);
    }

    public final void OooO0o0() {
        Bitmap bitmap = this.f17244Oooo0OO;
        if (bitmap != null) {
            bitmap.recycle();
            this.f17244Oooo0OO = null;
        }
    }

    public final float OooO0oO() {
        TextPaint textPaint = this.f17253OoooOO0;
        textPaint.setTextSize(this.f17219OooOOO);
        textPaint.setTypeface(this.f17226OooOo);
        textPaint.setLetterSpacing(this.f17263OooooOo);
        return -this.f17253OoooOO0.ascent();
    }

    @ColorInt
    public final int OooO0oo() {
        return OooO(this.f17222OooOOOo);
    }

    public final void OooOO0O(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f17231OooOoO;
            if (typeface != null) {
                this.f17232OooOoO0 = o0OOO0O.OooOO0O.OooO00o(configuration, typeface);
            }
            Typeface typeface2 = this.f17234OooOoo;
            if (typeface2 != null) {
                this.f17235OooOoo0 = o0OOO0O.OooOO0O.OooO00o(configuration, typeface2);
            }
            Typeface typeface3 = this.f17232OooOoO0;
            if (typeface3 == null) {
                typeface3 = this.f17231OooOoO;
            }
            this.f17226OooOo = typeface3;
            Typeface typeface4 = this.f17235OooOoo0;
            if (typeface4 == null) {
                typeface4 = this.f17234OooOoo;
            }
            this.f17233OooOoOO = typeface4;
            OooOOO0(true);
        }
    }

    public final void OooOO0o() {
        this.f17209OooO0O0 = this.f17207OooO.width() > 0 && this.f17207OooO.height() > 0 && this.f17215OooO0oo.width() > 0 && this.f17215OooO0oo.height() > 0;
    }

    public final void OooOOO(int i, int i2, int i3, int i4) {
        Rect rect = this.f17207OooO;
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.f17252OoooO0O = true;
        OooOO0o();
    }

    public final void OooOOO0(boolean z) {
        StaticLayout staticLayout;
        if ((this.f17208OooO00o.getHeight() <= 0 || this.f17208OooO00o.getWidth() <= 0) && !z) {
            return;
        }
        OooO0Oo(1.0f, z);
        CharSequence charSequence = this.f17242Oooo00o;
        if (charSequence != null && (staticLayout = this.f17266OoooooO) != null) {
            this.f17269o00O0O = TextUtils.ellipsize(charSequence, this.f17249OoooO, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f17269o00O0O;
        float fMeasureText = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (charSequence2 != null) {
            this.f17267Ooooooo = this.f17249OoooO.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f17267Ooooooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f17218OooOO0o, this.f17239Oooo0 ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.f17225OooOOoo = this.f17207OooO.top;
        } else if (i != 80) {
            this.f17225OooOOoo = this.f17207OooO.centerY() - ((this.f17249OoooO.descent() - this.f17249OoooO.ascent()) / 2.0f);
        } else {
            this.f17225OooOOoo = this.f17249OoooO.ascent() + this.f17207OooO.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f17227OooOo0 = this.f17207OooO.centerX() - (this.f17267Ooooooo / 2.0f);
        } else if (i2 != 5) {
            this.f17227OooOo0 = this.f17207OooO.left;
        } else {
            this.f17227OooOo0 = this.f17207OooO.right - this.f17267Ooooooo;
        }
        OooO0Oo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, z);
        StaticLayout staticLayout2 = this.f17266OoooooO;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        StaticLayout staticLayout3 = this.f17266OoooooO;
        if (staticLayout3 == null || this.f17270o00Oo0 <= 1) {
            CharSequence charSequence3 = this.f17242Oooo00o;
            if (charSequence3 != null) {
                fMeasureText = this.f17249OoooO.measureText(charSequence3, 0, charSequence3.length());
            }
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f17266OoooooO;
        this.f17224OooOOo0 = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f17217OooOO0O, this.f17239Oooo0 ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.f17223OooOOo = this.f17215OooO0oo.top;
        } else if (i3 != 80) {
            this.f17223OooOOo = this.f17215OooO0oo.centerY() - (height / 2.0f);
        } else {
            this.f17223OooOOo = this.f17249OoooO.descent() + (this.f17215OooO0oo.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f17228OooOo00 = this.f17215OooO0oo.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f17228OooOo00 = this.f17215OooO0oo.left;
        } else {
            this.f17228OooOo00 = this.f17215OooO0oo.right - fMeasureText;
        }
        OooO0o0();
        OooOoO0(this.f17210OooO0OO);
        OooO0OO(this.f17210OooO0OO);
    }

    public final void OooOOOO(int i) {
        o0OOO0O.OooO0o oooO0o = new o0OOO0O.OooO0o(this.f17208OooO00o.getContext(), i);
        ColorStateList colorStateList = oooO0o.f38044OooOO0;
        if (colorStateList != null) {
            this.f17222OooOOOo = colorStateList;
        }
        float f = oooO0o.f38045OooOO0O;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f17219OooOOO = f;
        }
        ColorStateList colorStateList2 = oooO0o.f38036OooO00o;
        if (colorStateList2 != null) {
            this.f17258OoooOoo = colorStateList2;
        }
        this.f17256OoooOo0 = oooO0o.f38041OooO0o0;
        this.f17257OoooOoO = oooO0o.f38040OooO0o;
        this.f17255OoooOOo = oooO0o.f38042OooO0oO;
        this.f17263OooooOo = oooO0o.f38035OooO;
        o0OOO0O.OooO00o oooO00o = this.f17240Oooo000;
        if (oooO00o != null) {
            oooO00o.f38034OooO0OO = true;
        }
        OooO00o oooO00o2 = new OooO00o();
        oooO0o.OooO00o();
        this.f17240Oooo000 = new o0OOO0O.OooO00o(oooO00o2, oooO0o.f38047OooOOO);
        oooO0o.OooO0OO(this.f17208OooO00o.getContext(), this.f17240Oooo000);
        OooOOO0(false);
    }

    public final void OooOOOo(ColorStateList colorStateList) {
        if (this.f17222OooOOOo != colorStateList) {
            this.f17222OooOOOo = colorStateList;
            OooOOO0(false);
        }
    }

    public final boolean OooOOo(Typeface typeface) {
        o0OOO0O.OooO00o oooO00o = this.f17240Oooo000;
        if (oooO00o != null) {
            oooO00o.f38034OooO0OO = true;
        }
        if (this.f17231OooOoO == typeface) {
            return false;
        }
        this.f17231OooOoO = typeface;
        Typeface typefaceOooO00o = o0OOO0O.OooOO0O.OooO00o(this.f17208OooO00o.getContext().getResources().getConfiguration(), typeface);
        this.f17232OooOoO0 = typefaceOooO00o;
        if (typefaceOooO00o == null) {
            typefaceOooO00o = this.f17231OooOoO;
        }
        this.f17226OooOo = typefaceOooO00o;
        return true;
    }

    public final void OooOOo0(int i) {
        if (this.f17218OooOO0o != i) {
            this.f17218OooOO0o = i;
            OooOOO0(false);
        }
    }

    public final void OooOOoo(int i, int i2, int i3, int i4) {
        Rect rect = this.f17215OooO0oo;
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.f17252OoooO0O = true;
        OooOO0o();
    }

    public final void OooOo(float f) {
        float fOooO0Oo = p021OooOooo.o00O0O.OooO0Oo(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        if (fOooO0Oo != this.f17210OooO0OO) {
            this.f17210OooO0OO = fOooO0Oo;
            OooO0OO(fOooO0Oo);
        }
    }

    public final void OooOo0(ColorStateList colorStateList) {
        if (this.f17221OooOOOO != colorStateList) {
            this.f17221OooOOOO = colorStateList;
            OooOOO0(false);
        }
    }

    public final void OooOo00(int i) {
        o0OOO0O.OooO0o oooO0o = new o0OOO0O.OooO0o(this.f17208OooO00o.getContext(), i);
        ColorStateList colorStateList = oooO0o.f38044OooOO0;
        if (colorStateList != null) {
            this.f17221OooOOOO = colorStateList;
        }
        float f = oooO0o.f38045OooOO0O;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f17220OooOOO0 = f;
        }
        ColorStateList colorStateList2 = oooO0o.f38036OooO00o;
        if (colorStateList2 != null) {
            this.f17262OooooOO = colorStateList2;
        }
        this.f17260Ooooo0o = oooO0o.f38041OooO0o0;
        this.f17261OooooO0 = oooO0o.f38040OooO0o;
        this.f17259Ooooo00 = oooO0o.f38042OooO0oO;
        this.f17265Oooooo0 = oooO0o.f38035OooO;
        o0OOO0O.OooO00o oooO00o = this.f17237OooOooo;
        if (oooO00o != null) {
            oooO00o.f38034OooO0OO = true;
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0o.OooO00o();
        this.f17237OooOooo = new o0OOO0O.OooO00o(oooO0O0, oooO0o.f38047OooOOO);
        oooO0o.OooO0OO(this.f17208OooO00o.getContext(), this.f17237OooOooo);
        OooOOO0(false);
    }

    public final void OooOo0O(int i) {
        if (this.f17217OooOO0O != i) {
            this.f17217OooOO0O = i;
            OooOOO0(false);
        }
    }

    public final boolean OooOo0o(Typeface typeface) {
        o0OOO0O.OooO00o oooO00o = this.f17237OooOooo;
        if (oooO00o != null) {
            oooO00o.f38034OooO0OO = true;
        }
        if (this.f17234OooOoo == typeface) {
            return false;
        }
        this.f17234OooOoo = typeface;
        Typeface typefaceOooO00o = o0OOO0O.OooOO0O.OooO00o(this.f17208OooO00o.getContext().getResources().getConfiguration(), typeface);
        this.f17235OooOoo0 = typefaceOooO00o;
        if (typefaceOooO00o == null) {
            typefaceOooO00o = this.f17234OooOoo;
        }
        this.f17233OooOoOO = typefaceOooO00o;
        return true;
    }

    public final void OooOoO(TimeInterpolator timeInterpolator) {
        this.f17268o000oOoO = timeInterpolator;
        OooOOO0(false);
    }

    public final void OooOoO0(float f) {
        OooO0Oo(f, false);
        View view = this.f17208OooO00o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOO0O(view);
    }

    public final boolean OooOoOO(int[] iArr) {
        ColorStateList colorStateList;
        this.f17250OoooO0 = iArr;
        ColorStateList colorStateList2 = this.f17222OooOOOo;
        if (!((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f17221OooOOOO) != null && colorStateList.isStateful()))) {
            return false;
        }
        OooOOO0(false);
        return true;
    }

    public final void OooOoo0(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f17241Oooo00O, charSequence)) {
            this.f17241Oooo00O = charSequence;
            this.f17242Oooo00o = null;
            OooO0o0();
            OooOOO0(false);
        }
    }
}
