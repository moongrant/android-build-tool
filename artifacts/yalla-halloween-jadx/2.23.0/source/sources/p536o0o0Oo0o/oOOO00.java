package p536o0o0Oo0o;

import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55214OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00(MomentUserListVM momentUserListVM) {
        super(0);
        this.f55214OooO0Oo = momentUserListVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentUserListVM momentUserListVM = this.f55214OooO0Oo;
        momentUserListVM.getContentState().setValue(ContentState.Loading);
        MomentUserListVM.userMomentList$default(momentUserListVM, true, null, 2, null);
        return Unit.INSTANCE;
    }
}
