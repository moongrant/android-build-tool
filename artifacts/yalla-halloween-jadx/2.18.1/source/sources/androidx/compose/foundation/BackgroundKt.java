package androidx.compose.foundation;

import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000OOo0;
import p145o00Oo0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundKt {
    public static o00OOOO0 OooO00o(o00OOOO0 o00oooo1, o0Oo0oo brush, o000OOo0 o000ooo1, int i) {
        if ((i & 2) != 0) {
            o000ooo1 = o000O0Oo.f32099OooO00o;
        }
        o000OOo0 shape = o000ooo1;
        float f = (i & 4) != 0 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new Oooo0.OooO(null, brush, f, shape, 1));
    }

    @NotNull
    public static final o00OOOO0 OooO0O0(@NotNull o00OOOO0 background, long j, @NotNull o000OOo0 shape) {
        Intrinsics.checkNotNullParameter(background, "$this$background");
        Intrinsics.checkNotNullParameter(shape, "shape");
        o00000O0 o00000o1 = new o00000O0(j);
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return background.OooOOoo(new Oooo0.OooO(o00000o1, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, shape, 6));
    }
}
