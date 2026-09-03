package p519o0o0O0oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p152o00OoO.OooO;
import p152o00OoO.OooOO0;
import p152o00OoO.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class y3 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x3 f53217OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f53218OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(x3 x3Var, OooOO0 oooOO1) {
        super(1);
        this.f53217OooO0Oo = x3Var;
        this.f53218OooO0o0 = oooOO1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        if (this.f53217OooO0Oo.OooO0OO()) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            OooOOO0 oooOOO0 = new OooOOO0(it);
            OooOO0 oooOO1 = this.f53218OooO0o0;
            oooOO1.OooO00o(oooOOO0);
            OooO oooO = oooOO1.f38118OooO00o;
            if (oooO != null) {
                oooO.OooO0O0();
            }
        }
        return Unit.INSTANCE;
    }
}
