package p642o0ooOOo;

import androidx.constraintlayout.core.state.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00o0 extends Lambda implements Function1<oO0000O, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO0 f59537OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ooo0Oo0 f59538OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(o0OO0 o0oo1, o oVar) {
        super(1);
        this.f59537OooO0Oo = o0oo1;
        this.f59538OooO0o0 = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oO0000O oo0000o) {
        oO0000O state = oo0000o;
        Intrinsics.checkNotNullParameter(state, "state");
        OooO00o OooO00o2 = state.OooO00o(this.f59537OooO0Oo.f59518OooO00o);
        o oVar = (o) this.f59538OooO0o0;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        OooO00o2.f4313Oooo00o = oVar.f59517OooO00o.invoke(state);
        return Unit.INSTANCE;
    }
}
