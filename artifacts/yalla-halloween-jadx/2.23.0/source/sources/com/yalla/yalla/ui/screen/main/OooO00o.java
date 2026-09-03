package com.yalla.yalla.ui.screen.main;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import com.yalla.yalla.model.VipExperienceDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p147o00Oo0Oo.o000OOo;
import p426o0OoOO.o000oOoO;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVipExperienceScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipExperienceScreen.kt\ncom/yalla/yalla/ui/screen/main/VipExperienceScreen$ExperienceHistoryList$1$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,177:1\n65#2,7:178\n72#2:213\n76#2:305\n78#3,11:185\n78#3,11:221\n78#3,11:258\n91#3:291\n91#3:297\n91#3:304\n456#4,8:196\n464#4,3:210\n456#4,8:232\n464#4,3:246\n456#4,8:269\n464#4,3:283\n467#4,3:288\n467#4,3:294\n467#4,3:301\n4144#5,6:204\n4144#5,6:240\n4144#5,6:277\n154#6:214\n154#6:250\n154#6:287\n154#6:293\n154#6:299\n164#6:300\n73#7,6:215\n79#7:249\n83#7:298\n71#8,7:251\n78#8:286\n82#8:292\n*S KotlinDebug\n*F\n+ 1 VipExperienceScreen.kt\ncom/yalla/yalla/ui/screen/main/VipExperienceScreen$ExperienceHistoryList$1$1$1$1\n*L\n108#1:178,7\n108#1:213\n108#1:305\n108#1:185,11\n109#1:221,11\n116#1:258,11\n116#1:291\n109#1:297\n108#1:304\n108#1:196,8\n108#1:210,3\n109#1:232,8\n109#1:246,3\n116#1:269,8\n116#1:283,3\n116#1:288,3\n109#1:294,3\n108#1:301,3\n108#1:204,6\n109#1:240,6\n116#1:277,6\n112#1:214\n115#1:250\n140#1:287\n152#1:293\n156#1:299\n157#1:300\n109#1:215,6\n109#1:249\n109#1:298\n116#1:251,7\n116#1:286\n116#1:292\n*E\n"})
public final class OooO00o extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<VipExperienceDetailModel> f29172OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(o000O0.OooO0O0<VipExperienceDetailModel> oooO0O0) {
        super(4);
        this.f29172OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        String strStringResource;
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632465157, iIntValue2, -1, "com.yalla.yalla.ui.screen.main.VipExperienceScreen.ExperienceHistoryList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VipExperienceScreen.kt:105)");
            }
            VipExperienceDetailModel vipExperienceDetailModelOooO00o = this.f29172OooO0Oo.OooO00o(iIntValue);
            if (vipExperienceDetailModelOooO00o != null) {
                composer2.startReplaceableGroup(733328855);
                Modifier.Companion companion = Modifier.INSTANCE;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(70));
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composer2, 48, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
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
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f = 16;
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composer2, 6);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
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
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
                if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int experienceType = vipExperienceDetailModelOooO00o.getExperienceType();
                if (experienceType == VipExperienceScreen.ExperienceType.RechargeCoin.getValue()) {
                    composer2.startReplaceableGroup(1498614011);
                    strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_experience_recharge_coin, composer2, 0);
                    composer2.endReplaceableGroup();
                } else if (experienceType == VipExperienceScreen.ExperienceType.BuyMembership.getValue()) {
                    composer2.startReplaceableGroup(1498614204);
                    strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_experience_buy_membership, composer2, 0);
                    composer2.endReplaceableGroup();
                } else if (experienceType == VipExperienceScreen.ExperienceType.BuyRoomLock.getValue()) {
                    composer2.startReplaceableGroup(1498614396);
                    strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_experience_buy_room_lock, composer2, 0);
                    composer2.endReplaceableGroup();
                } else if (experienceType == VipExperienceScreen.ExperienceType.CoinReimburse.getValue()) {
                    composer2.startReplaceableGroup(1498614589);
                    strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_experience_coin_reimburse, composer2, 0);
                    composer2.endReplaceableGroup();
                } else if (experienceType == VipExperienceScreen.ExperienceType.AristocracyReimburse.getValue()) {
                    composer2.startReplaceableGroup(1498614790);
                    strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_experience_aristocracy_reimburse, composer2, 0);
                    composer2.endReplaceableGroup();
                } else if (experienceType == VipExperienceScreen.ExperienceType.RoomLockReimburse.getValue()) {
                    composer2.startReplaceableGroup(1498614995);
                    strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_experience_room_lock_reimbures, composer2, 0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1498615116);
                    strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_experience_recharge_coin, composer2, 0);
                    composer2.endReplaceableGroup();
                }
                TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(6)), composer2, 6);
                TextKt.m1251Text4IGK_g(o0000oo.OooO0Oo(vipExperienceDetailModelOooO00o.getTradeTimeStamp(), System.currentTimeMillis()), (Modifier) null, o000OOo.OooO0OO(composer2).f37712OooOO0o, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                o000oOoO.OooO00o(composer2);
                SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 0);
                TextKt.m1251Text4IGK_g(vipExperienceDetailModelOooO00o.getExperienceValue() > 0 ? android.support.v4.media.OooO00o.OooO00o("+", vipExperienceDetailModelOooO00o.getExperienceValue()) : String.valueOf(vipExperienceDetailModelOooO00o.getExperienceValue()), (Modifier) null, vipExperienceDetailModelOooO00o.getExperienceValue() > 0 ? o0oO0O0o.f47022o0000O0O : o0oO0O0o.f47054o000OO, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composer2, 6);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(boxScopeInstance.align(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f), 0.0f, 2, null), Dp.m3765constructorimpl((float) 0.5d)), 0.0f, 1, null), o000OOo.OooO0OO(composer2).f37704OooO0OO, null, 2, null), companion2.getBottomCenter()), composer2, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
