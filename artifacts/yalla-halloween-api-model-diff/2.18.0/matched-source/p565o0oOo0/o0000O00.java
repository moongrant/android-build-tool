package p565o0oOo0;

import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.db.table.MomentMessage;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.model.ReportCommentDetailModel;
import com.yalla.yalla.model.TopicGroupInfoModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import java.util.List;
import java.util.Objects;
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
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034OoooO0O.o0Oo0oo;
import p174o00OooO0.o00OOOO0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p466o0Ooo0oO.o000OO;
import p522o0o0O0O0.o00Ooo;
import p524o0o0O0o.o00O0;
import p524o0o0O0o.oOO00O;
import p586o0oOoo.o000O;
import p596o0oOoooO.r5;
import p618o0oo0Ooo.oO0O000o;
import p619o0oo0o.o00oOoo;
import p619o0oo0o.o0OOO0o;
import p623o0oo0o0o.oo00o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public AppCompatActivity f45018OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f45019OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public MomentMessage f45020OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public MomentVM f45021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public OooO0O0 f45022OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public YallaChatVM f45023OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<o0000> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o000OO f45024Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000OO o000oo2) {
            super(0);
            this.f45024Oooo = o000oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000 invoke() {
            return new o0000(this.f45024Oooo);
        }
    }

    public static final class OooO0O0 extends OooOOO0 {

        public static final class OooO00o extends Lambda implements Function1<List<PostCommentDetailModel>, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<PostCommentDetailModel> f45026Oooo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Ref.ObjectRef<PostCommentDetailModel> objectRef) {
                super(1);
                this.f45026Oooo = objectRef;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(List<PostCommentDetailModel> list) {
                List<PostCommentDetailModel> list2 = list;
                if (list2 != null) {
                    Ref.ObjectRef<PostCommentDetailModel> objectRef = this.f45026Oooo;
                    if (list2.size() > 0) {
                        objectRef.element = list2.get(0);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o0oOo0.o0000O00$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0410OooO0O0 extends Lambda implements Function1<ApiResult<List<PostCommentDetailModel>>, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<PostCommentDetailModel> f45027Oooo;

            /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
            public final /* synthetic */ PostCommentSonModel f45028OoooO;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ MomentDetailModel f45029OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ o0000O00 f45030OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public final /* synthetic */ PostCommentDetailModel f45031OoooO0O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0410OooO0O0(Ref.ObjectRef<PostCommentDetailModel> objectRef, o0000O00 o0000o00, MomentDetailModel momentDetailModel, PostCommentDetailModel postCommentDetailModel, PostCommentSonModel postCommentSonModel) {
                super(1);
                this.f45027Oooo = objectRef;
                this.f45030OoooO00 = o0000o00;
                this.f45029OoooO0 = momentDetailModel;
                this.f45031OoooO0O = postCommentDetailModel;
                this.f45028OoooO = postCommentSonModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(ApiResult<List<PostCommentDetailModel>> apiResult) {
                ApiResult<List<PostCommentDetailModel>> it = apiResult;
                Intrinsics.checkNotNullParameter(it, "it");
                String userid = this.f45027Oooo.element.getUserid();
                if (userid == null || userid.length() == 0) {
                    PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                    PostDetailActivity.f22436o000000O.OooO00o(this.f45030OoooO00.f45018OooO00o, this.f45029OoooO0, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : this.f45031OoooO0O, (256 & 32) != 0 ? false : false, (256 & 64) != 0 ? null : MomentAdapterTag.MomentMessageList, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
                } else {
                    PostDetailCommentSonListActivity.f22492o0Oo0oo.OooO00o(this.f45030OoooO00.f45018OooO00o, false, this.f45029OoooO0, this.f45027Oooo.element, this.f45028OoooO);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0OO extends Lambda implements Function1<TopicGroupInfoModel, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ MomentMessage.TopicGroupCreateSuccessNotice f45032Oooo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice) {
                super(1);
                this.f45032Oooo = topicGroupCreateSuccessNotice;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(TopicGroupInfoModel topicGroupInfoModel) {
                TopicGroupInfoModel topicGroupInfoModel2 = topicGroupInfoModel;
                if (topicGroupInfoModel2 != null) {
                    MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice = this.f45032Oooo;
                    if (topicGroupInfoModel2.getIsDisbanded() || topicGroupInfoModel2.getCircleUserIsCancel()) {
                        String strOooO0OO = OooOOO.OooO0OO(R.string.topic_group_join_dissolved);
                        ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o0o0oooOooO0O0.run();
                            } else {
                                o00O000 o00o001 = o00O000.f34368OooO00o;
                                o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                            }
                        }
                    } else {
                        topicGroupInfoModel2.setLocalTopicId(oOO00O.OooO0o(topicGroupCreateSuccessNotice.getCircleId()));
                        topicGroupInfoModel2.setLocalTopicName(o00O0.OooO0oO(topicGroupCreateSuccessNotice.getCircleName()));
                        o000O.OooO00o(r5.f47553OooO00o, o000O00O.OooO0OO.OooO0O0(TuplesKt.to("DATA", topicGroupInfoModel2)));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public OooO0O0() {
            super(0L, 1, null);
        }

        public static /* synthetic */ void OooO0O0(OooO0O0 oooO0O0, Long l, Long l2, int i) {
            if ((i & 2) != 0) {
                l2 = null;
            }
            oooO0O0.OooO00o(l, l2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, com.yalla.yalla.model.PostCommentDetailModel] */
        public final void OooO00o(Long l, Long l2, PostCommentDetailModel postCommentDetailModel) {
            LiveData<ApiResult<List<PostCommentDetailModel>>> liveDataCommentParentCommentInfo;
            if (l != null) {
                o0000O00 o0000o00 = o0000O00.this;
                long jLongValue = l.longValue();
                MomentDetailModel momentDetailModel = new MomentDetailModel();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = new PostCommentDetailModel();
                PostCommentSonModel postCommentSonModel = new PostCommentSonModel();
                momentDetailModel.setId(jLongValue);
                if (l2 == null || l2.longValue() < 0) {
                    PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                    PostDetailActivity.f22436o000000O.OooO00o(o0000o00.f45018OooO00o, momentDetailModel, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : false, (256 & 64) != 0 ? null : MomentAdapterTag.MomentMessageList, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
                    return;
                }
                if (postCommentDetailModel != null && postCommentDetailModel.isLocalMessageDiscolor()) {
                    ((PostCommentDetailModel) objectRef.element).setId(l2.longValue());
                    postCommentSonModel.setId(l2.longValue());
                    postCommentSonModel.setLocalMessageDiscolor(postCommentDetailModel.isLocalMessageDiscolor());
                }
                MomentVM momentVM = o0000o00.f45021OooO0Oo;
                if (momentVM == null || (liveDataCommentParentCommentInfo = momentVM.commentParentCommentInfo(l2.longValue())) == null) {
                    return;
                }
                liveDataCommentParentCommentInfo.observe(o0000o00.f45018OooO00o, new OooOo(new OooO00o(objectRef), null, new C0410OooO0O0(objectRef, o0000o00, momentDetailModel, postCommentDetailModel, postCommentSonModel), false, 10));
            }
        }

        public final void OooO0OO(Long l) {
            if (l != null) {
                o0000O00 o0000o00 = o0000O00.this;
                long jLongValue = l.longValue();
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                topicInfoModel.setId(jLongValue);
                TopicDetailActivity.f22586o00Oo0.OooO00o(o0000o00.f45018OooO00o, topicInfoModel);
            }
        }

        public final void OooO0Oo(MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice) {
            o0000O00 o0000o00;
            YallaChatVM yallaChatVM;
            LiveData<ApiResult<TopicGroupInfoModel>> groupInfo;
            if (topicGroupCreateSuccessNotice == null || (yallaChatVM = (o0000o00 = o0000O00.this).f45023OooO0o0) == null || (groupInfo = yallaChatVM.getGroupInfo(oOO00O.OooO0o(topicGroupCreateSuccessNotice.getCircleId()))) == null) {
                return;
            }
            groupInfo.observe(o0000o00.f45018OooO00o, new OooOo(new OooO0OO(topicGroupCreateSuccessNotice), null, null, false, 14));
        }

        @Override // com.yalla.support.common.util.OooOOO0
        public final void onNoDoubleClick(@NotNull View v) {
            LiveData<ApiResult<ReportCommentDetailModel>> commentInfo;
            Intrinsics.checkNotNullParameter(v, "v");
            switch (v.getId()) {
                case R.id.ivHead /* 2131297679 */:
                    MomentMessage momentMessage = o0000O00.this.f45020OooO0OO;
                    if (momentMessage == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage = null;
                    }
                    o0000O00 o0000o00 = o0000O00.this;
                    int type = momentMessage.getType();
                    if (type != -12) {
                        if (type != 18) {
                            if (type != 19) {
                                switch (type) {
                                    case 1:
                                        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23471o0OOO0o;
                                        AppCompatActivity appCompatActivity = o0000o00.f45018OooO00o;
                                        MomentMessage.MomentPraise momentPraise = momentMessage.getMomentPraise();
                                        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, appCompatActivity, String.valueOf(momentPraise != null ? Long.valueOf(momentPraise.getUserId()) : null), false, 12);
                                        break;
                                    case 2:
                                        UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23471o0OOO0o;
                                        AppCompatActivity appCompatActivity2 = o0000o00.f45018OooO00o;
                                        MomentMessage.CommentPraise commentPraise = momentMessage.getCommentPraise();
                                        UserInfoActivity.OooO00o.OooO0Oo(oooO00o2, appCompatActivity2, String.valueOf(commentPraise != null ? Long.valueOf(commentPraise.getUserId()) : null), false, 12);
                                        break;
                                    case 3:
                                        UserInfoActivity.OooO00o oooO00o3 = UserInfoActivity.f23471o0OOO0o;
                                        AppCompatActivity appCompatActivity3 = o0000o00.f45018OooO00o;
                                        MomentMessage.MomentComment momentComment = momentMessage.getMomentComment();
                                        UserInfoActivity.OooO00o.OooO0Oo(oooO00o3, appCompatActivity3, String.valueOf(momentComment != null ? Long.valueOf(momentComment.getUserId()) : null), false, 12);
                                        break;
                                    case 4:
                                        UserInfoActivity.OooO00o oooO00o4 = UserInfoActivity.f23471o0OOO0o;
                                        AppCompatActivity appCompatActivity4 = o0000o00.f45018OooO00o;
                                        MomentMessage.CommentReply commentReply = momentMessage.getCommentReply();
                                        UserInfoActivity.OooO00o.OooO0Oo(oooO00o4, appCompatActivity4, String.valueOf(commentReply != null ? Long.valueOf(commentReply.getUserId()) : null), false, 12);
                                        break;
                                    case 5:
                                        UserInfoActivity.OooO00o oooO00o5 = UserInfoActivity.f23471o0OOO0o;
                                        AppCompatActivity appCompatActivity5 = o0000o00.f45018OooO00o;
                                        MomentMessage.MomentAt momentAt = momentMessage.getMomentAt();
                                        UserInfoActivity.OooO00o.OooO0Oo(oooO00o5, appCompatActivity5, String.valueOf(momentAt != null ? Long.valueOf(momentAt.getUserId()) : null), false, 12);
                                        break;
                                    case 6:
                                        UserInfoActivity.OooO00o oooO00o6 = UserInfoActivity.f23471o0OOO0o;
                                        AppCompatActivity appCompatActivity6 = o0000o00.f45018OooO00o;
                                        MomentMessage.CommentAt commentAt = momentMessage.getCommentAt();
                                        UserInfoActivity.OooO00o.OooO0Oo(oooO00o6, appCompatActivity6, String.valueOf(commentAt != null ? Long.valueOf(commentAt.getUserId()) : null), false, 12);
                                        break;
                                    case 7:
                                        UserInfoActivity.OooO00o oooO00o7 = UserInfoActivity.f23471o0OOO0o;
                                        AppCompatActivity appCompatActivity7 = o0000o00.f45018OooO00o;
                                        MomentMessage.MomentGift momentGift = momentMessage.getMomentGift();
                                        UserInfoActivity.OooO00o.OooO0Oo(oooO00o7, appCompatActivity7, String.valueOf(momentGift != null ? Long.valueOf(momentGift.getUserId()) : null), false, 12);
                                        break;
                                    case 8:
                                        UserInfoActivity.OooO00o oooO00o8 = UserInfoActivity.f23471o0OOO0o;
                                        AppCompatActivity appCompatActivity8 = o0000o00.f45018OooO00o;
                                        MomentMessage.CommentReward commentReward = momentMessage.getCommentReward();
                                        UserInfoActivity.OooO00o.OooO0Oo(oooO00o8, appCompatActivity8, String.valueOf(commentReward != null ? Long.valueOf(commentReward.getUserId()) : null), false, 12);
                                        break;
                                    case 9:
                                        UserInfoActivity.OooO00o oooO00o9 = UserInfoActivity.f23471o0OOO0o;
                                        AppCompatActivity appCompatActivity9 = o0000o00.f45018OooO00o;
                                        MomentMessage.ReplyReward replyReward = momentMessage.getReplyReward();
                                        UserInfoActivity.OooO00o.OooO0Oo(oooO00o9, appCompatActivity9, String.valueOf(replyReward != null ? Long.valueOf(replyReward.getUserId()) : null), false, 12);
                                        break;
                                    default:
                                        switch (type) {
                                            case 12:
                                                UserInfoActivity.OooO00o oooO00o10 = UserInfoActivity.f23471o0OOO0o;
                                                AppCompatActivity appCompatActivity10 = o0000o00.f45018OooO00o;
                                                MomentMessage.MomentTopicTop momentTopicTop = momentMessage.getMomentTopicTop();
                                                UserInfoActivity.OooO00o.OooO0Oo(oooO00o10, appCompatActivity10, String.valueOf(momentTopicTop != null ? Long.valueOf(momentTopicTop.getUserId()) : null), false, 12);
                                                break;
                                            case 13:
                                                UserInfoActivity.OooO00o oooO00o11 = UserInfoActivity.f23471o0OOO0o;
                                                AppCompatActivity appCompatActivity11 = o0000o00.f45018OooO00o;
                                                MomentMessage.MomentTopicRemoveOwner momentTopicRemoveOwner = momentMessage.getMomentTopicRemoveOwner();
                                                UserInfoActivity.OooO00o.OooO0Oo(oooO00o11, appCompatActivity11, String.valueOf(momentTopicRemoveOwner != null ? Long.valueOf(momentTopicRemoveOwner.getUserId()) : null), false, 12);
                                                break;
                                            case 14:
                                                UserInfoActivity.OooO00o oooO00o12 = UserInfoActivity.f23471o0OOO0o;
                                                AppCompatActivity appCompatActivity12 = o0000o00.f45018OooO00o;
                                                MomentMessage.MomentTopicRemoveAdmin momentTopicRemoveAdmin = momentMessage.getMomentTopicRemoveAdmin();
                                                UserInfoActivity.OooO00o.OooO0Oo(oooO00o12, appCompatActivity12, String.valueOf(momentTopicRemoveAdmin != null ? Long.valueOf(momentTopicRemoveAdmin.getUserId()) : null), false, 12);
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                UserInfoActivity.OooO00o oooO00o13 = UserInfoActivity.f23471o0OOO0o;
                                AppCompatActivity appCompatActivity13 = o0000o00.f45018OooO00o;
                                MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice = momentMessage.getTopicGroupCreateSuccessNotice();
                                UserInfoActivity.OooO00o.OooO0Oo(oooO00o13, appCompatActivity13, OooO.OooO(topicGroupCreateSuccessNotice != null ? topicGroupCreateSuccessNotice.getUserId() : null, ""), false, 12);
                                break;
                            }
                        } else {
                            UserInfoActivity.OooO00o oooO00o14 = UserInfoActivity.f23471o0OOO0o;
                            AppCompatActivity appCompatActivity14 = o0000o00.f45018OooO00o;
                            MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice2 = momentMessage.getTopicGroupCreateSuccessNotice();
                            UserInfoActivity.OooO00o.OooO0Oo(oooO00o14, appCompatActivity14, OooO.OooO(topicGroupCreateSuccessNotice2 != null ? topicGroupCreateSuccessNotice2.getUserId() : null, ""), false, 12);
                            break;
                        }
                    } else {
                        UserInfoActivity.OooO00o oooO00o15 = UserInfoActivity.f23471o0OOO0o;
                        AppCompatActivity appCompatActivity15 = o0000o00.f45018OooO00o;
                        MomentMessage.MomentTopicTopRevoke momentTopicTopRevoke = momentMessage.getMomentTopicTopRevoke();
                        UserInfoActivity.OooO00o.OooO0Oo(oooO00o15, appCompatActivity15, String.valueOf(momentTopicTopRevoke != null ? Long.valueOf(momentTopicTopRevoke.getUserId()) : null), false, 12);
                        break;
                    }
                    break;
                case R.id.ivImage /* 2131297693 */:
                case R.id.ivLike /* 2131297713 */:
                case R.id.layoutBg /* 2131298043 */:
                case R.id.layoutClick /* 2131298047 */:
                case R.id.layoutContent /* 2131298048 */:
                case R.id.tvContent /* 2131299373 */:
                case R.id.tvName /* 2131299543 */:
                case R.id.tvTime /* 2131299706 */:
                    MomentMessage momentMessage2 = o0000O00.this.f45020OooO0OO;
                    if (momentMessage2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage2 = null;
                    }
                    o0000O00 o0000o01 = o0000O00.this;
                    o0O00000.OooO0OO("Moments_notice_details");
                    PostCommentDetailModel postCommentDetailModel = new PostCommentDetailModel();
                    int type2 = momentMessage2.getType();
                    if (type2 != -12) {
                        switch (type2) {
                            case 1:
                                MomentMessage.MomentPraise momentPraise2 = momentMessage2.getMomentPraise();
                                OooO0O0(this, momentPraise2 != null ? Long.valueOf(momentPraise2.getMomentId()) : null, null, 6);
                                break;
                            case 2:
                                MomentMessage.CommentPraise commentPraise2 = momentMessage2.getCommentPraise();
                                OooO0O0(this, commentPraise2 != null ? Long.valueOf(commentPraise2.getMomentId()) : null, null, 6);
                                break;
                            case 3:
                                MomentMessage.MomentComment momentComment2 = momentMessage2.getMomentComment();
                                if (momentComment2 != null) {
                                    postCommentDetailModel.setLoadPostCommentDetailModel(momentComment2.getCommentId(), String.valueOf(momentComment2.getUserId()), momentComment2.getUserNickName(), momentComment2.getUserHeadUrl(), momentComment2.getCommentContent(), momentMessage2.getTime(), true);
                                }
                                MomentMessage.MomentComment momentComment3 = momentMessage2.getMomentComment();
                                Long lValueOf = momentComment3 != null ? Long.valueOf(momentComment3.getMomentId()) : null;
                                MomentMessage.MomentComment momentComment4 = momentMessage2.getMomentComment();
                                OooO00o(lValueOf, momentComment4 != null ? Long.valueOf(momentComment4.getCommentId()) : null, postCommentDetailModel);
                                break;
                            case 4:
                                MomentMessage.CommentReply commentReply2 = momentMessage2.getCommentReply();
                                if (commentReply2 != null) {
                                    postCommentDetailModel.setLoadPostCommentDetailModel(commentReply2.getCommentId(), String.valueOf(commentReply2.getUserId()), commentReply2.getUserNickName(), commentReply2.getUserHeadUrl(), commentReply2.getCommentContent(), momentMessage2.getTime(), true);
                                }
                                MomentMessage.CommentReply commentReply3 = momentMessage2.getCommentReply();
                                Long lValueOf2 = commentReply3 != null ? Long.valueOf(commentReply3.getMomentId()) : null;
                                MomentMessage.CommentReply commentReply4 = momentMessage2.getCommentReply();
                                OooO00o(lValueOf2, commentReply4 != null ? Long.valueOf(commentReply4.getCommentId()) : null, postCommentDetailModel);
                                break;
                            case 5:
                                MomentMessage.MomentAt momentAt2 = momentMessage2.getMomentAt();
                                OooO0O0(this, momentAt2 != null ? Long.valueOf(momentAt2.getMomentId()) : null, null, 6);
                                break;
                            case 6:
                                MomentMessage.CommentAt commentAt2 = momentMessage2.getCommentAt();
                                if (commentAt2 != null) {
                                    postCommentDetailModel.setLoadPostCommentDetailModel(commentAt2.getCommentId(), String.valueOf(commentAt2.getUserId()), commentAt2.getUserNickName(), commentAt2.getUserHeadUrl(), commentAt2.getCommentContent(), momentMessage2.getTime(), true);
                                }
                                MomentMessage.CommentAt commentAt3 = momentMessage2.getCommentAt();
                                Long lValueOf3 = commentAt3 != null ? Long.valueOf(commentAt3.getMomentId()) : null;
                                MomentMessage.CommentAt commentAt4 = momentMessage2.getCommentAt();
                                OooO00o(lValueOf3, commentAt4 != null ? Long.valueOf(commentAt4.getCommentId()) : null, postCommentDetailModel);
                                break;
                            case 7:
                                MomentMessage.MomentGift momentGift2 = momentMessage2.getMomentGift();
                                OooO0O0(this, momentGift2 != null ? Long.valueOf(momentGift2.getMomentId()) : null, null, 6);
                                break;
                            case 8:
                                MomentMessage.CommentReward commentReward2 = momentMessage2.getCommentReward();
                                Long lValueOf4 = commentReward2 != null ? Long.valueOf(commentReward2.getMomentId()) : null;
                                MomentMessage.CommentReward commentReward3 = momentMessage2.getCommentReward();
                                OooO0O0(this, lValueOf4, commentReward3 != null ? Long.valueOf(commentReward3.getCommentId()) : null, 4);
                                break;
                            case 9:
                                MomentMessage.ReplyReward replyReward2 = momentMessage2.getReplyReward();
                                Long lValueOf5 = replyReward2 != null ? Long.valueOf(replyReward2.getMomentId()) : null;
                                MomentMessage.ReplyReward replyReward3 = momentMessage2.getReplyReward();
                                OooO0O0(this, lValueOf5, replyReward3 != null ? Long.valueOf(replyReward3.getCommentId()) : null, 4);
                                break;
                            case 10:
                                MomentMessage.MomentFeatured momentFeatured = momentMessage2.getMomentFeatured();
                                OooO0O0(this, momentFeatured != null ? Long.valueOf(momentFeatured.getMomentId()) : null, null, 6);
                                break;
                            case 11:
                                MomentMessage.CommentFeatured commentFeatured = momentMessage2.getCommentFeatured();
                                Long lValueOf6 = commentFeatured != null ? Long.valueOf(commentFeatured.getMomentId()) : null;
                                MomentMessage.CommentFeatured commentFeatured2 = momentMessage2.getCommentFeatured();
                                OooO0O0(this, lValueOf6, commentFeatured2 != null ? Long.valueOf(commentFeatured2.getCommentId()) : null, 4);
                                break;
                            case 12:
                                MomentMessage.MomentTopicTop momentTopicTop2 = momentMessage2.getMomentTopicTop();
                                OooO0OO(momentTopicTop2 != null ? Long.valueOf(momentTopicTop2.getTopicId()) : null);
                                break;
                            case 13:
                                MomentMessage.MomentTopicRemoveOwner momentTopicRemoveOwner2 = momentMessage2.getMomentTopicRemoveOwner();
                                OooO0O0(this, momentTopicRemoveOwner2 != null ? Long.valueOf(momentTopicRemoveOwner2.getMomentId()) : null, null, 6);
                                break;
                            case 14:
                                MomentMessage.MomentTopicRemoveAdmin momentTopicRemoveAdmin2 = momentMessage2.getMomentTopicRemoveAdmin();
                                OooO0O0(this, momentTopicRemoveAdmin2 != null ? Long.valueOf(momentTopicRemoveAdmin2.getMomentId()) : null, null, 6);
                                break;
                            case 15:
                                MomentMessage.MomentSystemRemove momentSystemRemove = momentMessage2.getMomentSystemRemove();
                                OooO0O0(this, momentSystemRemove != null ? Long.valueOf(momentSystemRemove.getMomentId()) : null, null, 6);
                                break;
                            case 16:
                                MomentMessage.MomentReportFeedback momentReportFeedback = momentMessage2.getMomentReportFeedback();
                                OooO0O0(this, momentReportFeedback != null ? momentReportFeedback.getMomentId() : null, null, 6);
                                break;
                            case 17:
                                MomentMessage.CommentReportFeedback commentReportFeedback = momentMessage2.getCommentReportFeedback();
                                o0000O0O o0000o0o2 = new o0000O0O(this, momentMessage2);
                                Objects.requireNonNull(o0000o01);
                                if (commentReportFeedback != null) {
                                    AppCompatActivity appCompatActivity16 = o0000o01.f45018OooO00o;
                                    BaseActivityK baseActivityK = appCompatActivity16 instanceof BaseActivityK ? (BaseActivityK) appCompatActivity16 : null;
                                    if (baseActivityK != null) {
                                        BaseActivityK.OooOoo0(baseActivityK, null, 0L, 3, null);
                                    }
                                    MomentVM momentVM = o0000o01.f45021OooO0Oo;
                                    if (momentVM != null && (commentInfo = momentVM.getCommentInfo(oOO00O.OooO0o(commentReportFeedback.getCommentId()))) != null) {
                                        commentInfo.observe(o0000o01.f45018OooO00o, new OooOo(new o0000oo(o0000o0o2), null, new o0000O0(o0000o01), false, 10));
                                    }
                                }
                                break;
                            case 18:
                                OooO0Oo(momentMessage2.getTopicGroupCreateSuccessNotice());
                                break;
                            case 19:
                                OooO0Oo(momentMessage2.getTopicGroupCreateSuccessNotice());
                                break;
                            case 20:
                                MomentMessage.CircleReportFeedback circleReportFeedback = momentMessage2.getCircleReportFeedback();
                                OooO0OO(circleReportFeedback != null ? circleReportFeedback.getCircleId() : null);
                                break;
                        }
                    } else {
                        MomentMessage.MomentTopicTopRevoke momentTopicTopRevoke2 = momentMessage2.getMomentTopicTopRevoke();
                        OooO0OO(momentTopicTopRevoke2 != null ? Long.valueOf(momentTopicTopRevoke2.getTopicId()) : null);
                    }
                    o0000o01.OooO0O0(false);
                    break;
                case R.id.tvReply /* 2131299620 */:
                    o0O00000.OooO0OO("Moments_notice_reply");
                    o0000O00.this.OooO0O0(true);
                    break;
            }
        }
    }

    public o0000O00(@NotNull AppCompatActivity activity, @NotNull o000OO viewHolder) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f45018OooO00o = activity;
        this.f45019OooO0O0 = LazyKt.lazy(new OooO00o(viewHolder));
        this.f45022OooO0o = new OooO0O0();
        OooO00o().f44980OooO00o.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44981OooO0O0.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44982OooO0OO.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44983OooO0Oo.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44985OooO0o0.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44984OooO0o.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44986OooO0oO.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44987OooO0oo.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44979OooO.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44988OooOO0.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44989OooOO0O.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44990OooOO0o.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44992OooOOO0.setOnClickListener(this.f45022OooO0o);
        OooO00o().f44991OooOOO.setOnClickListener(this.f45022OooO0o);
    }

    public final void OooO() {
        MomentMessage momentMessage = this.f45020OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice = momentMessage.getTopicGroupCreateSuccessNotice();
        if (topicGroupCreateSuccessNotice != null) {
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.f48447OooO0OO = o00O0.OooO0oO(topicGroupCreateSuccessNotice.getHeadUrl());
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44983OooO0Oo);
            OooO00o().f44985OooO0o0.setText(o00O0.OooO0oO(topicGroupCreateSuccessNotice.getNickName()));
            OooO00o().f44986OooO0oO.setText(com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.topic_group_join_success_notify_xxx), o00O0.OooO0oO(topicGroupCreateSuccessNotice.getCircleName())));
            OooO00o().f44986OooO0oO.setVisibility(0);
            TextView textView = OooO00o().f44987OooO0oo;
            MomentMessage momentMessage3 = this.f45020OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f44979OooO.setVisibility(8);
            OooO00o().f44988OooOO0.setVisibility(8);
            if (TextUtils.isEmpty(o00O0.OooO0oO(topicGroupCreateSuccessNotice.getCircleHead()))) {
                return;
            }
            OooO00o().f44988OooOO0.setVisibility(0);
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO());
            oooO00o2.OooO0oO(6);
            oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgSize(topicGroupCreateSuccessNotice.getCircleHead(), OooOo00.OooO00o(60), true);
            oooO00o2.f48445OooO00o = 0;
            oooO00o2.OooO0o(OooO00o().f44988OooOO0);
        }
    }

    public final o0000 OooO00o() {
        return (o0000) this.f45019OooO0O0.getValue();
    }

    public final void OooO0O0(boolean z) {
        MomentMessage momentMessage = null;
        if (!z) {
            o0Oo0oo.OooO0o0(553, null);
            return;
        }
        MomentMessage momentMessage2 = this.f45020OooO0OO;
        if (momentMessage2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
        } else {
            momentMessage = momentMessage2;
        }
        o0Oo0oo.OooO0o0(553, momentMessage);
    }

    public final void OooO0OO() {
        MomentMessage momentMessage = this.f45020OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.CircleReportFeedback circleReportFeedback = momentMessage.getCircleReportFeedback();
        if (circleReportFeedback != null) {
            OooO00o().f44983OooO0Oo.setImageResource(R.drawable.icon_moment_featurd_head);
            OooO00o().f44985OooO0o0.setText(!TextUtils.isEmpty(o00O0.OooO0oO(circleReportFeedback.getCircleTitle())) ? o00O0.OooO0oO(circleReportFeedback.getCircleTitle()) : OooOOO.OooO0OO(R.string.Thanks_for_your_report));
            OooO00o().f44986OooO0oO.setText(o00O0.OooO0oO(circleReportFeedback.getCircleContent()));
            OooO00o().f44986OooO0oO.setVisibility(0);
            TextView textView = OooO00o().f44987OooO0oo;
            MomentMessage momentMessage3 = this.f45020OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f44979OooO.setVisibility(8);
            OooO00o().f44988OooOO0.setVisibility(8);
            if (TextUtils.isEmpty(o00O0.OooO0oO(circleReportFeedback.getCircleImageUrl()))) {
                return;
            }
            OooO00o().f44988OooOO0.setVisibility(0);
            String strImgSize = CloudImageUtilKt.imgSize(o00O0.OooO0oO(circleReportFeedback.getCircleImageUrl()), OooOo00.OooO00o(120), true);
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oO(6);
            oooO00o.f48447OooO0OO = strImgSize;
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44988OooOO0);
        }
    }

    public final void OooO0Oo() {
        MomentSendContentModel momentSendContentModel;
        MomentMessage momentMessage = this.f45020OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.CommentFeatured commentFeatured = momentMessage.getCommentFeatured();
        if (commentFeatured != null) {
            OooO00o().f44983OooO0Oo.setImageResource(R.drawable.icon_moment_featurd_head);
            OooO00o().f44985OooO0o0.setText(OooOOO.OooO0OO(R.string.Moment_Message_comment_featured));
            OooO00o().f44986OooO0oO.setText("");
            String content = commentFeatured.getMomentContent();
            Intrinsics.checkNotNullParameter(content, "content");
            if (content.length() == 0) {
                momentSendContentModel = null;
            } else {
                momentSendContentModel = new MomentSendContentModel("");
                try {
                    Object objOooO0OO = com.android.billingclient.api.o0Oo0oo.OooO0OO(content, new o00oOoo().getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(content, object…tSendContentModel?>() {})");
                    momentSendContentModel = (MomentSendContentModel) objOooO0OO;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (momentSendContentModel != null) {
                o00OOOO0.OooO0O0(this.f45018OooO00o, momentSendContentModel, OooO00o().f44986OooO0oO, null);
                OooO00o().f44986OooO0oO.getEditableText().insert(0, Html.fromHtml("<font color='#999999'> " + OooOOO.OooO0OO(R.string.MessageFragment_moment_comment_postFeatured_itemInfo) + "</font> "));
            }
            OooO00o().f44986OooO0oO.setVisibility(0);
            TextView textView = OooO00o().f44987OooO0oo;
            MomentMessage momentMessage3 = this.f45020OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f44979OooO.setVisibility(8);
            OooO00o().f44988OooOO0.setVisibility(8);
            if (TextUtils.isEmpty(commentFeatured.getMomentImageUrl())) {
                return;
            }
            OooO00o().f44988OooOO0.setVisibility(0);
            String strImgSize = CloudImageUtilKt.imgSize(commentFeatured.getMomentImageUrl(), OooOo00.OooO00o(120), true);
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oO(6);
            oooO00o.f48447OooO0OO = strImgSize;
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44988OooOO0);
        }
    }

    public final void OooO0o() {
        MomentMessage momentMessage = this.f45020OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.MomentReportFeedback momentReportFeedback = momentMessage.getMomentReportFeedback();
        if (momentReportFeedback != null) {
            OooO00o().f44983OooO0Oo.setImageResource(R.drawable.icon_moment_featurd_head);
            OooO00o().f44985OooO0o0.setText(!TextUtils.isEmpty(o00O0.OooO0oO(momentReportFeedback.getMomentTitle())) ? o00O0.OooO0oO(momentReportFeedback.getMomentTitle()) : OooOOO.OooO0OO(R.string.Thanks_for_your_report));
            OooO00o().f44986OooO0oO.setText(momentReportFeedback.getMomentContent());
            OooO00o().f44986OooO0oO.setVisibility(0);
            TextView textView = OooO00o().f44987OooO0oo;
            MomentMessage momentMessage3 = this.f45020OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f44979OooO.setVisibility(8);
            OooO00o().f44988OooOO0.setVisibility(8);
            if (TextUtils.isEmpty(momentReportFeedback.getMomentImageUrl())) {
                return;
            }
            OooO00o().f44988OooOO0.setVisibility(0);
            String strImgSize = CloudImageUtilKt.imgSize(momentReportFeedback.getMomentImageUrl(), OooOo00.OooO00o(120), true);
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oO(6);
            oooO00o.f48447OooO0OO = strImgSize;
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44988OooOO0);
        }
    }

    public final void OooO0o0() {
        MomentMessage momentMessage = this.f45020OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.CommentReportFeedback commentReportFeedback = momentMessage.getCommentReportFeedback();
        if (commentReportFeedback != null) {
            OooO00o().f44983OooO0Oo.setImageResource(R.drawable.icon_moment_featurd_head);
            OooO00o().f44985OooO0o0.setText(!TextUtils.isEmpty(o00O0.OooO0oO(commentReportFeedback.getTitle())) ? o00O0.OooO0oO(commentReportFeedback.getTitle()) : OooOOO.OooO0OO(R.string.Thanks_for_your_report));
            OooO00o().f44986OooO0oO.setText(commentReportFeedback.getContent());
            OooO00o().f44986OooO0oO.setVisibility(0);
            TextView textView = OooO00o().f44987OooO0oo;
            MomentMessage momentMessage3 = this.f45020OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f44979OooO.setVisibility(8);
            OooO00o().f44988OooOO0.setVisibility(8);
            if (TextUtils.isEmpty(commentReportFeedback.getMomentImageUrl())) {
                return;
            }
            OooO00o().f44988OooOO0.setVisibility(0);
            String strImgSize = CloudImageUtilKt.imgSize(commentReportFeedback.getMomentImageUrl(), OooOo00.OooO00o(120), true);
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oO(6);
            oooO00o.f48447OooO0OO = strImgSize;
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44988OooOO0);
        }
    }

    public final void OooO0oO() {
        MomentMessage momentMessage = this.f45020OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.MomentSystemRemove momentSystemRemove = momentMessage.getMomentSystemRemove();
        if (momentSystemRemove != null) {
            OooO00o().f44983OooO0Oo.setImageResource(R.drawable.icon_moment_featurd_head);
            OooO00o().f44985OooO0o0.setText(OooOOO.OooO0OO(R.string.Post_Deleted));
            String strOooO00o = o0OOO0o.OooO00o(momentSystemRemove.getDeleteType());
            MomentMessage momentMessage3 = this.f45020OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            String strOooO0Oo = oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis());
            OooO00o().f44986OooO0oO.setText(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.We_deleted_your_post_posted_XXX_for_XXX), strOooO0Oo), strOooO00o));
            OooO00o().f44986OooO0oO.setVisibility(0);
            OooO00o().f44987OooO0oo.setText(strOooO0Oo);
            OooO00o().f44979OooO.setVisibility(8);
            OooO00o().f44988OooOO0.setVisibility(8);
            if (TextUtils.isEmpty(momentSystemRemove.getMomentImageUrl())) {
                return;
            }
            OooO00o().f44988OooOO0.setVisibility(0);
            String strImgSize = CloudImageUtilKt.imgSize(momentSystemRemove.getMomentImageUrl(), OooOo00.OooO00o(120), true);
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oO(6);
            oooO00o.f48447OooO0OO = strImgSize;
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44988OooOO0);
        }
    }

    public final void OooO0oo() {
        MomentMessage momentMessage = this.f45020OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice = momentMessage.getTopicGroupCreateSuccessNotice();
        if (topicGroupCreateSuccessNotice != null) {
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.f48447OooO0OO = o00O0.OooO0oO(topicGroupCreateSuccessNotice.getHeadUrl());
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44983OooO0Oo);
            OooO00o().f44985OooO0o0.setText(o00O0.OooO0oO(topicGroupCreateSuccessNotice.getNickName()));
            OooO00o().f44986OooO0oO.setText(com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.topic_group_create_success_notify_xxx), o00O0.OooO0oO(topicGroupCreateSuccessNotice.getCircleName())));
            OooO00o().f44986OooO0oO.setVisibility(0);
            TextView textView = OooO00o().f44987OooO0oo;
            MomentMessage momentMessage3 = this.f45020OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f44979OooO.setVisibility(8);
            OooO00o().f44988OooOO0.setVisibility(8);
            if (TextUtils.isEmpty(o00O0.OooO0oO(topicGroupCreateSuccessNotice.getCircleHead()))) {
                return;
            }
            OooO00o().f44988OooOO0.setVisibility(0);
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o2.OooO0oO(6);
            oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgSize(topicGroupCreateSuccessNotice.getCircleHead(), OooOo00.OooO00o(60), true);
            oooO00o2.f48445OooO00o = 0;
            oooO00o2.OooO0o(OooO00o().f44988OooOO0);
        }
    }

    public final void OooOO0() {
        MomentMessage momentMessage = this.f45020OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.MomentTopicRemoveAdmin momentTopicRemoveAdmin = momentMessage.getMomentTopicRemoveAdmin();
        if (momentTopicRemoveAdmin != null) {
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.f48447OooO0OO = momentTopicRemoveAdmin.getUserHeadUrl();
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44983OooO0Oo);
            OooO00o().f44985OooO0o0.setText(OooOOO.OooO0OO(R.string.MessageFragment_moment_postRemoved));
            OooO00o().f44986OooO0oO.setText(com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.moment_message_removed_from_xxx_topic_admin), momentTopicRemoveAdmin.getTopicName()));
            OooO00o().f44986OooO0oO.setVisibility(0);
            TextView textView = OooO00o().f44987OooO0oo;
            MomentMessage momentMessage3 = this.f45020OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f44979OooO.setVisibility(8);
            OooO00o().f44988OooOO0.setVisibility(8);
            if (TextUtils.isEmpty(momentTopicRemoveAdmin.getMomentImageUrl())) {
                return;
            }
            OooO00o().f44988OooOO0.setVisibility(0);
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o2.OooO0oO(6);
            oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgSize(momentTopicRemoveAdmin.getMomentImageUrl(), OooOo00.OooO00o(60), true);
            oooO00o2.f48445OooO00o = 0;
            oooO00o2.OooO0o(OooO00o().f44988OooOO0);
        }
    }

    public final void OooOO0O() {
        MomentMessage momentMessage = this.f45020OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.MomentTopicRemoveOwner momentTopicRemoveOwner = momentMessage.getMomentTopicRemoveOwner();
        if (momentTopicRemoveOwner != null) {
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.f48447OooO0OO = momentTopicRemoveOwner.getUserHeadUrl();
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44983OooO0Oo);
            OooO00o().f44985OooO0o0.setText(OooOOO.OooO0OO(R.string.MessageFragment_moment_postRemoved));
            OooO00o().f44986OooO0oO.setText(com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.MessageFragment_moment_postRemoved_itemInfo), momentTopicRemoveOwner.getTopicName()));
            OooO00o().f44986OooO0oO.setVisibility(0);
            TextView textView = OooO00o().f44987OooO0oo;
            MomentMessage momentMessage3 = this.f45020OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f44979OooO.setVisibility(8);
            OooO00o().f44988OooOO0.setVisibility(8);
            if (TextUtils.isEmpty(momentTopicRemoveOwner.getMomentImageUrl())) {
                return;
            }
            OooO00o().f44988OooOO0.setVisibility(0);
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o2.OooO0oO(6);
            oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgSize(momentTopicRemoveOwner.getMomentImageUrl(), OooOo00.OooO00o(60), true);
            oooO00o2.f48445OooO00o = 0;
            oooO00o2.OooO0o(OooO00o().f44988OooOO0);
        }
    }

    public final void OooOO0o() {
        MomentMessage momentMessage = this.f45020OooO0OO;
        MomentMessage momentMessage2 = null;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.MomentTopicTop momentTopicTop = momentMessage.getMomentTopicTop();
        if (momentTopicTop != null) {
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.f48447OooO0OO = momentTopicTop.getUserHeadUrl();
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44983OooO0Oo);
            OooO00o().f44985OooO0o0.setText(OooOOO.OooO0OO(R.string.MessageFragment_moment_postPinned));
            OooO00o().f44986OooO0oO.setText(com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.MessageFragment_moment_postPinned_itemInfo), momentTopicTop.getTopicName()));
            OooO00o().f44986OooO0oO.setVisibility(0);
            TextView textView = OooO00o().f44987OooO0oo;
            MomentMessage momentMessage3 = this.f45020OooO0OO;
            if (momentMessage3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            } else {
                momentMessage2 = momentMessage3;
            }
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            OooO00o().f44979OooO.setVisibility(8);
            OooO00o().f44988OooOO0.setVisibility(8);
            if (TextUtils.isEmpty(momentTopicTop.getMomentImageUrl())) {
                return;
            }
            OooO00o().f44988OooOO0.setVisibility(0);
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o2.OooO0oO(6);
            oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgSize(momentTopicTop.getMomentImageUrl(), OooOo00.OooO00o(60), true);
            oooO00o2.f48445OooO00o = 0;
            oooO00o2.OooO0o(OooO00o().f44988OooOO0);
        }
    }

    public final void OooOOO0() {
        MomentSendContentModel momentSendContentModel;
        MomentMessage momentMessage = this.f45020OooO0OO;
        if (momentMessage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage = null;
        }
        MomentMessage.ReplyReward replyReward = momentMessage.getReplyReward();
        if (replyReward != null) {
            OooO00o().f44979OooO.setVisibility(8);
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f45018OooO00o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.f48447OooO0OO = replyReward.getUserHeadUrl();
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(OooO00o().f44983OooO0Oo);
            OooO00o().f44985OooO0o0.setText(o00Ooo.f42780OooO00o.OooO0O0(replyReward.getUserId(), replyReward.getUserNickName()));
            TextView textView = OooO00o().f44987OooO0oo;
            MomentMessage momentMessage2 = this.f45020OooO0OO;
            if (momentMessage2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
                momentMessage2 = null;
            }
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
            if (OooO0OO.OooO0O0(replyReward.getMomentImageUrl())) {
                oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.f45018OooO00o);
                oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
                oooO00o2.OooO0oO(6);
                oooO00o2.f48447OooO0OO = replyReward.getMomentImageUrl();
                oooO00o2.f48445OooO00o = 0;
                oooO00o2.OooO0o(OooO00o().f44988OooOO0);
                OooO00o().f44988OooOO0.setVisibility(0);
            } else {
                OooO00o().f44988OooOO0.setVisibility(8);
            }
            OooO00o().f44984OooO0o.setVisibility(0);
            OooO00o().f44984OooO0o.setImageResource(R.drawable.icon_message_reward_red);
            OooO00o().f44991OooOOO.setVisibility(0);
            String content = replyReward.getCommentContent();
            Intrinsics.checkNotNullParameter(content, "content");
            if (content.length() == 0) {
                momentSendContentModel = null;
            } else {
                momentSendContentModel = new MomentSendContentModel("");
                try {
                    Object objOooO0OO = com.android.billingclient.api.o0Oo0oo.OooO0OO(content, new o00oOoo().getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(content, object…tSendContentModel?>() {})");
                    momentSendContentModel = (MomentSendContentModel) objOooO0OO;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            o00OOOO0.OooO0O0(this.f45018OooO00o, momentSendContentModel, OooO00o().f44991OooOOO, null);
            OooO00o().f44991OooOOO.getEditableText().insert(0, Html.fromHtml("<font color='#999999'> " + OooOOO.OooO0OO(R.string.moment_message_reward_comments_title) + "</font> "));
        }
    }
}
