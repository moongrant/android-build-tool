package p669oO0Oo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.o0000O;
import com.code.android.util.o0O0O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p148o00Oo0o.o00000O0;
import p150o00Oo0oO.o0000Ooo;
import p426o0OoOO.o000oOoO;
import p445o0OoOoo.o0oOO;
import p469o0OoooOO.o0oO0O0o;
import p475o0o000.o000000;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f60398OooO00o = ComposableLambdaKt.composableLambdaInstance(1102906690, false, OooO00o.f60400OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f60399OooO0O0 = ComposableLambdaKt.composableLambdaInstance(386632607, false, OooO0O0.f60401OooO0Oo);

    @SourceDebugExtension({"SMAP\nLiveRoomApplyMicListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,369:1\n154#2:370\n*S KotlinDebug\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-1$1\n*L\n192#1:370\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f60400OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            LazyItemScope item = lazyItemScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1102906690, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt.lambda-1.<anonymous> (LiveRoomApplyMicListDialog.kt:185)");
                }
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.apply_mic_list_empty_invite, composer2, 0), SizeKt.fillMaxWidth$default(PaddingKt.m476padding3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(16)), 0.0f, 1, null), o000OOo.OooO0OO(composer2).f37712OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomApplyMicListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n154#2:370\n154#2:371\n154#2:407\n154#2:408\n154#2:444\n154#2:445\n154#2:503\n154#2:504\n72#3,6:372\n78#3:406\n72#3,6:468\n78#3:502\n82#3:509\n82#3:514\n78#4,11:378\n78#4,11:415\n91#4:449\n78#4,11:474\n91#4:508\n91#4:513\n456#5,8:389\n464#5,3:403\n456#5,8:426\n464#5,3:440\n467#5,3:446\n36#5:451\n67#5,3:458\n66#5:461\n456#5,8:485\n464#5,3:499\n467#5,3:505\n467#5,3:510\n4144#6,6:397\n4144#6,6:434\n4144#6,6:493\n66#7,6:409\n72#7:443\n76#7:450\n1097#8,6:452\n1097#8,6:462\n81#9:515\n*S KotlinDebug\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1\n*L\n83#1:370\n84#1:371\n90#1:407\n91#1:408\n106#1:444\n107#1:445\n353#1:503\n355#1:504\n80#1:372,6\n80#1:406\n125#1:468,6\n125#1:502\n125#1:509\n80#1:514\n80#1:378,11\n87#1:415,11\n87#1:449\n125#1:474,11\n125#1:508\n80#1:513\n80#1:389,8\n80#1:403,3\n87#1:426,8\n87#1:440,3\n87#1:446,3\n115#1:451\n118#1:458,3\n118#1:461\n125#1:485,8\n125#1:499,3\n125#1:505,3\n80#1:510,3\n80#1:397,6\n87#1:434,6\n125#1:493,6\n87#1:409,6\n87#1:443\n87#1:450\n115#1:452,6\n118#1:462,6\n114#1:515\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f60401OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        /* JADX WARN: Code duplicated, block: B:73:0x02eb  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            String strOooO00o;
            boolean z;
            boolean z2;
            boolean z3;
            ContentState contentState;
            Composer composer2;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer3.getSkipping()) {
                composer3.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(386632607, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt.lambda-2.<anonymous> (LiveRoomApplyMicListDialog.kt:75)");
                }
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooOOO(null), composer3, 70);
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 24;
                Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(490)), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 12, null)), o0oO0O0o.f46946OooO0O0, null, 2, null);
                composer3.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = OooO0o.OooO00o(companion2, top, composer3, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierOooO00o = o0oOO.OooO00o(16, SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(48)), 0.0f, 2, null, composer3, 733328855);
                MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion2, false, composer3, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer3);
                Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO;
                if (o000000Var.OooO0oO() <= 0) {
                    composer3.startReplaceableGroup(1736188806);
                    strOooO00o = StringResources_androidKt.stringResource(oO00OOo0.Application_List, composer3, 0);
                    composer3.endReplaceableGroup();
                } else {
                    composer3.startReplaceableGroup(1736188933);
                    strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Application_List_xxx, composer3, 0), String.valueOf(o000000Var.OooO0oO()));
                    composer3.endReplaceableGroup();
                }
                TextKt.m1251Text4IGK_g(strOooO00o, boxScopeInstance.align(companion, companion2.getCenterStart()), o000OOo.OooO0OO(composer3).f37701OooO, TextUnitKt.getSp(17), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199680, 0, 131024);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_doubt, composer3, 0), (String) null, o0O0O00.OooO0O0(boxScopeInstance.align(SizeKt.m523size3ABfNKs(PaddingKt.m476padding3ABfNKs(companion, Dp.m3765constructorimpl(2)), Dp.m3765constructorimpl(17)), companion2.getCenterEnd()), false, false, 0L, false, null, null, null, OooOOOO.f60402OooO0Oo, 253), o000OOo.OooO0OO(composer3).f37712OooOO0o, composer3, 56, 0);
                o000oOoO.OooO00o(composer3);
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o, composer3, 8);
                Integer num2 = (Integer) stateObserveAsState.getValue();
                composer3.startReplaceableGroup(1157296644);
                boolean zChanged = composer3.changed(num2);
                Object objRememberedValue = composer3.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Integer num3 = (Integer) stateObserveAsState.getValue();
                    if (num3 == null) {
                        z2 = true;
                    } else {
                        z = true;
                        if (num3.intValue() != 1) {
                            z2 = true;
                        } else {
                            z3 = z;
                        }
                        objRememberedValue = Boolean.valueOf(z);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    Integer num4 = (Integer) stateObserveAsState.getValue();
                    if (num4 != null && num4.intValue() == 2) {
                        z = z2;
                        z3 = z;
                    } else {
                        z3 = z2;
                        z = false;
                    }
                    objRememberedValue = Boolean.valueOf(z);
                    composer3.updateRememberedValue(objRememberedValue);
                } else {
                    z3 = true;
                }
                boolean z4 = z3;
                composer3.endReplaceableGroup();
                boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
                Integer numValueOf = Integer.valueOf(o000000Var.OooO0oO());
                SnapshotStateList<Long> snapshotStateList = o000000Var.f47386OooOOo;
                Boolean boolValueOf = Boolean.valueOf((snapshotStateList.isEmpty() ? 1 : 0) ^ (z4 ? 1 : 0));
                Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                composer3.startReplaceableGroup(1618982084);
                boolean zChanged2 = composer3.changed(numValueOf) | composer3.changed(boolValueOf) | composer3.changed(boolValueOf2);
                Object objRememberedValue2 = composer3.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    int iOooO0oO = o000000Var.OooO0oO();
                    if (iOooO0oO == -1) {
                        contentState = ContentState.Loading;
                    } else if (iOooO0oO != 0) {
                        contentState = ContentState.Content;
                    } else if (zBooleanValue) {
                        if (((snapshotStateList.isEmpty() ? 1 : 0) ^ (z4 ? 1 : 0)) != 0) {
                            contentState = ContentState.Content;
                        } else {
                            contentState = ContentState.Empty;
                        }
                    } else {
                        contentState = ContentState.Empty;
                    }
                    objRememberedValue2 = contentState;
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                composer3.endReplaceableGroup();
                ContentState contentState2 = (ContentState) objRememberedValue2;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, z4 ? 1 : 0, null);
                composer3.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o3 = OooO0o.OooO00o(companion2, arrangement.getTop(), composer3, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                Function2 function2OooO00o3 = OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
                if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
                o0000Ooo.OooO0o0(contentState2, false, androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), null, ComposableLambdaKt.composableLambda(composer3, -1406658768, z4, new OooOo00(zBooleanValue)), null, null, ComposableLambdaKt.composableLambda(composer3, 1472316301, z4, new oo0o0Oo(zBooleanValue)), composer3, 12607488, 106);
                composer3.startReplaceableGroup(823301600);
                if (zBooleanValue) {
                    composer2 = composer3;
                } else {
                    composer2 = composer3;
                    o00000O0.OooO00o(StringResources_androidKt.stringResource(o000000Var.OooOO0O() ? oO00OOo0.Cancel_Application : oO00OOo0.Apply_for_Mic, composer3, 0), 0L, null, o000000Var.OooOO0O() ? TextButtonStyle.GreyOutLined : TextButtonStyle.Green, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m477paddingVpY3zN4(companion, Dp.m3765constructorimpl(32), Dp.m3765constructorimpl(12)), 0.0f, z4 ? 1 : 0, null), Dp.m3765constructorimpl(44)), o0O0O00.f60671OooO0Oo, composer2, 0, 905969664, 262134);
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
