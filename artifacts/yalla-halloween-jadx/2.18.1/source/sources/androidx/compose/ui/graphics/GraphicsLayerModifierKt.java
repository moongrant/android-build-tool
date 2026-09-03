package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import androidx.recyclerview.widget.RecyclerView;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;
import p145o00Oo0.o0000;
import p145o00Oo0.o0000O00;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000OOo0;
import p145o00Oo0.o00O00;
import p145o00Oo0.o00O0000;
import p145o00Oo0.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayerModifierKt {
    @Stable
    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull Function1<? super o0000, Unit> block) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o0OOO0o(block));
    }

    public static o00OOOO0 OooO0O0(o00OOOO0 graphicsLayer, float f, float f2, float f3, float f4, float f5, o000OOo0 o000ooo1, boolean z, int i) {
        long j;
        float f6 = (i & 1) != 0 ? 1.0f : f;
        float f7 = (i & 2) != 0 ? 1.0f : f2;
        float f8 = (i & 4) != 0 ? 1.0f : f3;
        float f9 = (i & 128) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f4;
        float f10 = (i & 256) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f5;
        float f11 = (i & 512) != 0 ? 8.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if ((i & 1024) != 0) {
            o00O00.OooO00o oooO00o = o00O00.f32112OooO0O0;
            j = o00O00.f32113OooO0OO;
        } else {
            j = 0;
        }
        o000OOo0 shape = (i & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0 ? o000O0Oo.f32099OooO00o : o000ooo1;
        boolean z2 = (i & 4096) != 0 ? false : z;
        long j2 = (i & 16384) != 0 ? o0000O00.f32072OooO00o : 0L;
        long j3 = (i & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? o0000O00.f32072OooO00o : 0L;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return graphicsLayer.OooOOoo(new o00O0000(f6, f7, f8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f9, f10, f11, j, shape, z2, j2, j3));
    }
}
