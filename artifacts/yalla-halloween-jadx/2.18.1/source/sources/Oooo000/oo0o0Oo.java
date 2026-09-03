package Oooo000;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import p023Oooo00O.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo extends Lambda implements Function1<p023Oooo00O.oo0o0Oo, p145o00Oo0.o00000O0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ p167o00Ooo.OooO f1000Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(p167o00Ooo.OooO oooO) {
        super(1);
        this.f1000Oooo0o = oooO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final p145o00Oo0.o00000O0 invoke(p023Oooo00O.oo0o0Oo oo0o0oo) {
        p023Oooo00O.oo0o0Oo it = oo0o0oo;
        Intrinsics.checkNotNullParameter(it, "it");
        double d = 3.0f;
        float fPow = (float) Math.pow(it.f1322OooO0O0, d);
        float fPow2 = (float) Math.pow(it.f1323OooO0OO, d);
        float fPow3 = (float) Math.pow(it.f1324OooO0Oo, d);
        Function1<p167o00Ooo.OooO, o00OO0O0<p145o00Oo0.o00000O0, p023Oooo00O.oo0o0Oo>> function1 = o0O0O00.f979OooO00o;
        float[] fArr = o0O0O00.f981OooO0OO;
        float fOooO00o = o0O0O00.OooO00o(0, fPow, fPow2, fPow3, fArr);
        float fOooO00o2 = o0O0O00.OooO00o(1, fPow, fPow2, fPow3, fArr);
        float fOooO00o3 = o0O0O00.OooO00o(2, fPow, fPow2, fPow3, fArr);
        float fCoerceIn = RangesKt.coerceIn(it.f1321OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        float fCoerceIn2 = RangesKt.coerceIn(fOooO00o, -2.0f, 2.0f);
        float fCoerceIn3 = RangesKt.coerceIn(fOooO00o2, -2.0f, 2.0f);
        float fCoerceIn4 = RangesKt.coerceIn(fOooO00o3, -2.0f, 2.0f);
        p167o00Ooo.OooOOO0 oooOOO0 = p167o00Ooo.OooOOO0.f32567OooO00o;
        return new p145o00Oo0.o00000O0(p145o00Oo0.o00000O0.OooO0O0(p145o00Oo0.o00000OO.OooO00o(fCoerceIn2, fCoerceIn3, fCoerceIn4, fCoerceIn, p167o00Ooo.OooOOO0.f32582OooOOo), this.f1000Oooo0o));
    }
}
