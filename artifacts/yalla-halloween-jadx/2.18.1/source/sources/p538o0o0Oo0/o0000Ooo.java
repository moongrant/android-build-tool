package p538o0o0Oo0;

import com.yalla.yalla.model.MomentSendCommentModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import com.yalla.yalla.ui.vm.message.MomentMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo extends Lambda implements Function1<MomentSendCommentModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f43919Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(MomentMessageListActivity momentMessageListActivity) {
        super(1);
        this.f43919Oooo0o = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentSendCommentModel momentSendCommentModel) {
        String jSONString;
        MomentSendCommentModel momentSendCommentModel2 = momentSendCommentModel;
        if (momentSendCommentModel2 != null) {
            MomentMessageListActivity momentMessageListActivity = this.f43919Oooo0o;
            MomentMessageListActivity.OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
            MomentMessageVM momentMessageVMOooOooo = momentMessageListActivity.OooOooo();
            String dyid = momentSendCommentModel2.getDyid();
            MomentSendContentModel content = momentSendCommentModel2.getContent();
            if (content == null || (jSONString = content.toJSONString()) == null) {
                jSONString = "";
            }
            momentMessageVMOooOooo.commentWriteMsg(dyid, jSONString, momentSendCommentModel2.getCid(), momentSendCommentModel2.getParentUserId(), momentSendCommentModel2.getParentUserName()).observe(momentMessageListActivity, new OooOo(new o00000O(momentMessageListActivity), new o00000OO(momentMessageListActivity), null, false, 12));
        }
        return Unit.INSTANCE;
    }
}
