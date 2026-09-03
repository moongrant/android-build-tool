package p553o0oOOoOO;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.OooOO0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.session.o00O0;
import com.yalla.yalla.model.ItemVipModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import p423o0OoO0OO.o000OO;
import p476o0OooooO.o0OOo000;
import p587o0oOooOO.oo000000;
import p587o0oOooOO.w;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVipPrivilegeCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt$VipPrivilegeGrid$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,550:1\n154#2:551\n154#2:552\n154#2:588\n154#2:624\n154#2:630\n72#3,6:553\n78#3:587\n82#3:635\n78#4,11:559\n78#4,11:595\n91#4:628\n91#4:634\n456#5,8:570\n464#5,3:584\n456#5,8:606\n464#5,3:620\n467#5,3:625\n467#5,3:631\n4144#6,6:578\n4144#6,6:614\n66#7,6:589\n72#7:623\n76#7:629\n*S KotlinDebug\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt$VipPrivilegeGrid$1$1\n*L\n490#1:551\n495#1:552\n496#1:588\n500#1:624\n503#1:630\n486#1:553,6\n486#1:587\n486#1:635\n486#1:559,11\n496#1:595,11\n496#1:628\n486#1:634\n486#1:570,8\n486#1:584,3\n496#1:606,8\n496#1:620,3\n496#1:625,3\n486#1:631,3\n486#1:578,6\n496#1:614,6\n496#1:589,6\n496#1:623\n496#1:629\n*E\n"})
public final class oO0o0o extends Lambda implements Function4<Integer, ItemVipModel, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<ItemVipModel, Unit> f56141OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO0o0o(Function1<? super ItemVipModel, Unit> function1) {
        super(4);
        this.f56141OooO0Oo = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(Integer num, ItemVipModel itemVipModel, Composer composer, Integer num2) {
        num.intValue();
        ItemVipModel item = itemVipModel;
        Composer composer2 = composer;
        int iIntValue = num2.intValue();
        Intrinsics.checkNotNullParameter(item, "item");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1524449277, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipPrivilegeGrid.<anonymous>.<anonymous> (VipPrivilegeCard.kt:485)");
        }
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
        Modifier modifierM204clickableXHw0xAI$default = item.getIsHighlight() ? ClickableKt.m204clickableXHw0xAI$default(SizeKt.m511height3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(82)), false, null, null, new oO000O0O(this.f56141OooO0Oo, item), 7, null) : SizeKt.m511height3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(82));
        composer2.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM204clickableXHw0xAI$default);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier.Companion companion3 = Modifier.INSTANCE;
        float f = 36;
        Modifier modifierOooO00o = o00O0.OooO00o(f, companion3, composer2, 733328855);
        MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion, false, composer2, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor2);
        } else {
            composer2.useNode();
        }
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
        Function2 function2OooO00o2 = OooO.OooO00o(companion2, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageKt.Image(o000OO.OooO0OO(item.getImgUrl(), oO0Ooooo.f56140OooO0Oo, composer2, 48, 0), (String) null, SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
        o0ooOOo.OooO00o(composer2);
        SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion3, Dp.m3775constructorimpl(4)), composer2, 6);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
        oo000000.OooO00o(item.getPrivilegeName(), new w(TextUnitKt.getSp(10), TextUnitKt.getSp(12)), modifierFillMaxWidth$default, item.getIsHighlight() ? o0OOo000.f48201o00000O : o0OOo000.f48204o00000Oo, null, null, null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, TextUnitType.INSTANCE.m3989getSpUIouoOA()), null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, null, composer2, 384, 0, 32112);
        if (OooO0o.OooO00o(composer2)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
