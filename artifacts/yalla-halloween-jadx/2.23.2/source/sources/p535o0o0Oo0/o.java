package p535o0o0Oo0;

import com.code.android.util.OooOOO;
import com.code.android.util.o000O00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53623OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f53624OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f53625OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MomentVideoVM momentVideoVM, MomentReplyModel momentReplyModel, CoroutineScope coroutineScope) {
        super(0);
        this.f53623OooO0Oo = momentVideoVM;
        this.f53625OooO0o0 = momentReplyModel;
        this.f53624OooO0o = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentVideoVM momentVideoVM = this.f53623OooO0Oo;
        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
        if (o0OoOo0.OooO00o(currentMomentDetail != null ? Boolean.valueOf(MomentStateKt.isApprovedState(currentMomentDetail)) : null)) {
            MomentVideoVM.toInputCommentOrReply$default(momentVideoVM, momentVideoVM.getCurrentComment(), this.f53625OooO0o0, false, 4, null);
            OooOOO.OooO0O0(this.f53624OooO0o, new ooo0Oo0(momentVideoVM, null));
        } else {
            o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
