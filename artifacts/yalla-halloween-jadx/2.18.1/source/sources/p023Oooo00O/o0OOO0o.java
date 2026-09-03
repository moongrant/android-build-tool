package p023Oooo00O;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {
    public static o0ooOOo OooO00o(float f, float f2, int i) {
        return new o0ooOOo(oo0O.OooO0O0(FloatCompanionObject.INSTANCE), Float.valueOf(f), new o0Oo0oo((i & 2) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f2), (i & 4) != 0 ? Long.MIN_VALUE : 0L, (i & 8) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    public static o0ooOOo OooO0O0(o0ooOOo o0ooooo2) {
        float f = ((o0Oo0oo) o0ooooo2.f1239Oooo0oo).f1209OooO00o;
        long j = o0ooooo2.f1236Oooo;
        long j2 = o0ooooo2.f1241OoooO00;
        boolean z = o0ooooo2.f1240OoooO0;
        Intrinsics.checkNotNullParameter(o0ooooo2, "<this>");
        return new o0ooOOo(o0ooooo2.f1237Oooo0o, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), new o0Oo0oo(f), j, j2, z);
    }

    @NotNull
    public static final <T, V extends o0O0O00> V OooO0OO(@NotNull o00OO0O0<T, V> o00oo0o1, T t) {
        Intrinsics.checkNotNullParameter(o00oo0o1, "<this>");
        return (V) o000OOo.OooO0O0(o00oo0o1.OooO00o().invoke(t));
    }
}
