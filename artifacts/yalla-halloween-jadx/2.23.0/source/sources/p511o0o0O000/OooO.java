package p511o0o0O000;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.OooOO0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.user.UserMyOutFitModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p148o00Oo0o.o00000O0;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPagerProfileItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerProfileItem.kt\ncom/yalla/yalla/ui/composable/dialog/user/PagerProfileItemKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,81:1\n71#2,7:82\n78#2:117\n82#2:126\n78#3,11:89\n91#3:125\n456#4,8:100\n464#4,3:114\n467#4,3:122\n4144#5,6:108\n154#6:118\n154#6:119\n154#6:120\n154#6:121\n*S KotlinDebug\n*F\n+ 1 PagerProfileItem.kt\ncom/yalla/yalla/ui/composable/dialog/user/PagerProfileItemKt\n*L\n48#1:82,7\n48#1:117\n48#1:126\n48#1:89,11\n48#1:125\n48#1:100,8\n48#1:114,3\n48#1:122,3\n48#1:108,6\n60#1:118\n72#1:119\n73#1:120\n74#1:121\n*E\n"})
public final class OooO {

    @SourceDebugExtension({"SMAP\nPagerProfileItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerProfileItem.kt\ncom/yalla/yalla/ui/composable/dialog/user/PagerProfileItemKt$PagerProfileItem$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,81:1\n154#2:82\n154#2:83\n*S KotlinDebug\n*F\n+ 1 PagerProfileItem.kt\ncom/yalla/yalla/ui/composable/dialog/user/PagerProfileItemKt$PagerProfileItem$1$1\n*L\n66#1:82\n68#1:83\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserMyOutFitModel f51443OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UserMyOutFitModel userMyOutFitModel) {
            super(3);
            this.f51443OooO0Oo = userMyOutFitModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope TextButton = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(84788831, iIntValue, -1, "com.yalla.yalla.ui.composable.dialog.user.PagerProfileItem.<anonymous>.<anonymous> (PagerProfileItem.kt:60)");
                }
                if (this.f51443OooO0Oo.getSelected()) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_store_bubble_use, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                    OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composer2, 6, 2);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<UserMyOutFitModel, Unit> f51444OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserMyOutFitModel f51445OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super UserMyOutFitModel, Unit> function1, UserMyOutFitModel userMyOutFitModel) {
            super(0);
            this.f51444OooO0Oo = function1;
            this.f51445OooO0o0 = userMyOutFitModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f51444OooO0Oo.invoke(this.f51445OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserMyOutFitModel f51446OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function4<ColumnScope, UserMyOutFitModel, Composer, Integer, Unit> f51447OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<UserMyOutFitModel, Unit> f51448OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51449OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(UserMyOutFitModel userMyOutFitModel, Function1<? super UserMyOutFitModel, Unit> function1, Function4<? super ColumnScope, ? super UserMyOutFitModel, ? super Composer, ? super Integer, Unit> function4, int i) {
            super(2);
            this.f51446OooO0Oo = userMyOutFitModel;
            this.f51448OooO0o0 = function1;
            this.f51447OooO0o = function4;
            this.f51449OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51449OooO0oO | 1);
            Function1<UserMyOutFitModel, Unit> function1 = this.f51448OooO0o0;
            Function4<ColumnScope, UserMyOutFitModel, Composer, Integer, Unit> function4 = this.f51447OooO0o;
            OooO.OooO00o(this.f51446OooO0Oo, function1, function4, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@NotNull UserMyOutFitModel model, @NotNull Function1<? super UserMyOutFitModel, Unit> onUseBtnClick, @NotNull Function4<? super ColumnScope, ? super UserMyOutFitModel, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onUseBtnClick, "onUseBtnClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(97935637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(97935637, i, -1, "com.yalla.yalla.ui.composable.dialog.user.PagerProfileItem (PagerProfileItem.kt:41)");
        }
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.INSTANCE;
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        content.invoke(columnScopeInstance, model, composerStartRestartGroup, Integer.valueOf((i & 896) | 70));
        boolean z = model.getFrozenDay() == 0;
        String strOooO0OO = o0000.OooO0OO(model.getSelected() ? oO00OOo0.In_Use : oO00OOo0.Use);
        long jOooO0OO = o0000O0.OooO0OO(16, composerStartRestartGroup, 6);
        int i2 = o0oO0O0o.f47152o00OOOo;
        o00000O0.OooO00o(strOooO0OO, jOooO0OO, null, model.getFrozenDay() == 0 ? TextButtonStyle.Green : TextButtonStyle.GreyDisable, Color.m1660boximpl(o0oO0O0o.f46946OooO0O0), z ? null : Color.m1660boximpl(o0oO0O0o.f47044o000O00), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(8)), 0.0f, null, false, false, 0L, false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 84788831, true, new OooO00o(model)), null, null, columnScopeInstance.align(SizeKt.m520requiredWidth3ABfNKs(SizeKt.m512requiredHeight3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(24), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(44)), Dp.m3765constructorimpl(145)), companion2.getCenterHorizontally()), new OooO0O0(onUseBtnClick, model), composerStartRestartGroup, 0, 196608, 229252);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(model, onUseBtnClick, content, i));
    }
}
