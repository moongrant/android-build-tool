package p536o0o0Oo0o;

import com.yalla.yalla.model.user.UserMomentListTypeModel;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O0 extends Lambda implements Function1<UserMomentListTypeModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55189OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O0(MomentUserListVM momentUserListVM) {
        super(1);
        this.f55189OooO0Oo = momentUserListVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserMomentListTypeModel userMomentListTypeModel) {
        UserMomentListTypeModel it = userMomentListTypeModel;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentUserListVM.userMomentList$default(this.f55189OooO0Oo, true, null, 2, null);
        return Unit.INSTANCE;
    }
}
