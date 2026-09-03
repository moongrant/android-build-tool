package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements Spannable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f8149Oooo0o = false;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public Spannable f8150Oooo0oO;

    @RequiresApi(24)
    public static class OooO00o {
        public static IntStream OooO00o(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream OooO0O0(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    public static class OooO0O0 {
        public boolean OooO00o(CharSequence charSequence) {
            return charSequence instanceof o000O0Oo.OooO0O0;
        }
    }

    @RequiresApi(28)
    public static class OooO0OO extends OooO0O0 {
        @Override // androidx.emoji2.text.o000oOoO.OooO0O0
        public final boolean OooO00o(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof o000O0Oo.OooO0O0);
        }
    }

    public o000oOoO(@NonNull Spannable spannable) {
        this.f8150Oooo0oO = spannable;
    }

    public final void OooO00o() {
        Spannable spannable = this.f8150Oooo0oO;
        if (!this.f8149Oooo0o) {
            if ((Build.VERSION.SDK_INT < 28 ? new OooO0O0() : new OooO0OO()).OooO00o(spannable)) {
                this.f8150Oooo0oO = new SpannableString(spannable);
            }
        }
        this.f8149Oooo0o = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f8150Oooo0oO.charAt(i);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public final IntStream chars() {
        return OooO00o.OooO00o(this.f8150Oooo0oO);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public final IntStream codePoints() {
        return OooO00o.OooO0O0(this.f8150Oooo0oO);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f8150Oooo0oO.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f8150Oooo0oO.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f8150Oooo0oO.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f8150Oooo0oO.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8150Oooo0oO.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f8150Oooo0oO.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        OooO00o();
        this.f8150Oooo0oO.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        OooO00o();
        this.f8150Oooo0oO.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final CharSequence subSequence(int i, int i2) {
        return this.f8150Oooo0oO.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        return this.f8150Oooo0oO.toString();
    }

    public o000oOoO(@NonNull CharSequence charSequence) {
        this.f8150Oooo0oO = new SpannableString(charSequence);
    }
}
