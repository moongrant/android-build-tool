package p432o0OoOOOo;

import com.yalla.yalla.ui.view.StateLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45947OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(o00OOOOo o00ooooo2) {
        super(0);
        this.f45947OooO0Oo = o00ooooo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OOOOo o00ooooo2 = this.f45947OooO0Oo;
        StateLayout stateLayout = o00ooooo2.f45925OooO0o0;
        if (stateLayout != null) {
            stateLayout.OooO0oo();
        }
        o00ooooo2.OooO0o();
        return Unit.INSTANCE;
    }
}
