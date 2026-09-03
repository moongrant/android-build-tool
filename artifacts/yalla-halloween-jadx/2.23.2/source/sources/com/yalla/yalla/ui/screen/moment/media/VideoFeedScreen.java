package com.yalla.yalla.ui.screen.moment.media;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material.FractionalThreshold;
import androidx.compose.material.SwipeableDefaults;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableKt$swipeable$1;
import androidx.compose.material.SwipeableState;
import androidx.compose.material.TextKt;
import androidx.compose.material.ThresholdConfig;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00;
import com.common.support.roomgiftplayer.download.VideoDownLoadManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentGiftsVM;
import com.yalla.yalla.ui.vm.moment.MomentPraiseVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import com.yalla.yalla.util.WebPageInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o00O000;
import p194o00o0OO.o00O0O0;
import p194o00o0OO.o00O0O00;
import p194o00o0OO.o00O0O0O;
import p414o0Oo0oO.oO0OOo0o;
import p423o0OoO0OO.o00O0000;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o0O0oo0o;
import p519o0o0O0OO.o0oO0Ooo;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p532o0o0OOo0.o00O00O;
import p535o0o0Oo0.o0;
import p535o0o0Oo0.o0OOO0OO;
import p535o0o0Oo0.oO00000;
import p535o0o0Oo0.oO000Oo;
import p535o0o0Oo0.oO00o00O;
import p535o0o0Oo0.oO0O0;
import p535o0o0Oo0.oO0O00;
import p535o0o0Oo0.oO0O00o0;
import p535o0o0Oo0.oO0O00oO;
import p535o0o0Oo0.oO0O0O00;
import p535o0o0Oo0.oO0O0O0o;
import p535o0o0Oo0.oOo000Oo;
import p535o0o0Oo0.oOo000o0;
import p535o0o0Oo0.ooOOO00O;
import p645o0ooOOoo.m3;
import p650o0ooo.q2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bL\u0010MJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u0006H\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJR\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014J¦\u0001\u0010/\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0'2%\b\u0002\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u0003\u0018\u00010*H\u0007¢\u0006\u0004\b/\u00100J!\u00103\u001a\u00020\u0003*\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f0'H\u0007¢\u0006\u0004\b3\u00104JA\u00109\u001a\u00020\u0003*\u0002012\u0006\u00105\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\u001f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0'2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000307H\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0003H\u0003¢\u0006\u0004\b;\u0010<J\u0086\u0001\u0010?\u001a\u00020\u0003*\u0002012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0'2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0'2\u0006\u0010>\u001a\u00020\u001f2%\b\u0002\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u0003\u0018\u00010*H\u0003¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010G\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010H\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010ER\u0014\u0010I\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010ER\u0014\u0010J\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010ER\u0014\u0010K\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010E\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006W²\u0006\u000e\u0010N\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00106\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010O\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010Q\u001a\u00020P8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010S\u001a\u0004\u0018\u00010R8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010U\u001a\u00020T8\nX\u008a\u0084\u0002²\u0006\u000e\u0010V\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen;", "Lo0o0OOo0/o000O0;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "", "dyId", "toUserId", "", "fromType", "", "videoList", "dataSort", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "videoDetailModel", "Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "momentAdapterTag", "navigate", "index", "Landroidx/compose/foundation/pager/PagerState;", "pagerState", "Lcom/yalla/yalla/ui/vm/moment/MomentVideoVM;", "videoViewModel", "", "videoWatchSet", "Landroidx/compose/material/SwipeableState;", "", "loadRefreshState", "Lcom/yalla/yalla/ui/vm/moment/MomentCommentsVM;", "commentsVM", "Lcom/yalla/yalla/ui/vm/moment/MomentPraiseVM;", "likesVM", "Lcom/yalla/yalla/ui/vm/moment/MomentGiftsVM;", "giftsVM", "Landroidx/compose/runtime/MutableState;", "loadingStart", "refreshIndex", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "itemData", "onDownLoadListener", "PagerItem", "(Lcom/yalla/yalla/model/moment/MomentDetailModel;ILandroidx/compose/foundation/pager/PagerState;Lcom/yalla/yalla/ui/vm/moment/MomentVideoVM;Ljava/util/Set;Landroidx/compose/material/SwipeableState;Lcom/yalla/yalla/ui/vm/moment/MomentCommentsVM;Lcom/yalla/yalla/ui/vm/moment/MomentPraiseVM;Lcom/yalla/yalla/ui/vm/moment/MomentGiftsVM;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/layout/BoxScope;", "isExpanded", "BottomShadowUI", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "progress", "isFinishDownLoad", "Lkotlin/Function0;", "onCancel", "DownloadingArea", "(Landroidx/compose/foundation/layout/BoxScope;IZLandroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MainContent", "(Landroidx/compose/runtime/Composer;I)V", "videoPauseState", "isScrollInProgress", "VideoOverLayUI", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/yalla/yalla/model/moment/MomentDetailModel;Lcom/yalla/yalla/ui/vm/moment/MomentVideoVM;Lcom/yalla/yalla/ui/vm/moment/MomentCommentsVM;Lcom/yalla/yalla/ui/vm/moment/MomentPraiseVM;Lcom/yalla/yalla/ui/vm/moment/MomentGiftsVM;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "vm", "InitObservers", "(Lcom/yalla/yalla/ui/vm/moment/MomentVideoVM;ILandroidx/compose/runtime/Composer;I)V", "PARAM_DATA", "Ljava/lang/String;", VideoFeedScreen.FROM_TYPE, VideoFeedScreen.DATA_SORT, VideoFeedScreen.VIDEO_LIST, VideoFeedScreen.VIDEO_DETAIL_MODEL, VideoFeedScreen.TO_USER_ID, VideoFeedScreen.FROM_MOMENT_TAG, "<init>", "()V", "loadProgress", "startNext", "", "offsetX", "Lo00o0OO/o00O000;", "likeAnimationController", "Landroidx/compose/ui/unit/Dp;", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "isVisible", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVideoFeedScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 13 Composer.kt\nandroidx/compose/runtime/Updater\n+ 14 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 15 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 16 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 17 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,886:1\n81#2,11:887\n81#2,11:898\n81#2,11:909\n81#2,11:920\n76#3:931\n76#3:953\n76#3:954\n76#3:957\n76#3:1103\n76#3:1111\n76#3:1265\n76#3:1330\n36#4:932\n36#4:939\n36#4:946\n36#4:959\n25#4:966\n25#4:973\n25#4:980\n25#4:987\n25#4:994\n36#4:1001\n36#4:1011\n25#4:1022\n36#4:1033\n36#4:1040\n456#4,8:1064\n464#4,3:1078\n50#4:1083\n49#4:1084\n36#4:1091\n467#4,3:1098\n25#4:1104\n25#4:1112\n36#4:1119\n25#4:1126\n25#4:1133\n36#4:1140\n456#4,8:1164\n464#4,3:1178\n25#4:1182\n36#4:1189\n36#4:1196\n467#4,3:1203\n25#4:1208\n456#4,8:1233\n464#4,3:1247\n36#4:1251\n467#4,3:1258\n25#4:1266\n50#4:1273\n49#4:1274\n456#4,8:1298\n464#4,3:1312\n36#4:1317\n467#4,3:1325\n1097#5,6:933\n1097#5,6:940\n1097#5,6:947\n1097#5,6:960\n1097#5,6:967\n1097#5,6:974\n1097#5,6:981\n1097#5,6:988\n1097#5,6:995\n1097#5,6:1002\n1097#5,6:1012\n1097#5,3:1023\n1100#5,3:1029\n1097#5,6:1034\n1097#5,6:1041\n1097#5,6:1085\n1097#5,6:1092\n1097#5,6:1105\n1097#5,6:1113\n1097#5,6:1120\n1097#5,6:1127\n1097#5,6:1134\n1097#5,6:1141\n1097#5,6:1183\n1097#5,6:1190\n1097#5,6:1197\n1097#5,6:1209\n1097#5,6:1252\n1097#5,6:1267\n1097#5,6:1275\n1097#5,6:1318\n1#6:955\n154#7:956\n154#7:958\n154#7:1082\n154#7:1215\n154#7:1263\n154#7:1264\n154#7:1281\n154#7:1282\n154#7:1283\n154#7:1284\n154#7:1316\n154#7:1324\n1864#8,3:1008\n1855#8,2:1350\n1855#8,2:1352\n486#9,4:1018\n490#9,2:1026\n494#9:1032\n486#10:1028\n66#11,6:1047\n72#11:1081\n76#11:1102\n66#11,6:1147\n72#11:1181\n76#11:1207\n78#12,11:1053\n91#12:1101\n78#12,11:1153\n91#12:1206\n78#12,11:1222\n91#12:1261\n78#12,11:1287\n91#12:1328\n4144#13,6:1072\n4144#13,6:1172\n4144#13,6:1241\n4144#13,6:1306\n73#14,6:1216\n79#14:1250\n83#14:1262\n77#14,2:1285\n79#14:1315\n83#14:1329\n75#15:1331\n108#15,2:1332\n81#16:1334\n107#16,2:1335\n81#16:1337\n107#16,2:1338\n81#16:1343\n107#16,2:1344\n81#16:1346\n81#16:1347\n107#16,2:1348\n75#17:1340\n108#17,2:1341\n*S KotlinDebug\n*F\n+ 1 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen\n*L\n207#1:887,11\n208#1:898,11\n209#1:909,11\n210#1:920,11\n211#1:931\n215#1:953\n217#1:954\n218#1:957\n554#1:1103\n556#1:1111\n728#1:1265\n823#1:1330\n212#1:932\n213#1:939\n214#1:946\n220#1:959\n224#1:966\n225#1:973\n227#1:980\n228#1:987\n229#1:994\n233#1:1001\n246#1:1011\n251#1:1022\n263#1:1033\n347#1:1040\n392#1:1064,8\n392#1:1078,3\n475#1:1083\n475#1:1084\n506#1:1091\n392#1:1098,3\n555#1:1104\n557#1:1112\n560#1:1119\n565#1:1126\n578#1:1133\n596#1:1140\n593#1:1164,8\n593#1:1178,3\n612#1:1182\n638#1:1189\n642#1:1196\n593#1:1203,3\n661#1:1208\n663#1:1233,8\n663#1:1247,3\n678#1:1251\n663#1:1258,3\n730#1:1266\n731#1:1273\n731#1:1274\n784#1:1298,8\n784#1:1312,3\n807#1:1317\n784#1:1325,3\n212#1:933,6\n213#1:940,6\n214#1:947,6\n220#1:960,6\n224#1:967,6\n225#1:974,6\n227#1:981,6\n228#1:988,6\n229#1:995,6\n233#1:1002,6\n246#1:1012,6\n251#1:1023,3\n251#1:1029,3\n263#1:1034,6\n347#1:1041,6\n475#1:1085,6\n506#1:1092,6\n555#1:1105,6\n557#1:1113,6\n560#1:1120,6\n565#1:1127,6\n578#1:1134,6\n596#1:1141,6\n612#1:1183,6\n638#1:1190,6\n642#1:1197,6\n661#1:1209,6\n678#1:1252,6\n730#1:1267,6\n731#1:1275,6\n807#1:1318,6\n217#1:956\n218#1:958\n420#1:1082\n666#1:1215\n688#1:1263\n693#1:1264\n740#1:1281\n742#1:1282\n786#1:1283\n788#1:1284\n794#1:1316\n813#1:1324\n237#1:1008,3\n826#1:1350,2\n837#1:1352,2\n251#1:1018,4\n251#1:1026,2\n251#1:1032\n251#1:1028\n392#1:1047,6\n392#1:1081\n392#1:1102\n593#1:1147,6\n593#1:1181\n593#1:1207\n392#1:1053,11\n392#1:1101\n593#1:1153,11\n593#1:1206\n663#1:1222,11\n663#1:1261\n784#1:1287,11\n784#1:1328\n392#1:1072,6\n593#1:1172,6\n663#1:1241,6\n784#1:1306,6\n663#1:1216,6\n663#1:1250\n663#1:1262\n784#1:1285,2\n784#1:1315\n784#1:1329\n225#1:1331\n225#1:1332,2\n227#1:1334\n227#1:1335,2\n228#1:1337\n228#1:1338,2\n612#1:1343\n612#1:1344,2\n687#1:1346\n730#1:1347\n730#1:1348,2\n557#1:1340\n557#1:1341,2\n*E\n"})
public final class VideoFeedScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    private static final String DATA_SORT = "DATA_SORT";

    @NotNull
    private static final String FROM_MOMENT_TAG = "FROM_MOMENT_TAG";

    @NotNull
    private static final String FROM_TYPE = "FROM_TYPE";

    @NotNull
    public static final VideoFeedScreen INSTANCE = new VideoFeedScreen();

    @NotNull
    private static final String PARAM_DATA = "VIDEO_PARAMS_DATA";

    @NotNull
    private static final String TO_USER_ID = "TO_USER_ID";

    @NotNull
    private static final String VIDEO_DETAIL_MODEL = "VIDEO_DETAIL_MODEL";

    @NotNull
    private static final String VIDEO_LIST = "VIDEO_LIST";

    @SourceDebugExtension({"SMAP\nVideoFeedScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$DownloadingArea$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,886:1\n154#2:887\n154#2:919\n154#2:920\n154#2:921\n77#3,2:888\n79#3:918\n83#3:926\n78#4,11:890\n91#4:925\n456#5,8:901\n464#5,3:915\n467#5,3:922\n4144#6,6:909\n*S KotlinDebug\n*F\n+ 1 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$DownloadingArea$3\n*L\n752#1:887\n768#1:919\n772#1:920\n774#1:921\n749#1:888,2\n749#1:918\n749#1:926\n749#1:890,11\n749#1:925\n749#1:901,8\n749#1:915,3\n749#1:922,3\n749#1:909,6\n*E\n"})
    public static final class OooO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f28922OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28923OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(BoxScope boxScope, boolean z) {
            super(3);
            this.f28922OooO0Oo = boxScope;
            this.f28923OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            List listListOf;
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1345095694, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.DownloadingArea.<anonymous> (VideoFeedScreen.kt:748)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(31));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = this.f28922OooO0Oo.align(modifierM511height3ABfNKs, companion2.getBottomStart());
            Brush.Companion companion3 = Brush.INSTANCE;
            if (this.f28923OooO0o0) {
                long j = o0OOo000.f48367oOooo0o;
                listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(Color.m1680copywmQWz5c$default(j, 0.45f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m1671boximpl(j)});
            } else {
                long j2 = o0OOo000.f48367oOooo0o;
                listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(j2), Color.m1671boximpl(Color.m1680copywmQWz5c$default(j2, 0.45f, 0.0f, 0.0f, 0.0f, 14, null))});
            }
            Modifier modifierBackground$default = BackgroundKt.background$default(modifierAlign, Brush.Companion.m1638linearGradientmHitzGk$default(companion3, listListOf, 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierBackground$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(15), null, composer2, 6, 2);
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_video_download_finish, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(19)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composer2, 6, 2);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.video_feed_saved, composer2, 0), (Modifier) null, o0OOo000.f48135OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28925OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f28926OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f28927OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BoxScope boxScope, MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f28926OooO0o0 = boxScope;
            this.f28925OooO0o = mutableState;
            this.f28927OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28927OooO0oO | 1);
            BoxScope boxScope = this.f28926OooO0o0;
            MutableState<Boolean> mutableState = this.f28925OooO0o;
            VideoFeedScreen.this.BottomShadowUI(boxScope, mutableState, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28929OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f28930OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ColumnScope columnScope, int i) {
            super(2);
            this.f28930OooO0o0 = columnScope;
            this.f28929OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28929OooO0o | 1);
            VideoFeedScreen.this.Content(this.f28930OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$DownloadingArea$1$1", f = "VideoFeedScreen.kt", i = {}, l = {733}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f28931OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28932OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28933OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f28933OooO0o0 = mutableState;
            this.f28932OooO0o = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f28933OooO0o0, this.f28932OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28931OooO0Oo;
            MutableState<Boolean> mutableState = this.f28932OooO0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (VideoFeedScreen.DownloadingArea$lambda$48(mutableState)) {
                    this.f28931OooO0Oo = 1;
                    if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            VideoFeedScreen.DownloadingArea$lambda$49(mutableState, false);
            this.f28933OooO0o0.setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f28934OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28935OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Function0<Unit> function0) {
            super(0);
            this.f28935OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28935OooO0Oo.invoke();
            o0oo0000.OooO00o.OooO0O0("103120");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28936OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28938OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f28939OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f28940OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28941OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f28942OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f28943OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(BoxScope boxScope, int i, boolean z, MutableState<Boolean> mutableState, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f28939OooO0o0 = boxScope;
            this.f28938OooO0o = i;
            this.f28940OooO0oO = z;
            this.f28941OooO0oo = mutableState;
            this.f28936OooO = function0;
            this.f28942OooOO0 = i2;
            this.f28943OooOO0O = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VideoFeedScreen.this.DownloadingArea(this.f28939OooO0o0, this.f28938OooO0o, this.f28940OooO0oO, this.f28941OooO0oo, this.f28936OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28942OooOO0 | 1), this.f28943OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28945OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28946OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f28947OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentVideoVM momentVideoVM, int i, int i2) {
            super(2);
            this.f28946OooO0o0 = momentVideoVM;
            this.f28945OooO0o = i;
            this.f28947OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28947OooO0oO | 1);
            MomentVideoVM momentVideoVM = this.f28946OooO0o0;
            int i = this.f28945OooO0o;
            VideoFeedScreen.this.InitObservers(momentVideoVM, i, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVideoFeedScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$InitObservers$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,886:1\n63#2,5:887\n*S KotlinDebug\n*F\n+ 1 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$InitObservers$4\n*L\n876#1:887,5\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ScreenNavigationActivity f28948OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28949OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(ScreenNavigationActivity screenNavigationActivity, MomentVideoVM momentVideoVM) {
            super(1);
            this.f28948OooO0Oo = screenNavigationActivity;
            this.f28949OooO0o0 = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            com.yalla.yalla.ui.screen.moment.media.OooOO0 callback = new com.yalla.yalla.ui.screen.moment.media.OooOO0(this.f28949OooO0o0);
            ScreenNavigationActivity screenNavigationActivity = this.f28948OooO0Oo;
            screenNavigationActivity.getClass();
            Intrinsics.checkNotNullParameter(callback, "callback");
            screenNavigationActivity.f28624OooO0oO.add(callback);
            return new oO0O00o0(screenNavigationActivity, callback);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$MainContent$10", f = "VideoFeedScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28950OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PagerState f28951OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(PagerState pagerState, MomentVideoVM momentVideoVM, Continuation continuation) {
            super(2, continuation);
            this.f28950OooO0Oo = momentVideoVM;
            this.f28951OooO0o0 = pagerState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f28951OooO0o0, this.f28950OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f28950OooO0Oo.preLoadVideo(this.f28951OooO0o0.getSettledPage());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$MainContent$12", f = "VideoFeedScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PagerState f28952OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28953OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28954OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f28955OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Long f28956OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(PagerState pagerState, MomentVideoVM momentVideoVM, int i, long j, Long l, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f28952OooO0Oo = pagerState;
            this.f28954OooO0o0 = momentVideoVM;
            this.f28953OooO0o = i;
            this.f28955OooO0oO = j;
            this.f28956OooO0oo = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f28952OooO0Oo, this.f28954OooO0o0, this.f28953OooO0o, this.f28955OooO0oO, this.f28956OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int currentPage = this.f28952OooO0Oo.getCurrentPage();
            MomentVideoVM momentVideoVM = this.f28954OooO0o0;
            if (currentPage == momentVideoVM.getListData().size() - 2 && momentVideoVM.getLoadMoreState().getValue() == LoadMoreState.Loading) {
                MomentVideoVM.userMomentList$default(this.f28954OooO0o0, this.f28953OooO0o, false, this.f28955OooO0oO, this.f28956OooO0oo, null, 16, null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$MainContent$11", f = "VideoFeedScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PagerState f28957OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28958OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(PagerState pagerState, MomentVideoVM momentVideoVM, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f28957OooO0Oo = pagerState;
            this.f28958OooO0o0 = momentVideoVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f28957OooO0Oo, this.f28958OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            PagerState pagerState = this.f28957OooO0Oo;
            int currentPage = pagerState.getCurrentPage();
            int settledPage = pagerState.getSettledPage();
            MomentVideoVM momentVideoVM = this.f28958OooO0o0;
            if (currentPage != settledPage) {
                momentVideoVM.getShowUpDownGuide().setValue(Boxing.boxBoolean(false));
                oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
                oo0ooo0oOooO0o0.OooO0o("videoUpDownSlideGuide" + oo0ooo0oOooO0o0.f46400OooO0OO, false);
            }
            if (momentVideoVM.getListData().size() > pagerState.getCurrentPage()) {
                momentVideoVM.getCurrentPage().setValue(pagerState.getCurrentPage());
                momentVideoVM.setCurrentMomentDetail(momentVideoVM.getListData().get(momentVideoVM.getCurrentPage().getValue().intValue()));
            }
            int currentPage2 = pagerState.getCurrentPage();
            int settledPage2 = pagerState.getSettledPage();
            int size = momentVideoVM.getListData().size();
            Integer value = momentVideoVM.getCurrentPage().getValue();
            String strOooO00o = p187o00o00o0.OooO.OooO00o(momentVideoVM.getCurrentMomentDetail());
            StringBuilder sbOooO00o = p041Ooooo0o.o00000.OooO00o("WRM PageState LaunchedEffect \npagerState.currentPage = ", currentPage2, ", pagerState.settledPage = ", settledPage2, "\nvideoViewModel.listData.size = ");
            sbOooO00o.append(size);
            sbOooO00o.append(" \npage = ");
            sbOooO00o.append(value);
            sbOooO00o.append(" \n≈= ");
            sbOooO00o.append(strOooO00o);
            p598o0oo00Oo.o0000O00.OooO0o(sbOooO00o.toString());
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Boolean, Boolean, ThresholdConfig> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f28959OooO0Oo = new Oooo0();

        public Oooo0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final ThresholdConfig invoke(Boolean bool, Boolean bool2) {
            bool.booleanValue();
            bool2.booleanValue();
            return new FractionalThreshold(1.0f);
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Boolean, Boolean, ThresholdConfig> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f28960OooO0Oo = new Oooo000();

        public Oooo000() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final ThresholdConfig invoke(Boolean bool, Boolean bool2) {
            bool.booleanValue();
            bool2.booleanValue();
            return new FractionalThreshold(0.5f);
        }
    }

    public static final class o0000 extends Lambda implements Function1<o00O000, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<o00O000> f28961OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000(MutableState<o00O000> mutableState) {
            super(1);
            this.f28961OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00O000 o00o001) {
            o00O000 it = o00o001;
            Intrinsics.checkNotNullParameter(it, "it");
            VideoFeedScreen.PagerItem$lambda$42$lambda$39(this.f28961OooO0Oo, it);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28962OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Function0<Unit>> f28963OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(MomentVideoVM momentVideoVM, Ref.ObjectRef<Function0<Unit>> objectRef) {
            super(0);
            this.f28962OooO0Oo = momentVideoVM;
            this.f28963OooO0o0 = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentVideoVM momentVideoVM = this.f28962OooO0Oo;
            if (!momentVideoVM.getShowUpDownGuide().getValue().booleanValue()) {
                oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
                if (oo0ooo0oOooO0o0.OooO0O0("videoUpDownSlideGuide" + oo0ooo0oOooO0o0.f46400OooO0OO, true)) {
                    momentVideoVM.getShowUpDownGuide().setValue(Boolean.TRUE);
                    this.f28963OooO0o0.element = null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PagerState f28964OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28965OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(PagerState pagerState, MomentVideoVM momentVideoVM) {
            super(1);
            this.f28964OooO0Oo = pagerState;
            this.f28965OooO0o0 = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            p598o0oo00Oo.o0000O00.OooO0o("loadRefreshState currentValue is " + zBooleanValue);
            if (zBooleanValue && this.f28964OooO0Oo.getCurrentPage() == 0 && !this.f28965OooO0o0.getShowDialogComment().getValue().booleanValue()) {
                o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.video_feed_no_more));
            }
            return Boolean.FALSE;
        }
    }

    public static final class o000000O extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28966OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(MomentVideoVM momentVideoVM) {
            super(0);
            this.f28966OooO0Oo = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f28966OooO0Oo.getListData().size());
        }
    }

    public static final class o00000O extends Lambda implements Function1<Density, IntOffset> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<Boolean> f28967OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O(SwipeableState<Boolean> swipeableState) {
            super(1);
            this.f28967OooO0Oo = swipeableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(Density density) {
            Density offset = density;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m3884boximpl(IntOffsetKt.IntOffset(0, MathKt.roundToInt(this.f28967OooO0Oo.getOffset().getValue().floatValue())));
        }
    }

    public static final class o00000O0 extends Lambda implements Function3<String, Boolean, Float, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Set<String> f28968OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Function3<String, Boolean, Float, Unit>> f28969OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28970OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(Set<String> set, MomentVideoVM momentVideoVM, Ref.ObjectRef<Function3<String, Boolean, Float, Unit>> objectRef) {
            super(3);
            this.f28968OooO0Oo = set;
            this.f28970OooO0o0 = momentVideoVM;
            this.f28969OooO0o = objectRef;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(String str, Boolean bool, Float f) {
            String url = str;
            bool.booleanValue();
            float fFloatValue = f.floatValue();
            Intrinsics.checkNotNullParameter(url, "url");
            Set<String> set = this.f28968OooO0Oo;
            set.add(url);
            p598o0oo00Oo.o0000O00.OooO0O0("videoWatchSet size is:" + set.size() + ",videoProgress is :" + fFloatValue);
            if (set.size() > 5 && fFloatValue >= 0.9f) {
                MomentVideoVM momentVideoVM = this.f28970OooO0o0;
                if (!momentVideoVM.getShowSwipe().getValue().booleanValue()) {
                    oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
                    if (oo0ooo0oOooO0o0.OooO0O0("videoSwipeGuide" + oo0ooo0oOooO0o0.f46400OooO0OO, true)) {
                        momentVideoVM.getShowSwipe().setValue(Boolean.TRUE);
                        this.f28969OooO0o.element = null;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$PagerItem$4", f = "VideoFeedScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000OO extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28971OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28972OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f28973OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f28974OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f28975OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000OO(boolean z, AppCompatActivity appCompatActivity, MomentVideoVM momentVideoVM, MutableFloatState mutableFloatState, MomentDetailModel momentDetailModel, Continuation<? super o00000OO> continuation) {
            super(3, continuation);
            this.f28971OooO0Oo = z;
            this.f28973OooO0o0 = appCompatActivity;
            this.f28972OooO0o = momentVideoVM;
            this.f28974OooO0oO = mutableFloatState;
            this.f28975OooO0oo = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
            f.floatValue();
            return new o00000OO(this.f28971OooO0Oo, this.f28973OooO0o0, this.f28972OooO0o, this.f28974OooO0oO, this.f28975OooO0oo, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableFloatState mutableFloatState = this.f28974OooO0oO;
            if (!(VideoFeedScreen.PagerItem$lambda$31(mutableFloatState) == 0.0f) && ((!(z = this.f28971OooO0Oo) && VideoFeedScreen.PagerItem$lambda$31(mutableFloatState) < -300.0f) || (z && VideoFeedScreen.PagerItem$lambda$31(mutableFloatState) > 300.0f))) {
                AppCompatActivity appCompatActivity = this.f28973OooO0o0;
                if (appCompatActivity != null) {
                    UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, appCompatActivity, androidx.media3.session.o0000O00.OooO00o(this.f28975OooO0oo.getUserId()), false, 12);
                }
                this.f28972OooO0o.showSwipeGuideDone();
            }
            VideoFeedScreen.PagerItem$lambda$32(mutableFloatState, 0.0f);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O0 extends Lambda implements Function1<MomentDetailModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f28976OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0000O0(Function1<? super MomentDetailModel, Unit> function1) {
            super(1);
            this.f28976OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel it = momentDetailModel;
            Intrinsics.checkNotNullParameter(it, "it");
            Function1<MomentDetailModel, Unit> function1 = this.f28976OooO0Oo;
            if (function1 != null) {
                function1.invoke(it);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Set<String> f28977OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28979OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f28980OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PagerState f28981OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28982OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<Boolean> f28983OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f28984OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MomentPraiseVM f28985OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28986OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ MomentGiftsVM f28987OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f28988OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f28989OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ int f28990OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f28991OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final /* synthetic */ int f28992OooOOoo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0000O00(MomentDetailModel momentDetailModel, int i, PagerState pagerState, MomentVideoVM momentVideoVM, Set<String> set, SwipeableState<Boolean> swipeableState, MomentCommentsVM momentCommentsVM, MomentPraiseVM momentPraiseVM, MomentGiftsVM momentGiftsVM, MutableState<Boolean> mutableState, MutableState<Integer> mutableState2, Function1<? super MomentDetailModel, Unit> function1, int i2, int i3, int i4) {
            super(2);
            this.f28980OooO0o0 = momentDetailModel;
            this.f28979OooO0o = i;
            this.f28981OooO0oO = pagerState;
            this.f28982OooO0oo = momentVideoVM;
            this.f28977OooO = set;
            this.f28983OooOO0 = swipeableState;
            this.f28984OooOO0O = momentCommentsVM;
            this.f28985OooOO0o = momentPraiseVM;
            this.f28987OooOOO0 = momentGiftsVM;
            this.f28986OooOOO = mutableState;
            this.f28988OooOOOO = mutableState2;
            this.f28989OooOOOo = function1;
            this.f28991OooOOo0 = i2;
            this.f28990OooOOo = i3;
            this.f28992OooOOoo = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VideoFeedScreen.this.PagerItem(this.f28980OooO0o0, this.f28979OooO0o, this.f28981OooO0oO, this.f28982OooO0oo, this.f28977OooO, this.f28983OooOO0, this.f28984OooOO0O, this.f28985OooOO0o, this.f28987OooOOO0, this.f28986OooOOO, this.f28988OooOOOO, this.f28989OooOOOo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28991OooOOo0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.f28990OooOOo), this.f28992OooOOoo);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentPraiseVM f28993OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f28995OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f28996OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28997OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f28998OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MomentGiftsVM f28999OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29000OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29001OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f29002OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f29003OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f29004OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f29005OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f29006OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0000O0O(BoxScope boxScope, MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentPraiseVM momentPraiseVM, MomentGiftsVM momentGiftsVM, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, boolean z, Function1<? super MomentDetailModel, Unit> function1, int i, int i2, int i3) {
            super(2);
            this.f28996OooO0o0 = boxScope;
            this.f28995OooO0o = momentDetailModel;
            this.f28997OooO0oO = momentVideoVM;
            this.f28998OooO0oo = momentCommentsVM;
            this.f28993OooO = momentPraiseVM;
            this.f28999OooOO0 = momentGiftsVM;
            this.f29000OooOO0O = mutableState;
            this.f29001OooOO0o = mutableState2;
            this.f29003OooOOO0 = z;
            this.f29002OooOOO = function1;
            this.f29004OooOOOO = i;
            this.f29005OooOOOo = i2;
            this.f29006OooOOo0 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VideoFeedScreen.this.VideoOverLayUI(this.f28996OooO0o0, this.f28995OooO0o, this.f28997OooO0oO, this.f28998OooO0oo, this.f28993OooO, this.f28999OooOO0, this.f29000OooOO0O, this.f29001OooOO0o, this.f29003OooOOO0, this.f29002OooOOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29004OooOOOO | 1), RecomposeScopeImplKt.updateChangedFlags(this.f29005OooOOOo), this.f29006OooOOo0);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000Ooo extends Lambda implements Function1<MomentDetailModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f29007OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0000Ooo(Function1<? super MomentDetailModel, Unit> function1) {
            super(1);
            this.f29007OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel it = momentDetailModel;
            Intrinsics.checkNotNullParameter(it, "it");
            Function1<MomentDetailModel, Unit> function1 = this.f29007OooO0Oo;
            if (function1 != null) {
                function1.invoke(it);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0000oo extends Lambda implements Function1<Float, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f29008OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000oo(MutableFloatState mutableFloatState) {
            super(1);
            this.f29008OooO0Oo = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f) {
            float fFloatValue = f.floatValue();
            MutableFloatState mutableFloatState = this.f29008OooO0Oo;
            VideoFeedScreen.PagerItem$lambda$32(mutableFloatState, VideoFeedScreen.PagerItem$lambda$31(mutableFloatState) + fFloatValue);
            p598o0oo00Oo.o0000O00.OooO0Oo("offsetX is " + VideoFeedScreen.PagerItem$lambda$31(mutableFloatState) + ", delta is " + fFloatValue);
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Long f29009OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f29010OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PagerState f29011OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f29012OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f29013OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f29014OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(int i, CoroutineScope coroutineScope, PagerState pagerState, MomentVideoVM momentVideoVM, long j, Long l) {
            super(1);
            this.f29010OooO0Oo = i;
            this.f29012OooO0o0 = coroutineScope;
            this.f29011OooO0o = pagerState;
            this.f29013OooO0oO = momentVideoVM;
            this.f29014OooO0oo = j;
            this.f29009OooO = l;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            if (bool.booleanValue()) {
                int i = this.f29010OooO0Oo;
                if (i == 4) {
                    o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.video_feed_no_more));
                } else {
                    CoroutineScope coroutineScope = this.f29012OooO0o0;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.yalla.yalla.ui.screen.moment.media.OooOo(this.f29011OooO0o, this.f29013OooO0oO, i, this.f29014OooO0oo, this.f29009OooO, coroutineScope, null), 3, null);
                }
            }
            return Boolean.TRUE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentPraiseVM f29015OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f29016OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Set<String> f29017OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PagerState f29018OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<Boolean> f29019OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f29020OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MomentGiftsVM f29021OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29022OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f29023OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f29024OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29025OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29026OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MomentVideoVM momentVideoVM, PagerState pagerState, Set<String> set, SwipeableState<Boolean> swipeableState, MomentCommentsVM momentCommentsVM, MomentPraiseVM momentPraiseVM, MomentGiftsVM momentGiftsVM, MutableState<Boolean> mutableState, AppCompatActivity appCompatActivity, MutableState<Boolean> mutableState2, MutableIntState mutableIntState, MutableState<Boolean> mutableState3) {
            super(4);
            this.f29016OooO0Oo = momentVideoVM;
            this.f29018OooO0o0 = pagerState;
            this.f29017OooO0o = set;
            this.f29019OooO0oO = swipeableState;
            this.f29020OooO0oo = momentCommentsVM;
            this.f29015OooO = momentPraiseVM;
            this.f29021OooOO0 = momentGiftsVM;
            this.f29022OooOO0O = mutableState;
            this.f29023OooOO0o = appCompatActivity;
            this.f29025OooOOO0 = mutableState2;
            this.f29024OooOOO = mutableIntState;
            this.f29026OooOOOO = mutableState3;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
            PagerScope VerticalPager = pagerScope;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(VerticalPager, "$this$VerticalPager");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(922318858, iIntValue2, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.MainContent.<anonymous>.<anonymous> (VideoFeedScreen.kt:422)");
            }
            VideoFeedScreen videoFeedScreen = VideoFeedScreen.INSTANCE;
            MomentVideoVM momentVideoVM = this.f29016OooO0Oo;
            videoFeedScreen.PagerItem(momentVideoVM.getListData().get(iIntValue), iIntValue, this.f29018OooO0o0, momentVideoVM, this.f29017OooO0o, this.f29019OooO0oO, this.f29020OooO0oo, this.f29015OooO, this.f29021OooOO0, this.f29022OooOO0O, momentVideoVM.getRefreshIndex(), new com.yalla.yalla.ui.screen.moment.media.OooOOOO(this.f29023OooOO0o, this.f29025OooOOO0, this.f29022OooOO0O, this.f29024OooOOO, this.f29026OooOOOO), composer2, (iIntValue2 & 112) | 958435336, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f29027OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f29028OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f29029OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(MomentVideoVM momentVideoVM, MomentAdapterTag momentAdapterTag, AppCompatActivity appCompatActivity) {
            super(3);
            this.f29027OooO0Oo = momentVideoVM;
            this.f29029OooO0o0 = momentAdapterTag;
            this.f29028OooO0o = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope Toolbar = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-647633350, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.MainContent.<anonymous>.<anonymous> (VideoFeedScreen.kt:481)");
                }
                o0O0oo0o.OooO0OO(p562o0oOo000.o0O0O00.ic_video_more, false, new com.yalla.yalla.ui.screen.moment.media.OooOo00(this.f29027OooO0Oo, this.f29029OooO0o0, this.f29028OooO0o), composer2, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f29030OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function3<Boolean, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f29031OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PagerState f29032OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(PagerState pagerState, MomentVideoVM momentVideoVM) {
            super(3);
            this.f29031OooO0Oo = momentVideoVM;
            this.f29032OooO0o0 = pagerState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Boolean bool, Composer composer, Integer num) {
            boolean zBooleanValue = bool.booleanValue();
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(zBooleanValue) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2124673532, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.MainContent.<anonymous>.<anonymous> (VideoFeedScreen.kt:513)");
                }
                if (zBooleanValue) {
                    composer2.startReplaceableGroup(1807588346);
                    MomentDetailModel currentMomentDetail = this.f29031OooO0Oo.getCurrentMomentDetail();
                    p519o0o0O0OO.o0OOo000.OooO00o(currentMomentDetail != null ? currentMomentDetail.getPlayNum() : 0, 0, 2, composer2, null);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1807588505);
                    o0oO0Ooo.OooO00o(true, this.f29032OooO0o0.isScrollInProgress(), null, null, composer2, 6, 12);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f29034OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(int i) {
            super(2);
            this.f29034OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29034OooO0o0 | 1);
            VideoFeedScreen.this.MainContent(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$MainContent$9$1", f = "VideoFeedScreen.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0O0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f29035OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<Boolean> f29036OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(SwipeableState<Boolean> swipeableState, Continuation<? super o0O0O00> continuation) {
            super(2, continuation);
            this.f29036OooO0o0 = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0O0O00(this.f29036OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0O0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29035OooO0Oo;
            SwipeableState<Boolean> swipeableState = this.f29036OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p598o0oo00Oo.o0000O00.OooO0o("loadMoreState currentValue is " + swipeableState.getCurrentValue());
                if (swipeableState.getCurrentValue().booleanValue()) {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                    this.f29035OooO0Oo = 1;
                    if (swipeableState.snapTo(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            p598o0oo00Oo.o0000O00.OooO0o("loadMoreState animateTo is " + swipeableState.getCurrentValue());
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVideoFeedScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$MainContent$7\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,886:1\n63#2,5:887\n*S KotlinDebug\n*F\n+ 1 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$MainContent$7\n*L\n321#1:887,5\n*E\n"})
    public static final class o0OO00O extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OO00O f29037OooO0Oo = new o0OO00O();

        public o0OO00O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            ScreenNavigationActivity screenNavigationActivity = activityOooO0O0 instanceof ScreenNavigationActivity ? (ScreenNavigationActivity) activityOooO0O0 : null;
            if (screenNavigationActivity != null) {
                screenNavigationActivity.f28623OooO0o.setValue(Boolean.FALSE);
            }
            return new oO0O00oO(screenNavigationActivity);
        }
    }

    public static final class o0OOO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OOO0o f29038OooO0Oo = new o0OOO0o();

        public o0OOO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z = oO0O00.f53970OooO00o;
            oO0O00.OooO0oo(true);
            com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48579OooO0Oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0Oo0oo f29039OooO0Oo = new o0Oo0oo();

        public o0Oo0oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z = oO0O00.f53970OooO00o;
            oO0O00.OooO0Oo(true);
            com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48579OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29040OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29041OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
            super(0);
            this.f29040OooO0Oo = mutableState;
            this.f29041OooO0o0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VideoDownLoadManager.INSTANCE.cancelDownLoadJob();
            this.f29040OooO0Oo.setValue(Boolean.FALSE);
            VideoFeedScreen.MainContent$lambda$19(this.f29041OooO0o0, true);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$MainContent$4$1", f = "VideoFeedScreen.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f29042OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<Boolean> f29043OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(SwipeableState<Boolean> swipeableState, Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
            this.f29043OooO0o0 = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0ooOOo(this.f29043OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29042OooO0Oo;
            SwipeableState<Boolean> swipeableState = this.f29043OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p598o0oo00Oo.o0000O00.OooO0o("loadRefreshState currentValue is " + swipeableState.getCurrentValue());
                if (swipeableState.getCurrentValue().booleanValue()) {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                    this.f29042OooO0Oo = 1;
                    if (swipeableState.snapTo(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            p598o0oo00Oo.o0000O00.OooO0o("loadRefreshState animateTo is " + swipeableState.getCurrentValue());
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f29044OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(MomentVideoVM momentVideoVM) {
            super(0);
            this.f29044OooO0Oo = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29044OooO0Oo.setHalfDialogWebPageInfo(WebPageInfo.f32279OooOOo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$MainContent$8", f = "VideoFeedScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo0o0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Long f29045OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f29046OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f29047OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f29048OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Bundle f29049OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f29050OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(AppCompatActivity appCompatActivity, int i, MomentVideoVM momentVideoVM, Bundle bundle, long j, Long l, Continuation<? super oo0o0Oo> continuation) {
            super(2, continuation);
            this.f29046OooO0Oo = appCompatActivity;
            this.f29048OooO0o0 = i;
            this.f29047OooO0o = momentVideoVM;
            this.f29049OooO0oO = bundle;
            this.f29050OooO0oo = j;
            this.f29045OooO = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new oo0o0Oo(this.f29046OooO0Oo, this.f29048OooO0o0, this.f29047OooO0o, this.f29049OooO0oO, this.f29050OooO0oo, this.f29045OooO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((oo0o0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Window window;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppCompatActivity appCompatActivity = this.f29046OooO0Oo;
            if (appCompatActivity != null && (window = appCompatActivity.getWindow()) != null) {
                window.addFlags(128);
            }
            if (this.f29048OooO0o0 == 0) {
                Object obj2 = this.f29049OooO0oO.get(VideoFeedScreen.DATA_SORT);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj2).longValue();
                MomentVideoVM momentVideoVM = this.f29047OooO0o;
                momentVideoVM.setDateSort(jLongValue);
                int initialPage = momentVideoVM.getInitialPage();
                ArrayList<MomentDetailModel> startVideoList = momentVideoVM.getStartVideoList();
                if (initialPage < (startVideoList != null ? startVideoList.size() : 0)) {
                    momentVideoVM.getCurrentPage().setIntValue(momentVideoVM.getInitialPage());
                    ArrayList<MomentDetailModel> startVideoList2 = momentVideoVM.getStartVideoList();
                    momentVideoVM.setCurrentMomentDetail(startVideoList2 != null ? startVideoList2.get(momentVideoVM.getCurrentPage().getIntValue()) : null);
                }
            }
            MomentVideoVM.userMomentList$default(this.f29047OooO0o, this.f29048OooO0o0, true, this.f29050OooO0oo, this.f29045OooO, null, 16, null);
            return Unit.INSTANCE;
        }
    }

    private VideoFeedScreen() {
    }

    private static final float BottomShadowUI$lambda$46(State<Dp> state) {
        return state.getValue().m3789unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DownloadingArea$lambda$48(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DownloadingArea$lambda$49(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final void InitObservers(final MomentVideoVM momentVideoVM, final int i, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1694422711);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1694422711, i2, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.InitObservers (VideoFeedScreen.kt:821)");
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type com.yalla.yalla.ui.screen.ScreenNavigationActivity");
        Observable<Object> observable = LiveEventBus.get("USER_ADD_BLACKLISTED");
        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
        o00O0000.OooO00o(observable, new m3(momentVideoVM, 4), composerStartRestartGroup, 72);
        Observable<Object> observable2 = LiveEventBus.get("SHARE_VIDEO_POST_SUCCESS");
        Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
        o00O0000.OooO00o(observable2, new p519o0o0O0OO.o00O000(momentVideoVM, 1), composerStartRestartGroup, 72);
        Observable<Object> observable3 = LiveEventBus.get("MOMENT_POST_DELETE");
        Intrinsics.checkNotNullExpressionValue(observable3, "get(...)");
        o00O0000.OooO00o(observable3, new Observer() { // from class: o0o0Oo0.oO0O00O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                VideoFeedScreen.InitObservers$lambda$58(momentVideoVM, i, (MomentDetailModel) obj);
            }
        }, composerStartRestartGroup, 72);
        EffectsKt.DisposableEffect(Unit.INSTANCE, new OooOOO0((ScreenNavigationActivity) objConsume, momentVideoVM), composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(momentVideoVM, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InitObservers$lambda$55(MomentVideoVM vm, long j) {
        Intrinsics.checkNotNullParameter(vm, "$vm");
        MomentDetailModel momentDetailModel = null;
        for (MomentDetailModel momentDetailModel2 : vm.getListData()) {
            if (momentDetailModel2.getUserId() == j) {
                momentDetailModel2.setFollow(false);
                momentDetailModel = momentDetailModel2;
            }
        }
        if (momentDetailModel != null) {
            LiveEventBus.get("POST_DETAIL_DATA_REFRESH_PART").post(momentDetailModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InitObservers$lambda$57(MomentVideoVM vm, long j) {
        Intrinsics.checkNotNullParameter(vm, "$vm");
        for (MomentDetailModel momentDetailModel : vm.getListData()) {
            if (momentDetailModel.getId() == j) {
                momentDetailModel.setShareNum(momentDetailModel.getShareNum() + 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InitObservers$lambda$58(MomentVideoVM vm, int i, MomentDetailModel detailModel) {
        Intrinsics.checkNotNullParameter(vm, "$vm");
        Intrinsics.checkNotNullParameter(detailModel, "detailModel");
        vm.deleteItem(detailModel.getId());
        if (i == 0 && vm.getListData().size() == 0) {
            o00O00.OooO0o(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContent(Composer composer, int i) {
        int i2;
        MomentVideoVM momentVideoVM;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-698881823);
        int i3 = (i & 14) == 0 ? (composerStartRestartGroup.changed(this) ? 4 : 2) | i : i;
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-698881823, i3, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.MainContent (VideoFeedScreen.kt:205)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM2 = (MomentVideoVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(MomentCommentsVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentCommentsVM momentCommentsVM = (MomentCommentsVM) viewModel2;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current3 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel3 = ViewModelKt.viewModel(MomentPraiseVM.class, current3, null, null, current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentPraiseVM momentPraiseVM = (MomentPraiseVM) viewModel3;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current4 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current4 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel4 = ViewModelKt.viewModel(MomentGiftsVM.class, current4, null, null, current4 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current4).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentGiftsVM momentGiftsVM = (MomentGiftsVM) viewModel4;
            Bundle bundleOooO0O0 = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = bundleOooO0O0.get(PARAM_DATA);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
                objRememberedValue = Long.valueOf(((Long) obj).longValue());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            long jLongValue = ((Number) objRememberedValue).longValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = bundleOooO0O0.get(FROM_TYPE);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                objRememberedValue2 = Integer.valueOf(((Integer) obj2).intValue());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int iIntValue = ((Number) objRememberedValue2).intValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = bundleOooO0O0.get(TO_USER_ID);
                objRememberedValue3 = obj3 instanceof Long ? (Long) obj3 : null;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Long l = (Long) objRememberedValue3;
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            AppCompatActivity appCompatActivity = objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null;
            float f = 70;
            float fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl(f));
            float fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged4 = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = (MomentAdapterTag) bundleOooO0O0.getSerializable(FROM_MOMENT_TAG);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MomentAdapterTag momentAdapterTag = (MomentAdapterTag) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState<Boolean> mutableState = (MutableState) objRememberedValue5;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue6;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                i2 = 2;
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                i2 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue7;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, i2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new LinkedHashSet();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Set set = (Set) objRememberedValue9;
            if (iIntValue == 0) {
                momentVideoVM = momentVideoVM2;
                composerStartRestartGroup.startReplaceableGroup(1080473974);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged5 = composerStartRestartGroup.changed(bundleOooO0O0);
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged5 || objRememberedValue10 == companion.getEmpty()) {
                    String string = bundleOooO0O0.getString(VIDEO_LIST);
                    if (string != null) {
                        Type type = new TypeToken<List<? extends MomentDetailModel>>() { // from class: com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$MainContent$1$1
                        }.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        objRememberedValue10 = (ArrayList) p187o00o00o0.OooO.OooO0OO(string, type);
                    } else {
                        objRememberedValue10 = null;
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    momentAdapterTag = momentAdapterTag;
                }
                composerStartRestartGroup.endReplaceableGroup();
                momentVideoVM.setStartVideoList((ArrayList) objRememberedValue10);
                ArrayList<MomentDetailModel> startVideoList = momentVideoVM.getStartVideoList();
                if (startVideoList != null) {
                    int i4 = 0;
                    for (Object obj4 : startVideoList) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((MomentDetailModel) obj4).getId() == jLongValue) {
                            momentVideoVM.setInitialPage(i4);
                        }
                        i4 = i5;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
            } else if (iIntValue == 2 || iIntValue == 4) {
                composerStartRestartGroup.startReplaceableGroup(1080474499);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged6 = composerStartRestartGroup.changed(bundleOooO0O0);
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged6 || objRememberedValue11 == companion.getEmpty()) {
                    Object serializable = bundleOooO0O0.getSerializable(VIDEO_DETAIL_MODEL);
                    Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.yalla.yalla.model.moment.MomentDetailModel");
                    objRememberedValue11 = (MomentDetailModel) serializable;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceableGroup();
                momentVideoVM = momentVideoVM2;
                momentVideoVM.setStartVideo((MomentDetailModel) objRememberedValue11);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit3 = Unit.INSTANCE;
                momentAdapterTag = momentAdapterTag;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1080474680);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit4 = Unit.INSTANCE;
                momentAdapterTag = momentAdapterTag;
                momentVideoVM = momentVideoVM2;
            }
            Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objOooO00o == companion2.getEmpty()) {
                objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM3 = momentVideoVM;
            MomentAdapterTag momentAdapterTag2 = momentAdapterTag;
            AppCompatActivity appCompatActivity2 = appCompatActivity;
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(momentVideoVM.getInitialPage(), 0.0f, new o000000O(momentVideoVM), composerStartRestartGroup, 0, 2);
            InitObservers(momentVideoVM3, iIntValue, composerStartRestartGroup, ((i3 << 6) & 896) | 8);
            Boolean bool = Boolean.FALSE;
            SwipeableState swipeableStateRememberSwipeableState = SwipeableKt.rememberSwipeableState(bool, null, new o000000(pagerStateRememberPagerState, momentVideoVM3), composerStartRestartGroup, 6, 2);
            Object currentValue = swipeableStateRememberSwipeableState.getCurrentValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged7 = composerStartRestartGroup.changed(swipeableStateRememberSwipeableState);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue12 == companion2.getEmpty()) {
                objRememberedValue12 = new o0ooOOo(swipeableStateRememberSwipeableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(currentValue, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, 64);
            SwipeableState swipeableStateRememberSwipeableState2 = SwipeableKt.rememberSwipeableState(bool, null, new o000OOo(iIntValue, coroutineScope, pagerStateRememberPagerState, momentVideoVM3, jLongValue, l), composerStartRestartGroup, 6, 2);
            com.code.android.util.o00Oo0.OooO00o(Lifecycle.Event.ON_STOP, o0OOO0o.f29038OooO0Oo, composerStartRestartGroup, 54);
            com.code.android.util.o00Oo0.OooO00o(Lifecycle.Event.ON_RESUME, o0Oo0oo.f29039OooO0Oo, composerStartRestartGroup, 54);
            Unit unit5 = Unit.INSTANCE;
            EffectsKt.DisposableEffect(unit5, o0OO00O.f29037OooO0Oo, composerStartRestartGroup, 54);
            EffectsKt.LaunchedEffect(unit5, new oo0o0Oo(appCompatActivity2, iIntValue, momentVideoVM3, bundleOooO0O0, jLongValue, l, null), composerStartRestartGroup, 70);
            Object currentValue2 = swipeableStateRememberSwipeableState2.getCurrentValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged8 = composerStartRestartGroup.changed(swipeableStateRememberSwipeableState2);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChanged8 || objRememberedValue13 == companion2.getEmpty()) {
                objRememberedValue13 = new o0O0O00(swipeableStateRememberSwipeableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(currentValue2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composerStartRestartGroup, 64);
            EffectsKt.LaunchedEffect(Integer.valueOf(pagerStateRememberPagerState.getSettledPage()), Integer.valueOf(momentVideoVM3.getListData().size()), new OooOOOO(pagerStateRememberPagerState, momentVideoVM3, null), composerStartRestartGroup, ConstantsKt.MINIMUM_BLOCK_SIZE);
            EffectsKt.LaunchedEffect(Integer.valueOf(pagerStateRememberPagerState.getCurrentPage()), new OooOo00(pagerStateRememberPagerState, momentVideoVM3, null), composerStartRestartGroup, 64);
            EffectsKt.LaunchedEffect(Integer.valueOf(pagerStateRememberPagerState.getCurrentPage()), momentVideoVM3.getLoadMoreState().getValue(), new OooOo(pagerStateRememberPagerState, momentVideoVM3, iIntValue, jLongValue, l, null), composerStartRestartGroup, ConstantsKt.MINIMUM_BLOCK_SIZE);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            int i6 = o00O0O0O.f38703OooO00o;
            Intrinsics.checkNotNullParameter(swipeableStateRememberSwipeableState, "<this>");
            Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion3, new o00O0O0(swipeableStateRememberSwipeableState), null, 2, null);
            Float fValueOf = Float.valueOf(fMo326toPx0680j_5);
            Boolean bool2 = Boolean.TRUE;
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), bool), TuplesKt.to(fValueOf, bool2));
            Orientation orientation = Orientation.Vertical;
            Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(modifierNestedScroll$default, swipeableStateRememberSwipeableState, mapMapOf, orientation, (440 & 8) != 0, (440 & 16) != 0 ? false : false, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : Oooo000.f28960OooO0Oo, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
            Intrinsics.checkNotNullParameter(swipeableStateRememberSwipeableState2, "<this>");
            Modifier modifierNestedScroll$default2 = NestedScrollModifierKt.nestedScroll$default(modifierM1211swipeablepPrIpRY, new o00O0O00(swipeableStateRememberSwipeableState2), null, 2, null);
            Map mapMapOf2 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), bool), TuplesKt.to(Float.valueOf(-fMo326toPx0680j_4), bool2));
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(SwipeableKt.m1211swipeablepPrIpRY(modifierNestedScroll$default2, swipeableStateRememberSwipeableState2, mapMapOf2, orientation, (440 & 8) != 0, (440 & 16) != 0 ? false : false, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : Oooo0.f28959OooO0Oo, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf2.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion4, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            PagerKt.m689VerticalPagerxYaah8o(pagerStateRememberPagerState, PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(56), 7, null), null, null, 1, 0.0f, null, null, false, false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 922318858, true, new o000oOoO(momentVideoVM3, pagerStateRememberPagerState, set, swipeableStateRememberSwipeableState2, momentCommentsVM, momentPraiseVM, momentGiftsVM, mutableState, appCompatActivity2, mutableState3, mutableIntState, mutableState2)), composerStartRestartGroup, 24624, 384, 4076);
            composer2.startReplaceableGroup(-840462279);
            if (mutableState.getValue().booleanValue()) {
                VideoFeedScreen videoFeedScreen = INSTANCE;
                int intValue = mutableIntState.getIntValue();
                boolean zMainContent$lambda$15 = MainContent$lambda$15(mutableState2);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged9 = composer2.changed(mutableState) | composer2.changed(mutableState3);
                Object objRememberedValue14 = composer2.rememberedValue();
                if (zChanged9 || objRememberedValue14 == companion2.getEmpty()) {
                    objRememberedValue14 = new o0OoOo0(mutableState, mutableState3);
                    composer2.updateRememberedValue(objRememberedValue14);
                }
                composer2.endReplaceableGroup();
                videoFeedScreen.DownloadingArea(boxScopeInstance, intValue, zMainContent$lambda$15, mutableState, (Function0) objRememberedValue14, composer2, 199686, 0);
            }
            composer2.endReplaceableGroup();
            o0O0oo0o.OooO00o(null, 0.0f, 0L, null, Integer.valueOf(p562o0oOo000.o0O0O00.ic_video_back), null, null, ComposableLambdaKt.composableLambda(composer2, -647633350, true, new o00O0O(momentVideoVM3, momentAdapterTag2, appCompatActivity2)), com.code.android.util.o0O0O00.OooO0O0(companion3, false, false, 0L, false, null, null, null, o00Oo0.f29030OooO0Oo, 253), composer2, 12582912, 111);
            MomentDetailModel currentMomentDetail = momentVideoVM3.getCurrentMomentDetail();
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged10 = composer2.changed(currentMomentDetail);
            Object objRememberedValue15 = composer2.rememberedValue();
            if (zChanged10 || objRememberedValue15 == companion2.getEmpty()) {
                MomentDetailModel currentMomentDetail2 = momentVideoVM3.getCurrentMomentDetail();
                Long lValueOf = currentMomentDetail2 != null ? Long.valueOf(currentMomentDetail2.getUserId()) : null;
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                objRememberedValue15 = Boolean.valueOf(Intrinsics.areEqual(lValueOf, o0O00oO0.OooOOo0().getValue()));
                composer2.updateRememberedValue(objRememberedValue15);
            }
            composer2.endReplaceableGroup();
            CrossfadeKt.Crossfade(Boolean.valueOf(((Boolean) objRememberedValue15).booleanValue()), boxScopeInstance.align(companion3, companion4.getBottomCenter()), (FiniteAnimationSpec<Float>) null, "", ComposableLambdaKt.composableLambda(composer2, 2124673532, true, new o00Ooo(pagerStateRememberPagerState, momentVideoVM3)), composer2, 27648, 4);
            o0.f53626OooO00o.OooO0O0(composer2, 6);
            oO000Oo.f53881OooO00o.OooO0OO(composer2, 6);
            o0OOO0OO o0ooo0oo2 = o0OOO0OO.f53771OooO00o;
            o0ooo0oo2.OooO00o(composer2, 6);
            o0ooo0oo2.OooO0O0(composer2, 6);
            oOo000o0.OooO00o(boxScopeInstance, composer2, 6);
            oO00000.f53858OooO00o.OooO00o(momentVideoVM3, composer2, 56);
            oOo000Oo.f54225OooO00o.OooO00o(composer2, 6);
            oO00o00O.f53933OooO00o.OooO0O0(composer2, 6);
            q2.f59127OooO00o.OooO00o(momentVideoVM3.getHalfDialogWebPageInfo(), new oo000o(momentVideoVM3), composer2, 392);
            oO0O0.OooO00o(boxScopeInstance, momentVideoVM3.getShowUpDownGuide(), momentVideoVM3.getShowSwipe(), composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(i));
    }

    private static final boolean MainContent$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MainContent$lambda$18(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent$lambda$19(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float PagerItem$lambda$31(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PagerItem$lambda$32(MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
    }

    private static final o00O000 PagerItem$lambda$42$lambda$38(MutableState<o00O000> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PagerItem$lambda$42$lambda$39(MutableState<o00O000> mutableState, o00O000 o00o001) {
        mutableState.setValue(o00o001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void VideoOverLayUI(BoxScope boxScope, MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentPraiseVM momentPraiseVM, MomentGiftsVM momentGiftsVM, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, boolean z, Function1<? super MomentDetailModel, Unit> function1, Composer composer, int i, int i2, int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(294049536);
        Function1<? super MomentDetailModel, Unit> function2 = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(294049536, i, i2, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.VideoOverLayUI (VideoFeedScreen.kt:659)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState<Boolean> mutableState3 = (MutableState) objRememberedValue;
        BottomShadowUI(boxScope, mutableState3, composerStartRestartGroup, (i & 14) | 48 | ((i2 << 6) & 896));
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m482paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(mutableState.getValue().booleanValue() ? 50 : 18), 7, null), 0.0f, 1, null);
        Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, bottom, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        oO0O0O00.OooO0O0(RowScopeInstance.INSTANCE, momentDetailModel, mutableState3, composerStartRestartGroup, 454);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function2);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new o0000O0(function2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i4 = i >> 6;
        Function1<? super MomentDetailModel, Unit> function3 = function2;
        ooOOO00O.OooO0O0(momentDetailModel, momentVideoVM, momentCommentsVM, momentPraiseVM, momentGiftsVM, mutableState2, z, (Function1) objRememberedValue2, composerStartRestartGroup, (458752 & i4) | 37448 | (i4 & 3670016), 0);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0000O0O(boxScope, momentDetailModel, momentVideoVM, momentCommentsVM, momentPraiseVM, momentGiftsVM, mutableState, mutableState2, z, function3, i, i2, i3));
    }

    public static /* synthetic */ void navigate$default(VideoFeedScreen videoFeedScreen, long j, long j2, int i, String str, long j3, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = 0;
        }
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            j3 = 0;
        }
        if ((i2 & 32) != 0) {
            momentDetailModel = null;
        }
        if ((i2 & 64) != 0) {
            momentAdapterTag = null;
        }
        videoFeedScreen.navigate(j, j2, i, str, j3, momentDetailModel, momentAdapterTag);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void BottomShadowUI(@NotNull BoxScope boxScope, @NotNull MutableState<Boolean> isExpanded, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(isExpanded, "isExpanded");
        Composer composerStartRestartGroup = composer.startRestartGroup(424838248);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(isExpanded) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(424838248, i2, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.BottomShadowUI (VideoFeedScreen.kt:685)");
            }
            State<Dp> stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(Dp.m3775constructorimpl(isExpanded.getValue().booleanValue() ? 360 : 220), null, "", null, composerStartRestartGroup, 384, 10);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(100)), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierFillMaxWidth$default, companion2.getTopCenter());
            Brush.Companion companion3 = Brush.INSTANCE;
            int i3 = o0OOo000.f48347o00OOooO;
            long j = o0OOo000.f48157OooOoO;
            long j2 = o0OOo000.f48153OooOo0;
            BoxKt.Box(BackgroundKt.background$default(modifierAlign, Brush.Companion.m1644verticalGradient8A3gB4$default(companion3, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(j), Color.m1671boximpl(Color.m1680copywmQWz5c$default(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            BoxKt.Box(BackgroundKt.background$default(boxScope.align(SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion, BottomShadowUI$lambda$46(stateM70animateDpAsStateAjpBEmI)), 0.0f, 1, null), companion2.getBottomCenter()), Brush.Companion.m1644verticalGradient8A3gB4$default(companion3, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(Color.m1680copywmQWz5c$default(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m1671boximpl(j)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(boxScope, isExpanded, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1547937592);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1547937592, i2, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.Content (VideoFeedScreen.kt:163)");
            }
            p195o00o0OO0.o00000OO.OooO0O0(true, composerStartRestartGroup, 6, 0);
            MainContent(composerStartRestartGroup, (i2 >> 3) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(columnScope, i));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0359  */
    /* JADX WARN: Code duplicated, block: B:106:0x0365  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x011e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0219  */
    /* JADX WARN: Code duplicated, block: B:86:0x0225  */
    /* JADX WARN: Code duplicated, block: B:87:0x0229  */
    /* JADX WARN: Code duplicated, block: B:90:0x023a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0248  */
    /* JADX WARN: Code duplicated, block: B:95:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f5  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void DownloadingArea(@NotNull BoxScope boxScope, int i, boolean z, @NotNull MutableState<Boolean> loadingStart, @NotNull Function0<Unit> onCancel, @Nullable Composer composer, int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        boolean zChanged;
        Object objRememberedValue;
        boolean z5;
        Object objOooO00o;
        Composer.Companion companion;
        MutableState mutableState;
        boolean zChanged2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(loadingStart, "loadingStart");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(118348763);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 896) == 0) {
                z2 = z;
                i4 |= composerStartRestartGroup.changed(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i3 & 4) != 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                if (composerStartRestartGroup.changed(loadingStart)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i5;
            }
            if ((i3 & 8) != 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                if (composerStartRestartGroup.changedInstance(onCancel)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((46811 & i4) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(118348763, i4, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.DownloadingArea (VideoFeedScreen.kt:726)");
                }
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3) {
                    objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 959442833, -492369756);
                    companion = Composer.INSTANCE;
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objOooO00o);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objOooO00o;
                    Boolean boolValueOf = Boolean.valueOf(DownloadingArea$lambda$48(mutableState));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(loadingStart);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new OooO0OO(loadingStart, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                    AnimatedVisibilityKt.AnimatedVisibility(DownloadingArea$lambda$48(mutableState), SemanticsModifierKt.semantics$default(boxScope.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(56), 7, null), 0.0f, 1, null), Dp.m3775constructorimpl(31)), Alignment.INSTANCE.getBottomStart()), false, OooO0o.f28934OooO0Oo, 1, null), EnterExitTransitionKt.slideInHorizontally$default(null, null, 3, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, null, 3, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1345095694, true, new OooO(boxScope, z4)), composerStartRestartGroup, 200064, 16);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(959445067);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(56), 7, null), 0.0f, 1, null), Dp.m3775constructorimpl(31)), o0OOo000.f48157OooOoO, null, 2, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Modifier modifierAlign = boxScope.align(modifierM171backgroundbw27NRU$default, companion3.getBottomStart());
                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f = 15;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
                    TextKt.m1261Text4IGK_g(o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.video_feed_saving_XXX), String.valueOf(i)), SizeKt.wrapContentWidth$default(companion2, null, false, 3, null), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
                    SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    String strStringResource = StringResources_androidKt.stringResource(p562o0oOo000.o000000.Cancel, composerStartRestartGroup, 0);
                    long j = o0OOo000.f48143OooOO0O;
                    long sp = TextUnitKt.getSp(12);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(onCancel);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new OooOO0(onCancel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextKt.m1261Text4IGK_g(strStringResource, SizeKt.wrapContentWidth$default(com.code.android.util.o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255), null, false, 3, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z5 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(boxScope, i, z5, loadingStart, onCancel, i2, i3));
        }
        i4 |= 384;
        z2 = z;
        if ((i3 & 4) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (composerStartRestartGroup.changed(loadingStart)) {
                i5 = 2048;
            } else {
                i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i4 |= i5;
        }
        if ((i3 & 8) != 0) {
            i4 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (composerStartRestartGroup.changedInstance(onCancel)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        if ((46811 & i4) == 9362) {
            if (i7 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(118348763, i4, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.DownloadingArea (VideoFeedScreen.kt:726)");
            }
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3) {
                objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 959442833, -492369756);
                companion = Composer.INSTANCE;
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objOooO00o);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objOooO00o;
                Boolean boolValueOf2 = Boolean.valueOf(DownloadingArea$lambda$48(mutableState));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(loadingStart);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0OO(loadingStart, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0OO(loadingStart, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                AnimatedVisibilityKt.AnimatedVisibility(DownloadingArea$lambda$48(mutableState), SemanticsModifierKt.semantics$default(boxScope.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(56), 7, null), 0.0f, 1, null), Dp.m3775constructorimpl(31)), Alignment.INSTANCE.getBottomStart()), false, OooO0o.f28934OooO0Oo, 1, null), EnterExitTransitionKt.slideInHorizontally$default(null, null, 3, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, null, 3, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1345095694, true, new OooO(boxScope, z4)), composerStartRestartGroup, 200064, 16);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(959445067);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierM171backgroundbw27NRU$default2 = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion5, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(56), 7, null), 0.0f, 1, null), Dp.m3775constructorimpl(31)), o0OOo000.f48157OooOoO, null, 2, null);
                Alignment.Companion companion6 = Alignment.INSTANCE;
                Modifier modifierAlign2 = boxScope.align(modifierM171backgroundbw27NRU$default2, companion6.getBottomStart());
                Alignment.Vertical centerVertically2 = companion6.getCenterVertically();
                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor = companion7.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl, currentCompositionLocalMap2);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                float f2 = 15;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
                TextKt.m1261Text4IGK_g(o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.video_feed_saving_XXX), String.valueOf(i)), SizeKt.wrapContentWidth$default(companion5, null, false, 3, null), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
                SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance2, companion5, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(p562o0oOo000.o000000.Cancel, composerStartRestartGroup, 0);
                long j2 = o0OOo000.f48143OooOO0O;
                long sp2 = TextUnitKt.getSp(12);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(onCancel);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOO0(onCancel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOO0(onCancel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1261Text4IGK_g(strStringResource2, SizeKt.wrapContentWidth$default(com.code.android.util.o0O0O00.OooO0O0(companion5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255), null, false, 3, null), j2, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z3;
        } else {
            if (i7 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(118348763, i4, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.DownloadingArea (VideoFeedScreen.kt:726)");
            }
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3) {
                objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 959442833, -492369756);
                companion = Composer.INSTANCE;
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objOooO00o);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objOooO00o;
                Boolean boolValueOf3 = Boolean.valueOf(DownloadingArea$lambda$48(mutableState));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(loadingStart);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0OO(loadingStart, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0OO(loadingStart, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                AnimatedVisibilityKt.AnimatedVisibility(DownloadingArea$lambda$48(mutableState), SemanticsModifierKt.semantics$default(boxScope.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(56), 7, null), 0.0f, 1, null), Dp.m3775constructorimpl(31)), Alignment.INSTANCE.getBottomStart()), false, OooO0o.f28934OooO0Oo, 1, null), EnterExitTransitionKt.slideInHorizontally$default(null, null, 3, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, null, 3, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1345095694, true, new OooO(boxScope, z4)), composerStartRestartGroup, 200064, 16);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(959445067);
                Modifier.Companion companion8 = Modifier.INSTANCE;
                Modifier modifierM171backgroundbw27NRU$default3 = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion8, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(56), 7, null), 0.0f, 1, null), Dp.m3775constructorimpl(31)), o0OOo000.f48157OooOoO, null, 2, null);
                Alignment.Companion companion9 = Alignment.INSTANCE;
                Modifier modifierAlign3 = boxScope.align(modifierM171backgroundbw27NRU$default3, companion9.getBottomStart());
                Alignment.Vertical centerVertically3 = companion9.getCenterVertically();
                Arrangement.HorizontalOrVertical spaceBetween3 = Arrangement.INSTANCE.getSpaceBetween();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween3, centerVertically3, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                constructor = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion10, composerM1320constructorimpl, measurePolicyRowMeasurePolicy3, composerM1320constructorimpl, currentCompositionLocalMap3);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                float f3 = 15;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
                TextKt.m1261Text4IGK_g(o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.video_feed_saving_XXX), String.valueOf(i)), SizeKt.wrapContentWidth$default(companion8, null, false, 3, null), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
                SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance3, companion8, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(p562o0oOo000.o000000.Cancel, composerStartRestartGroup, 0);
                long j3 = o0OOo000.f48143OooOO0O;
                long sp3 = TextUnitKt.getSp(12);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(onCancel);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOO0(onCancel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOO0(onCancel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1261Text4IGK_g(strStringResource3, SizeKt.wrapContentWidth$default(com.code.android.util.o0O0O00.OooO0O0(companion8, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255), null, false, 3, null), j3, sp3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(boxScope, i, z5, loadingStart, onCancel, i2, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [T, com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$o00000O0] */
    /* JADX WARN: Type inference failed for: r0v63, types: [T, com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$o00000] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void PagerItem(@NotNull MomentDetailModel videoDetailModel, int i, @NotNull PagerState pagerState, @NotNull MomentVideoVM videoViewModel, @NotNull Set<String> videoWatchSet, @NotNull SwipeableState<Boolean> loadRefreshState, @NotNull MomentCommentsVM commentsVM, @NotNull MomentPraiseVM likesVM, @NotNull MomentGiftsVM giftsVM, @NotNull MutableState<Boolean> loadingStart, @NotNull MutableState<Integer> refreshIndex, @Nullable Function1<? super MomentDetailModel, Unit> function1, @Nullable Composer composer, int i2, int i3, int i4) {
        int i5;
        AppCompatActivity appCompatActivity;
        Intrinsics.checkNotNullParameter(videoDetailModel, "videoDetailModel");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(videoViewModel, "videoViewModel");
        Intrinsics.checkNotNullParameter(videoWatchSet, "videoWatchSet");
        Intrinsics.checkNotNullParameter(loadRefreshState, "loadRefreshState");
        Intrinsics.checkNotNullParameter(commentsVM, "commentsVM");
        Intrinsics.checkNotNullParameter(likesVM, "likesVM");
        Intrinsics.checkNotNullParameter(giftsVM, "giftsVM");
        Intrinsics.checkNotNullParameter(loadingStart, "loadingStart");
        Intrinsics.checkNotNullParameter(refreshIndex, "refreshIndex");
        Composer composerStartRestartGroup = composer.startRestartGroup(-846479852);
        Function1<? super MomentDetailModel, Unit> function2 = (i4 & 2048) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846479852, i2, i3, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.PagerItem (VideoFeedScreen.kt:551)");
        }
        boolean z = composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState<Boolean> mutableState = (MutableState) objRememberedValue;
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        if (objConsume instanceof AppCompatActivity) {
            appCompatActivity = (AppCompatActivity) objConsume;
            i5 = -492369756;
        } else {
            i5 = -492369756;
            appCompatActivity = null;
        }
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        composerStartRestartGroup.startReplaceableGroup(i5);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableFloatState);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new o0000oo(mutableFloatState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue3, composerStartRestartGroup, 0);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        T t = objRememberedValue4;
        if (objRememberedValue4 == companion.getEmpty()) {
            t = 0;
            composerStartRestartGroup.updateRememberedValue(null);
        }
        composerStartRestartGroup.endReplaceableGroup();
        objectRef.element = t;
        oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
        if (oo0ooo0oOooO0o0.OooO0O0("videoUpDownSlideGuide" + oo0ooo0oOooO0o0.f46400OooO0OO, true)) {
            objectRef.element = new o00000(videoViewModel, objectRef);
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        T t2 = objRememberedValue5;
        if (objRememberedValue5 == companion.getEmpty()) {
            t2 = 0;
            composerStartRestartGroup.updateRememberedValue(null);
        }
        composerStartRestartGroup.endReplaceableGroup();
        objectRef2.element = t2;
        oO0OOo0o oo0ooo0oOooO0o1 = p415o0Oo0oO0.o00Ooo.OooO0o0();
        if (oo0ooo0oOooO0o1.OooO0O0("videoSwipeGuide" + oo0ooo0oOooO0o1.f46400OooO0OO, true)) {
            objectRef2.element = new o00000O0(videoWatchSet, videoViewModel, objectRef2);
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(loadRefreshState);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new o00000O(loadRefreshState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierDraggable = DraggableKt.draggable(BackgroundKt.m171backgroundbw27NRU$default(OffsetKt.offset(modifierFillMaxSize$default, (Function1) objRememberedValue6), Color.INSTANCE.m1707getBlack0d7_KjU(), null, 2, null), draggableStateRememberDraggableState, Orientation.Horizontal, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? new DraggableKt.C06261(null) : null, (252 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : new o00000OO(z, appCompatActivity2, videoViewModel, mutableFloatState, videoDetailModel, null), (252 & 128) != 0 ? false : false);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierDraggable);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue7;
        int i6 = i2 << 3;
        oO0O0O0o.OooO0Oo(boxScopeInstance, videoDetailModel, i, pagerState, PagerItem$lambda$42$lambda$38(mutableState2), (Function0) objectRef.element, (Function3) objectRef2.element, loadingStart, mutableState, refreshIndex, composerStartRestartGroup, (i6 & 7168) | (i6 & 896) | 100696134 | ((i2 >> 6) & 29360128) | ((i3 << 27) & 1879048192), 0);
        VideoFeedScreen videoFeedScreen = INSTANCE;
        boolean zIsScrollInProgress = pagerState.isScrollInProgress();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged3 = composerStartRestartGroup.changed(function2);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new o0000Ooo(function2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        videoFeedScreen.VideoOverLayUI(boxScopeInstance, videoDetailModel, videoViewModel, commentsVM, likesVM, giftsVM, loadingStart, mutableState, zIsScrollInProgress, (Function1) objRememberedValue8, composerStartRestartGroup, ((i2 >> 9) & 3670016) | 12882502, 6, 0);
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged4 = composerStartRestartGroup.changed(mutableState2);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new o0000(mutableState2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        composerStartRestartGroup.endReplaceableGroup();
        p194o00o0OO.o00O00.OooO00o(modifierFillMaxSize$default2, (Function1) objRememberedValue9, composerStartRestartGroup, 6, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0000O00(videoDetailModel, i, pagerState, videoViewModel, videoWatchSet, loadRefreshState, commentsVM, likesVM, giftsVM, loadingStart, refreshIndex, function2, i2, i3, i4));
    }

    @Override // p532o0o0OOo0.o000O0
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4200getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1305645491);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1305645491, i, -1, "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen.getWindowBackgroundColor (VideoFeedScreen.kt:169)");
        }
        int i2 = o0OOo000.f48347o00OOooO;
        long j = o0OOo000.f48153OooOo0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public final void navigate(long dyId, long toUserId, int fromType, @Nullable String videoList, long dataSort, @Nullable MomentDetailModel videoDetailModel, @Nullable MomentAdapterTag momentAdapterTag) {
        VideoFeedScreen videoFeedScreen = INSTANCE;
        Bundle bundleOooO00o = p063o0000oO.o000oOoO.OooO00o();
        bundleOooO00o.putLong(PARAM_DATA, dyId);
        bundleOooO00o.putInt(FROM_TYPE, fromType);
        bundleOooO00o.putLong(TO_USER_ID, toUserId);
        if (videoList != null) {
            bundleOooO00o.putString(VIDEO_LIST, videoList);
        }
        if (videoDetailModel != null) {
            bundleOooO00o.putSerializable(VIDEO_DETAIL_MODEL, videoDetailModel);
        }
        if (momentAdapterTag != null) {
            bundleOooO00o.putSerializable(FROM_MOMENT_TAG, momentAdapterTag);
        }
        bundleOooO00o.putLong(DATA_SORT, dataSort);
        o00O00.OooO0o0(videoFeedScreen, bundleOooO00o, false, null, 12);
    }
}
