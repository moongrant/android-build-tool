package p046Oooooo0;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.AudioSpec;
import java.util.List;
import o000OO.OooOOO;
import p028Oooo0oO.o00O0O0;
import p042OooooO0.o00OO00O;
import p042OooooO0.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0oOOo implements OooOOO<oOO00O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AudioSpec f2037OooO00o;

    public o0oOOo(@NonNull AudioSpec audioSpec) {
        this.f2037OooO00o = audioSpec;
    }

    @Override // o000OO.OooOOO
    @NonNull
    public final oOO00O get() {
        int iOooO0Oo;
        AudioSpec audioSpec = this.f2037OooO00o;
        int iOooO00o = o00OOOO0.OooO00o(audioSpec);
        int iOooO0O0 = o00OOOO0.OooO0O0(audioSpec);
        int iOooO0OO = audioSpec.OooO0OO();
        if (iOooO0OO == -1) {
            o00O0O0.OooO00o("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            iOooO0OO = 1;
        } else {
            o00O0O0.OooO00o("DefAudioResolver", "Using supplied AUDIO channel count: " + iOooO0OO);
        }
        Range<Integer> rangeOooO0Oo = audioSpec.OooO0Oo();
        if (AudioSpec.f3875OooO0O0.equals(rangeOooO0Oo)) {
            o00O0O0.OooO00o("DefAudioResolver", "Using fallback AUDIO sample rate: 44100Hz");
            iOooO0Oo = 44100;
        } else {
            iOooO0Oo = o00OOOO0.OooO0Oo(rangeOooO0Oo, iOooO0OO, iOooO0O0, ((Integer) rangeOooO0Oo.getUpper()).intValue());
            o00O0O0.OooO00o("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + iOooO0Oo + "Hz");
        }
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
