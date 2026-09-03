package p448o0OoOoo;

import android.content.Context;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOo;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.OooO0OO;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0O0O00;
import com.facebook.appevents.OooOOO0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.SquareEventRoomModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventSquareViewModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import io.agora.rtc.Constants;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.o00O0O;
import p188o00o00oO.o000;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.oo00o;
import p423o0OoO0OO.o000OO;
import p423o0OoO0OO.o00O0000;
import p531o0o0OOOo.o0OOooO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p650o0ooo.e;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEventSquarePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventSquarePage.kt\ncom/yalla/yalla/module/event/ui/page/EventSquarePage\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,404:1\n76#2:405\n76#2:602\n81#3,11:406\n81#3,11:542\n81#3,11:603\n154#4:417\n154#4:418\n154#4:454\n154#4:455\n154#4:456\n154#4:491\n154#4:492\n154#4:498\n154#4:499\n154#4:500\n154#4:506\n154#4:507\n154#4:553\n154#4:554\n154#4:590\n154#4:591\n73#5,6:419\n79#5:453\n83#5:505\n73#5,6:555\n79#5:589\n83#5:596\n78#6,11:425\n78#6,11:462\n91#6:496\n91#6:504\n78#6,11:513\n78#6,11:561\n91#6:595\n91#6:600\n456#7,8:436\n464#7,3:450\n456#7,8:473\n464#7,3:487\n467#7,3:493\n467#7,3:501\n456#7,8:524\n464#7,3:538\n456#7,8:572\n464#7,3:586\n467#7,3:592\n467#7,3:597\n36#7:614\n36#7:621\n4144#8,6:444\n4144#8,6:481\n4144#8,6:532\n4144#8,6:580\n73#9,5:457\n78#9:490\n82#9:497\n67#10,5:508\n72#10:541\n76#10:601\n1097#11,6:615\n1097#11,6:622\n1#12:628\n350#13,7:629\n*S KotlinDebug\n*F\n+ 1 EventSquarePage.kt\ncom/yalla/yalla/module/event/ui/page/EventSquarePage\n*L\n95#1:405\n306#1:602\n96#1:406,11\n275#1:542,11\n307#1:603,11\n200#1:417\n201#1:418\n217#1:454\n218#1:455\n220#1:456\n233#1:491\n235#1:492\n249#1:498\n251#1:499\n258#1:500\n270#1:506\n272#1:507\n278#1:553\n282#1:554\n288#1:590\n291#1:591\n197#1:419,6\n197#1:453\n197#1:505\n276#1:555,6\n276#1:589\n276#1:596\n197#1:425,11\n221#1:462,11\n221#1:496\n197#1:504\n265#1:513,11\n276#1:561,11\n276#1:595\n265#1:600\n197#1:436,8\n197#1:450,3\n221#1:473,8\n221#1:487,3\n221#1:493,3\n197#1:501,3\n265#1:524,8\n265#1:538,3\n276#1:572,8\n276#1:586,3\n276#1:592,3\n265#1:597,3\n308#1:614\n309#1:621\n197#1:444,6\n221#1:481,6\n265#1:532,6\n276#1:580,6\n221#1:457,5\n221#1:490\n221#1:497\n265#1:508,5\n265#1:541\n265#1:601\n308#1:615,6\n309#1:622,6\n115#1:629,7\n*E\n"})
public final class o0O000 implements o0OOooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O000 f47446OooO00o = new o0O000();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f47448OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f47449OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, int i) {
            super(2);
            this.f47449OooO0o0 = str;
            this.f47448OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47448OooO0o | 1);
            o0O000.this.OooO00o(this.f47449OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0OO(o0O000 o0o001, EventModel eventModel, Composer composer, int i) {
        int i2;
        Composer composer2;
        o0o001.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(616305568);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(eventModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(616305568, i2, -1, "com.yalla.yalla.module.event.ui.page.EventSquarePage.EventRoomInfo (EventSquarePage.kt:195)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(o00O0O0.OooO00o(3, PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(10), 0.0f, 2, null)), false, false, 0L, false, null, null, null, new o00O(eventModel), 253);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 8;
            ImageKt.Image(o000OO.OooO0OO(eventModel.getRoomImage(), null, composerStartRestartGroup, 0, 1), (String) null, SizeKt.m525size3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f))), Dp.m3775constructorimpl(38)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = o00O0OOO.OooO00o(companion2, center, composerStartRestartGroup, 6, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String roomName = eventModel.getRoomName();
            long j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
            long sp = TextUnitKt.getSp(12);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int iM3684getLefte0LSkKk = companion4.m3684getLefte0LSkKk();
            int iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
            TextUnitType.Companion companion5 = TextUnitType.INSTANCE;
            TextKt.m1261Text4IGK_g(roomName, SizeKt.m532widthInVpY3zN4$default(companion, 0.0f, Dp.m3775constructorimpl(Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR), 1, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, companion5.m3989getSpUIouoOA()), (TextDecoration) null, TextAlign.m3674boximpl(iM3684getLefte0LSkKk), 0L, iM3729getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120176);
            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(1)), composerStartRestartGroup, 6);
            TextKt.m1261Text4IGK_g(androidx.compose.ui.input.key.OooO00o.OooO00o("ID:", eventModel.getRoomIdx()), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, companion5.m3989getSpUIouoOA()), (TextDecoration) null, TextAlign.m3674boximpl(companion4.m3684getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130418);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1431640118);
            if (eventModel.getEventState() == 1) {
                SpacerKt.Spacer(OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_event_number, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(4)), composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(String.valueOf(eventModel.getRoomOnLineNumber()), (Modifier) null, o0000oo.OooO0OO(composer2).f38616OooO, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion4.m3684getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
                oo0oOO0.OooO00o(2, companion, composer2, 6);
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (OooOo.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00OO000(o0o001, eventModel, i));
    }

    public static final void OooO0Oo(o0O000 o0o001, EventViewModel eventViewModel, Composer composer, int i) {
        int i2;
        o0o001.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1112463753);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(eventViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1112463753, i2, -1, "com.yalla.yalla.module.event.ui.page.EventSquarePage.EventSquareList (EventSquarePage.kt:93)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventSquareViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final EventSquareViewModel eventSquareViewModel = (EventSquareViewModel) viewModel;
            OooOOOO oooOOOOOooO00o = o00O0O.OooO00o(eventSquareViewModel.getSquareEventPager().f38501OooO0oo, composerStartRestartGroup);
            o00OO00O o00oo00o = new o00OO00O(eventSquareViewModel, oooOOOOOooO00o, null);
            int i3 = OooOOOO.f35803OooO0o0;
            EffectsKt.LaunchedEffect(oooOOOOOooO00o, o00oo00o, composerStartRestartGroup, 72);
            Observable<Object> observable = LiveEventBus.get("DISLIKE_EVENT");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new Observer() { // from class: o0OoOoo.o00O0OO0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    long jLongValue = ((Long) obj).longValue();
                    EventSquareViewModel squareVM = eventSquareViewModel;
                    Intrinsics.checkNotNullParameter(squareVM, "$squareVM");
                    CollectionsKt.removeAll((List) squareVM.getSquareEventPager().f38497OooO0Oo, (Function1) new o00OO0O0(jLongValue));
                    squareVM.getSquareEventPager().OooO0O0();
                }
            }, composerStartRestartGroup, 72);
            e.OooO00o(null, eventViewModel.getShowLoadingDialog().getValue().booleanValue(), null, composerStartRestartGroup, 0, 6);
            Observable<Object> observable2 = LiveEventBus.get("EVENT_DELETED");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            o00O0000.OooO00o(observable2, new Observer() { // from class: o0OoOoo.oo0o0O0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Object next;
                    long jLongValue = ((Long) obj).longValue();
                    EventSquareViewModel squareVM = eventSquareViewModel;
                    Intrinsics.checkNotNullParameter(squareVM, "$squareVM");
                    o000<EventModel> squareEventPager = squareVM.getSquareEventPager();
                    Iterator<T> it = squareEventPager.f38497OooO0Oo.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((EventModel) next).getId() == jLongValue));
                    EventModel eventModel = (EventModel) next;
                    List<EventModel> list = squareEventPager.f38497OooO0Oo;
                    if (eventModel == null) {
                        return;
                    }
                    list.remove(eventModel);
                    squareEventPager.OooO0O0();
                }
            }, composerStartRestartGroup, 72);
            Observable<Object> observable3 = LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER");
            Intrinsics.checkNotNullExpressionValue(observable3, "get(...)");
            o00O0000.OooO00o(observable3, new Observer() { // from class: o0OoOoo.o00O0OO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SubscribeNotifyModel it = (SubscribeNotifyModel) obj;
                    EventSquareViewModel squareVM = eventSquareViewModel;
                    Intrinsics.checkNotNullParameter(squareVM, "$squareVM");
                    Intrinsics.checkNotNullParameter(it, "it");
                    o000<EventModel> squareEventPager = squareVM.getSquareEventPager();
                    Iterator<EventModel> it2 = squareEventPager.f38497OooO0Oo.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i4 = -1;
                            break;
                        } else {
                            if (it2.next().getId() == it.getEventId()) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (i4 < 0) {
                        return;
                    }
                    EventModel eventModel = squareEventPager.f38497OooO0Oo.get(i4);
                    eventModel.setEventNumber(it.getSubscribeCount());
                    eventModel.setHasSubscribe(it.getHasSubscribe());
                }
            }, composerStartRestartGroup, 72);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            oo00o.OooO00o(oooOOOOOooO00o, BackgroundKt.m171backgroundbw27NRU$default(Modifier.INSTANCE, o0000oo.OooO0OO(composerStartRestartGroup).f38618OooO0O0, null, 2, null), lazyListStateRememberLazyListState, null, false, null, o00.f47391OooO0O0, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -861015763, true, new o0o0Oo(lazyListStateRememberLazyListState, oooOOOOOooO00o, context, eventViewModel)), composerStartRestartGroup, 102236168, 184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00OOOO0(o0o001, eventViewModel, i));
    }

    public static final void OooO0o(o0O000 o0o001, Composer composer, int i) {
        Composer composer2;
        o0o001.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1056074542);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1056074542, i, -1, "com.yalla.yalla.module.event.ui.page.EventSquarePage.EventSquareSortHeader (EventSquarePage.kt:263)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 16;
            float f2 = 38;
            Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(BackgroundKt.m170backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0000oo.OooO0OO(composerStartRestartGroup).f38618OooO0O0, RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 12, null)), Dp.m3775constructorimpl(f2));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment centerEnd = companion2.getCenterEnd();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventSquareViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventSquareViewModel eventSquareViewModel = (EventSquareViewModel) viewModel;
            Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f2)), false, false, 0L, false, null, null, null, new o0O00000(eventSquareViewModel), 253), Dp.m3775constructorimpl(12), 0.0f, 2, null);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O0 = OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.ic_event_display_sort, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, composerStartRestartGroup, 440, 0);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(4)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(eventSquareViewModel.isSortByTime() ? o000000.event_display_sort_by_time : o000000.event_display_sort_by_heat, composerStartRestartGroup, 0), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (OooOOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O0000O(o0o001, i));
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
    public static final void OooO0o0(o0O000 o0o001, Composer composer, int i) {
        o0o001.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(24507961);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(24507961, i, -1, "com.yalla.yalla.module.event.ui.page.EventSquarePage.EventSquareRoomsList (EventSquarePage.kt:304)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventViewModel eventViewModel = (EventViewModel) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(eventViewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o00OOOOo(eventViewModel, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect((Object) null, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 70);
            Observable<Object> observable = LiveEventBus.get("UPDATE_SQUARE_EVENT_ROOM");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(eventViewModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new o00Oo00(eventViewModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0000.OooO00o(observable, (Observer) objRememberedValue2, composerStartRestartGroup, 72);
            SnapshotStateList<SquareEventRoomModel> squareEventRooms = eventViewModel.getSquareEventRooms();
            if (squareEventRooms.size() > 0) {
                LazyDslKt.LazyRow(null, null, null, false, null, null, null, false, new o0O0o(squareEventRooms, context), composerStartRestartGroup, 0, 255);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0(o0o001, i));
    }

    @Override // p531o0o0OOOo.o0OOooO0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull String arguments, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Composer composerStartRestartGroup = composer.startRestartGroup(1055100948);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055100948, i, -1, "com.yalla.yalla.module.event.ui.page.EventSquarePage.SetPage (EventSquarePage.kt:66)");
            }
            o0000oo.OooO00o(true, o00.f47390OooO00o, composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(arguments, i));
    }

    @Override // p531o0o0OOOo.o0OOooO0
    @Composable
    public final void OooO0O0(@Nullable Composer composer, int i) {
        o0OOooO0.OooO00o.OooO00o(this, composer, i);
    }
}
