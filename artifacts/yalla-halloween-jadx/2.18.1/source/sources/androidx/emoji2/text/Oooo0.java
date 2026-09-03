package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Objects;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Oooo0 extends OooOOO0 {
    public Oooo0(@NonNull EmojiMetadata emojiMetadata) {
        super(emojiMetadata);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @IntRange(from = ULong.MIN_VALUE) int i, @IntRange(from = ULong.MIN_VALUE) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Objects.requireNonNull(EmojiCompat.OooO00o());
        EmojiMetadata emojiMetadata = this.f8136Oooo0oO;
        Typeface typeface = emojiMetadata.f8104OooO0O0.f8141OooO0Oo;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(emojiMetadata.f8104OooO0O0.f8139OooO0O0, emojiMetadata.f8103OooO00o * 2, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}
