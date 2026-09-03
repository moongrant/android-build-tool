package com.yalla.yalla.ui.activity.moment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.core.view.o00oOoo;
import androidx.fragment.app.o0000Ooo;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.yalla.yalla.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentState;
import com.yalla.yalla.model.moment.PostGiftResultModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.fragment.moment.MomentDetailGiftFragment;
import com.yalla.yalla.ui.fragment.moment.MomentDetailLikeFragment;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import com.yalla.yalla.ui.view.tips.AppBarStateChangeListener;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O0.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.oO0Oo0o0;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p492o0o00OO0.o000;
import p492o0o00OO0.o00000;
import p492o0o00OO0.o00000O;
import p492o0o00OO0.o00000O0;
import p492o0o00OO0.o0000O0O;
import p492o0o00OO0.o000O00;
import p492o0o00OO0.o000O000;
import p492o0o00OO0.o000OO;
import p492o0o00OO0.o000OO0O;
import p492o0o00OO0.o000Oo0;
import p492o0o00OO0.o00O0000;
import p492o0o00OO0.o0O0ooO;
import p590o0oOooo0.l;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Lo0o0O0o0/o000OO;", "momentGifPlayManager", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentDetailActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,769:1\n22#2,2:770\n75#3,13:772\n75#3,13:785\n75#3,13:798\n154#4:811\n154#4:812\n154#4:813\n154#4:854\n66#5,6:814\n72#5:848\n76#5:853\n78#6,11:820\n91#6:852\n456#7,8:831\n464#7,3:845\n467#7,3:849\n4144#8,6:839\n*S KotlinDebug\n*F\n+ 1 MomentDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentDetailActivity\n*L\n93#1:770,2\n95#1:772,13\n96#1:785,13\n97#1:798,13\n413#1:811\n436#1:812\n437#1:813\n458#1:854\n411#1:814,6\n411#1:848\n411#1:853\n411#1:820,11\n411#1:852\n411#1:831,8\n411#1:845,3\n411#1:849,3\n411#1:839,6\n*E\n"})
public final class MomentDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final /* synthetic */ int f25608Oooo0 = 0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f25620OooOooO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25609OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oO0Oo0o0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25612OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentDetailActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.MomentDetailActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.MomentDetailActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25637OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25637OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25611OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentDetailActivityVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentDetailActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.MomentDetailActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.MomentDetailActivity$special$$inlined$viewModels$default$6

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25641OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25641OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25613OooOo0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PrivateChatVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentDetailActivity$special$$inlined$viewModels$default$8
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.MomentDetailActivity$special$$inlined$viewModels$default$7
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.MomentDetailActivity$special$$inlined$viewModels$default$9

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25645OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25645OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ArrayList f25614OooOo0o = new ArrayList();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f25610OooOo = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f25616OooOoO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(p562o0oOo000.o000000.please_chat_friendly), null, 2, null);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f25615OooOoO = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final Lazy f25617OooOoOO = LazyKt.lazy(new OooOO0O());

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25619OooOoo0 = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f25618OooOoo = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final MutableState<Float> f25621OooOooo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25622Oooo000 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final int f25623Oooo00O = o0000O0.OooO00o(61);

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f25624Oooo00o = new OooO0O0();

    public static final class OooO extends Lambda implements Function1<ApiResult<MomentDetailModel>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<MomentDetailModel> apiResult) {
            ApiResult<MomentDetailModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailActivity.this.OooOo0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        @JvmStatic
        public static void OooO00o(@NotNull Context context, @Nullable MomentDetailModel momentDetailModel, boolean z, int i, @Nullable MomentCommentDetailModel momentCommentDetailModel, boolean z2, @Nullable MomentAdapterTag momentAdapterTag, boolean z3, @NotNull String fromDbMid) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fromDbMid, "fromDbMid");
            Intent intent = new Intent(context, (Class<?>) MomentDetailActivity.class);
            intent.putExtra("Module", momentDetailModel);
            intent.putExtra("Type", z);
            intent.putExtra("ShowGiftListType", i);
            intent.putExtra("Data", momentCommentDetailModel);
            intent.putExtra("FromTopicDetail", z2);
            intent.putExtra("FromMomentTag", momentAdapterTag);
            intent.putExtra("isExpandedHeadView", z3);
            intent.putExtra("FromDbMid", fromDbMid);
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends AppBarStateChangeListener {
        public OooO0O0() {
        }

        @Override // com.yalla.yalla.ui.view.tips.AppBarStateChangeListener
        public final void OooO0O0(@NotNull AppBarLayout appBarLayout, @NotNull AppBarStateChangeListener.State oldState, @NotNull AppBarStateChangeListener.State state) {
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            Intrinsics.checkNotNullParameter(oldState, "oldState");
            Intrinsics.checkNotNullParameter(state, "state");
            o0000O00.OooO0O0("appBarStateChangeListener oldState is " + oldState + ", state is " + state);
            int i = MomentDetailActivity.f25608Oooo0;
            MomentDetailActivity momentDetailActivity = MomentDetailActivity.this;
            momentDetailActivity.OooOooO().setExpand(state != AppBarStateChangeListener.State.COLLAPSED && momentDetailActivity.OooOooO().getPostCommentDetailModel() == null);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<MomentDetailModel, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f25628OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentDetailModel momentDetailModel) {
            super(1);
            this.f25628OooO0o0 = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            MomentDetailActivity momentDetailActivity = MomentDetailActivity.this;
            if (!momentDetailActivity.isFinishing() && !momentDetailActivity.isDestroyed()) {
                if (momentDetailModel2 != null) {
                    if (momentDetailModel2.isInRoom() != momentDetailActivity.OooOooO().getMIsInRoom()) {
                        MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel = new MomentChangeUserIsInRoomModel();
                        momentChangeUserIsInRoomModel.setUserId(String.valueOf(momentDetailModel2.getUserId()));
                        momentChangeUserIsInRoomModel.setInRoom(momentDetailModel2.isInRoom());
                        LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM").post(momentChangeUserIsInRoomModel);
                    }
                    MomentDetailModel momentDetailModel3 = this.f25628OooO0o0;
                    if (momentDetailModel3.getComment() != null) {
                        momentDetailModel2.setComment(momentDetailModel3.getComment());
                    }
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel2);
                    momentDetailActivity.Oooo000();
                    momentDetailActivity.OooOooO().setRefreshDataSuccess(true);
                } else if (!momentDetailActivity.isDestroyed()) {
                    o000O o000o = new o000O(momentDetailActivity);
                    o000o.OooOo00(o0000.OooO0OO(p562o0oOo000.o000000.moment_delete_by_user));
                    o000o.OooOo0(new com.yalla.yalla.ui.activity.moment.OooOOO(momentDetailActivity));
                    o000o.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f25629OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentDetailModel momentDetailModel) {
            super(1);
            this.f25629OooO0Oo = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            int code = it.getCode();
            MomentDetailModel momentDetailModel = this.f25629OooO0Oo;
            if (code == 2095) {
                momentDetailModel.setState(MomentState.SystemDelete.getValue());
                LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Long.valueOf(momentDetailModel.getId()));
            } else if (code == 4000) {
                momentDetailModel.setState(MomentState.SystemDelete.getValue());
                LiveEventBus.get("MOMENT_BY_USER_REMOVE").post(Long.valueOf(momentDetailModel.getId()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<com.yalla.yalla.ui.activity.moment.OooOOOO> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.activity.moment.OooOOOO invoke() {
            MomentDetailActivity momentDetailActivity = MomentDetailActivity.this;
            return new com.yalla.yalla.ui.activity.moment.OooOOOO(momentDetailActivity, momentDetailActivity.getSupportFragmentManager());
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<MomentDetailCommentFragment> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentDetailCommentFragment invoke() {
            MomentDetailCommentFragment.Companion companion = MomentDetailCommentFragment.INSTANCE;
            int i = MomentDetailActivity.f25608Oooo0;
            MomentDetailModel momentDetailModel = (MomentDetailModel) o000O0.OooOo.OooO00o(MomentDetailActivity.this);
            companion.getClass();
            MomentDetailCommentFragment momentDetailCommentFragment = new MomentDetailCommentFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("POST_DETAIL_MODEL", momentDetailModel);
            momentDetailCommentFragment.setArguments(bundle);
            return momentDetailCommentFragment;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<MomentDetailLikeFragment> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentDetailLikeFragment invoke() {
            MomentDetailLikeFragment.Companion oooO00o = MomentDetailLikeFragment.INSTANCE;
            int i = MomentDetailActivity.f25608Oooo0;
            MomentDetailModel momentDetailModel = (MomentDetailModel) o000O0.OooOo.OooO00o(MomentDetailActivity.this);
            Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null;
            oooO00o.getClass();
            MomentDetailLikeFragment momentDetailLikeFragment = new MomentDetailLikeFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("POST_ID", lValueOf != null ? lValueOf.longValue() : 0L);
            momentDetailLikeFragment.setArguments(bundle);
            return momentDetailLikeFragment;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<MomentDetailGiftFragment> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentDetailGiftFragment invoke() {
            MomentDetailGiftFragment.Companion companion = MomentDetailGiftFragment.INSTANCE;
            int i = MomentDetailActivity.f25608Oooo0;
            MomentDetailActivity momentDetailActivity = MomentDetailActivity.this;
            MomentDetailModel momentDetailModel = (MomentDetailModel) o000O0.OooOo.OooO00o(momentDetailActivity);
            Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null;
            int giftListType = momentDetailActivity.OooOooO().getGiftListType();
            companion.getClass();
            MomentDetailGiftFragment momentDetailGiftFragment = new MomentDetailGiftFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("POST_ID", lValueOf != null ? lValueOf.longValue() : 0L);
            bundle.putInt("GIFT_LIST_TYPE", giftListType);
            momentDetailGiftFragment.setArguments(bundle);
            return momentDetailGiftFragment;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<l> {
        public OooOOOO() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final l invoke() {
            GiftPropTypeShow giftPropTypeShow = GiftPropTypeShow.InMomentDetail;
            int i = MomentDetailActivity.f25608Oooo0;
            MomentDetailActivity momentDetailActivity = MomentDetailActivity.this;
            return new l(momentDetailActivity, giftPropTypeShow, (TopicInfoVM) momentDetailActivity.f25612OooOo00.getValue(), null, 24);
        }
    }

    static {
        new OooO00o();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    public static final void OooOo(MomentDetailActivity momentDetailActivity, Composer composer, int i) {
        Composer composer2;
        momentDetailActivity.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1971381131);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1971381131, i, -1, "com.yalla.yalla.ui.activity.moment.MomentDetailActivity.ToolBarMenuFollow (MomentDetailActivity.kt:406)");
        }
        if (momentDetailActivity.OooOooO().getMomentAdapterTag().getValue() == MomentAdapterTag.PostDetailCommentSonList || momentDetailActivity.OooOooO().getMomentAdapterTag().getValue() == MomentAdapterTag.MomentListFeaturedFragment) {
            MomentDetailModel momentDetailModel = (MomentDetailModel) o000O0.OooOo.OooO00o(momentDetailActivity);
            if ((momentDetailModel == null || momentDetailModel.isFollow()) ? false : true) {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                T value = o0O00oO0.OooOOo0().getValue();
                MomentDetailModel momentDetailModel2 = (MomentDetailModel) o000O0.OooOo.OooO00o(momentDetailActivity);
                if (Intrinsics.areEqual(value, momentDetailModel2 != null ? Long.valueOf(momentDetailModel2.getUserId()) : null)) {
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float f = 12;
                    Modifier modifierOooO00o = p454o0Ooo000.OooOo00.OooO00o(f, SizeKt.m511height3ABfNKs(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(com.code.android.util.o0O0O00.OooO0O0(PaddingKt.m480paddingVpY3zN4$default(AlphaKt.alpha(companion, momentDetailActivity.f25621OooOooo.getValue().floatValue()), Dp.m3775constructorimpl(f), 0.0f, 2, null), false, false, 0L, false, null, null, null, new o000(momentDetailActivity), 253), RoundedCornerShapeKt.getCircleShape()), o0OOo000.f48186Ooooo0o, null, 2, null), Dp.m3775constructorimpl(27)), 0.0f, 2, null, composerStartRestartGroup, 733328855);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
                    composer2 = composerStartRestartGroup;
                    TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.Follow, composerStartRestartGroup, 0), BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3072, 3072, 56816);
                    o000O.o0ooOOo.OooO00o(composer2);
                }
            } else {
                composer2 = composerStartRestartGroup;
            }
        } else {
            composer2 = composerStartRestartGroup;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000O000(momentDetailActivity, i));
    }

    public static final void OooOoO0(MomentDetailActivity momentDetailActivity, Composer composer, int i) {
        momentDetailActivity.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-764917913);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-764917913, i, -1, "com.yalla.yalla.ui.activity.moment.MomentDetailActivity.ToolBarMenuMore (MomentDetailActivity.kt:453)");
        }
        IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.icv_more, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(23)), false, false, 0L, false, null, null, null, new o000Oo0(momentDetailActivity), 253), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, composerStartRestartGroup, 56, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000O00(momentDetailActivity, i));
    }

    public final oO0Oo0o0 OooOoO() {
        return (oO0Oo0o0) this.f25609OooOOoo.getValue();
    }

    public final MomentDetailCommentFragment OooOoOO() {
        return (MomentDetailCommentFragment) this.f25617OooOoOO.getValue();
    }

    public final MomentDetailLikeFragment OooOoo() {
        return (MomentDetailLikeFragment) this.f25619OooOoo0.getValue();
    }

    public final MomentDetailGiftFragment OooOoo0() {
        return (MomentDetailGiftFragment) this.f25618OooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentDetailActivityVM OooOooO() {
        return (MomentDetailActivityVM) this.f25611OooOo0.getValue();
    }

    public final void OooOooo() {
        OooOo0O(500L, o0000.OooO0OO(p562o0oOo000.o000000.loading));
        MomentDetailModel value = OooOooO().getMPostDetailModel().getValue();
        if (value != null) {
            OooOooO().momentDetail(com.code.android.util.o0OoOo0.OooOOO0(AppEventsConstants.EVENT_PARAM_VALUE_NO, Long.valueOf(value.getId())), OooOooO().getSourceTypeMomentDetail()).observe(this, new p384o0OOoo0O.o000oOoO(new OooO0OO(value), new OooO0o(value), new OooO(), false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo000() {
        MomentDetailModel momentDetailModel = (MomentDetailModel) o000O0.OooOo.OooO00o(this);
        if (momentDetailModel != null) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            long userId = momentDetailModel.getUserId();
            if (l != null && l.longValue() == userId) {
                OooOooO().isSelfPost().setValue(Boolean.TRUE);
            }
            MomentSendContentModel content = momentDetailModel.getContent();
            if (content != null && content.getCircleId() > 0 && !OooOooO().getMIsFromTopicDetail()) {
                TopicInfoVM topicInfoVM = (TopicInfoVM) this.f25612OooOo00.getValue();
                long id = momentDetailModel.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                topicInfoVM.getCircleInfoByDyId(sb.toString());
            }
            OooOoo().setData(momentDetailModel.getId());
            OooOoo0().setData(momentDetailModel.getId());
            this.f25622Oooo000.setValue(Boolean.FALSE);
            if (OooOooO().getGiftListType() != -1) {
                this.f25620OooOooO = 2;
                final int i = 1;
                OooOoO().f44927OooO00o.postDelayed(new Runnable() { // from class: o000ooo0.o0000oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = i;
                        Object obj = this;
                        switch (i2) {
                            case 0:
                                o0000O0 this$0 = (o0000O0) obj;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.getClass();
                                throw null;
                            default:
                                MomentDetailActivity this$1 = (MomentDetailActivity) obj;
                                int i3 = MomentDetailActivity.f25608Oooo0;
                                Intrinsics.checkNotNullParameter(this$1, "this$0");
                                this$1.OooOoO().f44935OooOO0.setCurrentItem(this$1.f25620OooOooO);
                                return;
                        }
                    }
                }, 500L);
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        o00oOoo.OooO00o(getWindow(), false);
        getWindow().setStatusBarColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.transparent));
        setContentView(OooOoO().f44927OooO00o);
        MomentDetailActivityVM momentDetailActivityVMOooOooO = OooOooO();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        momentDetailActivityVMOooOooO.initIntent(intent);
        if (OooOooO().getMPostDetailModel().getValue() == null) {
            finish();
        } else {
            MomentDetailModel momentDetailModel = (MomentDetailModel) o000O0.OooOo.OooO00o(this);
            if (momentDetailModel == null) {
                o0000O00.OooO0O0("WRM MomentDetail = ".concat(p187o00o00o0.OooO.OooO00o(OooOooO().getMPostDetailModel().getValue())));
            } else if (momentDetailModel.getId() < 1) {
                finish();
            } else {
                OooOooO().setMIsInRoom(momentDetailModel.isInRoom());
                OooOooO().setMSessionId(momentDetailModel.getSessionId());
                o0000O00.OooO0O0("WRM MomentDetail = ".concat(p187o00o00o0.OooO.OooO00o(OooOooO().getMPostDetailModel().getValue())));
            }
        }
        CollapsingToolbarLayout collapsingToolbarLayout = OooOoO().f44933OooO0oO;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(collapsingToolbarLayout, null);
        OooOoO().f44928OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0o00OO0.o00000OO
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i2) {
                int i3 = MomentDetailActivity.f25608Oooo0;
                MomentDetailActivity this$0 = this.f49118OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f25621OooOooo.setValue(Float.valueOf(Math.abs((i2 * 1.0f) / this$0.f25623Oooo00O)));
            }
        });
        ComposeView composeViewDetail = OooOoO().f44930OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeViewDetail, "composeViewDetail");
        o0000oo.OooO0Oo(composeViewDetail, ComposableLambdaKt.composableLambdaInstance(-760281825, true, new o000OO0O(this)));
        OooOoO().f44928OooO0O0.OooO00o(this.f25624Oooo00o);
        ComposeView bottomComposeView = OooOoO().f44929OooO0OO;
        Intrinsics.checkNotNullExpressionValue(bottomComposeView, "bottomComposeView");
        o0000oo.OooO0Oo(bottomComposeView, ComposableLambdaKt.composableLambdaInstance(1333242454, true, new o00O0000(this)));
        OooOoO().f44926OooO.f20866Oooo0o = false;
        OooOoO().f44926OooO.f20857OooOooO = true;
        OooOoO().f44926OooO.OooOo00(false);
        RefreshLayout refreshLayout = OooOoO().f44926OooO;
        refreshLayout.f20877OoooOo0 = new p338o0OO0oOo.Oooo0() { // from class: o0o00OO0.o0000Ooo
            @Override // p338o0OO0oOo.Oooo0
            public final void OooO00o(SmartRefreshLayout it) {
                int i2 = MomentDetailActivity.f25608Oooo0;
                MomentDetailActivity this$0 = this.f49127OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                int i3 = this$0.f25620OooOooO;
                if (i3 == 0) {
                    this$0.OooOoOO().tabRefreshData(true);
                } else if (i3 == 1) {
                    this$0.OooOoo().tabRefreshData(true);
                } else if (i3 == 2) {
                    this$0.OooOoo0().tabRefreshData(true);
                }
                this$0.OooOooo();
                this$0.OooOooO().onRefreshData();
            }
        };
        refreshLayout.f20857OooOooO = true;
        ArrayList arrayList = this.f25614OooOo0o;
        arrayList.clear();
        arrayList.add(OooOoOO());
        arrayList.add(OooOoo());
        arrayList.add(OooOoo0());
        OooOoO().f44935OooOO0.setOffscreenPageLimit(3);
        OooOoO().f44934OooO0oo.setItemListener(new o0O0ooO(this));
        OooOoO().f44934OooO0oo.setData(this.f25620OooOooO);
        if (OooOooO().getMIsExpandedHeadView()) {
            OooOoO().f44928OooO0O0.setExpanded(false);
        }
        OooOoO().f44935OooOO0.OooO0O0(new p492o0o00OO0.o00oOoo(this));
        OooOoO().f44935OooOO0.setAdapter((o0000Ooo) this.f25615OooOoO.getValue());
        OooOoO().f44935OooOO0.setCurrentItem(this.f25620OooOooO);
        Class cls = Long.TYPE;
        LiveEventBus.get("MOMENT_HIDE_POST", cls).observe(this, new p492o0o00OO0.o0000(this, i));
        LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE", cls).observe(this, new Observer() { // from class: o0o00OO0.o0000O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i2 = MomentDetailActivity.f25608Oooo0;
                MomentDetailActivity this$0 = this.f49119OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Observable<Object> observable = LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE_FROM_MOMENT_DETAIL");
                MomentDetailModel momentDetailModel2 = (MomentDetailModel) OooOo.OooO00o(this$0);
                observable.post(momentDetailModel2 != null ? Long.valueOf(momentDetailModel2.getId()) : null);
            }
        });
        LiveEventBus.get("MOMENT_BY_USER_REMOVE", cls).observe(this, new p492o0o00OO0.oo0o0Oo(this, i));
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new Observer() { // from class: o0o00OO0.o0O0O00
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i2 = MomentDetailActivity.f25608Oooo0;
                MomentDetailActivity this$0 = this.f49293OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo();
            }
        });
        LiveEventBus.get("SEND_POST_GIFT_TOTEL_COIN", PostGiftResultModel.class).observe(this, new Observer() { // from class: o0o00OO0.o000OOo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                PostGiftResultModel result = (PostGiftResultModel) obj;
                int i2 = MomentDetailActivity.f25608Oooo0;
                MomentDetailActivity this$0 = this.f49147OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel value = this$0.OooOooO().getMPostDetailModel().getValue();
                if (value == null || value.getId() != result.getPostId()) {
                    return;
                }
                value.setTotalPropValue(result.getTotalPropValue());
                LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(value);
                this$0.OooOoo0().addSendGiftItem(result.getGiftId(), result.getGiftNum(), result.getPropImage());
            }
        });
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH", MomentDetailModel.class).observe(this, new Observer() { // from class: o0o00OO0.o000000
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MomentDetailModel result = (MomentDetailModel) obj;
                int i2 = MomentDetailActivity.f25608Oooo0;
                MomentDetailActivity this$0 = this.f49111OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel value = this$0.OooOooO().getMPostDetailModel().getValue();
                if (value != null && value.getId() == result.getId()) {
                    this$0.OooOooO().getMPostDetailModel().setValue(result);
                }
                MomentDetailModel momentDetailModel2 = (MomentDetailModel) OooOo.OooO00o(this$0);
                if (momentDetailModel2 != null) {
                    this$0.OooOoOO().setPostDetailModel(momentDetailModel2);
                    momentDetailModel2.setSessionId(this$0.OooOooO().getMSessionId());
                    this$0.OooOoOO().setCount(momentDetailModel2.getCommentNum());
                    this$0.OooOoo().setCount(momentDetailModel2.getPraiseNum());
                    this$0.OooOoo0().setCount(momentDetailModel2.getTotalPropValue());
                }
            }
        });
        LiveEventBus.get("EVENT_DELETED", cls).observe(this, new p492o0o00OO0.o000000O(this, i));
        LiveEventBus.get("POST_DETAIL_DATA_DELETE_COMMENT", MomentDetailModel.class).observe(this, new o00000(this, i));
        LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM", MomentChangeUserIsInRoomModel.class).observe(this, new o00000O0(this, i));
        LiveEventBus.get("POST_DETAIL_PAGER_PRAISE_ADD", MomentDetailModel.class).observe(this, new o00000O(this, i));
        LiveEventBus.get("POST_DETAIL_PAGER_PRAISE_DELETE", MomentDetailModel.class).observe(this, new p492o0o00OO0.o0000O00(this, i));
        LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").observe(this, new p492o0o00OO0.o0000oo(this, i));
        LiveEventBus.get("POST_DETAIL_REFRESH_LOAD_SUCCESS").observe(this, new p492o0o00OO0.o0000O0(this, i));
        LiveEventBus.get("POST_DETAIL_REFRESH_CLOSE_HEADER_OR_FOOTER").observe(this, new o0000O0O(this, i));
        LiveEventBus.get("POST_DETAIL_APPBARLAYOUTSETEXPANDED").observe(this, new o000OO(this, i));
        OooOooo();
        o0oo0000.OooO00o.OooO0O0("203021");
        OooOooO().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        OooO0O0 oooO0O0;
        super.onDestroy();
        OooOooO().statisticalTime();
        ArrayList arrayList = OooOoO().f44928OooO0O0.f15695OooOO0O;
        if (arrayList == null || (oooO0O0 = this.f25624Oooo00o) == null) {
            return;
        }
        arrayList.remove(oooO0O0);
    }
}
