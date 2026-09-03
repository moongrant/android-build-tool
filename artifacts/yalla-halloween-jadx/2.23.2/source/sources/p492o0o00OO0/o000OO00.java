package p492o0o00OO0;

import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o000O0.OooOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f49145OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(MomentDetailActivity momentDetailActivity) {
        super(0);
        this.f49145OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        int i = MomentDetailActivity.f25608Oooo0;
        MomentDetailActivity momentDetailActivity = this.f49145OooO0Oo;
        MomentDetailModel momentDetailModel = (MomentDetailModel) OooOo.OooO00o(momentDetailActivity);
        Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(lValueOf);
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, momentDetailActivity, sb.toString(), false, 12);
        return Unit.INSTANCE;
    }
}
