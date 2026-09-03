package p032OoooO0;

import com.qiniu.android.dns.NetworkInfo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p023Oooo00O.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O00 extends Lambda implements Function1<o000O0O0.OooO0O0<Float>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o00O0O00 f3170Oooo0o = new o00O0O00();

    public o00O0O00() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000O0O0.OooO0O0<Float> oooO0O0) {
        o000O0O0.OooO0O0<Float> keyframes = oooO0O0;
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.f1070OooO00o = 1000;
        keyframes.OooO00o(Float.valueOf(1.0f), 0);
        keyframes.OooO00o(Float.valueOf(1.0f), 499);
        keyframes.OooO00o(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), 500);
        keyframes.OooO00o(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), NetworkInfo.ISP_OTHER);
        return Unit.INSTANCE;
    }
}
