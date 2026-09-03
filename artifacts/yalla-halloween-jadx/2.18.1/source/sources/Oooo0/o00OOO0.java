package Oooo0;

import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0 {
    public static p048OoooooO.o00OOOO0 OooO00o(p048OoooooO.o00OOOO0 o00oooo1, float f) {
        ClosedFloatingPointRange valueRange = RangesKt__RangesKt.rangeTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(valueRange, "valueRange");
        return SemanticsModifierKt.OooO00o(o00oooo1, true, new o00OO(f, valueRange, 0));
    }
}
