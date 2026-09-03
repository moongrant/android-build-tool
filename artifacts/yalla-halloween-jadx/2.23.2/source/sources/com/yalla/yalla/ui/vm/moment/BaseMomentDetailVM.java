package com.yalla.yalla.ui.vm.moment;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.db.table.HideContent;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.MomentEditRepo$getCommentInfo$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentEditRepo$momentEditBefore$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository;
import com.yalla.yalla.data.repository.MomentRepository$checkUserBlack$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$circleBlackIns$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$circleDiscoveryDelete$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$circleDiscoveryTopIns$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$commentParentCommentInfo$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$commentPraise$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$commentSendProp$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$delMoment$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$getInRoomState$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$getPollConfig$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$momentDetail$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$momentGiftList$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$momentPoll$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$momentSquareFriendIsNew$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$momentsDurationAdd$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$postPraise$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$sendGift$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$topInsForUserPost$$inlined$call$1;
import com.yalla.yalla.model.CheckUserBlackResultModel;
import com.yalla.yalla.model.NewFollowMomentModel;
import com.yalla.yalla.model.PollConfig;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.ReportCommentDetailModel;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentEditBefore;
import com.yalla.yalla.model.moment.MomentGift;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import com.yalla.yalla.model.moment.MomentPoll;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.model.moment.PostSendGiftModel;
import com.yalla.yalla.model.topic.TopicCreateCheckModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.util.WebPageInfo;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;
import p269o00oooo0.o0O0oo0o;
import p407o0Oo0Oo.o00O0OO0;
import p410o0Oo0Ooo.a4;
import p412o0Oo0o0O.o000O00O;
import p412o0Oo0o0O.o00OOOOo;
import p412o0Oo0o0O.o0O000;
import p424o0OoO0Oo.o00OO000;
import p475o0Ooooo0.o0O00oO0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J'\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00170\u00022\u0006\u0010\u0014\u001a\u00020\u0013J\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J8\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020 J8\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020 J:\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020 J\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u001c0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019J\"\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u001c0\u001b2\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 J0\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00050\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020 J$\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u00102\u001a\u00020 J\u0006\u00105\u001a\u00020\nJ\u001a\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001c0\u001b2\u0006\u00106\u001a\u00020\bJ\u0006\u00109\u001a\u00020\nJ\"\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u001c0\u001b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\bJ\"\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u001c0\u001b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\bJ\"\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001c0\u001b2\u0006\u0010?\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ*\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001c0\u001b2\u0006\u0010?\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 J*\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001c0\u001b2\u0006\u0010?\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010!\u001a\u00020 J\u001a\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\bJ\"\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 J\"\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u001c0F2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 J\"\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 J\u0012\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u001c0\u001bJ \u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001c0\u001b2\u0006\u0010\u0010\u001a\u00020\bJ\u001a\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u001c0\u001b2\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u001c0\u001b2\u0006\u0010N\u001a\u00020\bJ\u001a\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001c0F2\u0006\u0010\u001a\u001a\u00020\bJ\u0016\u0010S\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bJ\u001e\u0010U\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010T\u001a\u00020\bR/\u0010^\u001a\u0004\u0018\u00010V2\b\u0010W\u001a\u0004\u0018\u00010V8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R/\u0010d\u001a\u0004\u0018\u0001032\b\u0010W\u001a\u0004\u0018\u0001038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010Y\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR/\u0010j\u001a\u0004\u0018\u00010\u00062\b\u0010W\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010Y\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR/\u0010p\u001a\u0004\u0018\u00010\b2\b\u0010W\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010Y\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR/\u0010v\u001a\u0004\u0018\u00010\u000e2\b\u0010W\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010Y\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR/\u0010z\u001a\u0004\u0018\u00010\b2\b\u0010W\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bw\u0010Y\u001a\u0004\bx\u0010m\"\u0004\by\u0010oR-\u0010\u0081\u0001\u001a\u00020{2\u0006\u0010W\u001a\u00020{8F@FX\u0086\u008e\u0002¢\u0006\u0013\n\u0004\b|\u0010Y\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R!\u0010\u0087\u0001\u001a\u00030\u0082\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0088\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008d\u0001\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0084\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentVM;", "Lo0OoO0Oo/o00OO000;", "Lcom/yalla/yalla/model/topic/TopicCreateCheckModel;", "checkTopicState", "", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "commentList", "", "momentId", "", "fixCommentHideState", "(Ljava/util/List;Ljava/lang/Long;)V", "", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "replyList", "commentId", "fixReplyHideState", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V", "", "isRefresh", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "Lkotlin/collections/ArrayList;", "loadFollowingTopic", "", "toUserId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/RewardCommentResultModel;", "commentSendProp", "dyId", "", "type", "dateSort", "pageIndex", "Lcom/yalla/yalla/model/moment/MomentGift;", "momentGiftList", "momentCommentList", "propId", "propNum", "sendPropType", "Lcom/yalla/yalla/model/moment/PostSendGiftModel;", "sendGift", "Lcom/yalla/yalla/model/CheckUserBlackResultModel;", "checkUserBlack", "Lcom/yalla/yalla/model/PraiseCommentResultModel;", "commentPraise", "Lcom/yalla/yalla/model/PostUserModel;", "praiseList", "sourceType", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "momentDetail", "startCheckNewPostJob", "duration", "", "momentsDurationAdd", "statisticalTime", "voteId", "voteOptionId", "Lcom/yalla/yalla/model/moment/MomentPoll;", "momentPoll", "momentPollCancel", "circleId", "circleDiscoveryDelete", "circleDiscoveryTopIns", "circleBlackIns", "delMoment", "Lcom/yalla/yalla/model/PraisePostResultModel;", "postPraise", "Lkotlinx/coroutines/flow/SharedFlow;", "praisePost", "topInsForUserPost", "Lcom/yalla/yalla/model/PollConfig;", "getPollConfig", "commentParentCommentInfo", "Lcom/yalla/yalla/model/moment/MomentEditBefore;", "momentEditBefore", "cid", "Lcom/yalla/yalla/model/ReportCommentDetailModel;", "getCommentInfo", "Lcom/yalla/yalla/model/moment/MomentInRoomStateModel;", "getInRoomState", "hideComment", "replyId", "hideReply", "Lcom/yalla/yalla/data/db/table/UserInfo;", "<set-?>", "replyUserInfo$delegate", "Landroidx/compose/runtime/MutableState;", "getReplyUserInfo", "()Lcom/yalla/yalla/data/db/table/UserInfo;", "setReplyUserInfo", "(Lcom/yalla/yalla/data/db/table/UserInfo;)V", "replyUserInfo", "currentMomentDetail$delegate", "getCurrentMomentDetail", "()Lcom/yalla/yalla/model/moment/MomentDetailModel;", "setCurrentMomentDetail", "(Lcom/yalla/yalla/model/moment/MomentDetailModel;)V", "currentMomentDetail", "currentComment$delegate", "getCurrentComment", "()Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "setCurrentComment", "(Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;)V", "currentComment", "currentCommentId$delegate", "getCurrentCommentId", "()Ljava/lang/Long;", "setCurrentCommentId", "(Ljava/lang/Long;)V", "currentCommentId", "currentReply$delegate", "getCurrentReply", "()Lcom/yalla/yalla/model/moment/MomentReplyModel;", "setCurrentReply", "(Lcom/yalla/yalla/model/moment/MomentReplyModel;)V", "currentReply", "currentReplyId$delegate", "getCurrentReplyId", "setCurrentReplyId", "currentReplyId", "Lcom/yalla/yalla/util/WebPageInfo;", "halfDialogWebPageInfo$delegate", "getHalfDialogWebPageInfo", "()Lcom/yalla/yalla/util/WebPageInfo;", "setHalfDialogWebPageInfo", "(Lcom/yalla/yalla/util/WebPageInfo;)V", "halfDialogWebPageInfo", "Lo0Oo0Ooo/a4;", "searchHistoryRepository$delegate", "Lkotlin/Lazy;", "getSearchHistoryRepository", "()Lo0Oo0Ooo/a4;", "searchHistoryRepository", "joinedTopicPageIndex", "I", "lastLeaveMomentPage$delegate", "getLastLeaveMomentPage", "()I", "lastLeaveMomentPage", "newestFollowingPostId", "Ljava/lang/String;", "Lkotlinx/coroutines/Job;", "checkNewPostJob", "Lkotlinx/coroutines/Job;", "statisticalTimeLastTime", "J", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBaseMomentDetailVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMomentDetailVM.kt\ncom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n81#2:341\n107#2,2:342\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n81#2:350\n107#2,2:351\n81#2:353\n107#2,2:354\n81#2:356\n107#2,2:357\n81#2:359\n107#2,2:360\n1855#3,2:362\n1855#3,2:364\n*S KotlinDebug\n*F\n+ 1 BaseMomentDetailVM.kt\ncom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM\n*L\n36#1:341\n36#1:342,2\n37#1:344\n37#1:345,2\n39#1:347\n39#1:348,2\n40#1:350\n40#1:351,2\n42#1:353\n42#1:354,2\n43#1:356\n43#1:357,2\n45#1:359\n45#1:360,2\n66#1:362,2\n85#1:364,2\n*E\n"})
public class BaseMomentDetailVM extends BaseMomentVM {
    public static final int $stable = 8;

    @Nullable
    private Job checkNewPostJob;

    /* JADX INFO: renamed from: halfDialogWebPageInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState halfDialogWebPageInfo;
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

    /* JADX INFO: renamed from: replyUserInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState replyUserInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: currentMomentDetail$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentMomentDetail = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: currentComment$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentComment = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: currentCommentId$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentCommentId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: currentReply$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentReply = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: currentReplyId$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentReplyId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$circleDiscoveryTopIns$1", f = "BaseMomentDetailVM.kt", i = {}, l = {246, 246}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31485OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31486OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31487OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31488OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f31489OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j, long j2, int i, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f31486OooO0o = j;
            this.f31488OooO0oO = j2;
            this.f31489OooO0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f31486OooO0o, this.f31488OooO0oO, this.f31489OooO0oo, continuation);
            oooO.f31487OooO0o0 = obj;
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
            int i = this.f31485OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31487OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31487OooO0o0;
            this.f31487OooO0o0 = liveDataScope;
            this.f31485OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Circle/CircleDiscoveryTopIns");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31486OooO0o), "circleid");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31488OooO0oO), "dyid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31489OooO0oo), "type");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$circleDiscoveryTopIns$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31487OooO0o0 = null;
            this.f31485OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Response<TopicCreateCheckModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OO000<TopicCreateCheckModel> f31490OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OO000<TopicCreateCheckModel> o00oo001) {
            super(1);
            this.f31490OooO0Oo = o00oo001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<TopicCreateCheckModel> response) {
            Response<TopicCreateCheckModel> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f31490OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$checkUserBlack$1", f = "BaseMomentDetailVM.kt", i = {}, l = {ZegoConstants.RoomError.SessionError, ZegoConstants.RoomError.SessionError}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<CheckUserBlackResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31491OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31492OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31493OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31492OooO0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f31492OooO0o, continuation);
            oooO0O0.f31493OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<CheckUserBlackResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31491OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31493OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31493OooO0o0;
            this.f31493OooO0o0 = liveDataScope;
            this.f31491OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/CheckUserBlack");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(this.f31492OooO0o, "touserid");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$checkUserBlack$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31493OooO0o0 = null;
            this.f31491OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$circleBlackIns$1", f = "BaseMomentDetailVM.kt", i = {}, l = {255, 255}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31494OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31495OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31496OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31497OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f31498OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, long j2, int i, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31495OooO0o = j;
            this.f31497OooO0oO = j2;
            this.f31498OooO0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f31495OooO0o, this.f31497OooO0oO, this.f31498OooO0oo, continuation);
            oooO0OO.f31496OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31494OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31496OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31496OooO0o0;
            this.f31496OooO0o0 = liveDataScope;
            this.f31494OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Circle/CircleBlackIns");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31495OooO0o), "circleid");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31497OooO0oO), "touserid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31498OooO0oo), "type");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$circleBlackIns$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31496OooO0o0 = null;
            this.f31494OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$circleDiscoveryDelete$1", f = "BaseMomentDetailVM.kt", i = {}, l = {238, 238}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31499OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31500OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31501OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31502OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, long j2, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31500OooO0o = j;
            this.f31502OooO0oO = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f31500OooO0o, this.f31502OooO0oO, continuation);
            oooO0o.f31501OooO0o0 = obj;
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
            int i = this.f31499OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31501OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31501OooO0o0;
            this.f31501OooO0o0 = liveDataScope;
            this.f31499OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Circle/CircleDiscoveryDelete");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31500OooO0o), "circleid");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31502OooO0oO), "dyid");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$circleDiscoveryDelete$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31501OooO0o0 = null;
            this.f31499OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$commentParentCommentInfo$1", f = "BaseMomentDetailVM.kt", i = {}, l = {303, 303}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentCommentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31503OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31504OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31505OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f31504OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f31504OooO0o, continuation);
            oooOO1.f31505OooO0o0 = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentCommentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31503OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31505OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31505OooO0o0;
            this.f31505OooO0o0 = liveDataScope;
            this.f31503OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Comment/CommentSltPcid");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31504OooO0o), "cid");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$commentParentCommentInfo$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31505OooO0o0 = null;
            this.f31503OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$commentPraise$1", f = "BaseMomentDetailVM.kt", i = {}, l = {148, 148}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<PraiseCommentResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31506OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31507OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31508OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31509OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i, String str, Continuation continuation) {
            super(2, continuation);
            this.f31507OooO0o = str;
            this.f31509OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f31509OooO0oO, this.f31507OooO0o, continuation);
            oooOO0O.f31508OooO0o0 = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<PraiseCommentResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31506OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31508OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31508OooO0o0;
            this.f31508OooO0o0 = liveDataScope;
            this.f31506OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Comment/Praise");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(this.f31507OooO0o, "commentId");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31509OooO0oO), "type");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$commentPraise$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31508OooO0o0 = null;
            this.f31506OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$delMoment$1", f = "BaseMomentDetailVM.kt", i = {}, l = {263, 263}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31510OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31511OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31512OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(long j, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f31511OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO oooOOO = new OooOOO(this.f31511OooO0o, continuation);
            oooOOO.f31512OooO0o0 = obj;
            return oooOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31510OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31512OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31512OooO0o0;
            this.f31512OooO0o0 = liveDataScope;
            this.f31510OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/Del");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31511OooO0o), "dyid");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$delMoment$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31512OooO0o0 = null;
            this.f31510OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$commentSendProp$1", f = "BaseMomentDetailVM.kt", i = {}, l = {113, 113}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RewardCommentResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31513OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31514OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31515OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31516OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(String str, String str2, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f31514OooO0o = str;
            this.f31516OooO0oO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO0 oooOOO0 = new OooOOO0(this.f31514OooO0o, this.f31516OooO0oO, continuation);
            oooOOO0.f31515OooO0o0 = obj;
            return oooOOO0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RewardCommentResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31513OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31515OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31515OooO0o0;
            this.f31515OooO0o0 = liveDataScope;
            this.f31513OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Comment/CommentSendProp");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(this.f31514OooO0o, "commentid");
            o0oooooOooO00o.OooO0O0(this.f31516OooO0oO, "touserid");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$commentSendProp$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31515OooO0o0 = null;
            this.f31513OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$getCommentInfo$1", f = "BaseMomentDetailVM.kt", i = {}, l = {317, 317}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<ReportCommentDetailModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31517OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31518OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31519OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(long j, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f31518OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOOO oooOOOO = new OooOOOO(this.f31518OooO0o, continuation);
            oooOOOO.f31519OooO0o0 = obj;
            return oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<ReportCommentDetailModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31517OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31519OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31519OooO0o0;
            this.f31519OooO0o0 = liveDataScope;
            this.f31517OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Comment/GetInfo");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31518OooO0o), "cid");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentEditRepo$getCommentInfo$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31519OooO0o0 = null;
            this.f31517OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$getPollConfig$1", f = "BaseMomentDetailVM.kt", i = {}, l = {296, 296}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<PollConfig>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31520OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31521OooO0o0;

        public OooOo(Continuation<? super OooOo> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOo oooOo = new OooOo(continuation);
            oooOo.f31521OooO0o0 = obj;
            return oooOo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<PollConfig>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31520OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31521OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31521OooO0o0;
            this.f31521OooO0o0 = liveDataScope;
            this.f31520OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/GetVoteConfig");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$getPollConfig$$inlined$call$1(p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31521OooO0o0 = null;
            this.f31520OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$getInRoomState$1", f = "BaseMomentDetailVM.kt", i = {}, l = {321, 321}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<MomentInRoomStateModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31522OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31523OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31524OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(long j, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f31523OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOo00 oooOo00 = new OooOo00(this.f31523OooO0o, continuation);
            oooOo00.f31524OooO0o0 = obj;
            return oooOo00;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ApiResult<MomentInRoomStateModel>> flowCollector, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31522OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f31524OooO0o0;
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
            flowCollector = (FlowCollector) this.f31524OooO0o0;
            this.f31524OooO0o0 = flowCollector;
            this.f31522OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/video/getinroom");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31523OooO0o), "touserid");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$getInRoomState$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31524OooO0o0 = null;
            this.f31522OooO0Oo = 2;
            if (flowCollector.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$hideReply$1", f = "BaseMomentDetailVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f31525OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31526OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f31527OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(long j, long j2, long j3, Continuation<? super Oooo0> continuation) {
            super(2, continuation);
            this.f31525OooO0Oo = j;
            this.f31527OooO0o0 = j2;
            this.f31526OooO0o = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo0(this.f31525OooO0Oo, this.f31527OooO0o0, this.f31526OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            HideContent hideContent = new HideContent();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            hideContent.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
            hideContent.setType(2);
            hideContent.setContentId(this.f31525OooO0Oo + "-" + this.f31527OooO0o0 + "-" + this.f31526OooO0o);
            p408o0Oo0Oo0.o00Oo0.OooO00o().OooOo0o().OooO00o(hideContent);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$hideComment$1", f = "BaseMomentDetailVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f31528OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f31529OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(long j, long j2, Continuation<? super Oooo000> continuation) {
            super(2, continuation);
            this.f31528OooO0Oo = j;
            this.f31529OooO0o0 = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo000(this.f31528OooO0Oo, this.f31529OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o000O00O.OooO00o(this.f31528OooO0Oo, this.f31529OooO0o0);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$topInsForUserPost$1", f = "BaseMomentDetailVM.kt", i = {}, l = {289, 289}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31530OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31531OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31532OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31533OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(long j, int i, Continuation<? super o00000> continuation) {
            super(2, continuation);
            this.f31531OooO0o = j;
            this.f31533OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00000 o00000Var = new o00000(this.f31531OooO0o, this.f31533OooO0oO, continuation);
            o00000Var.f31532OooO0o0 = obj;
            return o00000Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00000) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31530OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31532OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31532OooO0o0;
            this.f31532OooO0o0 = liveDataScope;
            this.f31530OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/DiscoveryTopIns");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31531OooO0o), "dyid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31533OooO0oO), "type");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$topInsForUserPost$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31532OooO0o0 = null;
            this.f31530OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$startCheckNewPostJob$1", f = "BaseMomentDetailVM.kt", i = {}, l = {175, 176}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31534OooO0Oo;

        public o000000(Continuation<? super o000000> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BaseMomentDetailVM.this.new o000000(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:28:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ApiResult apiResult;
            NewFollowMomentModel newFollowMomentModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31534OooO0Oo;
            BaseMomentDetailVM baseMomentDetailVM = BaseMomentDetailVM.this;
            boolean z = false;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult.isSuccess()) {
                    newFollowMomentModel = (NewFollowMomentModel) apiResult.getData();
                    if (newFollowMomentModel != null && newFollowMomentModel.isNew) {
                        z = true;
                    }
                    if (z) {
                        SharedMainMessageManager.INSTANCE.getHaveNewFollowingPost().postValue(Boxing.boxBoolean(true));
                    }
                }
                baseMomentDetailVM.startCheckNewPostJob();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            int i2 = p386o0OOooO.oo0o0Oo.OooO0o() ? 300 : 30;
            this.f31534OooO0Oo = 1;
            if (DelayKt.delay(((long) i2) * 1000, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            String str = baseMomentDetailVM.newestFollowingPostId;
            this.f31534OooO0Oo = 2;
            String url = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/SquareFriendIsNew");
            Intrinsics.checkNotNullParameter(url, "url");
            p380o0OOoOo.o0ooOOo o0ooooo = new p380o0OOoOo.o0ooOOo(url, 0);
            o0ooooo.OooO0O0(str, "dyid");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$momentSquareFriendIsNew$$inlined$call$1(o0ooooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                newFollowMomentModel = (NewFollowMomentModel) apiResult.getData();
                if (newFollowMomentModel != null) {
                    z = true;
                }
                if (z) {
                    SharedMainMessageManager.INSTANCE.getHaveNewFollowingPost().postValue(Boxing.boxBoolean(true));
                }
            }
            baseMomentDetailVM.startCheckNewPostJob();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$statisticalTime$1", f = "BaseMomentDetailVM.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31536OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f31537OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(long j, Continuation<? super o000000O> continuation) {
            super(2, continuation);
            this.f31537OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000000O(this.f31537OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31536OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31536OooO0Oo = 1;
                String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/MomentsDurationAdd");
                p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31537OooO0o0), "duration");
                obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$momentsDurationAdd$$inlined$call$1(o0oooooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o0O0oo0o.OooO00o().OooO0Oo(0L, "MOMENT_STATISTICAL_TIME");
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$sendGift$1", f = "BaseMomentDetailVM.kt", i = {}, l = {134, 134}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000OOo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<PostSendGiftModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f31538OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31539OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31540OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31541OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31542OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31543OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f31544OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(long j, String str, String str2, int i, int i2, Continuation<? super o000OOo> continuation) {
            super(2, continuation);
            this.f31540OooO0o = j;
            this.f31542OooO0oO = str;
            this.f31543OooO0oo = str2;
            this.f31538OooO = i;
            this.f31544OooOO0 = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o000OOo o000ooo2 = new o000OOo(this.f31540OooO0o, this.f31542OooO0oO, this.f31543OooO0oo, this.f31538OooO, this.f31544OooOO0, continuation);
            o000ooo2.f31541OooO0o0 = obj;
            return o000ooo2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<PostSendGiftModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o000OOo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31539OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31541OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31541OooO0o0;
            this.f31541OooO0o0 = liveDataScope;
            this.f31539OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/SendProp");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
            o0oooooOooO00o.OooO0O0(this.f31542OooO0oO, "touserid");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31540OooO0o), "dyid");
            o0oooooOooO00o.OooO0O0(this.f31543OooO0oo, "propid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31538OooO), "propnum");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31544OooOO0), "sendPropType");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$sendGift$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31541OooO0o0 = null;
            this.f31539OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f31545OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            p477o0o00.OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
            oooO0oOooO00o.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String strConcat = String.valueOf(o0O00oO0.OooOOo0().getValue()).concat("USER_LEAVE_PAGE_MOMENT");
            SharedPreferences sharedPreferences = oooO0oOooO00o.f48377OooO00o;
            return Integer.valueOf(sharedPreferences != null ? sharedPreferences.getInt(strConcat, 0) : 0);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$momentCommentList$1", f = "BaseMomentDetailVM.kt", i = {}, l = {127, 127}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00O0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentCommentDetailModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f31546OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31547OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31548OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31549OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31550OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f31551OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(int i, int i2, long j, long j2, Continuation continuation) {
            super(2, continuation);
            this.f31548OooO0o = j;
            this.f31550OooO0oO = i;
            this.f31551OooO0oo = j2;
            this.f31546OooO = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            long j = this.f31548OooO0o;
            o00O0O o00o0o2 = new o00O0O(this.f31550OooO0oO, this.f31546OooO, j, this.f31551OooO0oo, continuation);
            o00o0o2.f31549OooO0o0 = obj;
            return o00o0o2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentCommentDetailModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00O0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31547OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31549OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31549OooO0o0;
            long j = this.f31548OooO0o;
            int i2 = this.f31550OooO0oO;
            long j2 = this.f31551OooO0oo;
            int i3 = this.f31546OooO;
            this.f31549OooO0o0 = liveDataScope;
            this.f31547OooO0Oo = 1;
            obj = MomentRepository.OooO00o(i2, i3, j, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31549OooO0o0 = null;
            this.f31547OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$momentDetail$1", f = "BaseMomentDetailVM.kt", i = {}, l = {162, 162}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Oo0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentDetailModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31552OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31553OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31554OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31555OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(int i, String str, Continuation continuation) {
            super(2, continuation);
            this.f31553OooO0o = str;
            this.f31555OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00Oo0 o00oo1 = new o00Oo0(this.f31555OooO0oO, this.f31553OooO0o, continuation);
            o00oo1.f31554OooO0o0 = obj;
            return o00oo1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentDetailModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00Oo0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31552OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31554OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31554OooO0o0;
            this.f31554OooO0o0 = liveDataScope;
            this.f31552OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Discovery/SquareSingle");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(this.f31553OooO0o, "dyId");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31555OooO0oO), "sourceType");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$momentDetail$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31554OooO0o0 = null;
            this.f31552OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$momentEditBefore$1", f = "BaseMomentDetailVM.kt", i = {}, l = {310, 310}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Ooo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentEditBefore>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31556OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31557OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31558OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(long j, Continuation<? super o00Ooo> continuation) {
            super(2, continuation);
            this.f31557OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00Ooo o00ooo2 = new o00Ooo(this.f31557OooO0o, continuation);
            o00ooo2.f31558OooO0o0 = obj;
            return o00ooo2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentEditBefore>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00Ooo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31556OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31558OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31558OooO0o0;
            this.f31558OooO0o0 = liveDataScope;
            this.f31556OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Discovery/EditMomentBefore");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31557OooO0o), "dyId");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentEditRepo$momentEditBefore$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31558OooO0o0 = null;
            this.f31556OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$momentPoll$1", f = "BaseMomentDetailVM.kt", i = {}, l = {224, 224}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00oO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentPoll>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31559OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31560OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31561OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31562OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(long j, long j2, Continuation<? super o00oO0o> continuation) {
            super(2, continuation);
            this.f31560OooO0o = j;
            this.f31562OooO0oO = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o00oO0o o00oo0o2 = new o00oO0o(this.f31560OooO0o, this.f31562OooO0oO, continuation);
            o00oo0o2.f31561OooO0o0 = obj;
            return o00oo0o2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentPoll>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o00oO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31559OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31561OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31561OooO0o0;
            this.f31561OooO0o0 = liveDataScope;
            this.f31559OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/Vote");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(1), "type");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31560OooO0o), "voteId");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31562OooO0oO), "voteOptionId");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$momentPoll$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31561OooO0o0 = null;
            this.f31559OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<a4> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0O0O00 f31563OooO0Oo = new o0O0O00();

        public o0O0O00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final a4 invoke() {
            return new a4();
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$praiseList$1", f = "BaseMomentDetailVM.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_NOT_FOUND, Constants.ERR_PUBLISH_STREAM_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OO00O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<PostUserModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31564OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31565OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31566OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31567OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f31568OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(long j, long j2, int i, Continuation<? super o0OO00O> continuation) {
            super(2, continuation);
            this.f31565OooO0o = j;
            this.f31567OooO0oO = j2;
            this.f31568OooO0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0OO00O o0oo00o2 = new o0OO00O(this.f31565OooO0o, this.f31567OooO0oO, this.f31568OooO0oo, continuation);
            o0oo00o2.f31566OooO0o0 = obj;
            return o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<PostUserModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0OO00O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31564OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31566OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31566OooO0o0;
            long j = this.f31565OooO0o;
            long j2 = this.f31567OooO0oO;
            int i2 = this.f31568OooO0oo;
            this.f31566OooO0o0 = liveDataScope;
            this.f31564OooO0Oo = 1;
            obj = MomentRepository.OooO0Oo(j, j2, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31566OooO0o0 = null;
            this.f31564OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$momentsDurationAdd$1", f = "BaseMomentDetailVM.kt", i = {}, l = {189, 189}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OOO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31569OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31570OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31571OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(long j, Continuation<? super o0OOO0o> continuation) {
            super(2, continuation);
            this.f31570OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0OOO0o o0ooo0o2 = new o0OOO0o(this.f31570OooO0o, continuation);
            o0ooo0o2.f31571OooO0o0 = obj;
            return o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0OOO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31569OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31571OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31571OooO0o0;
            this.f31571OooO0o0 = liveDataScope;
            this.f31569OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/MomentsDurationAdd");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31570OooO0o), "duration");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$momentsDurationAdd$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31571OooO0o0 = null;
            this.f31569OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$postPraise$1", f = "BaseMomentDetailVM.kt", i = {}, l = {272, 272}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0Oo0oo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<PraisePostResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31572OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31573OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31574OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31575OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(long j, int i, Continuation<? super o0Oo0oo> continuation) {
            super(2, continuation);
            this.f31573OooO0o = j;
            this.f31575OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0Oo0oo o0oo0oo2 = new o0Oo0oo(this.f31573OooO0o, this.f31575OooO0oO, continuation);
            o0oo0oo2.f31574OooO0o0 = obj;
            return o0oo0oo2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<PraisePostResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0Oo0oo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31572OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31574OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31574OooO0o0;
            this.f31574OooO0o0 = liveDataScope;
            this.f31572OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/Praise");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31573OooO0o), "dyid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31575OooO0oO), "type");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$postPraise$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31574OooO0o0 = null;
            this.f31572OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<Response<ArrayList<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OO000<ArrayList<TopicInfoModel>> f31577OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(o00OO000<ArrayList<TopicInfoModel>> o00oo001) {
            super(1);
            this.f31577OooO0o0 = o00oo001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getIsSuccess()) {
                BaseMomentDetailVM.this.joinedTopicPageIndex++;
            }
            this.f31577OooO0o0.postValue(it);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$momentPollCancel$1", f = "BaseMomentDetailVM.kt", i = {}, l = {231, 231}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MomentPoll>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31578OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31579OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31580OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31581OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(long j, long j2, Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
            this.f31579OooO0o = j;
            this.f31581OooO0oO = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o0ooOOo o0ooooo = new o0ooOOo(this.f31579OooO0o, this.f31581OooO0oO, continuation);
            o0ooooo.f31580OooO0o0 = obj;
            return o0ooooo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MomentPoll>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((o0ooOOo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31578OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31580OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31580OooO0o0;
            this.f31580OooO0o0 = liveDataScope;
            this.f31578OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/Vote");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(0), "type");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31579OooO0o), "voteId");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31581OooO0oO), "voteOptionId");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$momentPoll$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31580OooO0o0 = null;
            this.f31578OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$momentGiftList$1", f = "BaseMomentDetailVM.kt", i = {}, l = {120, 120}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo000o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<MomentGift>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f31582OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31583OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31584OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31585OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31586OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f31587OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(int i, int i2, long j, long j2, Continuation continuation) {
            super(2, continuation);
            this.f31584OooO0o = j;
            this.f31586OooO0oO = i;
            this.f31587OooO0oo = j2;
            this.f31582OooO = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            long j = this.f31584OooO0o;
            oo000o oo000oVar = new oo000o(this.f31586OooO0oO, this.f31582OooO, j, this.f31587OooO0oo, continuation);
            oo000oVar.f31585OooO0o0 = obj;
            return oo000oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<MomentGift>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((oo000o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31583OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31585OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31585OooO0o0;
            this.f31585OooO0o0 = liveDataScope;
            this.f31583OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/DySendPropDetail");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31586OooO0oO), "type");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31584OooO0o), "dyid");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31587OooO0oo), "datesort");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31582OooO), "pageindex");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$momentGiftList$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31585OooO0o0 = null;
            this.f31583OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM$praisePost$1", f = "BaseMomentDetailVM.kt", i = {}, l = {281, 281}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo0o0Oo extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<PraisePostResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31588OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31589OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31590OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31591OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(long j, int i, Continuation<? super oo0o0Oo> continuation) {
            super(2, continuation);
            this.f31589OooO0o = j;
            this.f31591OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            oo0o0Oo oo0o0oo = new oo0o0Oo(this.f31589OooO0o, this.f31591OooO0oO, continuation);
            oo0o0oo.f31590OooO0o0 = obj;
            return oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ApiResult<PraisePostResultModel>> flowCollector, Continuation<? super Unit> continuation) {
            return ((oo0o0Oo) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31588OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f31590OooO0o0;
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
            flowCollector = (FlowCollector) this.f31590OooO0o0;
            this.f31590OooO0o0 = flowCollector;
            this.f31588OooO0Oo = 1;
            String strOooO0Oo = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/Praise");
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31589OooO0o), "dyid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31591OooO0oO), "type");
            obj = com.code.android.util.OooOOO.OooO0Oo(new MomentRepository$postPraise$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31590OooO0o0 = null;
            this.f31588OooO0Oo = 2;
            if (flowCollector.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public BaseMomentDetailVM() {
        WebPageInfo webPageInfo = WebPageInfo.f32279OooOOo;
        this.halfDialogWebPageInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(WebPageInfo.f32279OooOOo, null, 2, null);
        this.searchHistoryRepository = LazyKt.lazy(o0O0O00.f31563OooO0Oo);
        this.joinedTopicPageIndex = 1;
        this.lastLeaveMomentPage = LazyKt.lazy(o000oOoO.f31545OooO0Oo);
        this.newestFollowingPostId = "";
    }

    public static /* synthetic */ LiveData momentDetail$default(BaseMomentDetailVM baseMomentDetailVM, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: momentDetail");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return baseMomentDetailVM.momentDetail(str, i);
    }

    @NotNull
    public final o00OO000<TopicCreateCheckModel> checkTopicState() {
        o00OO000<TopicCreateCheckModel> o00oo001 = new o00OO000<>();
        OooO00o listener = new OooO00o(o00oo001);
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00OOOOo(listener, null), 3, null);
        return o00oo001;
    }

    @NotNull
    public final LiveData<ApiResult<CheckUserBlackResultModel>> checkUserBlack(@NotNull String toUserId) {
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        return com.code.android.util.o00oO0o.OooO00o(new OooO0O0(toUserId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> circleBlackIns(long circleId, long toUserId, int type) {
        return com.code.android.util.o00oO0o.OooO00o(new OooO0OO(circleId, toUserId, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> circleDiscoveryDelete(long circleId, long dyId) {
        return com.code.android.util.o00oO0o.OooO00o(new OooO0o(circleId, dyId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> circleDiscoveryTopIns(long circleId, long dyId, int type) {
        return com.code.android.util.o00oO0o.OooO00o(new OooO(circleId, dyId, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentCommentDetailModel>>> commentParentCommentInfo(long commentId) {
        return com.code.android.util.o00oO0o.OooO00o(new OooOO0(commentId, null));
    }

    @NotNull
    public final LiveData<ApiResult<PraiseCommentResultModel>> commentPraise(@NotNull String commentId, int type) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        return com.code.android.util.o00oO0o.OooO00o(new OooOO0O(type, commentId, null));
    }

    @NotNull
    public final LiveData<ApiResult<RewardCommentResultModel>> commentSendProp(@NotNull String commentId, @NotNull String toUserId) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        return com.code.android.util.o00oO0o.OooO00o(new OooOOO0(commentId, toUserId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> delMoment(long dyId) {
        return com.code.android.util.o00oO0o.OooO00o(new OooOOO(dyId, null));
    }

    public final void fixCommentHideState(@Nullable List<MomentCommentDetailModel> commentList, @Nullable Long momentId) {
        if (momentId != null) {
            momentId.longValue();
            if (commentList != null) {
                for (MomentCommentDetailModel momentCommentDetailModel : commentList) {
                    long jLongValue = momentId.longValue();
                    long id = momentCommentDetailModel.getId();
                    o00O0OO0 o00o0oo0OooOo0o = p408o0Oo0Oo0.o00Oo0.OooO00o().OooOo0o();
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    long jLongValue2 = ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(jLongValue);
                    sb.append("-");
                    sb.append(id);
                    boolean z = o00o0oo0OooOo0o.OooO0O0(1, jLongValue2, sb.toString()) != null;
                    StringBuilder sbOooO00o = o00O0000.OooO00o("HideContentRepo hasComment momentId = ", jLongValue, ", commentId = ");
                    sbOooO00o.append(id);
                    sbOooO00o.append(", hasComment = ");
                    sbOooO00o.append(z);
                    o0000O00.OooO0O0(sbOooO00o.toString());
                    if (z) {
                        momentCommentDetailModel.setHide(true);
                    } else {
                        MomentReplyModel sonFirst = momentCommentDetailModel.getSonFirst();
                        if (sonFirst != null) {
                            long jLongValue3 = momentId.longValue();
                            long id2 = momentCommentDetailModel.getId();
                            long id3 = sonFirst.getId();
                            o00O0OO0 o00o0oo0OooOo0o2 = p408o0Oo0Oo0.o00Oo0.OooO00o().OooOo0o();
                            long jLongValue4 = ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(jLongValue3);
                            sb2.append("-");
                            sb2.append(id2);
                            sb2.append("-");
                            sb2.append(id3);
                            if (o00o0oo0OooOo0o2.OooO0O0(2, jLongValue4, sb2.toString()) != null) {
                                sonFirst.setHide(true);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void fixReplyHideState(@Nullable List<MomentReplyModel> replyList, @Nullable Long momentId, @Nullable Long commentId) {
        if (momentId != null) {
            momentId.longValue();
            if (commentId != null) {
                commentId.longValue();
                if (replyList != null) {
                    for (MomentReplyModel momentReplyModel : replyList) {
                        long jLongValue = momentId.longValue();
                        long jLongValue2 = commentId.longValue();
                        long id = momentReplyModel.getId();
                        o00O0OO0 o00o0oo0OooOo0o = p408o0Oo0Oo0.o00Oo0.OooO00o().OooOo0o();
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        long jLongValue3 = ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue();
                        StringBuilder sb = new StringBuilder();
                        sb.append(jLongValue);
                        sb.append("-");
                        sb.append(jLongValue2);
                        sb.append("-");
                        sb.append(id);
                        boolean z = o00o0oo0OooOo0o.OooO0O0(2, jLongValue3, sb.toString()) != null;
                        o0000O00.OooO0O0("hideReply fix momentId = " + momentId + " commentId = " + commentId + " replyId = " + momentReplyModel.getId() + " hasReply = " + z);
                        if (z) {
                            momentReplyModel.setHide(true);
                        }
                    }
                }
            }
        }
    }

    @NotNull
    public final LiveData<ApiResult<ReportCommentDetailModel>> getCommentInfo(long cid) {
        return com.code.android.util.o00oO0o.OooO00o(new OooOOOO(cid, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final MomentCommentDetailModel getCurrentComment() {
        return (MomentCommentDetailModel) this.currentComment.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Long getCurrentCommentId() {
        return (Long) this.currentCommentId.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final MomentDetailModel getCurrentMomentDetail() {
        return (MomentDetailModel) this.currentMomentDetail.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final MomentReplyModel getCurrentReply() {
        return (MomentReplyModel) this.currentReply.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Long getCurrentReplyId() {
        return (Long) this.currentReplyId.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final WebPageInfo getHalfDialogWebPageInfo() {
        return (WebPageInfo) this.halfDialogWebPageInfo.getValue();
    }

    @NotNull
    public final SharedFlow<ApiResult<MomentInRoomStateModel>> getInRoomState(long toUserId) {
        return com.code.android.util.o000oOoO.OooO00o(this, new OooOo00(toUserId, null));
    }

    public final int getLastLeaveMomentPage() {
        return ((Number) this.lastLeaveMomentPage.getValue()).intValue();
    }

    @NotNull
    public final LiveData<ApiResult<PollConfig>> getPollConfig() {
        return com.code.android.util.o00oO0o.OooO00o(new OooOo(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final UserInfo getReplyUserInfo() {
        return (UserInfo) this.replyUserInfo.getValue();
    }

    @NotNull
    public final a4 getSearchHistoryRepository() {
        return (a4) this.searchHistoryRepository.getValue();
    }

    public final void hideComment(long momentId, long commentId) {
        com.code.android.util.OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new Oooo000(momentId, commentId, null));
    }

    public final void hideReply(long momentId, long commentId, long replyId) {
        StringBuilder sbOooO00o = o00O0000.OooO00o("hideReply momentId = ", momentId, " commentId = ");
        sbOooO00o.append(commentId);
        sbOooO00o.append(" replyId = ");
        sbOooO00o.append(replyId);
        sbOooO00o.append(com.zego.zegoavkit2.ZegoConstants.ZegoVideoDataAuxPublishingStream);
        o0000O00.OooO0O0(sbOooO00o.toString());
        com.code.android.util.OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new Oooo0(momentId, commentId, replyId, null));
    }

    @NotNull
    public final o00OO000<ArrayList<TopicInfoModel>> loadFollowingTopic(boolean isRefresh) {
        o00OO000<ArrayList<TopicInfoModel>> o00oo001 = new o00OO000<>();
        if (isRefresh) {
            this.joinedTopicPageIndex = 1;
        }
        int i = this.joinedTopicPageIndex;
        o0OoOo0 listener = new o0OoOo0(o00oo001);
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O000(i, listener, null), 3, null);
        return o00oo001;
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentCommentDetailModel>>> momentCommentList(long dyId, int type, long dateSort, int pageIndex) {
        return com.code.android.util.o00oO0o.OooO00o(new o00O0O(type, pageIndex, dyId, dateSort, null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentDetailModel>> momentDetail(@NotNull String dyId, int sourceType) {
        Intrinsics.checkNotNullParameter(dyId, "dyId");
        return com.code.android.util.o00oO0o.OooO00o(new o00Oo0(sourceType, dyId, null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentEditBefore>> momentEditBefore(long momentId) {
        return com.code.android.util.o00oO0o.OooO00o(new o00Ooo(momentId, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MomentGift>>> momentGiftList(long dyId, int type, long dateSort, int pageIndex) {
        return com.code.android.util.o00oO0o.OooO00o(new oo000o(type, pageIndex, dyId, dateSort, null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentPoll>> momentPoll(long voteId, long voteOptionId) {
        return com.code.android.util.o00oO0o.OooO00o(new o00oO0o(voteId, voteOptionId, null));
    }

    @NotNull
    public final LiveData<ApiResult<MomentPoll>> momentPollCancel(long voteId, long voteOptionId) {
        return com.code.android.util.o00oO0o.OooO00o(new o0ooOOo(voteId, voteOptionId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> momentsDurationAdd(long duration) {
        return com.code.android.util.o00oO0o.OooO00o(new o0OOO0o(duration, null));
    }

    @NotNull
    public final LiveData<ApiResult<PraisePostResultModel>> postPraise(long dyId, int type) {
        return com.code.android.util.o00oO0o.OooO00o(new o0Oo0oo(dyId, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<PostUserModel>>> praiseList(long dyId, long dateSort, int pageIndex) {
        return com.code.android.util.o00oO0o.OooO00o(new o0OO00O(dyId, dateSort, pageIndex, null));
    }

    @NotNull
    public final SharedFlow<ApiResult<PraisePostResultModel>> praisePost(long dyId, int type) {
        return com.code.android.util.o000oOoO.OooO00o(this, new oo0o0Oo(dyId, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<PostSendGiftModel>> sendGift(long dyId, @NotNull String toUserId, @NotNull String propId, int propNum, int sendPropType) {
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        Intrinsics.checkNotNullParameter(propId, "propId");
        return com.code.android.util.o00oO0o.OooO00o(new o000OOo(dyId, toUserId, propId, propNum, sendPropType, null));
    }

    public final void setCurrentComment(@Nullable MomentCommentDetailModel momentCommentDetailModel) {
        this.currentComment.setValue(momentCommentDetailModel);
    }

    public final void setCurrentCommentId(@Nullable Long l) {
        this.currentCommentId.setValue(l);
    }

    public final void setCurrentMomentDetail(@Nullable MomentDetailModel momentDetailModel) {
        this.currentMomentDetail.setValue(momentDetailModel);
    }

    public final void setCurrentReply(@Nullable MomentReplyModel momentReplyModel) {
        this.currentReply.setValue(momentReplyModel);
    }

    public final void setCurrentReplyId(@Nullable Long l) {
        this.currentReplyId.setValue(l);
    }

    public final void setHalfDialogWebPageInfo(@NotNull WebPageInfo webPageInfo) {
        Intrinsics.checkNotNullParameter(webPageInfo, "<set-?>");
        this.halfDialogWebPageInfo.setValue(webPageInfo);
    }

    public final void setReplyUserInfo(@Nullable UserInfo userInfo) {
        this.replyUserInfo.setValue(userInfo);
    }

    public final void startCheckNewPostJob() {
        Job job = this.checkNewPostJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.checkNewPostJob = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o000000(null), 2, null);
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
        SharedPreferences sharedPreferences = o0O0oo0o.OooO00o().f48377OooO00o;
        long j3 = sharedPreferences != null ? sharedPreferences.getLong("MOMENT_STATISTICAL_TIME", 0L) : 0L;
        long j4 = j2 + j3;
        if (j4 > 120) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o000000O(j3, null), 2, null);
        } else {
            o0O0oo0o.OooO00o().OooO0Oo(j4, "MOMENT_STATISTICAL_TIME");
        }
    }

    @NotNull
    public final LiveData<ApiResult<Object>> topInsForUserPost(long dyId, int type) {
        return com.code.android.util.o00oO0o.OooO00o(new o00000(dyId, type, null));
    }
}
