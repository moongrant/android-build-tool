package p121o00O0Ooo;

import com.airbnb.lottie.OooOO0O;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 extends Lambda implements Function1<Long, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f30909Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f30910Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(oo0o0Oo oo0o0oo, int i) {
        super(1);
        this.f30909Oooo0o = oo0o0oo;
        this.f30910Oooo0oO = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Long l) {
        long jLongValue = l.longValue();
        OooOO0O oooOO0OOooOO0 = this.f30909Oooo0o.OooOO0();
        boolean z = true;
        if (oooOO0OOooOO0 != null) {
            long jLongValue2 = ((Number) this.f30909Oooo0o.f30925OoooO.getValue()).longValue() == Long.MIN_VALUE ? 0L : jLongValue - ((Number) this.f30909Oooo0o.f30925OoooO.getValue()).longValue();
            oo0o0Oo.OooO0oo(this.f30909Oooo0o, jLongValue);
            o00000 o00000VarOooOOO0 = this.f30909Oooo0o.OooOOO0();
            float fOooO0O0 = o00000VarOooOOO0 == null ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : o00000VarOooOOO0.OooO0O0();
            o00000 o00000VarOooOOO1 = this.f30909Oooo0o.OooOOO0();
            float fOooO00o = o00000VarOooOOO1 == null ? 1.0f : o00000VarOooOOO1.OooO00o();
            float fOooO0OO = this.f30909Oooo0o.OooO0OO() * ((jLongValue2 / ((long) 1000000)) / oooOO0OOooOO0.OooO0O0());
            float fOooO0o0 = this.f30909Oooo0o.OooO0OO() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? fOooO0O0 - (this.f30909Oooo0o.OooO0o0() + fOooO0OO) : (this.f30909Oooo0o.OooO0o0() + fOooO0OO) - fOooO00o;
            if (fOooO0o0 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                oo0o0Oo oo0o0oo = this.f30909Oooo0o;
                oo0o0Oo.OooOOOO(oo0o0oo, RangesKt.coerceIn(oo0o0oo.OooO0o0(), fOooO0O0, fOooO00o) + fOooO0OO);
            } else {
                float f = fOooO00o - fOooO0O0;
                int i = ((int) (fOooO0o0 / f)) + 1;
                if (this.f30909Oooo0o.OooO0o() + i > this.f30910Oooo0oO) {
                    oo0o0Oo oo0o0oo2 = this.f30909Oooo0o;
                    oo0o0Oo.OooOOOO(oo0o0oo2, ((Number) oo0o0oo2.f30929OoooOO0.getValue()).floatValue());
                    oo0o0Oo.OooO00o(this.f30909Oooo0o, this.f30910Oooo0oO);
                    z = false;
                } else {
                    oo0o0Oo oo0o0oo3 = this.f30909Oooo0o;
                    oo0o0Oo.OooO00o(oo0o0oo3, oo0o0oo3.OooO0o() + i);
                    float f2 = fOooO0o0 - ((i - 1) * f);
                    oo0o0Oo oo0o0oo4 = this.f30909Oooo0o;
                    oo0o0Oo.OooOOOO(oo0o0oo4, oo0o0oo4.OooO0OO() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? fOooO00o - f2 : fOooO0O0 + f2);
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
