package com.yalla.yalla.ui.view;

import Oooo000.o00oO0o;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o00O0O;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.app.base.framework.view.textView.ViewLocation;
import com.app.base.model.RoomModel;
import com.app.base.util.spannableStringUtils.SpannableStringModel;
import com.app.base.view.FixTextView;
import com.app.base.view.imageMore.ImageMoreItemView;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogActionTypeHitDetail;
import com.yalla.yalla.common.model.MomentLogActionTypeHitImage;
import com.yalla.yalla.common.model.MomentLogActionTypePraise;
import com.yalla.yalla.common.model.MomentLogSourcePage;
import com.yalla.yalla.common.model.ShareToFriendModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.ui.view.PraiseView;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.UserVipView;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.CheckUserBlackResultModel;
import com.yalla.yalla.model.MomentAdDataModel;
import com.yalla.yalla.model.MomentCommentModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentEditBefore;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.model.MomentPowerSelectModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentSendShareModel;
import com.yalla.yalla.model.MomentSendShareType;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.MomentTypeDelete;
import com.yalla.yalla.model.MomentTypeKt;
import com.yalla.yalla.model.MomentTypePower;
import com.yalla.yalla.model.MomentTypeShareKt;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.OnTopPostForUserPostModel;
import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.TopicGroupInfoModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.MomentEditRecordActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.view.MomentDetailView;
import com.yalla.yalla.ui.view.MomentSendTaskView;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;
import p142o00OOooO.o0000O;
import p143o00OOooo.oo0O;
import p152o00Oo0o0.o00Oo00;
import p168o00Ooo0.o00Oo0;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.oo000o;
import p173o00OooO0.o0o0Oo;
import p174o00OooOO.o0O00OOO;
import p174o00OooOO.o0oO0Ooo;
import p177o00Ooooo.oO0;
import p182o00o0000.o0OO00O;
import p182o00o0000.oo0o0Oo;
import p238o00oOooO.oOOOOo0O;
import p251o00ooO.o000Oo0;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.oo0oOO0;
import p358o0OOOo0o.o0000O0O;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.o00O0OO;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o00O0;
import p522o0o0O0o.oOO00O;
import p522o0o0O0o.oo0o0O0;
import p569o0oOo0OO.o000O00O;
import p584o0oOoo.o000O;
import p595o0oOoooo.u5;
import p601o0oo00Oo.o0;
import p601o0oo00Oo.o0O00;
import p601o0oo00Oo.o0O000;
import p601o0oo00Oo.o0O0000O;
import p601o0oo00Oo.o0O000O;
import p601o0oo00Oo.o0O000Oo;
import p601o0oo00Oo.o0O000o0;
import p601o0oo00Oo.o0O00O0o;
import p601o0oo00Oo.o0O00OO;
import p601o0oo00Oo.o0O00o0;
import p601o0oo00Oo.o0O00o00;
import p601o0oo00Oo.o0O00oO0;
import p601o0oo00Oo.o0O0O0O;
import p601o0oo00Oo.o0O0O0Oo;
import p601o0oo00Oo.o0O0O0o0;
import p601o0oo00Oo.o0O0OO0;
import p601o0oo00Oo.o0O0OOO0;
import p601o0oo00Oo.o0O0OOOo;
import p601o0oo00Oo.o0O0o;
import p601o0oo00Oo.o0O0o0;
import p601o0oo00Oo.o0O0o000;
import p601o0oo00Oo.o0O0o00O;
import p601o0oo00Oo.o0OoOoOo;
import p601o0oo00Oo.o0oO0O0o;
import p601o0oo00Oo.o0oOOo;
import p601o0oo00Oo.o0oOo0O0;
import p601o0oo00Oo.oo00oO;
import p601o0oo00Oo.oo0OOoo;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.p9;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010]\u001a\u00020\\\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010^\u0012\b\b\u0002\u0010`\u001a\u000202¢\u0006\u0004\ba\u0010bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fJ\u0010\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"J\u001e\u0010(\u001a\u00020\u00042\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\"0%j\b\u0012\u0004\u0012\u00020\"`&J\u000e\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001fJ\u000e\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+J\u000e\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020+J\u000e\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020+J\u000e\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u000202J\u0006\u00105\u001a\u00020\"J\u0010\u00107\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0002J\u0006\u00109\u001a\u000208J\u000e\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u00020+J\u0010\u0010>\u001a\u00020\u00042\b\u0010=\u001a\u0004\u0018\u00010<J\u0010\u0010A\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010?J\u000e\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020+R0\u0010L\u001a\u0010\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR2\u0010P\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010S\u001a\u0004\bY\u0010Z¨\u0006c"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentDetailView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/model/MomentDetailModel;", "item", "", "setToShare", "setContentLayout", "postDetail", "setTopicInfo", "setTextInfo", "setImageInfo", "setBottomInfo", "Lcom/yalla/yalla/model/MomentAdDataModel;", "adData", "setPostAdView", "Lcom/yalla/yalla/model/MomentSendModel;", "sendPostModel", "setSendTaskLayout", "Lcom/yalla/yalla/model/MomentForwardContent;", "forwardContent", "setMomentEvent", "postDetailModelForward0", "setForwardShareView", "itemData", "setShareData", "setForwardData", "setForwardText", "setForwardImage", "Landroidx/fragment/app/FragmentActivity;", "activity", "setPostDetailHeaderView", "", "topicDetailId", "setTopicDetailId", "", "topicOwnerId", "setTopicOwnerId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "topicManagerIds", "setTopicManagers", "topPostId", "setTopPostId", "", "forwarding", "setForwarding", "showReply", "setShowReply", "fromTopicDetail", "setFromTopicDetail", "", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "setLineParentBottom", "getContentTextContent", "data", "setData", "Landroid/app/Activity;", "getActivity", "enable", "setAutoSplitEnabled", "Lcom/yalla/yalla/common/event/webEvent/EnterRoomParentPage;", "enterRoomParentPage", "setEnterRoomParentPage", "Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "momentAdapterTag", "setMomentAdapterTag", "isPostDetailPage", "setIsPostDetailPage", "Lkotlin/Function1;", "Lcom/yalla/yalla/ui/adapter/postList/PostDetailHeaderViewTag;", "Ooooo0o", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "OooooO0", "getShowGiftDialogListener", "setShowGiftDialogListener", "showGiftDialogListener", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "Oooooo0", "Lkotlin/Lazy;", "getMomentVM", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "momentVM", "Lcom/yalla/yalla/ui/vm/moment/YallaChatVM;", "Oooooo", "getYallaChatVM", "()Lcom/yalla/yalla/ui/vm/moment/YallaChatVM;", "yallaChatVM", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentDetailView extends LinearLayout {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final /* synthetic */ int f24937OoooooO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public MomentAdapterTag f24938Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public p9 f24939Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public FragmentActivity f24940Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public MomentDetailModel f24941Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public long f24942OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public String f24943OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f24944OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public ArrayList<String> f24945OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public com.app.base.view.imageMore.ImageMoreView f24946OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f24947OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public o00Oo0 f24948OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public o00Oo0 f24949OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public oo0o0Oo f24950OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public EnterRoomParentPage f24951OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f24952Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super PostDetailHeaderViewTag, Unit> listener;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super MomentDetailModel, Unit> showGiftDialogListener;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f24955OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f24956OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy yallaChatVM;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy momentVM;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f24959o000oOoO;

    public static final class OooO extends Lambda implements Function2<Integer, o000Oo0, Object> {
        public OooO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, o000Oo0 o000oo1) {
            Integer num2 = num;
            boolean z = false;
            if (num2 != null && num2.intValue() == 0) {
                o0O00000.OooO0OO("Moments_share");
                MomentDetailModel momentDetailModel = MomentDetailView.this.f24941Oooo0oo;
                if (momentDetailModel != null && momentDetailModel.getIsInHeBlack() == 1) {
                    z = true;
                }
                if (z) {
                    ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.On_His_Blacklist));
                    return null;
                }
                ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareType.Moment);
                shareToFriendModel.setMomentAdapterTag(MomentDetailView.this.f24938Oooo);
                shareToFriendModel.setPostDetailModel(MomentDetailView.this.f24941Oooo0oo);
                ShareToFriendsActivity.f22209o00o0O.OooO00o(MomentDetailView.this.getActivity(), shareToFriendModel);
                return null;
            }
            if (num2 == null || num2.intValue() != 1) {
                return null;
            }
            MomentDetailModel momentDetailModel2 = MomentDetailView.this.f24941Oooo0oo;
            if (momentDetailModel2 != null && momentDetailModel2.getIsInHeBlack() == 1) {
                z = true;
            }
            if (z) {
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.On_His_Blacklist));
                return null;
            }
            MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
            Activity context = MomentDetailView.this.getActivity();
            MomentDetailView momentDetailView = MomentDetailView.this;
            MomentDetailModel momentDetailModel3 = momentDetailView.f24941Oooo0oo;
            MomentAdapterTag momentAdapterTag = momentDetailView.f24938Oooo;
            Intrinsics.checkNotNullParameter(context, "context");
            MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Forward.getValue());
            momentSendShareModel.setSharePostType(MomentSendShareType.ForwardPost);
            momentSendShareModel.setForwardMomentDetailModel(momentDetailModel3);
            momentSendShareModel.setMomentAdapterTag(momentAdapterTag);
            oooO00o.OooO0O0(context, momentSendShareModel);
            return null;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Context f24962Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(1);
            this.f24962Oooo0oO = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                p606o0oo0O.OooOo.OooO0O0("103010");
            }
            MomentDetailView momentDetailView = MomentDetailView.this;
            if (!momentDetailView.f24952Ooooo00 && momentDetailView.f24938Oooo != MomentAdapterTag.MomentEditRecord) {
                com.yalla.yalla.ui.view.OooO0OO onLogin = new com.yalla.yalla.ui.view.OooO0OO(momentDetailView, this.f24962Oooo0oO, iIntValue);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                        o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MomentDetailModel, Unit> showGiftDialogListener;
            p606o0oo0O.OooOo.OooO0O0("103011");
            MomentDetailView momentDetailView = MomentDetailView.this;
            if (!momentDetailView.f24952Ooooo00 && momentDetailView.f24938Oooo != MomentAdapterTag.MomentEditRecord && (showGiftDialogListener = momentDetailView.getShowGiftDialogListener()) != null) {
                showGiftDialogListener.invoke(MomentDetailView.this.f24941Oooo0oo);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends p654o0ooo.o00Oo0 {

        public static final class OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ MomentDetailView f24965Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentDetailView momentDetailView) {
                super(0);
                this.f24965Oooo0o = momentDetailView;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f24965Oooo0o.OooOOO0();
                return null;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ MomentDetailView f24966Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(MomentDetailView momentDetailView) {
                super(0);
                this.f24966Oooo0o = momentDetailView;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                MomentAdapterTag momentAdapterTag = this.f24966Oooo0o.f24938Oooo;
                if (momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment || momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment_Top || momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment_Recommend) {
                    o0O00000.OooO0OO("Moments_Following_like");
                }
                if (this.f24966Oooo0o.f24938Oooo == MomentAdapterTag.MomentListFeaturedFragment) {
                    o0O00000.OooO0OO("Moments_Featured_like");
                }
                MomentDetailView momentDetailView = this.f24966Oooo0o;
                momentDetailView.OooOOOo(momentDetailView.f24939Oooo0o.f50242OooO0o);
                return null;
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.ui.view.MomentDetailView$OooO0OO$OooO0OO, reason: collision with other inner class name */
        public static final class C0261OooO0OO extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ MomentDetailView f24967Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0261OooO0OO(MomentDetailView momentDetailView) {
                super(0);
                this.f24967Oooo0o = momentDetailView;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                MomentAdapterTag momentAdapterTag = this.f24967Oooo0o.f24938Oooo;
                if (momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment || momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment_Top || momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment_Recommend) {
                    o0O00000.OooO0OO("Moments_Following_comment");
                }
                if (this.f24967Oooo0o.f24938Oooo == MomentAdapterTag.MomentListFeaturedFragment) {
                    o0O00000.OooO0OO("Moments_Featured_comment");
                }
                Function1<PostDetailHeaderViewTag, Unit> listener = this.f24967Oooo0o.getListener();
                if (listener == null) {
                    return null;
                }
                listener.invoke(PostDetailHeaderViewTag.PostListToPostDetailForComments);
                return null;
            }
        }

        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            String circleName;
            MomentSendContentModel content;
            MomentSendContentModel content2;
            MomentSendContentModel content3;
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50244OooO0oO)) {
                OooO00o onLogin = new OooO00o(MomentDetailView.this);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return;
                }
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50242OooO0o) ? true : Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50271Oooo00o)) {
                OooO0O0 onLogin2 = new OooO0O0(MomentDetailView.this);
                Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
                if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin2.invoke();
                    return;
                }
                Activity activityOooO0O1 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O1 != null) {
                    LoginActivity.OooO00o oooO00o2 = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O1, d.R, activityOooO0O1, LoginActivity.class);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50252OooOOOo) ? true : Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50274Oooo0o0)) {
                MomentDetailModel momentDetailModel = MomentDetailView.this.f24941Oooo0oo;
                long circleId = 0;
                if (((momentDetailModel == null || (content3 = momentDetailModel.getContent()) == null) ? 0L : content3.getCircleId()) > 0) {
                    TopicInfoModel topicInfoModel = new TopicInfoModel();
                    MomentDetailModel momentDetailModel2 = MomentDetailView.this.f24941Oooo0oo;
                    if (momentDetailModel2 != null && (content2 = momentDetailModel2.getContent()) != null) {
                        circleId = content2.getCircleId();
                    }
                    topicInfoModel.setId(circleId);
                    MomentDetailModel momentDetailModel3 = MomentDetailView.this.f24941Oooo0oo;
                    if (momentDetailModel3 == null || (content = momentDetailModel3.getContent()) == null || (circleName = content.getCircleName()) == null) {
                        circleName = "";
                    }
                    topicInfoModel.setName(circleName);
                    TopicDetailActivity.f22567o0OoOo0.OooO00o(MomentDetailView.this.getActivity(), topicInfoModel);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50273Oooo0OO)) {
                C0261OooO0OO onLogin3 = new C0261OooO0OO(MomentDetailView.this);
                Intrinsics.checkNotNullParameter(onLogin3, "onLogin");
                if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin3.invoke();
                    return;
                }
                Activity activityOooO0O2 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O2 != null) {
                    LoginActivity.OooO00o oooO00o3 = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O2, d.R, activityOooO0O2, LoginActivity.class);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50237OooO) ? true : Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50261OooOoO) ? true : Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50250OooOOO0)) {
                Function1<PostDetailHeaderViewTag, Unit> listener = MomentDetailView.this.getListener();
                if (listener != null) {
                    listener.invoke(PostDetailHeaderViewTag.PostListToPostDetail);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50246OooOO0) ? true : Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50264OooOoo) ? true : Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50247OooOO0O) ? true : Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50269Oooo000) ? true : Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50248OooOO0o)) {
                MomentDetailView.this.OooOo00();
            } else if (Intrinsics.areEqual(view, MomentDetailView.this.f24939Oooo0o.f50249OooOOO)) {
                MomentDetailView.this.OooOo00();
            }
        }
    }

    public static final class OooO0o extends Lambda implements Function0<MomentVM> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f24968Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Context context) {
            super(0);
            this.f24968Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentVM invoke() {
            Context context = this.f24968Oooo0o;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return (MomentVM) new ViewModelProvider((FragmentActivity) context).get(MomentVM.class);
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f24969Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailView f24970Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i, MomentDetailView momentDetailView) {
            super(1);
            this.f24969Oooo0o = i;
            this.f24970Oooo0oO = momentDetailView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            int i = this.f24969Oooo0o;
            if (i == 1) {
                String string = this.f24970Oooo0oO.getActivity().getString(R.string.user_top_pinned);
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (!(string == null || StringsKt.isBlank(string))) {
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, string, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                    } else {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    }
                }
                MomentDetailModel momentDetailModel = this.f24970Oooo0oO.f24941Oooo0oo;
                if (momentDetailModel != null) {
                    momentDetailModel.setTop(true);
                }
                StringBuilder sb = new StringBuilder();
                MomentDetailModel momentDetailModel2 = this.f24970Oooo0oO.f24941Oooo0oo;
                sb.append(momentDetailModel2 != null ? Long.valueOf(momentDetailModel2.getUserId()) : null);
                sb.append("");
                String string2 = sb.toString();
                MomentDetailModel momentDetailModel3 = this.f24970Oooo0oO.f24941Oooo0oo;
                LiveEventBus.get("MOMENT_TOP_OF_USER_POST").post(new OnTopPostForUserPostModel(string2, momentDetailModel3 != null ? momentDetailModel3.getId() : 0L));
            } else if (i == 2) {
                MomentDetailModel momentDetailModel4 = this.f24970Oooo0oO.f24941Oooo0oo;
                if (momentDetailModel4 != null) {
                    momentDetailModel4.setTop(false);
                }
                String string3 = this.f24970Oooo0oO.getActivity().getString(R.string.user_top_unpinned);
                ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                if (!(string3 == null || StringsKt.isBlank(string3))) {
                    o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, string3, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O1.run();
                    } else {
                        o00O000 o00o002 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                MomentDetailModel momentDetailModel5 = this.f24970Oooo0oO.f24941Oooo0oo;
                sb2.append(momentDetailModel5 != null ? Long.valueOf(momentDetailModel5.getUserId()) : null);
                sb2.append("");
                LiveEventBus.get("MOMENT_UN_TOP_OF_USER_POST").post(new OnTopPostForUserPostModel(sb2.toString(), 0L));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<PraisePostResultModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PraiseView f24972Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f24973Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(PraiseView praiseView, int i) {
            super(1);
            this.f24972Oooo0oO = praiseView;
            this.f24973Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PraisePostResultModel praisePostResultModel) {
            PraisePostResultModel praisePostResultModel2 = praisePostResultModel;
            MomentDetailView momentDetailView = MomentDetailView.this;
            MomentLogSourcePage sourcePage = momentDetailView.f24952Ooooo00 ? MomentLogSourcePage.moments_content : o000O00O.OooO00o(momentDetailView.f24938Oooo);
            if (sourcePage != null) {
                StringBuilder sb = new StringBuilder();
                MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
                sb.append(momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null);
                sb.append("");
                if (!com.yalla.support.common.util.OooO0OO.OooO00o(sb.toString())) {
                    MomentLogActionTypePraise momentLogActionTypePraise = new MomentLogActionTypePraise(null, null, 3, null);
                    StringBuilder sb2 = new StringBuilder();
                    MomentDetailModel momentDetailModel2 = momentDetailView.f24941Oooo0oo;
                    sb2.append(momentDetailModel2 != null ? Long.valueOf(momentDetailModel2.getUserId()) : null);
                    sb2.append("");
                    momentLogActionTypePraise.setObject_userid(sb2.toString());
                    MomentDetailModel momentDetailModel3 = momentDetailView.f24941Oooo0oo;
                    momentLogActionTypePraise.setDiscoveryid(com.yalla.support.common.util.OooO.OooO(Long.valueOf(momentDetailModel3 != null ? momentDetailModel3.getId() : 0L), ""));
                    MomentLogActionType actionType = MomentLogActionType.praise;
                    String actionInfo = momentLogActionTypePraise.toJson();
                    MomentDetailModel momentDetailModel4 = momentDetailView.f24941Oooo0oo;
                    String sessionId = momentDetailModel4 != null ? momentDetailModel4.getSessionId() : null;
                    Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
                    Intrinsics.checkNotNullParameter(actionType, "actionType");
                    Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0OO(sourcePage, actionType, actionInfo, sessionId, null), 3, null);
                }
            }
            MomentDetailView.this.f24955OooooOO = false;
            PraiseView praiseView = this.f24972Oooo0oO;
            if (praiseView != null) {
                praiseView.OooO0Oo(this.f24973Oooo0oo == 0);
            }
            MomentDetailModel momentDetailModel5 = MomentDetailView.this.f24941Oooo0oo;
            if (momentDetailModel5 != null) {
                momentDetailModel5.setPraiseNum(praisePostResultModel2 != null ? praisePostResultModel2.getNum() : 0L);
            }
            MomentDetailModel momentDetailModel6 = MomentDetailView.this.f24941Oooo0oo;
            if (momentDetailModel6 != null) {
                momentDetailModel6.setPraise(momentDetailModel6.getIsPraise() ? false : true);
            }
            if (MomentDetailView.this.f24952Ooooo00) {
                if (this.f24973Oooo0oo == 0) {
                    LiveEventBus.get("POST_DETAIL_PAGER_PRAISE_ADD").post(MomentDetailView.this.f24941Oooo0oo);
                } else {
                    LiveEventBus.get("POST_DETAIL_PAGER_PRAISE_DELETE").post(MomentDetailView.this.f24941Oooo0oo);
                }
            }
            MomentDetailView.this.OooOOoo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MomentSendContentModel f24975Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentSendContentModel momentSendContentModel) {
            super(1);
            this.f24975Oooo0oO = momentSendContentModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailView.OooO0oO(MomentDetailView.this, this.f24975Oooo0oO.getCircleId(), o00O0.OooO0oO(this.f24975Oooo0oO.getCircleName()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<ApiError, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailView.this.f24955OooooOO = false;
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MomentSendContentModel f24978Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(MomentSendContentModel momentSendContentModel) {
            super(1);
            this.f24978Oooo0oO = momentSendContentModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailView.OooO0oO(MomentDetailView.this, this.f24978Oooo0oO.getCircleId(), o00O0.OooO0oO(this.f24978Oooo0oO.getCircleName()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<YallaChatVM> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f24979Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(Context context) {
            super(0);
            this.f24979Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaChatVM invoke() {
            Context context = this.f24979Oooo0o;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return (YallaChatVM) new ViewModelProvider((FragmentActivity) context).get(YallaChatVM.class);
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Integer, MoreModel, Object> {

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MoreTag.values().length];
                iArr[MoreTag.report.ordinal()] = 1;
                iArr[MoreTag.copy.ordinal()] = 2;
                iArr[MoreTag.deletePost.ordinal()] = 3;
                iArr[MoreTag.reply.ordinal()] = 4;
                iArr[MoreTag.postRemoveOutOfTopic.ordinal()] = 5;
                iArr[MoreTag.postTopOfTopic.ordinal()] = 6;
                iArr[MoreTag.postUnTopOfTopic.ordinal()] = 7;
                iArr[MoreTag.postTopOfUser.ordinal()] = 8;
                iArr[MoreTag.postUnTopOfUser.ordinal()] = 9;
                iArr[MoreTag.DisableTheUser.ordinal()] = 10;
                iArr[MoreTag.postEdit.ordinal()] = 11;
                iArr[MoreTag.postEditHistory.ordinal()] = 12;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public OooOo00() {
            super(2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, MoreModel moreModel) {
            num.intValue();
            MoreModel moreModel2 = moreModel;
            if (moreModel2 != null) {
                MomentDetailView momentDetailView = MomentDetailView.this;
                switch (OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()]) {
                    case 1:
                        u5 u5Var = u5.f47570OooO00o;
                        MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
                        o000O.OooO00o(u5Var, u5.OooO0o(4, momentDetailModel != null ? momentDetailModel.getId() : 0L, (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null));
                        break;
                    case 2:
                        if (!momentDetailView.f24959o000oOoO) {
                            FixTextView fixTextView = momentDetailView.f24939Oooo0o.f50268Oooo0;
                            Activity activity = momentDetailView.getActivity();
                            String string = momentDetailView.getResources().getString(R.string.Copied);
                            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.Copied)");
                            oo0o0O0.OooO0o(fixTextView, activity, string);
                        } else {
                            FixTextView fixTextView2 = momentDetailView.f24939Oooo0o.f50267OooOooo;
                            Activity activity2 = momentDetailView.getActivity();
                            String string2 = momentDetailView.getResources().getString(R.string.Copied);
                            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.Copied)");
                            oo0o0O0.OooO0o(fixTextView2, activity2, string2);
                        }
                        break;
                    case 3:
                        int i = MomentDetailView.f24937OoooooO;
                        oo0oOO0 oo0ooo0 = new oo0oOO0(momentDetailView.getActivity());
                        oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.art_you_sure));
                        oo0ooo0.OooOoOO(true);
                        oo0ooo0.OooOo0o(new o0(momentDetailView));
                        oo0ooo0.OooOOO0();
                        break;
                    case 4:
                        Function1<PostDetailHeaderViewTag, Unit> listener = momentDetailView.getListener();
                        if (listener != null) {
                            listener.invoke(PostDetailHeaderViewTag.PostDetailReply);
                        }
                        break;
                    case 5:
                        o0O00000.OooO0OO("Moments_topics_UnpinOnTop");
                        int i2 = MomentDetailView.f24937OoooooO;
                        oo0oOO0 oo0ooo1 = new oo0oOO0(momentDetailView.getActivity());
                        oo0ooo1.OooOo0O(o000O0O0.OooO0OO(R.string.RemovePost_ForTopic));
                        oo0ooo1.OooOoOO(true);
                        oo0ooo1.OooOo0o(new oo0OOoo(momentDetailView));
                        oo0ooo1.OooOOO0();
                        break;
                    case 6:
                        o0O00000.OooO0OO("Moments_topics_PinOnTop");
                        int i3 = MomentDetailView.f24937OoooooO;
                        Objects.requireNonNull(momentDetailView);
                        String strOooO0OO = o000O0O0.OooO0OO(R.string.OnTopPost_ForTopic);
                        if (momentDetailView.f24942OoooO > 0) {
                            strOooO0OO = o000O0O0.OooO0OO(R.string.OnTopPost_ForTopic_OnlyOne);
                        }
                        oo0oOO0 oo0ooo2 = new oo0oOO0(momentDetailView.getActivity());
                        oo0ooo2.OooOo0O(strOooO0OO);
                        oo0ooo2.OooOoOO(true);
                        oo0ooo2.OooOo0o(new o0O0OO0(momentDetailView));
                        oo0ooo2.OooOOO0();
                        break;
                    case 7:
                        int i4 = MomentDetailView.f24937OoooooO;
                        oo0oOO0 oo0ooo3 = new oo0oOO0(momentDetailView.getActivity());
                        oo0ooo3.OooOo0O(o000O0O0.OooO0OO(R.string.OnTopPost_ForTopic_Cancel));
                        oo0ooo3.OooOoOO(true);
                        oo0ooo3.OooOo0o(new o0O0OOOo(momentDetailView));
                        oo0ooo3.OooOOO0();
                        break;
                    case 8:
                        o0O00000.OooO0OO("Me_profile_Moments_pin_to_Top");
                        if (momentDetailView.f24942OoooO <= 0) {
                            momentDetailView.OooOOOO();
                        } else {
                            String strOooO0OO2 = o000O0O0.OooO0OO(R.string.user_top_dialog_replace_it);
                            oo0oOO0 oo0ooo4 = new oo0oOO0(momentDetailView.getActivity());
                            oo0ooo4.OooOo0O(strOooO0OO2);
                            oo0ooo4.OooOoOO(true);
                            oo0ooo4.OooOo0o(new o0O0OOO0(momentDetailView));
                            oo0ooo4.OooOOO0();
                        }
                        break;
                    case 9:
                        o0O00000.OooO0OO("Me_profile_Moments_UnpinfromTop");
                        int i5 = MomentDetailView.f24937OoooooO;
                        momentDetailView.OooOOOO();
                        break;
                    case 10:
                        int i6 = MomentDetailView.f24937OoooooO;
                        Objects.requireNonNull(momentDetailView);
                        String strOooO0OO3 = o000O0O0.OooO0OO(R.string.OnTopPost_ForTopic_DisableTheUser);
                        String[] strArr = new String[1];
                        MomentDetailModel momentDetailModel2 = momentDetailView.f24941Oooo0oo;
                        strArr[0] = momentDetailModel2 != null ? momentDetailModel2.getNickName() : null;
                        String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO3, strArr);
                        String[] strArr2 = new String[1];
                        MomentDetailModel momentDetailModel3 = momentDetailView.f24941Oooo0oo;
                        strArr2[0] = momentDetailModel3 != null ? momentDetailModel3.getNickName() : null;
                        String strOooO00o2 = com.yalla.support.common.util.OooOo.OooO00o(strOooO00o, strArr2);
                        oo0oOO0 oo0ooo5 = new oo0oOO0(momentDetailView.getActivity());
                        oo0ooo5.OooOo0O(strOooO00o2);
                        oo0ooo5.OooOoOO(true);
                        oo0ooo5.OooOo0o(new o0O0o000(momentDetailView));
                        oo0ooo5.OooOOO0();
                        break;
                    case 11:
                        p606o0oo0O.OooOo.OooO0O0("103008");
                        MomentDetailView.OooO0OO(momentDetailView);
                        break;
                    case 12:
                        p606o0oo0O.OooOo.OooO0O0("103009");
                        MomentDetailModel momentDetailModel4 = momentDetailView.f24941Oooo0oo;
                        if (momentDetailModel4 != null) {
                            long id = momentDetailModel4.getId();
                            MomentEditRecordActivity.OooO00o oooO00o = MomentEditRecordActivity.f22315OoooooO;
                            Context context = momentDetailView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "context");
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intent intent = new Intent(context, (Class<?>) MomentEditRecordActivity.class);
                            intent.putExtra("Data", id);
                            context.startActivity(intent);
                        }
                        break;
                }
            }
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO0OO(MomentDetailView momentDetailView) {
        Objects.requireNonNull(momentDetailView);
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Pair<Boolean, Integer> value = oooOOO.OooOOO0().getValue();
        if (!((value == null || value.getFirst().booleanValue()) ? false : true)) {
            Pair<Boolean, Integer> value2 = oooOOO.OooOOO0().getValue();
            if ((value2 != null ? value2.getSecond().intValue() : PremiumLevel.Premium0.getValue()) > PremiumLevel.Premium0.getValue()) {
                MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
                if (momentDetailModel != null) {
                    LiveData<ApiResult<MomentEditBefore>> liveDataMomentEditBefore = momentDetailView.getMomentVM().momentEditBefore(momentDetailModel.getId());
                    ComponentCallbacks2 activity = momentDetailView.getActivity();
                    Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    liveDataMomentEditBefore.observe((LifecycleOwner) activity, new o0o0000.OooOo(new o0O0000O(momentDetailView, momentDetailModel), null, null, false, 14));
                    return;
                }
                return;
            }
        }
        Context context = momentDetailView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        oo0oOO0 oo0ooo0 = new oo0oOO0(context);
        oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.Moment_Detail_Edit_Only_Premium));
        oo0ooo0.OooOOOo(R.string.Get_Yalla_Premium);
        oo0ooo0.OooOo0o(p601o0oo00Oo.o0O00000.f48166Oooo0o);
        oo0ooo0.OooOoOO(true);
        oo0ooo0.OooOOO0();
    }

    public static final void OooO0o(MomentDetailView momentDetailView) {
        MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
        int i = momentDetailModel != null && (momentDetailView.f24942OoooO > momentDetailModel.getId() ? 1 : (momentDetailView.f24942OoooO == momentDetailModel.getId() ? 0 : -1)) == 0 ? 2 : 1;
        MomentVM momentVM = momentDetailView.getMomentVM();
        long j = momentDetailView.f24944OoooO00;
        MomentDetailModel momentDetailModel2 = momentDetailView.f24941Oooo0oo;
        LiveData<ApiResult<Object>> liveDataCircleDiscoveryTopIns = momentVM.circleDiscoveryTopIns(j, momentDetailModel2 != null ? momentDetailModel2.getId() : 0L, i);
        ComponentCallbacks2 activity = momentDetailView.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        liveDataCircleDiscoveryTopIns.observe((LifecycleOwner) activity, new o0o0000.OooOo(new o0oO0O0o(i, momentDetailView), null, null, false));
    }

    public static final void OooO0o0(MomentDetailView momentDetailView) {
        MomentVM momentVM = momentDetailView.getMomentVM();
        long j = momentDetailView.f24944OoooO00;
        MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
        LiveData<ApiResult<Object>> liveDataCircleDiscoveryDelete = momentVM.circleDiscoveryDelete(j, momentDetailModel != null ? momentDetailModel.getId() : 0L);
        ComponentCallbacks2 activity = momentDetailView.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        liveDataCircleDiscoveryDelete.observe((LifecycleOwner) activity, new o0o0000.OooOo(new o0O0O0O(momentDetailView), null, null, false));
    }

    public static final void OooO0oO(MomentDetailView momentDetailView, long j, String str) {
        LiveData<ApiResult<TopicGroupInfoModel>> groupInfo = momentDetailView.getYallaChatVM().getGroupInfo(j);
        Context context = momentDetailView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        groupInfo.observe((FragmentActivity) context, new o0o0000.OooOo(new o0O0o00O(j, str), null, null, false, 14));
    }

    public static final void OooO0oo(MomentDetailView momentDetailView) {
        MomentVM momentVM = momentDetailView.getMomentVM();
        long j = momentDetailView.f24944OoooO00;
        MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
        LiveData<ApiResult<Object>> liveDataCircleBlackIns = momentVM.circleBlackIns(j, momentDetailModel != null ? momentDetailModel.getUserId() : 0L, 1);
        ComponentCallbacks2 activity = momentDetailView.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        liveDataCircleBlackIns.observe((LifecycleOwner) activity, new o0o0000.OooOo(new o0O0o0(momentDetailView), new o0oOo0O0(momentDetailView), null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MomentVM getMomentVM() {
        return (MomentVM) this.momentVM.getValue();
    }

    private final YallaChatVM getYallaChatVM() {
        return (YallaChatVM) this.yallaChatVM.getValue();
    }

    private final void setBottomInfo(MomentDetailModel postDetail) {
        MomentCommentModel comment;
        MomentCommentModel comment2;
        MomentSendContentModel content;
        String content2;
        MomentCommentModel comment3;
        MomentCommentModel comment4;
        MomentCommentModel comment5;
        boolean z = false;
        if (!TextUtils.isEmpty(postDetail.getAddress())) {
            this.f24939Oooo0o.f50261OooOoO.setVisibility(0);
            this.f24939Oooo0o.f50261OooOoO.setText(postDetail.getAddress());
        }
        if (!OooO()) {
            TextView textView = this.f24939Oooo0o.f50273Oooo0OO;
            Drawable drawableOooO0O0 = com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_post_main_comment);
            MomentDetailModel momentDetailModel = this.f24941Oooo0oo;
            o00Oo00.OooO0O0(textView, drawableOooO0O0, o0O0O00.OooO0oO(momentDetailModel != null ? momentDetailModel.getCommentNum() : 0L, true), ViewLocation.start, oo000o.OooO0o0());
        }
        this.f24939Oooo0o.f50242OooO0o.OooO0OO(postDetail.getIsPraise());
        OooOOoo();
        OooO();
        this.f24939Oooo0o.f50255OooOOoo.OooO00o(postDetail, this.f24952Ooooo00);
        MomentDetailModel momentDetailModel2 = this.f24941Oooo0oo;
        if ((momentDetailModel2 != null ? momentDetailModel2.getComment() : null) != null) {
            MomentDetailModel momentDetailModel3 = this.f24941Oooo0oo;
            if (oOO00O.OooO0o((momentDetailModel3 == null || (comment5 = momentDetailModel3.getComment()) == null) ? null : Long.valueOf(comment5.getCommentId())) > 0) {
                MomentDetailModel momentDetailModel4 = this.f24941Oooo0oo;
                if (oOO00O.OooO0o((momentDetailModel4 == null || (comment4 = momentDetailModel4.getComment()) == null) ? null : Long.valueOf(comment4.getComUserid())) > 0 && this.f24938Oooo == MomentAdapterTag.MomentListFeaturedFragment) {
                    this.f24939Oooo0o.f50239OooO0O0.setVisibility(0);
                    StringBuilder sb = new StringBuilder();
                    MomentDetailModel momentDetailModel5 = this.f24941Oooo0oo;
                    this.f24939Oooo0o.f50265OooOoo0.setText(o00oO0o.OooO0O0(sb, (momentDetailModel5 == null || (comment3 = momentDetailModel5.getComment()) == null) ? null : comment3.getComNickname(), ':'));
                    this.f24939Oooo0o.f50265OooOoo0.setOnClickListener(new o0O0O0Oo(this));
                    this.f24939Oooo0o.f50263OooOoOO.setOnClickListener(new o0O0O0o0(this));
                    MomentDetailModel momentDetailModel6 = this.f24941Oooo0oo;
                    if (momentDetailModel6 != null && (comment2 = momentDetailModel6.getComment()) != null && (content = comment2.getContent()) != null && (content2 = content.getContent()) != null) {
                        if (content2.length() > 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        FragmentActivity fragmentActivity = this.f24940Oooo0oO;
                        MomentDetailModel momentDetailModel7 = this.f24941Oooo0oo;
                        o0o0Oo.OooO0O0(fragmentActivity, (momentDetailModel7 == null || (comment = momentDetailModel7.getComment()) == null) ? null : comment.getContent(), this.f24939Oooo0o.f50263OooOoOO, null);
                        this.f24939Oooo0o.f50263OooOoOO.setMaxLines(2);
                        return;
                    }
                    return;
                }
            }
        }
        this.f24939Oooo0o.f50239OooO0O0.setVisibility(8);
    }

    private final void setContentLayout(MomentDetailModel item) {
        MomentPoll momentPoll;
        if (item != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("setContentLayout mPosition = ");
            sbOooO0o0.append(this.f24956OooooOo);
            o00O00.OooO0O0(sbOooO0o0.toString());
            if (item.getUserId() == 0) {
                return;
            }
            this.f24939Oooo0o.f50237OooO.setVisibility(0);
            MomentDetailUserView momentDetailUserView = this.f24939Oooo0o.f50259OooOo0O;
            FragmentActivity fragmentActivity = this.f24940Oooo0oO;
            Intrinsics.checkNotNull(fragmentActivity);
            momentDetailUserView.OooO0O0(fragmentActivity, item);
            setTopicInfo(item);
            setTextInfo(item);
            setImageInfo(item);
            setBottomInfo(item);
            this.f24939Oooo0o.f50255OooOOoo.OooO00o(item, this.f24952Ooooo00);
            if (item.getDeleteType() == MomentTypeDelete.FORWARD.getValue()) {
                this.f24939Oooo0o.f50246OooOO0.setVisibility(0);
                this.f24939Oooo0o.f50264OooOoo.setVisibility(0);
                this.f24939Oooo0o.f50264OooOoo.setText(R.string.This_moment_has_been_deleted);
                return;
            }
            if (item.getDeleteType() == MomentTypeDelete.EVENT.getValue()) {
                this.f24939Oooo0o.f50246OooOO0.setVisibility(0);
                this.f24939Oooo0o.f50264OooOoo.setVisibility(0);
                this.f24939Oooo0o.f50264OooOoo.setText(R.string.event_has_been_deleted);
                return;
            }
            if (!MomentTypeKt.isSupportMomentType(item.getType())) {
                this.f24939Oooo0o.f50270Oooo00O.setVisibility(0);
                return;
            }
            if (item.getType() == MomentType.Forward.getValue()) {
                if (!item.getIsForward() || item.getForward() == null) {
                    return;
                }
                setForwardData(item.getForward());
                return;
            }
            if (item.getType() == MomentType.Share.getValue()) {
                setShareData(item);
                return;
            }
            if (item.getType() == MomentType.Event.getValue()) {
                setMomentEvent(item.getForwardContent());
                return;
            }
            if (item.getType() != MomentType.Poll.getValue() || (momentPoll = item.getMomentPoll()) == null) {
                return;
            }
            MomentDetailPollView momentDetailPollView = this.f24939Oooo0o.f50257OooOo0;
            FragmentActivity fragmentActivity2 = this.f24940Oooo0oO;
            MomentDetailModel momentDetailModel = this.f24941Oooo0oo;
            momentDetailPollView.OooO00o(fragmentActivity2, momentDetailModel != null ? momentDetailModel.getId() : 0L, momentPoll, false);
        }
    }

    private final void setForwardData(MomentDetailModel postDetailModelForward0) {
        if (postDetailModelForward0 == null) {
            return;
        }
        this.f24939Oooo0o.f50246OooOO0.setVisibility(0);
        if (postDetailModelForward0.getForwardContent() != null) {
            MomentForwardContent forwardContent = postDetailModelForward0.getForwardContent();
            if (!MomentTypeShareKt.isSupportMomentTypeShare(forwardContent != null ? forwardContent.getShareType() : 0)) {
                this.f24939Oooo0o.f50266OooOooO.setVisibility(0);
                return;
            }
        }
        setForwardText(postDetailModelForward0);
        if (postDetailModelForward0.getType() == MomentType.Poll.getValue()) {
            if (postDetailModelForward0.getMomentPoll() != null) {
                MomentDetailPollView momentDetailPollView = this.f24939Oooo0o.f50258OooOo00;
                FragmentActivity fragmentActivity = this.f24940Oooo0oO;
                MomentDetailModel momentDetailModel = this.f24941Oooo0oo;
                momentDetailPollView.OooO00o(fragmentActivity, momentDetailModel != null ? momentDetailModel.getId() : 0L, postDetailModelForward0.getMomentPoll(), true);
                this.f24939Oooo0o.f50258OooOo00.setVisibility(0);
                return;
            }
            return;
        }
        if (postDetailModelForward0.getType() != MomentType.Event.getValue()) {
            setForwardShareView(postDetailModelForward0);
            setForwardImage(postDetailModelForward0);
        } else {
            MomentForwardContent forwardContent2 = postDetailModelForward0.getForwardContent();
            if (forwardContent2 != null) {
                this.f24939Oooo0o.f50254OooOOo0.OooO0O0(forwardContent2);
            }
        }
    }

    private final void setForwardImage(MomentDetailModel postDetailModelForward0) {
        ArrayList<ImageView9GridModel> imageInfoList = postDetailModelForward0.getImageInfoList();
        ArrayList arrayList = new ArrayList();
        Iterator<ImageView9GridModel> it = imageInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUrl());
        }
        if (this.f24949OoooOo0 == null) {
            this.f24949OoooOo0 = new o00Oo0();
        }
        if (!imageInfoList.isEmpty()) {
            this.f24939Oooo0o.f50241OooO0Oo.OooO0o(imageInfoList, this.f24956OooooOo);
            this.f24946OoooOO0 = this.f24939Oooo0o.f50241OooO0Oo;
        }
    }

    private final void setForwardShareView(MomentDetailModel postDetailModelForward0) {
        MomentDetailShareView momentDetailShareView = this.f24939Oooo0o.f50248OooOO0o;
        FragmentActivity fragmentActivity = this.f24940Oooo0oO;
        Intrinsics.checkNotNull(fragmentActivity);
        momentDetailShareView.OooO00o(fragmentActivity, postDetailModelForward0);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0133  */
    /* JADX WARN: Code duplicated, block: B:37:0x013a  */
    private final void setForwardText(MomentDetailModel postDetailModelForward0) {
        MomentSendContentModel content;
        o00O00.OooO0O0("setForwardText postDetailModelForward0 = " + postDetailModelForward0);
        MomentSendContentModel content2 = postDetailModelForward0.getContent();
        if (content2 != null) {
            if (postDetailModelForward0.getType() == MomentType.Text.getValue() || postDetailModelForward0.getType() == MomentType.Image.getValue() || postDetailModelForward0.getType() == MomentType.Share.getValue() || postDetailModelForward0.getType() == MomentType.YallaTeam.getValue() || postDetailModelForward0.getType() == MomentType.Event.getValue() || postDetailModelForward0.getType() == MomentType.Poll.getValue() || postDetailModelForward0.getType() == MomentType.YallaChatGroup.getValue()) {
                this.f24939Oooo0o.f50267OooOooo.setVisibility(0);
                this.f24939Oooo0o.f50247OooOO0O.setVisibility(0);
            }
            int iOooO0O0 = oo000o.OooO0O0();
            int i = 2;
            int i2 = 6;
            if (iOooO0O0 == 1) {
                content = postDetailModelForward0.getContent();
                if (content != null) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(": ");
                    sbOooO0o0.append(content.getContent());
                    content.setContent(sbOooO0o0.toString());
                }
                o0oO0Ooo o0oo0oooOooO0O0 = o0o0Oo.OooO0O0(this.f24940Oooo0oO, content, this.f24939Oooo0o.f50267OooOooo, new p142o00OOooO.OooOOO(this, 6));
                o0O00o0 o0o00o1 = new o0O00o0(this, this.f24940Oooo0oO);
                FragmentActivity fragmentActivity = this.f24940Oooo0oO;
                StringBuilder sbOooO00o = o00O0O0O.OooO00o('@');
                sbOooO00o.append(postDetailModelForward0.getNickName());
                o0o00o1.f32694Oooo0oO = new SpannableStringModel<>(fragmentActivity, sbOooO00o.toString(), R.color.color_00C5B8);
                o0oo0oooOooO0O0.OooO0O0(o0o00o1);
            } else if (iOooO0O0 == 2) {
                MomentSendContentModel content3 = postDetailModelForward0.getContent();
                if (content3 != null) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(": ");
                    sbOooO0o1.append(content3.getContent());
                    content3.setContent(sbOooO0o1.toString());
                }
                o0oO0Ooo o0oo0oooOooO0O1 = o0o0Oo.OooO0O0(this.f24940Oooo0oO, content3, this.f24939Oooo0o.f50267OooOooo, new p142o00OOooO.OooOOO0(this, 5));
                o0oOOo o0oooo2 = new o0oOOo(this, this.f24940Oooo0oO);
                FragmentActivity fragmentActivity2 = this.f24940Oooo0oO;
                StringBuilder sbOooO00o2 = o00O0O0O.OooO00o('@');
                sbOooO00o2.append(postDetailModelForward0.getNickName());
                o0oooo2.f32694Oooo0oO = new SpannableStringModel<>(fragmentActivity2, o0O0O00.OooO0o0(sbOooO00o2.toString()), R.color.color_00C5B8);
                o0oo0oooOooO0O1.OooO0O0(o0oooo2);
            } else if (iOooO0O0 != 8) {
                MomentSendContentModel content4 = postDetailModelForward0.getContent();
                if (content4 != null) {
                    StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0(": ");
                    sbOooO0o2.append(content4.getContent());
                    content4.setContent(sbOooO0o2.toString());
                }
                o0oO0Ooo o0oo0oooOooO0O2 = o0o0Oo.OooO0O0(this.f24940Oooo0oO, content4, this.f24939Oooo0o.f50267OooOooo, new oo0O(this, i2));
                oo00oO oo00oo = new oo00oO(this, this.f24940Oooo0oO);
                FragmentActivity fragmentActivity3 = this.f24940Oooo0oO;
                StringBuilder sbOooO00o3 = o00O0O0O.OooO00o('@');
                sbOooO00o3.append(postDetailModelForward0.getNickName());
                oo00oo.f32694Oooo0oO = new SpannableStringModel<>(fragmentActivity3, o0O0O00.OooO0o0(sbOooO00o3.toString()), R.color.color_00C5B8);
                o0oo0oooOooO0O2.OooO0O0(oo00oo);
            } else {
                content = postDetailModelForward0.getContent();
                if (content != null) {
                    StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0(": ");
                    sbOooO0o3.append(content.getContent());
                    content.setContent(sbOooO0o3.toString());
                }
                o0oO0Ooo o0oo0oooOooO0O3 = o0o0Oo.OooO0O0(this.f24940Oooo0oO, content, this.f24939Oooo0o.f50267OooOooo, new p142o00OOooO.OooOOO(this, 6));
                o0O00o0 o0o00o2 = new o0O00o0(this, this.f24940Oooo0oO);
                FragmentActivity fragmentActivity4 = this.f24940Oooo0oO;
                StringBuilder sbOooO00o4 = o00O0O0O.OooO00o('@');
                sbOooO00o4.append(postDetailModelForward0.getNickName());
                o0o00o2.f32694Oooo0oO = new SpannableStringModel<>(fragmentActivity4, sbOooO00o4.toString(), R.color.color_00C5B8);
                o0oo0oooOooO0O3.OooO0O0(o0o00o2);
            }
            if (this.f24952Ooooo00 || this.f24938Oooo == MomentAdapterTag.MomentEditRecord) {
                this.f24939Oooo0o.f50267OooOooo.setMaxLines(Integer.MAX_VALUE);
            } else {
                this.f24939Oooo0o.f50267OooOooo.post(new o00O0O(this, i));
                this.f24939Oooo0o.f50267OooOooo.setMaxLines(6);
            }
            if (postDetailModelForward0.getType() == MomentType.YallaChatGroup.getValue()) {
                FixTextView fixTextView = this.f24939Oooo0o.f50267OooOooo;
                String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.topic_group_create_success_message_xxx), o00O0.OooO0oO(content2.getCircleName()));
                String strOooO0OO = o000O0O0.OooO0OO(R.string.topic_group_create_success_message_Highlight);
                int iOooO00o = com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9);
                fixTextView.setText(strOooO00o);
                Intrinsics.checkNotNullExpressionValue(fixTextView, "");
                oo0o0O0.OooO0O0(fixTextView, strOooO0OO, new OooOOO(content2));
                oo0o0O0.OooO0o0(fixTextView, new String[]{strOooO0OO}, iOooO00o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setForwardText$lambda-14$lambda-12, reason: not valid java name */
    public static final void m487setForwardText$lambda14$lambda12(MomentDetailView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.f24939Oooo0o.f50267OooOooo.getLayout() == null || this$0.f24939Oooo0o.f50267OooOooo.getLayout().getLineCount() <= 6) {
                return;
            }
            this$0.f24939Oooo0o.f50269Oooo000.setVisibility(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void setImageInfo(MomentDetailModel postDetail) {
        ArrayList<ImageView9GridModel> imageInfoList = postDetail.getImageInfoList();
        ArrayList arrayList = new ArrayList();
        Iterator<ImageView9GridModel> it = imageInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUrl());
        }
        if (this.f24948OoooOOo == null) {
            this.f24948OoooOOo = new o00Oo0();
        }
        if (!imageInfoList.isEmpty()) {
            this.f24939Oooo0o.f50243OooO0o0.OooO0o(imageInfoList, this.f24956OooooOo);
            this.f24946OoooOO0 = this.f24939Oooo0o.f50243OooO0o0;
        }
    }

    private final void setMomentEvent(MomentForwardContent forwardContent) {
        if (forwardContent == null) {
            return;
        }
        if (!MomentTypeShareKt.isSupportMomentTypeShare(forwardContent.getShareType())) {
            this.f24939Oooo0o.f50246OooOO0.setVisibility(0);
            this.f24939Oooo0o.f50266OooOooO.setVisibility(0);
        } else if (forwardContent.getShareType() == 20) {
            this.f24939Oooo0o.f50253OooOOo.OooO0O0(forwardContent);
        }
    }

    private final void setPostAdView(MomentAdDataModel adData) {
        MomentDetailAdView momentDetailAdView = this.f24939Oooo0o.f50256OooOo;
        int i = this.f24956OooooOo;
        p254o00ooO0O.oOO00O.OooO00o(momentDetailAdView);
        momentDetailAdView.f24862Oooo0o.f49039OooO0oO.setImageDrawable(null);
        momentDetailAdView.f24862Oooo0o.f49040OooO0oo.setText("");
        momentDetailAdView.f24862Oooo0o.f49035OooO0OO.setText("");
        TextView textView = momentDetailAdView.f24862Oooo0o.f49035OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.contentTv");
        p254o00ooO0O.oOO00O.OooO(textView);
        momentDetailAdView.f24862Oooo0o.f49034OooO0O0.setImageDrawable(null);
        NetImageView netImageView = momentDetailAdView.f24862Oooo0o.f49034OooO0O0;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.adIv");
        p254o00ooO0O.oOO00O.OooO00o(netImageView);
        ImageView imageView = momentDetailAdView.f24862Oooo0o.f49032OooO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.titleBgIv");
        p254o00ooO0O.oOO00O.OooO00o(imageView);
        momentDetailAdView.f24862Oooo0o.f49038OooO0o0.setText("");
        TextView textView2 = momentDetailAdView.f24862Oooo0o.f49038OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.descriptionTv");
        p254o00ooO0O.oOO00O.OooO00o(textView2);
        momentDetailAdView.f24862Oooo0o.f49037OooO0o.setText("");
        TextView textView3 = momentDetailAdView.f24862Oooo0o.f49037OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.downloadTv");
        p254o00ooO0O.oOO00O.OooO00o(textView3);
        momentDetailAdView.f24863Oooo0oO = adData;
        momentDetailAdView.f24864Oooo0oo = i;
        if (adData != null) {
            p254o00ooO0O.oOO00O.OooO(momentDetailAdView);
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(momentDetailAdView.getContext());
            oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(adData.getAdHeadUrl());
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(momentDetailAdView.f24862Oooo0o.f49039OooO0oO);
            momentDetailAdView.f24862Oooo0o.f49040OooO0oo.setText(adData.getAdTitle());
            momentDetailAdView.f24862Oooo0o.f49035OooO0OO.setText(adData.getAdDescription());
            if (!StringsKt.isBlank(adData.getAdImage())) {
                NetImageView netImageView2 = momentDetailAdView.f24862Oooo0o.f49034OooO0O0;
                Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.adIv");
                p254o00ooO0O.oOO00O.OooO(netImageView2);
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(momentDetailAdView.getContext());
                oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
                oooO00o2.f48454OooOoo0 = 2;
                oooO00o2.f48444OooOOoo = 1;
                oooO00o2.OooO0oO(4);
                oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(adData.getAdImage());
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO0o(momentDetailAdView.f24862Oooo0o.f49034OooO0O0);
            }
            if ((!StringsKt.isBlank(adData.getAdDescription2())) || (!StringsKt.isBlank(adData.getAdButtonName()))) {
                ImageView imageView2 = momentDetailAdView.f24862Oooo0o.f49032OooO;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.titleBgIv");
                p254o00ooO0O.oOO00O.OooO(imageView2);
                TextView textView4 = momentDetailAdView.f24862Oooo0o.f49038OooO0o0;
                Intrinsics.checkNotNullExpressionValue(textView4, "binding.descriptionTv");
                p254o00ooO0O.oOO00O.OooO(textView4);
                TextView textView5 = momentDetailAdView.f24862Oooo0o.f49037OooO0o;
                Intrinsics.checkNotNullExpressionValue(textView5, "binding.downloadTv");
                p254o00ooO0O.oOO00O.OooO(textView5);
                momentDetailAdView.f24862Oooo0o.f49038OooO0o0.setText(adData.getAdDescription2());
                momentDetailAdView.f24862Oooo0o.f49037OooO0o.setText(adData.getAdButtonName());
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void setSendTaskLayout(MomentSendModel sendPostModel) {
        Drawable drawableOooO0O0;
        String content;
        final MomentSendTaskView momentSendTaskView = this.f24939Oooo0o.f50260OooOo0o;
        int i = this.f24956OooooOo;
        momentSendTaskView.OooO0O0();
        momentSendTaskView.f24986Oooo0oO = sendPostModel;
        momentSendTaskView.f24987Oooo0oo = i;
        o00O00.OooO0O0("SendPostTaskHeaderView setData\n position = " + i + "\n data = " + sendPostModel);
        if (sendPostModel != null) {
            momentSendTaskView.f24985Oooo0o.f48943OooO0O0.setVisibility(0);
            p487o0o000oO.o0OOO0o.OooO0Oo();
            momentSendTaskView.f24985Oooo0o.f48949OooO0oo.setData(sendPostModel);
            MomentSendTitleTask momentSendTitleTask = momentSendTaskView.f24985Oooo0o.f48941OooO;
            ConstraintLayout constraintLayout = momentSendTitleTask.f24988Oooo0o.f51088OooO0o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutRoot");
            com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout);
            momentSendTitleTask.f24988Oooo0o.f51086OooO0OO.setImageDrawable(null);
            ImageView imageView = momentSendTitleTask.f24988Oooo0o.f51089OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivRole");
            com.yalla.support.common.util.o00O0O.OooO00o(imageView);
            UserPremiumView userPremiumView = momentSendTitleTask.f24988Oooo0o.f51094OooOO0o;
            Intrinsics.checkNotNullExpressionValue(userPremiumView, "binding.userVipView");
            com.yalla.support.common.util.o00O0O.OooO00o(userPremiumView);
            UserVipView userVipView = momentSendTitleTask.f24988Oooo0o.f51092OooOO0;
            Intrinsics.checkNotNullExpressionValue(userVipView, "binding.userKaVipView");
            com.yalla.support.common.util.o00O0O.OooO00o(userVipView);
            TextView textView = momentSendTitleTask.f24988Oooo0o.f51083OooO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTry");
            com.yalla.support.common.util.o00O0O.OooO00o(textView);
            ImageView imageView2 = momentSendTitleTask.f24988Oooo0o.f51087OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivPower");
            com.yalla.support.common.util.o00O0O.OooO00o(imageView2);
            momentSendTitleTask.f24988Oooo0o.f51090OooO0oO.setText("");
            momentSendTitleTask.f24989Oooo0oO = sendPostModel;
            ConstraintLayout constraintLayout2 = momentSendTitleTask.f24988Oooo0o.f51088OooO0o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.layoutRoot");
            com.yalla.support.common.util.o00O0O.OooO(constraintLayout2);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            sb.append(oooOOO.OooOo().getValue());
            momentSendTitleTask.setTransitionName(sb.toString());
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(momentSendTitleTask.getContext());
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.OooO0OO(1, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_e2e2e2));
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(oooOOO.OooO0oo().getValue());
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(momentSendTitleTask.f24988Oooo0o.f51086OooO0OO);
            ImageView imageView3 = momentSendTitleTask.f24988Oooo0o.f51089OooO0o0;
            Integer value = oooOOO.OooOOOO().getValue();
            imageView3.setVisibility((value != null && value.intValue() == 2) ? 0 : 8);
            Integer value2 = oooOOO.OooOOOo().getValue();
            if (value2 != null && value2.intValue() == 0) {
                drawableOooO0O0 = com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_female);
            } else if (value2 != null && value2.intValue() == 1) {
                drawableOooO0O0 = com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_male);
            } else {
                if (value2 != null) {
                    value2.intValue();
                }
                drawableOooO0O0 = null;
            }
            String value3 = oooOOO.OooOoO().getValue();
            p487o0o000oO.o0OOO0o.OooO0Oo();
            o00Oo00.OooO0O0(momentSendTitleTask.f24988Oooo0o.f51090OooO0oO, drawableOooO0O0, value3, ViewLocation.end, oo000o.OooO0o0());
            Pair<Boolean, Integer> value4 = oooOOO.OooOOO0().getValue();
            if (value4 != null) {
                momentSendTitleTask.f24988Oooo0o.f51094OooOO0o.OooO0OO(value4.getFirst().booleanValue() ? 1 : 0, value4.getSecond().intValue());
            }
            Pair<Integer, Integer> value5 = oooOOO.OooO().getValue();
            if (value5 != null) {
                momentSendTitleTask.f24988Oooo0o.f51092OooOO0.OooO0OO(value5.getSecond().intValue(), value5.getFirst().intValue() == VipState.Vip.getValue());
            }
            String value6 = oooOOO.OooOO0O().getValue();
            if (value6 != null) {
                momentSendTitleTask.f24988Oooo0o.f51093OooOO0O.OooO0O0(value6, momentSendTitleTask.getActivity());
            }
            momentSendTitleTask.OooO0OO();
            momentSendTaskView.f24985Oooo0o.f48950OooOO0.setData(sendPostModel.getPoll());
            final MomentSendModel momentSendModel = momentSendTaskView.f24986Oooo0oO;
            if (momentSendModel != null) {
                MomentSendContentModel content2 = momentSendModel.getContent();
                if ((content2 == null || (content = content2.getContent()) == null || !o00O0.OooO0o0(content)) ? false : true) {
                    momentSendTaskView.f24985Oooo0o.f48944OooO0OO.setVisibility(0);
                    momentSendTaskView.f24985Oooo0o.f48947OooO0o0.setVisibility(0);
                    o0o0Oo.OooO0O0(momentSendTaskView.getContext(), momentSendModel.getContent(), momentSendTaskView.f24985Oooo0o.f48947OooO0o0, new o0O00OOO.OooO00o() { // from class: o0oo00Oo.o0O
                        @Override // o00OooOO.o0O00OOO.OooO00o
                        public final void OooO00o() {
                            MomentSendTaskView this$0 = momentSendTaskView;
                            MomentSendModel it = momentSendModel;
                            int i2 = MomentSendTaskView.f24984Oooo;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "$it");
                            o00O00.OooO("onTextClicked setViewData 动态详情 position = " + this$0.f24987Oooo0oo + ", it = " + it);
                        }
                    });
                    momentSendTaskView.f24985Oooo0o.f48947OooO0o0.post(new Runnable() { // from class: o0oo00Oo.o0O0oo00
                        @Override // java.lang.Runnable
                        public final void run() {
                            MomentSendTaskView.m489setContent$lambda3$lambda2(momentSendTaskView);
                        }
                    });
                    momentSendTaskView.f24985Oooo0o.f48947OooO0o0.setMaxLines(6);
                }
            }
            ArrayList arrayList = new ArrayList();
            MomentSendModel momentSendModel2 = momentSendTaskView.f24986Oooo0oO;
            List<String> listSendPostImage = momentSendModel2 != null ? momentSendModel2.getListSendPostImage() : null;
            Intrinsics.checkNotNull(listSendPostImage);
            for (String str : listSendPostImage) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new ImageView9GridModel(str).initLocalSize());
                }
            }
            if (!arrayList.isEmpty()) {
                com.app.base.view.imageMore.ImageMoreView imageMoreView = momentSendTaskView.f24985Oooo0o.f48946OooO0o;
                Intrinsics.checkNotNullExpressionValue(imageMoreView, "binding.mImageMoreViewTask");
                p254o00ooO0O.oOO00O.OooO(imageMoreView);
                momentSendTaskView.f24985Oooo0o.f48946OooO0o.OooO0o(arrayList, momentSendTaskView.f24987Oooo0oo);
            }
            MomentSendModel momentSendModel3 = momentSendTaskView.f24986Oooo0oO;
            if (TextUtils.isEmpty(momentSendModel3 != null ? momentSendModel3.getAddress() : null)) {
                return;
            }
            momentSendTaskView.f24985Oooo0o.f48948OooO0oO.setVisibility(0);
            TextView textView2 = momentSendTaskView.f24985Oooo0o.f48948OooO0oO;
            MomentSendModel momentSendModel4 = momentSendTaskView.f24986Oooo0oO;
            textView2.setText(momentSendModel4 != null ? momentSendModel4.getAddress() : null);
        }
    }

    private final void setShareData(MomentDetailModel itemData) {
        MomentForwardContent forwardContent = itemData.getForwardContent();
        if (forwardContent == null) {
            return;
        }
        if (!MomentTypeShareKt.isSupportMomentTypeShare(forwardContent.getShareType())) {
            this.f24939Oooo0o.f50246OooOO0.setVisibility(0);
            this.f24939Oooo0o.f50266OooOooO.setVisibility(0);
        } else {
            MomentDetailShareView momentDetailShareView = this.f24939Oooo0o.f50249OooOOO;
            FragmentActivity fragmentActivity = this.f24940Oooo0oO;
            Intrinsics.checkNotNull(fragmentActivity);
            momentDetailShareView.OooO00o(fragmentActivity, itemData);
        }
    }

    private final void setTextInfo(final MomentDetailModel postDetail) {
        MomentSendContentModel content = postDetail.getContent();
        if (content != null) {
            if (content.getContent().length() > 0) {
                this.f24939Oooo0o.f50268Oooo0.setVisibility(0);
                this.f24939Oooo0o.f50251OooOOOO.setVisibility(0);
                o0o0Oo.OooO0O0(this.f24940Oooo0oO, content, this.f24939Oooo0o.f50268Oooo0, new o0O00OOO.OooO00o() { // from class: o0oo00Oo.o0oOO
                    @Override // o00OooOO.o0O00OOO.OooO00o
                    public final void OooO00o() {
                        MomentDetailView this$0 = this.f48233OooO0Oo;
                        MomentDetailModel postDetail2 = postDetail;
                        int i = MomentDetailView.f24937OoooooO;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(postDetail2, "$postDetail");
                        if (this$0.f24952Ooooo00 || this$0.f24938Oooo == MomentAdapterTag.MomentEditRecord) {
                            return;
                        }
                        this$0.OooOo0();
                        PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                        Activity activity = this$0.getActivity();
                        MomentAdapterTag momentAdapterTag = this$0.f24938Oooo;
                        PostDetailActivity.f22417o0O0O00.OooO00o(activity, postDetail2, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest, (256 & 64) != 0 ? null : momentAdapterTag, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
                    }
                });
                if (this.f24952Ooooo00 || this.f24938Oooo == MomentAdapterTag.MomentEditRecord) {
                    this.f24939Oooo0o.f50268Oooo0.setMaxLines(Integer.MAX_VALUE);
                } else {
                    this.f24939Oooo0o.f50268Oooo0.post(new Runnable() { // from class: o0oo00Oo.o00Oo00
                        @Override // java.lang.Runnable
                        public final void run() {
                            MomentDetailView.m488setTextInfo$lambda10$lambda8(this.f48159Oooo0o);
                        }
                    });
                    this.f24939Oooo0o.f50268Oooo0.setMaxLines(6);
                }
                if (postDetail.getType() == MomentType.YallaChatGroup.getValue()) {
                    FixTextView fixTextView = this.f24939Oooo0o.f50268Oooo0;
                    String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.topic_group_create_success_message_xxx), o00O0.OooO0oO(content.getCircleName()));
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.topic_group_create_success_message_Highlight);
                    int iOooO00o = com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9);
                    fixTextView.setText(strOooO00o);
                    Intrinsics.checkNotNullExpressionValue(fixTextView, "");
                    oo0o0O0.OooO0O0(fixTextView, strOooO0OO, new OooOOOO(content));
                    oo0o0O0.OooO0o0(fixTextView, new String[]{strOooO0OO}, iOooO00o);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setTextInfo$lambda-10$lambda-8, reason: not valid java name */
    public static final void m488setTextInfo$lambda10$lambda8(MomentDetailView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.f24939Oooo0o.f50268Oooo0.getLayout() == null || this$0.f24939Oooo0o.f50268Oooo0.getLayout().getLineCount() <= 6) {
                return;
            }
            this$0.f24939Oooo0o.f50272Oooo0O0.setVisibility(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void setToShare(MomentDetailModel item) {
        if (item != null && item.getPower() == MomentTypePower.Open.getValue() && item.getDeleteType() == MomentTypeDelete.NORMAL.getValue()) {
            this.f24939Oooo0o.f50244OooO0oO.setVisibility(0);
        }
    }

    private final void setTopicInfo(MomentDetailModel postDetail) {
        MomentAdapterTag momentAdapterTag = this.f24938Oooo;
        if (momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest || momentAdapterTag == MomentAdapterTag.PostDetailActivity || this.f24952Ooooo00 || postDetail.getContent() == null) {
            return;
        }
        MomentSendContentModel content = postDetail.getContent();
        if (oOO00O.OooO0o(content != null ? Long.valueOf(content.getCircleId()) : null) <= 0 || postDetail.getCircleDisbanded()) {
            return;
        }
        this.f24939Oooo0o.f50252OooOOOo.setVisibility(0);
        this.f24939Oooo0o.f50274Oooo0o0.setVisibility(0);
        TextView textView = this.f24939Oooo0o.f50274Oooo0o0;
        MomentSendContentModel content2 = postDetail.getContent();
        textView.setText(content2 != null ? content2.getCircleName() : null);
    }

    public final boolean OooO() {
        if (this.f24952Ooooo00 || this.f24938Oooo == MomentAdapterTag.MomentEditRecord) {
            this.f24939Oooo0o.f50245OooO0oo.setVisibility(8);
        } else {
            this.f24939Oooo0o.f50245OooO0oo.setVisibility(0);
        }
        return this.f24952Ooooo00;
    }

    public final void OooOO0() {
        this.f24939Oooo0o.f50237OooO.setVisibility(8);
        this.f24939Oooo0o.f50268Oooo0.setText("");
        this.f24939Oooo0o.f50268Oooo0.setVisibility(8);
        this.f24939Oooo0o.f50251OooOOOO.setVisibility(8);
        this.f24939Oooo0o.f50252OooOOOo.setVisibility(8);
        this.f24939Oooo0o.f50274Oooo0o0.setVisibility(8);
        this.f24939Oooo0o.f50270Oooo00O.setVisibility(8);
        this.f24939Oooo0o.f50266OooOooO.setVisibility(8);
        this.f24939Oooo0o.f50249OooOOO.setVisibility(8);
        this.f24939Oooo0o.f50261OooOoO.setVisibility(8);
        this.f24939Oooo0o.f50261OooOoO.setText("");
        this.f24939Oooo0o.f50273Oooo0OO.setText("");
        this.f24939Oooo0o.f50244OooO0oO.setVisibility(8);
        this.f24939Oooo0o.f50243OooO0o0.setVisibility(8);
        this.f24939Oooo0o.f50243OooO0o0.OooO0o0();
        this.f24939Oooo0o.f50246OooOO0.setVisibility(8);
        this.f24939Oooo0o.f50264OooOoo.setVisibility(8);
        this.f24939Oooo0o.f50253OooOOo.setVisibility(8);
        this.f24939Oooo0o.f50254OooOOo0.setVisibility(8);
        this.f24939Oooo0o.f50257OooOo0.setVisibility(8);
        this.f24939Oooo0o.f50247OooOO0O.setVisibility(8);
        if (this.f24952Ooooo00 || this.f24938Oooo == MomentAdapterTag.MomentEditRecord) {
            this.f24939Oooo0o.f50262OooOoO0.setVisibility(8);
            this.f24939Oooo0o.f50240OooO0OO.setVisibility(0);
        } else {
            this.f24939Oooo0o.f50262OooOoO0.setVisibility(0);
            this.f24939Oooo0o.f50240OooO0OO.setVisibility(8);
        }
        this.f24939Oooo0o.f50272Oooo0O0.setVisibility(8);
        this.f24939Oooo0o.f50269Oooo000.setVisibility(8);
        this.f24939Oooo0o.f50267OooOooo.setVisibility(8);
        this.f24939Oooo0o.f50267OooOooo.setText("");
        this.f24939Oooo0o.f50258OooOo00.setVisibility(8);
        this.f24939Oooo0o.f50255OooOOoo.setVisibility(8);
        this.f24939Oooo0o.f50241OooO0Oo.setVisibility(8);
        this.f24939Oooo0o.f50241OooO0Oo.OooO0o0();
        this.f24939Oooo0o.f50248OooOO0o.setVisibility(8);
        this.f24939Oooo0o.f50268Oooo0.setMaxLines(6);
        this.f24939Oooo0o.f50267OooOooo.setMaxLines(6);
        this.f24939Oooo0o.f50239OooO0O0.setVisibility(8);
    }

    public final void OooOO0O() {
        oOOOOo0O oooooo0o;
        p103o000oo00.OooOO0O oooOO0O;
        oo0o0Oo oo0o0oo = this.f24950OoooOoO;
        if (oo0o0oo != null) {
            if (oo0o0oo.f32964OooO0OO == null) {
                oo0o0oo.f32964OooO0OO = new ArrayList<>();
            }
            oo0o0oo.f32967OooO0o0 = true;
            p182o00o0000.o0OOO0o o0ooo0o2 = oo0o0oo.f32968OooO0oO;
            if (o0ooo0o2 != null && (oooooo0o = o0ooo0o2.f26296OooO00o) != null && (oooOO0O = o0ooo0o2.f26298OooO0OO) != null) {
                oooooo0o.OooO0o(oooOO0O);
            }
            if (oo0o0oo.f32965OooO0Oo != null) {
                for (int i = 0; i < oo0o0oo.f32964OooO0OO.size(); i++) {
                    Object obj = oo0o0oo.f32965OooO0Oo;
                    Object obj2 = oo0o0oo.f32964OooO0OO.get(i);
                    oo0o0oo.f32964OooO0OO.size();
                    Objects.requireNonNull((o0OO00O) obj);
                    ImageMoreItemView imageMoreItemView = (ImageMoreItemView) obj2;
                    if (imageMoreItemView != null) {
                        imageMoreItemView.OooO0OO(false);
                    }
                }
            }
        }
        MomentDetailUserView momentDetailUserView = this.f24939Oooo0o.f50259OooOo0O;
        momentDetailUserView.f24920Oooo0o.f50296OooOO0O.OooOO0(false);
        momentDetailUserView.f24920Oooo0o.f50296OooOO0O.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0o() {
        com.app.base.view.imageMore.ImageMoreView imageMoreView;
        if (this.f24950OoooOoO == null || (imageMoreView = this.f24946OoooOO0) == null) {
            return;
        }
        for (ImageView9GridModel imageView9GridModel : imageMoreView.getData()) {
            if (CloudImageUtilKt.imgContainsGif(imageView9GridModel.getUrl())) {
                imageView9GridModel.setGifType(1);
            }
        }
        OooOO0O();
        oo0o0Oo oo0o0oo = this.f24950OoooOoO;
        if (oo0o0oo != null) {
            com.app.base.view.imageMore.ImageMoreView imageMoreView2 = this.f24946OoooOO0;
            oo0o0oo.f32964OooO0OO = imageMoreView2 != null ? imageMoreView2.getAllGifItemView() : null;
            oo0o0oo.f32963OooO0O0 = -1;
            oo0o0oo.OooO00o();
        }
        this.f24939Oooo0o.f50259OooOo0O.OooO00o();
    }

    public final void OooOOO() {
        this.f24939Oooo0o.f50259OooOo0O.OooO00o();
    }

    public final void OooOOO0() {
        MomentDetailModel momentDetailModel = this.f24941Oooo0oo;
        if (momentDetailModel != null && momentDetailModel.getIsInHeBlack() == -1) {
            StringBuilder sb = new StringBuilder();
            MomentDetailModel momentDetailModel2 = this.f24941Oooo0oo;
            sb.append(momentDetailModel2 != null ? Long.valueOf(momentDetailModel2.getUserId()) : null);
            sb.append("");
            if (!o0O0O00.OooO(sb.toString())) {
                MomentVM momentVM = getMomentVM();
                StringBuilder sb2 = new StringBuilder();
                MomentDetailModel momentDetailModel3 = this.f24941Oooo0oo;
                sb2.append(momentDetailModel3 != null ? Long.valueOf(momentDetailModel3.getUserId()) : null);
                sb2.append("");
                LiveData<ApiResult<CheckUserBlackResultModel>> liveDataCheckUserBlack = momentVM.checkUserBlack(sb2.toString());
                ComponentCallbacks2 activity = getActivity();
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                liveDataCheckUserBlack.observe((LifecycleOwner) activity, new o0o0000.OooOo(new o0O0o(this), null, null, false));
            }
        }
        p255o00ooO0o.o00O0 o00o1 = new p255o00ooO0o.o00O0(getActivity());
        o00o1.OooOOO(o000O0O0.OooO0OO(R.string.share_with_friends));
        MomentDetailModel momentDetailModel4 = this.f24941Oooo0oo;
        if (momentDetailModel4 != null && momentDetailModel4.getPower() == MomentTypePower.Open.getValue()) {
            o00o1.OooOOO(o000O0O0.OooO0OO(R.string.Repost));
        }
        o00o1.OooOOoo(new OooO());
        o00o1.OooOOO0();
    }

    public final void OooOOOO() {
        MomentDetailModel momentDetailModel = this.f24941Oooo0oo;
        int i = momentDetailModel != null && momentDetailModel.getIsTop() ? 2 : 1;
        MomentVM momentVM = getMomentVM();
        MomentDetailModel momentDetailModel2 = this.f24941Oooo0oo;
        LiveData<ApiResult<Object>> liveData = momentVM.topInsForUserPost(momentDetailModel2 != null ? momentDetailModel2.getId() : 0L, i);
        ComponentCallbacks2 activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        liveData.observe((LifecycleOwner) activity, new o0o0000.OooOo(new OooOO0(i, this), null, null, false));
    }

    public final void OooOOOo(@Nullable PraiseView praiseView) {
        if (this.f24955OooooOO) {
            return;
        }
        this.f24955OooooOO = true;
        MomentDetailModel momentDetailModel = this.f24941Oooo0oo;
        int i = (momentDetailModel == null || !momentDetailModel.getIsPraise()) ? 0 : 1;
        MomentVM momentVM = getMomentVM();
        MomentDetailModel momentDetailModel2 = this.f24941Oooo0oo;
        LiveData<ApiResult<PraisePostResultModel>> liveDataPostPraise = momentVM.postPraise(momentDetailModel2 != null ? momentDetailModel2.getId() : 0L, i);
        ComponentCallbacks2 activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        liveDataPostPraise.observe((LifecycleOwner) activity, new o0o0000.OooOo(new OooOO0O(praiseView, i), new OooOOO0(), null, false));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    public final void OooOOo(boolean z) {
        MomentDetailModel momentDetailModel;
        boolean z2;
        MomentDetailModel momentDetailModel2;
        boolean z3;
        MomentDetailModel momentDetailModel3;
        boolean z4;
        MomentAdapterTag momentAdapterTag;
        if (getActivity().isDestroyed() || getActivity().isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            MoreTag moreTag = MoreTag.copy;
            arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag.getText()), moreTag));
        } else {
            if (this.f24947OoooOOO) {
                MoreTag moreTag2 = MoreTag.reply;
                arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag2.getText()), moreTag2));
            }
            MomentDetailModel momentDetailModel4 = this.f24941Oooo0oo;
            if (momentDetailModel4 != null && momentDetailModel4.getIsCanDel()) {
                momentDetailModel = this.f24941Oooo0oo;
                if (momentDetailModel == null && momentDetailModel.getType() == MomentType.Poll.getValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    momentDetailModel2 = this.f24941Oooo0oo;
                    if (momentDetailModel2 == null && momentDetailModel2.getType() == MomentType.YallaTeam.getValue()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        momentDetailModel3 = this.f24941Oooo0oo;
                        if (momentDetailModel3 == null && momentDetailModel3.getType() == MomentType.YallaChatGroup.getValue()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            MoreTag moreTag3 = MoreTag.postEdit;
                            arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag3.getText()), moreTag3));
                        }
                    }
                }
                MoreTag moreTag4 = MoreTag.deletePost;
                arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag4.getText()), moreTag4));
            } else {
                MomentDetailModel momentDetailModel5 = this.f24941Oooo0oo;
                if (Intrinsics.areEqual(momentDetailModel5 != null ? Long.valueOf(momentDetailModel5.getUserId()) : null, p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue())) {
                    momentDetailModel = this.f24941Oooo0oo;
                    if (momentDetailModel == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        momentDetailModel2 = this.f24941Oooo0oo;
                        if (momentDetailModel2 == null) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            momentDetailModel3 = this.f24941Oooo0oo;
                            if (momentDetailModel3 == null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                MoreTag moreTag5 = MoreTag.postEdit;
                                arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag5.getText()), moreTag5));
                            }
                        }
                    }
                    MoreTag moreTag6 = MoreTag.deletePost;
                    arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag6.getText()), moreTag6));
                } else {
                    MoreTag moreTag7 = MoreTag.report;
                    arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag7.getText()), moreTag7));
                }
            }
            if (!this.f24952Ooooo00 && ((momentAdapterTag = this.f24938Oooo) == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest)) {
                String str = this.f24943OoooO0;
                p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
                boolean zOooO00o = o0000O.OooO00o(oooOOO, str);
                boolean zContains = this.f24945OoooO0O.contains(String.valueOf(oooOOO.OooOo().getValue()));
                MomentDetailModel momentDetailModel6 = this.f24941Oooo0oo;
                boolean z5 = momentDetailModel6 != null && momentDetailModel6.getPositionid() == 3;
                MomentDetailModel momentDetailModel7 = this.f24941Oooo0oo;
                boolean z6 = momentDetailModel7 != null && momentDetailModel7.getPositionid() == 1;
                if (zOooO00o) {
                    if (!z6) {
                        MoreTag moreTag8 = MoreTag.postRemoveOutOfTopic;
                        arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag8.getText()), moreTag8));
                    }
                    MomentDetailModel momentDetailModel8 = this.f24941Oooo0oo;
                    if (momentDetailModel8 != null && this.f24942OoooO == momentDetailModel8.getId()) {
                        MoreTag moreTag9 = MoreTag.postUnTopOfTopic;
                        arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag9.getText()), moreTag9));
                    } else {
                        MoreTag moreTag10 = MoreTag.postTopOfTopic;
                        arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag10.getText()), moreTag10));
                    }
                    if (!z6) {
                        MomentDetailModel momentDetailModel9 = this.f24941Oooo0oo;
                        if ((momentDetailModel9 == null || momentDetailModel9.getIsblack()) ? false : true) {
                            MoreTag moreTag11 = MoreTag.DisableTheUser;
                            arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag11.getText()), moreTag11));
                        }
                    }
                }
                if (zContains) {
                    if (!z6 && !z5) {
                        MoreTag moreTag12 = MoreTag.postRemoveOutOfTopic;
                        arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag12.getText()), moreTag12));
                    }
                    if (!z6 && !z5) {
                        MomentDetailModel momentDetailModel10 = this.f24941Oooo0oo;
                        if ((momentDetailModel10 == null || momentDetailModel10.getIsblack()) ? false : true) {
                            MoreTag moreTag13 = MoreTag.DisableTheUser;
                            arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag13.getText()), moreTag13));
                        }
                    }
                }
            }
            if (!this.f24952Ooooo00 && this.f24938Oooo == MomentAdapterTag.UserPostListActivity) {
                MomentDetailModel momentDetailModel11 = this.f24941Oooo0oo;
                if (Intrinsics.areEqual(momentDetailModel11 != null ? Long.valueOf(momentDetailModel11.getUserId()) : null, p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue())) {
                    MomentDetailModel momentDetailModel12 = this.f24941Oooo0oo;
                    if (momentDetailModel12 != null && momentDetailModel12.getIsTop()) {
                        MoreTag moreTag14 = MoreTag.postUnTopOfUser;
                        arrayList.add(0, new MoreModel(o000O0O0.OooO0OO(moreTag14.getText()), moreTag14));
                    } else {
                        MoreTag moreTag15 = MoreTag.postTopOfUser;
                        arrayList.add(0, new MoreModel(o000O0O0.OooO0OO(moreTag15.getText()), moreTag15));
                    }
                }
            }
            MomentDetailModel momentDetailModel13 = this.f24941Oooo0oo;
            if (momentDetailModel13 != null && momentDetailModel13.getIsEdited()) {
                MoreTag moreTag16 = MoreTag.postEditHistory;
                arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag16.getText()), moreTag16));
            }
        }
        p255o00ooO0o.o00O0 o00o1 = new p255o00ooO0o.o00O0(getActivity());
        o00o1.OooOOo0(arrayList);
        o00o1.OooOOoo(new OooOo00());
        o00o1.OooOOO0();
    }

    public final void OooOOo0(@Nullable MomentDetailModel momentDetailModel, int i) {
        this.f24941Oooo0oo = momentDetailModel;
        this.f24956OooooOo = i;
        this.f24939Oooo0o.f50259OooOo0O.setMPosition(i);
        OooOO0();
        MomentDetailModel momentDetailModel2 = this.f24941Oooo0oo;
        setPostAdView(momentDetailModel2 != null ? momentDetailModel2.getAdData() : null);
        MomentDetailModel momentDetailModel3 = this.f24941Oooo0oo;
        setSendTaskLayout(momentDetailModel3 != null ? momentDetailModel3.getSendPostModel() : null);
        setContentLayout(this.f24941Oooo0oo);
        setToShare(this.f24941Oooo0oo);
    }

    public final void OooOOoo() {
        if (OooO()) {
            return;
        }
        MomentDetailModel momentDetailModel = this.f24941Oooo0oo;
        boolean z = false;
        if (momentDetailModel != null && momentDetailModel.getIsPraise()) {
            z = true;
        }
        if (z) {
            this.f24939Oooo0o.f50271Oooo00o.setTextColor(-103316);
        } else {
            this.f24939Oooo0o.f50271Oooo00o.setTextColor(-1979711488);
        }
        TextView textView = this.f24939Oooo0o.f50271Oooo00o;
        MomentDetailModel momentDetailModel2 = this.f24941Oooo0oo;
        textView.setText(o0O0O00.OooO0oO(momentDetailModel2 != null ? momentDetailModel2.getPraiseNum() : 0L, true));
    }

    public final void OooOo0() {
        MomentLogSourcePage sourcePage = this.f24952Ooooo00 ? MomentLogSourcePage.moments_content : o000O00O.OooO00o(this.f24938Oooo);
        if (sourcePage == null || sourcePage == MomentLogSourcePage.moments_content) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        MomentDetailModel momentDetailModel = this.f24941Oooo0oo;
        sb.append(momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null);
        sb.append("");
        if (o0O0O00.OooO(sb.toString())) {
            return;
        }
        MomentLogActionTypeHitDetail momentLogActionTypeHitDetail = new MomentLogActionTypeHitDetail(null, null, 3, null);
        StringBuilder sb2 = new StringBuilder();
        MomentDetailModel momentDetailModel2 = this.f24941Oooo0oo;
        sb2.append(momentDetailModel2 != null ? Long.valueOf(momentDetailModel2.getUserId()) : null);
        sb2.append("");
        momentLogActionTypeHitDetail.setObject_userid(sb2.toString());
        MomentDetailModel momentDetailModel3 = this.f24941Oooo0oo;
        momentLogActionTypeHitDetail.setDiscoveryid(com.yalla.support.common.util.OooO.OooO(Long.valueOf(momentDetailModel3 != null ? momentDetailModel3.getId() : 0L), ""));
        MomentLogActionType actionType = MomentLogActionType.hit_detail;
        String actionInfo = momentLogActionTypeHitDetail.toJson();
        MomentDetailModel momentDetailModel4 = this.f24941Oooo0oo;
        String sessionId = momentDetailModel4 != null ? momentDetailModel4.getSessionId() : null;
        Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0OO(sourcePage, actionType, actionInfo, sessionId, null), 3, null);
    }

    public final void OooOo00() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("toShareData mData = ");
        sbOooO0o0.append(this.f24941Oooo0oo);
        o00O00.OooO0O0(sbOooO0o0.toString());
        MomentDetailModel momentDetailModel = this.f24941Oooo0oo;
        boolean z = false;
        if (momentDetailModel != null && momentDetailModel.getIsForward()) {
            MomentDetailModel momentDetailModel2 = this.f24941Oooo0oo;
            if ((momentDetailModel2 != null ? momentDetailModel2.getForward() : null) != null) {
                if (this.f24952Ooooo00 || this.f24938Oooo == MomentAdapterTag.MomentEditRecord) {
                    return;
                }
                MomentDetailModel momentDetailModel3 = this.f24941Oooo0oo;
                MomentDetailModel forward = momentDetailModel3 != null ? momentDetailModel3.getForward() : null;
                OooOo0();
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                Activity activity = getActivity();
                MomentAdapterTag momentAdapterTag = this.f24938Oooo;
                PostDetailActivity.f22417o0O0O00.OooO00o(activity, forward, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest, (256 & 64) != 0 ? null : momentAdapterTag, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
                return;
            }
        }
        MomentDetailModel momentDetailModel4 = this.f24941Oooo0oo;
        MomentForwardContent forwardContent = momentDetailModel4 != null ? momentDetailModel4.getForwardContent() : null;
        if (forwardContent != null) {
            int shareType = forwardContent.getShareType();
            if (shareType == 1) {
                if (forwardContent.getRoomId() > 0) {
                    RoomModel roomModel = new RoomModel();
                    roomModel.setId(forwardContent.getRoomId());
                    roomModel.setImage(forwardContent.getImage());
                    roomModel.setName(forwardContent.getName());
                    RoomStateManager.INSTANCE.enterRoom(roomModel, this.f24951OoooOoo);
                    return;
                }
                return;
            }
            if (shareType == 2) {
                String url = forwardContent.getUrl();
                if (url != null) {
                    if (url.length() > 0) {
                        z = true;
                    }
                }
                if (z) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
                    String url2 = forwardContent.getUrl();
                    Intrinsics.checkNotNull(url2);
                    webPageInfo.OooO0Oo(url2);
                    webPageInfo.OooO0OO(forwardContent.getName());
                    webPageInfo.OooO0O0(WebPageInfo.ShareType.Share, forwardContent.getImage(), "");
                    webPageInfo.OooO00o("barId", forwardContent.getRoomId() + "");
                    WebActivity.f22108OoooooO.OooO00o(getActivity(), webPageInfo);
                    return;
                }
                return;
            }
            if (shareType == 3) {
                String url3 = forwardContent.getUrl();
                if (url3 != null) {
                    if (url3.length() > 0) {
                        z = true;
                    }
                }
                if (z) {
                    WebPageInfo webPageInfo2 = new WebPageInfo(WebFrom.RoomMainBanner);
                    String url4 = forwardContent.getUrl();
                    Intrinsics.checkNotNull(url4);
                    webPageInfo2.OooO0Oo(url4);
                    webPageInfo2.OooO0OO(forwardContent.getName());
                    webPageInfo2.OooO0O0(WebPageInfo.ShareType.Share, forwardContent.getImage(), "");
                    webPageInfo2.OooO00o("barId", forwardContent.getRoomId() + "");
                    WebActivity.f22108OoooooO.OooO00o(getActivity(), webPageInfo2);
                    return;
                }
                return;
            }
            if (shareType != 4) {
                return;
            }
            String url5 = forwardContent.getUrl();
            if (url5 != null) {
                if (url5.length() > 0) {
                    z = true;
                }
            }
            if (z) {
                WebPageInfo webPageInfo3 = new WebPageInfo(WebFrom.MomentActivityBanner);
                String url6 = forwardContent.getUrl();
                Intrinsics.checkNotNull(url6);
                webPageInfo3.OooO0Oo(url6);
                webPageInfo3.OooO0OO(forwardContent.getName());
                webPageInfo3.OooO0O0(WebPageInfo.ShareType.Share, forwardContent.getImage(), "");
                webPageInfo3.OooO00o("barId", forwardContent.getRoomId() + "");
                WebActivity.f22108OoooooO.OooO00o(getActivity(), webPageInfo3);
            }
        }
    }

    public final void OooOo0O(String str) {
        MomentLogSourcePage sourcePage = this.f24952Ooooo00 ? MomentLogSourcePage.moments_content : o000O00O.OooO00o(this.f24938Oooo);
        if (sourcePage == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        MomentDetailModel momentDetailModel = this.f24941Oooo0oo;
        sb.append(momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null);
        sb.append("");
        if (o0O0O00.OooO(sb.toString())) {
            return;
        }
        MomentLogActionTypeHitImage momentLogActionTypeHitImage = new MomentLogActionTypeHitImage(null, null, null, 7, null);
        StringBuilder sb2 = new StringBuilder();
        MomentDetailModel momentDetailModel2 = this.f24941Oooo0oo;
        sb2.append(momentDetailModel2 != null ? Long.valueOf(momentDetailModel2.getUserId()) : null);
        sb2.append("");
        momentLogActionTypeHitImage.setObject_userid(sb2.toString());
        MomentDetailModel momentDetailModel3 = this.f24941Oooo0oo;
        momentLogActionTypeHitImage.setDiscoveryid(com.yalla.support.common.util.OooO.OooO(Long.valueOf(momentDetailModel3 != null ? momentDetailModel3.getId() : 0L), ""));
        momentLogActionTypeHitImage.setImage_url(str);
        MomentLogActionType actionType = MomentLogActionType.hit_image;
        String actionInfo = momentLogActionTypeHitImage.toJson();
        MomentDetailModel momentDetailModel4 = this.f24941Oooo0oo;
        String sessionId = momentDetailModel4 != null ? momentDetailModel4.getSessionId() : null;
        Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0OO(sourcePage, actionType, actionInfo, sessionId, null), 3, null);
    }

    @NotNull
    public final Activity getActivity() {
        FragmentActivity fragmentActivity = this.f24940Oooo0oO;
        Intrinsics.checkNotNull(fragmentActivity);
        return fragmentActivity;
    }

    @NotNull
    public final String getContentTextContent() {
        return this.f24939Oooo0o.f50268Oooo0.getText().toString();
    }

    @Nullable
    public final Function1<PostDetailHeaderViewTag, Unit> getListener() {
        return this.listener;
    }

    @Nullable
    public final Function1<MomentDetailModel, Unit> getShowGiftDialogListener() {
        return this.showGiftDialogListener;
    }

    public final void setAutoSplitEnabled(boolean enable) {
        this.f24939Oooo0o.f50268Oooo0.setAutoSplitEnabled(enable);
        this.f24939Oooo0o.f50267OooOooo.setAutoSplitEnabled(enable);
    }

    public final void setData(@Nullable MomentDetailModel data) {
        OooOOo0(data, 0);
    }

    public final void setEnterRoomParentPage(@Nullable EnterRoomParentPage enterRoomParentPage) {
        this.f24951OoooOoo = enterRoomParentPage;
    }

    public final void setForwarding(boolean forwarding) {
    }

    public final void setFromTopicDetail(boolean fromTopicDetail) {
        this.f24939Oooo0o.f50259OooOo0O.setMIsFromTopicDetail(fromTopicDetail);
    }

    public final void setIsPostDetailPage(boolean isPostDetailPage) {
        this.f24952Ooooo00 = isPostDetailPage;
        this.f24939Oooo0o.f50259OooOo0O.setPostDetailPage(isPostDetailPage);
    }

    public final void setLineParentBottom(int visibility) {
        this.f24939Oooo0o.f50262OooOoO0.setVisibility(visibility);
    }

    public final void setListener(@Nullable Function1<? super PostDetailHeaderViewTag, Unit> function1) {
        this.listener = function1;
    }

    public final void setMomentAdapterTag(@Nullable MomentAdapterTag momentAdapterTag) {
        this.f24938Oooo = momentAdapterTag;
        this.f24939Oooo0o.f50259OooOo0O.setMomentAdapterTag(momentAdapterTag);
    }

    public final void setPostDetailHeaderView(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f24939Oooo0o.f50259OooOo0O.setRootListener(new o0O00(this));
        this.f24939Oooo0o.f50259OooOo0O.setUserListener(new o0O00O0o(this));
        this.f24939Oooo0o.f50259OooOo0O.setFollowListener(new o0O00OO(this));
        this.f24939Oooo0o.f50259OooOo0O.setMoveListener(new p601o0oo00Oo.o0oO0Ooo(this));
        this.f24939Oooo0o.f50268Oooo0.setEllipsize(TextUtils.TruncateAt.END);
        this.f24939Oooo0o.f50268Oooo0.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0oo00Oo.o00OOOO0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                MomentDetailView this$0 = this.f48157Oooo0o;
                int i = MomentDetailView.f24937OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f24959o000oOoO = false;
                this$0.OooOOo(true);
                return true;
            }
        });
        String strOooO0OO = o000O0O0.OooO0OO(R.string.Update_Yalla);
        String strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(o000O0O0.OooO0OO(R.string.moment_content_not_support), strOooO0OO);
        this.f24939Oooo0o.f50270Oooo00O.setText(strOooO0Oo);
        this.f24939Oooo0o.f50266OooOooO.setText(strOooO0Oo);
        TextView textView = this.f24939Oooo0o.f50270Oooo00O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvNotSupportItem");
        oo0o0O0.OooO0o0(textView, new String[]{strOooO0OO}, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9));
        TextView textView2 = this.f24939Oooo0o.f50266OooOooO;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvForwardNotSupportItem");
        oo0o0O0.OooO0o0(textView2, new String[]{strOooO0OO}, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9));
        this.f24939Oooo0o.f50270Oooo00O.setOnClickListener(new o0O00o00(this));
        this.f24939Oooo0o.f50266OooOooO.setOnClickListener(new o0O00oO0(this));
        this.f24939Oooo0o.f50243OooO0o0.setOnItemClickListener(new oO0(this, 2));
        this.f24939Oooo0o.f50269Oooo000.setEllipsize(TextUtils.TruncateAt.END);
        this.f24939Oooo0o.f50267OooOooo.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0oo00Oo.o00OOOOo
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                MomentDetailView this$0 = this.f48158Oooo0o;
                int i = MomentDetailView.f24937OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f24959o000oOoO = true;
                this$0.OooOOo(true);
                return true;
            }
        });
        this.f24939Oooo0o.f50254OooOOo0.setEventClickListener(new o0O000(this));
        this.f24939Oooo0o.f50257OooOo0.setChangeMomentPollListener(new o0O000O(this));
        this.f24939Oooo0o.f50257OooOo0.setToMomentDetailListener(new o0OoOoOo(this));
        this.f24939Oooo0o.f50258OooOo00.setChangeMomentPollListener(new o0O000Oo(this));
        this.f24939Oooo0o.f50258OooOo00.setToMomentDetailListener(new o0O000o0(this));
        this.f24939Oooo0o.f50241OooO0Oo.setForward(true);
        this.f24939Oooo0o.f50241OooO0Oo.setOnItemClickListener(new o0000O0O(this));
        OooOO0();
        this.f24940Oooo0oO = activity;
        new MomentPowerSelectModel(MomentTypePower.Open.getValue());
        this.f24950OoooOoO = new oo0o0Oo(getActivity());
    }

    public final void setShowGiftDialogListener(@Nullable Function1<? super MomentDetailModel, Unit> function1) {
        this.showGiftDialogListener = function1;
    }

    public final void setShowReply(boolean showReply) {
        this.f24947OoooOOO = showReply;
    }

    public final void setTopPostId(long topPostId) {
        this.f24942OoooO = topPostId;
        this.f24939Oooo0o.f50259OooOo0O.setTopPostId(topPostId);
    }

    public final void setTopicDetailId(long topicDetailId) {
        this.f24944OoooO00 = topicDetailId;
    }

    public final void setTopicManagers(@NotNull ArrayList<String> topicManagerIds) {
        Intrinsics.checkNotNullParameter(topicManagerIds, "topicManagerIds");
        this.f24945OoooO0O = topicManagerIds;
    }

    public final void setTopicOwnerId(@Nullable String topicOwnerId) {
        Intrinsics.checkNotNull(topicOwnerId);
        this.f24943OoooO0 = topicOwnerId;
        this.f24939Oooo0o.f50259OooOo0O.setTopicOwnerId(topicOwnerId);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(@Nullable View view) {
        return super.showContextMenuForChild(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        p9 p9VarInflate = p9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(p9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24939Oooo0o = p9VarInflate;
        this.f24943OoooO0 = "";
        this.f24945OoooO0O = new ArrayList<>();
        OooO0OO oooO0OO = new OooO0OO();
        this.f24956OooooOo = -1;
        this.momentVM = LazyKt.lazy(new OooO0o(context));
        this.yallaChatVM = LazyKt.lazy(new OooOo(context));
        this.f24939Oooo0o.f50244OooO0oO.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50242OooO0o.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50271Oooo00o.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50252OooOOOo.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50274Oooo0o0.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50273Oooo0OO.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50237OooO.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50261OooOoO.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50250OooOOO0.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50246OooOO0.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50264OooOoo.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50247OooOO0O.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50269Oooo000.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50248OooOO0o.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50249OooOOO.setOnClickListener(oooO0OO);
        this.f24939Oooo0o.f50255OooOOoo.setToMomentGiftListListener(new OooO00o(context));
        this.f24939Oooo0o.f50255OooOOoo.setShowGiftDialogListener(new OooO0O0());
    }
}
