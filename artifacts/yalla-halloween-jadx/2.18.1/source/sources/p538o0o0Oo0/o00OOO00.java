package p538o0o0Oo0;

import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogActionTypeCommentReply;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendCommentModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p168o00Ooo0.o0O0O00;
import p498o0o00Oo0.o00O0O0;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO00 extends Lambda implements Function2<PostCommentSonModel, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f43969Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
        super(2);
        this.f43969Oooo0o = postDetailCommentSonListActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(PostCommentSonModel postCommentSonModel, Integer num) {
        PostCommentSonModel data = postCommentSonModel;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(data, "data");
        PostDetailCommentSonListActivity postDetailCommentSonListActivity = this.f43969Oooo0o;
        PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
        postDetailCommentSonListActivity.OooOooo().addData(iIntValue, data);
        this.f43969Oooo0o.Oooo000().f49460OooO0oo.smoothScrollToPosition(this.f43969Oooo0o.OooOooo().getHeaderLayoutCount() + iIntValue);
        PostDetailCommentSonListActivity postDetailCommentSonListActivity2 = this.f43969Oooo0o;
        MomentSendCommentModel momentSendCommentModelOooo0O0 = postDetailCommentSonListActivity2.Oooo0O0();
        if (!o0O0O00.OooO(postDetailCommentSonListActivity2.Oooo0O0().getParentUserId())) {
            MomentLogActionTypeCommentReply momentLogActionTypeCommentReply = new MomentLogActionTypeCommentReply(null, null, null, null, 15, null);
            momentLogActionTypeCommentReply.setObject_userid(o00O0.OooO0oO(postDetailCommentSonListActivity2.Oooo0O0().getParentUserId()));
            momentLogActionTypeCommentReply.setDiscoveryid(postDetailCommentSonListActivity2.Oooo0O0().getDyid());
            momentLogActionTypeCommentReply.setCommentid(o00O0.OooO0oO(postDetailCommentSonListActivity2.Oooo0O0().getCid()));
            MomentSendContentModel content = postDetailCommentSonListActivity2.Oooo0O0().getContent();
            if (content != null) {
                momentLogActionTypeCommentReply.setReply_content(content.toJSONString());
            }
            MomentLogActionType actionType = MomentLogActionType.comment_reply;
            String actionInfo = momentLogActionTypeCommentReply.toJson();
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0O0(actionType, actionInfo, null, null), 3, null);
        }
        postDetailCommentSonListActivity2.Oooo000().f49459OooO0oO.setClickable(false);
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o00000OO.f32213OooO0oO.OooO0O0(momentSendCommentModelOooo0O0, new o00OOO0O(postDetailCommentSonListActivity2, momentSendCommentModelOooo0O0));
        MomentDetailModel momentDetailModel = this.f43969Oooo0o.f22494ooOO;
        Intrinsics.checkNotNull(momentDetailModel);
        MomentDetailModel momentDetailModel2 = this.f43969Oooo0o.f22494ooOO;
        Intrinsics.checkNotNull(momentDetailModel2);
        momentDetailModel.setCommentNum(momentDetailModel2.getCommentNum() + 1);
        this.f43969Oooo0o.Oooo000().f49456OooO0Oo.setText("");
        this.f43969Oooo0o.Oooo000().f49456OooO0Oo.OooO0O0();
        this.f43969Oooo0o.Oooo000().f49456OooO0Oo.setHint(this.f43969Oooo0o.getString(R.string.Write_a_comment));
        return Unit.INSTANCE;
    }
}
