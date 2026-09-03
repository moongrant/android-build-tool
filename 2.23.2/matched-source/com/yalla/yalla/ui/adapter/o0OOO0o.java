package com.yalla.yalla.ui.adapter;

import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.db.table.MomentMessage;
import com.yalla.yalla.model.ReportCommentDetailModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import com.yalla.yalla.util.SendPostModelContentFromString$toSendPostModelContent$1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p473o0OoooOo.o0OOOO0o;
import p590o0oOooo0.oOO0O000;
import p590o0oOooo0.oOOO00;
import p606o0oo0O0o.o0O0O0o0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final AppCompatActivity f27200OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f27201OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public MomentMessage f27202OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public BaseMomentDetailVM f27203OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public YallaChatVM f27204OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<o0ooOOo> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PagingViewHolder f27205OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PagingViewHolder pagingViewHolder) {
            super(0);
            this.f27205OooO0Oo = pagingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0ooOOo invoke() {
            return new o0ooOOo(this.f27205OooO0Oo);
        }
    }

    public static final class OooO0O0 extends o0OOOO0o {

        public static final class OooO00o extends Lambda implements Function1<List<MomentCommentDetailModel>, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<MomentCommentDetailModel> f27207OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Ref.ObjectRef<MomentCommentDetailModel> objectRef) {
                super(1);
                this.f27207OooO0Oo = objectRef;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(List<MomentCommentDetailModel> list) {
                List<MomentCommentDetailModel> list2 = list;
                if (list2 != null && list2.size() > 0) {
                    this.f27207OooO0Oo.element = list2.get(0);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.ui.adapter.o0OOO0o$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0329OooO0O0 extends Lambda implements Function1<ApiResult<List<MomentCommentDetailModel>>, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<MomentCommentDetailModel> f27208OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MomentDetailModel f27209OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ o0OOO0o f27210OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ MomentCommentDetailModel f27211OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ MomentReplyModel f27212OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0329OooO0O0(Ref.ObjectRef<MomentCommentDetailModel> objectRef, o0OOO0o o0ooo0o2, MomentDetailModel momentDetailModel, MomentCommentDetailModel momentCommentDetailModel, MomentReplyModel momentReplyModel) {
                super(1);
                this.f27208OooO0Oo = objectRef;
                this.f27210OooO0o0 = o0ooo0o2;
                this.f27209OooO0o = momentDetailModel;
                this.f27211OooO0oO = momentCommentDetailModel;
                this.f27212OooO0oo = momentReplyModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(ApiResult<List<MomentCommentDetailModel>> apiResult) {
                ApiResult<List<MomentCommentDetailModel>> it = apiResult;
                Intrinsics.checkNotNullParameter(it, "it");
                Ref.ObjectRef<MomentCommentDetailModel> objectRef = this.f27208OooO0Oo;
                String userid = objectRef.element.getUserid();
                boolean z = userid == null || userid.length() == 0;
                o0OOO0o o0ooo0o2 = this.f27210OooO0o0;
                if (z) {
                    int i = MomentDetailActivity.f25608Oooo0;
                    MomentDetailActivity.OooO00o.OooO00o(o0ooo0o2.f27200OooO00o, this.f27209OooO0o, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 4) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 8) != 0 ? 1 : -1, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 16) != 0 ? null : this.f27211OooO0oO, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 32) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 64) != 0 ? null : MomentAdapterTag.MomentMessageList, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 128) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? "" : null);
                } else {
                    int i2 = MomentReplyActivity.f25700OooOoO;
                    MomentReplyActivity.OooO00o.OooO00o(o0ooo0o2.f27200OooO00o, false, this.f27209OooO0o, objectRef.element, this.f27212OooO0oo);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0OO extends Lambda implements Function1<TopicGroupInfoModel, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentMessage.TopicGroupCreateSuccessNotice f27213OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice) {
                super(1);
                this.f27213OooO0Oo = topicGroupCreateSuccessNotice;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(TopicGroupInfoModel topicGroupInfoModel) {
                TopicGroupInfoModel topicGroupInfoModel2 = topicGroupInfoModel;
                if (topicGroupInfoModel2 != null) {
                    if (topicGroupInfoModel2.getIsDisbanded() || topicGroupInfoModel2.getCircleUserIsCancel()) {
                        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.topic_group_join_dissolved);
                        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                    } else {
                        MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice = this.f27213OooO0Oo;
                        topicGroupInfoModel2.setLocalTopicId(com.code.android.util.o0OoOo0.OooOO0(topicGroupCreateSuccessNotice.getCircleId()));
                        topicGroupInfoModel2.setLocalTopicName(com.code.android.util.o0OoOo0.OooOOO(topicGroupCreateSuccessNotice.getCircleName(), ""));
                        p532o0o0OOo0.o00O00.OooO0o0(TopicGroupJoinScreen.INSTANCE, p063o0000oO.o000oOoO.OooO0O0(TuplesKt.to("DATA", topicGroupInfoModel2)), false, null, 12);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public OooO0O0() {
        }

        public static /* synthetic */ void OooO0OO(OooO0O0 oooO0O0, Long l, Long l2, int i) {
            if ((i & 2) != 0) {
                l2 = null;
            }
            oooO0O0.OooO0O0(l, l2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View v) {
            LiveData<ApiResult<ReportCommentDetailModel>> commentInfo;
            Intrinsics.checkNotNullParameter(v, "v");
            int id = v.getId();
            int i = p562o0oOo000.o0OO00O.ivHead;
            MomentMessage momentMessage = null;
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            if (id == i) {
                MomentMessage momentMessage2 = o0ooo0o2.f27202OooO0OO;
                if (momentMessage2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("data");
                    momentMessage2 = null;
                }
                int type = momentMessage2.getType();
                AppCompatActivity appCompatActivity = o0ooo0o2.f27200OooO00o;
                if (type == -12) {
                    UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
                    MomentMessage.MomentTopicTopRevoke momentTopicTopRevoke = momentMessage2.getMomentTopicTopRevoke();
                    UserInfoActivity.OooO00o.OooO0OO(oooO00o, appCompatActivity, String.valueOf(momentTopicTopRevoke != null ? Long.valueOf(momentTopicTopRevoke.getUserId()) : null), false, 12);
                    return;
                }
                if (type == 18) {
                    UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f26775Oooo0o;
                    MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice = momentMessage2.getTopicGroupCreateSuccessNotice();
                    UserInfoActivity.OooO00o.OooO0OO(oooO00o2, appCompatActivity, com.code.android.util.o0OoOo0.OooOOO0("", topicGroupCreateSuccessNotice != null ? topicGroupCreateSuccessNotice.getUserId() : null), false, 12);
                    return;
                }
                if (type == 19) {
                    UserInfoActivity.OooO00o oooO00o3 = UserInfoActivity.f26775Oooo0o;
                    MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice2 = momentMessage2.getTopicGroupCreateSuccessNotice();
                    UserInfoActivity.OooO00o.OooO0OO(oooO00o3, appCompatActivity, com.code.android.util.o0OoOo0.OooOOO0("", topicGroupCreateSuccessNotice2 != null ? topicGroupCreateSuccessNotice2.getUserId() : null), false, 12);
                    return;
                }
                switch (type) {
                    case 1:
                        UserInfoActivity.OooO00o oooO00o4 = UserInfoActivity.f26775Oooo0o;
                        MomentMessage.MomentPraise momentPraise = momentMessage2.getMomentPraise();
                        UserInfoActivity.OooO00o.OooO0OO(oooO00o4, appCompatActivity, String.valueOf(momentPraise != null ? Long.valueOf(momentPraise.getUserId()) : null), false, 12);
                        break;
                    case 2:
                        UserInfoActivity.OooO00o oooO00o5 = UserInfoActivity.f26775Oooo0o;
                        MomentMessage.CommentPraise commentPraise = momentMessage2.getCommentPraise();
                        UserInfoActivity.OooO00o.OooO0OO(oooO00o5, appCompatActivity, String.valueOf(commentPraise != null ? Long.valueOf(commentPraise.getUserId()) : null), false, 12);
                        break;
                    case 3:
                        UserInfoActivity.OooO00o oooO00o6 = UserInfoActivity.f26775Oooo0o;
                        MomentMessage.MomentComment momentComment = momentMessage2.getMomentComment();
                        UserInfoActivity.OooO00o.OooO0OO(oooO00o6, appCompatActivity, String.valueOf(momentComment != null ? Long.valueOf(momentComment.getUserId()) : null), false, 12);
                        break;
                    case 4:
                        UserInfoActivity.OooO00o oooO00o7 = UserInfoActivity.f26775Oooo0o;
                        MomentMessage.CommentReply commentReply = momentMessage2.getCommentReply();
                        UserInfoActivity.OooO00o.OooO0OO(oooO00o7, appCompatActivity, String.valueOf(commentReply != null ? Long.valueOf(commentReply.getUserId()) : null), false, 12);
                        break;
                    case 5:
                        UserInfoActivity.OooO00o oooO00o8 = UserInfoActivity.f26775Oooo0o;
                        MomentMessage.MomentAt momentAt = momentMessage2.getMomentAt();
                        UserInfoActivity.OooO00o.OooO0OO(oooO00o8, appCompatActivity, String.valueOf(momentAt != null ? Long.valueOf(momentAt.getUserId()) : null), false, 12);
                        break;
                    case 6:
                        UserInfoActivity.OooO00o oooO00o9 = UserInfoActivity.f26775Oooo0o;
                        MomentMessage.CommentAt commentAt = momentMessage2.getCommentAt();
                        UserInfoActivity.OooO00o.OooO0OO(oooO00o9, appCompatActivity, String.valueOf(commentAt != null ? Long.valueOf(commentAt.getUserId()) : null), false, 12);
                        break;
                    case 7:
                        UserInfoActivity.OooO00o oooO00o10 = UserInfoActivity.f26775Oooo0o;
                        MomentMessage.MomentGift momentGift = momentMessage2.getMomentGift();
                        UserInfoActivity.OooO00o.OooO0OO(oooO00o10, appCompatActivity, String.valueOf(momentGift != null ? Long.valueOf(momentGift.getUserId()) : null), false, 12);
                        break;
                    case 8:
                        UserInfoActivity.OooO00o oooO00o11 = UserInfoActivity.f26775Oooo0o;
                        MomentMessage.CommentReward commentReward = momentMessage2.getCommentReward();
                        UserInfoActivity.OooO00o.OooO0OO(oooO00o11, appCompatActivity, String.valueOf(commentReward != null ? Long.valueOf(commentReward.getUserId()) : null), false, 12);
                        break;
                    case 9:
                        UserInfoActivity.OooO00o oooO00o12 = UserInfoActivity.f26775Oooo0o;
                        MomentMessage.ReplyReward replyReward = momentMessage2.getReplyReward();
                        UserInfoActivity.OooO00o.OooO0OO(oooO00o12, appCompatActivity, String.valueOf(replyReward != null ? Long.valueOf(replyReward.getUserId()) : null), false, 12);
                        break;
                    default:
                        switch (type) {
                            case 12:
                                UserInfoActivity.OooO00o oooO00o13 = UserInfoActivity.f26775Oooo0o;
                                MomentMessage.MomentTopicTop momentTopicTop = momentMessage2.getMomentTopicTop();
                                UserInfoActivity.OooO00o.OooO0OO(oooO00o13, appCompatActivity, String.valueOf(momentTopicTop != null ? Long.valueOf(momentTopicTop.getUserId()) : null), false, 12);
                                break;
                            case 13:
                                UserInfoActivity.OooO00o oooO00o14 = UserInfoActivity.f26775Oooo0o;
                                MomentMessage.MomentTopicRemoveOwner momentTopicRemoveOwner = momentMessage2.getMomentTopicRemoveOwner();
                                UserInfoActivity.OooO00o.OooO0OO(oooO00o14, appCompatActivity, String.valueOf(momentTopicRemoveOwner != null ? Long.valueOf(momentTopicRemoveOwner.getUserId()) : null), false, 12);
                                break;
                            case 14:
                                UserInfoActivity.OooO00o oooO00o15 = UserInfoActivity.f26775Oooo0o;
                                MomentMessage.MomentTopicRemoveAdmin momentTopicRemoveAdmin = momentMessage2.getMomentTopicRemoveAdmin();
                                UserInfoActivity.OooO00o.OooO0OO(oooO00o15, appCompatActivity, String.valueOf(momentTopicRemoveAdmin != null ? Long.valueOf(momentTopicRemoveAdmin.getUserId()) : null), false, 12);
                                break;
                        }
                        break;
                }
                return;
            }
            if (!(((((((id == p562o0oOo000.o0OO00O.layout || id == p562o0oOo000.o0OO00O.layoutContent) != false || id == p562o0oOo000.o0OO00O.tvName) != false || id == p562o0oOo000.o0OO00O.ivLike) != false || id == p562o0oOo000.o0OO00O.ivReward) != false || id == p562o0oOo000.o0OO00O.tvContent) != false || id == p562o0oOo000.o0OO00O.tvTime) == true || id == p562o0oOo000.o0OO00O.ivImage)) {
                if (id == p562o0oOo000.o0OO00O.tvReply) {
                    o0oo0000.OooO00o.OooO0O0("103022");
                    MomentMessage momentMessage3 = o0ooo0o2.f27202OooO0OO;
                    if (momentMessage3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                    } else {
                        momentMessage = momentMessage3;
                    }
                    p545o0oO0O00.OooOo00.OooO0O0(553, momentMessage);
                    return;
                }
                return;
            }
            MomentMessage momentMessage4 = o0ooo0o2.f27202OooO0OO;
            if (momentMessage4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
                momentMessage4 = null;
            }
            o0oo0000.OooO00o.OooO0O0("103023");
            MomentCommentDetailModel momentCommentDetailModel = new MomentCommentDetailModel();
            int type2 = momentMessage4.getType();
            if (type2 != -12) {
                switch (type2) {
                    case 1:
                        MomentMessage.MomentPraise momentPraise2 = momentMessage4.getMomentPraise();
                        OooO0OO(this, momentPraise2 != null ? Long.valueOf(momentPraise2.getMomentId()) : null, null, 6);
                        break;
                    case 2:
                        MomentMessage.CommentPraise commentPraise2 = momentMessage4.getCommentPraise();
                        OooO0OO(this, commentPraise2 != null ? Long.valueOf(commentPraise2.getMomentId()) : null, null, 6);
                        break;
                    case 3:
                        MomentMessage.MomentComment momentComment2 = momentMessage4.getMomentComment();
                        if (momentComment2 != null) {
                            momentCommentDetailModel.setLoadMomentCommentDetailModel(momentComment2.getCommentId(), String.valueOf(momentComment2.getUserId()), momentComment2.getUserNickName(), momentComment2.getUserHeadUrl(), momentComment2.getCommentContent(), momentMessage4.getTime(), true);
                        }
                        MomentMessage.MomentComment momentComment3 = momentMessage4.getMomentComment();
                        Long lValueOf = momentComment3 != null ? Long.valueOf(momentComment3.getMomentId()) : null;
                        MomentMessage.MomentComment momentComment4 = momentMessage4.getMomentComment();
                        OooO0O0(lValueOf, momentComment4 != null ? Long.valueOf(momentComment4.getCommentId()) : null, momentCommentDetailModel);
                        break;
                    case 4:
                        MomentMessage.CommentReply commentReply2 = momentMessage4.getCommentReply();
                        if (commentReply2 != null) {
                            momentCommentDetailModel.setLoadMomentCommentDetailModel(commentReply2.getCommentId(), String.valueOf(commentReply2.getUserId()), commentReply2.getUserNickName(), commentReply2.getUserHeadUrl(), commentReply2.getCommentContent(), momentMessage4.getTime(), true);
                        }
                        MomentMessage.CommentReply commentReply3 = momentMessage4.getCommentReply();
                        Long lValueOf2 = commentReply3 != null ? Long.valueOf(commentReply3.getMomentId()) : null;
                        MomentMessage.CommentReply commentReply4 = momentMessage4.getCommentReply();
                        OooO0O0(lValueOf2, commentReply4 != null ? Long.valueOf(commentReply4.getCommentId()) : null, momentCommentDetailModel);
                        break;
                    case 5:
                        MomentMessage.MomentAt momentAt2 = momentMessage4.getMomentAt();
                        OooO0OO(this, momentAt2 != null ? Long.valueOf(momentAt2.getMomentId()) : null, null, 6);
                        break;
                    case 6:
                        MomentMessage.CommentAt commentAt2 = momentMessage4.getCommentAt();
                        if (commentAt2 != null) {
                            momentCommentDetailModel.setLoadMomentCommentDetailModel(commentAt2.getCommentId(), String.valueOf(commentAt2.getUserId()), commentAt2.getUserNickName(), commentAt2.getUserHeadUrl(), commentAt2.getCommentContent(), momentMessage4.getTime(), true);
                        }
                        MomentMessage.CommentAt commentAt3 = momentMessage4.getCommentAt();
                        Long lValueOf3 = commentAt3 != null ? Long.valueOf(commentAt3.getMomentId()) : null;
                        MomentMessage.CommentAt commentAt4 = momentMessage4.getCommentAt();
                        OooO0O0(lValueOf3, commentAt4 != null ? Long.valueOf(commentAt4.getCommentId()) : null, momentCommentDetailModel);
                        break;
                    case 7:
                        MomentMessage.MomentGift momentGift2 = momentMessage4.getMomentGift();
                        OooO0OO(this, momentGift2 != null ? Long.valueOf(momentGift2.getMomentId()) : null, null, 6);
                        break;
                    case 8:
                        MomentMessage.CommentReward commentReward2 = momentMessage4.getCommentReward();
                        Long lValueOf4 = commentReward2 != null ? Long.valueOf(commentReward2.getMomentId()) : null;
                        MomentMessage.CommentReward commentReward3 = momentMessage4.getCommentReward();
                        OooO0OO(this, lValueOf4, commentReward3 != null ? Long.valueOf(commentReward3.getCommentId()) : null, 4);
                        break;
                    case 9:
                        MomentMessage.ReplyReward replyReward2 = momentMessage4.getReplyReward();
                        Long lValueOf5 = replyReward2 != null ? Long.valueOf(replyReward2.getMomentId()) : null;
                        MomentMessage.ReplyReward replyReward3 = momentMessage4.getReplyReward();
                        OooO0OO(this, lValueOf5, replyReward3 != null ? Long.valueOf(replyReward3.getCommentId()) : null, 4);
                        break;
                    case 10:
                        MomentMessage.MomentFeatured momentFeatured = momentMessage4.getMomentFeatured();
                        OooO0OO(this, momentFeatured != null ? Long.valueOf(momentFeatured.getMomentId()) : null, null, 6);
                        break;
                    case 11:
                        MomentMessage.CommentFeatured commentFeatured = momentMessage4.getCommentFeatured();
                        Long lValueOf6 = commentFeatured != null ? Long.valueOf(commentFeatured.getMomentId()) : null;
                        MomentMessage.CommentFeatured commentFeatured2 = momentMessage4.getCommentFeatured();
                        OooO0OO(this, lValueOf6, commentFeatured2 != null ? Long.valueOf(commentFeatured2.getCommentId()) : null, 4);
                        break;
                    case 12:
                        MomentMessage.MomentTopicTop momentTopicTop2 = momentMessage4.getMomentTopicTop();
                        OooO0Oo(momentTopicTop2 != null ? Long.valueOf(momentTopicTop2.getTopicId()) : null);
                        break;
                    case 13:
                        MomentMessage.MomentTopicRemoveOwner momentTopicRemoveOwner2 = momentMessage4.getMomentTopicRemoveOwner();
                        OooO0OO(this, momentTopicRemoveOwner2 != null ? Long.valueOf(momentTopicRemoveOwner2.getMomentId()) : null, null, 6);
                        break;
                    case 14:
                        MomentMessage.MomentTopicRemoveAdmin momentTopicRemoveAdmin2 = momentMessage4.getMomentTopicRemoveAdmin();
                        OooO0OO(this, momentTopicRemoveAdmin2 != null ? Long.valueOf(momentTopicRemoveAdmin2.getMomentId()) : null, null, 6);
                        break;
                    case 15:
                        com.code.android.util.o000O00.OooO00o(p562o0oOo000.o000000.moment_delete_by_user);
                        break;
                    case 16:
                        MomentMessage.MomentReportFeedback momentReportFeedback = momentMessage4.getMomentReportFeedback();
                        OooO0OO(this, momentReportFeedback != null ? momentReportFeedback.getMomentId() : null, null, 6);
                        break;
                    case 17:
                        MomentMessage.CommentReportFeedback commentReportFeedback = momentMessage4.getCommentReportFeedback();
                        oo0o0Oo oo0o0oo = new oo0o0Oo(this, momentMessage4);
                        if (commentReportFeedback != null) {
                            AppCompatActivity appCompatActivity2 = o0ooo0o2.f27200OooO00o;
                            BaseActivityK baseActivityK = appCompatActivity2 instanceof BaseActivityK ? (BaseActivityK) appCompatActivity2 : null;
                            if (baseActivityK != null) {
                                BaseActivityK.OooOo0o(baseActivityK, null, 0L, 3);
                            }
                            BaseMomentDetailVM baseMomentDetailVM = o0ooo0o2.f27203OooO0Oo;
                            if (baseMomentDetailVM != null && (commentInfo = baseMomentDetailVM.getCommentInfo(com.code.android.util.o0OoOo0.OooOO0(commentReportFeedback.getCommentId()))) != null) {
                                commentInfo.observe(appCompatActivity2, new p384o0OOoo0O.o000oOoO(new o0Oo0oo(oo0o0oo), null, new o0OO00O(o0ooo0o2), false, 10));
                            }
                        }
                        break;
                    case 18:
                        OooO0o0(momentMessage4.getTopicGroupCreateSuccessNotice());
                        break;
                    case 19:
                        OooO0o0(momentMessage4.getTopicGroupCreateSuccessNotice());
                        break;
                    case 20:
                        MomentMessage.CircleReportFeedback circleReportFeedback = momentMessage4.getCircleReportFeedback();
                        OooO0Oo(circleReportFeedback != null ? circleReportFeedback.getCircleId() : null);
                        break;
                }
            } else {
                MomentMessage.MomentTopicTopRevoke momentTopicTopRevoke2 = momentMessage4.getMomentTopicTopRevoke();
                OooO0Oo(momentTopicTopRevoke2 != null ? Long.valueOf(momentTopicTopRevoke2.getTopicId()) : null);
            }
            p545o0oO0O00.OooOo00.OooO0O0(553, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, com.yalla.yalla.model.moment.MomentCommentDetailModel] */
        public final void OooO0O0(Long l, Long l2, MomentCommentDetailModel momentCommentDetailModel) {
            LiveData<ApiResult<List<MomentCommentDetailModel>>> liveDataCommentParentCommentInfo;
            if (l != null) {
                long jLongValue = l.longValue();
                MomentDetailModel momentDetailModel = new MomentDetailModel();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = new MomentCommentDetailModel();
                MomentReplyModel momentReplyModel = new MomentReplyModel();
                momentDetailModel.setId(jLongValue);
                o0OOO0o o0ooo0o2 = o0OOO0o.this;
                if (l2 == null || l2.longValue() < 0) {
                    int i = MomentDetailActivity.f25608Oooo0;
                    MomentDetailActivity.OooO00o.OooO00o(o0ooo0o2.f27200OooO00o, momentDetailModel, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 4) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 8) != 0 ? 1 : -1, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 16) != 0 ? null : null, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 32) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 64) != 0 ? null : MomentAdapterTag.MomentMessageList, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 128) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? "" : null);
                    return;
                }
                if (momentCommentDetailModel != null && momentCommentDetailModel.isLocalMessageDiscolor()) {
                    ((MomentCommentDetailModel) objectRef.element).setId(l2.longValue());
                    momentReplyModel.setId(l2.longValue());
                    momentReplyModel.setLocalMessageDiscolor(momentCommentDetailModel.isLocalMessageDiscolor());
                }
                BaseMomentDetailVM baseMomentDetailVM = o0ooo0o2.f27203OooO0Oo;
                if (baseMomentDetailVM == null || (liveDataCommentParentCommentInfo = baseMomentDetailVM.commentParentCommentInfo(l2.longValue())) == null) {
                    return;
                }
                liveDataCommentParentCommentInfo.observe(o0ooo0o2.f27200OooO00o, new p384o0OOoo0O.o000oOoO(new OooO00o(objectRef), null, new C0329OooO0O0(objectRef, o0ooo0o2, momentDetailModel, momentCommentDetailModel, momentReplyModel), false, 10));
            }
        }

        public final void OooO0Oo(Long l) {
            if (l != null) {
                long jLongValue = l.longValue();
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                topicInfoModel.setId(jLongValue);
                int i = TopicDetailActivity.f25854OooOoOO;
                TopicDetailActivity.OooO00o.OooO00o(o0OOO0o.this.f27200OooO00o, topicInfoModel);
            }
        }

        public final void OooO0o0(MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice) {
            o0OOO0o o0ooo0o2;
            YallaChatVM yallaChatVM;
            LiveData<ApiResult<TopicGroupInfoModel>> groupInfo;
            if (topicGroupCreateSuccessNotice == null || (yallaChatVM = (o0ooo0o2 = o0OOO0o.this).f27204OooO0o0) == null || (groupInfo = yallaChatVM.getGroupInfo(com.code.android.util.o0OoOo0.OooOO0(topicGroupCreateSuccessNotice.getCircleId()))) == null) {
                return;
            }
            groupInfo.observe(o0ooo0o2.f27200OooO00o, new p384o0OOoo0O.o000oOoO(new OooO0OO(topicGroupCreateSuccessNotice), null, null, false, 14));
        }
    }

    public o0OOO0o(@NotNull AppCompatActivity activity, @NotNull PagingViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f27200OooO00o = activity;
        this.f27201OooO0O0 = LazyKt.lazy(new OooO00o(viewHolder));
        OooO0O0 oooO0O0 = new OooO0O0();
        OooO00o().f27219OooO00o.setOnClickListener(oooO0O0);
        OooO00o().f27220OooO0O0.setOnClickListener(oooO0O0);
        OooO00o().f27221OooO0OO.setOnClickListener(oooO0O0);
        OooO00o().f27222OooO0Oo.setOnClickListener(oooO0O0);
        OooO00o().f27224OooO0o0.setOnClickListener(oooO0O0);
        OooO00o().f27223OooO0o.setOnClickListener(oooO0O0);
        OooO00o().f27225OooO0oO.setOnClickListener(oooO0O0);
        OooO00o().f27226OooO0oo.setOnClickListener(oooO0O0);
        OooO00o().f27218OooO.setOnClickListener(oooO0O0);
        OooO00o().f27227OooOO0.setOnClickListener(oooO0O0);
        OooO00o().f27228OooOO0O.setOnClickListener(oooO0O0);
        OooO00o().f27229OooOO0o.setOnClickListener(oooO0O0);
    }

    public final void OooO() {
        MomentMessage momentMessage = this.f27202OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.MomentTopicRemoveAdmin momentTopicRemoveAdmin = momentMessage.getMomentTopicRemoveAdmin();
        if (momentTopicRemoveAdmin != null) {
            AppCompatActivity appCompatActivity = this.f27200OooO00o;
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = momentTopicRemoveAdmin.getUserHeadUrl();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27220OooO0O0);
            OooO00o().f27221OooO0OO.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.MessageFragment_moment_postRemoved));
            OooO00o().f27223OooO0o.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.moment_message_removed_from_xxx_topic_admin), momentTopicRemoveAdmin.getTopicName()));
            OooO00o().f27223OooO0o.setVisibility(0);
            TextView textView = OooO00o().f27225OooO0oO;
            MomentMessage momentMessage3 = this.f27202OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f27226OooO0oo.setVisibility(8);
            OooO00o().f27218OooO.setVisibility(4);
            if (TextUtils.isEmpty(momentTopicRemoveAdmin.getMomentImageUrl())) {
                return;
            }
            OooO00o().f27218OooO.setVisibility(0);
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
            oooO00o2.OooO00o(d1.OooO0Oo());
            oooO00o2.OooO0o0(6);
            oooO00o2.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(momentTopicRemoveAdmin.getMomentImageUrl());
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo(OooO00o().f27218OooO);
        }
    }

    public final o0ooOOo OooO00o() {
        return (o0ooOOo) this.f27201OooO0O0.getValue();
    }

    public final void OooO0O0() {
        MomentMessage momentMessage = this.f27202OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.CircleReportFeedback circleReportFeedback = momentMessage.getCircleReportFeedback();
        if (circleReportFeedback != null) {
            OooO00o().f27220OooO0O0.setImageResource(p562o0oOo000.o0Oo0oo.icon_moment_featurd_head);
            OooO00o().f27221OooO0OO.setText(!TextUtils.isEmpty(com.code.android.util.o0OoOo0.OooOOO(circleReportFeedback.getCircleTitle(), "")) ? com.code.android.util.o0OoOo0.OooOOO(circleReportFeedback.getCircleTitle(), "") : com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Thanks_for_your_report));
            OooO00o().f27223OooO0o.setText(com.code.android.util.o0OoOo0.OooOOO(circleReportFeedback.getCircleContent(), ""));
            OooO00o().f27223OooO0o.setVisibility(0);
            TextView textView = OooO00o().f27225OooO0oO;
            MomentMessage momentMessage3 = this.f27202OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f27226OooO0oo.setVisibility(8);
            OooO00o().f27218OooO.setVisibility(4);
            if (TextUtils.isEmpty(com.code.android.util.o0OoOo0.OooOOO(circleReportFeedback.getCircleImageUrl(), ""))) {
                return;
            }
            OooO00o().f27218OooO.setVisibility(0);
            String strOooOOO = com.code.android.util.o0OoOo0.OooOOO(circleReportFeedback.getCircleImageUrl(), "");
            int iOooO00o = com.code.android.util.o0000O0.OooO00o(120);
            String strOooO0oo = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o, iOooO00o, strOooOOO);
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f27200OooO00o);
            oooO00o.OooO00o(d1.OooO0Oo());
            oooO00o.OooO0o0(6);
            oooO00o.f43126OooO0OO = strOooO0oo;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27218OooO);
        }
    }

    public final void OooO0OO() {
        MomentSendContentModel momentSendContentModel;
        MomentMessage momentMessage = this.f27202OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.CommentFeatured commentFeatured = momentMessage.getCommentFeatured();
        if (commentFeatured != null) {
            OooO00o().f27220OooO0O0.setImageResource(p562o0oOo000.o0Oo0oo.ic_moment_message_featured_add);
            OooO00o().f27221OooO0OO.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Moment_Message_comment_featured));
            OooO00o().f27223OooO0o.setText("");
            String content = commentFeatured.getMomentContent();
            Intrinsics.checkNotNullParameter(content, "content");
            if (content.length() == 0) {
                momentSendContentModel = null;
            } else {
                momentSendContentModel = new MomentSendContentModel("");
                try {
                    Object objOooO0O0 = oOOO00.OooO0O0(content, new SendPostModelContentFromString$toSendPostModelContent$1().getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(...)");
                    momentSendContentModel = (MomentSendContentModel) objOooO0O0;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            AppCompatActivity appCompatActivity = this.f27200OooO00o;
            if (momentSendContentModel != null) {
                p599o0oo00o.o00O0O.OooO0OO(appCompatActivity, momentSendContentModel, OooO00o().f27223OooO0o, null);
                OooO00o().f27223OooO0o.getEditableText().insert(0, Html.fromHtml("<font color='#999999'> " + com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.MessageFragment_moment_comment_postFeatured_itemInfo) + "</font> "));
            }
            OooO00o().f27223OooO0o.setVisibility(0);
            TextView textView = OooO00o().f27225OooO0oO;
            MomentMessage momentMessage3 = this.f27202OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f27226OooO0oo.setVisibility(8);
            OooO00o().f27218OooO.setVisibility(4);
            if (TextUtils.isEmpty(commentFeatured.getMomentImageUrl())) {
                return;
            }
            OooO00o().f27218OooO.setVisibility(0);
            String strOooO0O0 = p184o00o00O0.OooO0OO.OooO0O0(com.code.android.util.o0000O0.OooO00o(120), commentFeatured.getMomentImageUrl());
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
            oooO00o.OooO00o(d1.OooO0Oo());
            oooO00o.OooO0o0(6);
            oooO00o.f43126OooO0OO = strOooO0O0;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27218OooO);
        }
    }

    public final void OooO0Oo() {
        MomentMessage momentMessage = this.f27202OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.CommentReportFeedback commentReportFeedback = momentMessage.getCommentReportFeedback();
        if (commentReportFeedback != null) {
            OooO00o().f27220OooO0O0.setImageResource(p562o0oOo000.o0Oo0oo.icon_moment_featurd_head);
            OooO00o().f27221OooO0OO.setText(!TextUtils.isEmpty(com.code.android.util.o0OoOo0.OooOOO(commentReportFeedback.getTitle(), "")) ? com.code.android.util.o0OoOo0.OooOOO(commentReportFeedback.getTitle(), "") : com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Thanks_for_your_report));
            OooO00o().f27223OooO0o.setText(commentReportFeedback.getContent());
            OooO00o().f27223OooO0o.setVisibility(0);
            TextView textView = OooO00o().f27225OooO0oO;
            MomentMessage momentMessage3 = this.f27202OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f27226OooO0oo.setVisibility(8);
            OooO00o().f27218OooO.setVisibility(4);
            if (TextUtils.isEmpty(commentReportFeedback.getMomentImageUrl())) {
                return;
            }
            OooO00o().f27218OooO.setVisibility(0);
            String strOooO0O0 = p184o00o00O0.OooO0OO.OooO0O0(com.code.android.util.o0000O0.OooO00o(120), commentReportFeedback.getMomentImageUrl());
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f27200OooO00o);
            oooO00o.OooO00o(d1.OooO0Oo());
            oooO00o.OooO0o0(6);
            oooO00o.f43126OooO0OO = strOooO0O0;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27218OooO);
        }
    }

    public final void OooO0o() {
        MomentMessage momentMessage = this.f27202OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.MomentSystemRemove momentSystemRemove = momentMessage.getMomentSystemRemove();
        if (momentSystemRemove != null) {
            OooO00o().f27220OooO0O0.setImageResource(p562o0oOo000.o0Oo0oo.ic_moment_message_delete);
            OooO00o().f27221OooO0OO.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Post_Deleted));
            String strOooO00o = oOO0O000.OooO00o(momentSystemRemove.getDeleteType());
            MomentMessage momentMessage3 = this.f27202OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            String strOooO0Oo = o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis());
            OooO00o().f27223OooO0o.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.We_deleted_your_post_posted_XXX_for_XXX), strOooO0Oo), strOooO00o));
            OooO00o().f27223OooO0o.setVisibility(0);
            OooO00o().f27225OooO0oO.setText(strOooO0Oo);
            OooO00o().f27226OooO0oo.setVisibility(8);
            OooO00o().f27218OooO.setVisibility(4);
            if (TextUtils.isEmpty(momentSystemRemove.getMomentImageUrl())) {
                return;
            }
            OooO00o().f27218OooO.setVisibility(0);
            String strOooO0O0 = p184o00o00O0.OooO0OO.OooO0O0(com.code.android.util.o0000O0.OooO00o(120), momentSystemRemove.getMomentImageUrl());
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f27200OooO00o);
            oooO00o.OooO00o(d1.OooO0Oo());
            oooO00o.OooO0o0(6);
            oooO00o.f43126OooO0OO = strOooO0O0;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27218OooO);
        }
    }

    public final void OooO0o0() {
        MomentMessage momentMessage = this.f27202OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.MomentReportFeedback momentReportFeedback = momentMessage.getMomentReportFeedback();
        if (momentReportFeedback != null) {
            OooO00o().f27220OooO0O0.setImageResource(p562o0oOo000.o0Oo0oo.icon_moment_featurd_head);
            OooO00o().f27221OooO0OO.setText(!TextUtils.isEmpty(com.code.android.util.o0OoOo0.OooOOO(momentReportFeedback.getMomentTitle(), "")) ? com.code.android.util.o0OoOo0.OooOOO(momentReportFeedback.getMomentTitle(), "") : com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Thanks_for_your_report));
            OooO00o().f27223OooO0o.setText(momentReportFeedback.getMomentContent());
            OooO00o().f27223OooO0o.setVisibility(0);
            TextView textView = OooO00o().f27225OooO0oO;
            MomentMessage momentMessage3 = this.f27202OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f27226OooO0oo.setVisibility(8);
            OooO00o().f27218OooO.setVisibility(4);
            if (TextUtils.isEmpty(momentReportFeedback.getMomentImageUrl())) {
                return;
            }
            OooO00o().f27218OooO.setVisibility(0);
            String strOooO0O0 = p184o00o00O0.OooO0OO.OooO0O0(com.code.android.util.o0000O0.OooO00o(120), momentReportFeedback.getMomentImageUrl());
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f27200OooO00o);
            oooO00o.OooO00o(d1.OooO0Oo());
            oooO00o.OooO0o0(6);
            oooO00o.f43126OooO0OO = strOooO0O0;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27218OooO);
        }
    }

    public final void OooO0oO() {
        MomentMessage momentMessage = this.f27202OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice = momentMessage.getTopicGroupCreateSuccessNotice();
        if (topicGroupCreateSuccessNotice != null) {
            AppCompatActivity appCompatActivity = this.f27200OooO00o;
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = com.code.android.util.o0OoOo0.OooOOO(topicGroupCreateSuccessNotice.getHeadUrl(), "");
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27220OooO0O0);
            OooO00o().f27221OooO0OO.setText(com.code.android.util.o0OoOo0.OooOOO(topicGroupCreateSuccessNotice.getNickName(), ""));
            OooO00o().f27223OooO0o.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.topic_group_create_success_notify_xxx), com.code.android.util.o0OoOo0.OooOOO(topicGroupCreateSuccessNotice.getCircleName(), "")));
            OooO00o().f27223OooO0o.setVisibility(0);
            TextView textView = OooO00o().f27225OooO0oO;
            MomentMessage momentMessage3 = this.f27202OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f27226OooO0oo.setVisibility(8);
            OooO00o().f27218OooO.setVisibility(4);
            if (TextUtils.isEmpty(com.code.android.util.o0OoOo0.OooOOO(topicGroupCreateSuccessNotice.getCircleHead(), ""))) {
                return;
            }
            OooO00o().f27218OooO.setVisibility(0);
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
            oooO00o2.OooO00o(d1.OooO0Oo());
            oooO00o2.OooO0o0(6);
            oooO00o2.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(topicGroupCreateSuccessNotice.getCircleHead());
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo(OooO00o().f27218OooO);
        }
    }

    public final void OooO0oo() {
        MomentMessage momentMessage = this.f27202OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice = momentMessage.getTopicGroupCreateSuccessNotice();
        if (topicGroupCreateSuccessNotice != null) {
            AppCompatActivity appCompatActivity = this.f27200OooO00o;
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = com.code.android.util.o0OoOo0.OooOOO(topicGroupCreateSuccessNotice.getHeadUrl(), "");
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27220OooO0O0);
            OooO00o().f27221OooO0OO.setText(com.code.android.util.o0OoOo0.OooOOO(topicGroupCreateSuccessNotice.getNickName(), ""));
            OooO00o().f27223OooO0o.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.topic_group_join_success_notify_xxx), com.code.android.util.o0OoOo0.OooOOO(topicGroupCreateSuccessNotice.getCircleName(), "")));
            OooO00o().f27223OooO0o.setVisibility(0);
            TextView textView = OooO00o().f27225OooO0oO;
            MomentMessage momentMessage3 = this.f27202OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f27226OooO0oo.setVisibility(8);
            OooO00o().f27218OooO.setVisibility(4);
            if (TextUtils.isEmpty(com.code.android.util.o0OoOo0.OooOOO(topicGroupCreateSuccessNotice.getCircleHead(), ""))) {
                return;
            }
            OooO00o().f27218OooO.setVisibility(0);
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
            oooO00o2.OooO00o(d1.OooO0oO());
            oooO00o2.OooO0o0(6);
            oooO00o2.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(topicGroupCreateSuccessNotice.getCircleHead());
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo(OooO00o().f27218OooO);
        }
    }

    public final void OooOO0() {
        MomentMessage momentMessage = this.f27202OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.MomentTopicRemoveOwner momentTopicRemoveOwner = momentMessage.getMomentTopicRemoveOwner();
        if (momentTopicRemoveOwner != null) {
            AppCompatActivity appCompatActivity = this.f27200OooO00o;
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = momentTopicRemoveOwner.getUserHeadUrl();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27220OooO0O0);
            OooO00o().f27221OooO0OO.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.MessageFragment_moment_postRemoved));
            OooO00o().f27223OooO0o.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.MessageFragment_moment_postRemoved_itemInfo), momentTopicRemoveOwner.getTopicName()));
            OooO00o().f27223OooO0o.setVisibility(0);
            TextView textView = OooO00o().f27225OooO0oO;
            MomentMessage momentMessage3 = this.f27202OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f27226OooO0oo.setVisibility(8);
            OooO00o().f27218OooO.setVisibility(4);
            if (TextUtils.isEmpty(momentTopicRemoveOwner.getMomentImageUrl())) {
                return;
            }
            OooO00o().f27218OooO.setVisibility(0);
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
            oooO00o2.OooO00o(d1.OooO0Oo());
            oooO00o2.OooO0o0(6);
            oooO00o2.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(momentTopicRemoveOwner.getMomentImageUrl());
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo(OooO00o().f27218OooO);
        }
    }

    public final void OooOO0O() {
        MomentMessage momentMessage = this.f27202OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.MomentTopicTop momentTopicTop = momentMessage.getMomentTopicTop();
        if (momentTopicTop != null) {
            OooO00o().f27220OooO0O0.setImageResource(p562o0oOo000.o0Oo0oo.ic_moment_message_pinned);
            OooO00o().f27221OooO0OO.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.MessageFragment_moment_postPinned));
            OooO00o().f27223OooO0o.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.MessageFragment_moment_postPinned_itemInfo), momentTopicTop.getTopicName()));
            OooO00o().f27223OooO0o.setVisibility(0);
            TextView textView = OooO00o().f27225OooO0oO;
            MomentMessage momentMessage3 = this.f27202OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f27226OooO0oo.setVisibility(8);
            OooO00o().f27218OooO.setVisibility(4);
            if (TextUtils.isEmpty(momentTopicTop.getMomentImageUrl())) {
                return;
            }
            OooO00o().f27218OooO.setVisibility(0);
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f27200OooO00o);
            oooO00o.OooO00o(d1.OooO0Oo());
            oooO00o.OooO0o0(6);
            oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(momentTopicTop.getMomentImageUrl());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27218OooO);
        }
    }

    public final void OooOO0o() {
        MomentSendContentModel momentSendContentModel;
        MomentMessage momentMessage = this.f27202OooO0OO;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.ReplyReward replyReward = momentMessage.getReplyReward();
        if (replyReward != null) {
            OooO00o().f27226OooO0oo.setVisibility(8);
            AppCompatActivity appCompatActivity = this.f27200OooO00o;
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = replyReward.getUserHeadUrl();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooO00o().f27220OooO0O0);
            OooO00o().f27221OooO0OO.setText(p412o0Oo0o0O.o000O000.OooO0O0(replyReward.getUserId(), replyReward.getUserNickName()));
            TextView textView = OooO00o().f27225OooO0oO;
            MomentMessage momentMessage2 = this.f27202OooO0OO;
            if (momentMessage2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
                momentMessage2 = null;
            }
            textView.setText(o0O0O0o0.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            if (com.code.android.util.OooOo00.OooO0O0(replyReward.getMomentImageUrl())) {
                o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(appCompatActivity);
                oooO00o2.OooO00o(d1.OooO0Oo());
                oooO00o2.OooO0o0(6);
                oooO00o2.f43126OooO0OO = replyReward.getMomentImageUrl();
                oooO00o2.f43124OooO00o = 0;
                oooO00o2.OooO0Oo(OooO00o().f27218OooO);
                OooO00o().f27218OooO.setVisibility(0);
            } else {
                OooO00o().f27218OooO.setVisibility(4);
            }
            OooO00o().f27224OooO0o0.setVisibility(0);
            OooO00o().f27224OooO0o0.setImageResource(p562o0oOo000.o0Oo0oo.ic_moment_comment_reward_color);
            OooO00o().f27229OooOO0o.setVisibility(0);
            String content = replyReward.getCommentContent();
            Intrinsics.checkNotNullParameter(content, "content");
            if (content.length() == 0) {
                momentSendContentModel = null;
            } else {
                momentSendContentModel = new MomentSendContentModel("");
                try {
                    Object objOooO0O0 = oOOO00.OooO0O0(content, new SendPostModelContentFromString$toSendPostModelContent$1().getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(...)");
                    momentSendContentModel = (MomentSendContentModel) objOooO0O0;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            p599o0oo00o.o00O0O.OooO0OO(appCompatActivity, momentSendContentModel, OooO00o().f27229OooOO0o, null);
            OooO00o().f27229OooOO0o.getEditableText().insert(0, Html.fromHtml("<font color='#999999'> " + com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.moment_message_reward_comments_title) + "</font> "));
        }
    }
}
