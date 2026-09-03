package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00Oo0 extends OooOo {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public TextPaint f5670OooO0oo;

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @IntRange(from = ULong.MIN_VALUE) int i, @IntRange(from = ULong.MIN_VALUE) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f5670OooO0oo;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f5670OooO0oo = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint2 instanceof TextPaint) {
                    textPaint = (TextPaint) paint2;
                }
            } else if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f5630OooO0o, i5, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        EmojiCompat.OooO00o().getClass();
        float f2 = i4;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        TypefaceEmojiRasterizer typefaceEmojiRasterizer = this.f5631OooO0o0;
        o0OoOo0 o0oooo1 = typefaceEmojiRasterizer.f5663OooO0O0;
        Typeface typeface = o0oooo1.f5676OooO0Oo;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText(o0oooo1.f5674OooO0O0, typefaceEmojiRasterizer.f5662OooO00o * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }
}
