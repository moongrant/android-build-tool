package p281o0O00o;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o000;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import o0000O0O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O00O0o;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO {
    @Deprecated(message = "\naccompanist/insets is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/insets/#migration\n", replaceWith = @ReplaceWith(expression = "insets.asPaddingValues()", imports = {"androidx.compose.foundation.layout.asPaddingValues"}))
    @Composable
    @NotNull
    public static final o0O00O0o OooO00o(@NotNull OooOO0 insets, boolean z, boolean z2, boolean z3, boolean z4, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        ooo00o.OooO0o0(-1165102418);
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        if ((i & 16) != 0) {
            z4 = true;
        }
        int i2 = i & 32;
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f2 = i2 != 0 ? 0 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f3 = (i & 64) != 0 ? 0 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f4 = (i & 128) != 0 ? 0 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if ((i & 256) != 0) {
            f = 0;
        }
        OooO oooO = (OooO) ooo00o.OooOO0o(o000.f6356OooO0o0);
        ooo00o.OooO0o0(511388516);
        boolean zOooo0oo = ooo00o.Oooo0oo(oooO) | ooo00o.Oooo0oo(insets);
        Object objOooO0o = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new OooOOO0(insets, oooO);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        OooOOO0 oooOOO0 = (OooOOO0) objOooO0o;
        oooOOO0.f35187OooO0OO.setValue(Boolean.valueOf(z));
        oooOOO0.f35188OooO0Oo.setValue(Boolean.valueOf(z2));
        oooOOO0.f35190OooO0o0.setValue(Boolean.valueOf(z3));
        oooOOO0.f35189OooO0o.setValue(Boolean.valueOf(z4));
        oooOOO0.f35191OooO0oO.setValue(new OooOOO0(f2));
        oooOOO0.f35192OooO0oo.setValue(new OooOOO0(f3));
        oooOOO0.f35184OooO.setValue(new OooOOO0(f4));
        oooOOO0.f35193OooOO0.setValue(new OooOOO0(f));
        ooo00o.Oooo0o0();
        return oooOOO0;
    }
}
