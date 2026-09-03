package p485o0o00O0;

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
import com.google.accompanist.pager.Pager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
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
import p184o00o00o.Oooo000;
import p417o0OoO0.o00000O;
import p509o0o0O0.o0ooOOo;
import p579o0oOoo.oO0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000o0 {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Long f48187OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f48188OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f48189OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TopicDetailVM f48190OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f48191OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, FragmentActivity fragmentActivity, Oooo000 oooo000, TopicDetailVM topicDetailVM, Long l) {
            super(2);
            this.f48187OooO0Oo = l;
            this.f48189OooO0o0 = fragmentActivity;
            this.f48188OooO0o = oooo000;
            this.f48190OooO0oO = topicDetailVM;
            this.f48191OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOo000o0.OooO00o(this.f48187OooO0Oo, this.f48189OooO0o0, this.f48188OooO0o, this.f48190OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f48191OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nTopicDetailContentComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,212:1\n25#2:213\n1097#3,6:214\n81#4:220\n*S KotlinDebug\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2\n*L\n65#1:213\n65#1:214,6\n65#1:220\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f48192OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f48193OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48194OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TopicDetailVM f48195OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Long f48196OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, FragmentActivity fragmentActivity, Oooo000 oooo000, TopicDetailVM topicDetailVM, Long l) {
            super(2);
            this.f48192OooO0Oo = oooo000;
            this.f48194OooO0o0 = i;
            this.f48193OooO0o = fragmentActivity;
            this.f48195OooO0oO = topicDetailVM;
            this.f48196OooO0oo = l;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(795528315, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailContent.<anonymous> (TopicDetailContentComp.kt:63)");
                }
                FragmentActivity fragmentActivity = this.f48193OooO0o;
                TopicDetailVM topicDetailVM = this.f48195OooO0oO;
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new oO0O0O00(fragmentActivity, GiftPropTypeShow.InMomentList, topicDetailVM, null, 24), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Pager.OooO00o(2, Modifier.INSTANCE, this.f48192OooO0Oo, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.composableLambda(composer2, 521700224, true, new oOo0oooO(this.f48196OooO0oo, this.f48194OooO0o0, this.f48195OooO0oO, this.f48193OooO0o, (MutableState) objRememberedValue)), composer2, (this.f48194OooO0o0 & 896) | 54, 6, 1016);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Long f48197OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f48198OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f48199OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TopicDetailVM f48200OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f48201OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, FragmentActivity fragmentActivity, Oooo000 oooo000, TopicDetailVM topicDetailVM, Long l) {
            super(2);
            this.f48197OooO0Oo = l;
            this.f48199OooO0o0 = fragmentActivity;
            this.f48198OooO0o = oooo000;
            this.f48200OooO0oO = topicDetailVM;
            this.f48201OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOo000o0.OooO00o(this.f48197OooO0Oo, this.f48199OooO0o0, this.f48198OooO0o, this.f48200OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f48201OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Long l, @NotNull FragmentActivity activity, @NotNull Oooo000 pagerState, @NotNull TopicDetailVM topicDetailVM, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(topicDetailVM, "topicDetailVM");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1535528905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1535528905, i, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailContent (TopicDetailContentComp.kt:55)");
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
        SurfaceKt.m1185SurfaceFjzlyU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 795528315, true, new OooO0O0(i, activity, pagerState, topicDetailVM, l)), composerStartRestartGroup, 1572870, 62);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0OO(i, activity, pagerState, topicDetailVM, l));
    }

    public static final void OooO0O0(TopicPopularMomentVM topicPopularMomentVM, int i, TopicDetailVM topicDetailVM, Function0 function0, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2064656874);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2064656874, i2, -1, "com.yalla.yalla.ui.activity.moment.InitObservers (TopicDetailContentComp.kt:173)");
        }
        composerStartRestartGroup.startReplaceableGroup(-2059604831);
        if (i == 0) {
            Observable<Object> observable = LiveEventBus.get("MOMENT_TOP_OF_TOPIC");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.MOMENT_TOP_OF_TOPIC)");
            o00000O.OooO00o(observable, new oO00o00O(topicDetailVM, function0), composerStartRestartGroup, 8);
            Observable<Object> observable2 = LiveEventBus.get("MOMENT_UN_TOP_OF_TOPIC");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.MOMENT_UN_TOP_OF_TOPIC)");
            o00000O.OooO00o(observable2, new oO00o0(topicDetailVM, function0), composerStartRestartGroup, 8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Observable<Object> observable3 = LiveEventBus.get("POST_REMOVE_OF_TOPIC");
        Intrinsics.checkNotNullExpressionValue(observable3, "get(EventKey.POST_REMOVE_OF_TOPIC)");
        o00000O.OooO00o(observable3, new oOo00ooO(topicDetailVM, topicPopularMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable4 = LiveEventBus.get("POST_DELETE_OF_TOPIC");
        Intrinsics.checkNotNullExpressionValue(observable4, "get(EventKey.POST_DELETE_OF_TOPIC)");
        o00000O.OooO00o(observable4, new oOo000Oo(topicDetailVM, topicPopularMomentVM), composerStartRestartGroup, 8);
        o0ooOOo.OooO00o(topicPopularMomentVM, null, composerStartRestartGroup, i2 & 14, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOo0000O(topicPopularMomentVM, i, topicDetailVM, function0, i2));
    }
}
