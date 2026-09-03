package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f17326OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0OOO0O.OooO0o f17328OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public WeakReference<OooO0O0> f17329OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextPaint f17324OooO00o = new TextPaint(1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f17325OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f17327OooO0Oo = true;

    public class OooO00o extends o0OOO0O.OooOO0 {
        public OooO00o() {
        }

        @Override // o0OOO0O.OooOO0
        public final void OooO00o(int i) {
            OooOo oooOo = OooOo.this;
            oooOo.f17327OooO0Oo = true;
            OooO0O0 oooO0O0 = oooOo.f17329OooO0o0.get();
            if (oooO0O0 != null) {
                oooO0O0.OooO00o();
            }
        }

        @Override // o0OOO0O.OooOO0
        public final void OooO0O0(@NonNull Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            OooOo oooOo = OooOo.this;
            oooOo.f17327OooO0Oo = true;
            OooO0O0 oooO0O0 = oooOo.f17329OooO0o0.get();
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

    public OooOo(@Nullable OooO0O0 oooO0O0) {
        this.f17329OooO0o0 = new WeakReference<>(null);
        this.f17329OooO0o0 = new WeakReference<>(oooO0O0);
    }

    public final float OooO00o(String str) {
        if (!this.f17327OooO0Oo) {
            return this.f17326OooO0OO;
        }
        float fMeasureText = str == null ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f17324OooO00o.measureText((CharSequence) str, 0, str.length());
        this.f17326OooO0OO = fMeasureText;
        this.f17327OooO0Oo = false;
        return fMeasureText;
    }

    public final void OooO0O0(@Nullable o0OOO0O.OooO0o oooO0o, Context context) {
        if (this.f17328OooO0o != oooO0o) {
            this.f17328OooO0o = oooO0o;
            if (oooO0o != null) {
                oooO0o.OooO0o(context, this.f17324OooO00o, this.f17325OooO0O0);
                OooO0O0 oooO0O0 = this.f17329OooO0o0.get();
                if (oooO0O0 != null) {
                    this.f17324OooO00o.drawableState = oooO0O0.getState();
                }
                oooO0o.OooO0o0(context, this.f17324OooO00o, this.f17325OooO0O0);
                this.f17327OooO0Oo = true;
            }
            OooO0O0 oooO0O1 = this.f17329OooO0o0.get();
            if (oooO0O1 != null) {
                oooO0O1.OooO00o();
                oooO0O1.onStateChange(oooO0O1.getState());
            }
        }
    }
}
