package p578o0oOoOoo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.facebook.OooOo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p154o00OoO00.OooOo00;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f56436OooO00o = ComposableLambdaKt.composableLambdaInstance(1564713446, false, OooO00o.f56437OooO0Oo);

    @SourceDebugExtension({"SMAP\nCameraMergingLoadingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraMergingLoadingDialog.kt\ncom/yalla/yalla/module/media/dialog/ComposableSingletons$CameraMergingLoadingDialogKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,43:1\n154#2:44\n154#2:45\n154#2:46\n154#2:85\n76#3,2:47\n78#3:77\n82#3:90\n78#4,11:49\n91#4:89\n456#5,8:60\n464#5,3:74\n25#5:78\n467#5,3:86\n4144#6,6:68\n1097#7,6:79\n*S KotlinDebug\n*F\n+ 1 CameraMergingLoadingDialog.kt\ncom/yalla/yalla/module/media/dialog/ComposableSingletons$CameraMergingLoadingDialogKt$lambda-1$1\n*L\n33#1:44\n34#1:45\n36#1:46\n40#1:85\n30#1:47,2\n30#1:77\n30#1:90\n30#1:49,11\n30#1:89\n30#1:60,8\n30#1:74,3\n39#1:78\n30#1:86,3\n30#1:68,6\n39#1:79,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f56437OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1564713446, iIntValue, -1, "com.yalla.yalla.module.media.dialog.ComposableSingletons$CameraMergingLoadingDialogKt.lambda-1.<anonymous> (CameraMergingLoadingDialog.kt:28)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 16;
                Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(BackgroundKt.m169backgroundbw27NRU$default(OooOo.OooO0O0(f, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(100))), o0oO0O0o.f46970OooOoOO, null, 2, null), Dp.m3765constructorimpl(f));
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs);
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
                Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = "svga/anim_loading.svga";
                    composer2.updateRememberedValue("svga/anim_loading.svga");
                }
                composer2.endReplaceableGroup();
                OooOo00.OooO00o((String) objRememberedValue, true, 0, null, null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composer2, 196662, 28);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
