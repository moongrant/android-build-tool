package p492o0o00OO0;

import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import com.yalla.yalla.ui.vm.message.MomentMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O extends Lambda implements Function1<MomentSendCommentModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f49157OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(MomentMessageListActivity momentMessageListActivity) {
        super(1);
        this.f49157OooO0Oo = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentSendCommentModel momentSendCommentModel) {
        String jSONString;
        MomentSendCommentModel momentSendCommentModel2 = momentSendCommentModel;
        if (momentSendCommentModel2 != null) {
            int i = MomentMessageListActivity.f25667OooOoOO;
            MomentMessageListActivity momentMessageListActivity = this.f49157OooO0Oo;
            MomentMessageVM momentMessageVMOooOoO = momentMessageListActivity.OooOoO();
            String dyid = momentSendCommentModel2.getDyid();
            MomentSendContentModel content = momentSendCommentModel2.getContent();
            if (content == null || (jSONString = content.toJSONString()) == null) {
                jSONString = "";
            }
            momentMessageVMOooOoO.commentWriteMsg(dyid, jSONString, momentSendCommentModel2.getCid(), momentSendCommentModel2.getParentUserId(), momentSendCommentModel2.getParentUserName()).observe(momentMessageListActivity, new o000oOoO(new o00O000o(momentMessageListActivity), new o00O00(momentMessageListActivity), null, false, 12));
        }
        return Unit.INSTANCE;
    }
}
