package p543o0o0Ooo0;

import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55717OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(MomentUserListVM momentUserListVM) {
        super(0);
        this.f55717OooO0Oo = momentUserListVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentUserListVM.userMomentList$default(this.f55717OooO0Oo, true, null, 2, null);
        return Unit.INSTANCE;
    }
}
