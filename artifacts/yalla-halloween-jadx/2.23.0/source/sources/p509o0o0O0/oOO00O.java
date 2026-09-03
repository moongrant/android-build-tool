package p509o0o0O0;

import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import com.yalla.yalla.ui.composable.moment.TempAtVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f51322OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ TempAtVM f51323OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51324OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(TempAtVM tempAtVM, MomentVideoVM momentVideoVM, CoroutineScope coroutineScope) {
        super(0);
        this.f51322OooO0Oo = momentVideoVM;
        this.f51324OooO0o0 = coroutineScope;
        this.f51323OooO0o = tempAtVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentVideoVM momentVideoVM = this.f51322OooO0Oo;
        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
        if (o0OoOo0.OooO00o(currentMomentDetail != null ? Boolean.valueOf(MomentStateKt.isApprovedState(currentMomentDetail)) : null)) {
            momentVideoVM.toInputCommentOrReply(momentVideoVM.getCurrentComment(), null, true);
            int i = AtFriendsActivity.f25620OooOooO;
            AtFriendsActivity.OooO00o.OooO00o(new o00O00O(this.f51323OooO0o, momentVideoVM, this.f51324OooO0o0));
            momentVideoVM.getShowFastInputPanel().setValue(Boolean.FALSE);
            momentVideoVM.setNeedShowEmojiFacePanel(false);
        } else {
            o000O00O.OooO00o(oO00OOo0.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
