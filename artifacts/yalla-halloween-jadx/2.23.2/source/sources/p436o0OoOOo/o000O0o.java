package p436o0OoOOo;

import com.yalla.yalla.ui.view.StateLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f47072OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(o0000 o0000Var) {
        super(0);
        this.f47072OooO0Oo = o0000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0000 o0000Var = this.f47072OooO0Oo;
        StateLayout stateLayout = o0000Var.f47028OooO0o0;
        if (stateLayout != null) {
            stateLayout.OooO0oo();
        }
        o0000Var.OooO0o();
        return Unit.INSTANCE;
    }
}
