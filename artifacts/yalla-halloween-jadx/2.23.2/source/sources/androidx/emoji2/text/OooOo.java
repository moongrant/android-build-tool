package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public abstract class OooOo extends ReplacementSpan {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TypefaceEmojiRasterizer f5631OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Paint.FontMetricsInt f5629OooO0Oo = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public short f5630OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f5632OooO0oO = 1.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public OooOo(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        o000OO.OooOOO0.OooO0o0(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.f5631OooO0o0 = typefaceEmojiRasterizer;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f5629OooO0Oo;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        TypefaceEmojiRasterizer typefaceEmojiRasterizer = this.f5631OooO0o0;
        p060o0000o0.o0OoOo0 o0oooo0OooO0OO = typefaceEmojiRasterizer.OooO0OO();
        int iOooO00o = o0oooo0OooO0OO.OooO00o(14);
        this.f5632OooO0oO = fAbs / (iOooO00o != 0 ? o0oooo0OooO0OO.f33748OooO0O0.getShort(iOooO00o + o0oooo0OooO0OO.f33747OooO00o) : (short) 0);
        p060o0000o0.o0OoOo0 o0oooo0OooO0OO2 = typefaceEmojiRasterizer.OooO0OO();
        int iOooO00o2 = o0oooo0OooO0OO2.OooO00o(14);
        if (iOooO00o2 != 0) {
            o0oooo0OooO0OO2.f33748OooO0O0.getShort(iOooO00o2 + o0oooo0OooO0OO2.f33747OooO00o);
        }
        p060o0000o0.o0OoOo0 o0oooo0OooO0OO3 = typefaceEmojiRasterizer.OooO0OO();
        int iOooO00o3 = o0oooo0OooO0OO3.OooO00o(12);
        short s = (short) ((iOooO00o3 != 0 ? o0oooo0OooO0OO3.f33748OooO0O0.getShort(iOooO00o3 + o0oooo0OooO0OO3.f33747OooO00o) : (short) 0) * this.f5632OooO0oO);
        this.f5630OooO0o = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
