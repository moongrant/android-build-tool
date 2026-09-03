package p536o0o0Oo0o;

import OooOo.OooO0o;
import android.content.Context;
import androidx.camera.core.impl.o00OOO00;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOOOO;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.OooO00o;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
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
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.uikit.swiprefresh.RefreshState;
import com.code.android.util.OooOo00;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p031OoooO0.o0OoOo0;
import p147o00Oo0Oo.o000OOo;
import p153o00OoO0.OooOO0;
import p417o0OoO0.o00000O;
import p417o0OoO0.o00Oo0;
import p445o0OoOoo.o0oOO;
import p464o0Oooo.o000000O;
import p507o0o00ooo.t1;
import p509o0o0O0.o00OO;
import p509o0o0O0.o0ooOOo;
import p515o0o0O0O0.o0Oo0oo;
import p579o0oOoo.oO0O0O00;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserMomentListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,537:1\n76#2:538\n76#2:540\n76#2:587\n76#2:719\n154#3:539\n154#3:629\n154#3:661\n154#3:662\n164#3:663\n154#3:664\n164#3:707\n154#3:708\n154#3:720\n154#3:721\n154#3:757\n154#3:758\n154#3:794\n154#3:795\n154#3:796\n154#3:802\n81#4,11:541\n72#5,6:552\n78#5:586\n82#5:621\n78#6,11:558\n91#6:620\n78#6,11:632\n78#6,11:678\n91#6:712\n91#6:717\n78#6,11:728\n78#6,11:765\n91#6:800\n91#6:806\n456#7,8:569\n464#7,3:583\n25#7:588\n25#7:599\n25#7:610\n467#7,3:617\n25#7:622\n456#7,8:643\n464#7,3:657\n36#7:665\n456#7,8:689\n464#7,3:703\n467#7,3:709\n467#7,3:714\n456#7,8:739\n464#7,3:753\n456#7,8:776\n464#7,3:790\n467#7,3:797\n467#7,3:803\n25#7:812\n4144#8,6:577\n4144#8,6:651\n4144#8,6:697\n4144#8,6:747\n4144#8,6:784\n1097#9,6:589\n1097#9,3:600\n1100#9,3:606\n1097#9,6:611\n1097#9,6:623\n1097#9,6:666\n1097#9,3:813\n1100#9,3:819\n486#10,4:595\n490#10,2:603\n494#10:609\n486#10,4:808\n490#10,2:816\n494#10:822\n486#11:605\n486#11:818\n77#12,2:630\n79#12:660\n73#12,6:672\n79#12:706\n83#12:713\n83#12:718\n73#12,6:722\n79#12:756\n73#12,6:759\n79#12:793\n83#12:801\n83#12:807\n81#13:823\n81#13:824\n81#13:825\n107#13,2:826\n*S KotlinDebug\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt\n*L\n151#1:538\n171#1:540\n191#1:587\n414#1:719\n156#1:539\n371#1:629\n376#1:661\n377#1:662\n378#1:663\n381#1:664\n394#1:707\n401#1:708\n419#1:720\n420#1:721\n430#1:757\n431#1:758\n442#1:794\n464#1:795\n465#1:796\n476#1:802\n172#1:541,11\n174#1:552,6\n174#1:586\n174#1:621\n174#1:558,11\n174#1:620\n366#1:632,11\n373#1:678,11\n373#1:712\n366#1:717\n416#1:728,11\n434#1:765,11\n434#1:800\n416#1:806\n174#1:569,8\n174#1:583,3\n193#1:588\n201#1:599\n209#1:610\n174#1:617,3\n362#1:622\n366#1:643,8\n366#1:657,3\n382#1:665\n373#1:689,8\n373#1:703,3\n373#1:709,3\n366#1:714,3\n416#1:739,8\n416#1:753,3\n434#1:776,8\n434#1:790,3\n434#1:797,3\n416#1:803,3\n486#1:812\n174#1:577,6\n366#1:651,6\n373#1:697,6\n416#1:747,6\n434#1:784,6\n193#1:589,6\n201#1:600,3\n201#1:606,3\n209#1:611,6\n362#1:623,6\n382#1:666,6\n486#1:813,3\n486#1:819,3\n201#1:595,4\n201#1:603,2\n201#1:609\n486#1:808,4\n486#1:816,2\n486#1:822\n201#1:605\n486#1:818\n366#1:630,2\n366#1:660\n373#1:672,6\n373#1:706\n373#1:713\n366#1:718\n416#1:722,6\n416#1:756\n434#1:759,6\n434#1:793\n434#1:801\n416#1:807\n193#1:823\n209#1:824\n362#1:825\n362#1:826,2\n*E\n"})
public final class O0OO00 {
    public static final void OooO00o(MomentUserListVM momentUserListVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(51270832);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(51270832, i, -1, "com.yalla.yalla.ui.screen.user.FilterTypeView (UserMomentListScreen.kt:360)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical top = companion2.getTop();
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal end = arrangement.getEnd();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierOooO00o = OooOO0.OooO00o(42, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), composerStartRestartGroup, 693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, top, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        float f = 12;
        Modifier modifierOooO00o2 = o0oOO.OooO00o(f, ClipKt.clip(rowScopeInstance.align(BorderKt.m180borderxT4_qwU(SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion3, 0.0f, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(16), 0.0f, 9, null), Dp.m3765constructorimpl(30)), Dp.m3765constructorimpl((float) 0.5d), o000OOo.OooO0OO(composerStartRestartGroup).f37706OooO0o, RoundedCornerShapeKt.RoundedCornerShape(50)), companion2.getCenterVertically()), RoundedCornerShapeKt.RoundedCornerShape(50)), 0.0f, 2, null, composerStartRestartGroup, 1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new oOO000o(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierOooO00o2, (Function1) objRememberedValue2), false, false, 0L, false, null, null, null, new oOO00(mutableState, momentUserListVM), 253);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(momentUserListVM.getScreenCurrent().getValue().getReId(), composerStartRestartGroup, 0), (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl((float) 2.0d), null, composerStartRestartGroup, 6, 2);
        ImageKt.Image(PainterResources_androidKt.painterResource(momentUserListVM.getLayoutCoordinates() != null ? oOo00OO0.ic_user_moment_screen_arrow_top : oOo00OO0.ic_user_moment_screen_arrow_bottom, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion3, Dp.m3765constructorimpl(8)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        oOO0000.f55183OooO00o.OooO00o(48, 0, composerStartRestartGroup, new oOO00O0(momentUserListVM));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOO00OO(momentUserListVM, i));
    }

    public static final void OooO0O0(MomentUserListVM momentUserListVM, String str, LazyListState lazyListState, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1910085260);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1910085260, i, -1, "com.yalla.yalla.ui.screen.user.InitObservers (UserMomentListScreen.kt:482)");
        }
        o0ooOOo.OooO00o(momentUserListVM, null, composerStartRestartGroup, 8, 2);
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScopeOooO00o = OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composerStartRestartGroup, 2095651801);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (o00OOO00.OooO0O0(str)) {
            Observable<Object> observable = LiveEventBus.get("Post_send_add");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.Post_send_add)");
            o00000O.OooO00o(observable, new oOO0(momentUserListVM, coroutineScopeOooO00o, lazyListState), composerStartRestartGroup, 8);
            Observable<Object> observable2 = LiveEventBus.get("Post_send_success");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.Post_send_success)");
            o00000O.OooO00o(observable2, new oOO0O000(momentUserListVM), composerStartRestartGroup, 8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Observable<Object> observable3 = LiveEventBus.get("MOMENT_TOP_OF_USER_POST");
        Intrinsics.checkNotNullExpressionValue(observable3, "get(EventKey.MOMENT_TOP_OF_USER_POST)");
        o00000O.OooO00o(observable3, new oOO0O0O0(coroutineScopeOooO00o, str, momentUserListVM, lazyListState), composerStartRestartGroup, 8);
        Observable<Object> observable4 = LiveEventBus.get("MOMENT_UN_TOP_OF_USER_POST");
        Intrinsics.checkNotNullExpressionValue(observable4, "get(EventKey.MOMENT_UN_TOP_OF_USER_POST)");
        o00000O.OooO00o(observable4, new oOO0O0O(str, momentUserListVM), composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOO0OO0O(momentUserListVM, str, lazyListState, i));
    }

    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v22 */
    public static final void OooO0OO(TopicInfoModel topicInfoModel, Composer composer, int i) {
        Integer numValueOf;
        ?? r2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1685575661);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1685575661, i, -1, "com.yalla.yalla.ui.screen.user.TopicItem (UserMomentListScreen.kt:412)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(PaddingKt.m478paddingVpY3zN4$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(44)), Dp.m3765constructorimpl(16), 0.0f, 2, null), false, false, 0L, false, null, null, null, new oOO0OO(context, topicInfoModel), 253);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        float f = 32;
        ImageKt.Image(o00Oo0.OooO0O0(topicInfoModel.getImage(), null, composerStartRestartGroup, 0, 1), (String) null, OooOo.OooO0O0(6, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
        Modifier modifierOooO00o = OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1251Text4IGK_g(topicInfoModel.getName(), rowScopeInstance.weight(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false), o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3120, 120816);
        int positionid = topicInfoModel.getPositionid();
        if (positionid != 1) {
            numValueOf = positionid != 3 ? null : Integer.valueOf(oOo00OO0.ic_topic_manager);
        } else {
            numValueOf = Integer.valueOf(oOo00OO0.ic_topic_owner);
        }
        composerStartRestartGroup.startReplaceableGroup(-1208682425);
        if (numValueOf == null) {
            r2 = 0;
        } else {
            numValueOf.intValue();
            ImageKt.Image(PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            Unit unit = Unit.INSTANCE;
            r2 = 0;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1603802527);
        if (OooOo00.OooO0O0(Integer.valueOf(topicInfoModel.getJoinNum()))) {
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(o0OoOo0.OooO00o(p590o0oo0.OooOOOO.OooO0o(topicInfoModel.getJoinNum(), r2), ZegoConstants.ZegoVideoDataAuxPublishingStream, StringResources_androidKt.stringResource(oO00OOo0.topic_Followers, composerStartRestartGroup, r2)), PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
        } else {
            composer2 = composerStartRestartGroup;
        }
        if (OooO0o.OooO0O0(composer2)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOO0OOO(topicInfoModel, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0Oo(MomentUserListVM momentUserListVM, String str, LazyListState lazyListState, Composer composer, int i) {
        int i2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Composer composerStartRestartGroup = composer.startRestartGroup(1610581641);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1610581641, i, -1, "com.yalla.yalla.ui.screen.user.UserMomentListContent (UserMomentListScreen.kt:169)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(BaseMomentDetailVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        BaseMomentDetailVM baseMomentDetailVM = (BaseMomentDetailVM) viewModel;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
        Function2 function2OooO00o = OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        t1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.moments, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -973286030, true, new oOO0OoO0(context, str)), null, composerStartRestartGroup, 12582912, 382);
        RefreshState refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        FragmentActivity fragmentActivity = objConsume instanceof FragmentActivity ? (FragmentActivity) objConsume : null;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            Intrinsics.checkNotNull(fragmentActivity);
            i2 = 2;
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new oO0O0O00(fragmentActivity, GiftPropTypeShow.InMomentList, baseMomentDetailVM, null, 24), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            snapshotMutationPolicy = null;
        } else {
            i2 = 2;
            snapshotMutationPolicy = null;
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        if (!momentUserListVM.isRefreshIng().getValue().booleanValue()) {
            refreshStateOooO0OO.OooO0Oo(false);
        }
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        if (objOooO00o == companion2.getEmpty()) {
            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        momentUserListVM.setScrollToTop(new oOO(lazyListState, coroutineScope));
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new o0Oo0oo(lazyListState), snapshotMutationPolicy, i2, snapshotMutationPolicy);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        ((o0Oo0oo) mutableState2.getValue()).OooO0O0(momentUserListVM.getListData().size(), null, composerStartRestartGroup, ConstantsKt.MINIMUM_BLOCK_SIZE, 2);
        com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshStateOooO0OO, new oOOO000o(momentUserListVM), null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1756822048, true, new oOOo0O00(i, context, lazyListState, mutableState2, mutableState, fragmentActivity, momentUserListVM, str)), composerStartRestartGroup, 196616, 28);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOo0o00(momentUserListVM, str, lazyListState, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0o0(BoxScope boxScope, long j, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1688180153);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1688180153, i, -1, "com.yalla.yalla.ui.screen.user.createMomentView (UserMomentListScreen.kt:149)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l != null && j == l.longValue()) {
                o00OO.f50892OooO00o.OooO00o(PaddingKt.m480paddingqDBjuR0$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomEnd()), 0.0f, 0.0f, Dp.m3765constructorimpl(6), Dp.m3765constructorimpl(78), 3, null), new O0000000(context), composerStartRestartGroup, 384, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new O0O0(boxScope, j, i));
    }
}
