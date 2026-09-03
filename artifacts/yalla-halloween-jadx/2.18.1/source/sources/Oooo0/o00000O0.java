package Oooo0;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f547OooO00o = 30;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final p048OoooooO.o00OOOO0 f548OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final p048OoooooO.o00OOOO0 f549OooO0OO;

    public static final class OooO00o implements p145o00Oo0.o000OOo0 {
        @Override // p145o00Oo0.o000OOo0
        @NotNull
        public final p145o00Oo0.o0000OO0 OooO00o(long j, @NotNull LayoutDirection layoutDirection, @NotNull o0000O0O.OooO density) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            float f = o00000O0.f547OooO00o;
            float fOoooooO = density.OoooooO(o00000O0.f547OooO00o);
            return new o00Oo0.o0000OO0.OooO0O0(new o00O0O.OooOO0O(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -fOoooooO, o00O0O.OooOo00.OooO0Oo(j), o00O0O.OooOo00.OooO0O0(j) + fOoooooO));
        }
    }

    public static final class OooO0O0 implements p145o00Oo0.o000OOo0 {
        @Override // p145o00Oo0.o000OOo0
        @NotNull
        public final p145o00Oo0.o0000OO0 OooO00o(long j, @NotNull LayoutDirection layoutDirection, @NotNull o0000O0O.OooO density) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            float f = o00000O0.f547OooO00o;
            float fOoooooO = density.OoooooO(o00000O0.f547OooO00o);
            return new o00Oo0.o0000OO0.OooO0O0(new o00O0O.OooOO0O(-fOoooooO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0O.OooOo00.OooO0Oo(j) + fOoooooO, o00O0O.OooOo00.OooO0O0(j)));
        }
    }

    static {
        int i = p048OoooooO.o00OOOO0.f4197OooO00o;
        OoooooO.o00OOOO0.OooO00o oooO00o = OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
        f548OooO0O0 = p442o0OoOo0.Oooo000.OooO00o(oooO00o, new OooO00o());
        f549OooO0OO = p442o0OoOo0.Oooo000.OooO00o(oooO00o, new OooO0O0());
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final p048OoooooO.o00OOOO0 OooO00o(@NotNull p048OoooooO.o00OOOO0 o00oooo1, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return o00oooo1.OooOOoo(orientation == Orientation.Vertical ? f549OooO0OO : f548OooO0O0);
    }
}
