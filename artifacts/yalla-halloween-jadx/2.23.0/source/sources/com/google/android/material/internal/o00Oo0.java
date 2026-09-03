package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import p545o0oO0Ooo.d1;
import p545o0oO0Ooo.f1;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f17315OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public d1 f17317OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public WeakReference<OooO0O0> f17318OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextPaint f17313OooO00o = new TextPaint(1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f17314OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f17316OooO0Oo = true;

    public class OooO00o extends f1 {
        public OooO00o() {
        }

        @Override // p545o0oO0Ooo.f1
        public final void OooO00o(int i) {
            o00Oo0 o00oo1 = o00Oo0.this;
            o00oo1.f17316OooO0Oo = true;
            OooO0O0 oooO0O0 = o00oo1.f17318OooO0o0.get();
            if (oooO0O0 != null) {
                oooO0O0.OooO00o();
            }
        }

        @Override // p545o0oO0Ooo.f1
        public final void OooO0O0(@NonNull Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            o00Oo0 o00oo1 = o00Oo0.this;
            o00oo1.f17316OooO0Oo = true;
            OooO0O0 oooO0O0 = o00oo1.f17318OooO0o0.get();
            if (oooO0O0 != null) {
                oooO0O0.OooO00o();
            }
        }
    }

    public interface OooO0O0 {
        void OooO00o();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public o00Oo0(@Nullable OooO0O0 oooO0O0) {
        this.f17318OooO0o0 = new WeakReference<>(null);
        this.f17318OooO0o0 = new WeakReference<>(oooO0O0);
    }

    public final float OooO00o(String str) {
        if (!this.f17316OooO0Oo) {
            return this.f17315OooO0OO;
        }
        float fMeasureText = str == null ? 0.0f : this.f17313OooO00o.measureText((CharSequence) str, 0, str.length());
        this.f17315OooO0OO = fMeasureText;
        this.f17316OooO0Oo = false;
        return fMeasureText;
    }

    public final void OooO0O0(@Nullable d1 d1Var, Context context) {
        if (this.f17317OooO0o != d1Var) {
            this.f17317OooO0o = d1Var;
            if (d1Var != null) {
                TextPaint textPaint = this.f17313OooO00o;
                OooO00o oooO00o = this.f17314OooO0O0;
                d1Var.OooO0o(context, textPaint, oooO00o);
                OooO0O0 oooO0O0 = this.f17318OooO0o0.get();
                if (oooO0O0 != null) {
                    textPaint.drawableState = oooO0O0.getState();
                }
                d1Var.OooO0o0(context, textPaint, oooO00o);
                this.f17316OooO0Oo = true;
            }
            OooO0O0 oooO0O1 = this.f17318OooO0o0.get();
            if (oooO0O1 != null) {
                oooO0O1.OooO00o();
                oooO0O1.onStateChange(oooO0O1.getState());
            }
        }
    }
}
