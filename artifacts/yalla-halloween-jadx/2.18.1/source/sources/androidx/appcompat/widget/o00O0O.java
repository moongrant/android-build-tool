package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final o00Ooo f5412OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final TextView f5413OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0000O00 f5414OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0000O00 f5415OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000O00 f5416OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0000O00 f5417OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0000O00 f5418OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0000O00 f5419OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0000O00 f5420OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f5421OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f5422OooOO0O = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Typeface f5423OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f5424OooOOO0;

    @RequiresApi(26)
    public static class OooO {
        @DoNotInline
        public static int OooO00o(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static void OooO0O0(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @DoNotInline
        public static void OooO0OO(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @DoNotInline
        public static boolean OooO0Oo(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public class OooO00o extends androidx.core.content.res.OooO00o.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f5425OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f5426OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ WeakReference f5427OooO0OO;

        public OooO00o(int i, int i2, WeakReference weakReference) {
            this.f5425OooO00o = i;
            this.f5426OooO0O0 = i2;
            this.f5427OooO0OO = weakReference;
        }

        @Override // androidx.core.content.res.OooO00o.OooO
        public final void OooO0Oo(int i) {
        }

        @Override // androidx.core.content.res.OooO00o.OooO
        public final void OooO0o0(@NonNull Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f5425OooO00o) != -1) {
                typeface = OooOO0.OooO00o(typeface, i, (this.f5426OooO0O0 & 2) != 0);
            }
            o00O0O o00o0o2 = o00O0O.this;
            WeakReference weakReference = this.f5427OooO0OO;
            if (o00o0o2.f5424OooOOO0) {
                o00o0o2.f5423OooOO0o = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    if (ViewCompat.OooOO0O.OooO0O0(textView)) {
                        textView.post(new o00Oo0(textView, typeface, o00o0o2.f5421OooOO0));
                    } else {
                        textView.setTypeface(typeface, o00o0o2.f5421OooOO0);
                    }
                }
            }
        }
    }

    @RequiresApi(17)
    public static class OooO0O0 {
        @DoNotInline
        public static Drawable[] OooO00o(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        public static void OooO0O0(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        public static void OooO0OO(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @RequiresApi(21)
    public static class OooO0OO {
        @DoNotInline
        public static Locale OooO00o(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi(24)
    public static class OooO0o {
        @DoNotInline
        public static LocaleList OooO00o(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        public static void OooO0O0(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi(28)
    public static class OooOO0 {
        @DoNotInline
        public static Typeface OooO00o(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public o00O0O(@NonNull TextView textView) {
        this.f5413OooO00o = textView;
        this.f5412OooO = new o00Ooo(textView);
    }

    public static o0000O00 OooO0Oo(Context context, OooOO0O oooOO0O, int i) {
        ColorStateList colorStateListOooO0Oo = oooOO0O.OooO0Oo(context, i);
        if (colorStateListOooO0Oo == null) {
            return null;
        }
        o0000O00 o0000o00 = new o0000O00();
        o0000o00.f5372OooO0Oo = true;
        o0000o00.f5369OooO00o = colorStateListOooO0Oo;
        return o0000o00;
    }

    public final void OooO(Context context, int i) {
        String strOooOOO;
        ColorStateList colorStateListOooO0OO;
        ColorStateList colorStateListOooO0OO2;
        ColorStateList colorStateListOooO0OO3;
        o0000O0 o0000o1 = new o0000O0(context, context.obtainStyledAttributes(i, OooOo00.OooOOOO.TextAppearance));
        int i2 = OooOo00.OooOOOO.TextAppearance_textAllCaps;
        if (o0000o1.OooOOOo(i2)) {
            OooOO0(o0000o1.OooO00o(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = OooOo00.OooOOOO.TextAppearance_android_textColor;
            if (o0000o1.OooOOOo(i4) && (colorStateListOooO0OO3 = o0000o1.OooO0OO(i4)) != null) {
                this.f5413OooO00o.setTextColor(colorStateListOooO0OO3);
            }
            int i5 = OooOo00.OooOOOO.TextAppearance_android_textColorLink;
            if (o0000o1.OooOOOo(i5) && (colorStateListOooO0OO2 = o0000o1.OooO0OO(i5)) != null) {
                this.f5413OooO00o.setLinkTextColor(colorStateListOooO0OO2);
            }
            int i6 = OooOo00.OooOOOO.TextAppearance_android_textColorHint;
            if (o0000o1.OooOOOo(i6) && (colorStateListOooO0OO = o0000o1.OooO0OO(i6)) != null) {
                this.f5413OooO00o.setHintTextColor(colorStateListOooO0OO);
            }
        }
        int i7 = OooOo00.OooOOOO.TextAppearance_android_textSize;
        if (o0000o1.OooOOOo(i7) && o0000o1.OooO0o(i7, -1) == 0) {
            this.f5413OooO00o.setTextSize(0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        OooOOOo(context, o0000o1);
        if (i3 >= 26) {
            int i8 = OooOo00.OooOOOO.TextAppearance_fontVariationSettings;
            if (o0000o1.OooOOOo(i8) && (strOooOOO = o0000o1.OooOOO(i8)) != null) {
                OooO.OooO0Oo(this.f5413OooO00o, strOooOOO);
            }
        }
        o0000o1.OooOOoo();
        Typeface typeface = this.f5423OooOO0o;
        if (typeface != null) {
            this.f5413OooO00o.setTypeface(typeface, this.f5421OooOO0);
        }
    }

    public final void OooO00o(Drawable drawable, o0000O00 o0000o00) {
        if (drawable == null || o0000o00 == null) {
            return;
        }
        OooOO0O.OooO0o(drawable, o0000o00, this.f5413OooO00o.getDrawableState());
    }

    public final void OooO0O0() {
        if (this.f5414OooO0O0 != null || this.f5415OooO0OO != null || this.f5416OooO0Oo != null || this.f5418OooO0o0 != null) {
            Drawable[] compoundDrawables = this.f5413OooO00o.getCompoundDrawables();
            OooO00o(compoundDrawables[0], this.f5414OooO0O0);
            OooO00o(compoundDrawables[1], this.f5415OooO0OO);
            OooO00o(compoundDrawables[2], this.f5416OooO0Oo);
            OooO00o(compoundDrawables[3], this.f5418OooO0o0);
        }
        if (this.f5417OooO0o == null && this.f5419OooO0oO == null) {
            return;
        }
        Drawable[] drawableArrOooO00o = OooO0O0.OooO00o(this.f5413OooO00o);
        OooO00o(drawableArrOooO00o[0], this.f5417OooO0o);
        OooO00o(drawableArrOooO00o[2], this.f5419OooO0oO);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO0OO() {
        this.f5412OooO.OooO00o();
    }

    @Nullable
    public final PorterDuff.Mode OooO0o() {
        o0000O00 o0000o00 = this.f5420OooO0oo;
        if (o0000o00 != null) {
            return o0000o00.f5370OooO0O0;
        }
        return null;
    }

    @Nullable
    public final ColorStateList OooO0o0() {
        o0000O00 o0000o00 = this.f5420OooO0oo;
        if (o0000o00 != null) {
            return o0000o00.f5369OooO00o;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean OooO0oO() {
        o00Ooo o00ooo2 = this.f5412OooO;
        return o00ooo2.OooO() && o00ooo2.f5436OooO00o != 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a8  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    public final void OooO0oo(@Nullable AttributeSet attributeSet, int i) {
        boolean zOooO00o;
        String strOooOOO;
        String strOooOOO2;
        boolean z;
        ColorStateList colorStateListOooO0OO;
        ColorStateList colorStateListOooO0OO2;
        ColorStateList colorStateListOooO0OO3;
        boolean z2;
        boolean zOooO00o2;
        int i2;
        OooOO0O oooOO0O;
        int i3;
        OooOO0O oooOO0O2;
        Drawable drawableOooO0O0;
        int resourceId;
        Context context = this.f5413OooO00o.getContext();
        OooOO0O oooOO0OOooO00o = OooOO0O.OooO00o();
        int[] iArr = OooOo00.OooOOOO.AppCompatTextHelper;
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(context, attributeSet, iArr, i);
        TextView textView = this.f5413OooO00o;
        ViewCompat.OooOo0O(textView, textView.getContext(), iArr, attributeSet, o0000o0OooOOo.f5367OooO0O0, i);
        int iOooOOO0 = o0000o0OooOOo.OooOOO0(OooOo00.OooOOOO.AppCompatTextHelper_android_textAppearance, -1);
        int i4 = OooOo00.OooOOOO.AppCompatTextHelper_android_drawableLeft;
        if (o0000o0OooOOo.OooOOOo(i4)) {
            this.f5414OooO0O0 = OooO0Oo(context, oooOO0OOooO00o, o0000o0OooOOo.OooOOO0(i4, 0));
        }
        int i5 = OooOo00.OooOOOO.AppCompatTextHelper_android_drawableTop;
        if (o0000o0OooOOo.OooOOOo(i5)) {
            this.f5415OooO0OO = OooO0Oo(context, oooOO0OOooO00o, o0000o0OooOOo.OooOOO0(i5, 0));
        }
        int i6 = OooOo00.OooOOOO.AppCompatTextHelper_android_drawableRight;
        if (o0000o0OooOOo.OooOOOo(i6)) {
            this.f5416OooO0Oo = OooO0Oo(context, oooOO0OOooO00o, o0000o0OooOOo.OooOOO0(i6, 0));
        }
        int i7 = OooOo00.OooOOOO.AppCompatTextHelper_android_drawableBottom;
        if (o0000o0OooOOo.OooOOOo(i7)) {
            this.f5418OooO0o0 = OooO0Oo(context, oooOO0OOooO00o, o0000o0OooOOo.OooOOO0(i7, 0));
        }
        int i8 = Build.VERSION.SDK_INT;
        int i9 = OooOo00.OooOOOO.AppCompatTextHelper_android_drawableStart;
        if (o0000o0OooOOo.OooOOOo(i9)) {
            this.f5417OooO0o = OooO0Oo(context, oooOO0OOooO00o, o0000o0OooOOo.OooOOO0(i9, 0));
        }
        int i10 = OooOo00.OooOOOO.AppCompatTextHelper_android_drawableEnd;
        if (o0000o0OooOOo.OooOOOo(i10)) {
            this.f5419OooO0oO = OooO0Oo(context, oooOO0OOooO00o, o0000o0OooOOo.OooOOO0(i10, 0));
        }
        o0000o0OooOOo.OooOOoo();
        boolean z3 = this.f5413OooO00o.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iOooOOO0 != -1) {
            o0000O0 o0000o1 = new o0000O0(context, context.obtainStyledAttributes(iOooOOO0, OooOo00.OooOOOO.TextAppearance));
            if (z3) {
                zOooO00o = false;
                z = false;
            } else {
                int i11 = OooOo00.OooOOOO.TextAppearance_textAllCaps;
                if (o0000o1.OooOOOo(i11)) {
                    zOooO00o = o0000o1.OooO00o(i11, false);
                    z = true;
                } else {
                    zOooO00o = false;
                    z = false;
                }
            }
            OooOOOo(context, o0000o1);
            if (i8 < 23) {
                int i12 = OooOo00.OooOOOO.TextAppearance_android_textColor;
                colorStateListOooO0OO3 = o0000o1.OooOOOo(i12) ? o0000o1.OooO0OO(i12) : null;
                int i13 = OooOo00.OooOOOO.TextAppearance_android_textColorHint;
                colorStateListOooO0OO = o0000o1.OooOOOo(i13) ? o0000o1.OooO0OO(i13) : null;
                int i14 = OooOo00.OooOOOO.TextAppearance_android_textColorLink;
                colorStateListOooO0OO2 = o0000o1.OooOOOo(i14) ? o0000o1.OooO0OO(i14) : null;
            } else {
                colorStateListOooO0OO = null;
                colorStateListOooO0OO2 = null;
                colorStateListOooO0OO3 = null;
            }
            int i15 = OooOo00.OooOOOO.TextAppearance_textLocale;
            strOooOOO = o0000o1.OooOOOo(i15) ? o0000o1.OooOOO(i15) : null;
            if (i8 >= 26) {
                int i16 = OooOo00.OooOOOO.TextAppearance_fontVariationSettings;
                if (o0000o1.OooOOOo(i16)) {
                    strOooOOO2 = o0000o1.OooOOO(i16);
                } else {
                    strOooOOO2 = null;
                }
            } else {
                strOooOOO2 = null;
            }
            o0000o1.OooOOoo();
        } else {
            zOooO00o = false;
            strOooOOO = null;
            strOooOOO2 = null;
            z = false;
            colorStateListOooO0OO = null;
            colorStateListOooO0OO2 = null;
            colorStateListOooO0OO3 = null;
        }
        boolean z4 = zOooO00o;
        o0000O0 o0000o2 = new o0000O0(context, context.obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.TextAppearance, i, 0));
        if (z3) {
            z2 = z;
            zOooO00o2 = z4;
            i2 = 23;
        } else {
            int i17 = OooOo00.OooOOOO.TextAppearance_textAllCaps;
            if (o0000o2.OooOOOo(i17)) {
                zOooO00o2 = o0000o2.OooO00o(i17, false);
                i2 = 23;
                z2 = true;
            } else {
                z2 = z;
                zOooO00o2 = z4;
                i2 = 23;
            }
        }
        if (i8 < i2) {
            int i18 = OooOo00.OooOOOO.TextAppearance_android_textColor;
            if (o0000o2.OooOOOo(i18)) {
                colorStateListOooO0OO3 = o0000o2.OooO0OO(i18);
            }
            int i19 = OooOo00.OooOOOO.TextAppearance_android_textColorHint;
            if (o0000o2.OooOOOo(i19)) {
                colorStateListOooO0OO = o0000o2.OooO0OO(i19);
            }
            int i20 = OooOo00.OooOOOO.TextAppearance_android_textColorLink;
            if (o0000o2.OooOOOo(i20)) {
                colorStateListOooO0OO2 = o0000o2.OooO0OO(i20);
            }
        }
        int i21 = OooOo00.OooOOOO.TextAppearance_textLocale;
        if (o0000o2.OooOOOo(i21)) {
            strOooOOO = o0000o2.OooOOO(i21);
        }
        if (i8 >= 26) {
            int i22 = OooOo00.OooOOOO.TextAppearance_fontVariationSettings;
            if (o0000o2.OooOOOo(i22)) {
                strOooOOO2 = o0000o2.OooOOO(i22);
            }
        }
        if (i8 >= 28) {
            int i23 = OooOo00.OooOOOO.TextAppearance_android_textSize;
            if (o0000o2.OooOOOo(i23)) {
                oooOO0O = oooOO0OOooO00o;
                if (o0000o2.OooO0o(i23, -1) == 0) {
                    this.f5413OooO00o.setTextSize(0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
            } else {
                oooOO0O = oooOO0OOooO00o;
            }
        } else {
            oooOO0O = oooOO0OOooO00o;
        }
        OooOOOo(context, o0000o2);
        o0000o2.OooOOoo();
        if (colorStateListOooO0OO3 != null) {
            this.f5413OooO00o.setTextColor(colorStateListOooO0OO3);
        }
        if (colorStateListOooO0OO != null) {
            this.f5413OooO00o.setHintTextColor(colorStateListOooO0OO);
        }
        if (colorStateListOooO0OO2 != null) {
            this.f5413OooO00o.setLinkTextColor(colorStateListOooO0OO2);
        }
        if (!z3 && z2) {
            OooOO0(zOooO00o2);
        }
        Typeface typeface = this.f5423OooOO0o;
        if (typeface != null) {
            if (this.f5422OooOO0O == -1) {
                this.f5413OooO00o.setTypeface(typeface, this.f5421OooOO0);
            } else {
                this.f5413OooO00o.setTypeface(typeface);
            }
        }
        if (strOooOOO2 != null) {
            OooO.OooO0Oo(this.f5413OooO00o, strOooOOO2);
        }
        if (strOooOOO == null) {
            i3 = 0;
        } else if (i8 >= 24) {
            OooO0o.OooO0O0(this.f5413OooO00o, OooO0o.OooO00o(strOooOOO));
            i3 = 0;
        } else {
            i3 = 0;
            OooO0O0.OooO0OO(this.f5413OooO00o, OooO0OO.OooO00o(strOooOOO.split(",")[0]));
        }
        o00Ooo o00ooo2 = this.f5412OooO;
        Context context2 = o00ooo2.f5444OooOO0;
        int[] iArr2 = OooOo00.OooOOOO.AppCompatTextView;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i, i3);
        TextView textView2 = o00ooo2.f5435OooO;
        ViewCompat.OooOo0O(textView2, textView2.getContext(), iArr2, attributeSet, typedArrayObtainStyledAttributes, i);
        int i24 = OooOo00.OooOOOO.AppCompatTextView_autoSizeTextType;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            o00ooo2.f5436OooO00o = typedArrayObtainStyledAttributes.getInt(i24, 0);
        }
        int i25 = OooOo00.OooOOOO.AppCompatTextView_autoSizeStepGranularity;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i25) ? typedArrayObtainStyledAttributes.getDimension(i25, -1.0f) : -1.0f;
        int i26 = OooOo00.OooOOOO.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i26) ? typedArrayObtainStyledAttributes.getDimension(i26, -1.0f) : -1.0f;
        int i27 = OooOo00.OooOOOO.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i27) ? typedArrayObtainStyledAttributes.getDimension(i27, -1.0f) : -1.0f;
        int i28 = OooOo00.OooOOOO.AppCompatTextView_autoSizePresetSizes;
        if (typedArrayObtainStyledAttributes.hasValue(i28) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i28, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i29 = 0; i29 < length; i29++) {
                    iArr3[i29] = typedArrayObtainTypedArray.getDimensionPixelSize(i29, -1);
                }
                o00ooo2.f5440OooO0o = o00ooo2.OooO0O0(iArr3);
                o00ooo2.OooO0oo();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!o00ooo2.OooO()) {
            o00ooo2.f5436OooO00o = 0;
        } else if (o00ooo2.f5436OooO00o == 1) {
            if (!o00ooo2.f5442OooO0oO) {
                DisplayMetrics displayMetrics = o00ooo2.f5444OooOO0.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                o00ooo2.OooOO0(dimension2, dimension3, dimension);
            }
            o00ooo2.OooO0oO();
        }
        if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
            o00Ooo o00ooo3 = this.f5412OooO;
            if (o00ooo3.f5436OooO00o != 0) {
                int[] iArr4 = o00ooo3.f5440OooO0o;
                if (iArr4.length > 0) {
                    if (OooO.OooO00o(this.f5413OooO00o) != -1.0f) {
                        OooO.OooO0O0(this.f5413OooO00o, Math.round(this.f5412OooO.f5439OooO0Oo), Math.round(this.f5412OooO.f5441OooO0o0), Math.round(this.f5412OooO.f5438OooO0OO), 0);
                    } else {
                        OooO.OooO0OO(this.f5413OooO00o, iArr4, 0);
                    }
                }
            }
        }
        o0000O0 o0000o3 = new o0000O0(context, context.obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.AppCompatTextView));
        int iOooOOO1 = o0000o3.OooOOO0(OooOo00.OooOOOO.AppCompatTextView_drawableLeftCompat, -1);
        if (iOooOOO1 != -1) {
            oooOO0O2 = oooOO0O;
            drawableOooO0O0 = oooOO0O2.OooO0O0(context, iOooOOO1);
        } else {
            oooOO0O2 = oooOO0O;
            drawableOooO0O0 = null;
        }
        int iOooOOO2 = o0000o3.OooOOO0(OooOo00.OooOOOO.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableOooO0O1 = iOooOOO2 != -1 ? oooOO0O2.OooO0O0(context, iOooOOO2) : null;
        int iOooOOO3 = o0000o3.OooOOO0(OooOo00.OooOOOO.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableOooO0O2 = iOooOOO3 != -1 ? oooOO0O2.OooO0O0(context, iOooOOO3) : null;
        int iOooOOO4 = o0000o3.OooOOO0(OooOo00.OooOOOO.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableOooO0O3 = iOooOOO4 != -1 ? oooOO0O2.OooO0O0(context, iOooOOO4) : null;
        int iOooOOO5 = o0000o3.OooOOO0(OooOo00.OooOOOO.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableOooO0O4 = iOooOOO5 != -1 ? oooOO0O2.OooO0O0(context, iOooOOO5) : null;
        int iOooOOO6 = o0000o3.OooOOO0(OooOo00.OooOOOO.AppCompatTextView_drawableEndCompat, -1);
        Drawable drawableOooO0O5 = iOooOOO6 != -1 ? oooOO0O2.OooO0O0(context, iOooOOO6) : null;
        if (drawableOooO0O4 != null || drawableOooO0O5 != null) {
            Drawable[] drawableArrOooO00o = OooO0O0.OooO00o(this.f5413OooO00o);
            TextView textView3 = this.f5413OooO00o;
            if (drawableOooO0O4 == null) {
                drawableOooO0O4 = drawableArrOooO00o[0];
            }
            if (drawableOooO0O1 == null) {
                drawableOooO0O1 = drawableArrOooO00o[1];
            }
            if (drawableOooO0O5 == null) {
                drawableOooO0O5 = drawableArrOooO00o[2];
            }
            if (drawableOooO0O3 == null) {
                drawableOooO0O3 = drawableArrOooO00o[3];
            }
            OooO0O0.OooO0O0(textView3, drawableOooO0O4, drawableOooO0O1, drawableOooO0O5, drawableOooO0O3);
        } else if (drawableOooO0O0 != null || drawableOooO0O1 != null || drawableOooO0O2 != null || drawableOooO0O3 != null) {
            Drawable[] drawableArrOooO00o2 = OooO0O0.OooO00o(this.f5413OooO00o);
            if (drawableArrOooO00o2[0] == null && drawableArrOooO00o2[2] == null) {
                Drawable[] compoundDrawables = this.f5413OooO00o.getCompoundDrawables();
                TextView textView4 = this.f5413OooO00o;
                if (drawableOooO0O0 == null) {
                    drawableOooO0O0 = compoundDrawables[0];
                }
                if (drawableOooO0O1 == null) {
                    drawableOooO0O1 = compoundDrawables[1];
                }
                if (drawableOooO0O2 == null) {
                    drawableOooO0O2 = compoundDrawables[2];
                }
                if (drawableOooO0O3 == null) {
                    drawableOooO0O3 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawableOooO0O0, drawableOooO0O1, drawableOooO0O2, drawableOooO0O3);
            } else {
                TextView textView5 = this.f5413OooO00o;
                Drawable drawable = drawableArrOooO00o2[0];
                if (drawableOooO0O1 == null) {
                    drawableOooO0O1 = drawableArrOooO00o2[1];
                }
                Drawable drawable2 = drawableArrOooO00o2[2];
                if (drawableOooO0O3 == null) {
                    drawableOooO0O3 = drawableArrOooO00o2[3];
                }
                OooO0O0.OooO0O0(textView5, drawable, drawableOooO0O1, drawable2, drawableOooO0O3);
            }
        }
        int i30 = OooOo00.OooOOOO.AppCompatTextView_drawableTint;
        if (o0000o3.OooOOOo(i30)) {
            ColorStateList colorStateListOooO0OO4 = o0000o3.OooO0OO(i30);
            TextView textView6 = this.f5413OooO00o;
            Objects.requireNonNull(textView6);
            if (Build.VERSION.SDK_INT >= 24) {
                TextViewCompat.OooO0OO.OooO0o(textView6, colorStateListOooO0OO4);
            } else if (textView6 instanceof androidx.core.widget.OooOo) {
                ((androidx.core.widget.OooOo) textView6).setSupportCompoundDrawablesTintList(colorStateListOooO0OO4);
            }
        }
        int i31 = OooOo00.OooOOOO.AppCompatTextView_drawableTintMode;
        if (o0000o3.OooOOOo(i31)) {
            PorterDuff.Mode modeOooO0Oo = o0ooOOo.OooO0Oo(o0000o3.OooOO0(i31, -1), null);
            TextView textView7 = this.f5413OooO00o;
            Objects.requireNonNull(textView7);
            if (Build.VERSION.SDK_INT >= 24) {
                TextViewCompat.OooO0OO.OooO0oO(textView7, modeOooO0Oo);
            } else if (textView7 instanceof androidx.core.widget.OooOo) {
                ((androidx.core.widget.OooOo) textView7).setSupportCompoundDrawablesTintMode(modeOooO0Oo);
            }
        }
        int iOooO0o = o0000o3.OooO0o(OooOo00.OooOOOO.AppCompatTextView_firstBaselineToTopHeight, -1);
        int iOooO0o2 = o0000o3.OooO0o(OooOo00.OooOOOO.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int iOooO0o3 = o0000o3.OooO0o(OooOo00.OooOOOO.AppCompatTextView_lineHeight, -1);
        o0000o3.OooOOoo();
        if (iOooO0o != -1) {
            TextViewCompat.OooO0O0(this.f5413OooO00o, iOooO0o);
        }
        if (iOooO0o2 != -1) {
            TextViewCompat.OooO0OO(this.f5413OooO00o, iOooO0o2);
        }
        if (iOooO0o3 != -1) {
            TextViewCompat.OooO0Oo(this.f5413OooO00o, iOooO0o3);
        }
    }

    public final void OooOO0(boolean z) {
        this.f5413OooO00o.setAllCaps(z);
    }

    public final void OooOO0O(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        o00Ooo o00ooo2 = this.f5412OooO;
        if (o00ooo2.OooO()) {
            DisplayMetrics displayMetrics = o00ooo2.f5444OooOO0.getResources().getDisplayMetrics();
            o00ooo2.OooOO0(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (o00ooo2.OooO0oO()) {
                o00ooo2.OooO00o();
            }
        }
    }

    public final void OooOO0o(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        o00Ooo o00ooo2 = this.f5412OooO;
        if (o00ooo2.OooO()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = o00ooo2.f5444OooOO0.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                o00ooo2.f5440OooO0o = o00ooo2.OooO0O0(iArrCopyOf);
                if (!o00ooo2.OooO0oo()) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("None of the preset sizes is valid: ");
                    sbOooO0o0.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sbOooO0o0.toString());
                }
            } else {
                o00ooo2.f5442OooO0oO = false;
            }
            if (o00ooo2.OooO0oO()) {
                o00ooo2.OooO00o();
            }
        }
    }

    public final void OooOOO(@Nullable ColorStateList colorStateList) {
        if (this.f5420OooO0oo == null) {
            this.f5420OooO0oo = new o0000O00();
        }
        o0000O00 o0000o00 = this.f5420OooO0oo;
        o0000o00.f5369OooO00o = colorStateList;
        o0000o00.f5372OooO0Oo = colorStateList != null;
        this.f5414OooO0O0 = o0000o00;
        this.f5415OooO0OO = o0000o00;
        this.f5416OooO0Oo = o0000o00;
        this.f5418OooO0o0 = o0000o00;
        this.f5417OooO0o = o0000o00;
        this.f5419OooO0oO = o0000o00;
    }

    public final void OooOOO0(int i) {
        o00Ooo o00ooo2 = this.f5412OooO;
        if (o00ooo2.OooO()) {
            if (i == 0) {
                o00ooo2.f5436OooO00o = 0;
                o00ooo2.f5439OooO0Oo = -1.0f;
                o00ooo2.f5441OooO0o0 = -1.0f;
                o00ooo2.f5438OooO0OO = -1.0f;
                o00ooo2.f5440OooO0o = new int[0];
                o00ooo2.f5437OooO0O0 = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = o00ooo2.f5444OooOO0.getResources().getDisplayMetrics();
            o00ooo2.OooOO0(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (o00ooo2.OooO0oO()) {
                o00ooo2.OooO00o();
            }
        }
    }

    public final void OooOOOO(@Nullable PorterDuff.Mode mode) {
        if (this.f5420OooO0oo == null) {
            this.f5420OooO0oo = new o0000O00();
        }
        o0000O00 o0000o00 = this.f5420OooO0oo;
        o0000o00.f5370OooO0O0 = mode;
        o0000o00.f5371OooO0OO = mode != null;
        this.f5414OooO0O0 = o0000o00;
        this.f5415OooO0OO = o0000o00;
        this.f5416OooO0Oo = o0000o00;
        this.f5418OooO0o0 = o0000o00;
        this.f5417OooO0o = o0000o00;
        this.f5419OooO0oO = o0000o00;
    }

    public final void OooOOOo(Context context, o0000O0 o0000o1) {
        String strOooOOO;
        this.f5421OooOO0 = o0000o1.OooOO0(OooOo00.OooOOOO.TextAppearance_android_textStyle, this.f5421OooOO0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iOooOO0 = o0000o1.OooOO0(OooOo00.OooOOOO.TextAppearance_android_textFontWeight, -1);
            this.f5422OooOO0O = iOooOO0;
            if (iOooOO0 != -1) {
                this.f5421OooOO0 = (this.f5421OooOO0 & 2) | 0;
            }
        }
        int i2 = OooOo00.OooOOOO.TextAppearance_android_fontFamily;
        if (!o0000o1.OooOOOo(i2) && !o0000o1.OooOOOo(OooOo00.OooOOOO.TextAppearance_fontFamily)) {
            int i3 = OooOo00.OooOOOO.TextAppearance_android_typeface;
            if (o0000o1.OooOOOo(i3)) {
                this.f5424OooOOO0 = false;
                int iOooOO1 = o0000o1.OooOO0(i3, 1);
                if (iOooOO1 == 1) {
                    this.f5423OooOO0o = Typeface.SANS_SERIF;
                    return;
                } else if (iOooOO1 == 2) {
                    this.f5423OooOO0o = Typeface.SERIF;
                    return;
                } else {
                    if (iOooOO1 != 3) {
                        return;
                    }
                    this.f5423OooOO0o = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f5423OooOO0o = null;
        int i4 = OooOo00.OooOOOO.TextAppearance_fontFamily;
        if (o0000o1.OooOOOo(i4)) {
            i2 = i4;
        }
        int i5 = this.f5422OooOO0O;
        int i6 = this.f5421OooOO0;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceOooO = o0000o1.OooO(i2, this.f5421OooOO0, new OooO00o(i5, i6, new WeakReference(this.f5413OooO00o)));
                if (typefaceOooO != null) {
                    if (i < 28 || this.f5422OooOO0O == -1) {
                        this.f5423OooOO0o = typefaceOooO;
                    } else {
                        this.f5423OooOO0o = OooOO0.OooO00o(Typeface.create(typefaceOooO, 0), this.f5422OooOO0O, (this.f5421OooOO0 & 2) != 0);
                    }
                }
                this.f5424OooOOO0 = this.f5423OooOO0o == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f5423OooOO0o != null || (strOooOOO = o0000o1.OooOOO(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f5422OooOO0O == -1) {
            this.f5423OooOO0o = Typeface.create(strOooOOO, this.f5421OooOO0);
        } else {
            this.f5423OooOO0o = OooOO0.OooO00o(Typeface.create(strOooOOO, 0), this.f5422OooOO0O, (this.f5421OooOO0 & 2) != 0);
        }
    }
}
