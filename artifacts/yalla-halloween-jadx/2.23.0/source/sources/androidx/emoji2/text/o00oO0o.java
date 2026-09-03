package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o implements Spannable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f5657OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public Spannable f5658OooO0o0;

    public static class OooO00o {
        public boolean OooO00o(Spannable spannable) {
            return spannable instanceof o0000O0O.o00O0O;
        }
    }

    @RequiresApi(28)
    public static class OooO0O0 extends OooO00o {
        @Override // androidx.emoji2.text.o00oO0o.OooO00o
        public final boolean OooO00o(Spannable spannable) {
            return o0ooOOo.OooO00o(spannable) || (spannable instanceof o0000O0O.o00O0O);
        }
    }

    public o00oO0o(@NonNull Spannable spannable) {
        this.f5658OooO0o0 = spannable;
    }

    public final void OooO00o() {
        Spannable spannable = this.f5658OooO0o0;
        if (!this.f5657OooO0Oo) {
            if ((Build.VERSION.SDK_INT < 28 ? new OooO00o() : new OooO0O0()).OooO00o(spannable)) {
                this.f5658OooO0o0 = new SpannableString(spannable);
            }
        }
        this.f5657OooO0Oo = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f5658OooO0o0.charAt(i);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public final IntStream chars() {
        return this.f5658OooO0o0.chars();
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public final IntStream codePoints() {
        return this.f5658OooO0o0.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5658OooO0o0.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5658OooO0o0.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5658OooO0o0.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f5658OooO0o0.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5658OooO0o0.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f5658OooO0o0.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        OooO00o();
        this.f5658OooO0o0.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        OooO00o();
        this.f5658OooO0o0.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final CharSequence subSequence(int i, int i2) {
        return this.f5658OooO0o0.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        return this.f5658OooO0o0.toString();
    }

    public o00oO0o(@NonNull CharSequence charSequence) {
        this.f5658OooO0o0 = new SpannableString(charSequence);
    }
}
