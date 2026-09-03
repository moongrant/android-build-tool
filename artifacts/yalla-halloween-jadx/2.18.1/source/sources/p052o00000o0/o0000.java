package p052o00000o0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o0000 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final float f27075Oooo0o;

    public o0000(float f) {
        this.f27075Oooo0o = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f27075Oooo0o);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f27075Oooo0o);
    }
}
