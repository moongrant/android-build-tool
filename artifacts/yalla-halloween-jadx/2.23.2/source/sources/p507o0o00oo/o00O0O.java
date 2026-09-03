package p507o0o00oo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.model.RankModel2;
import com.yalla.yalla.model.TopRankHeaderModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oO0OO.OooO00o;
import org.conscrypt.PSKKeyManager;
import p200o00o0OoO.o00OO00O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRecommendTopRankAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendTopRankAdapter.kt\ncom/yalla/yalla/ui/adapter/room/RecommendTopRankAdapterKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,102:1\n154#2:103\n154#2:104\n154#2:140\n154#2:141\n154#2:142\n154#2:143\n154#2:149\n154#2:150\n154#2:186\n154#2:187\n154#2:188\n154#2:189\n66#3,6:105\n72#3:139\n76#3:148\n66#3,6:151\n72#3:185\n76#3:194\n78#4,11:111\n91#4:147\n78#4,11:157\n91#4:193\n456#5,8:122\n464#5,3:136\n467#5,3:144\n456#5,8:168\n464#5,3:182\n467#5,3:190\n4144#6,6:130\n4144#6,6:176\n*S KotlinDebug\n*F\n+ 1 RecommendTopRankAdapter.kt\ncom/yalla/yalla/ui/adapter/room/RecommendTopRankAdapterKt\n*L\n53#1:103\n55#1:104\n62#1:140\n63#1:141\n71#1:142\n72#1:143\n81#1:149\n82#1:150\n89#1:186\n90#1:187\n98#1:188\n99#1:189\n51#1:105,6\n51#1:139\n51#1:148\n79#1:151,6\n79#1:185\n79#1:194\n51#1:111,11\n51#1:147\n79#1:157,11\n79#1:193\n51#1:122,8\n51#1:136,3\n51#1:144,3\n79#1:168,8\n79#1:182,3\n79#1:190,3\n51#1:130,6\n79#1:176,6\n*E\n"})
public final class o00O0O {
    public static final void OooO00o(BoxScope boxScope, TopRankHeaderModel topRankHeaderModel, int i, Composer composer, int i2) {
        List<RankModel2> position;
        RankModel2 rankModel2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1073789488);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1073789488, i2, -1, "com.yalla.yalla.ui.adapter.room.RankFirst (RecommendTopRankAdapter.kt:77)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 113;
        Modifier modifierClipToBounds = ClipKt.clipToBounds(SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(98)), Dp.m3775constructorimpl(f)));
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierAlign = boxScope.align(modifierClipToBounds, companion2.getCenter());
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
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
        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        OooO00o.f59939OooO00o.OooOO0((topRankHeaderModel == null || (position = topRankHeaderModel.getPosition(i)) == null || (rankModel2 = (RankModel2) CollectionsKt.getOrNull(position, 0)) == null) ? null : rankModel2.imageurl, BoxScopeInstance.INSTANCE.align(SizeKt.m525size3ABfNKs(OffsetKt.m439offsetVpY3zN4$default(companion, 0.0f, Dp.m3775constructorimpl(19), 1, null), Dp.m3775constructorimpl(42)), companion2.getTopCenter()), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
        o00OO00O.OooO00o("svga/main_room_recommend_rank_top1.svga", true, 0, null, null, SizeKt.m514requiredHeight3ABfNKs(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(400)), composerStartRestartGroup, 196662, 28);
        if (OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(boxScope, topRankHeaderModel, i, i2));
    }

    public static final void OooO0O0(BoxScope boxScope, boolean z, String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(545092211);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(545092211, i2, -1, "com.yalla.yalla.ui.adapter.room.RankSecondAndThird (RecommendTopRankAdapter.kt:49)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 88;
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SizeKt.m530width3ABfNKs(SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(z ? 21 : 0), 0.0f, Dp.m3775constructorimpl(z ? 0 : 21), 0.0f, 10, null), 0.0f, 1, null), Dp.m3775constructorimpl(f)));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierClipToBounds, z ? companion2.getBottomStart() : companion2.getBottomEnd());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            OooO00o.f59939OooO00o.OooOO0(str, BoxScopeInstance.INSTANCE.align(SizeKt.m525size3ABfNKs(OffsetKt.m439offsetVpY3zN4$default(companion, 0.0f, Dp.m3775constructorimpl(z ? 29 : 33), 1, null), Dp.m3775constructorimpl(42)), companion2.getTopCenter()), 0.0f, null, false, composerStartRestartGroup, ((i2 >> 6) & 14) | 262144, 28);
            String str2 = z ? "svga/main_room_recommend_rank_top2.svga" : "svga/main_room_recommend_rank_top3.svga";
            Modifier modifierM514requiredHeight3ABfNKs = SizeKt.m514requiredHeight3ABfNKs(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(298));
            String str3 = str2;
            composer2 = composerStartRestartGroup;
            o00OO00O.OooO00o(str3, true, 0, null, null, modifierM514requiredHeight3ABfNKs, composer2, 196656, 28);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(boxScope, z, str, i));
    }
}
