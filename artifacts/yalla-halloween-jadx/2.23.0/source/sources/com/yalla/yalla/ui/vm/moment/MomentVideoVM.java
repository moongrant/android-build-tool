package com.yalla.yalla.ui.vm.moment;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O0;
import com.code.android.util.o000oOoO;
import com.code.android.util.o0OoOo0;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.MomentRepository;
import com.yalla.yalla.data.repository.MomentRepository$getHotVideoFeed$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$momentDetail$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$postPraise$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModelKt;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o000O000;
import p385o0OOooOO.o00oOoo;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;
import p579o0oOoo.oO0O0O00;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J$\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bJZ\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022 \b\u0002\u0010\u0016\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019J\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001c0\u001b2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u000bJ\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0004R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R+\u00101\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u00105\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R/\u0010;\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010(\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R/\u0010A\u001a\u0004\u0018\u00010\t2\b\u0010+\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010(\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000b0&8\u0006¢\u0006\f\n\u0004\bG\u0010(\u001a\u0004\bH\u0010*R\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0&8\u0006¢\u0006\f\n\u0004\bI\u0010(\u001a\u0004\bJ\u0010*R\"\u0010K\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Q\u001a\u00020B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010D\u001a\u0004\bR\u0010F\"\u0004\bS\u0010TR(\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010(\u001a\u0004\bV\u0010*\"\u0004\bW\u0010XR+\u0010\\\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010(\u001a\u0004\bZ\u0010.\"\u0004\b[\u00100R\"\u0010]\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010.\"\u0004\b`\u00100R6\u0010c\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010aj\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010i\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR/\u0010u\u001a\u0004\u0018\u00010o2\b\u0010+\u001a\u0004\u0018\u00010o8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010(\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR/\u0010y\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010(\u001a\u0004\bw\u00108\"\u0004\bx\u0010:R/\u0010}\u001a\u0004\u0018\u00010o2\b\u0010+\u001a\u0004\u0018\u00010o8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bz\u0010(\u001a\u0004\b{\u0010r\"\u0004\b|\u0010tR1\u0010\u0081\u0001\u001a\u0004\u0018\u00010\t2\b\u0010+\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002¢\u0006\u0013\n\u0004\b~\u0010(\u001a\u0004\b\u007f\u0010>\"\u0005\b\u0080\u0001\u0010@R3\u0010\u0085\u0001\u001a\u0004\u0018\u00010o2\b\u0010+\u001a\u0004\u0018\u00010o8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010(\u001a\u0005\b\u0083\u0001\u0010r\"\u0005\b\u0084\u0001\u0010tR,\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010(\u001a\u0005\b\u0087\u0001\u0010*\"\u0005\b\u0088\u0001\u0010XR&\u0010\u0089\u0001\u001a\u00020B8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010D\u001a\u0005\b\u008a\u0001\u0010F\"\u0005\b\u008b\u0001\u0010TR7\u0010\u008c\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R#\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R/\u0010\u0099\u0001\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010(\u001a\u0005\b\u0099\u0001\u0010.\"\u0005\b\u009a\u0001\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009d\u0001"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentVideoVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "", "hidePostId", "", "deleteItem", "sendGift", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "comment", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "reply", "", "isReplyPage", "toInputCommentOrReply", "", "fromType", "isRefresh", "videoDetailDyId", "toUserId", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "onFinish", "userMomentList", "(IZJLjava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "item", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/yalla/yalla/model/http/ApiResult;", "userFollow", ShareConstants.RESULT_POST_ID, "isPraise", "Lcom/yalla/yalla/model/PraisePostResultModel;", "praisePost", "showSwipeGuideDone", "refreshMomentDetail", "showCommentReply", "closeCommentReply", "Landroidx/compose/runtime/MutableState;", "showDialogComment", "Landroidx/compose/runtime/MutableState;", "getShowDialogComment", "()Landroidx/compose/runtime/MutableState;", "<set-?>", "showDialogReplay$delegate", "getShowDialogReplay", "()Z", "setShowDialogReplay", "(Z)V", "showDialogReplay", "showDialogGift$delegate", "getShowDialogGift", "setShowDialogGift", "showDialogGift", "showDialogCommentMore$delegate", "getShowDialogCommentMore", "()Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "setShowDialogCommentMore", "(Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;)V", "showDialogCommentMore", "showDialogReplySonMore$delegate", "getShowDialogReplySonMore", "()Lcom/yalla/yalla/model/moment/MomentReplyModel;", "setShowDialogReplySonMore", "(Lcom/yalla/yalla/model/moment/MomentReplyModel;)V", "showDialogReplySonMore", "Landroidx/compose/runtime/MutableIntState;", "showMomentVideoContentPopInitialPage", "Landroidx/compose/runtime/MutableIntState;", "getShowMomentVideoContentPopInitialPage", "()Landroidx/compose/runtime/MutableIntState;", "showUpDownGuide", "getShowUpDownGuide", "showSwipe", "getShowSwipe", "initialPage", "I", "getInitialPage", "()I", "setInitialPage", "(I)V", "currentPage", "getCurrentPage", "setCurrentPage", "(Landroidx/compose/runtime/MutableIntState;)V", "showFastInputPanel", "getShowFastInputPanel", "setShowFastInputPanel", "(Landroidx/compose/runtime/MutableState;)V", "needShowEmojiFacePanel$delegate", "getNeedShowEmojiFacePanel", "setNeedShowEmojiFacePanel", "needShowEmojiFacePanel", "showVideoLikeTip", "Z", "getShowVideoLikeTip", "setShowVideoLikeTip", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "startVideoList", "Ljava/util/ArrayList;", "getStartVideoList", "()Ljava/util/ArrayList;", "setStartVideoList", "(Ljava/util/ArrayList;)V", "startVideo", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "getStartVideo", "()Lcom/yalla/yalla/model/moment/MomentDetailModel;", "setStartVideo", "(Lcom/yalla/yalla/model/moment/MomentDetailModel;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "showRewardFirstLayout$delegate", "getShowRewardFirstLayout", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setShowRewardFirstLayout", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "showRewardFirstLayout", "sendRewardDialogComment$delegate", "getSendRewardDialogComment", "setSendRewardDialogComment", "sendRewardDialogComment", "sendRewardDialogCommentLayoutCoordinates$delegate", "getSendRewardDialogCommentLayoutCoordinates", "setSendRewardDialogCommentLayoutCoordinates", "sendRewardDialogCommentLayoutCoordinates", "sendRewardDialogReply$delegate", "getSendRewardDialogReply", "setSendRewardDialogReply", "sendRewardDialogReply", "sendRewardDialogReplyLayoutCoordinates$delegate", "getSendRewardDialogReplyLayoutCoordinates", "setSendRewardDialogReplyLayoutCoordinates", "sendRewardDialogReplyLayoutCoordinates", "sendRewardDialog", "getSendRewardDialog", "setSendRewardDialog", "refreshIndex", "getRefreshIndex", "setRefreshIndex", "hidePostListener", "Lkotlin/jvm/functions/Function1;", "getHidePostListener", "()Lkotlin/jvm/functions/Function1;", "setHidePostListener", "(Lkotlin/jvm/functions/Function1;)V", "Lo0oOoo/oO0O0O00;", "momentGiftSendUtil$delegate", "Lkotlin/Lazy;", "getMomentGiftSendUtil", "()Lo0oOoo/oO0O0O00;", "momentGiftSendUtil", "isPraising$delegate", "isPraising", "setPraising", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentVideoVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentVideoVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,330:1\n81#2:331\n107#2,2:332\n81#2:334\n107#2,2:335\n81#2:337\n107#2,2:338\n81#2:340\n107#2,2:341\n81#2:343\n107#2,2:344\n81#2:346\n107#2,2:347\n81#2:349\n107#2,2:350\n81#2:352\n107#2,2:353\n81#2:355\n107#2,2:356\n81#2:358\n107#2,2:359\n81#2:361\n107#2,2:362\n*S KotlinDebug\n*F\n+ 1 MomentVideoVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentVideoVM\n*L\n45#1:331\n45#1:332,2\n46#1:334\n46#1:335,2\n49#1:337\n49#1:338,2\n52#1:340\n52#1:341,2\n60#1:343\n60#1:344,2\n68#1:346\n68#1:347,2\n70#1:349\n70#1:350,2\n71#1:352\n71#1:353,2\n73#1:355\n73#1:356,2\n74#1:358\n74#1:359,2\n276#1:361\n276#1:362,2\n*E\n"})
public final class MomentVideoVM extends BaseMomentDetailVM {
    public static final int $stable = 8;

    @NotNull
    private MutableIntState currentPage;

    @Nullable
    private Function1<? super Long, Unit> hidePostListener;
    private int initialPage;

    /* JADX INFO: renamed from: isPraising$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isPraising;

    /* JADX INFO: renamed from: momentGiftSendUtil$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy momentGiftSendUtil;

    /* JADX INFO: renamed from: needShowEmojiFacePanel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState needShowEmojiFacePanel;

    @NotNull
    private MutableIntState refreshIndex;

    @NotNull
    private MutableState<Boolean> sendRewardDialog;

    /* JADX INFO: renamed from: sendRewardDialogComment$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState sendRewardDialogComment;

    /* JADX INFO: renamed from: sendRewardDialogCommentLayoutCoordinates$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState sendRewardDialogCommentLayoutCoordinates;

    /* JADX INFO: renamed from: sendRewardDialogReply$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState sendRewardDialogReply;

    /* JADX INFO: renamed from: sendRewardDialogReplyLayoutCoordinates$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState sendRewardDialogReplyLayoutCoordinates;

    @NotNull
    private final MutableState<Boolean> showDialogComment;

    /* JADX INFO: renamed from: showDialogCommentMore$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showDialogCommentMore;

    /* JADX INFO: renamed from: showDialogGift$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showDialogGift;

    /* JADX INFO: renamed from: showDialogReplay$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showDialogReplay;

    /* JADX INFO: renamed from: showDialogReplySonMore$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showDialogReplySonMore;

    @NotNull
    private MutableState<Boolean> showFastInputPanel;

    @NotNull
    private final MutableIntState showMomentVideoContentPopInitialPage;

    /* JADX INFO: renamed from: showRewardFirstLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showRewardFirstLayout;

    @NotNull
    private final MutableState<Boolean> showSwipe;

    @NotNull
    private final MutableState<Boolean> showUpDownGuide;
    private boolean showVideoLikeTip;

    @Nullable
    private MomentDetailModel startVideo;

    @Nullable
    private ArrayList<MomentDetailModel> startVideoList;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$userFollow$1", f = "MomentVideoVM.kt", i = {0, 1, 1}, l = {264, 265, 273}, m = "invokeSuspend", n = {"$this$sharedFlow", "$this$sharedFlow", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<Boolean>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f32307OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f32308OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f32309OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f32310OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f32311OooO0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$userFollow$1$1", f = "MomentVideoVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nMomentVideoVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentVideoVM$userFollow$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,330:1\n1855#2,2:331\n*S KotlinDebug\n*F\n+ 1 MomentVideoVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentVideoVM$userFollow$1$1\n*L\n266#1:331,2\n*E\n"})
        public static final class OooO00o extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentVideoVM f32312OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentDetailModel f32313OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, Continuation continuation) {
                super(2, continuation);
                this.f32312OooO0Oo = momentVideoVM;
                this.f32313OooO0o0 = momentDetailModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f32313OooO0o0, this.f32312OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Iterator<MomentDetailModel> it = this.f32312OooO0Oo.getListData().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    MomentDetailModel momentDetailModel = this.f32313OooO0o0;
                    if (!zHasNext) {
                        LiveEventBus.get("POST_DETAIL_DATA_REFRESH_PART").post(momentDetailModel);
                        return Unit.INSTANCE;
                    }
                    MomentDetailModel next = it.next();
                    if (next.getUserId() == momentDetailModel.getUserId()) {
                        next.setFollow(true);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f32310OooO0oO = momentDetailModel;
            this.f32311OooO0oo = momentVideoVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f32310OooO0oO, this.f32311OooO0oo, continuation);
            oooO.f32308OooO0o = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ApiResult<Boolean>> flowCollector, Continuation<? super Unit> continuation) {
            return ((OooO) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            Object objOooO0OO;
            FlowCollector flowCollector2;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32309OooO0o0;
            MomentDetailModel momentDetailModel = this.f32310OooO0oO;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f32308OooO0o;
                    ResultKt.throwOnFailure(obj);
                    objOooO0OO = obj;
                } else if (i == 2) {
                    apiResult = this.f32307OooO0Oo;
                    flowCollector2 = (FlowCollector) this.f32308OooO0o;
                    ResultKt.throwOnFailure(obj);
                    this.f32308OooO0o = null;
                    this.f32307OooO0Oo = null;
                    this.f32309OooO0o0 = 3;
                    if (flowCollector2.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.f32308OooO0o;
            UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
            long userId = momentDetailModel.getUserId();
            String str = momentDetailModel.isFollow() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
            this.f32308OooO0o = flowCollector;
            this.f32309OooO0o0 = 1;
            userInfoRepo.getClass();
            objOooO0OO = UserInfoRepo.OooO0OO(userId, str, this);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
            FlowCollector flowCollector3 = flowCollector;
            ApiResult apiResult2 = (ApiResult) objOooO0OO;
            OooO00o oooO00o = new OooO00o(momentDetailModel, this.f32311OooO0oo, null);
            this.f32308OooO0o = flowCollector3;
            this.f32307OooO0Oo = apiResult2;
            this.f32309OooO0o0 = 2;
            if (o000O000.OooO0OO(apiResult2, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector2 = flowCollector3;
            apiResult = apiResult2;
            this.f32308OooO0o = null;
            this.f32307OooO0Oo = null;
            this.f32309OooO0o0 = 3;
            if (flowCollector2.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Long, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            MomentVideoVM.this.deleteItem(l.longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<oO0O0O00> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0O0O00 invoke() {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity == null) {
                return null;
            }
            MomentVideoVM momentVideoVM = MomentVideoVM.this;
            return new oO0O0O00(fragmentActivity, GiftPropTypeShow.InMomentDetail, momentVideoVM, new com.yalla.yalla.ui.vm.moment.OooO0O0(momentVideoVM), 8);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$praisePost$1", f = "MomentVideoVM.kt", i = {0, 1, 1}, l = {280, 281, 289}, m = "invokeSuspend", n = {"$this$sharedFlow", "$this$sharedFlow", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO0OO extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<PraisePostResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f32316OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f32317OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f32318OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f32319OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f32321OooO0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$praisePost$1$1", f = "MomentVideoVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nMomentVideoVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentVideoVM$praisePost$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,330:1\n1#2:331\n*E\n"})
        public static final class OooO00o extends SuspendLambda implements Function2<PraisePostResultModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32322OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ long f32323OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentVideoVM f32324OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ boolean f32325OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentVideoVM momentVideoVM, long j, boolean z, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f32324OooO0o0 = momentVideoVM;
                this.f32323OooO0o = j;
                this.f32325OooO0oO = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f32324OooO0o0, this.f32323OooO0o, this.f32325OooO0oO, continuation);
                oooO00o.f32322OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PraisePostResultModel praisePostResultModel, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(praisePostResultModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MomentDetailModel next;
                long num;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                PraisePostResultModel praisePostResultModel = (PraisePostResultModel) this.f32322OooO0Oo;
                Iterator<MomentDetailModel> it = this.f32324OooO0o0.getListData().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next.getId() == this.f32323OooO0o));
                MomentDetailModel momentDetailModel = next;
                if (momentDetailModel != null) {
                    boolean z = this.f32325OooO0oO;
                    if (praisePostResultModel != null) {
                        num = praisePostResultModel.getNum();
                    } else {
                        long praiseNum = momentDetailModel.getPraiseNum();
                        num = z ? 1 + praiseNum : praiseNum - 1;
                    }
                    momentDetailModel.setPraiseNum(num);
                    momentDetailModel.setPraise(z);
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH_PART").post(momentDetailModel);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, boolean z, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f32321OooO0oo = j;
            this.f32316OooO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = MomentVideoVM.this.new OooO0OO(this.f32321OooO0oo, this.f32316OooO, continuation);
            oooO0OO.f32318OooO0o = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ApiResult<PraisePostResultModel>> flowCollector, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00b4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            Object objOooO0Oo;
            FlowCollector flowCollector2;
            ApiResult apiResult;
            ApiResult apiResult2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32319OooO0o0;
            boolean z = false;
            MomentVideoVM momentVideoVM = MomentVideoVM.this;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f32318OooO0o;
                    ResultKt.throwOnFailure(obj);
                    objOooO0Oo = obj;
                } else if (i == 2) {
                    apiResult = this.f32317OooO0Oo;
                    flowCollector2 = (FlowCollector) this.f32318OooO0o;
                    ResultKt.throwOnFailure(obj);
                    apiResult2 = null;
                    this.f32318OooO0o = apiResult2;
                    this.f32317OooO0Oo = apiResult2;
                    this.f32319OooO0o0 = 3;
                    if (flowCollector2.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = false;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                momentVideoVM.setPraising(z);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.f32318OooO0o;
            momentVideoVM.setPraising(true);
            int i2 = !this.f32316OooO ? 1 : 0;
            this.f32318OooO0o = flowCollector;
            this.f32319OooO0o0 = 1;
            String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/Moment/Praise");
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(this.f32321OooO0oo), "dyid");
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "type");
            objOooO0Oo = OooOOO.OooO0Oo(new MomentRepository$postPraise$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            FlowCollector flowCollector3 = flowCollector;
            ApiResult apiResult3 = (ApiResult) objOooO0Oo;
            OooO00o oooO00o = new OooO00o(MomentVideoVM.this, this.f32321OooO0oo, this.f32316OooO, null);
            this.f32318OooO0o = flowCollector3;
            this.f32317OooO0Oo = apiResult3;
            this.f32319OooO0o0 = 2;
            if (o000O000.OooO0OO(apiResult3, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector2 = flowCollector3;
            apiResult = apiResult3;
            apiResult2 = null;
            this.f32318OooO0o = apiResult2;
            this.f32317OooO0Oo = apiResult2;
            this.f32319OooO0o0 = 3;
            if (flowCollector2.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = false;
            momentVideoVM.setPraising(z);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$refreshMomentDetail$1$1", f = "MomentVideoVM.kt", i = {}, l = {302, 302}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32326OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f32327OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f32328OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$refreshMomentDetail$1$1$1", f = "MomentVideoVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<MomentDetailModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32329OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentVideoVM f32330OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentVideoVM momentVideoVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f32330OooO0o0 = momentVideoVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f32330OooO0o0, continuation);
                oooO00o.f32329OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MomentDetailModel momentDetailModel, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(momentDetailModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MomentDetailModel momentDetailModel = (MomentDetailModel) this.f32329OooO0Oo;
                if (momentDetailModel != null) {
                    MomentDetailModelKt.cloneData(this.f32330OooO0o0.getCurrentMomentDetail(), momentDetailModel);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, MomentVideoVM momentVideoVM, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f32328OooO0o0 = j;
            this.f32327OooO0o = momentVideoVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f32328OooO0o0, this.f32327OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32326OooO0Oo;
            if (i != 0) {
                if (i == 1) {
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
            String strValueOf = String.valueOf(this.f32328OooO0o0);
            this.f32326OooO0Oo = 1;
            String url = o000OOo0.OooO0Oo("/Webservers/Discovery/SquareSingle");
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(strValueOf, "dyId");
            o0o0ooo.OooO0O0(Boxing.boxInt(0), "sourceType");
            obj = OooOOO.OooO0Oo(new MomentRepository$momentDetail$$inlined$call$1(o0o0ooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(this.f32327OooO0o, null);
            this.f32326OooO0Oo = 2;
            if (o000O000.OooO0OO(apiResult, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$userMomentList$3", f = "MomentVideoVM.kt", i = {}, l = {189, 197, 198, 243, 244}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f32331OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32332OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Long f32333OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f32334OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f32335OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f32336OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f32337OooOO0;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$userMomentList$3$5", f = "MomentVideoVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO extends SuspendLambda implements Function2<MomentDetailModel, Continuation<? super Unit>, Object> {
            public OooO(Continuation<? super OooO> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MomentDetailModel momentDetailModel, Continuation<? super Unit> continuation) {
                return new OooO(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$userMomentList$3$1", f = "MomentVideoVM.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<ApiResult<List<MomentDetailModel>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f32338OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MomentVideoVM f32339OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f32340OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ int f32341OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f32342OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(MomentVideoVM momentVideoVM, int i, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f32339OooO0o = momentVideoVM;
                this.f32341OooO0oO = i;
                this.f32342OooO0oo = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f32339OooO0o, this.f32341OooO0oO, this.f32342OooO0oo, continuation);
                oooO00o.f32340OooO0o0 = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<List<MomentDetailModel>> apiResult, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f32338OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) this.f32340OooO0o0;
                    MomentVideoVM momentVideoVM = this.f32339OooO0o;
                    momentVideoVM.isRefreshIng().setValue(Boxing.boxBoolean(false));
                    if (apiResult.isSuccess()) {
                        Long dateSort = apiResult.getPage().getDateSort();
                        momentVideoVM.setDateSort(dateSort != null ? dateSort.longValue() : 0L);
                        if (this.f32341OooO0oO == 0) {
                            momentVideoVM.setPageIndex(apiResult.getPage().getPageIndex());
                        } else {
                            momentVideoVM.setPageIndex(momentVideoVM.getPageIndex() + 1);
                        }
                    }
                    Function1<Continuation<? super Unit>, Object> function1 = this.f32342OooO0oo;
                    if (function1 != null) {
                        this.f32338OooO0Oo = 1;
                        if (function1.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$userMomentList$3$2", f = "MomentVideoVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentVideoVM f32343OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(MomentVideoVM momentVideoVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f32343OooO0Oo = momentVideoVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f32343OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiError apiError, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(apiError, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MomentVideoVM momentVideoVM = this.f32343OooO0Oo;
                if (momentVideoVM.getListData().isEmpty()) {
                    momentVideoVM.getContentState().setValue(ContentState.Error);
                } else {
                    momentVideoVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$userMomentList$3$3", f = "MomentVideoVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<List<MomentDetailModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32344OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f32345OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentVideoVM f32346OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ int f32347OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MomentVideoVM momentVideoVM, boolean z, int i, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f32346OooO0o0 = momentVideoVM;
                this.f32345OooO0o = z;
                this.f32347OooO0oO = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f32346OooO0o0, this.f32345OooO0o, this.f32347OooO0oO, continuation);
                oooO0OO.f32344OooO0Oo = obj;
                return oooO0OO;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<MomentDetailModel> list, Continuation<? super Unit> continuation) {
                return ((OooO0OO) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MomentDetailModel startVideo;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                List list = (List) this.f32344OooO0Oo;
                MomentVideoVM momentVideoVM = this.f32346OooO0o0;
                momentVideoVM.getContentState().setValue(ContentState.Content);
                boolean z = true;
                if (list != null) {
                    boolean z2 = this.f32345OooO0o;
                    int i = this.f32347OooO0oO;
                    if (z2 && i != 0) {
                        momentVideoVM.getListData().clear();
                    }
                    if (i == 2 && momentVideoVM.getPageIndex() == 1 && (startVideo = momentVideoVM.getStartVideo()) != null) {
                        Boxing.boxBoolean(momentVideoVM.getListData().add(startVideo));
                    }
                    momentVideoVM.getListData().addAll(list);
                    if (z2 && i != 0) {
                        momentVideoVM.getCurrentPage().setValue(0);
                        momentVideoVM.setCurrentMomentDetail((MomentDetailModel) CollectionsKt.getOrNull(momentVideoVM.getListData(), 0));
                    }
                }
                if (list != null && !list.isEmpty()) {
                    z = false;
                }
                if (z) {
                    momentVideoVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                } else {
                    momentVideoVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentVideoVM$userMomentList$3$4", f = "MomentVideoVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0o extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32348OooO0Oo;

            public OooO0o(Continuation<? super OooO0o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0o oooO0o = new OooO0o(continuation);
                oooO0o.f32348OooO0Oo = obj;
                return oooO0o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiError apiError, Continuation<? super Unit> continuation) {
                return ((OooO0o) create(apiError, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ((ApiError) this.f32348OooO0Oo).getCode();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(int i, Long l, MomentVideoVM momentVideoVM, long j, Function1<? super Continuation<? super Unit>, ? extends Object> function1, boolean z, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f32334OooO0o0 = i;
            this.f32333OooO0o = l;
            this.f32335OooO0oO = momentVideoVM;
            this.f32336OooO0oo = j;
            this.f32331OooO = function1;
            this.f32337OooOO0 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f32334OooO0o0, this.f32333OooO0o, this.f32335OooO0oO, this.f32336OooO0oo, this.f32331OooO, this.f32337OooOO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00e3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x0117 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0136 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Continuation continuation;
            Object objOooO0Oo;
            Object objOooO0OO;
            ApiResult apiResult;
            Continuation continuation2;
            OooO00o oooO00o;
            OooO0O0 oooO0O0;
            OooO0OO oooO0OO;
            Continuation continuation3;
            Object objOooO0Oo2;
            OooO0o oooO0o;
            OooO oooO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32332OooO0Oo;
            long j = this.f32336OooO0oo;
            int i2 = this.f32334OooO0o0;
            MomentVideoVM momentVideoVM = this.f32335OooO0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (i2 == 0) {
                    Long l = this.f32333OooO0o;
                    Intrinsics.checkNotNull(l);
                    long jLongValue = l.longValue();
                    long dateSort = momentVideoVM.getDateSort();
                    int pageIndex = momentVideoVM.getPageIndex();
                    this.f32332OooO0Oo = 1;
                    objOooO0OO = MomentRepository.OooO0OO(jLongValue, dateSort, pageIndex, 0, 2, this);
                    if (objOooO0OO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) objOooO0OO;
                    continuation2 = null;
                    MomentVideoVM momentVideoVM2 = momentVideoVM;
                    oooO00o = new OooO00o(momentVideoVM2, i2, this.f32331OooO, continuation2);
                    oooO0O0 = new OooO0O0(momentVideoVM2, continuation2);
                    oooO0OO = new OooO0OO(momentVideoVM2, this.f32337OooOO0, i2, continuation2);
                    this.f32332OooO0Oo = 3;
                    if (o000O000.OooO0OO(apiResult, false, oooO00o, oooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String strOooOOO0 = o0OoOo0.OooOOO0(AppEventsConstants.EVENT_PARAM_VALUE_NO, Boxing.boxLong(j));
                    this.f32332OooO0Oo = 4;
                    String url = o000OOo0.OooO0Oo("/Webservers/Discovery/SquareSingle");
                    Intrinsics.checkNotNullParameter(url, "url");
                    o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
                    o0o0ooo.OooO0O0(strOooOOO0, "dyId");
                    o0o0ooo.OooO0O0(Boxing.boxInt(0), "sourceType");
                    continuation3 = null;
                    objOooO0Oo2 = OooOOO.OooO0Oo(new MomentRepository$momentDetail$$inlined$call$1(o0o0ooo, null), this);
                    if (objOooO0Oo2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooO0o = new OooO0o(continuation3);
                    oooO = new OooO(continuation3);
                    this.f32332OooO0Oo = 5;
                    if (o000O000.OooO0OO((ApiResult) objOooO0Oo2, false, null, oooO0o, oooO, this, 3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    momentVideoVM = momentVideoVM;
                    int pageIndex2 = momentVideoVM.getPageIndex();
                    this.f32332OooO0Oo = 2;
                    String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/video/gethot");
                    o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
                    o0o0oooOooO00o.OooO0O0(Boxing.boxLong(j), "dyId");
                    o0o0oooOooO00o.OooO0O0(Boxing.boxInt(pageIndex2), "pageindex");
                    o0o0oooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
                    continuation = null;
                    objOooO0Oo = OooOOO.OooO0Oo(new MomentRepository$getHotVideoFeed$$inlined$call$1(o0o0oooOooO00o, null), this);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) objOooO0Oo;
                    continuation2 = continuation;
                    MomentVideoVM momentVideoVM3 = momentVideoVM;
                    oooO00o = new OooO00o(momentVideoVM3, i2, this.f32331OooO, continuation2);
                    oooO0O0 = new OooO0O0(momentVideoVM3, continuation2);
                    oooO0OO = new OooO0OO(momentVideoVM3, this.f32337OooOO0, i2, continuation2);
                    this.f32332OooO0Oo = 3;
                    if (o000O000.OooO0OO(apiResult, false, oooO00o, oooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String strOooOOO1 = o0OoOo0.OooOOO0(AppEventsConstants.EVENT_PARAM_VALUE_NO, Boxing.boxLong(j));
                    this.f32332OooO0Oo = 4;
                    String url2 = o000OOo0.OooO0Oo("/Webservers/Discovery/SquareSingle");
                    Intrinsics.checkNotNullParameter(url2, "url");
                    o0O0ooO o0o0ooo2 = new o0O0ooO(url2, 0);
                    o0o0ooo2.OooO0O0(strOooOOO1, "dyId");
                    o0o0ooo2.OooO0O0(Boxing.boxInt(0), "sourceType");
                    continuation3 = null;
                    objOooO0Oo2 = OooOOO.OooO0Oo(new MomentRepository$momentDetail$$inlined$call$1(o0o0ooo2, null), this);
                    if (objOooO0Oo2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooO0o = new OooO0o(continuation3);
                    oooO = new OooO(continuation3);
                    this.f32332OooO0Oo = 5;
                    if (o000O000.OooO0OO((ApiResult) objOooO0Oo2, false, null, oooO0o, oooO, this, 3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                objOooO0OO = obj;
                apiResult = (ApiResult) objOooO0OO;
                continuation2 = null;
                MomentVideoVM momentVideoVM4 = momentVideoVM;
                oooO00o = new OooO00o(momentVideoVM4, i2, this.f32331OooO, continuation2);
                oooO0O0 = new OooO0O0(momentVideoVM4, continuation2);
                oooO0OO = new OooO0OO(momentVideoVM4, this.f32337OooOO0, i2, continuation2);
                this.f32332OooO0Oo = 3;
                if (o000O000.OooO0OO(apiResult, false, oooO00o, oooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                String strOooOOO2 = o0OoOo0.OooOOO0(AppEventsConstants.EVENT_PARAM_VALUE_NO, Boxing.boxLong(j));
                this.f32332OooO0Oo = 4;
                String url3 = o000OOo0.OooO0Oo("/Webservers/Discovery/SquareSingle");
                Intrinsics.checkNotNullParameter(url3, "url");
                o0O0ooO o0o0ooo3 = new o0O0ooO(url3, 0);
                o0o0ooo3.OooO0O0(strOooOOO2, "dyId");
                o0o0ooo3.OooO0O0(Boxing.boxInt(0), "sourceType");
                continuation3 = null;
                objOooO0Oo2 = OooOOO.OooO0Oo(new MomentRepository$momentDetail$$inlined$call$1(o0o0ooo3, null), this);
                if (objOooO0Oo2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO0o = new OooO0o(continuation3);
                oooO = new OooO(continuation3);
                this.f32332OooO0Oo = 5;
                if (o000O000.OooO0OO((ApiResult) objOooO0Oo2, false, null, oooO0o, oooO, this, 3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                continuation = null;
                objOooO0Oo = obj;
                momentVideoVM = momentVideoVM;
                apiResult = (ApiResult) objOooO0Oo;
                continuation2 = continuation;
                MomentVideoVM momentVideoVM5 = momentVideoVM;
                oooO00o = new OooO00o(momentVideoVM5, i2, this.f32331OooO, continuation2);
                oooO0O0 = new OooO0O0(momentVideoVM5, continuation2);
                oooO0OO = new OooO0OO(momentVideoVM5, this.f32337OooOO0, i2, continuation2);
                this.f32332OooO0Oo = 3;
                if (o000O000.OooO0OO(apiResult, false, oooO00o, oooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                String strOooOOO3 = o0OoOo0.OooOOO0(AppEventsConstants.EVENT_PARAM_VALUE_NO, Boxing.boxLong(j));
                this.f32332OooO0Oo = 4;
                String url4 = o000OOo0.OooO0Oo("/Webservers/Discovery/SquareSingle");
                Intrinsics.checkNotNullParameter(url4, "url");
                o0O0ooO o0o0ooo4 = new o0O0ooO(url4, 0);
                o0o0ooo4.OooO0O0(strOooOOO3, "dyId");
                o0o0ooo4.OooO0O0(Boxing.boxInt(0), "sourceType");
                continuation3 = null;
                objOooO0Oo2 = OooOOO.OooO0Oo(new MomentRepository$momentDetail$$inlined$call$1(o0o0ooo4, null), this);
                if (objOooO0Oo2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO0o = new OooO0o(continuation3);
                oooO = new OooO(continuation3);
                this.f32332OooO0Oo = 5;
                if (o000O000.OooO0OO((ApiResult) objOooO0Oo2, false, null, oooO0o, oooO, this, 3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 3) {
                ResultKt.throwOnFailure(obj);
                String strOooOOO4 = o0OoOo0.OooOOO0(AppEventsConstants.EVENT_PARAM_VALUE_NO, Boxing.boxLong(j));
                this.f32332OooO0Oo = 4;
                String url5 = o000OOo0.OooO0Oo("/Webservers/Discovery/SquareSingle");
                Intrinsics.checkNotNullParameter(url5, "url");
                o0O0ooO o0o0ooo5 = new o0O0ooO(url5, 0);
                o0o0ooo5.OooO0O0(strOooOOO4, "dyId");
                o0o0ooo5.OooO0O0(Boxing.boxInt(0), "sourceType");
                continuation3 = null;
                objOooO0Oo2 = OooOOO.OooO0Oo(new MomentRepository$momentDetail$$inlined$call$1(o0o0ooo5, null), this);
                if (objOooO0Oo2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO0o = new OooO0o(continuation3);
                oooO = new OooO(continuation3);
                this.f32332OooO0Oo = 5;
                if (o000O000.OooO0OO((ApiResult) objOooO0Oo2, false, null, oooO0o, oooO, this, 3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 4) {
                ResultKt.throwOnFailure(obj);
                continuation3 = null;
                objOooO0Oo2 = obj;
                oooO0o = new OooO0o(continuation3);
                oooO = new OooO(continuation3);
                this.f32332OooO0Oo = 5;
                if (o000O000.OooO0OO((ApiResult) objOooO0Oo2, false, null, oooO0o, oooO, this, 3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public MomentVideoVM() {
        Boolean bool = Boolean.FALSE;
        this.showDialogComment = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showDialogReplay = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showDialogGift = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showDialogCommentMore = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.showDialogReplySonMore = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.showMomentVideoContentPopInitialPage = SnapshotIntStateKt.mutableIntStateOf(0);
        this.showUpDownGuide = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSwipe = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.currentPage = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.showFastInputPanel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.needShowEmojiFacePanel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
        o0o0o00OooO0o0.getClass();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        this.showVideoLikeTip = o0o0o00OooO0o0.OooO0O0("videoLikeTip" + o000000O.OooOOo0().getValue(), true);
        this.showRewardFirstLayout = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.sendRewardDialogComment = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.sendRewardDialogCommentLayoutCoordinates = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.sendRewardDialogReply = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.sendRewardDialogReplyLayoutCoordinates = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.sendRewardDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.refreshIndex = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.hidePostListener = new OooO00o();
        this.momentGiftSendUtil = LazyKt.lazy(new OooO0O0());
        this.isPraising = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    private final oO0O0O00 getMomentGiftSendUtil() {
        return (oO0O0O00) this.momentGiftSendUtil.getValue();
    }

    public static /* synthetic */ void toInputCommentOrReply$default(MomentVideoVM momentVideoVM, MomentCommentDetailModel momentCommentDetailModel, MomentReplyModel momentReplyModel, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        momentVideoVM.toInputCommentOrReply(momentCommentDetailModel, momentReplyModel, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void userMomentList$default(MomentVideoVM momentVideoVM, int i, boolean z, long j, Long l, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = 0;
        }
        if ((i2 & 8) != 0) {
            l = 0L;
        }
        Long l2 = l;
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        momentVideoVM.userMomentList(i3, z, j, l2, function1);
    }

    public final void closeCommentReply() {
        setCurrentComment(null);
        setCurrentCommentId(null);
        setReplyUserInfo(null);
        setCurrentReply(null);
        setCurrentReplyId(null);
        setShowDialogReplay(false);
    }

    public final void deleteItem(long hidePostId) {
        int i = 0;
        while (i < getListData().size()) {
            if (getListData().get(i).getId() == hidePostId) {
                getListData().remove(i);
                break;
            }
            i++;
        }
        if (i < getListData().size()) {
            this.refreshIndex.setValue(i);
            setCurrentMomentDetail(getListData().get(i));
        } else {
            int i2 = i - 1;
            if (i2 >= 0 && i2 < getListData().size()) {
                this.refreshIndex.setValue(i2);
                setCurrentMomentDetail(getListData().get(i));
            }
        }
        p592o0oo00O.OooOOO0.OooO0O0("refreshIndex is " + this.refreshIndex.getValue());
    }

    @NotNull
    public final MutableIntState getCurrentPage() {
        return this.currentPage;
    }

    @Override // com.yalla.yalla.ui.vm.moment.BaseMomentVM
    @Nullable
    public Function1<Long, Unit> getHidePostListener() {
        return this.hidePostListener;
    }

    public final int getInitialPage() {
        return this.initialPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getNeedShowEmojiFacePanel() {
        return ((Boolean) this.needShowEmojiFacePanel.getValue()).booleanValue();
    }

    @NotNull
    public final MutableIntState getRefreshIndex() {
        return this.refreshIndex;
    }

    @NotNull
    public final MutableState<Boolean> getSendRewardDialog() {
        return this.sendRewardDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final MomentCommentDetailModel getSendRewardDialogComment() {
        return (MomentCommentDetailModel) this.sendRewardDialogComment.getValue();
    }

    @Nullable
    public final LayoutCoordinates getSendRewardDialogCommentLayoutCoordinates() {
        return (LayoutCoordinates) this.sendRewardDialogCommentLayoutCoordinates.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final MomentReplyModel getSendRewardDialogReply() {
        return (MomentReplyModel) this.sendRewardDialogReply.getValue();
    }

    @Nullable
    public final LayoutCoordinates getSendRewardDialogReplyLayoutCoordinates() {
        return (LayoutCoordinates) this.sendRewardDialogReplyLayoutCoordinates.getValue();
    }

    @NotNull
    public final MutableState<Boolean> getShowDialogComment() {
        return this.showDialogComment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final MomentCommentDetailModel getShowDialogCommentMore() {
        return (MomentCommentDetailModel) this.showDialogCommentMore.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowDialogGift() {
        return ((Boolean) this.showDialogGift.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowDialogReplay() {
        return ((Boolean) this.showDialogReplay.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final MomentReplyModel getShowDialogReplySonMore() {
        return (MomentReplyModel) this.showDialogReplySonMore.getValue();
    }

    @NotNull
    public final MutableState<Boolean> getShowFastInputPanel() {
        return this.showFastInputPanel;
    }

    @NotNull
    public final MutableIntState getShowMomentVideoContentPopInitialPage() {
        return this.showMomentVideoContentPopInitialPage;
    }

    @Nullable
    public final LayoutCoordinates getShowRewardFirstLayout() {
        return (LayoutCoordinates) this.showRewardFirstLayout.getValue();
    }

    @NotNull
    public final MutableState<Boolean> getShowSwipe() {
        return this.showSwipe;
    }

    @NotNull
    public final MutableState<Boolean> getShowUpDownGuide() {
        return this.showUpDownGuide;
    }

    public final boolean getShowVideoLikeTip() {
        return this.showVideoLikeTip;
    }

    @Nullable
    public final MomentDetailModel getStartVideo() {
        return this.startVideo;
    }

    @Nullable
    public final ArrayList<MomentDetailModel> getStartVideoList() {
        return this.startVideoList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPraising() {
        return ((Boolean) this.isPraising.getValue()).booleanValue();
    }

    @NotNull
    public final SharedFlow<ApiResult<PraisePostResultModel>> praisePost(long postId, boolean isPraise) {
        return o000oOoO.OooO00o(this, new OooO0OO(postId, isPraise, null));
    }

    public final void refreshMomentDetail() {
        MomentDetailModel currentMomentDetail = getCurrentMomentDetail();
        if (currentMomentDetail != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0o(currentMomentDetail.getId(), this, null), 3, null);
        }
    }

    public final void sendGift() {
        oO0O0O00 momentGiftSendUtil = getMomentGiftSendUtil();
        if (momentGiftSendUtil != null) {
            momentGiftSendUtil.OooO00o(getCurrentMomentDetail());
        }
    }

    public final void setCurrentPage(@NotNull MutableIntState mutableIntState) {
        Intrinsics.checkNotNullParameter(mutableIntState, "<set-?>");
        this.currentPage = mutableIntState;
    }

    @Override // com.yalla.yalla.ui.vm.moment.BaseMomentVM
    public void setHidePostListener(@Nullable Function1<? super Long, Unit> function1) {
        this.hidePostListener = function1;
    }

    public final void setInitialPage(int i) {
        this.initialPage = i;
    }

    public final void setNeedShowEmojiFacePanel(boolean z) {
        this.needShowEmojiFacePanel.setValue(Boolean.valueOf(z));
    }

    public final void setPraising(boolean z) {
        this.isPraising.setValue(Boolean.valueOf(z));
    }

    public final void setRefreshIndex(@NotNull MutableIntState mutableIntState) {
        Intrinsics.checkNotNullParameter(mutableIntState, "<set-?>");
        this.refreshIndex = mutableIntState;
    }

    public final void setSendRewardDialog(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.sendRewardDialog = mutableState;
    }

    public final void setSendRewardDialogComment(@Nullable MomentCommentDetailModel momentCommentDetailModel) {
        this.sendRewardDialogComment.setValue(momentCommentDetailModel);
    }

    public final void setSendRewardDialogCommentLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.sendRewardDialogCommentLayoutCoordinates.setValue(layoutCoordinates);
    }

    public final void setSendRewardDialogReply(@Nullable MomentReplyModel momentReplyModel) {
        this.sendRewardDialogReply.setValue(momentReplyModel);
    }

    public final void setSendRewardDialogReplyLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.sendRewardDialogReplyLayoutCoordinates.setValue(layoutCoordinates);
    }

    public final void setShowDialogCommentMore(@Nullable MomentCommentDetailModel momentCommentDetailModel) {
        this.showDialogCommentMore.setValue(momentCommentDetailModel);
    }

    public final void setShowDialogGift(boolean z) {
        this.showDialogGift.setValue(Boolean.valueOf(z));
    }

    public final void setShowDialogReplay(boolean z) {
        this.showDialogReplay.setValue(Boolean.valueOf(z));
    }

    public final void setShowDialogReplySonMore(@Nullable MomentReplyModel momentReplyModel) {
        this.showDialogReplySonMore.setValue(momentReplyModel);
    }

    public final void setShowFastInputPanel(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.showFastInputPanel = mutableState;
    }

    public final void setShowRewardFirstLayout(@Nullable LayoutCoordinates layoutCoordinates) {
        this.showRewardFirstLayout.setValue(layoutCoordinates);
    }

    public final void setShowVideoLikeTip(boolean z) {
        this.showVideoLikeTip = z;
    }

    public final void setStartVideo(@Nullable MomentDetailModel momentDetailModel) {
        this.startVideo = momentDetailModel;
    }

    public final void setStartVideoList(@Nullable ArrayList<MomentDetailModel> arrayList) {
        this.startVideoList = arrayList;
    }

    public final void showCommentReply(@NotNull MomentCommentDetailModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setCurrentComment(item);
        setCurrentCommentId(Long.valueOf(item.getId()));
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(o0OoOo0.OooO(0L, item.getUserid()));
        userInfo.setUserName(String.valueOf(item.getNickname()));
        setReplyUserInfo(userInfo);
        setShowDialogReplay(true);
    }

    public final void showSwipeGuideDone() {
        this.showSwipe.setValue(Boolean.FALSE);
        o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
        o0o0o00OooO0o0.OooO0o("videoSwipeGuide" + o0o0o00OooO0o0.f45220OooO0OO, false);
    }

    public final void toInputCommentOrReply(@Nullable MomentCommentDetailModel comment, @Nullable MomentReplyModel reply, boolean isReplyPage) {
        String str;
        setCurrentComment(comment);
        setCurrentCommentId(comment != null ? Long.valueOf(comment.getId()) : null);
        setCurrentReply(reply);
        setCurrentReplyId(reply != null ? Long.valueOf(reply.getId()) : null);
        if (reply != null) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(o0OoOo0.OooOO0(reply != null ? Long.valueOf(reply.getUserid()) : null));
            userInfo.setUserName(String.valueOf(reply != null ? reply.getNickname() : null));
            setReplyUserInfo(userInfo);
            str = "回复二级";
        } else {
            if (!(comment != null) || isReplyPage) {
                setReplyUserInfo(null);
                str = "评论";
            } else {
                UserInfo userInfo2 = new UserInfo();
                userInfo2.setUserId(o0OoOo0.OooO(0L, comment != null ? comment.getUserid() : null));
                userInfo2.setUserName(String.valueOf(comment != null ? comment.getNickname() : null));
                setReplyUserInfo(userInfo2);
                str = "回复且不在回复页";
            }
        }
        p592o0oo00O.OooOOO0.OooO0O0("WRM toInputCommentOrReply " + str + " \tcurrentCommentId = " + getCurrentCommentId() + "\tcurrentReplyId = " + getCurrentReplyId() + "\nreplyUserInfo = " + p140o00OOooo.OooOO0.OooO00o(getReplyUserInfo()));
    }

    @NotNull
    public final SharedFlow<ApiResult<Boolean>> userFollow(@NotNull MomentDetailModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return o000oOoO.OooO00o(this, new OooO(item, this, null));
    }

    public final void userMomentList(int fromType, boolean isRefresh, long videoDetailDyId, @Nullable Long toUserId, @Nullable Function1<? super Continuation<? super Unit>, ? extends Object> onFinish) {
        if (isRefreshIng().getValue().booleanValue()) {
            return;
        }
        if (fromType == 4) {
            MomentDetailModel momentDetailModel = this.startVideo;
            if (momentDetailModel != null) {
                getListData().add(momentDetailModel);
                return;
            }
            return;
        }
        isRefreshIng().setValue(Boolean.TRUE);
        if (isRefresh) {
            getLoadMoreState().setValue(LoadMoreState.None);
            setPageIndex(1);
            if (fromType == 0) {
                setPageIndex(2);
                ArrayList<MomentDetailModel> arrayList = this.startVideoList;
                if (arrayList != null) {
                    getListData().addAll(arrayList);
                }
            }
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0(fromType, toUserId, this, videoDetailDyId, onFinish, isRefresh, null), 3, null);
    }
}
