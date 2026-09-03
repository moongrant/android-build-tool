package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.Constructor;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo00 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static boolean f17331OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int f17332OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public static Constructor<StaticLayout> f17333OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public static TextDirectionHeuristic f17334OooOOOo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public CharSequence f17336OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TextPaint f17337OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f17338OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f17339OooO0Oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f17345OooOO0O;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Layout.Alignment f17341OooO0o0 = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f17340OooO0o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f17342OooO0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f17343OooO0oo = 1.0f;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f17335OooO = f17332OooOOO0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f17344OooOO0 = true;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public TextUtils.TruncateAt f17346OooOO0o = null;

    public static class OooO00o extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        public OooO00o(Throwable th) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Error thrown initializing StaticLayout ");
            sbOooO0o0.append(th.getMessage());
            super(sbOooO0o0.toString(), th);
        }
    }

    static {
        f17332OooOOO0 = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public OooOo00(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f17336OooO00o = charSequence;
        this.f17337OooO0O0 = textPaint;
        this.f17338OooO0OO = i;
        this.f17339OooO0Oo = charSequence.length();
    }

    public final StaticLayout OooO00o() throws OooO00o {
        if (this.f17336OooO00o == null) {
            this.f17336OooO00o = "";
        }
        int iMax = Math.max(0, this.f17338OooO0OO);
        CharSequence charSequenceEllipsize = this.f17336OooO00o;
        if (this.f17340OooO0o == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f17337OooO0O0, iMax, this.f17346OooOO0o);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f17339OooO0Oo);
        this.f17339OooO0Oo = iMin;
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            if (!f17331OooOOO) {
                try {
                    f17334OooOOOo = this.f17345OooOO0O && i >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    f17333OooOOOO = declaredConstructor;
                    declaredConstructor.setAccessible(true);
                    f17331OooOOO = true;
                } catch (Exception e) {
                    throw new OooO00o(e);
                }
            }
            try {
                Constructor<StaticLayout> constructor = f17333OooOOOO;
                Objects.requireNonNull(constructor);
                TextDirectionHeuristic textDirectionHeuristic = f17334OooOOOo;
                Objects.requireNonNull(textDirectionHeuristic);
                return constructor.newInstance(charSequenceEllipsize, 0, Integer.valueOf(this.f17339OooO0Oo), this.f17337OooO0O0, Integer.valueOf(iMax), this.f17341OooO0o0, textDirectionHeuristic, Float.valueOf(1.0f), Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), Boolean.valueOf(this.f17344OooOO0), null, Integer.valueOf(iMax), Integer.valueOf(this.f17340OooO0o));
            } catch (Exception e2) {
                throw new OooO00o(e2);
            }
        }
        if (this.f17345OooOO0O && this.f17340OooO0o == 1) {
            this.f17341OooO0o0 = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, this.f17337OooO0O0, iMax);
        builderObtain.setAlignment(this.f17341OooO0o0);
        builderObtain.setIncludePad(this.f17344OooOO0);
        builderObtain.setTextDirection(this.f17345OooOO0O ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f17346OooOO0o;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f17340OooO0o);
        float f = this.f17342OooO0oO;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || this.f17343OooO0oo != 1.0f) {
            builderObtain.setLineSpacing(f, this.f17343OooO0oo);
        }
        if (this.f17340OooO0o > 1) {
            builderObtain.setHyphenationFrequency(this.f17335OooO);
        }
        return builderObtain.build();
    }
}
