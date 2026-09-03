package o000O0Oo;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Spannable {
    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        throw null;
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final TextPaint f28150OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final TextDirectionHeuristic f28151OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f28152OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f28153OooO0Oo;

        public OooO00o(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f28150OooO00o = textPaint;
            this.f28151OooO0O0 = textDirectionHeuristic;
            this.f28152OooO0OO = i;
            this.f28153OooO0Oo = i2;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final boolean OooO00o(@NonNull OooO00o oooO00o) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f28152OooO0OO != oooO00o.f28152OooO0OO || this.f28153OooO0Oo != oooO00o.f28153OooO0Oo)) || this.f28150OooO00o.getTextSize() != oooO00o.f28150OooO00o.getTextSize() || this.f28150OooO00o.getTextScaleX() != oooO00o.f28150OooO00o.getTextScaleX() || this.f28150OooO00o.getTextSkewX() != oooO00o.f28150OooO00o.getTextSkewX() || this.f28150OooO00o.getLetterSpacing() != oooO00o.f28150OooO00o.getLetterSpacing() || !TextUtils.equals(this.f28150OooO00o.getFontFeatureSettings(), oooO00o.f28150OooO00o.getFontFeatureSettings()) || this.f28150OooO00o.getFlags() != oooO00o.f28150OooO00o.getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f28150OooO00o.getTextLocales().equals(oooO00o.f28150OooO00o.getTextLocales())) {
                    return false;
                }
            } else if (!this.f28150OooO00o.getTextLocale().equals(oooO00o.f28150OooO00o.getTextLocale())) {
                return false;
            }
            if (this.f28150OooO00o.getTypeface() == null) {
                return oooO00o.f28150OooO00o.getTypeface() == null;
            }
            return this.f28150OooO00o.getTypeface().equals(oooO00o.f28150OooO00o.getTypeface());
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooO00o(oooO00o) && this.f28151OooO0O0 == oooO00o.f28151OooO0O0;
        }

        public final int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? o000OO0O.OooO0OO.OooO0O0(Float.valueOf(this.f28150OooO00o.getTextSize()), Float.valueOf(this.f28150OooO00o.getTextScaleX()), Float.valueOf(this.f28150OooO00o.getTextSkewX()), Float.valueOf(this.f28150OooO00o.getLetterSpacing()), Integer.valueOf(this.f28150OooO00o.getFlags()), this.f28150OooO00o.getTextLocales(), this.f28150OooO00o.getTypeface(), Boolean.valueOf(this.f28150OooO00o.isElegantTextHeight()), this.f28151OooO0O0, Integer.valueOf(this.f28152OooO0OO), Integer.valueOf(this.f28153OooO0Oo)) : o000OO0O.OooO0OO.OooO0O0(Float.valueOf(this.f28150OooO00o.getTextSize()), Float.valueOf(this.f28150OooO00o.getTextScaleX()), Float.valueOf(this.f28150OooO00o.getTextSkewX()), Float.valueOf(this.f28150OooO00o.getLetterSpacing()), Integer.valueOf(this.f28150OooO00o.getFlags()), this.f28150OooO00o.getTextLocale(), this.f28150OooO00o.getTypeface(), Boolean.valueOf(this.f28150OooO00o.isElegantTextHeight()), this.f28151OooO0O0, Integer.valueOf(this.f28152OooO0OO), Integer.valueOf(this.f28153OooO0Oo));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("textSize=");
            sbOooO0o0.append(this.f28150OooO00o.getTextSize());
            sb.append(sbOooO0o0.toString());
            sb.append(", textScaleX=" + this.f28150OooO00o.getTextScaleX());
            sb.append(", textSkewX=" + this.f28150OooO00o.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(", letterSpacing=");
            sbOooO0o1.append(this.f28150OooO00o.getLetterSpacing());
            sb.append(sbOooO0o1.toString());
            sb.append(", elegantTextHeight=" + this.f28150OooO00o.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0(", textLocale=");
                sbOooO0o2.append(this.f28150OooO00o.getTextLocales());
                sb.append(sbOooO0o2.toString());
            } else {
                StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0(", textLocale=");
                sbOooO0o3.append(this.f28150OooO00o.getTextLocale());
                sb.append(sbOooO0o3.toString());
            }
            StringBuilder sbOooO0o4 = OooO00o.OooO00o.OooO0o0(", typeface=");
            sbOooO0o4.append(this.f28150OooO00o.getTypeface());
            sb.append(sbOooO0o4.toString());
            if (i >= 26) {
                StringBuilder sbOooO0o5 = OooO00o.OooO00o.OooO0o0(", variationSettings=");
                sbOooO0o5.append(this.f28150OooO00o.getFontVariationSettings());
                sb.append(sbOooO0o5.toString());
            }
            StringBuilder sbOooO0o6 = OooO00o.OooO00o.OooO0o0(", textDir=");
            sbOooO0o6.append(this.f28151OooO0O0);
            sb.append(sbOooO0o6.toString());
            sb.append(", breakStrategy=" + this.f28152OooO0OO);
            sb.append(", hyphenationFrequency=" + this.f28153OooO0Oo);
            sb.append("}");
            return sb.toString();
        }

        @RequiresApi(28)
        public OooO00o(@NonNull PrecomputedText.Params params) {
            this.f28150OooO00o = params.getTextPaint();
            this.f28151OooO0O0 = params.getTextDirection();
            this.f28152OooO0OO = params.getBreakStrategy();
            this.f28153OooO0Oo = params.getHyphenationFrequency();
        }
    }
}
