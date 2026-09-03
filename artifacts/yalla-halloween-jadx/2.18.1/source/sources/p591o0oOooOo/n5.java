package p591o0oOooOo;

import android.graphics.DashPathEffect;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooOO0;
import o00O0O.OooOo00;
import p145o00Oo0.o000Oo0;
import p145o00Oo0.o00O0O;
import p191o00o0O.o0Oo0oo;
import p507o0o00oOO.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class n5 extends Lambda implements Function1<o0Oo0oo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final n5 f47313Oooo0o = new n5();

    public n5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0Oo0oo o0oo0oo2) {
        o0Oo0oo Canvas = o0oo0oo2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        long j = o0000O0.f41727Oooo0OO;
        float f = 2;
        long jOooO00o = OooOO0.OooO00o(OooOo00.OooO0Oo(Canvas.OooO0OO()) / f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        long jOooO00o2 = OooOO0.OooO00o(OooOo00.OooO0Oo(Canvas.OooO0OO()) / f, OooOo00.OooO0O0(Canvas.OooO0OO()));
        float fOooO0Oo = OooOo00.OooO0Oo(Canvas.OooO0OO());
        int i = o000Oo0.f32111OooO00o;
        float[] intervals = {com.yalla.support.common.util.OooOo00.OooO00o(f), com.yalla.support.common.util.OooOo00.OooO00o(4)};
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Canvas.OooOo(j, jOooO00o, jOooO00o2, (384 & 8) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : fOooO0Oo, (384 & 16) != 0 ? 0 : 2, (384 & 32) != 0 ? null : new o00O0O(new DashPathEffect(intervals, 10.0f)), (384 & 64) != 0 ? 1.0f : 0.8f, null, (384 & 256) != 0 ? 3 : 0);
        return Unit.INSTANCE;
    }
}
