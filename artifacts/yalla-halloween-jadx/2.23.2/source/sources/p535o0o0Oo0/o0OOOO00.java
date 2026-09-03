package p535o0o0Oo0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModelKt;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p188o00o00oO.o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f53801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53802OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f53803OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentCommentDetailModel momentCommentDetailModel, MomentReplyVM momentReplyVM) {
        super(1);
        this.f53800OooO0Oo = momentVideoVM;
        this.f53802OooO0o0 = momentCommentsVM;
        this.f53801OooO0o = momentCommentDetailModel;
        this.f53803OooO0oO = momentReplyVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object it) {
        List<MomentCommentDetailModel> list;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentVideoVM momentVideoVM = this.f53800OooO0Oo;
        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
        if (currentMomentDetail != null) {
            MomentDetailModelKt.commentNumDelete(currentMomentDetail);
        }
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentVideoVM.getCurrentMomentDetail());
        if (momentVideoVM.getCurrentComment() != null) {
            this.f53803OooO0oO.closeCommentReply();
            momentVideoVM.closeCommentReply();
        }
        MomentCommentsVM momentCommentsVM = this.f53802OooO0o0;
        o000<MomentCommentDetailModel> commentsPagerState = momentCommentsVM.getCommentsPagerState();
        if (commentsPagerState != null && (list = commentsPagerState.f38497OooO0Oo) != null) {
            list.remove(this.f53801OooO0o);
        }
        o000<MomentCommentDetailModel> commentsPagerState2 = momentCommentsVM.getCommentsPagerState();
        if (commentsPagerState2 != null) {
            commentsPagerState2.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
