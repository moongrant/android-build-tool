package p046Oooooo0;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.AudioSpec;
import java.util.List;
import o000OO.OooOOO;
import p028Oooo0oO.o00O0O0;
import p042OooooO0.o00OO00O;
import p042OooooO0.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oo00oO implements OooOOO<oOO00O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AudioSpec f2038OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final EncoderProfilesProxy.AudioProfileProxy f2039OooO0O0;

    public oo00oO(@NonNull AudioSpec audioSpec, @NonNull EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.f2038OooO00o = audioSpec;
        this.f2039OooO0O0 = audioProfileProxy;
    }

    @Override // o000OO.OooOOO
    @NonNull
    public final oOO00O get() {
        AudioSpec audioSpec = this.f2038OooO00o;
        int iOooO00o = o00OOOO0.OooO00o(audioSpec);
        int iOooO0O0 = o00OOOO0.OooO0O0(audioSpec);
        int iOooO0OO = audioSpec.OooO0OO();
        Range<Integer> rangeOooO0Oo = audioSpec.OooO0Oo();
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f2039OooO0O0;
        int iOooO0O1 = audioProfileProxy.OooO0O0();
        if (iOooO0OO == -1) {
            o00O0O0.OooO00o("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + iOooO0O1);
            iOooO0OO = iOooO0O1;
        } else {
            o00O0O0.OooO00o("AudioSrcAdPrflRslvr", o0O00o0.OooO00o("Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: ", iOooO0O1, ", Resolved Channel Count: ", iOooO0OO, "]"));
        }
        int iOooO0o = audioProfileProxy.OooO0o();
        int iOooO0Oo = o00OOOO0.OooO0Oo(rangeOooO0Oo, iOooO0OO, iOooO0O0, iOooO0o);
        o00O0O0.OooO00o("AudioSrcAdPrflRslvr", o0O00o0.OooO00o("Using resolved AUDIO sample rate or nearest supported from AudioProfile: ", iOooO0Oo, "Hz. [AudioProfile sample rate: ", iOooO0o, "Hz]"));
        List<Integer> list = oOO00O.f1797OooO00o;
        o00OO00O.OooO00o oooO00o = new o00OO00O.OooO00o();
        oooO00o.f1784OooO00o = -1;
        oooO00o.f1785OooO0O0 = -1;
        oooO00o.f1786OooO0OO = -1;
        oooO00o.f1787OooO0Oo = -1;
        oooO00o.f1784OooO00o = Integer.valueOf(iOooO00o);
        oooO00o.f1787OooO0Oo = Integer.valueOf(iOooO0O0);
        oooO00o.f1786OooO0OO = Integer.valueOf(iOooO0OO);
        oooO00o.f1785OooO0O0 = Integer.valueOf(iOooO0Oo);
        return oooO00o.OooO00o();
    }
}
