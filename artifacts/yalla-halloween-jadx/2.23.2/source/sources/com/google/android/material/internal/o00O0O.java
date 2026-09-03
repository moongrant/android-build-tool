package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public CharSequence f16829OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TextPaint f16830OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f16831OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16832OooO0Oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f16838OooOO0O;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Layout.Alignment f16834OooO0o0 = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16833OooO0o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f16835OooO0oO = 0.0f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f16836OooO0oo = 1.0f;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f16828OooO = 1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f16837OooOO0 = true;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public TextUtils.TruncateAt f16839OooOO0o = null;

    public static class OooO00o extends Exception {
    }

    public o00O0O(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f16829OooO00o = charSequence;
        this.f16830OooO0O0 = textPaint;
        this.f16831OooO0OO = i;
        this.f16832OooO0Oo = charSequence.length();
    }

    public final StaticLayout OooO00o() throws OooO00o {
        if (this.f16829OooO00o == null) {
            this.f16829OooO00o = "";
        }
        int iMax = Math.max(0, this.f16831OooO0OO);
        CharSequence charSequenceEllipsize = this.f16829OooO00o;
        int i = this.f16833OooO0o;
        TextPaint textPaint = this.f16830OooO0O0;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f16839OooOO0o);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f16832OooO0Oo);
        this.f16832OooO0Oo = iMin;
        if (this.f16838OooOO0O && this.f16833OooO0o == 1) {
            this.f16834OooO0o0 = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f16834OooO0o0);
        builderObtain.setIncludePad(this.f16837OooOO0);
        builderObtain.setTextDirection(this.f16838OooOO0O ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f16839OooOO0o;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f16833OooO0o);
        float f = this.f16835OooO0oO;
        if (f != 0.0f || this.f16836OooO0oo != 1.0f) {
            builderObtain.setLineSpacing(f, this.f16836OooO0oo);
        }
        if (this.f16833OooO0o > 1) {
            builderObtain.setHyphenationFrequency(this.f16828OooO);
        }
        return builderObtain.build();
    }
}
