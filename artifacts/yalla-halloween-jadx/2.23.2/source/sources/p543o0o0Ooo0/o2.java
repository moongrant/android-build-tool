package p543o0o0Ooo0;

import android.content.Context;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo;
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
import androidx.compose.material.OooO0OO;
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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o00O0O0;
import com.code.android.uikit.swiprefresh.OooO0o;
import com.code.android.uikit.swiprefresh.RefreshState;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.OnTopPostForUserPostModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentType;
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
import kotlin.reflect.jvm.internal.impl.types.OooO00o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p031OoooO0.o0OoOo0;
import p193o00o0O0O.o0000oo;
import p423o0OoO0OO.o000OO;
import p423o0OoO0OO.o00O0000;
import p454o0Ooo000.OooOo00;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;
import p516o0o0O00o.o0O0oo0o;
import p519o0o0O0OO.o00O00;
import p519o0o0O0OO.o0O0o000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.l;
import p598o0oo00Oo.o0000O00;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserMomentListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,537:1\n76#2:538\n76#2:540\n76#2:587\n76#2:719\n154#3:539\n154#3:629\n154#3:661\n154#3:662\n164#3:663\n154#3:664\n164#3:707\n154#3:708\n154#3:720\n154#3:721\n154#3:757\n154#3:758\n154#3:794\n154#3:795\n154#3:796\n154#3:802\n81#4,11:541\n72#5,6:552\n78#5:586\n82#5:621\n78#6,11:558\n91#6:620\n78#6,11:632\n78#6,11:678\n91#6:712\n91#6:717\n78#6,11:728\n78#6,11:765\n91#6:800\n91#6:806\n456#7,8:569\n464#7,3:583\n25#7:588\n25#7:599\n25#7:610\n467#7,3:617\n25#7:622\n456#7,8:643\n464#7,3:657\n36#7:665\n456#7,8:689\n464#7,3:703\n467#7,3:709\n467#7,3:714\n456#7,8:739\n464#7,3:753\n456#7,8:776\n464#7,3:790\n467#7,3:797\n467#7,3:803\n25#7:812\n4144#8,6:577\n4144#8,6:651\n4144#8,6:697\n4144#8,6:747\n4144#8,6:784\n1097#9,6:589\n1097#9,3:600\n1100#9,3:606\n1097#9,6:611\n1097#9,6:623\n1097#9,6:666\n1097#9,3:813\n1100#9,3:819\n486#10,4:595\n490#10,2:603\n494#10:609\n486#10,4:808\n490#10,2:816\n494#10:822\n486#11:605\n486#11:818\n77#12,2:630\n79#12:660\n73#12,6:672\n79#12:706\n83#12:713\n83#12:718\n73#12,6:722\n79#12:756\n73#12,6:759\n79#12:793\n83#12:801\n83#12:807\n81#13:823\n81#13:824\n81#13:825\n107#13,2:826\n*S KotlinDebug\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt\n*L\n151#1:538\n171#1:540\n191#1:587\n414#1:719\n156#1:539\n371#1:629\n376#1:661\n377#1:662\n378#1:663\n381#1:664\n394#1:707\n401#1:708\n419#1:720\n420#1:721\n430#1:757\n431#1:758\n442#1:794\n464#1:795\n465#1:796\n476#1:802\n172#1:541,11\n174#1:552,6\n174#1:586\n174#1:621\n174#1:558,11\n174#1:620\n366#1:632,11\n373#1:678,11\n373#1:712\n366#1:717\n416#1:728,11\n434#1:765,11\n434#1:800\n416#1:806\n174#1:569,8\n174#1:583,3\n193#1:588\n201#1:599\n209#1:610\n174#1:617,3\n362#1:622\n366#1:643,8\n366#1:657,3\n382#1:665\n373#1:689,8\n373#1:703,3\n373#1:709,3\n366#1:714,3\n416#1:739,8\n416#1:753,3\n434#1:776,8\n434#1:790,3\n434#1:797,3\n416#1:803,3\n486#1:812\n174#1:577,6\n366#1:651,6\n373#1:697,6\n416#1:747,6\n434#1:784,6\n193#1:589,6\n201#1:600,3\n201#1:606,3\n209#1:611,6\n362#1:623,6\n382#1:666,6\n486#1:813,3\n486#1:819,3\n201#1:595,4\n201#1:603,2\n201#1:609\n486#1:808,4\n486#1:816,2\n486#1:822\n201#1:605\n486#1:818\n366#1:630,2\n366#1:660\n373#1:672,6\n373#1:706\n373#1:713\n366#1:718\n416#1:722,6\n416#1:756\n434#1:759,6\n434#1:793\n434#1:801\n416#1:807\n193#1:823\n209#1:824\n362#1:825\n362#1:826,2\n*E\n"})
public final class o2 {
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
        Modifier modifierOooO0O0 = OooO00o.OooO0O0(42, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), composerStartRestartGroup, 693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, top, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Function2 function2OooO00o = OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        float f = 12;
        Modifier modifierOooO00o = OooOo00.OooO00o(f, ClipKt.clip(rowScopeInstance.align(BorderKt.m182borderxT4_qwU(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion3, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(16), 0.0f, 9, null), Dp.m3775constructorimpl(30)), Dp.m3775constructorimpl((float) 0.5d), o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, RoundedCornerShapeKt.RoundedCornerShape(50)), companion2.getCenterVertically()), RoundedCornerShapeKt.RoundedCornerShape(50)), 0.0f, 2, null, composerStartRestartGroup, 1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new k1(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O1 = o0O0O00.OooO0O0(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierOooO00o, (Function1) objRememberedValue2), false, false, 0L, false, null, null, null, new l1(mutableState, momentUserListVM), 253);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
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
        Function2 function2OooO00o2 = OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(momentUserListVM.getScreenCurrent().getValue().getReId(), composerStartRestartGroup, 0), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl((float) 2.0d), null, composerStartRestartGroup, 6, 2);
        ImageKt.Image(PainterResources_androidKt.painterResource(momentUserListVM.getLayoutCoordinates() != null ? o0Oo0oo.ic_user_moment_screen_arrow_top : o0Oo0oo.ic_user_moment_screen_arrow_bottom, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(8)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        e1.f55398OooO00o.OooO00o(48, 0, composerStartRestartGroup, new m1(momentUserListVM));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new n1(momentUserListVM, i));
    }

    public static final void OooO0O0(final MomentUserListVM momentUserListVM, final String str, final LazyListState lazyListState, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1910085260);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1910085260, i, -1, "com.yalla.yalla.ui.screen.user.InitObservers (UserMomentListScreen.kt:482)");
        }
        o00O00.OooO00o(momentUserListVM, null, composerStartRestartGroup, 8, 2);
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composerStartRestartGroup, 2095651801);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (oOOO0O0o.OooO00o(str)) {
            Observable<Object> observable = LiveEventBus.get("Post_send_add");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new Observer() { // from class: o0o0Ooo0.g1
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    CoroutineScope coroutineScope = coroutineScopeOooO00o;
                    MomentSendModel it = (MomentSendModel) obj;
                    MomentUserListVM newMomentVM = momentUserListVM;
                    Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                    Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
                    LazyListState lazyListState2 = lazyListState;
                    Intrinsics.checkNotNullParameter(lazyListState2, "$lazyListState");
                    Intrinsics.checkNotNullParameter(it, "it");
                    o0000O00.OooO0O0("动态任务 新增 刷新 " + it.getType() + ",data is==>" + it);
                    if (it.getType() == MomentType.Video.getValue()) {
                        newMomentVM.setRefreshTrigger(Boolean.FALSE);
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o1(lazyListState2, null), 3, null);
                }
            }, composerStartRestartGroup, 72);
            Observable<Object> observable2 = LiveEventBus.get("Post_send_success");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            o00O0000.OooO00o(observable2, new Observer() { // from class: o0o0Ooo0.h1
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    MomentSendModel it = (MomentSendModel) obj;
                    MomentUserListVM newMomentVM = momentUserListVM;
                    Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                    Intrinsics.checkNotNullParameter(it, "it");
                    o0000O00.OooO0O0("动态任务 发送成功 刷新 taskModel = " + it);
                    newMomentVM.postSendSuccess(it);
                }
            }, composerStartRestartGroup, 72);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Observable<Object> observable3 = LiveEventBus.get("MOMENT_TOP_OF_USER_POST");
        Intrinsics.checkNotNullExpressionValue(observable3, "get(...)");
        o00O0000.OooO00o(observable3, new Observer() { // from class: o0o0Ooo0.i1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CoroutineScope coroutineScope = coroutineScopeOooO00o;
                OnTopPostForUserPostModel onTopPostForUserPostModel = (OnTopPostForUserPostModel) obj;
                Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
                String userId = str;
                Intrinsics.checkNotNullParameter(userId, "$userId");
                MomentUserListVM newMomentVM = momentUserListVM;
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                LazyListState lazyListState2 = lazyListState;
                Intrinsics.checkNotNullParameter(lazyListState2, "$lazyListState");
                Intrinsics.checkNotNullParameter(onTopPostForUserPostModel, "<name for destructuring parameter 0>");
                String userId2 = onTopPostForUserPostModel.getUserId();
                long postId = onTopPostForUserPostModel.getPostId();
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new p1(lazyListState2, null), 3, null);
                if (Intrinsics.areEqual(userId2, userId)) {
                    newMomentVM.setTopicDetailTopPostId(postId, true, new q1(newMomentVM, postId, null));
                }
            }
        }, composerStartRestartGroup, 72);
        Observable<Object> observable4 = LiveEventBus.get("MOMENT_UN_TOP_OF_USER_POST");
        Intrinsics.checkNotNullExpressionValue(observable4, "get(...)");
        o00O0000.OooO00o(observable4, new Observer() { // from class: o0o0Ooo0.j1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MomentUserListVM newMomentVM = momentUserListVM;
                OnTopPostForUserPostModel onTopPostForUserPostModel = (OnTopPostForUserPostModel) obj;
                String userId = str;
                Intrinsics.checkNotNullParameter(userId, "$userId");
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                Intrinsics.checkNotNullParameter(onTopPostForUserPostModel, "<name for destructuring parameter 0>");
                String userId2 = onTopPostForUserPostModel.getUserId();
                long postId = onTopPostForUserPostModel.getPostId();
                if (Intrinsics.areEqual(userId2, userId)) {
                    MomentUserListVM.setTopicDetailTopPostId$default(newMomentVM, postId, true, null, 4, null);
                }
                newMomentVM.setTopPostDetailId(null);
            }
        }, composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new r1(momentUserListVM, str, lazyListState, i));
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
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(PaddingKt.m480paddingVpY3zN4$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(44)), Dp.m3775constructorimpl(16), 0.0f, 2, null), false, false, 0L, false, null, null, null, new s1(context, topicInfoModel), 253);
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
        float f = 32;
        ImageKt.Image(o000OO.OooO0O0(topicInfoModel.getImage(), null, composerStartRestartGroup, 0, 1), (String) null, o00O0O0.OooO00o(6, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
        Modifier modifierOooO00o = OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O1 = OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1261Text4IGK_g(topicInfoModel.getName(), rowScopeInstance.weight(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false), o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3120, 120816);
        int positionid = topicInfoModel.getPositionid();
        if (positionid != 1) {
            numValueOf = positionid != 3 ? null : Integer.valueOf(o0Oo0oo.ic_topic_manager);
        } else {
            numValueOf = Integer.valueOf(o0Oo0oo.ic_topic_owner);
        }
        composerStartRestartGroup.startReplaceableGroup(-1208682425);
        if (numValueOf == null) {
            r2 = 0;
        } else {
            numValueOf.intValue();
            ImageKt.Image(PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            Unit unit = Unit.INSTANCE;
            r2 = 0;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1603802527);
        if (com.code.android.util.OooOo00.OooO0O0(Integer.valueOf(topicInfoModel.getJoinNum()))) {
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(o0OoOo0.OooO0O0(o0O0O0Oo.OooO0o(topicInfoModel.getJoinNum(), r2), ZegoConstants.ZegoVideoDataAuxPublishingStream, StringResources_androidKt.stringResource(o000000.topic_Followers, composerStartRestartGroup, r2)), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
        } else {
            composer2 = composerStartRestartGroup;
        }
        if (OooOo.OooO00o(composer2)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new t1(topicInfoModel, i));
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
        MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(o000000.moments, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -973286030, true, new v1(context, str)), null, composerStartRestartGroup, 12582912, 382);
        RefreshState refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        FragmentActivity fragmentActivity = objConsume instanceof FragmentActivity ? (FragmentActivity) objConsume : null;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            Intrinsics.checkNotNull(fragmentActivity);
            i2 = 2;
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new l(fragmentActivity, GiftPropTypeShow.InMomentList, baseMomentDetailVM, null, 24), null, 2, null);
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
        momentUserListVM.setScrollToTop(new x1(lazyListState, coroutineScope));
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new p521o0o0O0o0.o000OO(lazyListState), snapshotMutationPolicy, i2, snapshotMutationPolicy);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        ((p521o0o0O0o0.o000OO) mutableState2.getValue()).OooO0O0(momentUserListVM.getListData().size(), null, composerStartRestartGroup, ConstantsKt.MINIMUM_BLOCK_SIZE, 2);
        OooO0o.OooO0O0(refreshStateOooO0OO, new y1(momentUserListVM), null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1756822048, true, new i2(i, context, lazyListState, mutableState2, mutableState, fragmentActivity, momentUserListVM, str)), composerStartRestartGroup, 196616, 28);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new j2(momentUserListVM, str, lazyListState, i));
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
                ComposerKt.traceEventStart(-1688180153, i2, -1, "com.yalla.yalla.ui.screen.user.createMomentView (UserMomentListScreen.kt:149)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null && j == l.longValue()) {
                o0O0o000.f52369OooO00o.OooO00o(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomEnd()), 0.0f, 0.0f, Dp.m3775constructorimpl(6), Dp.m3775constructorimpl(78), 3, null), new m2(context), composerStartRestartGroup, 384, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new n2(boxScope, j, i));
    }
}
