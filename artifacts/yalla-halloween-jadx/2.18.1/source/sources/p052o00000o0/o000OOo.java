package p052o00000o0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o000OOo extends MetricAffectingSpan {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final String f27108Oooo0o;

    public o000OOo(@NotNull String fontFeatureSettings) {
        Intrinsics.checkNotNullParameter(fontFeatureSettings, "fontFeatureSettings");
        this.f27108Oooo0o = fontFeatureSettings;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f27108Oooo0o);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f27108Oooo0o);
    }
}
