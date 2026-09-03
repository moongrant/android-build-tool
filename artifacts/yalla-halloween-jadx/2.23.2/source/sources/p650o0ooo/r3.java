package p650o0ooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OOo000.OooO00o;
import o0OOo000.OooO0O0;
import o0OOo000.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class r3 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ v3 f59146OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f59147OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(v3 v3Var, OooO0O0 oooO0O0) {
        super(1);
        this.f59146OooO0Oo = v3Var;
        this.f59147OooO0o0 = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (this.f59146OooO0Oo.OooO0OO()) {
            Intrinsics.checkNotNull(str2);
            OooOO0 oooOO1 = new OooOO0(str2);
            OooO0O0 oooO0O0 = this.f59147OooO0o0;
            oooO0O0.OooO00o(oooOO1);
            OooO00o oooO00o = oooO0O0.f43005OooO00o;
            if (oooO00o != null) {
                oooO00o.OooO0Oo();
            }
        }
        return Unit.INSTANCE;
    }
}
