package p540o0o0OoO0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
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
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O0OO0;
import p196o00o0OOO.oOO00O;
import p454o0Ooo000.OooOo00;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54689OooO00o = ComposableLambdaKt.composableLambdaInstance(1102906690, false, OooO00o.f54691OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54690OooO0O0 = ComposableLambdaKt.composableLambdaInstance(386632607, false, OooO0O0.f54692OooO0Oo);

    @SourceDebugExtension({"SMAP\nLiveRoomApplyMicListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,374:1\n154#2:375\n*S KotlinDebug\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-1$1\n*L\n193#1:375\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54691OooO0Oo = new OooO00o();

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
                    ComposerKt.traceEventStart(1102906690, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt.lambda-1.<anonymous> (LiveRoomApplyMicListDialog.kt:187)");
                }
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.apply_mic_list_empty_invite, composer2, 0), SizeKt.fillMaxWidth$default(PaddingKt.m478padding3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(16)), 0.0f, 1, null), o0000oo.OooO0OO(composer2).f38627OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomApplyMicListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,374:1\n154#2:375\n154#2:376\n154#2:412\n154#2:413\n154#2:449\n154#2:450\n154#2:508\n154#2:509\n72#3,6:377\n78#3:411\n72#3,6:473\n78#3:507\n82#3:514\n82#3:519\n78#4,11:383\n78#4,11:420\n91#4:454\n78#4,11:479\n91#4:513\n91#4:518\n456#5,8:394\n464#5,3:408\n456#5,8:431\n464#5,3:445\n467#5,3:451\n36#5:456\n67#5,3:463\n66#5:466\n456#5,8:490\n464#5,3:504\n467#5,3:510\n467#5,3:515\n4144#6,6:402\n4144#6,6:439\n4144#6,6:498\n66#7,6:414\n72#7:448\n76#7:455\n1097#8,6:457\n1097#8,6:467\n81#9:520\n*S KotlinDebug\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1\n*L\n84#1:375\n85#1:376\n91#1:412\n92#1:413\n107#1:449\n108#1:450\n358#1:508\n360#1:509\n81#1:377,6\n81#1:411\n126#1:473,6\n126#1:507\n126#1:514\n81#1:519\n81#1:383,11\n88#1:420,11\n88#1:454\n126#1:479,11\n126#1:513\n81#1:518\n81#1:394,8\n81#1:408,3\n88#1:431,8\n88#1:445,3\n88#1:451,3\n116#1:456\n119#1:463,3\n119#1:466\n126#1:490,8\n126#1:504,3\n126#1:510,3\n81#1:515,3\n81#1:402,6\n88#1:439,6\n126#1:498,6\n88#1:414,6\n88#1:448\n88#1:455\n116#1:457,6\n119#1:467,6\n115#1:520\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f54692OooO0Oo = new OooO0O0();

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
                    ComposerKt.traceEventStart(386632607, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt.lambda-2.<anonymous> (LiveRoomApplyMicListDialog.kt:77)");
                }
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new o00O00o0(null), composer3, 70);
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 24;
                Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(490)), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 12, null)), o0OOo000.f48135OooO0O0, null, 2, null);
                composer3.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composer3, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
                Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierOooO00o = OooOo00.OooO00o(16, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(48)), 0.0f, 2, null, composer3, 733328855);
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer3, 0, -1323940314);
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
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer3);
                Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                p483o0o000Oo.o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
                if (o0000ooVar.OooO0oO() <= 0) {
                    composer3.startReplaceableGroup(1736188853);
                    strOooO00o = StringResources_androidKt.stringResource(o000000.Application_List, composer3, 0);
                    composer3.endReplaceableGroup();
                } else {
                    composer3.startReplaceableGroup(1736188980);
                    strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.Application_List_xxx, composer3, 0), String.valueOf(o0000ooVar.OooO0oO()));
                    composer3.endReplaceableGroup();
                }
                TextKt.m1261Text4IGK_g(strOooO00o, boxScopeInstance.align(companion, companion2.getCenterStart()), o0000oo.OooO0OO(composer3).f38616OooO, TextUnitKt.getSp(17), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199680, 0, 131024);
                IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.icv_doubt, composer3, 0), (String) null, o0O0O00.OooO0O0(boxScopeInstance.align(SizeKt.m525size3ABfNKs(PaddingKt.m478padding3ABfNKs(companion, Dp.m3775constructorimpl(2)), Dp.m3775constructorimpl(17)), companion2.getCenterEnd()), false, false, 0L, false, null, null, null, oo00o.f55040OooO0Oo, 253), o0000oo.OooO0OO(composer3).f38627OooOO0o, composer3, 56, 0);
                o0ooOOo.OooO00o(composer3);
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o, composer3, 8);
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
                Integer numValueOf = Integer.valueOf(o0000ooVar.OooO0oO());
                SnapshotStateList<Long> snapshotStateList = o0000ooVar.f48591OooOOo;
                Boolean boolValueOf = Boolean.valueOf((snapshotStateList.isEmpty() ? 1 : 0) ^ (z4 ? 1 : 0));
                Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                composer3.startReplaceableGroup(1618982084);
                boolean zChanged2 = composer3.changed(numValueOf) | composer3.changed(boolValueOf) | composer3.changed(boolValueOf2);
                Object objRememberedValue2 = composer3.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    int iOooO0oO = o0000ooVar.OooO0oO();
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
                MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composer3, 0, -1323940314);
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
                Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer3);
                Function2 function2OooO00o3 = OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O1, composerM1320constructorimpl3, currentCompositionLocalMap3);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                oOO00O.OooO0o0(contentState2, false, androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), null, ComposableLambdaKt.composableLambda(composer3, -1406658768, z4, new o00O0(zBooleanValue)), null, null, ComposableLambdaKt.composableLambda(composer3, 1472316301, z4, new o00OOO00(zBooleanValue)), composer3, 12607488, 106);
                composer3.startReplaceableGroup(823301852);
                if (zBooleanValue) {
                    composer2 = composer3;
                } else {
                    composer2 = composer3;
                    o00O0OO0.OooO00o(StringResources_androidKt.stringResource(o0000ooVar.OooOO0O() ? o000000.Cancel_Application : o000000.Apply_for_Mic, composer3, 0), 0L, null, o0000ooVar.OooOO0O() ? TextButtonStyle.GreyOutLined : TextButtonStyle.Green, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m479paddingVpY3zN4(companion, Dp.m3775constructorimpl(32), Dp.m3775constructorimpl(12)), 0.0f, z4 ? 1 : 0, null), Dp.m3775constructorimpl(44)), o00OOO0.f54715OooO0Oo, composer2, 0, 905969664, 262134);
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
