package p034OoooO0O;

import androidx.compose.foundation.text.Handle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o00000O.o0OO00O;
import o00000O.o0OOO0o;
import o0000O0O.o000oOoO;
import o00O0O.OooO;
import o00O0O.OooOO0;
import o0O0O00.Oooo0;
import p032OoooO0.o0O000;
import p032OoooO0.o0O0000O;
import p100o000oOoO.o0O00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O extends Lambda implements Function0<OooO> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0000oo f3513Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0O00O<o000oOoO> f3514OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o0000oo o0000ooVar, o0O00O<o000oOoO> o0o00o2) {
        super(0);
        this.f3513Oooo = o0000ooVar;
        this.f3514OoooO00 = o0o00o2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final OooO invoke() {
        long jOoooO0;
        int iOooO0Oo;
        o0O000 o0o000OooO0OO;
        o0OOO0o o0ooo0o2;
        Oooo0 oooo0;
        o0O000 o0o000OooO0OO2;
        Oooo0 oooo1;
        OooO OooO2;
        o0000oo manager = this.f3513Oooo;
        long j = this.f3514OoooO00.getValue().f27342OooO00o;
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (manager.OooOO0O().f27256OooO00o.f26774Oooo.length() == 0) {
            OooO.OooO00o oooO00o = OooO.f30409OooO0O0;
            jOoooO0 = OooO.f30412OooO0o0;
        } else {
            Handle handle = (Handle) manager.f3531OooOOO.getValue();
            int i = handle == null ? -1 : o0000O0.OooO0OO.$EnumSwitchMapping$0[handle.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    long j2 = manager.OooOO0O().f27257OooO0O0;
                    o0OO00O.OooO00o oooO00o2 = o0OO00O.f26893OooO0O0;
                    iOooO0Oo = (int) (j2 >> 32);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iOooO0Oo = o0OO00O.OooO0Oo(manager.OooOO0O().f27257OooO0O0);
                }
                int iCoerceIn = RangesKt.coerceIn(manager.f3521OooO0O0.OooO0O0(iOooO0Oo), (ClosedRange<Integer>) StringsKt.getIndices(manager.OooOO0O().f27256OooO00o.f26774Oooo));
                o0O0000O o0o0000o2 = manager.f3523OooO0Oo;
                if (o0o0000o2 == null || (o0o000OooO0OO = o0o0000o2.OooO0OO()) == null || (o0ooo0o2 = o0o000OooO0OO.f3328OooO00o) == null) {
                    OooO.OooO00o oooO00o3 = OooO.f30409OooO0O0;
                    jOoooO0 = OooO.f30412OooO0o0;
                } else {
                    long jOooO00o = o0ooo0o2.OooO0O0(iCoerceIn).OooO00o();
                    o0O0000O o0o0000o3 = manager.f3523OooO0Oo;
                    if (o0o0000o3 == null || (oooo0 = o0o0000o3.f3337OooO0o) == null || (o0o000OooO0OO2 = o0o0000o3.OooO0OO()) == null || (oooo1 = o0o000OooO0OO2.f3329OooO0O0) == null || (OooO2 = manager.OooO()) == null) {
                        OooO.OooO00o oooO00o4 = OooO.f30409OooO0O0;
                        jOoooO0 = OooO.f30412OooO0o0;
                    } else {
                        float fOooO0OO = OooO.OooO0OO(oooo1.OoooO0(oooo0, OooO2.f30413OooO00o));
                        int iOooO0oO = o0ooo0o2.OooO0oO(iCoerceIn);
                        int iOooOO0O = o0ooo0o2.OooOO0O(iOooO0oO);
                        int iOooO0o = o0ooo0o2.OooO0o(iOooO0oO, true);
                        long j3 = manager.OooOO0O().f27257OooO0O0;
                        o0OO00O.OooO00o oooO00o5 = o0OO00O.f26893OooO0O0;
                        boolean z = ((int) (j3 >> 32)) > o0OO00O.OooO0Oo(manager.OooOO0O().f27257OooO0O0);
                        float fOooO00o = o000O00.OooO00o(o0ooo0o2, iOooOO0O, true, z);
                        float fOooO00o2 = o000O00.OooO00o(o0ooo0o2, iOooO0o, false, z);
                        float fCoerceIn = RangesKt.coerceIn(fOooO0OO, Math.min(fOooO00o, fOooO00o2), Math.max(fOooO00o, fOooO00o2));
                        if (Math.abs(fOooO0OO - fCoerceIn) > ((int) (j >> 32)) / 2) {
                            OooO.OooO00o oooO00o6 = OooO.f30409OooO0O0;
                            jOoooO0 = OooO.f30412OooO0o0;
                        } else {
                            jOoooO0 = oooo0.OoooO0(oooo1, OooOO0.OooO00o(fCoerceIn, OooO.OooO0Oo(jOooO00o)));
                        }
                    }
                }
            } else {
                OooO.OooO00o oooO00o7 = OooO.f30409OooO0O0;
                jOoooO0 = OooO.f30412OooO0o0;
            }
        }
        return new OooO(jOoooO0);
    }
}
