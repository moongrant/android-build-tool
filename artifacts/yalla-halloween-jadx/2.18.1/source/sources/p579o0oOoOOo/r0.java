package p579o0oOoOOo;

import android.webkit.WebView;
import com.yalla.yalla.common.util.WebPageInfo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o00O00o0;
import p033OoooO00.o00O0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p325o0O0oo0o.o000O0O0;
import p442o0OoOo0.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<WebView> f46256Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f46257Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f46258Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ WebPageInfo f46259Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(o000O0O0 o000o0o1, o0O00OO<Boolean> o0o00oo2, WebPageInfo webPageInfo, o0O00OO<WebView> o0o00oo3) {
        super(3);
        this.f46257Oooo0o = o000o0o1;
        this.f46258Oooo0oO = o0o00oo2;
        this.f46259Oooo0oo = webPageInfo;
        this.f46256Oooo = o0o00oo3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
        o00O00o0 ContentStatus = o00o00o1;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            float f = 24;
            o00OOOO0 o00oooo0OooO00o = Oooo000.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, o00O0O.OooO0o0(f, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12));
            o000O0O0 o000o0o1 = this.f46257Oooo0o;
            p0 p0Var = new p0(this.f46259Oooo0oo, this.f46256Oooo);
            o0O00OO<Boolean> o0o00oo2 = this.f46258Oooo0oO;
            ooo00o2.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00o2.Oooo0oo(o0o00oo2);
            Object objOooO0o = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new q0(o0o00oo2);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            p571o0oOo0o.o000O0O0.OooO00o(o000o0o1, o00oooo0OooO00o, p0Var, (Function0) objOooO0o, ooo00o2, 0, 0);
        }
        return Unit.INSTANCE;
    }
}
