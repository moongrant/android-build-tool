package p052o00000o0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.Px;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o000000O extends MetricAffectingSpan {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final float f27078Oooo0o;

    public o000000O(@Px float f) {
        this.f27078Oooo0o = f;
    }

    public final void OooO00o(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return;
        }
        textPaint.setLetterSpacing(this.f27078Oooo0o / textScaleX);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        OooO00o(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        OooO00o(textPaint);
    }
}
