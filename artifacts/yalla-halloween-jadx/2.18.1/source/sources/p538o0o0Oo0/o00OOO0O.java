package p538o0o0Oo0;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApiList;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendCommentModel;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.model.PostDetailCommentResultModel;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p515o0o0O00.o00O00;
import p542o0o0OoO.o00OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0O extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f43970OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MomentSendCommentModel f43971OooO0O0;

    public static final class OooO00o extends Lambda implements Function2<PostCommentSonModel, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PostDetailCommentSonListActivity f43972Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
            super(2);
            this.f43972Oooo0o = postDetailCommentSonListActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PostCommentSonModel postCommentSonModel, Integer num) {
            PostCommentSonModel data = postCommentSonModel;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(data, "data");
            o00O00.OooO0Oo("评论  删除评论 ");
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = this.f43972Oooo0o;
            PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
            postDetailCommentSonListActivity.OooOooo().remove(iIntValue);
            this.f43972Oooo0o.Oooo000().f49460OooO0oo.smoothScrollToPosition(this.f43972Oooo0o.OooOooo().getHeaderLayoutCount() + iIntValue);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<PostCommentSonModel, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PostDetailCommentSonListActivity f43973Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
            super(2);
            this.f43973Oooo0o = postDetailCommentSonListActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PostCommentSonModel postCommentSonModel, Integer num) {
            PostCommentSonModel data = postCommentSonModel;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(data, "data");
            o00O00.OooO0Oo("回复评论 ");
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = this.f43973Oooo0o;
            PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
            postDetailCommentSonListActivity.OooOooo().setData(iIntValue, data);
            this.f43973Oooo0o.Oooo000().f49460OooO0oo.smoothScrollToPosition(this.f43973Oooo0o.OooOooo().getHeaderLayoutCount() + iIntValue);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends o00000O0<AbsJavaBeanApiList<PostDetailCommentResultModel>> {
    }

    public o00OOO0O(PostDetailCommentSonListActivity postDetailCommentSonListActivity, MomentSendCommentModel momentSendCommentModel) {
        this.f43970OooO00o = postDetailCommentSonListActivity;
        this.f43971OooO0O0 = momentSendCommentModel;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@NotNull String code2, @NotNull String message) {
        PostCommentSonModel postCommentSonModel;
        Intrinsics.checkNotNullParameter(code2, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onError(code2, message);
        o00O00.OooO0Oo("toApiSendData onError \n code = " + code2 + "\n message = " + message);
        PostDetailCommentSonListActivity postDetailCommentSonListActivity = this.f43970OooO00o;
        PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
        List<PostCommentSonModel> data = postDetailCommentSonListActivity.OooOooo().getData();
        MomentSendCommentModel momentSendCommentModel = this.f43971OooO0O0;
        OooO00o oooO00o2 = new OooO00o(this.f43970OooO00o);
        if (data != null && momentSendCommentModel != null) {
            int i = 0;
            int size = data.size();
            while (true) {
                if (i >= size) {
                    postCommentSonModel = null;
                    i = -1;
                    break;
                }
                postCommentSonModel = data.get(i);
                o00O00.OooO0O0("评论 removeCommentSonReply i = " + i + " itemTemp = " + postCommentSonModel);
                if (postCommentSonModel != null && momentSendCommentModel.getLocalId() == postCommentSonModel.getLocalId()) {
                    break;
                } else {
                    i++;
                }
            }
            if (postCommentSonModel != null) {
                oooO00o2.invoke(postCommentSonModel, Integer.valueOf(i));
            }
        }
        o00OOO0 o00ooo1 = this.f43970OooO00o.f22478OooooOO;
        MomentSendCommentModel momentSendCommentModel2 = this.f43971OooO0O0;
        Objects.requireNonNull(o00ooo1);
        MomentSendCommentModel momentSendCommentModel3 = new MomentSendCommentModel(momentSendCommentModel2.getDyid());
        momentSendCommentModel3.setSendPostCommentModel(momentSendCommentModel2);
        o00ooo1.OooO00o(momentSendCommentModel3);
        this.f43970OooO00o.OooOooO();
        o00O00.OooO0O0("mMapListSendPostCommentModel = " + this.f43970OooO00o.f22478OooooOO);
        MomentDetailModel momentDetailModel = this.f43970OooO00o.f22494ooOO;
        Intrinsics.checkNotNull(momentDetailModel);
        MomentDetailModel momentDetailModel2 = this.f43970OooO00o.f22494ooOO;
        Intrinsics.checkNotNull(momentDetailModel2);
        momentDetailModel.setCommentNum(momentDetailModel2.getCommentNum() - 1);
        LiveEventBus.get("MOMENT_POST_COMMENT").post(this.f43970OooO00o.f22494ooOO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        AbsJavaBeanApiList absJavaBeanApiList = (AbsJavaBeanApiList) o0Oo0oo.OooO0OO(response, new OooO0OO().getType());
        this.f43970OooO00o.f22478OooooOO.OooO0o0(this.f43971OooO0O0);
        o00O00.OooOO0O("mMapListSendPostCommentModel = " + this.f43970OooO00o.f22478OooooOO);
        PostCommentSonModel postCommentSonModel = null;
        if ((absJavaBeanApiList != null ? (PostDetailCommentResultModel) absJavaBeanApiList.getData() : null) != null) {
            MomentSendCommentModel momentSendCommentModel = this.f43971OooO0O0;
            Intrinsics.checkNotNull(momentSendCommentModel);
            Model data = absJavaBeanApiList.getData();
            Intrinsics.checkNotNull(data);
            momentSendCommentModel.setReplyId(((PostDetailCommentResultModel) data).getCid());
            List<PostCommentSonModel> data2 = this.f43970OooO00o.OooOooo().getData();
            MomentSendCommentModel momentSendCommentModel2 = this.f43971OooO0O0;
            OooO0O0 oooO0O0 = new OooO0O0(this.f43970OooO00o);
            if (data2 != null && momentSendCommentModel2 != null) {
                int i = 0;
                int size = data2.size();
                while (true) {
                    if (i >= size) {
                        i = -1;
                        break;
                    }
                    PostCommentSonModel postCommentSonModel2 = data2.get(i);
                    o00O00.OooO0O0("replaceCommentSonReplyId i = " + i + " itemTemp = " + postCommentSonModel2);
                    if (postCommentSonModel2 != null && momentSendCommentModel2.getLocalId() == postCommentSonModel2.getLocalId()) {
                        postCommentSonModel2.setId(momentSendCommentModel2.getReplyId());
                        postCommentSonModel = postCommentSonModel2;
                        break;
                    }
                    i++;
                }
                if (postCommentSonModel != null) {
                    oooO0O0.invoke(postCommentSonModel, Integer.valueOf(i));
                }
            }
        }
        this.f43970OooO00o.OooOooO();
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_ADD").post(Boolean.TRUE);
    }
}
