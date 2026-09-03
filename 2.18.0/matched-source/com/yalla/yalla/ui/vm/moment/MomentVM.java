package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.app.base.fragment.ContributionFragment;
import com.app.base.model.MomentBarGetServerIpModel;
import com.app.base.model.NewFollowMomentModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.repository.MomentBannerApiRepo$bannerList$$inlined$call$1;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.data.db.model.ReadPostTable;
import com.yalla.yalla.model.CheckUserBlackResultModel;
import com.yalla.yalla.model.MomentBannerModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentEditBefore;
import com.yalla.yalla.model.MomentEditResult;
import com.yalla.yalla.model.MomentGift;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentSendResultModel;
import com.yalla.yalla.model.PollConfig;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.PostSendGiftModel;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.model.ReportCommentDetailModel;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.TopicCreateCheckModel;
import com.yalla.yalla.model.TopicInfoModel;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0OOO00;
import p167o00OoOoo.o0O00O0o;
import p522o0o0O0O0.o000O00;
import p522o0o0O0O0.o000O0Oo;
import p522o0o0O0O0.o00O00OO;
import p522o0o0O0O0.oo0oOO0;
import p549o0o0o00O.o00O00;
import p549o0o0o00O.o00O000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00072\u0006\u0010\u000b\u001a\u00020\nJ\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ8\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016J8\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001c0\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016J2\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0016J\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u000fJ\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00130\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016J0\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001c0\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016J1\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u00130\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b,\u0010-J(\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u00130\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016J(\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u00130\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016J0\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u00130\u00122\u0006\u00100\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016J0\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u00130\u00122\u0006\u00102\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016J0\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u00130\u00122\u0006\u00102\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016J \u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u001c0\u00130\u00122\u0006\u00105\u001a\u00020\u0018J\u0012\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00130\u0012J\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c0\u00130\u0012J$\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010;\u001a\u00020\u0016J\u0006\u0010=\u001a\u00020\u0005J\u001a\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00130\u00122\u0006\u0010>\u001a\u00020\u0018J\u0006\u0010@\u001a\u00020\u0005J:\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010;\u001a\u00020\u0016J\u001e\u0010C\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010B\u001a\u00020\nJ\u001a\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u00130\u00122\u0006\u00100\u001a\u00020\u000fJ2\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000fJ\u001a\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00130\u00122\u0006\u0010K\u001a\u00020JJ\"\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u00130\u00122\u0006\u0010N\u001a\u00020\u00182\u0006\u0010O\u001a\u00020\u0018J\"\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u00130\u00122\u0006\u0010N\u001a\u00020\u00182\u0006\u0010O\u001a\u00020\u0018J\"\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00130\u00122\u0006\u00102\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J*\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00130\u00122\u0006\u00102\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016J*\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00130\u00122\u0006\u00102\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016J\u001a\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u0018J\"\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016J\"\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016J\u0012\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u00130\u0012J\u001a\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u00130\u00122\u0006\u0010N\u001a\u00020\u0018J \u0010]\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001c0\u00130\u00122\u0006\u0010\u0010\u001a\u00020\u0018JF\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00130\u00122\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0\u00130\u00122\u0006\u0010^\u001a\u00020\u0018J.\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u00130\u00122\u0006\u0010e\u001a\u00020J2\b\u0010G\u001a\u0004\u0018\u00010\u000f2\b\u0010H\u001a\u0004\u0018\u00010\u000fJ0\u0010h\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u00130\u00122\u0006\u0010^\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0018J:\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\u00122\u0006\u0010^\u001a\u00020\u00182\u0006\u0010i\u001a\u00020\u00182\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000fJ\u001a\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0\u00130\u00122\u0006\u0010k\u001a\u00020\u0018R\u001b\u0010s\u001a\u00020n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001b\u0010y\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bv\u0010p\u001a\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u007f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R5\u0010\u0089\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "Lo00OO/OooO00o;", "", "Lcom/yalla/yalla/model/RecommendNewPostModel;", "data", "", "sortUnreadPost", "Lo0o00OOO/Oooo0;", "Lcom/yalla/yalla/model/TopicCreateCheckModel;", "checkTopicState", "", "isRefresh", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/TopicInfoModel;", "loadFollowingTopic", "", "commentId", "toUserId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/RewardCommentResultModel;", "commentSendProp", "", "type", "", "dyId", "dateSort", "pageIndex", "", "Lcom/yalla/yalla/model/MomentGift;", "momentGiftList", "Lcom/yalla/yalla/model/PostCommentDetailModel;", "momentCommentList", "propId", "propNum", "Lcom/yalla/yalla/model/PostSendGiftModel;", "sendGift", "Lcom/yalla/yalla/model/CheckUserBlackResultModel;", "checkUserBlack", "Lcom/yalla/yalla/model/PraiseCommentResultModel;", "commentPraise", "Lcom/yalla/yalla/model/PostUserModel;", "praiseList", "Lcom/yalla/yalla/model/MomentDetailModel;", "momentFollowList", "(Ljava/lang/Long;I)Landroidx/lifecycle/LiveData;", "momentFeaturedList", "momentRecommendList", ContributionFragment.ARG_1, "squareBarMember", "circleId", "topicMomentListNew", "topicMomentListHot", "adId", "", "adAddBlockIns", "Lcom/yalla/yalla/model/MomentBannerModel;", "loadBannerList", "momentRecommendUserList", "sourceType", "momentDetail", "startCheckNewPostJob", "duration", "momentsDurationAdd", "statisticalTime", "userMomentList", "sort", "checkUnreadPost", "Lcom/app/base/model/MomentBarGetServerIpModel;", "momentRoomGetServerIP", "fileName", "pNumber", "size", "momentChangeImagesUrl", "Lcom/yalla/yalla/model/MomentSendModel;", "sendPostModel", "Lcom/yalla/yalla/model/MomentSendResultModel;", "momentSend", "voteId", "voteOptionId", "Lcom/yalla/yalla/model/MomentPoll;", "momentPoll", "momentPollCancel", "circleDiscoveryDelete", "circleDiscoveryTopIns", "circleBlackIns", "delMoment", "Lcom/yalla/yalla/model/PraisePostResultModel;", "postPraise", "topInsForUserPost", "Lcom/yalla/yalla/model/PollConfig;", "getPollConfig", "getPollInfo", "commentParentCommentInfo", "momentId", "content", "parentUserId", "parentUserName", "commentWrite", "Lcom/yalla/yalla/model/MomentEditBefore;", "momentEditBefore", "moment", "Lcom/yalla/yalla/model/MomentEditResult;", "momentEditSend", "momentEditHistory", "editId", "momentEditPicUpdateSet", "cid", "Lcom/yalla/yalla/model/ReportCommentDetailModel;", "getCommentInfo", "Lo00OOOOo/OooO0O0;", "searchHistoryRepository$delegate", "Lkotlin/Lazy;", "getSearchHistoryRepository", "()Lo00OOOOo/OooO0O0;", "searchHistoryRepository", "joinedTopicPageIndex", "I", "lastLeaveMomentPage$delegate", "getLastLeaveMomentPage", "()I", "lastLeaveMomentPage", "newestFollowingPostId", "Ljava/lang/String;", "Lkotlinx/coroutines/Job;", "checkNewPostJob", "Lkotlinx/coroutines/Job;", "statisticalTimeLastTime", "J", "Lcom/yalla/yalla/common/util/WebPageInfo;", "<set-?>", "halfDialogWebPageInfo$delegate", "Lo000oOoO/o0O00O;", "getHalfDialogWebPageInfo", "()Lcom/yalla/yalla/common/util/WebPageInfo;", "setHalfDialogWebPageInfo", "(Lcom/yalla/yalla/common/util/WebPageInfo;)V", "halfDialogWebPageInfo", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class MomentVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @Nullable
    private Job checkNewPostJob;

    /* JADX INFO: renamed from: halfDialogWebPageInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00O halfDialogWebPageInfo;
    private int joinedTopicPageIndex;

    /* JADX INFO: renamed from: lastLeaveMomentPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lastLeaveMomentPage;

    @NotNull
    private String newestFollowingPostId;

    /* JADX INFO: renamed from: searchHistoryRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy searchHistoryRepository;
    private long statisticalTimeLastTime;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$circleDiscoveryDelete$1", f = "MomentVM.kt", i = {}, l = {350, 350}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25744Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25745OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25746OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25747OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j, long j2, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f25745OoooO0 = j;
            this.f25747OoooO0O = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f25745OoooO0, this.f25747OoooO0O, continuation);
            oooO.f25746OoooO00 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25744Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25746OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25746OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25745OoooO0;
            long j2 = this.f25747OoooO0O;
            this.f25746OoooO00 = liveDataScope;
            this.f25744Oooo = 1;
            obj = o000o0oo2.OooO0Oo(j, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25746OoooO00 = null;
            this.f25744Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$adAddBlockIns$1", f = "MomentVM.kt", i = {}, l = {170, 170}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<Object>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25748Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25749OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25750OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25749OoooO0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25749OoooO0, continuation);
            oooO00o.f25750OoooO00 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<Object>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25748Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25750OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25750OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25749OoooO0;
            this.f25750OoooO00 = liveDataScope;
            this.f25748Oooo = 1;
            obj = o000o0oo2.OooO00o(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25750OoooO00 = null;
            this.f25748Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<TopicCreateCheckModel>, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ p497o0o00OOO.Oooo0<TopicCreateCheckModel> f25751Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(p497o0o00OOO.Oooo0<TopicCreateCheckModel> oooo0) {
            super(1);
            this.f25751Oooo = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<TopicCreateCheckModel> response) {
            Response<TopicCreateCheckModel> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25751Oooo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$checkUserBlack$1", f = "MomentVM.kt", i = {}, l = {107, 107}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<CheckUserBlackResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25752Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25753OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25754OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25753OoooO0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f25753OoooO0, continuation);
            oooO0OO.f25754OoooO00 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<CheckUserBlackResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25752Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25754OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25754OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            String str = this.f25753OoooO0;
            this.f25754OoooO00 = liveDataScope;
            this.f25752Oooo = 1;
            obj = o000o0oo2.OooO0O0(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25754OoooO00 = null;
            this.f25752Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$circleBlackIns$1", f = "MomentVM.kt", i = {}, l = {367, 367}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25755Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f25756OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25757OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25758OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25759OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, long j2, int i, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25757OoooO0 = j;
            this.f25759OoooO0O = j2;
            this.f25756OoooO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f25757OoooO0, this.f25759OoooO0O, this.f25756OoooO, continuation);
            oooO0o.f25758OoooO00 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25755Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25758OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25758OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25757OoooO0;
            long j2 = this.f25759OoooO0O;
            int i2 = this.f25756OoooO;
            this.f25758OoooO00 = liveDataScope;
            this.f25755Oooo = 1;
            obj = o000o0oo2.OooO0OO(j, j2, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25758OoooO00 = null;
            this.f25755Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$circleDiscoveryTopIns$1", f = "MomentVM.kt", i = {}, l = {358, 358}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25760Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f25761OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25762OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25763OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25764OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j, long j2, int i, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f25762OoooO0 = j;
            this.f25764OoooO0O = j2;
            this.f25761OoooO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f25762OoooO0, this.f25764OoooO0O, this.f25761OoooO, continuation);
            oooOO1.f25763OoooO00 = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25760Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25763OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25763OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25762OoooO0;
            long j2 = this.f25764OoooO0O;
            int i2 = this.f25761OoooO;
            this.f25763OoooO00 = liveDataScope;
            this.f25760Oooo = 1;
            obj = o000o0oo2.OooO0o0(j, j2, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25763OoooO00 = null;
            this.f25760Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$commentParentCommentInfo$1", f = "MomentVM.kt", i = {}, l = {413, 413}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<PostCommentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25765Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25766OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25767OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(long j, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f25766OoooO0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f25766OoooO0, continuation);
            oooOO0O.f25767OoooO00 = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<PostCommentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25765Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25767OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25767OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25766OoooO0;
            this.f25767OoooO00 = liveDataScope;
            this.f25765Oooo = 1;
            obj = o000o0oo2.OooO0o(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25767OoooO00 = null;
            this.f25765Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$commentSendProp$1", f = "MomentVM.kt", i = {}, l = {79, 79}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RewardCommentResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25768Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25769OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25770OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ String f25771OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(String str, String str2, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f25769OoooO0 = str;
            this.f25771OoooO0O = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO oooOOO = new OooOOO(this.f25769OoooO0, this.f25771OoooO0O, continuation);
            oooOOO.f25770OoooO00 = obj;
            return oooOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RewardCommentResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25768Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25770OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25770OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            String str = this.f25769OoooO0;
            String str2 = this.f25771OoooO0O;
            this.f25770OoooO00 = liveDataScope;
            this.f25768Oooo = 1;
            obj = o000o0oo2.OooO0oo(str, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25770OoooO00 = null;
            this.f25768Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$commentPraise$1", f = "MomentVM.kt", i = {}, l = {114, 114}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<PraiseCommentResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25772Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25773OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25774OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f25775OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(String str, int i, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f25773OoooO0 = str;
            this.f25775OoooO0O = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO0 oooOOO0 = new OooOOO0(this.f25773OoooO0, this.f25775OoooO0O, continuation);
            oooOOO0.f25774OoooO00 = obj;
            return oooOOO0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<PraiseCommentResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25772Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25774OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25774OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            String str = this.f25773OoooO0;
            int i2 = this.f25775OoooO0O;
            this.f25774OoooO00 = liveDataScope;
            this.f25772Oooo = 1;
            obj = o000o0oo2.OooO0oO(str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25774OoooO00 = null;
            this.f25772Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$commentWrite$1", f = "MomentVM.kt", i = {}, l = {421, 421}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25776Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f25777OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25778OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25779OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ String f25780OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ String f25781OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ String f25782o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(String str, String str2, String str3, String str4, String str5, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f25778OoooO0 = str;
            this.f25780OoooO0O = str2;
            this.f25777OoooO = str3;
            this.f25781OoooOO0 = str4;
            this.f25782o000oOoO = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOOO oooOOOO = new OooOOOO(this.f25778OoooO0, this.f25780OoooO0O, this.f25777OoooO, this.f25781OoooOO0, this.f25782o000oOoO, continuation);
            oooOOOO.f25779OoooO00 = obj;
            return oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25776Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25779OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25779OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            String str = this.f25778OoooO0;
            String str2 = this.f25780OoooO0O;
            String str3 = this.f25777OoooO;
            String str4 = this.f25781OoooOO0;
            String str5 = this.f25782o000oOoO;
            this.f25779OoooO00 = liveDataScope;
            this.f25776Oooo = 1;
            obj = o000o0oo2.OooO(str, str2, str3, str4, str5, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25779OoooO00 = null;
            this.f25776Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$getCommentInfo$1", f = "MomentVM.kt", i = {}, l = {456, 456}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<ReportCommentDetailModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25783Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25784OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25785OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(long j, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f25784OoooO0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOo oooOo = new OooOo(this.f25784OoooO0, continuation);
            oooOo.f25785OoooO00 = obj;
            return oooOo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<ReportCommentDetailModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25783Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25785OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25785OoooO00;
            o000O00 o000o01 = o000O00.f42437OooO00o;
            long j = this.f25784OoooO0;
            this.f25785OoooO00 = liveDataScope;
            this.f25783Oooo = 1;
            obj = o000o01.OooO00o(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25785OoooO00 = null;
            this.f25783Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$delMoment$1", f = "MomentVM.kt", i = {}, l = {375, 375}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25786Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25787OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25788OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(long j, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f25787OoooO0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOo00 oooOo00 = new OooOo00(this.f25787OoooO0, continuation);
            oooOo00.f25788OoooO00 = obj;
            return oooOo00;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25786Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25788OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25788OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25787OoooO0;
            this.f25788OoooO00 = liveDataScope;
            this.f25786Oooo = 1;
            obj = o000o0oo2.OooOO0(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25788OoooO00 = null;
            this.f25786Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$getPollInfo$1", f = "MomentVM.kt", i = {}, l = {406, 406}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentPoll>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25789Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25790OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25791OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(long j, Continuation<? super Oooo0> continuation) {
            super(2, continuation);
            this.f25790OoooO0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Oooo0 oooo0 = new Oooo0(this.f25790OoooO0, continuation);
            oooo0.f25791OoooO00 = obj;
            return oooo0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentPoll>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((Oooo0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25789Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25791OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25791OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25790OoooO0;
            this.f25791OoooO00 = liveDataScope;
            this.f25789Oooo = 1;
            obj = o000o0oo2.OooOO0o(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25791OoooO00 = null;
            this.f25789Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$getPollConfig$1", f = "MomentVM.kt", i = {}, l = {399, 399}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<PollConfig>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25792Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25793OoooO00;

        public Oooo000(Continuation<? super Oooo000> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Oooo000 oooo000 = new Oooo000(continuation);
            oooo000.f25793OoooO00 = obj;
            return oooo000;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<PollConfig>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((Oooo000) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25792Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25793OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25793OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            this.f25793OoooO00 = liveDataScope;
            this.f25792Oooo = 1;
            obj = o000o0oo2.OooOO0O(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25793OoooO00 = null;
            this.f25792Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$topicMomentListHot$1", f = "MomentVM.kt", i = {}, l = {163, 163}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25794Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f25795OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25796OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25797OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25798OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000(long j, long j2, int i, Continuation<? super o000> continuation) {
            super(2, continuation);
            this.f25796OoooO0 = j;
            this.f25798OoooO0O = j2;
            this.f25795OoooO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o000 o000Var = new o000(this.f25796OoooO0, this.f25798OoooO0O, this.f25795OoooO, continuation);
            o000Var.f25797OoooO00 = obj;
            return o000Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o000) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25794Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25797OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25797OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25796OoooO0;
            long j2 = this.f25798OoooO0O;
            int i2 = this.f25795OoooO;
            this.f25797OoooO00 = liveDataScope;
            this.f25794Oooo = 1;
            obj = o000o0oo2.OooOooo(j, 2, j2, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25797OoooO00 = null;
            this.f25794Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$praiseList$1", f = "MomentVM.kt", i = {}, l = {121, 121}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0000 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<PostUserModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25799Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f25800OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25801OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25802OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25803OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000(String str, long j, int i, Continuation<? super o0000> continuation) {
            super(2, continuation);
            this.f25801OoooO0 = str;
            this.f25803OoooO0O = j;
            this.f25800OoooO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0000 o0000Var = new o0000(this.f25801OoooO0, this.f25803OoooO0O, this.f25800OoooO, continuation);
            o0000Var.f25802OoooO00 = obj;
            return o0000Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<PostUserModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0000) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25799Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25802OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25802OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            String str = this.f25801OoooO0;
            long j = this.f25803OoooO0O;
            int i2 = this.f25800OoooO;
            this.f25802OoooO00 = liveDataScope;
            this.f25799Oooo = 1;
            obj = o000o0oo2.OooOoOO(str, j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25802OoooO00 = null;
            this.f25799Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentRecommendUserList$1", f = "MomentVM.kt", i = {0}, l = {184, 188}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class o00000 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<RecommendNewPostModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25804Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25806OoooO00;

        public o00000(Continuation<? super o00000> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00000 o00000Var = MomentVM.this.new o00000(continuation);
            o00000Var.f25806OoooO00 = obj;
            return o00000Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<RecommendNewPostModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00000) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25804Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25806OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25806OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            this.f25806OoooO00 = liveDataScope;
            this.f25804Oooo = 1;
            obj = o000o0oo2.OooOo0(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            List list = (List) apiResult.getData();
            if (list != null) {
                MomentVM.checkUnreadPost$default(MomentVM.this, list, false, 2, null);
            }
            this.f25806OoooO00 = null;
            this.f25804Oooo = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentPollCancel$1", f = "MomentVM.kt", i = {}, l = {343, 343}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000000 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentPoll>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25807Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25808OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25809OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25810OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(long j, long j2, Continuation<? super o000000> continuation) {
            super(2, continuation);
            this.f25808OoooO0 = j;
            this.f25810OoooO0O = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o000000 o000000Var = new o000000(this.f25808OoooO0, this.f25810OoooO0O, continuation);
            o000000Var.f25809OoooO00 = obj;
            return o000000Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentPoll>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o000000) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25807Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25809OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25809OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25808OoooO0;
            long j2 = this.f25810OoooO0O;
            this.f25809OoooO00 = liveDataScope;
            this.f25807Oooo = 1;
            obj = o000o0oo2.OooOOoo(0, j, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25809OoooO00 = null;
            this.f25807Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentRecommendList$1", f = "MomentVM.kt", i = {}, l = {142, 142}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000000O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25811Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25812OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25813OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f25814OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(long j, int i, Continuation<? super o000000O> continuation) {
            super(2, continuation);
            this.f25812OoooO0 = j;
            this.f25814OoooO0O = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o000000O o000000o2 = new o000000O(this.f25812OoooO0, this.f25814OoooO0O, continuation);
            o000000o2.f25813OoooO00 = obj;
            return o000000o2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o000000O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25811Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25813OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25813OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25812OoooO0;
            int i2 = this.f25814OoooO0O;
            this.f25813OoooO00 = liveDataScope;
            this.f25811Oooo = 1;
            obj = o000o0oo2.OooOo00(j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25813OoooO00 = null;
            this.f25811Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentSend$1", f = "MomentVM.kt", i = {}, l = {329, 329}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentSendResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25815Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f25816OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25817OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O(MomentSendModel momentSendModel, Continuation<? super o00000O> continuation) {
            super(2, continuation);
            this.f25816OoooO0 = momentSendModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00000O o00000o = new o00000O(this.f25816OoooO0, continuation);
            o00000o.f25817OoooO00 = obj;
            return o00000o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentSendResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00000O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25815Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25817OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25817OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            MomentSendModel momentSendModel = this.f25816OoooO0;
            this.f25817OoooO00 = liveDataScope;
            this.f25815Oooo = 1;
            obj = o000o0oo2.OooOo0o(momentSendModel, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25817OoooO00 = null;
            this.f25815Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentRoomGetServerIP$1", f = "MomentVM.kt", i = {}, l = {315, 315}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentBarGetServerIpModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25818Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25819OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25820OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(String str, Continuation<? super o00000O0> continuation) {
            super(2, continuation);
            this.f25819OoooO0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00000O0 o00000o1 = new o00000O0(this.f25819OoooO0, continuation);
            o00000o1.f25820OoooO00 = obj;
            return o00000o1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentBarGetServerIpModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00000O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25818Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25820OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25820OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            String str = this.f25819OoooO0;
            this.f25820OoooO00 = liveDataScope;
            this.f25818Oooo = 1;
            obj = o000o0oo2.OooOo0O(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25820OoooO00 = null;
            this.f25818Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentsDurationAdd$1", f = "MomentVM.kt", i = {}, l = {222, 222}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25821Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25822OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25823OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000OO(long j, Continuation<? super o00000OO> continuation) {
            super(2, continuation);
            this.f25822OoooO0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00000OO o00000oo2 = new o00000OO(this.f25822OoooO0, continuation);
            o00000oo2.f25823OoooO00 = obj;
            return o00000oo2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00000OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25821Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25823OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25823OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25822OoooO0;
            this.f25823OoooO00 = liveDataScope;
            this.f25821Oooo = 1;
            obj = o000o0oo2.OooOoO0(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25823OoooO00 = null;
            this.f25821Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$statisticalTime$1", f = "MomentVM.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25824Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f25825OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000O(long j, Continuation<? super o0000O> continuation) {
            super(2, continuation);
            this.f25825OoooO00 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0000O(this.f25825OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25824Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
                long j = this.f25825OoooO00;
                this.f25824Oooo = 1;
                obj = o000o0oo2.OooOoO0(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.android.billingclient.api.o00000O.OooO0O0().OooOOo0(0L);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O0 implements Comparator<RecommendNewPostModel> {
        @Override // java.util.Comparator
        public final int compare(RecommendNewPostModel recommendNewPostModel, RecommendNewPostModel recommendNewPostModel2) {
            RecommendNewPostModel recommendNewPostModel3 = recommendNewPostModel;
            RecommendNewPostModel recommendNewPostModel4 = recommendNewPostModel2;
            if (recommendNewPostModel3 == null || recommendNewPostModel4 == null) {
                return 0;
            }
            if (recommendNewPostModel3.getIsRead() || !recommendNewPostModel4.getIsRead()) {
                if (!recommendNewPostModel3.getIsRead() || recommendNewPostModel4.getIsRead()) {
                    if (recommendNewPostModel3.getIsRead() != recommendNewPostModel4.getIsRead() || recommendNewPostModel3.getMaxDyId() <= recommendNewPostModel4.getMaxDyId()) {
                        if ((recommendNewPostModel3.getIsRead() == recommendNewPostModel4.getIsRead() && recommendNewPostModel3.getMaxDyId() == recommendNewPostModel4.getMaxDyId()) || recommendNewPostModel3.getIsRead() != recommendNewPostModel4.getIsRead() || recommendNewPostModel3.getMaxDyId() >= recommendNewPostModel4.getMaxDyId()) {
                            return 0;
                        }
                    }
                }
                return 1;
            }
            return -1;
        }
    }

    public static final class o0000O00 extends Lambda implements Function0<o00OOOOo.OooO0O0> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final o0000O00 f25826Oooo = new o0000O00();

        public o0000O00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00OOOOo.OooO0O0 invoke() {
            return new o00OOOOo.OooO0O0();
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$squareBarMember$1", f = "MomentVM.kt", i = {}, l = {149, 149}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0000O0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25827Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f25828OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25829OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25830OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25831OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000O0O(String str, long j, int i, Continuation<? super o0000O0O> continuation) {
            super(2, continuation);
            this.f25829OoooO0 = str;
            this.f25831OoooO0O = j;
            this.f25828OoooO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0000O0O o0000o0o2 = new o0000O0O(this.f25829OoooO0, this.f25831OoooO0O, this.f25828OoooO, continuation);
            o0000o0o2.f25830OoooO00 = obj;
            return o0000o0o2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0000O0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25827Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25830OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25830OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            String str = this.f25829OoooO0;
            long j = this.f25831OoooO0O;
            int i2 = this.f25828OoooO;
            this.f25830OoooO00 = liveDataScope;
            this.f25827Oooo = 1;
            obj = o000o0oo2.OooOoo(str, j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25830OoooO00 = null;
            this.f25827Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$topInsForUserPost$1", f = "MomentVM.kt", i = {}, l = {392, 392}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0000OO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25832Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25833OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25834OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f25835OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000OO0(long j, int i, Continuation<? super o0000OO0> continuation) {
            super(2, continuation);
            this.f25833OoooO0 = j;
            this.f25835OoooO0O = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0000OO0 o0000oo1 = new o0000OO0(this.f25833OoooO0, this.f25835OoooO0O, continuation);
            o0000oo1.f25834OoooO00 = obj;
            return o0000oo1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0000OO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25832Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25834OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25834OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25833OoooO0;
            int i2 = this.f25835OoooO0O;
            this.f25834OoooO00 = liveDataScope;
            this.f25832Oooo = 1;
            obj = o000o0oo2.OooOooO(j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25834OoooO00 = null;
            this.f25832Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$postPraise$1", f = "MomentVM.kt", i = {}, l = {384, 384}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0000Ooo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<PraisePostResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25836Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25837OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25838OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f25839OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000Ooo(long j, int i, Continuation<? super o0000Ooo> continuation) {
            super(2, continuation);
            this.f25837OoooO0 = j;
            this.f25839OoooO0O = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0000Ooo o0000ooo = new o0000Ooo(this.f25837OoooO0, this.f25839OoooO0O, continuation);
            o0000ooo.f25838OoooO00 = obj;
            return o0000ooo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<PraisePostResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0000Ooo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25836Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25838OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25838OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25837OoooO0;
            int i2 = this.f25839OoooO0O;
            this.f25838OoooO00 = liveDataScope;
            this.f25836Oooo = 1;
            obj = o000o0oo2.OooOoO(j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25838OoooO00 = null;
            this.f25836Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$sendGift$1", f = "MomentVM.kt", i = {}, l = {100, 100}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0000oo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<PostSendGiftModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25840Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f25841OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25842OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25843OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ String f25844OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f25845OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000oo(long j, String str, String str2, int i, Continuation<? super o0000oo> continuation) {
            super(2, continuation);
            this.f25842OoooO0 = j;
            this.f25844OoooO0O = str;
            this.f25841OoooO = str2;
            this.f25845OoooOO0 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0000oo o0000ooVar = new o0000oo(this.f25842OoooO0, this.f25844OoooO0O, this.f25841OoooO, this.f25845OoooOO0, continuation);
            o0000ooVar.f25843OoooO00 = obj;
            return o0000ooVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<PostSendGiftModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0000oo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25840Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25843OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25843OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25842OoooO0;
            String str = this.f25844OoooO0O;
            String str2 = this.f25841OoooO;
            int i2 = this.f25845OoooOO0;
            this.f25843OoooO00 = liveDataScope;
            this.f25840Oooo = 1;
            obj = o000o0oo2.OooOoo0(j, str, str2, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25843OoooO00 = null;
            this.f25840Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$topicMomentListNew$1", f = "MomentVM.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED, Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000O000 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25846Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f25847OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25848OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25849OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25850OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000O000(long j, long j2, int i, Continuation<? super o000O000> continuation) {
            super(2, continuation);
            this.f25848OoooO0 = j;
            this.f25850OoooO0O = j2;
            this.f25847OoooO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o000O000 o000o001 = new o000O000(this.f25848OoooO0, this.f25850OoooO0O, this.f25847OoooO, continuation);
            o000o001.f25849OoooO00 = obj;
            return o000o001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o000O000) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25846Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25849OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25849OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25848OoooO0;
            long j2 = this.f25850OoooO0O;
            int i2 = this.f25847OoooO;
            this.f25849OoooO00 = liveDataScope;
            this.f25846Oooo = 1;
            obj = o000o0oo2.OooOooo(j, 1, j2, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25849OoooO00 = null;
            this.f25846Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$userMomentList$1", f = "MomentVM.kt", i = {0}, l = {257, 273}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class o000O0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25851Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f25852OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25853OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25854OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25855OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f25856OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000O0o(long j, long j2, int i, int i2, Continuation<? super o000O0o> continuation) {
            super(2, continuation);
            this.f25853OoooO0 = j;
            this.f25855OoooO0O = j2;
            this.f25852OoooO = i;
            this.f25856OoooOO0 = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o000O0o o000o0o2 = new o000O0o(this.f25853OoooO0, this.f25855OoooO0O, this.f25852OoooO, this.f25856OoooOO0, continuation);
            o000o0o2.f25854OoooO00 = obj;
            return o000o0o2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o000O0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            MomentDetailModel momentDetailModel;
            MomentDetailModel momentDetailModel2;
            MomentDetailModel momentDetailModel3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25851Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25854OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25854OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25853OoooO0;
            long j2 = this.f25855OoooO0O;
            int i2 = this.f25852OoooO;
            int i3 = this.f25856OoooOO0;
            this.f25854OoooO00 = liveDataScope;
            this.f25851Oooo = 1;
            obj = o000o0oo2.Oooo000(j, j2, i2, i3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && this.f25852OoooO == 1) {
                List list = (List) apiResult.getData();
                if ((list == null || list.isEmpty()) ? false : true) {
                    ReadPostTable readPostTable = new ReadPostTable();
                    long j3 = this.f25853OoooO0;
                    readPostTable.setCid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o)).longValue());
                    readPostTable.setUserId(j3);
                    List list2 = (List) apiResult.getData();
                    long id = 0;
                    readPostTable.setReadPostId((list2 == null || (momentDetailModel3 = (MomentDetailModel) list2.get(0)) == null) ? 0L : momentDetailModel3.getId());
                    List list3 = (List) apiResult.getData();
                    Boolean boolBoxBoolean = (list3 == null || (momentDetailModel2 = (MomentDetailModel) list3.get(0)) == null) ? null : Boxing.boxBoolean(momentDetailModel2.getIsTop());
                    Intrinsics.checkNotNull(boolBoxBoolean);
                    if (boolBoxBoolean.booleanValue()) {
                        List list4 = (List) apiResult.getData();
                        Integer numBoxInt = list4 != null ? Boxing.boxInt(list4.size()) : null;
                        Intrinsics.checkNotNull(numBoxInt);
                        if (numBoxInt.intValue() > 1) {
                            List list5 = (List) apiResult.getData();
                            if (list5 != null && (momentDetailModel = (MomentDetailModel) list5.get(1)) != null) {
                                id = momentDetailModel.getId();
                            }
                            readPostTable.setReadPostId(id);
                        }
                    }
                    p493o0o00O00.OooO0OO.OooO00o().OooOoo0().OooO00o(readPostTable);
                    LiveEventBus.get("POST_READ_NEW").post(Boxing.boxLong(this.f25853OoooO0));
                }
            }
            this.f25854OoooO00 = null;
            this.f25851Oooo = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$startCheckNewPostJob$1", f = "MomentVM.kt", i = {}, l = {208, 209}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25857Oooo;

        public o000OO(Continuation<? super o000OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentVM.this.new o000OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0055  */
        /* JADX WARN: Code duplicated, block: B:28:0x0065  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ApiResult apiResult;
            NewFollowMomentModel newFollowMomentModel;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25857Oooo;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                MomentVM momentVM = MomentVM.this;
                apiResult = (ApiResult) obj;
                if (apiResult.isSuccess()) {
                    newFollowMomentModel = (NewFollowMomentModel) apiResult.getData();
                    z = false;
                    if (newFollowMomentModel != null && newFollowMomentModel.isNew) {
                        z = true;
                    }
                    if (z) {
                        SharedMainMessageManager.INSTANCE.getHaveNewFollowingPost().postValue(Boxing.boxBoolean(true));
                    }
                }
                momentVM.startCheckNewPostJob();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            int i2 = p489o0o000oO.o0ooOOo.OooO0Oo() ? ShopVehicleListModel.VehicleTagType_Vip300 : 30;
            this.f25857Oooo = 1;
            if (DelayKt.delay(((long) i2) * 1000, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            String str = MomentVM.this.newestFollowingPostId;
            this.f25857Oooo = 2;
            obj = o000o0oo2.OooOo(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MomentVM momentVM2 = MomentVM.this;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                newFollowMomentModel = (NewFollowMomentModel) apiResult.getData();
                z = false;
                if (newFollowMomentModel != null) {
                    z = true;
                }
                if (z) {
                    SharedMainMessageManager.INSTANCE.getHaveNewFollowingPost().postValue(Boxing.boxBoolean(true));
                }
            }
            momentVM2.startCheckNewPostJob();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentPoll$1", f = "MomentVM.kt", i = {}, l = {336, 336}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000OOo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentPoll>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25859Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25860OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25861OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25862OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(long j, long j2, Continuation<? super o000OOo> continuation) {
            super(2, continuation);
            this.f25860OoooO0 = j;
            this.f25862OoooO0O = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o000OOo o000ooo2 = new o000OOo(this.f25860OoooO0, this.f25862OoooO0O, continuation);
            o000ooo2.f25861OoooO00 = obj;
            return o000ooo2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentPoll>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o000OOo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25859Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25861OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25861OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25860OoooO0;
            long j2 = this.f25862OoooO0O;
            this.f25861OoooO00 = liveDataScope;
            this.f25859Oooo = 1;
            obj = o000o0oo2.OooOOoo(1, j, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25861OoooO00 = null;
            this.f25859Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final o000oOoO f25863Oooo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            o0O00O0o o0o00o0oOooO0O0 = com.android.billingclient.api.o00000O.OooO0O0();
            Objects.requireNonNull(o0o00o0oOooO0O0);
            return Integer.valueOf(o0o00o0oOooO0O0.OooO00o(String.valueOf(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue()) + "USER_LEAVE_PAGE_MOMENT"));
        }
    }

    public static final class o00O0O extends Lambda implements Function1<Response<ArrayList<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ p497o0o00OOO.Oooo0<ArrayList<TopicInfoModel>> f25865OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(p497o0o00OOO.Oooo0<ArrayList<TopicInfoModel>> oooo0) {
            super(1);
            this.f25865OoooO00 = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getIsSuccess()) {
                MomentVM.this.joinedTopicPageIndex++;
            }
            this.f25865OoooO00.postValue(it);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentChangeImagesUrl$1", f = "MomentVM.kt", i = {}, l = {322, 322}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Oo0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentBarGetServerIpModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25866Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f25867OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25868OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25869OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ String f25870OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ String f25871OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(String str, String str2, String str3, String str4, Continuation<? super o00Oo0> continuation) {
            super(2, continuation);
            this.f25868OoooO0 = str;
            this.f25870OoooO0O = str2;
            this.f25867OoooO = str3;
            this.f25871OoooOO0 = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00Oo0 o00oo1 = new o00Oo0(this.f25868OoooO0, this.f25870OoooO0O, this.f25867OoooO, this.f25871OoooOO0, continuation);
            o00oo1.f25869OoooO00 = obj;
            return o00oo1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentBarGetServerIpModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00Oo0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25866Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25869OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25869OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            String str = this.f25868OoooO0;
            String str2 = this.f25870OoooO0O;
            String str3 = this.f25867OoooO;
            String str4 = this.f25871OoooOO0;
            this.f25869OoooO00 = liveDataScope;
            this.f25866Oooo = 1;
            obj = o000o0oo2.OooOOO0(str, str2, str3, str4, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25869OoooO00 = null;
            this.f25866Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentCommentList$1", f = "MomentVM.kt", i = {}, l = {93, 93}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Ooo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<PostCommentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25872Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ long f25873OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25874OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25875OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f25876OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f25877OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(long j, int i, long j2, int i2, Continuation<? super o00Ooo> continuation) {
            super(2, continuation);
            this.f25874OoooO0 = j;
            this.f25876OoooO0O = i;
            this.f25873OoooO = j2;
            this.f25877OoooOO0 = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00Ooo o00ooo2 = new o00Ooo(this.f25874OoooO0, this.f25876OoooO0O, this.f25873OoooO, this.f25877OoooOO0, continuation);
            o00ooo2.f25875OoooO00 = obj;
            return o00ooo2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<PostCommentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00Ooo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25872Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25875OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25875OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25874OoooO0;
            int i2 = this.f25876OoooO0O;
            long j2 = this.f25873OoooO;
            int i3 = this.f25877OoooOO0;
            this.f25875OoooO00 = liveDataScope;
            this.f25872Oooo = 1;
            obj = o000o0oo2.OooOOO(j, i2, j2, i3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25875OoooO00 = null;
            this.f25872Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentEditBefore$1", f = "MomentVM.kt", i = {}, l = {428, 428}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00oO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentEditBefore>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25878Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25879OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25880OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(long j, Continuation<? super o00oO0o> continuation) {
            super(2, continuation);
            this.f25879OoooO0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00oO0o o00oo0o2 = new o00oO0o(this.f25879OoooO0, continuation);
            o00oo0o2.f25880OoooO00 = obj;
            return o00oo0o2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentEditBefore>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00oO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25878Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25880OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25880OoooO00;
            o000O00 o000o01 = o000O00.f42437OooO00o;
            long j = this.f25879OoooO0;
            this.f25880OoooO00 = liveDataScope;
            this.f25878Oooo = 1;
            obj = o000o01.OooO0O0(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25880OoooO00 = null;
            this.f25878Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentGiftList$1", f = "MomentVM.kt", i = {}, l = {86, 86}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0O0O00 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentGift>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25881Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ long f25882OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f25883OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25884OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25885OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f25886OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(int i, long j, long j2, int i2, Continuation<? super o0O0O00> continuation) {
            super(2, continuation);
            this.f25883OoooO0 = i;
            this.f25885OoooO0O = j;
            this.f25882OoooO = j2;
            this.f25886OoooOO0 = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0O0O00 o0o0o00 = new o0O0O00(this.f25883OoooO0, this.f25885OoooO0O, this.f25882OoooO, this.f25886OoooOO0, continuation);
            o0o0o00.f25884OoooO00 = obj;
            return o0o0o00;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentGift>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0O0O00) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25881Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25884OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25884OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            int i2 = this.f25883OoooO0;
            long j = this.f25885OoooO0O;
            long j2 = this.f25882OoooO;
            int i3 = this.f25886OoooOO0;
            this.f25884OoooO00 = liveDataScope;
            this.f25881Oooo = 1;
            obj = o000o0oo2.OooOOo(i2, j, j2, i3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25884OoooO00 = null;
            this.f25881Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentFeaturedList$1", f = "MomentVM.kt", i = {}, l = {135, 135}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OO00O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25887Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25888OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25889OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f25890OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(long j, int i, Continuation<? super o0OO00O> continuation) {
            super(2, continuation);
            this.f25888OoooO0 = j;
            this.f25890OoooO0O = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0OO00O o0oo00o2 = new o0OO00O(this.f25888OoooO0, this.f25890OoooO0O, continuation);
            o0oo00o2.f25889OoooO00 = obj;
            return o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0OO00O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25887Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25889OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25889OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            long j = this.f25888OoooO0;
            int i2 = this.f25890OoooO0O;
            this.f25889OoooO00 = liveDataScope;
            this.f25887Oooo = 1;
            obj = o000o0oo2.OooOOOo(j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25889OoooO00 = null;
            this.f25887Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentEditPicUpdateSet$1", f = "MomentVM.kt", i = {}, l = {449, 449}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OOO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Boolean>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25891Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f25892OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25893OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25894OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25895OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ String f25896OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ String f25897o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(long j, long j2, String str, String str2, String str3, Continuation<? super o0OOO0o> continuation) {
            super(2, continuation);
            this.f25893OoooO0 = j;
            this.f25895OoooO0O = j2;
            this.f25892OoooO = str;
            this.f25896OoooOO0 = str2;
            this.f25897o000oOoO = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0OOO0o o0ooo0o2 = new o0OOO0o(this.f25893OoooO0, this.f25895OoooO0O, this.f25892OoooO, this.f25896OoooOO0, this.f25897o000oOoO, continuation);
            o0ooo0o2.f25894OoooO00 = obj;
            return o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Boolean>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0OOO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25891Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25894OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25894OoooO00;
            o000O00 o000o01 = o000O00.f42437OooO00o;
            long j = this.f25893OoooO0;
            long j2 = this.f25895OoooO0O;
            String str = this.f25892OoooO;
            String str2 = this.f25896OoooOO0;
            String str3 = this.f25897o000oOoO;
            this.f25894OoooO00 = liveDataScope;
            this.f25891Oooo = 1;
            obj = o000o01.OooO0Oo(j, j2, str, str2, str3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25894OoooO00 = null;
            this.f25891Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentEditSend$1", f = "MomentVM.kt", i = {}, l = {435, 435}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0Oo0oo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentEditResult>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25898Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f25899OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f25900OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25901OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ String f25902OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(MomentSendModel momentSendModel, String str, String str2, Continuation<? super o0Oo0oo> continuation) {
            super(2, continuation);
            this.f25900OoooO0 = momentSendModel;
            this.f25902OoooO0O = str;
            this.f25899OoooO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0Oo0oo o0oo0oo2 = new o0Oo0oo(this.f25900OoooO0, this.f25902OoooO0O, this.f25899OoooO, continuation);
            o0oo0oo2.f25901OoooO00 = obj;
            return o0oo0oo2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentEditResult>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0Oo0oo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25898Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25901OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25901OoooO00;
            o000O00 o000o01 = o000O00.f42437OooO00o;
            MomentSendModel momentSendModel = this.f25900OoooO0;
            String str = this.f25902OoooO0O;
            String str2 = this.f25899OoooO;
            this.f25901OoooO00 = liveDataScope;
            this.f25898Oooo = 1;
            obj = o000o01.OooO0o0(momentSendModel, str, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25901OoooO00 = null;
            this.f25898Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$loadBannerList$1", f = "MomentVM.kt", i = {}, l = {177, 177}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OoOo0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentBannerModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25903Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25904OoooO00;

        public o0OoOo0(Continuation<? super o0OoOo0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0OoOo0 o0oooo1 = new o0OoOo0(continuation);
            o0oooo1.f25904OoooO00 = obj;
            return o0oooo1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentBannerModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0OoOo0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25903Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25904OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25904OoooO00;
            this.f25904OoooO00 = liveDataScope;
            this.f25903Oooo = 1;
            Intrinsics.checkNotNullParameter("/Webservers/Moment/GetBannerList", "<this>");
            String url = o00O00.OooO0OO("/Webservers/Moment/GetBannerList", 6);
            Intrinsics.checkNotNullParameter(url, "url");
            obj = p255o00ooO0O.o0000O0.OooO0OO(new MomentBannerApiRepo$bannerList$$inlined$call$1(new o00O000(url, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25904OoooO00 = null;
            this.f25903Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentEditHistory$1", f = "MomentVM.kt", i = {}, l = {442, 442}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25905Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ long f25906OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25907OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25908OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f25909OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(long j, int i, long j2, Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
            this.f25907OoooO0 = j;
            this.f25909OoooO0O = i;
            this.f25906OoooO = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0ooOOo o0ooooo2 = new o0ooOOo(this.f25907OoooO0, this.f25909OoooO0O, this.f25906OoooO, continuation);
            o0ooooo2.f25908OoooO00 = obj;
            return o0ooooo2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0ooOOo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25905Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25908OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25908OoooO00;
            o000O00 o000o01 = o000O00.f42437OooO00o;
            long j = this.f25907OoooO0;
            int i2 = this.f25909OoooO0O;
            long j2 = this.f25906OoooO;
            this.f25908OoooO00 = liveDataScope;
            this.f25905Oooo = 1;
            obj = o000o01.OooO0OO(j, i2, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25908OoooO00 = null;
            this.f25905Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentDetail$1", f = "MomentVM.kt", i = {}, l = {195, 195}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo000o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentDetailModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25910Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25911OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25912OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f25913OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(String str, int i, Continuation<? super oo000o> continuation) {
            super(2, continuation);
            this.f25911OoooO0 = str;
            this.f25913OoooO0O = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            oo000o oo000oVar = new oo000o(this.f25911OoooO0, this.f25913OoooO0O, continuation);
            oo000oVar.f25912OoooO00 = obj;
            return oo000oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentDetailModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((oo000o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25910Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25912OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25912OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            String str = this.f25911OoooO0;
            int i2 = this.f25913OoooO0O;
            this.f25912OoooO00 = liveDataScope;
            this.f25910Oooo = 1;
            obj = o000o0oo2.OooOOOO(str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25912OoooO00 = null;
            this.f25910Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVM$momentFollowList$1", f = "MomentVM.kt", i = {}, l = {128, 128}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo0o0Oo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25914Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Long f25915OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25916OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f25917OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(Long l, int i, Continuation<? super oo0o0Oo> continuation) {
            super(2, continuation);
            this.f25915OoooO0 = l;
            this.f25917OoooO0O = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            oo0o0Oo oo0o0oo = new oo0o0Oo(this.f25915OoooO0, this.f25917OoooO0O, continuation);
            oo0o0oo.f25916OoooO00 = obj;
            return oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((oo0o0Oo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25914Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25916OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25916OoooO00;
            o000O0Oo o000o0oo2 = o000O0Oo.f42465OooO00o;
            Long l = this.f25915OoooO0;
            int i2 = this.f25917OoooO0O;
            this.f25916OoooO00 = liveDataScope;
            this.f25914Oooo = 1;
            obj = o000o0oo2.OooOOo0(l, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25916OoooO00 = null;
            this.f25914Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public MomentVM() {
        WebPageInfo.OooO00o oooO00o = WebPageInfo.f21232OooooO0;
        this.halfDialogWebPageInfo = o0OOO00.OooO0Oo(WebPageInfo.f21233OooooOO);
        this.searchHistoryRepository = LazyKt.lazy(o0000O00.f25826Oooo);
        this.joinedTopicPageIndex = 1;
        this.lastLeaveMomentPage = LazyKt.lazy(o000oOoO.f25863Oooo);
        this.newestFollowingPostId = "";
    }

    public static /* synthetic */ void checkUnreadPost$default(MomentVM momentVM, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUnreadPost");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        momentVM.checkUnreadPost(list, z);
    }

    public static /* synthetic */ LiveData commentWrite$default(MomentVM momentVM, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if (obj == null) {
            return momentVM.commentWrite(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commentWrite");
    }

    public static /* synthetic */ LiveData momentDetail$default(MomentVM momentVM, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: momentDetail");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return momentVM.momentDetail(str, i);
    }

    private final void sortUnreadPost(List<RecommendNewPostModel> data) {
        Collections.sort(data, new o0000O0());
    }

    public static /* synthetic */ LiveData userMomentList$default(MomentVM momentVM, long j, long j2, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            return momentVM.userMomentList(j, j2, i, (i3 & 8) != 0 ? 0 : i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: userMomentList");
    }

    @NotNull
    public final LiveData<ApiResult<List<Object>>> adAddBlockIns(long adId) {
        return p255o00ooO0O.o0000O0O.OooO00o(new OooO00o(adId, null));
    }

    @NotNull
    public final p497o0o00OOO.Oooo0<TopicCreateCheckModel> checkTopicState() {
        p497o0o00OOO.Oooo0<TopicCreateCheckModel> oooo0 = new p497o0o00OOO.Oooo0<>();
        OooO0O0 listener = new OooO0O0(oooo0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        p154o00Oo0oO.o00000OO.f32235OooO0oo.checkCreateTopicState(new o00O00OO(listener));
        return oooo0;
    }

    public final void checkUnreadPost(@NotNull List<RecommendNewPostModel> data, boolean sort) {
        Intrinsics.checkNotNullParameter(data, "data");
        for (RecommendNewPostModel recommendNewPostModel : data) {
            String strOooO0O0 = kotlin.collections.unsigned.OooO00o.OooO0O0(p500o0o00Oo0.OooOOO.f41235OooO00o);
            boolean z = true;
            if (strOooO0O0.length() == 0) {
                return;
            }
            ReadPostTable readPostTableOooO0O0 = p493o0o00O00.OooO0OO.OooO00o().OooOoo0().OooO0O0(Long.parseLong(strOooO0O0), recommendNewPostModel.getUserId());
            if ((readPostTableOooO0O0 != null ? readPostTableOooO0O0.getReadPostId() : 0L) != recommendNewPostModel.getMaxDyId()) {
                z = false;
            }
            recommendNewPostModel.setRead(z);
        }
        if (sort) {
            sortUnreadPost(data);
        }
    }

    @NotNull
    public final LiveData<ApiResult<CheckUserBlackResultModel>> checkUserBlack(@NotNull String toUserId) {
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        return p255o00ooO0O.o0000O0O.OooO00o(new OooO0OO(toUserId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> circleBlackIns(long circleId, long toUserId, int type) {
        return p255o00ooO0O.o0000O0O.OooO00o(new OooO0o(circleId, toUserId, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> circleDiscoveryDelete(long circleId, long dyId) {
        return p255o00ooO0O.o0000O0O.OooO00o(new OooO(circleId, dyId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> circleDiscoveryTopIns(long circleId, long dyId, int type) {
        return p255o00ooO0O.o0000O0O.OooO00o(new OooOO0(circleId, dyId, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<PostCommentDetailModel>>> commentParentCommentInfo(long commentId) {
        return p255o00ooO0O.o0000O0O.OooO00o(new OooOO0O(commentId, null));
    }

    @NotNull
    public final LiveData<ApiResult<PraiseCommentResultModel>> commentPraise(@NotNull String commentId, int type) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        return p255o00ooO0O.o0000O0O.OooO00o(new OooOOO0(commentId, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<RewardCommentResultModel>> commentSendProp(@NotNull String commentId, @NotNull String toUserId) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        return p255o00ooO0O.o0000O0O.OooO00o(new OooOOO(commentId, toUserId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> commentWrite(@NotNull String momentId, @NotNull String content, @Nullable String commentId, @Nullable String parentUserId, @Nullable String parentUserName) {
        Intrinsics.checkNotNullParameter(momentId, "momentId");
        Intrinsics.checkNotNullParameter(content, "content");
        return p255o00ooO0O.o0000O0O.OooO00o(new OooOOOO(momentId, content, commentId, parentUserId, parentUserName, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> delMoment(long dyId) {
        return p255o00ooO0O.o0000O0O.OooO00o(new OooOo00(dyId, null));
    }

    @NotNull
    public final LiveData<ApiResult<ReportCommentDetailModel>> getCommentInfo(long cid) {
        return p255o00ooO0O.o0000O0O.OooO00o(new OooOo(cid, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final WebPageInfo getHalfDialogWebPageInfo() {
        return (WebPageInfo) this.halfDialogWebPageInfo.getValue();
    }

    public final int getLastLeaveMomentPage() {
        return ((Number) this.lastLeaveMomentPage.getValue()).intValue();
    }

    @NotNull
    public final LiveData<ApiResult<PollConfig>> getPollConfig() {
        return p255o00ooO0O.o0000O0O.OooO00o(new Oooo000(null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentPoll>> getPollInfo(long voteId) {
        return p255o00ooO0O.o0000O0O.OooO00o(new Oooo0(voteId, null));
    }

    @NotNull
    public final o00OOOOo.OooO0O0 getSearchHistoryRepository() {
        return (o00OOOOo.OooO0O0) this.searchHistoryRepository.getValue();
    }

    @NotNull
    public final LiveData<ApiResult<MomentBannerModel>> loadBannerList() {
        return p255o00ooO0O.o0000O0O.OooO00o(new o0OoOo0(null));
    }

    @NotNull
    public final p497o0o00OOO.Oooo0<ArrayList<TopicInfoModel>> loadFollowingTopic(boolean isRefresh) {
        p497o0o00OOO.Oooo0<ArrayList<TopicInfoModel>> oooo0 = new p497o0o00OOO.Oooo0<>();
        if (isRefresh) {
            this.joinedTopicPageIndex = 1;
        }
        int i = this.joinedTopicPageIndex;
        o00O0O listener = new o00O0O(oooo0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        p154o00Oo0oO.o00000OO.f32235OooO0oo.loadJoinTopic(i, new oo0oOO0(listener));
        return oooo0;
    }

    @NotNull
    public final LiveData<ApiResult<MomentBarGetServerIpModel>> momentChangeImagesUrl(@NotNull String dyId, @NotNull String fileName, @NotNull String pNumber, @NotNull String size) {
        Intrinsics.checkNotNullParameter(dyId, "dyId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(pNumber, "pNumber");
        Intrinsics.checkNotNullParameter(size, "size");
        return p255o00ooO0O.o0000O0O.OooO00o(new o00Oo0(dyId, fileName, pNumber, size, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<PostCommentDetailModel>>> momentCommentList(long dyId, int type, long dateSort, int pageIndex) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o00Ooo(dyId, type, dateSort, pageIndex, null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentDetailModel>> momentDetail(@NotNull String dyId, int sourceType) {
        Intrinsics.checkNotNullParameter(dyId, "dyId");
        return p255o00ooO0O.o0000O0O.OooO00o(new oo000o(dyId, sourceType, null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentEditBefore>> momentEditBefore(long momentId) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o00oO0o(momentId, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentDetailModel>>> momentEditHistory(long momentId, int pageIndex, long dateSort) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o0ooOOo(momentId, pageIndex, dateSort, null));
    }

    @NotNull
    public final LiveData<ApiResult<Boolean>> momentEditPicUpdateSet(long momentId, long editId, @NotNull String pNumber, @NotNull String fileName, @NotNull String size) {
        Intrinsics.checkNotNullParameter(pNumber, "pNumber");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(size, "size");
        return p255o00ooO0O.o0000O0O.OooO00o(new o0OOO0o(momentId, editId, pNumber, fileName, size, null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentEditResult>> momentEditSend(@NotNull MomentSendModel moment, @Nullable String pNumber, @Nullable String size) {
        Intrinsics.checkNotNullParameter(moment, "moment");
        return p255o00ooO0O.o0000O0O.OooO00o(new o0Oo0oo(moment, pNumber, size, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentDetailModel>>> momentFeaturedList(long dateSort, int pageIndex) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o0OO00O(dateSort, pageIndex, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentDetailModel>>> momentFollowList(@Nullable Long dateSort, int pageIndex) {
        return p255o00ooO0O.o0000O0O.OooO00o(new oo0o0Oo(dateSort, pageIndex, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentGift>>> momentGiftList(int type, long dyId, long dateSort, int pageIndex) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o0O0O00(type, dyId, dateSort, pageIndex, null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentPoll>> momentPoll(long voteId, long voteOptionId) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o000OOo(voteId, voteOptionId, null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentPoll>> momentPollCancel(long voteId, long voteOptionId) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o000000(voteId, voteOptionId, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentDetailModel>>> momentRecommendList(long dateSort, int pageIndex) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o000000O(dateSort, pageIndex, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<RecommendNewPostModel>>> momentRecommendUserList() {
        return p255o00ooO0O.o0000O0O.OooO00o(new o00000(null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentBarGetServerIpModel>> momentRoomGetServerIP(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        return p255o00ooO0O.o0000O0O.OooO00o(new o00000O0(roomId, null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentSendResultModel>> momentSend(@NotNull MomentSendModel sendPostModel) {
        Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
        return p255o00ooO0O.o0000O0O.OooO00o(new o00000O(sendPostModel, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> momentsDurationAdd(long duration) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o00000OO(duration, null));
    }

    @NotNull
    public final LiveData<ApiResult<PraisePostResultModel>> postPraise(long dyId, int type) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o0000Ooo(dyId, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<PostUserModel>>> praiseList(@NotNull String dyId, long dateSort, int pageIndex) {
        Intrinsics.checkNotNullParameter(dyId, "dyId");
        return p255o00ooO0O.o0000O0O.OooO00o(new o0000(dyId, dateSort, pageIndex, null));
    }

    @NotNull
    public final LiveData<ApiResult<PostSendGiftModel>> sendGift(long dyId, @NotNull String toUserId, @NotNull String propId, int propNum) {
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        Intrinsics.checkNotNullParameter(propId, "propId");
        return p255o00ooO0O.o0000O0O.OooO00o(new o0000oo(dyId, toUserId, propId, propNum, null));
    }

    public final void setHalfDialogWebPageInfo(@NotNull WebPageInfo webPageInfo) {
        Intrinsics.checkNotNullParameter(webPageInfo, "<set-?>");
        this.halfDialogWebPageInfo.setValue(webPageInfo);
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentDetailModel>>> squareBarMember(@NotNull String roomId, long dateSort, int pageIndex) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        return p255o00ooO0O.o0000O0O.OooO00o(new o0000O0O(roomId, dateSort, pageIndex, null));
    }

    public final void startCheckNewPostJob() {
        Job job = this.checkNewPostJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.checkNewPostJob = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o000OO(null), 2, null);
    }

    public final void statisticalTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.statisticalTimeLastTime;
        long j2 = (jCurrentTimeMillis - j) / ((long) 1000);
        if (j == 0) {
            this.statisticalTimeLastTime = jCurrentTimeMillis;
            return;
        }
        if (j2 > 30) {
            j2 = 10;
        }
        this.statisticalTimeLastTime = jCurrentTimeMillis;
        long jOooO0O0 = com.android.billingclient.api.o00000O.OooO0O0().OooO0O0("MOMENT_STATISTICAL_TIME", 0L);
        long j3 = j2 + jOooO0O0;
        if (j3 > 120) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o0000O(jOooO0O0, null), 2, null);
        } else {
            com.android.billingclient.api.o00000O.OooO0O0().OooOOo0(j3);
        }
    }

    @NotNull
    public final LiveData<ApiResult<Object>> topInsForUserPost(long dyId, int type) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o0000OO0(dyId, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentDetailModel>>> topicMomentListHot(long circleId, long dateSort, int pageIndex) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o000(circleId, dateSort, pageIndex, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentDetailModel>>> topicMomentListNew(long circleId, long dateSort, int pageIndex) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o000O000(circleId, dateSort, pageIndex, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentDetailModel>>> userMomentList(long toUserId, long dateSort, int pageIndex, int sourceType) {
        return p255o00ooO0O.o0000O0O.OooO00o(new o000O0o(toUserId, dateSort, pageIndex, sourceType, null));
    }
}
