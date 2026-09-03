package p543o0o0Ooo0;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55471OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(FragmentActivity fragmentActivity) {
        super(0);
        this.f55471OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00000OO.OooOO0 oooOO1 = o00000OO.f56664OooO0o0;
        FragmentActivity fragmentActivity = this.f55471OooO0Oo;
        oooOO1.observe(fragmentActivity, new oo000000.OooOOO(new m(fragmentActivity)));
        return Unit.INSTANCE;
    }
}
