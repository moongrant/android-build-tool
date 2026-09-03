package p492o0o00OO0;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.google.accompanist.pager.Pager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p230o00oOo0o.o000000;
import p423o0OoO0OO.o00O0000;
import p519o0o0O0OO.o00O00;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOo0 {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Long f49388OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000000 f49389OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f49390OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TopicDetailVM f49391OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f49392OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, FragmentActivity fragmentActivity, o000000 o000000Var, TopicDetailVM topicDetailVM, Long l) {
            super(2);
            this.f49388OooO0Oo = l;
            this.f49390OooO0o0 = fragmentActivity;
            this.f49389OooO0o = o000000Var;
            this.f49391OooO0oO = topicDetailVM;
            this.f49392OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO00OOo0.OooO00o(this.f49388OooO0Oo, this.f49390OooO0o0, this.f49389OooO0o, this.f49391OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49392OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nTopicDetailContentComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,212:1\n25#2:213\n1097#3,6:214\n81#4:220\n*S KotlinDebug\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2\n*L\n65#1:213\n65#1:214,6\n65#1:220\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000000 f49393OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f49394OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49395OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TopicDetailVM f49396OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Long f49397OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, FragmentActivity fragmentActivity, o000000 o000000Var, TopicDetailVM topicDetailVM, Long l) {
            super(2);
            this.f49393OooO0Oo = o000000Var;
            this.f49395OooO0o0 = i;
            this.f49394OooO0o = fragmentActivity;
            this.f49396OooO0oO = topicDetailVM;
            this.f49397OooO0oo = l;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(795528315, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailContent.<anonymous> (TopicDetailContentComp.kt:64)");
                }
                FragmentActivity fragmentActivity = this.f49394OooO0o;
                TopicDetailVM topicDetailVM = this.f49396OooO0oO;
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new l(fragmentActivity, GiftPropTypeShow.InMomentList, topicDetailVM, null, 24), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Pager.OooO00o(2, Modifier.INSTANCE, this.f49393OooO0Oo, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.composableLambda(composer2, 521700224, true, new oO0OO00o(this.f49397OooO0oo, this.f49395OooO0o0, this.f49396OooO0oO, this.f49394OooO0o, (MutableState) objRememberedValue)), composer2, (this.f49395OooO0o0 & 896) | 54, 6, 1016);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Long f49398OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000000 f49399OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f49400OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TopicDetailVM f49401OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f49402OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, FragmentActivity fragmentActivity, o000000 o000000Var, TopicDetailVM topicDetailVM, Long l) {
            super(2);
            this.f49398OooO0Oo = l;
            this.f49400OooO0o0 = fragmentActivity;
            this.f49399OooO0o = o000000Var;
            this.f49401OooO0oO = topicDetailVM;
            this.f49402OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO00OOo0.OooO00o(this.f49398OooO0Oo, this.f49400OooO0o0, this.f49399OooO0o, this.f49401OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49402OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Long l, @NotNull FragmentActivity activity, @NotNull o000000 pagerState, @NotNull TopicDetailVM topicDetailVM, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(topicDetailVM, "topicDetailVM");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1535528905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1535528905, i, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailContent (TopicDetailContentComp.kt:60)");
        }
        if (l == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i, activity, pagerState, topicDetailVM, l));
            return;
        }
        l.longValue();
        SurfaceKt.m1201SurfaceFjzlyU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 795528315, true, new OooO0O0(i, activity, pagerState, topicDetailVM, l)), composerStartRestartGroup, 1572870, 62);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0OO(i, activity, pagerState, topicDetailVM, l));
    }

    public static final void OooO0O0(final TopicPopularMomentVM topicPopularMomentVM, int i, final TopicDetailVM topicDetailVM, final Function0 function0, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2064656874);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2064656874, i2, -1, "com.yalla.yalla.ui.activity.moment.InitObservers (TopicDetailContentComp.kt:173)");
        }
        composerStartRestartGroup.startReplaceableGroup(-2059604831);
        if (i == 0) {
            Observable<Object> observable = LiveEventBus.get("MOMENT_TOP_OF_TOPIC");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new Observer() { // from class: o0o00OO0.oO00O0o0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    OnTopPostForTopicModel it = (OnTopPostForTopicModel) obj;
                    TopicDetailVM topicDetailVM2 = topicDetailVM;
                    Intrinsics.checkNotNullParameter(topicDetailVM2, "$topicDetailVM");
                    Function0 refreshData = function0;
                    Intrinsics.checkNotNullParameter(refreshData, "$refreshData");
                    Intrinsics.checkNotNullParameter(it, "it");
                    TopicInfoModel value = topicDetailVM2.getTopicDetailLocal().getValue();
                    if (value != null && it.getTopicId() == value.getId()) {
                        refreshData.invoke();
                    }
                }
            }, composerStartRestartGroup, 72);
            Observable<Object> observable2 = LiveEventBus.get("MOMENT_UN_TOP_OF_TOPIC");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            o00O0000.OooO00o(observable2, new Observer() { // from class: o0o00OO0.oO00O0o
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    OnTopPostForTopicModel it = (OnTopPostForTopicModel) obj;
                    TopicDetailVM topicDetailVM2 = topicDetailVM;
                    Intrinsics.checkNotNullParameter(topicDetailVM2, "$topicDetailVM");
                    Function0 refreshData = function0;
                    Intrinsics.checkNotNullParameter(refreshData, "$refreshData");
                    Intrinsics.checkNotNullParameter(it, "it");
                    TopicInfoModel value = topicDetailVM2.getTopicDetailLocal().getValue();
                    if (value != null && it.getTopicId() == value.getId()) {
                        refreshData.invoke();
                    }
                }
            }, composerStartRestartGroup, 72);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Observable<Object> observable3 = LiveEventBus.get("POST_REMOVE_OF_TOPIC");
        Intrinsics.checkNotNullExpressionValue(observable3, "get(...)");
        o00O0000.OooO00o(observable3, new Observer() { // from class: o0o00OO0.oOo00OO0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                OnTopPostForTopicModel it = (OnTopPostForTopicModel) obj;
                TopicDetailVM topicDetailVM2 = topicDetailVM;
                Intrinsics.checkNotNullParameter(topicDetailVM2, "$topicDetailVM");
                TopicPopularMomentVM momentVM = topicPopularMomentVM;
                Intrinsics.checkNotNullParameter(momentVM, "$momentVM");
                Intrinsics.checkNotNullParameter(it, "it");
                TopicInfoModel value = topicDetailVM2.getTopicDetailLocal().getValue();
                if (value != null && it.getTopicId() == value.getId()) {
                    MomentDetailModel momentDetailModel = new MomentDetailModel();
                    momentDetailModel.setId(it.getPostId());
                    momentVM.deleteMoment(momentDetailModel, oO00OO0O.f49381OooO0Oo);
                }
            }
        }, composerStartRestartGroup, 72);
        Observable<Object> observable4 = LiveEventBus.get("POST_DELETE_OF_TOPIC");
        Intrinsics.checkNotNullExpressionValue(observable4, "get(...)");
        o00O0000.OooO00o(observable4, new Observer() { // from class: o0o00OO0.oO00O0oO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                OnTopPostForTopicModel it = (OnTopPostForTopicModel) obj;
                TopicDetailVM topicDetailVM2 = topicDetailVM;
                Intrinsics.checkNotNullParameter(topicDetailVM2, "$topicDetailVM");
                TopicPopularMomentVM momentVM = topicPopularMomentVM;
                Intrinsics.checkNotNullParameter(momentVM, "$momentVM");
                Intrinsics.checkNotNullParameter(it, "it");
                TopicInfoModel value = topicDetailVM2.getTopicDetailLocal().getValue();
                if (value != null && it.getTopicId() == value.getId()) {
                    MomentDetailModel momentDetailModel = new MomentDetailModel();
                    momentDetailModel.setId(it.getPostId());
                    momentVM.deleteMoment(momentDetailModel, oO00OOO.f49382OooO0Oo);
                }
            }
        }, composerStartRestartGroup, 72);
        o00O00.OooO00o(topicPopularMomentVM, null, composerStartRestartGroup, i2 & 14, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO00OOOo(topicPopularMomentVM, i, topicDetailVM, function0, i2));
    }
}
