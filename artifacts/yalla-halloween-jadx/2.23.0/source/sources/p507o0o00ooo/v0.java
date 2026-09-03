package p507o0o00ooo;

import OooOo.OooO0o;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.OooOOO0;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
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
import com.code.android.util.o0000;
import com.facebook.OooOo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p154o00OoO00.OooOo00;
import p420o0OoO0OO.o0OO00O;
import p469o0OoooOO.o0oO0O0o;
import p571o0oOoOO.o0O0OOO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLoadingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingDialog.kt\ncom/yalla/yalla/ui/composable/common/LoadingDialogKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,97:1\n25#2:98\n1097#3,6:99\n*S KotlinDebug\n*F\n+ 1 LoadingDialog.kt\ncom/yalla/yalla/ui/composable/common/LoadingDialogKt\n*L\n65#1:98\n65#1:99,6\n*E\n"})
public final class v0 {

    @SourceDebugExtension({"SMAP\nLoadingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingDialog.kt\ncom/yalla/yalla/ui/composable/common/LoadingDialogKt$LoadingDialog$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,97:1\n154#2:98\n154#2:99\n154#2:100\n154#2:143\n154#2:144\n154#2:145\n72#3,6:101\n78#3:135\n82#3:150\n78#4,11:107\n91#4:149\n456#5,8:118\n464#5,3:132\n25#5:136\n467#5,3:146\n4144#6,6:126\n1097#7,6:137\n*S KotlinDebug\n*F\n+ 1 LoadingDialog.kt\ncom/yalla/yalla/ui/composable/common/LoadingDialogKt$LoadingDialog$1\n*L\n48#1:98\n49#1:99\n51#1:100\n54#1:143\n55#1:144\n57#1:145\n45#1:101,6\n45#1:135\n45#1:150\n45#1:107,11\n45#1:149\n45#1:118,8\n45#1:132,3\n53#1:136\n45#1:146,3\n45#1:126,6\n53#1:137,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f50297OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50298OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, int i) {
            super(2);
            this.f50297OooO0Oo = str;
            this.f50298OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer3.getSkipping()) {
                composer3.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(671703081, iIntValue, -1, "com.yalla.yalla.ui.composable.common.LoadingDialog.<anonymous> (LoadingDialog.kt:43)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 16;
                Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(BackgroundKt.m169backgroundbw27NRU$default(OooOo.OooO0O0(f, SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(220))), o0oO0O0o.f46968OooOoO, null, 2, null), Dp.m3765constructorimpl(f));
                String str = this.f50297OooO0Oo;
                composer3.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer3, 48, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs);
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
                Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = "svga/anim_loading.svga";
                    composer3.updateRememberedValue("svga/anim_loading.svga");
                }
                composer3.endReplaceableGroup();
                OooOo00.OooO00o((String) objRememberedValue, true, 0, null, null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composer3, 196662, 28);
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(10)), composer3, 6);
                composer3.startReplaceableGroup(235042866);
                if (!StringsKt.isBlank(str)) {
                    SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(12)), composer3, 6);
                    composer2 = composer3;
                    TextKt.m1251Text4IGK_g(str, (Modifier) null, o000OOo.OooO0OO(composer3).f37711OooOO0O, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (this.f50298OooO0o0 >> 3)) | 3072, 0, 131058);
                } else {
                    composer2 = composer3;
                }
                if (OooO0o.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ x0 f50299OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f50300OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f50301OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50302OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f50303OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(x0 x0Var, String str, boolean z, int i, int i2) {
            super(2);
            this.f50299OooO0Oo = x0Var;
            this.f50301OooO0o0 = str;
            this.f50300OooO0o = z;
            this.f50302OooO0oO = i;
            this.f50303OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            v0.OooO00o(this.f50299OooO0Oo, this.f50301OooO0o0, this.f50300OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50302OooO0oO | 1), this.f50303OooO0oo);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull x0 state, @Nullable String str, boolean z, @Nullable Composer composer, int i, int i2) {
        String strStringResource;
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(547720731);
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            strStringResource = StringResources_androidKt.stringResource(oO00OOo0.loading, composerStartRestartGroup, 0);
        } else {
            strStringResource = str;
            i3 = i;
        }
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(547720731, i3, -1, "com.yalla.yalla.ui.composable.common.LoadingDialog (LoadingDialog.kt:33)");
        }
        p158o00OoOOO.OooOOO0.OooO00o(state.f50363OooO00o, z2, false, state.f50366OooO0Oo, null, 0, 0, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 671703081, true, new OooO00o(strStringResource, i3)), composerStartRestartGroup, ((i3 >> 3) & 112) | 100663680, 240);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(state, strStringResource, z2, i, i2));
    }

    public static void OooO0O0(o0OO00O o0oo00o2, o0O0OOO0 loadingVM, boolean z, int i) {
        String text = (i & 2) != 0 ? o0000.OooO0OO(oO00OOo0.loading) : null;
        boolean z2 = false;
        if ((i & 4) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        Intrinsics.checkNotNullParameter(loadingVM, "loadingVM");
        Intrinsics.checkNotNullParameter(text, "text");
        Job job = o0oo00o2.f45552OooO00o;
        if (job != null && job.isActive()) {
            z2 = true;
        }
        if (z2) {
            x0 x0Var = loadingVM.f56243OooO00o;
            Job job2 = o0oo00o2.f45552OooO00o;
            x0Var.f50364OooO0O0 = job2;
            x0Var.f50365OooO0OO = z;
            if (job2 != null) {
                job2.invokeOnCompletion(new w0(loadingVM));
            }
            Intrinsics.checkNotNullParameter(text, "text");
            loadingVM.f56243OooO00o.f50363OooO00o.setValue(Boolean.TRUE);
            Intrinsics.checkNotNullParameter(text, "<set-?>");
            loadingVM.f56244OooO0O0.setValue(text);
        }
    }
}
