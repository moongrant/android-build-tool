package p537o0o0OoO;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.OooOOO0;
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
import com.facebook.OooOo00;
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
import p018OooOoo0.OooOOO;
import p417o0OoO0.o00Oo0;
import p426o0OoOO.o000oOoO;
import p469o0OoooOO.o0oO0O0o;
import p539o0o0OoOO.b0;
import p539o0o0OoOO.b1;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVipPrivilegeCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt$VipPrivilegeGrid$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,551:1\n154#2:552\n154#2:553\n154#2:589\n154#2:625\n154#2:631\n72#3,6:554\n78#3:588\n82#3:636\n78#4,11:560\n78#4,11:596\n91#4:629\n91#4:635\n456#5,8:571\n464#5,3:585\n456#5,8:607\n464#5,3:621\n467#5,3:626\n467#5,3:632\n4144#6,6:579\n4144#6,6:615\n66#7,6:590\n72#7:624\n76#7:630\n*S KotlinDebug\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt$VipPrivilegeGrid$1$1\n*L\n491#1:552\n496#1:553\n497#1:589\n501#1:625\n504#1:631\n487#1:554,6\n487#1:588\n487#1:636\n487#1:560,11\n497#1:596,11\n497#1:629\n487#1:635\n487#1:571,8\n487#1:585,3\n497#1:607,8\n497#1:621,3\n497#1:626,3\n487#1:632,3\n487#1:579,6\n497#1:615,6\n497#1:590,6\n497#1:624\n497#1:630\n*E\n"})
public final class o0O0O0o0 extends Lambda implements Function4<Integer, ItemVipModel, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<ItemVipModel, Unit> f55362OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O0O0o0(Function1<? super ItemVipModel, Unit> function1) {
        super(4);
        this.f55362OooO0Oo = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(Integer num, ItemVipModel itemVipModel, Composer composer, Integer num2) {
        num.intValue();
        ItemVipModel item = itemVipModel;
        Composer composer2 = composer;
        int iIntValue = num2.intValue();
        Intrinsics.checkNotNullParameter(item, "item");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1524449277, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipPrivilegeGrid.<anonymous>.<anonymous> (VipPrivilegeCard.kt:485)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier modifierM202clickableXHw0xAI$default = item.getIsHighlight() ? ClickableKt.m202clickableXHw0xAI$default(SizeKt.m509height3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(82)), false, null, null, new o0O0oo0o(this.f55362OooO0Oo, item), 7, null) : SizeKt.m509height3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(82));
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM202clickableXHw0xAI$default);
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
            Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f = 36;
            Modifier modifierOooO00o = OooOo00.OooO00o(f, companion3, composer2, 733328855);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion, false, composer2, 0, -1323940314);
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
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o2 = OooO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(o00Oo0.OooO0OO(item.getImgUrl(), o0O0O0Oo.f55361OooO0Oo, composer2, 48, 0), (String) null, SizeKt.m523size3ABfNKs(companion3, Dp.m3765constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
            o000oOoO.OooO00o(composer2);
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion3, Dp.m3765constructorimpl(4)), composer2, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            b0.OooO00o(item.getPrivilegeName(), new b1(TextUnitKt.getSp(10), TextUnitKt.getSp(12)), modifierFillMaxWidth$default, item.getIsHighlight() ? o0oO0O0o.f47011o000000o : o0oO0O0o.f47013o00000O0, null, null, null, TextUnitKt.m3958TextUnitanM5pPY(0.0f, TextUnitType.INSTANCE.m3979getSpUIouoOA()), null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, null, composer2, 384, 0, 32112);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
