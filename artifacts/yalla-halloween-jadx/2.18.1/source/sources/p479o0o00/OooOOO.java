package p479o0o00;

import Oooo000.o0000O00;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o000OO.OooO00o;
import o0O0O0O.OooOO0;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f40715Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ List<OooOo00> f40716Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OooOO0 oooOO1, List<OooOo00> list) {
        super(3);
        this.f40715Oooo0o = oooOO1;
        this.f40716Oooo0oO = list;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050 A[PHI: r1
      0x0050: PHI (r1v4 java.lang.Integer) = (r1v3 java.lang.Integer), (r1v14 java.lang.Integer) binds: [B:6:0x0039, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        int iIntValue;
        float fOooO00o;
        float fAbs;
        o00OOOO0 o00oooo2 = o00oooo1;
        oOO00O ooo00o2 = ooo00o;
        o0000O00.OooO00o(num, o00oooo2, "$this$composed", ooo00o2, -579024848);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (this.f40715Oooo0o.OooO() == 0) {
            ooo00o2.Oooo0o0();
            return o00oooo2;
        }
        OooOo00 oooOo00 = this.f40716Oooo0oO.get(this.f40715Oooo0o.OooO0o0());
        OooOO0 oooOO1 = this.f40715Oooo0o;
        Integer num2 = (Integer) oooOO1.f35357OooO0o.getValue();
        if (num2 == null) {
            Function0 function0 = (Function0) oooOO1.f35359OooO0oO.getValue();
            num2 = function0 != null ? (Integer) function0.invoke() : null;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else if (oooOO1.OooO00o() && Math.abs(oooOO1.OooO0oO()) >= 0.001f) {
                iIntValue = oooOO1.OooO0oO() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? RangesKt.coerceAtLeast(oooOO1.OooO0o0() - 1, 0) : RangesKt.coerceAtMost(oooOO1.OooO0o0() + 1, oooOO1.OooO() - 1);
            } else {
                iIntValue = oooOO1.OooO0o0();
            }
        } else {
            iIntValue = num2.intValue();
        }
        OooOo00 oooOo01 = (OooOo00) CollectionsKt.getOrNull(this.f40716Oooo0oO, iIntValue);
        if (oooOo01 != null) {
            float fAbs2 = Math.abs(this.f40715Oooo0o.OooO0oO() / Math.max(Math.abs(iIntValue - this.f40715Oooo0o.OooO0o0()), 1));
            fOooO00o = OooO00o.OooO00o(oooOo00.f40746OooO00o, oooOo01.f40746OooO00o, fAbs2);
            fAbs = Math.abs(OooO00o.OooO00o(oooOo00.f40747OooO0O0, oooOo01.f40747OooO0O0, fAbs2));
        } else {
            fOooO00o = oooOo00.f40746OooO00o;
            fAbs = oooOo00.f40747OooO0O0;
        }
        o00OOOO0 o00oooo0OooOO0o = SizeKt.OooOO0o(OffsetKt.OooO0OO(SizeKt.OooOOOO(SizeKt.OooO0o(o00oooo2), o00OO0O0.OooO00o.f4178OooO0oo, 2), fOooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), fAbs);
        ooo00o2.Oooo0o0();
        return o00oooo0OooOO0o;
    }
}
