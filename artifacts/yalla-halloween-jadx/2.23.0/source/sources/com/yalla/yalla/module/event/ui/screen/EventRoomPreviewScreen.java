package com.yalla.yalla.module.event.ui.screen;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TabKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.google.accompanist.pager.ExperimentalPagerApi;
import com.google.accompanist.pager.Pager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.SquareEventRoomModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.view.EventKt;
import com.yalla.yalla.module.event.vm.EventRoomPreviewPageViewModel;
import com.yalla.yalla.module.event.vm.EventRoomPreviewViewModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p186o00o00oO.o00O0;
import p186o00o00oO.o00O00OO;
import p186o00o00oO.o00O00o0;
import p403o0Oo0OOo.oO0O000;
import p446o0OoOoo0.o0oOo0O0;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.d1;
import p507o0o00ooo.h1;
import p507o0o00ooo.p1;
import p507o0o00ooo.q1;
import p507o0o00ooo.t1;
import p519o0o0O0oO.a;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002J&\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0012j\b\u0012\u0004\u0012\u00020\f`\u0013J\u0013\u0010\u0017\u001a\u00020\u0006*\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen;", "Lo0o0OOO0/o00O00O;", "Lo00o00o/Oooo000;", "pagerState", "Lkotlin/Function1;", "", "", "pageChangeRequest", "EventRoomPreviewTabRow", "(Lo00o00o/Oooo000;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "isNewRoomEvent", "Lcom/yalla/yalla/model/SquareEventRoomModel;", "eventModel", "selected", "updateSquareEventRoom", "", ContributionFragment.ARG_1, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEventRoomPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,372:1\n76#2:373\n76#2:385\n76#2:566\n81#3,11:374\n81#3,11:400\n81#3,11:555\n36#4:386\n36#4:393\n456#4,8:428\n464#4,3:442\n25#4:450\n456#4,8:485\n464#4,3:499\n456#4,8:522\n464#4,3:536\n467#4,3:540\n467#4,3:545\n467#4,3:550\n1097#5,6:387\n1097#5,6:394\n1097#5,3:451\n1100#5,3:457\n72#6,6:411\n78#6:445\n82#6:554\n78#7,11:417\n78#7,11:474\n78#7,11:511\n91#7:543\n91#7:548\n91#7:553\n4144#8,6:436\n4144#8,6:493\n4144#8,6:530\n486#9,4:446\n490#9,2:454\n494#9:460\n486#10:456\n350#11,7:461\n66#12,6:468\n72#12:502\n66#12,6:505\n72#12:539\n76#12:544\n76#12:549\n154#13:503\n154#13:504\n154#13:567\n154#13:568\n*S KotlinDebug\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen\n*L\n91#1:373\n94#1:385\n239#1:566\n93#1:374,11\n98#1:400,11\n237#1:555,11\n95#1:386\n96#1:393\n106#1:428,8\n106#1:442,3\n111#1:450\n124#1:485,8\n124#1:499,3\n128#1:522,8\n128#1:536,3\n128#1:540,3\n124#1:545,3\n106#1:550,3\n95#1:387,6\n96#1:394,6\n111#1:451,3\n111#1:457,3\n106#1:411,6\n106#1:445\n106#1:554\n106#1:417,11\n124#1:474,11\n128#1:511,11\n128#1:543\n124#1:548\n106#1:553\n106#1:436,6\n124#1:493,6\n128#1:530,6\n111#1:446,4\n111#1:454,2\n111#1:460\n111#1:456\n120#1:461,7\n124#1:468,6\n124#1:502\n128#1:505,6\n128#1:539\n128#1:544\n124#1:549\n131#1:503\n134#1:504\n242#1:567\n244#1:568\n*E\n"})
public final class EventRoomPreviewScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final EventRoomPreviewScreen INSTANCE = new EventRoomPreviewScreen();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<SquareEventRoomModel> f23823OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f23824OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f23825OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23826OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Context f23827OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(ArrayList<SquareEventRoomModel> arrayList, p184o00o00o.Oooo000 oooo000, Function1<? super Integer, Unit> function1, int i, Context context) {
            super(2);
            this.f23823OooO0Oo = arrayList;
            this.f23825OooO0o0 = oooo000;
            this.f23824OooO0o = function1;
            this.f23826OooO0oO = i;
            this.f23827OooO0oo = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            OooO oooO = this;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1096696782, iIntValue, -1, "com.yalla.yalla.module.event.ui.screen.EventRoomPreviewScreen.EventRoomPreviewTabRow.<anonymous> (EventRoomPreviewScreen.kt:263)");
                }
                int size = oooO.f23823OooO0Oo.size();
                ArrayList<SquareEventRoomModel> arrayList = oooO.f23823OooO0Oo;
                Function1<Integer, Unit> function1 = oooO.f23824OooO0o;
                int i = oooO.f23826OooO0oO;
                Context context = oooO.f23827OooO0oo;
                int i2 = 0;
                while (i2 < size) {
                    boolean z = oooO.f23825OooO0o0.OooO0oO() == i2;
                    TabKt.m1208Tab0nDMI0(z, o00000O.f23938OooO0Oo, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), true, null, ComposableLambdaKt.composableLambda(composer2, 568350077, true, new o0000O00(arrayList, i2, z, function1, i, context)), null, 0L, 0L, composer2, 200112, 464);
                    i2++;
                    size = size;
                    i = i;
                    context = context;
                    function1 = function1;
                    arrayList = arrayList;
                    oooO = this;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f23828OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f23829OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(p184o00o00o.Oooo000 oooo000, CoroutineScope coroutineScope) {
            super(1);
            this.f23828OooO0Oo = coroutineScope;
            this.f23829OooO0o0 = oooo000;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            BuildersKt__Builders_commonKt.launch$default(this.f23828OooO0Oo, null, null, new o00oO0o(this.f23829OooO0o0, num.intValue(), null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEventRoomPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen$Content$3$1$2$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,372:1\n66#2,6:373\n72#2:407\n76#2:423\n78#3,11:379\n91#3:422\n456#4,8:390\n464#4,3:404\n467#4,3:419\n4144#5,6:398\n81#6,11:408\n*S KotlinDebug\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen$Content$3$1$2$1\n*L\n138#1:373,6\n138#1:407\n138#1:423\n138#1:379,11\n138#1:422\n138#1:390,8\n138#1:404,3\n138#1:419,3\n138#1:398,6\n139#1:408,11\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function4<p184o00o00o.OooOo00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<SquareEventRoomModel> f23830OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f23831OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f23832OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ArrayList<SquareEventRoomModel> arrayList, Context context, EventViewModel eventViewModel) {
            super(4);
            this.f23830OooO0Oo = arrayList;
            this.f23832OooO0o0 = context;
            this.f23831OooO0o = eventViewModel;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(p184o00o00o.OooOo00 oooOo00, Integer num, Composer composer, Integer num2) {
            int i;
            p184o00o00o.OooOo00 HorizontalPager = oooOo00;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 112) == 0) {
                i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((i & 721) == 144 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1225161403, iIntValue2, -1, "com.yalla.yalla.module.event.ui.screen.EventRoomPreviewScreen.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventRoomPreviewScreen.kt:136)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String strValueOf = String.valueOf(iIntValue);
                o00000O0 o00000o1 = new o00000O0(this.f23830OooO0Oo, iIntValue);
                composer2.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(EventRoomPreviewPageViewModel.class, current, strValueOf, o00000o1, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
                composer2.endReplaceableGroup();
                EventRoomPreviewPageViewModel eventRoomPreviewPageViewModel = (EventRoomPreviewPageViewModel) viewModel;
                o000O0.OooO0O0 oooO0O0OooO00o = o000O0.OooOOO.OooO00o(eventRoomPreviewPageViewModel.getEventRoomPreviewPager().f37667OooO0oo, composer2);
                Observable<Object> observable = LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER");
                Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.EVENT_UPDATE_SUBSCRIBE_NUMBER)");
                p417o0OoO0.o00000O.OooO00o(observable, new o0ooOOo(eventRoomPreviewPageViewModel), composer2, 8);
                Observable<Object> observable2 = LiveEventBus.get("EVENT_DELETED");
                Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.EVENT_DELETED)");
                p417o0OoO0.o00000O.OooO00o(observable2, new o0OOO0o(eventRoomPreviewPageViewModel), composer2, 8);
                Observable<Object> observable3 = LiveEventBus.get("DISLIKE_EVENT");
                Intrinsics.checkNotNullExpressionValue(observable3, "get(EventKey.DISLIKE_EVENT)");
                p417o0OoO0.o00000O.OooO00o(observable3, new o0Oo0oo(eventRoomPreviewPageViewModel), composer2, 8);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 1775130521, true, new o00000(oooO0O0OooO00o, this.f23832OooO0o0, this.f23831OooO0o));
                int i2 = o000O0.OooO0O0.f34327OooO0o0;
                p148o00Oo0o.o0O0O00.OooO00o(oooO0O0OooO00o, modifierFillMaxSize$default2, null, null, false, null, null, null, composableLambda, composer2, 100663352, 252);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23834OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f23835OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ColumnScope columnScope, int i) {
            super(2);
            this.f23835OooO0o0 = columnScope;
            this.f23834OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23834OooO0o | 1);
            EventRoomPreviewScreen.this.Content(this.f23835OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<List<? extends p1>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f23836OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(p184o00o00o.Oooo000 oooo000) {
            super(3);
            this.f23836OooO0Oo = oooo000;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(List<? extends p1> list, Composer composer, Integer num) {
            List<? extends p1> tabPositions = list;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(521308722, iIntValue, -1, "com.yalla.yalla.module.event.ui.screen.EventRoomPreviewScreen.EventRoomPreviewTabRow.<anonymous> (EventRoomPreviewScreen.kt:245)");
            }
            q1 q1Var = q1.f50178OooO00o;
            Modifier.Companion companion = Modifier.INSTANCE;
            TweenSpec tweenSpec = d1.f49813OooO00o;
            Intrinsics.checkNotNullParameter(companion, "<this>");
            p184o00o00o.Oooo000 pagerState = this.f23836OooO0Oo;
            Intrinsics.checkNotNullParameter(pagerState, "pagerState");
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            q1Var.OooO0O0(ComposedModifierKt.composed$default(companion, null, new h1(pagerState, tabPositions), 1, null), 0.0f, 0.0f, null, 0L, false, o0oOo0O0.f46399OooO00o, composer2, 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f23838OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f23839OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23840OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(p184o00o00o.Oooo000 oooo000, Function1<? super Integer, Unit> function1, int i) {
            super(2);
            this.f23839OooO0o0 = oooo000;
            this.f23838OooO0o = function1;
            this.f23840OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23840OooO0oO | 1);
            p184o00o00o.Oooo000 oooo000 = this.f23839OooO0o0;
            Function1<Integer, Unit> function1 = this.f23838OooO0o;
            EventRoomPreviewScreen.this.EventRoomPreviewTabRow(oooo000, function1, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f23842OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f23843OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23844OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(p184o00o00o.Oooo000 oooo000, Function1<? super Integer, Unit> function1, int i) {
            super(2);
            this.f23843OooO0o0 = oooo000;
            this.f23842OooO0o = function1;
            this.f23844OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23844OooO0oO | 1);
            p184o00o00o.Oooo000 oooo000 = this.f23843OooO0o0;
            Function1<Integer, Unit> function1 = this.f23842OooO0o;
            EventRoomPreviewScreen.this.EventRoomPreviewTabRow(oooo000, function1, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.screen.EventRoomPreviewScreen$updateSquareEventRoom$1", f = "EventRoomPreviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SquareEventRoomModel f23845OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(SquareEventRoomModel squareEventRoomModel, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f23845OooO0Oo = squareEventRoomModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f23845OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SquareEventRoomModel squareEventRoomModel = this.f23845OooO0Oo;
            long userId = squareEventRoomModel.getUserId();
            long roomId = squareEventRoomModel.getRoomId();
            long eventCreateTime = squareEventRoomModel.getEventCreateTime();
            oO0O000 oo0o000OooOo0 = p581o0oOoo00.o000OOo.OooO00o().OooOo0();
            Intrinsics.checkNotNullExpressionValue(oo0o000OooOo0, "DB.squareEventRoomDao");
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
            oo0o000OooOo0.OooO0O0(l == null ? 0L : l.longValue(), userId, roomId, eventCreateTime);
            LiveEventBus.get("UPDATE_SQUARE_EVENT_ROOM").post(Boxing.boxLong(squareEventRoomModel.getRoomId()));
            return Unit.INSTANCE;
        }
    }

    private EventRoomPreviewScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalPagerApi
    public final void EventRoomPreviewTabRow(p184o00o00o.Oooo000 oooo000, Function1<? super Integer, Unit> function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(407698770);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(oooo000) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407698770, i3, -1, "com.yalla.yalla.module.event.ui.screen.EventRoomPreviewScreen.EventRoomPreviewTabRow (EventRoomPreviewScreen.kt:235)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventRoomPreviewViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            ArrayList<SquareEventRoomModel> roomListSquare = ((EventRoomPreviewViewModel) viewModel).getRoomListSquare();
            if (roomListSquare == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(oooo000, function1, i));
                return;
            }
            composer2 = composerStartRestartGroup;
            d1.OooO00o(oooo000.OooO0oO(), SizeKt.m509height3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(109)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO, 0L, Dp.m3765constructorimpl(0), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 521308722, true, new OooO0o(oooo000)), o0oOo0O0.f46400OooO0O0, ComposableLambdaKt.composableLambda(composer2, -1096696782, true, new OooO(roomListSquare, oooo000, function1, i3, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), composer2, 14377008, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0(oooo000, function1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean updateSquareEventRoom(boolean isNewRoomEvent, SquareEventRoomModel eventModel, boolean selected) {
        if (!isNewRoomEvent || !selected) {
            return isNewRoomEvent;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO0(eventModel, null), 3, null);
        return false;
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1665135326);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1665135326, i, -1, "com.yalla.yalla.module.event.ui.screen.EventRoomPreviewScreen.Content (EventRoomPreviewScreen.kt:89)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            o00O00OO o00o00ooOooO00o = o00O0.OooO00o(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventRoomPreviewViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventRoomPreviewViewModel eventRoomPreviewViewModel = (EventRoomPreviewViewModel) viewModel;
            Bundle bundleOooO0O0 = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Long.valueOf(bundleOooO0O0.getLong(ContributionFragment.ARG_1, 0L));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            eventRoomPreviewViewModel.setInitialPageRoomId(((Number) objRememberedValue).longValue());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = bundleOooO0O0.getParcelableArrayList("roomList");
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            eventRoomPreviewViewModel.setRoomListSquare((ArrayList) objRememberedValue2);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(EventViewModel.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventViewModel eventViewModel = (EventViewModel) viewModel2;
            o00O00o0.OooO0O0(o00o00ooOooO00o, o0oO0O0o.f46945OooO00o, true, 4);
            a.OooO00o(null, eventViewModel.getShowLoadingDialog().getValue().booleanValue(), null, composerStartRestartGroup, 0, 6);
            EventKt.OooOO0o(eventViewModel.getShowAddToCalendarDialog(), context, eventViewModel.getAddToCalendarEventModel(), composerStartRestartGroup, (EventModel.$stable << 6) | 64);
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            t1.OooO00o(null, 0.0f, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, Integer.valueOf(oOo00OO0.event_preview_close), null, null, null, null, null, composerStartRestartGroup, 0, 499);
            ArrayList<SquareEventRoomModel> roomListSquare = eventRoomPreviewViewModel.getRoomListSquare();
            if (roomListSquare != null && !roomListSquare.isEmpty()) {
                Iterator<SquareEventRoomModel> it = roomListSquare.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (it.next().getRoomId() == eventRoomPreviewViewModel.getInitialPageRoomId()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                p184o00o00o.Oooo000 oooo000OooO00o = p184o00o00o.o000oOoO.OooO00o(i2, composer2, 0, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                INSTANCE.EventRoomPreviewTabRow(oooo000OooO00o, new OooO00o(oooo000OooO00o, coroutineScope), composer2, 384);
                float f = 12;
                Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 0.0f, Dp.m3765constructorimpl(101), 0.0f, 0.0f, 13, null), o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 12, null));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
                if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Pager.OooO00o(roomListSquare.size(), null, oooo000OooO00o, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.composableLambda(composer2, 1225161403, true, new OooO0O0(roomListSquare, context, eventViewModel)), composer2, 0, 6, 1018);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(columnScope, i));
    }

    public final void navigate(long roomId, @NotNull ArrayList<SquareEventRoomModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Bundle bundleOooO00o = p063o0000oO.o00Ooo.OooO00o();
        bundleOooO00o.putLong(ContributionFragment.ARG_1, roomId);
        bundleOooO00o.putParcelableArrayList("roomList", list);
        oo0oOO0.OooO0o0(INSTANCE, bundleOooO00o, false, null, 12);
    }
}
