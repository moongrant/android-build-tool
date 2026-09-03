package p535o0o0Oo0;

import com.code.android.util.o000O00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOOOoo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54343OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOOOoo(MomentVideoVM momentVideoVM) {
        super(0);
        this.f54343OooO0Oo = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentVideoVM momentVideoVM = this.f54343OooO0Oo;
        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
        if (o0OoOo0.OooO00o(currentMomentDetail != null ? Boolean.valueOf(MomentStateKt.isApprovedState(currentMomentDetail)) : null)) {
            momentVideoVM.toInputCommentOrReply(momentVideoVM.getCurrentComment(), null, true);
            momentVideoVM.getShowFastInputPanel().setValue(Boolean.TRUE);
            momentVideoVM.setNeedShowEmojiFacePanel(false);
        } else {
            o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
