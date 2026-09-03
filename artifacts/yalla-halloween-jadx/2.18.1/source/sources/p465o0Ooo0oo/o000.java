package p465o0Ooo0oo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 extends ReplacementSpan {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f40473Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f40474Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f40475Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f40476Oooo0oo;

    public o000(int i, int i2, int i3) {
        this.f40474Oooo0o = i;
        this.f40475Oooo0oO = i2;
        this.f40476Oooo0oo = i3;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int i, int i2, float f, int i3, int i4, int i5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        int color = this.f40476Oooo0oo;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(this.f40474Oooo0o);
        paint.setAntiAlias(true);
        float f2 = i4;
        RectF rectF = new RectF(f, paint.ascent() + f2, this.f40473Oooo + f, paint.descent() + f2);
        float f3 = this.f40475Oooo0oO;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        paint.setColor(color);
        canvas.drawText(text, i, i2, f + this.f40475Oooo0oO, f2, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NotNull Paint paint, @Nullable CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        int iMeasureText = (int) (paint.measureText(charSequence, i, i2) + (this.f40475Oooo0oO * 2));
        this.f40473Oooo = iMeasureText;
        return iMeasureText;
    }
}
