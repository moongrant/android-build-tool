package p492o0o00OO0;

import com.code.android.util.o000O00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooOo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f49126OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(MomentDetailActivity momentDetailActivity) {
        super(0);
        this.f49126OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentDetailActivity.f25608Oooo0;
        MomentDetailActivity momentDetailActivity = this.f49126OooO0Oo;
        MomentDetailModel momentDetailModel = (MomentDetailModel) OooOo.OooO00o(momentDetailActivity);
        if (o0OoOo0.OooO00o(momentDetailModel != null ? Boolean.valueOf(MomentStateKt.isSystemDelete(momentDetailModel)) : null)) {
            o000O00.OooO00o(o000000.moment_delete_by_user);
            momentDetailActivity.finish();
        } else {
            MomentDetailModel momentDetailModel2 = (MomentDetailModel) OooOo.OooO00o(momentDetailActivity);
            if (o0OoOo0.OooO00o(momentDetailModel2 != null ? Boolean.valueOf(MomentStateKt.isApprovedState(momentDetailModel2)) : null)) {
                MomentDetailActivityVM momentDetailActivityVMOooOooO = momentDetailActivity.OooOooO();
                MomentDetailModel value = momentDetailActivity.OooOooO().getMPostDetailModel().getValue();
                Intrinsics.checkNotNull(value);
                momentDetailActivityVMOooOooO.follow(value);
            } else {
                o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
            }
        }
        return Unit.INSTANCE;
    }
}
