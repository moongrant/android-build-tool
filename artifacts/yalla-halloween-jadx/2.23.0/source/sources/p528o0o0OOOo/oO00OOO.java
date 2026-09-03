package p528o0o0OOOo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModelKt;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p143o00Oo000.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentCommentOnLongDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentOnLongDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentOnLongDialog$ShowDialogReplySonMore$1$2$1$1$1$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
public final class oO00OOO extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f53872OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53873OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f53874OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53875OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOO(MomentReplyVM momentReplyVM, MomentReplyModel momentReplyModel, MomentCommentsVM momentCommentsVM, MomentVideoVM momentVideoVM) {
        super(1);
        this.f53872OooO0Oo = momentReplyVM;
        this.f53874OooO0o0 = momentReplyModel;
        this.f53873OooO0o = momentCommentsVM;
        this.f53875OooO0oO = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object it) {
        Object next;
        long id;
        Long currentCommentId;
        OooO0O0<MomentReplyModel> replyPagerState;
        List<MomentReplyModel> list;
        List<MomentReplyModel> list2;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentReplyVM momentReplyVM = this.f53872OooO0Oo;
        OooO0O0<MomentReplyModel> replyPagerState2 = momentReplyVM.getReplyPagerState();
        if (replyPagerState2 != null && (list2 = replyPagerState2.f37663OooO0Oo) != null) {
            list2.remove(this.f53874OooO0o0);
        }
        OooO0O0<MomentCommentDetailModel> commentsPagerState = this.f53873OooO0o.getCommentsPagerState();
        MomentVideoVM momentVideoVM = this.f53875OooO0oO;
        boolean z = true;
        if (commentsPagerState != null) {
            OooO0O0<MomentReplyModel> replyPagerState3 = momentReplyVM.getReplyPagerState();
            List<MomentReplyModel> list3 = replyPagerState3 != null ? replyPagerState3.f37663OooO0Oo : null;
            MomentReplyModel momentReplyModel = ((list3 == null || list3.isEmpty()) || (replyPagerState = momentReplyVM.getReplyPagerState()) == null || (list = replyPagerState.f37663OooO0Oo) == null) ? null : list.get(0);
            Iterator<T> it2 = commentsPagerState.f37663OooO0Oo.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                id = ((MomentCommentDetailModel) next).getId();
                currentCommentId = momentVideoVM.getCurrentCommentId();
            } while (!(currentCommentId != null && id == currentCommentId.longValue()));
            MomentCommentDetailModel momentCommentDetailModel = (MomentCommentDetailModel) next;
            if (momentCommentDetailModel != null) {
                MomentDetailModelKt.commentNumDelete(momentVideoVM.getCurrentMomentDetail());
                LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentVideoVM.getCurrentMomentDetail());
                momentCommentDetailModel.replyDelete(momentReplyModel);
            }
            commentsPagerState.OooO0O0();
        }
        OooO0O0<MomentReplyModel> replyPagerState4 = momentReplyVM.getReplyPagerState();
        List<MomentReplyModel> list4 = replyPagerState4 != null ? replyPagerState4.f37663OooO0Oo : null;
        if (list4 != null && !list4.isEmpty()) {
            z = false;
        }
        if (z) {
            momentReplyVM.closeCommentReply();
            momentVideoVM.closeCommentReply();
        } else {
            OooO0O0<MomentReplyModel> replyPagerState5 = momentReplyVM.getReplyPagerState();
            if (replyPagerState5 != null) {
                replyPagerState5.OooO0O0();
            }
        }
        return Unit.INSTANCE;
    }
}
