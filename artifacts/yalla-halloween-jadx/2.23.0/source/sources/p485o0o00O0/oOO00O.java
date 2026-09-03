package p485o0o00O0;

import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import com.yalla.yalla.ui.vm.message.MomentMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends Lambda implements Function1<MomentSendCommentModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f48142OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(MomentMessageListActivity momentMessageListActivity) {
        super(1);
        this.f48142OooO0Oo = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentSendCommentModel momentSendCommentModel) {
        String jSONString;
        MomentSendCommentModel momentSendCommentModel2 = momentSendCommentModel;
        if (momentSendCommentModel2 != null) {
            int i = MomentMessageListActivity.f26116OooOoOO;
            MomentMessageListActivity momentMessageListActivity = this.f48142OooO0Oo;
            MomentMessageVM momentMessageVMOooOoO = momentMessageListActivity.OooOoO();
            String dyid = momentSendCommentModel2.getDyid();
            MomentSendContentModel content = momentSendCommentModel2.getContent();
            if (content == null || (jSONString = content.toJSONString()) == null) {
                jSONString = "";
            }
            momentMessageVMOooOoO.commentWriteMsg(dyid, jSONString, momentSendCommentModel2.getCid(), momentSendCommentModel2.getParentUserId(), momentSendCommentModel2.getParentUserName()).observe(momentMessageListActivity, new o0000OO0(new o00O00(momentMessageListActivity), new o00O00O(momentMessageListActivity), null, false, 12));
        }
        return Unit.INSTANCE;
    }
}
