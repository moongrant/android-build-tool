package p032OoooO0;

import androidx.compose.foundation.text.HandleState;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o00000O.o0OO00O;
import p034OoooO0O.o0000oo;
import p042Ooooo0o.o000O0O0;
import p054o00000oo.o00O0O00;
import p054o00000oo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 extends Lambda implements Function3<Integer, Integer, Boolean, Boolean> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0000oo f3012Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f3013Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f3014Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f3015Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f3016OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(o00O0O00 o00o0o01, boolean z, oo0oOO0 oo0ooo0, o0000oo o0000ooVar, o0O0000O o0o0000o2) {
        super(3);
        this.f3013Oooo0o = o00o0o01;
        this.f3014Oooo0oO = z;
        this.f3015Oooo0oo = oo0ooo0;
        this.f3012Oooo = o0000ooVar;
        this.f3016OoooO00 = o0o0000o2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        boolean zBooleanValue = bool.booleanValue();
        if (!zBooleanValue) {
            iIntValue = this.f3013Oooo0o.OooO00o(iIntValue);
        }
        if (!zBooleanValue) {
            iIntValue2 = this.f3013Oooo0o.OooO00o(iIntValue2);
        }
        boolean z = false;
        if (this.f3014Oooo0oO) {
            long j = this.f3015Oooo0oo.f27237OooO0O0;
            o0OO00O.OooO00o oooO00o = o0OO00O.f26874OooO0O0;
            if (iIntValue != ((int) (j >> 32)) || iIntValue2 != o0OO00O.OooO0Oo(j)) {
                if (RangesKt.coerceAtMost(iIntValue, iIntValue2) < 0 || RangesKt.coerceAtLeast(iIntValue, iIntValue2) > this.f3015Oooo0oo.f27236OooO00o.length()) {
                    o0000oo o0000ooVar = this.f3012Oooo;
                    o0O0000O o0o0000o2 = o0000ooVar.f3509OooO0Oo;
                    if (o0o0000o2 != null) {
                        o0o0000o2.f3318OooO = false;
                    }
                    o0000ooVar.OooOOO(HandleState.None);
                } else {
                    if (zBooleanValue || iIntValue == iIntValue2) {
                        o0000oo o0000ooVar2 = this.f3012Oooo;
                        o0O0000O o0o0000o3 = o0000ooVar2.f3509OooO0Oo;
                        if (o0o0000o3 != null) {
                            o0o0000o3.f3318OooO = false;
                        }
                        o0000ooVar2.OooOOO(HandleState.None);
                    } else {
                        this.f3012Oooo.OooO0oo();
                    }
                    this.f3016OoooO00.f3332OooOOOO.invoke(new oo0oOO0(this.f3015Oooo0oo.f27236OooO00o, o000O0O0.OooO00o(iIntValue, iIntValue2), (o0OO00O) null));
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
