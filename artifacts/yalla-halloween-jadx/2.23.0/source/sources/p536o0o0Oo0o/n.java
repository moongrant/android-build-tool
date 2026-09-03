package p536o0o0Oo0o;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooO0o;
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
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.vm.user.UserOutFitVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O0.OooO0O0;
import p469o0OoooOO.o0oO0O0o;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVehiclesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$3$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,360:1\n154#2:361\n154#2:362\n72#3,6:363\n78#3:397\n82#3:402\n78#4,11:369\n91#4:401\n456#5,8:380\n464#5,3:394\n467#5,3:398\n4144#6,6:388\n*S KotlinDebug\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$3$1$1\n*L\n173#1:361\n174#1:362\n170#1:363,6\n170#1:397\n170#1:402\n170#1:369,11\n170#1:401\n170#1:380,8\n170#1:394,3\n170#1:398,3\n170#1:388,6\n*E\n"})
public final class n extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<ShopVehicleListModel> f54959OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f54960OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserOutFitVM f54961OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54962OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(OooO0O0<ShopVehicleListModel> oooO0O0, UserOutFitVM userOutFitVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(4);
        this.f54959OooO0Oo = oooO0O0;
        this.f54961OooO0o0 = userOutFitVM;
        this.f54960OooO0o = o0o0ooo0;
        this.f54962OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        LazyGridItemScope items = lazyGridItemScope;
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
                ComposerKt.traceEventStart(1090486530, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.MyVehiclesContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehiclesScreen.kt:167)");
            }
            ShopVehicleListModel shopVehicleListModelOooO00o = this.f54959OooO0Oo.OooO00o(iIntValue);
            if (shopVehicleListModelOooO00o != null) {
                Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(PaddingKt.m476padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(4)), o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(6)));
                UserOutFitVM userOutFitVM = this.f54961OooO0o0;
                o0O0OOO0 o0o0ooo0 = this.f54960OooO0o;
                LifecycleOwner lifecycleOwner = this.f54962OooO0oO;
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o = OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU);
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
                Function2 function2OooO00o = OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                j.OooO0Oo(shopVehicleListModelOooO00o, new m(userOutFitVM, shopVehicleListModelOooO00o), composer2, 8);
                j.OooO0OO(shopVehicleListModelOooO00o, userOutFitVM, o0o0ooo0, lifecycleOwner, composer2, 4680);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
