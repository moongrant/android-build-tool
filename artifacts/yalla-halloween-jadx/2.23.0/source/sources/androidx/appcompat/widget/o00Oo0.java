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
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final oo000o f3337OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final TextView f3338OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000O000 f3339OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000O000 f3340OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o000O000 f3341OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000O000 f3342OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000O000 f3343OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o000O000 f3344OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o000O000 f3345OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f3346OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f3347OooOO0O = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Typeface f3348OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f3349OooOOO0;

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
        public final /* synthetic */ int f3350OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f3351OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ WeakReference f3352OooO0OO;

        public OooO00o(int i, int i2, WeakReference weakReference) {
            this.f3350OooO00o = i;
            this.f3351OooO0O0 = i2;
            this.f3352OooO0OO = weakReference;
        }

        @Override // androidx.core.content.res.OooO00o.OooO
        public final void OooO0OO(int i) {
        }

        @Override // androidx.core.content.res.OooO00o.OooO
        public final void OooO0Oo(@NonNull Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f3350OooO00o) != -1) {
                typeface = OooOO0.OooO00o(typeface, i, (this.f3351OooO0O0 & 2) != 0);
            }
            o00Oo0 o00oo1 = o00Oo0.this;
            if (o00oo1.f3349OooOOO0) {
                o00oo1.f3348OooOO0o = typeface;
                TextView textView = (TextView) this.f3352OooO0OO.get();
                if (textView != null) {
                    WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    if (ViewCompat.OooOO0O.OooO0O0(textView)) {
                        textView.post(new o00Ooo(textView, typeface, o00oo1.f3346OooOO0));
                    } else {
                        textView.setTypeface(typeface, o00oo1.f3346OooOO0);
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

    public o00Oo0(@NonNull TextView textView) {
        this.f3338OooO00o = textView;
        this.f3337OooO = new oo000o(textView);
    }

    public static o000O000 OooO0OO(Context context, OooOOO0 oooOOO0, int i) {
        ColorStateList colorStateListOooO;
        synchronized (oooOOO0) {
            colorStateListOooO = oooOOO0.f2983OooO00o.OooO(i, context);
        }
        if (colorStateListOooO == null) {
            return null;
        }
        o000O000 o000o001 = new o000O000();
        o000o001.f3268OooO0Oo = true;
        o000o001.f3265OooO00o = colorStateListOooO;
        return o000o001;
    }

    public final void OooO(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        oo000o oo000oVar = this.f3337OooO;
        if (oo000oVar.OooO()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = oo000oVar.f3372OooOO0.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                oo000oVar.f3368OooO0o = oo000o.OooO0O0(iArrCopyOf);
                if (!oo000oVar.OooO0oo()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                oo000oVar.f3370OooO0oO = false;
            }
            if (oo000oVar.OooO0oO()) {
                oo000oVar.OooO00o();
            }
        }
    }

    public final void OooO00o(Drawable drawable, o000O000 o000o001) {
        if (drawable == null || o000o001 == null) {
            return;
        }
        OooOOO0.OooO0o0(drawable, o000o001, this.f3338OooO00o.getDrawableState());
    }

    public final void OooO0O0() {
        o000O000 o000o001 = this.f3339OooO0O0;
        TextView textView = this.f3338OooO00o;
        if (o000o001 != null || this.f3340OooO0OO != null || this.f3341OooO0Oo != null || this.f3343OooO0o0 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            OooO00o(compoundDrawables[0], this.f3339OooO0O0);
            OooO00o(compoundDrawables[1], this.f3340OooO0OO);
            OooO00o(compoundDrawables[2], this.f3341OooO0Oo);
            OooO00o(compoundDrawables[3], this.f3343OooO0o0);
        }
        if (this.f3342OooO0o == null && this.f3344OooO0oO == null) {
            return;
        }
        Drawable[] drawableArrOooO00o = OooO0O0.OooO00o(textView);
        OooO00o(drawableArrOooO00o[0], this.f3342OooO0o);
        OooO00o(drawableArrOooO00o[2], this.f3344OooO0oO);
    }

    @Nullable
    public final ColorStateList OooO0Oo() {
        o000O000 o000o001 = this.f3345OooO0oo;
        if (o000o001 != null) {
            return o000o001.f3265OooO00o;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    public final void OooO0o(@Nullable AttributeSet attributeSet, int i) {
        boolean zOooO00o;
        boolean z;
        String strOooOO0;
        String strOooOO1;
        int resourceId;
        TextView textView = this.f3338OooO00o;
        Context context = textView.getContext();
        OooOOO0 oooOOO0OooO00o = OooOOO0.OooO00o();
        int[] iArr = p012OooOo0O.o00O0O.AppCompatTextHelper;
        o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(context, attributeSet, iArr, i);
        ViewCompat.OooOOO(textView, textView.getContext(), iArr, attributeSet, o000oo0OooOOO0.f3326OooO0O0, i, 0);
        int iOooO = o000oo0OooOOO0.OooO(p012OooOo0O.o00O0O.AppCompatTextHelper_android_textAppearance, -1);
        int i2 = p012OooOo0O.o00O0O.AppCompatTextHelper_android_drawableLeft;
        if (o000oo0OooOOO0.OooOO0o(i2)) {
            this.f3339OooO0O0 = OooO0OO(context, oooOOO0OooO00o, o000oo0OooOOO0.OooO(i2, 0));
        }
        int i3 = p012OooOo0O.o00O0O.AppCompatTextHelper_android_drawableTop;
        if (o000oo0OooOOO0.OooOO0o(i3)) {
            this.f3340OooO0OO = OooO0OO(context, oooOOO0OooO00o, o000oo0OooOOO0.OooO(i3, 0));
        }
        int i4 = p012OooOo0O.o00O0O.AppCompatTextHelper_android_drawableRight;
        if (o000oo0OooOOO0.OooOO0o(i4)) {
            this.f3341OooO0Oo = OooO0OO(context, oooOOO0OooO00o, o000oo0OooOOO0.OooO(i4, 0));
        }
        int i5 = p012OooOo0O.o00O0O.AppCompatTextHelper_android_drawableBottom;
        if (o000oo0OooOOO0.OooOO0o(i5)) {
            this.f3343OooO0o0 = OooO0OO(context, oooOOO0OooO00o, o000oo0OooOOO0.OooO(i5, 0));
        }
        int i6 = Build.VERSION.SDK_INT;
        int i7 = p012OooOo0O.o00O0O.AppCompatTextHelper_android_drawableStart;
        if (o000oo0OooOOO0.OooOO0o(i7)) {
            this.f3342OooO0o = OooO0OO(context, oooOOO0OooO00o, o000oo0OooOOO0.OooO(i7, 0));
        }
        int i8 = p012OooOo0O.o00O0O.AppCompatTextHelper_android_drawableEnd;
        if (o000oo0OooOOO0.OooOO0o(i8)) {
            this.f3344OooO0oO = OooO0OO(context, oooOOO0OooO00o, o000oo0OooOOO0.OooO(i8, 0));
        }
        o000oo0OooOOO0.OooOOO();
        boolean z2 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iOooO != -1) {
            o000Oo0 o000oo1 = new o000Oo0(context, context.obtainStyledAttributes(iOooO, p012OooOo0O.o00O0O.TextAppearance));
            if (z2) {
                zOooO00o = false;
                z = false;
            } else {
                int i9 = p012OooOo0O.o00O0O.TextAppearance_textAllCaps;
                if (o000oo1.OooOO0o(i9)) {
                    zOooO00o = o000oo1.OooO00o(i9, false);
                    z = true;
                } else {
                    zOooO00o = false;
                    z = false;
                }
            }
            OooOOO0(context, o000oo1);
            int i10 = p012OooOo0O.o00O0O.TextAppearance_textLocale;
            strOooOO0 = o000oo1.OooOO0o(i10) ? o000oo1.OooOO0(i10) : null;
            if (i6 >= 26) {
                int i11 = p012OooOo0O.o00O0O.TextAppearance_fontVariationSettings;
                if (o000oo1.OooOO0o(i11)) {
                    strOooOO1 = o000oo1.OooOO0(i11);
                } else {
                    strOooOO1 = null;
                }
            } else {
                strOooOO1 = null;
            }
            o000oo1.OooOOO();
        } else {
            zOooO00o = false;
            z = false;
            strOooOO0 = null;
            strOooOO1 = null;
        }
        o000Oo0 o000oo2 = new o000Oo0(context, context.obtainStyledAttributes(attributeSet, p012OooOo0O.o00O0O.TextAppearance, i, 0));
        if (!z2) {
            int i12 = p012OooOo0O.o00O0O.TextAppearance_textAllCaps;
            if (o000oo2.OooOO0o(i12)) {
                zOooO00o = o000oo2.OooO00o(i12, false);
                z = true;
            }
        }
        int i13 = p012OooOo0O.o00O0O.TextAppearance_textLocale;
        if (o000oo2.OooOO0o(i13)) {
            strOooOO0 = o000oo2.OooOO0(i13);
        }
        if (i6 >= 26) {
            int i14 = p012OooOo0O.o00O0O.TextAppearance_fontVariationSettings;
            if (o000oo2.OooOO0o(i14)) {
                strOooOO1 = o000oo2.OooOO0(i14);
            }
        }
        if (i6 >= 28) {
            int i15 = p012OooOo0O.o00O0O.TextAppearance_android_textSize;
            if (o000oo2.OooOO0o(i15) && o000oo2.OooO0Oo(i15, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        OooOOO0(context, o000oo2);
        o000oo2.OooOOO();
        if (!z2 && z) {
            textView.setAllCaps(zOooO00o);
        }
        Typeface typeface = this.f3348OooOO0o;
        if (typeface != null) {
            if (this.f3347OooOO0O == -1) {
                textView.setTypeface(typeface, this.f3346OooOO0);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (strOooOO1 != null) {
            OooO.OooO0Oo(textView, strOooOO1);
        }
        if (strOooOO0 != null) {
            if (i6 >= 24) {
                OooO0o.OooO0O0(textView, OooO0o.OooO00o(strOooOO0));
            } else {
                OooO0O0.OooO0OO(textView, OooO0OO.OooO00o(strOooOO0.split(",")[0]));
            }
        }
        int[] iArr2 = p012OooOo0O.o00O0O.AppCompatTextView;
        oo000o oo000oVar = this.f3337OooO;
        Context context2 = oo000oVar.f3372OooOO0;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        TextView textView2 = oo000oVar.f3363OooO;
        ViewCompat.OooOOO(textView2, textView2.getContext(), iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        int i16 = p012OooOo0O.o00O0O.AppCompatTextView_autoSizeTextType;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            oo000oVar.f3364OooO00o = typedArrayObtainStyledAttributes.getInt(i16, 0);
        }
        int i17 = p012OooOo0O.o00O0O.AppCompatTextView_autoSizeStepGranularity;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i17) ? typedArrayObtainStyledAttributes.getDimension(i17, -1.0f) : -1.0f;
        int i18 = p012OooOo0O.o00O0O.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i18) ? typedArrayObtainStyledAttributes.getDimension(i18, -1.0f) : -1.0f;
        int i19 = p012OooOo0O.o00O0O.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i19) ? typedArrayObtainStyledAttributes.getDimension(i19, -1.0f) : -1.0f;
        int i20 = p012OooOo0O.o00O0O.AppCompatTextView_autoSizePresetSizes;
        if (typedArrayObtainStyledAttributes.hasValue(i20) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i20, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i21 = 0; i21 < length; i21++) {
                    iArr3[i21] = typedArrayObtainTypedArray.getDimensionPixelSize(i21, -1);
                }
                oo000oVar.f3368OooO0o = oo000o.OooO0O0(iArr3);
                oo000oVar.OooO0oo();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!oo000oVar.OooO()) {
            oo000oVar.f3364OooO00o = 0;
        } else if (oo000oVar.f3364OooO00o == 1) {
            if (!oo000oVar.f3370OooO0oO) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                oo000oVar.OooOO0(dimension2, dimension3, dimension);
            }
            oo000oVar.OooO0oO();
        }
        if (o0O0ooO.f3358OooO0O0 && oo000oVar.f3364OooO00o != 0) {
            int[] iArr4 = oo000oVar.f3368OooO0o;
            if (iArr4.length > 0) {
                if (OooO.OooO00o(textView) != -1.0f) {
                    OooO.OooO0O0(textView, Math.round(oo000oVar.f3367OooO0Oo), Math.round(oo000oVar.f3369OooO0o0), Math.round(oo000oVar.f3366OooO0OO), 0);
                } else {
                    OooO.OooO0OO(textView, iArr4, 0);
                }
            }
        }
        o000Oo0 o000oo3 = new o000Oo0(context, context.obtainStyledAttributes(attributeSet, p012OooOo0O.o00O0O.AppCompatTextView));
        int iOooO2 = o000oo3.OooO(p012OooOo0O.o00O0O.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableOooO0O0 = iOooO2 != -1 ? oooOOO0OooO00o.OooO0O0(context, iOooO2) : null;
        int iOooO3 = o000oo3.OooO(p012OooOo0O.o00O0O.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableOooO0O1 = iOooO3 != -1 ? oooOOO0OooO00o.OooO0O0(context, iOooO3) : null;
        int iOooO4 = o000oo3.OooO(p012OooOo0O.o00O0O.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableOooO0O2 = iOooO4 != -1 ? oooOOO0OooO00o.OooO0O0(context, iOooO4) : null;
        int iOooO5 = o000oo3.OooO(p012OooOo0O.o00O0O.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableOooO0O3 = iOooO5 != -1 ? oooOOO0OooO00o.OooO0O0(context, iOooO5) : null;
        int iOooO6 = o000oo3.OooO(p012OooOo0O.o00O0O.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableOooO0O4 = iOooO6 != -1 ? oooOOO0OooO00o.OooO0O0(context, iOooO6) : null;
        int iOooO7 = o000oo3.OooO(p012OooOo0O.o00O0O.AppCompatTextView_drawableEndCompat, -1);
        Drawable drawableOooO0O5 = iOooO7 != -1 ? oooOOO0OooO00o.OooO0O0(context, iOooO7) : null;
        if (drawableOooO0O4 != null || drawableOooO0O5 != null) {
            Drawable[] drawableArrOooO00o = OooO0O0.OooO00o(textView);
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
            OooO0O0.OooO0O0(textView, drawableOooO0O4, drawableOooO0O1, drawableOooO0O5, drawableOooO0O3);
        } else if (drawableOooO0O0 != null || drawableOooO0O1 != null || drawableOooO0O2 != null || drawableOooO0O3 != null) {
            Drawable[] drawableArrOooO00o2 = OooO0O0.OooO00o(textView);
            Drawable drawable = drawableArrOooO00o2[0];
            if (drawable == null && drawableArrOooO00o2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
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
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableOooO0O0, drawableOooO0O1, drawableOooO0O2, drawableOooO0O3);
            } else {
                if (drawableOooO0O1 == null) {
                    drawableOooO0O1 = drawableArrOooO00o2[1];
                }
                Drawable drawable2 = drawableArrOooO00o2[2];
                if (drawableOooO0O3 == null) {
                    drawableOooO0O3 = drawableArrOooO00o2[3];
                }
                OooO0O0.OooO0O0(textView, drawable, drawableOooO0O1, drawable2, drawableOooO0O3);
            }
        }
        int i22 = p012OooOo0O.o00O0O.AppCompatTextView_drawableTint;
        if (o000oo3.OooOO0o(i22)) {
            ColorStateList colorStateListOooO0O0 = o000oo3.OooO0O0(i22);
            if (Build.VERSION.SDK_INT >= 24) {
                TextViewCompat.OooO0OO.OooO0o(textView, colorStateListOooO0O0);
            } else if (textView instanceof androidx.core.widget.Oooo000) {
                ((androidx.core.widget.Oooo000) textView).setSupportCompoundDrawablesTintList(colorStateListOooO0O0);
            }
        }
        int i23 = p012OooOo0O.o00O0O.AppCompatTextView_drawableTintMode;
        if (o000oo3.OooOO0o(i23)) {
            PorterDuff.Mode modeOooO0OO = o000000.OooO0OO(o000oo3.OooO0oo(i23, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                TextViewCompat.OooO0OO.OooO0oO(textView, modeOooO0OO);
            } else if (textView instanceof androidx.core.widget.Oooo000) {
                ((androidx.core.widget.Oooo000) textView).setSupportCompoundDrawablesTintMode(modeOooO0OO);
            }
        }
        int iOooO0Oo = o000oo3.OooO0Oo(p012OooOo0O.o00O0O.AppCompatTextView_firstBaselineToTopHeight, -1);
        int iOooO0Oo2 = o000oo3.OooO0Oo(p012OooOo0O.o00O0O.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int iOooO0Oo3 = o000oo3.OooO0Oo(p012OooOo0O.o00O0O.AppCompatTextView_lineHeight, -1);
        o000oo3.OooOOO();
        if (iOooO0Oo != -1) {
            TextViewCompat.OooO0O0(textView, iOooO0Oo);
        }
        if (iOooO0Oo2 != -1) {
            TextViewCompat.OooO0OO(textView, iOooO0Oo2);
        }
        if (iOooO0Oo3 != -1) {
            o000OO.OooOOO0.OooO0Oo(iOooO0Oo3);
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (iOooO0Oo3 != fontMetricsInt) {
                textView.setLineSpacing(iOooO0Oo3 - fontMetricsInt, 1.0f);
            }
        }
    }

    @Nullable
    public final PorterDuff.Mode OooO0o0() {
        o000O000 o000o001 = this.f3345OooO0oo;
        if (o000o001 != null) {
            return o000o001.f3266OooO0O0;
        }
        return null;
    }

    public final void OooO0oO(int i, Context context) {
        String strOooOO0;
        o000Oo0 o000oo1 = new o000Oo0(context, context.obtainStyledAttributes(i, p012OooOo0O.o00O0O.TextAppearance));
        int i2 = p012OooOo0O.o00O0O.TextAppearance_textAllCaps;
        boolean zOooOO0o = o000oo1.OooOO0o(i2);
        TextView textView = this.f3338OooO00o;
        if (zOooOO0o) {
            textView.setAllCaps(o000oo1.OooO00o(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = p012OooOo0O.o00O0O.TextAppearance_android_textSize;
        if (o000oo1.OooOO0o(i4) && o000oo1.OooO0Oo(i4, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        OooOOO0(context, o000oo1);
        if (i3 >= 26) {
            int i5 = p012OooOo0O.o00O0O.TextAppearance_fontVariationSettings;
            if (o000oo1.OooOO0o(i5) && (strOooOO0 = o000oo1.OooOO0(i5)) != null) {
                OooO.OooO0Oo(textView, strOooOO0);
            }
        }
        o000oo1.OooOOO();
        Typeface typeface = this.f3348OooOO0o;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3346OooOO0);
        }
    }

    public final void OooO0oo(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        oo000o oo000oVar = this.f3337OooO;
        if (oo000oVar.OooO()) {
            DisplayMetrics displayMetrics = oo000oVar.f3372OooOO0.getResources().getDisplayMetrics();
            oo000oVar.OooOO0(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (oo000oVar.OooO0oO()) {
                oo000oVar.OooO00o();
            }
        }
    }

    public final void OooOO0(int i) {
        oo000o oo000oVar = this.f3337OooO;
        if (oo000oVar.OooO()) {
            if (i == 0) {
                oo000oVar.f3364OooO00o = 0;
                oo000oVar.f3367OooO0Oo = -1.0f;
                oo000oVar.f3369OooO0o0 = -1.0f;
                oo000oVar.f3366OooO0OO = -1.0f;
                oo000oVar.f3368OooO0o = new int[0];
                oo000oVar.f3365OooO0O0 = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = oo000oVar.f3372OooOO0.getResources().getDisplayMetrics();
            oo000oVar.OooOO0(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (oo000oVar.OooO0oO()) {
                oo000oVar.OooO00o();
            }
        }
    }

    public final void OooOO0O(@Nullable ColorStateList colorStateList) {
        if (this.f3345OooO0oo == null) {
            this.f3345OooO0oo = new o000O000();
        }
        o000O000 o000o001 = this.f3345OooO0oo;
        o000o001.f3265OooO00o = colorStateList;
        o000o001.f3268OooO0Oo = colorStateList != null;
        this.f3339OooO0O0 = o000o001;
        this.f3340OooO0OO = o000o001;
        this.f3341OooO0Oo = o000o001;
        this.f3343OooO0o0 = o000o001;
        this.f3342OooO0o = o000o001;
        this.f3344OooO0oO = o000o001;
    }

    public final void OooOO0o(@Nullable PorterDuff.Mode mode) {
        if (this.f3345OooO0oo == null) {
            this.f3345OooO0oo = new o000O000();
        }
        o000O000 o000o001 = this.f3345OooO0oo;
        o000o001.f3266OooO0O0 = mode;
        o000o001.f3267OooO0OO = mode != null;
        this.f3339OooO0O0 = o000o001;
        this.f3340OooO0OO = o000o001;
        this.f3341OooO0Oo = o000o001;
        this.f3343OooO0o0 = o000o001;
        this.f3342OooO0o = o000o001;
        this.f3344OooO0oO = o000o001;
    }

    public final void OooOOO0(Context context, o000Oo0 o000oo1) {
        String strOooOO0;
        this.f3346OooOO0 = o000oo1.OooO0oo(p012OooOo0O.o00O0O.TextAppearance_android_textStyle, this.f3346OooOO0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iOooO0oo = o000oo1.OooO0oo(p012OooOo0O.o00O0O.TextAppearance_android_textFontWeight, -1);
            this.f3347OooOO0O = iOooO0oo;
            if (iOooO0oo != -1) {
                this.f3346OooOO0 = (this.f3346OooOO0 & 2) | 0;
            }
        }
        int i2 = p012OooOo0O.o00O0O.TextAppearance_android_fontFamily;
        if (!o000oo1.OooOO0o(i2) && !o000oo1.OooOO0o(p012OooOo0O.o00O0O.TextAppearance_fontFamily)) {
            int i3 = p012OooOo0O.o00O0O.TextAppearance_android_typeface;
            if (o000oo1.OooOO0o(i3)) {
                this.f3349OooOOO0 = false;
                int iOooO0oo2 = o000oo1.OooO0oo(i3, 1);
                if (iOooO0oo2 == 1) {
                    this.f3348OooOO0o = Typeface.SANS_SERIF;
                    return;
                } else if (iOooO0oo2 == 2) {
                    this.f3348OooOO0o = Typeface.SERIF;
                    return;
                } else {
                    if (iOooO0oo2 != 3) {
                        return;
                    }
                    this.f3348OooOO0o = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3348OooOO0o = null;
        int i4 = p012OooOo0O.o00O0O.TextAppearance_fontFamily;
        if (o000oo1.OooOO0o(i4)) {
            i2 = i4;
        }
        int i5 = this.f3347OooOO0O;
        int i6 = this.f3346OooOO0;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceOooO0oO = o000oo1.OooO0oO(i2, this.f3346OooOO0, new OooO00o(i5, i6, new WeakReference(this.f3338OooO00o)));
                if (typefaceOooO0oO != null) {
                    if (i < 28 || this.f3347OooOO0O == -1) {
                        this.f3348OooOO0o = typefaceOooO0oO;
                    } else {
                        this.f3348OooOO0o = OooOO0.OooO00o(Typeface.create(typefaceOooO0oO, 0), this.f3347OooOO0O, (this.f3346OooOO0 & 2) != 0);
                    }
                }
                this.f3349OooOOO0 = this.f3348OooOO0o == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3348OooOO0o != null || (strOooOO0 = o000oo1.OooOO0(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3347OooOO0O == -1) {
            this.f3348OooOO0o = Typeface.create(strOooOO0, this.f3346OooOO0);
        } else {
            this.f3348OooOO0o = OooOO0.OooO00o(Typeface.create(strOooOO0, 0), this.f3347OooOO0O, (this.f3346OooOO0 & 2) != 0);
        }
    }
}
