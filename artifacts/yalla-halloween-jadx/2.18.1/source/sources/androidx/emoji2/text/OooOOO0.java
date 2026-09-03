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
public abstract class OooOOO0 extends ReplacementSpan {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final EmojiMetadata f8136Oooo0oO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Paint.FontMetricsInt f8135Oooo0o = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f8137Oooo0oo = 1.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public OooOOO0(@NonNull EmojiMetadata emojiMetadata) {
        o000OO0O.OooOOO0.OooO0Oo(emojiMetadata, "metadata cannot be null");
        this.f8136Oooo0oO = emojiMetadata;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f8135Oooo0o);
        Paint.FontMetricsInt fontMetricsInt2 = this.f8135Oooo0o;
        this.f8137Oooo0oo = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f8136Oooo0oO.OooO0OO();
        this.f8136Oooo0oO.OooO0OO();
        o000OOo0.OooO00o oooO00oOooO0o0 = this.f8136Oooo0oO.OooO0o0();
        int iOooO00o = oooO00oOooO0o0.OooO00o(12);
        short s = (short) ((iOooO00o != 0 ? oooO00oOooO0o0.f28285OooO0O0.getShort(iOooO00o + oooO00oOooO0o0.f28284OooO00o) : (short) 0) * this.f8137Oooo0oo);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f8135Oooo0o;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s;
    }
}
