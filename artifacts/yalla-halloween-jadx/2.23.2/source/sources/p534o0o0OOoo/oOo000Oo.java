package p534o0o0OOoo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.OooO0OO;
import androidx.compose.material.OooO0o;
import androidx.compose.material.OooOO0O;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import oO0OO.OooO00o;
import org.jctools.util.Pow2;
import p022Oooo00O.o0O00oO0;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.o00O0O;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O000o;
import p194o00o0OO.o00O0OO0;
import p194o00o0OO.oo00o;
import p207o00o0oO0.o000O00O;
import p207o00o0oO0.o000O0Oo;
import p516o0o0O00o.o0O0oo0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFriendRequestMessageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendRequestMessageScreen.kt\ncom/yalla/yalla/ui/screen/message/FriendRequestMessageScreenKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,266:1\n72#2,6:267\n78#2:301\n82#2:345\n72#2,6:346\n78#2:380\n72#2,6:421\n78#2:455\n82#2:558\n82#2:570\n78#3,11:273\n91#3:344\n78#3,11:352\n78#3,11:388\n78#3,11:427\n78#3,11:463\n91#3:503\n78#3,11:514\n91#3:551\n91#3:557\n91#3:563\n91#3:569\n456#4,8:284\n464#4,3:298\n25#4:313\n25#4:320\n25#4:327\n36#4:334\n467#4,3:341\n456#4,8:363\n464#4,3:377\n456#4,8:399\n464#4,3:413\n456#4,8:438\n464#4,3:452\n456#4,8:474\n464#4,3:488\n467#4,3:500\n456#4,8:525\n464#4,3:539\n467#4,3:548\n467#4,3:554\n467#4,3:560\n467#4,3:566\n4144#5,6:292\n4144#5,6:371\n4144#5,6:407\n4144#5,6:446\n4144#5,6:482\n4144#5,6:533\n81#6,11:302\n1097#7,6:314\n1097#7,6:321\n1097#7,6:328\n1097#7,6:335\n154#8:381\n154#8:417\n154#8:418\n154#8:419\n154#8:420\n154#8:492\n154#8:493\n154#8:494\n154#8:495\n154#8:496\n154#8:497\n154#8:498\n154#8:499\n154#8:505\n154#8:506\n154#8:543\n154#8:544\n154#8:545\n154#8:546\n154#8:547\n154#8:553\n154#8:559\n154#8:565\n73#9,6:382\n79#9:416\n72#9,7:456\n79#9:491\n83#9:504\n72#9,7:507\n79#9:542\n83#9:552\n83#9:564\n81#10:571\n107#10,2:572\n81#10:574\n*S KotlinDebug\n*F\n+ 1 FriendRequestMessageScreen.kt\ncom/yalla/yalla/ui/screen/message/FriendRequestMessageScreenKt\n*L\n82#1:267,6\n82#1:301\n82#1:345\n168#1:346,6\n168#1:380\n183#1:421,6\n183#1:455\n183#1:558\n168#1:570\n82#1:273,11\n82#1:344\n168#1:352,11\n173#1:388,11\n183#1:427,11\n188#1:463,11\n188#1:503\n221#1:514,11\n221#1:551\n183#1:557\n173#1:563\n168#1:569\n82#1:284,8\n82#1:298,3\n84#1:313\n111#1:320\n112#1:327\n117#1:334\n82#1:341,3\n168#1:363,8\n168#1:377,3\n173#1:399,8\n173#1:413,3\n183#1:438,8\n183#1:452,3\n188#1:474,8\n188#1:488,3\n188#1:500,3\n221#1:525,8\n221#1:539,3\n221#1:548,3\n183#1:554,3\n173#1:560,3\n168#1:566,3\n82#1:292,6\n168#1:371,6\n173#1:407,6\n183#1:446,6\n188#1:482,6\n221#1:533,6\n83#1:302,11\n84#1:314,6\n111#1:321,6\n112#1:328,6\n117#1:335,6\n173#1:381\n178#1:417\n179#1:418\n182#1:419\n186#1:420\n190#1:492\n194#1:493\n195#1:494\n196#1:495\n200#1:496\n201#1:497\n206#1:498\n207#1:499\n210#1:505\n220#1:506\n229#1:543\n230#1:544\n232#1:545\n240#1:546\n241#1:547\n245#1:553\n248#1:559\n264#1:565\n173#1:382,6\n173#1:416\n188#1:456,7\n188#1:491\n188#1:504\n221#1:507,7\n221#1:542\n221#1:552\n173#1:564\n112#1:571\n112#1:572,2\n174#1:574\n*E\n"})
public final class oOo000Oo {
    public static final void OooO00o(Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1043092019);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1043092019, i, -1, "com.yalla.yalla.ui.screen.message.FriendRequestMessageScreenContent (FriendRequestMessageScreen.kt:80)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Function2 function2OooO00o = OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(FriendRequestMessageVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            FriendRequestMessageVM friendRequestMessageVM = (FriendRequestMessageVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            o000O0Oo.OooO0Oo(mutableState, null, StringResources_androidKt.stringResource(o000000.message_clear_friend_request, composerStartRestartGroup, 0), null, false, false, null, null, null, false, null, false, new oO00O0o0(friendRequestMessageVM), null, false, false, null, oO00O0o.f53582OooO0Oo, null, null, composerStartRestartGroup, 6, 12582912, 913402);
            OooOOOO oooOOOOOooO00o = o00O0O.OooO00o(friendRequestMessageVM.getMessagePagingSource1().f38511OooO0O0, composerStartRestartGroup);
            o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(o000000.Friend_Request, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1236659894, true, new oO00O0oO(oooOOOOOooO00o, mutableState)), null, composerStartRestartGroup, 12582912, 382);
            Unit unit = Unit.INSTANCE;
            EffectsKt.LaunchedEffect(unit, new oO00OO0O(friendRequestMessageVM, null), composerStartRestartGroup, 70);
            EffectsKt.DisposableEffect(unit, new oO00OOOo(friendRequestMessageVM), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                i2 = 2;
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i2 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, i2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue3;
            List listListOf = CollectionsKt.listOf(o0000.OooO0OO(MoreTag.delete.getText()));
            oO00OOo0 oo00ooo0 = new oO00OOo0(friendRequestMessageVM, mutableState3);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new oO00Oo00(mutableState3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o000O00O.OooO00o(mutableState2, null, listListOf, null, false, oo00ooo0, null, null, 0L, null, null, (Function0) objRememberedValue4, composerStartRestartGroup, 6, 0, 2010);
            oOo00o0o ooo00o0o = new oOo00o0o(oooOOOOOooO00o, mutableState2, mutableState3, friendRequestMessageVM);
            composer2 = composerStartRestartGroup;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 1318008123, true, ooo00o0o);
            int i3 = OooOOOO.f35803OooO0o0;
            oo00o.OooO00o(oooOOOOOooO00o, null, null, null, false, null, null, null, composableLambda, composer2, 100687880, 238);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOo00ooO(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0O0(FriendRequestMessage friendRequestMessage, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Composer composer, int i) {
        String strStringResource;
        String str;
        String wealthBadgeWithBg;
        String userName;
        Composer composerStartRestartGroup = composer.startRestartGroup(298435088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(298435088, i, -1, "com.yalla.yalla.ui.screen.message.MessageItem (FriendRequestMessageScreen.kt:166)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, false, 0L, false, null, null, function1, function0, 191);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composerStartRestartGroup, 0, -1323940314);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        float f = 16;
        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = OooOO0O.OooO00o(companion2, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
        long targetUserId = friendRequestMessage.getTargetUserId();
        userInfoRepo.getClass();
        MutableState mutableStateOooO0o0 = UserInfoRepo.OooO0o0(targetUserId, composerStartRestartGroup);
        OooO00o oooO00o = OooO00o.f59939OooO00o;
        UserInfo userInfo = (UserInfo) mutableStateOooO0o0.getValue();
        oooO00o.OooOO0(userInfo != null ? userInfo.getUserHeader() : null, ClipKt.clip(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(48)), RoundedCornerShapeKt.getCircleShape()), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
        float f2 = 12;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 13, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O1, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O2 = OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO0O2, composerM1320constructorimpl4, currentCompositionLocalMap4);
        if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        UserInfo userInfo2 = (UserInfo) mutableStateOooO0o0.getValue();
        oooO00o.OooOOOo((userInfo2 == null || (userName = userInfo2.getUserName()) == null) ? "" : userName, 0L, false, 0L, 0, 0, null, false, rowScopeInstance.weight(companion, 1.0f, false), composerStartRestartGroup, Pow2.MAX_POW2, 254);
        UserInfo userInfo3 = (UserInfo) mutableStateOooO0o0.getValue();
        float f3 = 4;
        oooO00o.OooOOO0(userInfo3 != null ? Integer.valueOf(userInfo3.getUserLevel()) : null, 0L, 0L, PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 35840, 6);
        UserInfo userInfo4 = (UserInfo) mutableStateOooO0o0.getValue();
        int wealthLevel = userInfo4 != null ? userInfo4.getWealthLevel() : 0;
        UserInfo userInfo5 = (UserInfo) mutableStateOooO0o0.getValue();
        oooO00o.OooOo(wealthLevel, (userInfo5 == null || (wealthBadgeWithBg = userInfo5.getWealthBadgeWithBg()) == null) ? "" : wealthBadgeWithBg, SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(33)), o0000O0.OooO0OO(8, composerStartRestartGroup, 6), composerStartRestartGroup, 33152, 0);
        UserInfo userInfo6 = (UserInfo) mutableStateOooO0o0.getValue();
        OooO00o.OooOo0(null, userInfo6 != null ? Integer.valueOf(userInfo6.getVipLevel()) : null, null, Dp.m3775constructorimpl(f), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 289792, 5);
        UserInfo userInfo7 = (UserInfo) mutableStateOooO0o0.getValue();
        Boolean boolValueOf = userInfo7 != null ? Boolean.valueOf(userInfo7.isPremium()) : null;
        UserInfo userInfo8 = (UserInfo) mutableStateOooO0o0.getValue();
        OooO00o.OooOOo(boolValueOf, userInfo8 != null ? Integer.valueOf(userInfo8.getPremiumLevel()) : null, false, Dp.m3775constructorimpl(f), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 289792, 4);
        o0ooOOo.OooO00o(composerStartRestartGroup);
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
        String message = friendRequestMessage.getMessage();
        TextKt.m1261Text4IGK_g(message == null ? "" : message, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 3120, 55282);
        composerStartRestartGroup.startReplaceableGroup(-1196209778);
        if (friendRequestMessage.getState() == 0 && System.currentTimeMillis() - friendRequestMessage.getTime() < 2592000000L) {
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(14), null, composerStartRestartGroup, 6, 2);
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O3 = OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl5 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o5 = OooO.OooO00o(companion3, composerM1320constructorimpl5, measurePolicyOooO0O3, composerM1320constructorimpl5, currentCompositionLocalMap5);
            if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            String strStringResource2 = StringResources_androidKt.stringResource(o000000.Decline, composerStartRestartGroup, 0);
            TextButtonStyle textButtonStyle = TextButtonStyle.GreenOutLined;
            long sp = TextUnitKt.getSp(13);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            float f4 = 28;
            float f5 = 90;
            o00O0OO0.OooO00o(strStringResource2, sp, companion4.getNormal(), textButtonStyle, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m532widthInVpY3zN4$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f4)), Dp.m3775constructorimpl(f5), 0.0f, 2, null), function3, composerStartRestartGroup, 3504, ((i << 15) & 1879048192) | 100663296, 262128);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            o00O0OO0.OooO00o(StringResources_androidKt.stringResource(o000000.Accept, composerStartRestartGroup, 0), TextUnitKt.getSp(13), companion4.getMedium(), TextButtonStyle.Green, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m532widthInVpY3zN4$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f4)), Dp.m3775constructorimpl(f5), 0.0f, 2, null), function2, composerStartRestartGroup, 3504, ((i << 18) & 1879048192) | 100663296, 262128);
            o0ooOOo.OooO00o(composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1505514660);
        if (friendRequestMessage.getState() != 0 || System.currentTimeMillis() - friendRequestMessage.getTime() > 2592000000L) {
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(43), null, composerStartRestartGroup, 6, 2);
            int state = friendRequestMessage.getState();
            if (state == -1) {
                composerStartRestartGroup.startReplaceableGroup(600077370);
                strStringResource = StringResources_androidKt.stringResource(o000000.add_you_as_friend, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (state == 0) {
                composerStartRestartGroup.startReplaceableGroup(600077475);
                strStringResource = StringResources_androidKt.stringResource(o000000.Expired, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (state == 1) {
                composerStartRestartGroup.startReplaceableGroup(600077087);
                strStringResource = StringResources_androidKt.stringResource(o000000.Accepted, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (state != 2) {
                if (state != 3) {
                    composerStartRestartGroup.startReplaceableGroup(1422534556);
                    composerStartRestartGroup.endReplaceableGroup();
                    str = "";
                } else {
                    composerStartRestartGroup.startReplaceableGroup(600077278);
                    strStringResource = StringResources_androidKt.stringResource(o000000.Expired, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                TextKt.m1261Text4IGK_g(str, rowScopeInstance.align(companion, companion2.getCenterVertically()), o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
            } else {
                composerStartRestartGroup.startReplaceableGroup(600077182);
                strStringResource = StringResources_androidKt.stringResource(o000000.Declined, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            str = strStringResource;
            TextKt.m1261Text4IGK_g(str, rowScopeInstance.align(companion, companion2.getCenterVertically()), o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
        }
        o00O000o.OooO00o(composerStartRestartGroup);
        DividerKt.m1074DivideroMI9zvI(null, o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, 0.0f, Dp.m3775constructorimpl(76), composerStartRestartGroup, 3072, 5);
        if (OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0OO00o(friendRequestMessage, function0, function1, function2, function3, i));
    }
}
