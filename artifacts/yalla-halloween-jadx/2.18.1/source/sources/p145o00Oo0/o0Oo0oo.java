package p145o00Oo0;

import androidx.compose.runtime.Immutable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooOO0;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public abstract class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f32145OooO00o = new OooO00o();

    public static final class OooO00o {
        public static o0Oo0oo OooO00o(List colors) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            long jOooO00o = OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            long jOooO00o2 = OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.POSITIVE_INFINITY);
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new o000OO(colors, jOooO00o, jOooO00o2, 0);
        }
    }

    public o0Oo0oo() {
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        long j = OooOo00.f30418OooO0Oo;
    }

    public abstract void OooO00o(long j, @NotNull o000 o000Var, float f);
}
