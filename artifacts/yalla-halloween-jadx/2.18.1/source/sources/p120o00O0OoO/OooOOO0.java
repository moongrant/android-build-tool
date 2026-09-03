package p120o00O0OoO;

import Oooo000.o00O00;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends Oooo000<Integer> {
    public OooOOO0(List<o000OOo<Integer>> list) {
        super(list);
    }

    @Override // p120o00O0OoO.OooOO0O
    public final Object OooO0oO(o000OOo o000ooo2, float f) {
        return Integer.valueOf(OooOO0o(o000ooo2, f));
    }

    public final int OooOO0o(o000OOo<Integer> o000ooo2, float f) {
        Integer num = o000ooo2.f31157OooO0O0;
        if (num == null || o000ooo2.f31158OooO0OO == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = o000ooo2.f31158OooO0OO.intValue();
        o000000O<A> o000000o2 = this.f30770OooO0o0;
        if (o000000o2 != 0) {
            o000ooo2.f31163OooO0oo.floatValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            Integer numValueOf2 = Integer.valueOf(iIntValue2);
            OooO0o0();
            Integer num2 = (Integer) o000000o2.OooO0O0(numValueOf, numValueOf2);
            if (num2 != null) {
                return num2.intValue();
            }
        }
        return o00O00.OooOO0(o000O0.OooO0O0(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f), iIntValue, iIntValue2);
    }
}
