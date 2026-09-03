package p571o0oOo0o;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0.o0000OO0;
import p145o00Oo0.o000O0o;
import p145o00Oo0.o000OOo0;
import p145o00Oo0.o00Ooo;
import p145o00Oo0.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0OOO implements o000OOo0 {
    @Override // p145o00Oo0.o000OOo0
    @NotNull
    public final o0000OO0 OooO00o(long j, @NotNull LayoutDirection layoutDirection, @NotNull OooO density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        o000O0o o000o0oOooO00o = o00Ooo.OooO00o();
        o0OoOo0 o0oooo1 = (o0OoOo0) o000o0oOooO00o;
        o0oooo1.OooOO0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        o0oooo1.OooOOO(OooOo00.OooO0Oo(j), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        o0oooo1.OooOOO(OooOo00.OooO0Oo(j) / 2.0f, OooOo00.OooO0O0(j));
        return new o0000OO0.OooO00o(o000o0oOooO00o);
    }
}
