package androidx.compose.animation.core;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO;
import o00O0O.OooOO0;
import o00O0O.OooOO0O;
import p023Oooo00O.o00O000o;
import p023Oooo00O.o00oO0o;
import p023Oooo00O.o0O00000;
import p023Oooo00O.oo00o;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
public final class TransitionKt$animateOffset$1 extends Lambda implements Function3<oo00o.OooO0O0<Object>, oOO00O, Integer, o00O000o<OooO>> {
    static {
        new TransitionKt$animateOffset$1();
    }

    public TransitionKt$animateOffset$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00O000o<OooO> invoke(oo00o.OooO0O0<Object> oooO0O0, oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(oooO0O0, "$this$null");
        ooo00o2.OooO0o0(1623385561);
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        OooOO0O oooOO0O = o0O00000.f1194OooO00o;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        o00O000o<OooO> o00o000oOooO0OO = o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, new OooO(OooOO0.OooO00o(0.5f, 0.5f)), 3);
        ooo00o2.Oooo0o0();
        return o00o000oOooO0OO;
    }
}
