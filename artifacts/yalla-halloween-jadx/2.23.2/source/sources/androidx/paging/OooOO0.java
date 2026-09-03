package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p101o000oo.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends Lambda implements Function2<OooO0o.OooO00o, OooO0o.OooO00o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000 f10247OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(o00000 o00000Var) {
        super(2);
        this.f10247OooO0Oo = o00000Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(OooO0o.OooO00o oooO00o, OooO0o.OooO00o oooO00o2) {
        OooO0o.OooO00o prependHint = oooO00o;
        OooO0o.OooO00o appendHint = oooO00o2;
        Intrinsics.checkNotNullParameter(prependHint, "prependHint");
        Intrinsics.checkNotNullParameter(appendHint, "appendHint");
        o00000 o00000Var = prependHint.f10241OooO00o;
        LoadType loadType = LoadType.PREPEND;
        o00000 o00000Var2 = this.f10247OooO0Oo;
        if (o0000Ooo.OooO00o(o00000Var2, o00000Var, loadType)) {
            prependHint.f10241OooO00o = o00000Var2;
            prependHint.f10242OooO0O0.tryEmit(o00000Var2);
        }
        if (o0000Ooo.OooO00o(o00000Var2, appendHint.f10241OooO00o, LoadType.APPEND)) {
            appendHint.f10241OooO00o = o00000Var2;
            appendHint.f10242OooO0O0.tryEmit(o00000Var2);
        }
        return Unit.INSTANCE;
    }
}
