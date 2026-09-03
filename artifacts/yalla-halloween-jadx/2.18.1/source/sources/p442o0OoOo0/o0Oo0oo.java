package p442o0OoOo0;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {
    @Stable
    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, float f) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        return !((f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : -1)) == 0) ? GraphicsLayerModifierKt.OooO0O0(o00oooo1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, null, false, 65279) : o00oooo1;
    }
}
