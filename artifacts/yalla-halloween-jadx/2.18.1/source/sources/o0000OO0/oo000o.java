package o0000OO0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(@NotNull View view, @NotNull Outline result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(result, "result");
        result.setRect(0, 0, view.getWidth(), view.getHeight());
        result.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }
}
