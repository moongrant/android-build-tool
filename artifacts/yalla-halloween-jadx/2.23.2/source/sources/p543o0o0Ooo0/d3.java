package p543o0o0Ooo0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
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
import p022Oooo00O.o0O00oO0;
import p107o000ooO0.OooOOOO;
import p476o0OooooO.o0OOo000;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVehiclesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$4$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,361:1\n154#2:362\n154#2:363\n72#3,6:364\n78#3:398\n82#3:403\n78#4,11:370\n91#4:402\n456#5,8:381\n464#5,3:395\n467#5,3:399\n4144#6,6:389\n*S KotlinDebug\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$4$1$1\n*L\n174#1:362\n175#1:363\n171#1:364,6\n171#1:398\n171#1:403\n171#1:370,11\n171#1:402\n171#1:381,8\n171#1:395,3\n171#1:399,3\n171#1:389,6\n*E\n"})
public final class d3 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<ShopVehicleListModel> f55391OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f55392OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserOutFitVM f55393OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55394OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(OooOOOO<ShopVehicleListModel> oooOOOO, UserOutFitVM userOutFitVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
        super(4);
        this.f55391OooO0Oo = oooOOOO;
        this.f55393OooO0o0 = userOutFitVM;
        this.f55392OooO0o = o0ooo0o1;
        this.f55394OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        LazyGridItemScope items = lazyGridItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1090486530, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.MyVehiclesContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehiclesScreen.kt:169)");
            }
            ShopVehicleListModel shopVehicleListModelOooO00o = this.f55391OooO0Oo.OooO00o(iIntValue);
            if (shopVehicleListModelOooO00o != null) {
                Modifier modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(PaddingKt.m478padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(4)), o0OOo000.f48135OooO0O0, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(6)));
                UserOutFitVM userOutFitVM = this.f55393OooO0o0;
                o0oOo0O0 o0ooo0o1 = this.f55392OooO0o;
                LifecycleOwner lifecycleOwner = this.f55394OooO0oO;
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM170backgroundbw27NRU);
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
                Function2 function2OooO00o = OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                z2.OooO0Oo(shopVehicleListModelOooO00o, new c3(userOutFitVM, shopVehicleListModelOooO00o), composer2, 8);
                z2.OooO0OO(shopVehicleListModelOooO00o, userOutFitVM, o0ooo0o1, lifecycleOwner, composer2, 4680);
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
