package p535o0o0Oo0;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.animation.Oooo000;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0O0O00;
import com.qiniu.android.storage.Configuration;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOoo.OooOo;
import p193o00o0O0O.o0000oo;
import p476o0OooooO.o0OOo000;
import p535o0o0Oo0.o0;
import p535o0o0Oo0.o0O000;
import p535o0o0Oo0.o0O00000;
import p535o0o0Oo0.o0O0000O;
import p535o0o0Oo0.o0O000O;
import p535o0o0Oo0.o0O000Oo;
import p535o0o0Oo0.o0O000o0;
import p535o0o0Oo0.o0OoOoOo;
import p562o0oOo000.o000000;
import p644o0ooOOo.o0OO;
import p644o0ooOOo.oO000O0;
import p644o0ooOOo.oO0o0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentCommentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialog\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 11 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n1#1,293:1\n81#2,11:294\n81#2,11:305\n81#2,11:316\n81#2,11:327\n81#2,11:338\n81#2,11:349\n81#2,11:400\n81#2,11:411\n66#3,6:360\n72#3:394\n76#3:399\n66#3,6:422\n72#3:456\n66#3,6:460\n72#3:494\n76#3:499\n76#3:504\n78#4,11:366\n91#4:398\n78#4,11:428\n78#4,11:466\n91#4:498\n91#4:503\n456#5,8:377\n464#5,3:391\n467#5,3:395\n456#5,8:439\n464#5,3:453\n456#5,8:477\n464#5,3:491\n467#5,3:495\n467#5,3:500\n36#5:505\n25#5:516\n25#5:533\n50#5:560\n49#5:561\n36#5:568\n4144#6,6:385\n4144#6,6:447\n4144#6,6:485\n154#7:457\n154#7:458\n154#7:459\n154#7:527\n154#7:528\n164#7:575\n154#7:576\n1097#8,6:506\n1097#8,3:517\n1100#8,3:523\n955#8,6:534\n1097#8,6:562\n1097#8,6:569\n486#9,4:512\n490#9,2:520\n494#9:526\n486#10:522\n73#11,4:529\n77#11,20:540\n*S KotlinDebug\n*F\n+ 1 MomentCommentDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialog\n*L\n57#1:294,11\n58#1:305,11\n77#1:316,11\n78#1:327,11\n93#1:338,11\n94#1:349,11\n123#1:400,11\n124#1:411,11\n95#1:360,6\n95#1:394\n95#1:399\n125#1:422,6\n125#1:456\n131#1:460,6\n131#1:494\n131#1:499\n125#1:504\n95#1:366,11\n95#1:398\n125#1:428,11\n131#1:466,11\n131#1:498\n125#1:503\n95#1:377,8\n95#1:391,3\n95#1:395,3\n125#1:439,8\n125#1:453,3\n131#1:477,8\n131#1:491,3\n131#1:495,3\n125#1:500,3\n154#1:505\n155#1:516\n184#1:533\n273#1:560\n273#1:561\n280#1:568\n95#1:385,6\n125#1:447,6\n131#1:485,6\n133#1:457\n135#1:458\n137#1:459\n186#1:527\n189#1:528\n285#1:575\n286#1:576\n154#1:506,6\n155#1:517,3\n155#1:523,3\n184#1:534,6\n273#1:562,6\n280#1:569,6\n155#1:512,4\n155#1:520,2\n155#1:526\n155#1:522\n184#1:529,4\n184#1:540,20\n*E\n"})
public final class o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0 f53626OooO00o = new o0();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f53627OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f53628OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentCommentsVM momentCommentsVM, MomentVideoVM momentVideoVM) {
            super(0);
            this.f53627OooO0Oo = momentCommentsVM;
            this.f53628OooO0o0 = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f53627OooO0Oo.closeComment(this.f53628OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PagerState f53629OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f53630OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PagerState pagerState, CoroutineScope coroutineScope) {
            super(2);
            this.f53629OooO0Oo = pagerState;
            this.f53630OooO0o0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649887967, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.Content.<anonymous> (MomentCommentDialog.kt:158)");
                }
                o0 o0Var = o0.f53626OooO00o;
                PagerState pagerState = this.f53629OooO0Oo;
                o0.OooO0OO(o0Var, pagerState.getCurrentPage(), new o0O0o(pagerState, this.f53630OooO0o0), composer2, 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<PaddingValues, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PagerState f53631OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(PagerState pagerState) {
            super(3);
            this.f53631OooO0Oo = pagerState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            PaddingValues contentPadding = paddingValues;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(contentPadding) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(493484570, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.Content.<anonymous> (MomentCommentDialog.kt:163)");
                }
                PagerKt.m687HorizontalPagerxYaah8o(this.f53631OooO0Oo, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), contentPadding, null, 0, 0.0f, null, null, false, false, null, null, o00Oo00.f53652OooO0Oo, composer2, ((i << 6) & 896) | 48, 384, 4088);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f53633OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53634OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f53635OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f53636OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, int i2, int i3, int i4) {
            super(2);
            this.f53634OooO0o0 = i;
            this.f53633OooO0o = i2;
            this.f53635OooO0oO = i3;
            this.f53636OooO0oo = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0.this.OooO00o(this.f53634OooO0o0, this.f53633OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53635OooO0oO | 1), this.f53636OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f53637OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(0);
            this.f53637OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f53637OooO0Oo);
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f53638OooO0Oo = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f53639OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53641OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(int i) {
            super(2);
            this.f53641OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53641OooO0o0 | 1);
            o0.this.OooO0O0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f53642OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x013c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void OooO0OO(o0 o0Var, final int i, Function1 function1, Composer composer, int i2, int i3) {
        int i4;
        Function1 function2;
        final int i5;
        Function1 function3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Function1 function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        o0Var.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1590698677);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 == 0) {
            if ((i2 & 112) == 0) {
                function2 = function1;
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            i5 = i4;
            if ((i5 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1590698677, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.PopTitleView (MomentCommentDialog.kt:182)");
                }
                float f = 24;
                Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 12, null)), o0OOo000.f48135OooO0O0, null, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(48));
                composerStartRestartGroup.startReplaceableGroup(-270267587);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new oO000O0();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final oO000O0 oo000o0 = (oO000O0) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Pair pairOooO0O0 = p644o0ooOOo.o0OOo000.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue3, oo000o0, composerStartRestartGroup);
                MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
                final Function0 function0 = (Function0) pairOooO0O0.component2();
                final Function1 function5 = function3;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM511height3ABfNKs, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog$PopTitleView$$inlined$ConstraintLayout$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        oO0o0o.OooO00o(semantics, oo000o0);
                        return Unit.INSTANCE;
                    }
                }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog$PopTitleView$$inlined$ConstraintLayout$2

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ int f28860OooO0Oo = 0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Unit invoke(Composer composer2, Integer num) {
                        Composer composer3 = composer2;
                        if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                        } else {
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            constraintLayoutScope2.getClass();
                            constraintLayoutScope2.OooO0Oo();
                            int i7 = ((this.f28860OooO0Oo >> 3) & 112) | 8;
                            ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                            o0OO o0ooOooO00o = oooO00oOooO0OO.OooO00o();
                            o0OO o0ooOooO0O0 = oooO00oOooO0OO.OooO0O0();
                            o0OO o0ooOooO0OO = oooO00oOooO0OO.OooO0OO();
                            o0OO o0ooOooO0Oo = oooO00oOooO0OO.OooO0Oo();
                            ConstraintLayoutScope constraintLayoutScope3 = oooO00oOooO0OO.f4214OooO00o;
                            o0OO o0ooOooO0O1 = constraintLayoutScope3.OooO0O0();
                            o0OO o0ooOooO0O2 = constraintLayoutScope3.OooO0O0();
                            o0OO o0ooOooO0O3 = constraintLayoutScope3.OooO0O0();
                            o0 o0Var2 = o0.f53626OooO00o;
                            int i8 = i;
                            String strStringResource = StringResources_androidKt.stringResource(o000000.Comments, composer3, 0);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            float f2 = 16;
                            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO00o, o0O00000.f53664OooO0Oo), Dp.m3775constructorimpl(f2), 0.0f, Dp.m3775constructorimpl(f2), 0.0f, 10, null);
                            composer3.startReplaceableGroup(1157296644);
                            Function1 function6 = function5;
                            boolean zChanged = composer3.changed(function6);
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new o0O0000O(function6);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            composer3.endReplaceableGroup();
                            int i9 = (i7 & 14) | 100663352 | ((i5 << 6) & 896);
                            o0.OooO0o0(o0Var2, constraintLayoutScope2, 0, i8, strStringResource, modifierM482paddingqDBjuR0$default, o0ooOooO00o, o0ooOooO0O0, (Function1) objRememberedValue4, composer3, i9, 0);
                            int i10 = i;
                            String strStringResource2 = StringResources_androidKt.stringResource(o000000.Likes, composer3, 0);
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged2 = composer3.changed(o0ooOooO00o);
                            Object objRememberedValue5 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new o0O000(o0ooOooO00o);
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            composer3.endReplaceableGroup();
                            float f3 = 8;
                            Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0OO, (Function1) objRememberedValue5), Dp.m3775constructorimpl(f3), 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 10, null);
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged3 = composer3.changed(function6);
                            Object objRememberedValue6 = composer3.rememberedValue();
                            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new o0O000O(function6);
                                composer3.updateRememberedValue(objRememberedValue6);
                            }
                            composer3.endReplaceableGroup();
                            o0.OooO0o0(o0Var2, constraintLayoutScope2, 1, i10, strStringResource2, modifierM482paddingqDBjuR0$default2, o0ooOooO0OO, o0ooOooO0Oo, (Function1) objRememberedValue6, composer3, i9, 0);
                            int i11 = i;
                            String strStringResource3 = StringResources_androidKt.stringResource(o000000.Gifts, composer3, 0);
                            Modifier modifierM482paddingqDBjuR0$default3 = PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0O1, o0OoOoOo.f53813OooO0Oo), Dp.m3775constructorimpl(f2), 0.0f, Dp.m3775constructorimpl(f2), 0.0f, 10, null);
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged4 = composer3.changed(function6);
                            Object objRememberedValue7 = composer3.rememberedValue();
                            if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new o0O000Oo(function6);
                                composer3.updateRememberedValue(objRememberedValue7);
                            }
                            composer3.endReplaceableGroup();
                            o0.OooO0o0(o0Var2, constraintLayoutScope2, 2, i11, strStringResource3, modifierM482paddingqDBjuR0$default3, o0ooOooO0O1, o0ooOooO0O2, (Function1) objRememberedValue7, composer3, i9, 0);
                            com.code.android.util.OooOO0.OooO0OO(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0O3, o0O000o0.f53668OooO0Oo), 0.0f, o0OOo000.f48202o00000O0, composer3, 0, 1);
                        }
                        return Unit.INSTANCE;
                    }
                }), measurePolicy, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function4 = function2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0O00(o0Var, i, function4, i2, i3));
        }
        i4 |= 48;
        function2 = function1;
        i5 = i4;
        if ((i5 & 91) == 18) {
            if (i6 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1590698677, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.PopTitleView (MomentCommentDialog.kt:182)");
            }
            float f2 = 24;
            Modifier modifierM511height3ABfNKs2 = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2), 0.0f, 0.0f, 12, null)), o0OOo000.f48135OooO0O0, null, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(48));
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new oO000O0();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO000O0 oo000o1 = (oO000O0) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair pairOooO0O1 = p644o0ooOOo.o0OOo000.OooO0O0(constraintLayoutScope2, (MutableState) objRememberedValue3, oo000o1, composerStartRestartGroup);
            MeasurePolicy measurePolicy2 = (MeasurePolicy) pairOooO0O1.component1();
            final Function0 function6 = (Function0) pairOooO0O1.component2();
            final Function1 function7 = function3;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM511height3ABfNKs2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog$PopTitleView$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    oO0o0o.OooO00o(semantics, oo000o1);
                    return Unit.INSTANCE;
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog$PopTitleView$$inlined$ConstraintLayout$2

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ int f28860OooO0Oo = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    Composer composer3 = composer2;
                    if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                        constraintLayoutScope3.getClass();
                        constraintLayoutScope3.OooO0Oo();
                        int i7 = ((this.f28860OooO0Oo >> 3) & 112) | 8;
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope3.OooO0OO();
                        o0OO o0ooOooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO o0ooOooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0OO o0ooOooO0OO = oooO00oOooO0OO.OooO0OO();
                        o0OO o0ooOooO0Oo = oooO00oOooO0OO.OooO0Oo();
                        ConstraintLayoutScope constraintLayoutScope4 = oooO00oOooO0OO.f4214OooO00o;
                        o0OO o0ooOooO0O1 = constraintLayoutScope4.OooO0O0();
                        o0OO o0ooOooO0O2 = constraintLayoutScope4.OooO0O0();
                        o0OO o0ooOooO0O3 = constraintLayoutScope4.OooO0O0();
                        o0 o0Var2 = o0.f53626OooO00o;
                        int i8 = i;
                        String strStringResource = StringResources_androidKt.stringResource(o000000.Comments, composer3, 0);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float f3 = 16;
                        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO00o, o0O00000.f53664OooO0Oo), Dp.m3775constructorimpl(f3), 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 10, null);
                        composer3.startReplaceableGroup(1157296644);
                        Function1 function8 = function7;
                        boolean zChanged = composer3.changed(function8);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new o0O0000O(function8);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        int i9 = (i7 & 14) | 100663352 | ((i5 << 6) & 896);
                        o0.OooO0o0(o0Var2, constraintLayoutScope3, 0, i8, strStringResource, modifierM482paddingqDBjuR0$default, o0ooOooO00o, o0ooOooO0O0, (Function1) objRememberedValue4, composer3, i9, 0);
                        int i10 = i;
                        String strStringResource2 = StringResources_androidKt.stringResource(o000000.Likes, composer3, 0);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer3.changed(o0ooOooO00o);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new o0O000(o0ooOooO00o);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        float f4 = 8;
                        Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0OO, (Function1) objRememberedValue5), Dp.m3775constructorimpl(f4), 0.0f, Dp.m3775constructorimpl(f4), 0.0f, 10, null);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged3 = composer3.changed(function8);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new o0O000O(function8);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceableGroup();
                        o0.OooO0o0(o0Var2, constraintLayoutScope3, 1, i10, strStringResource2, modifierM482paddingqDBjuR0$default2, o0ooOooO0OO, o0ooOooO0Oo, (Function1) objRememberedValue6, composer3, i9, 0);
                        int i11 = i;
                        String strStringResource3 = StringResources_androidKt.stringResource(o000000.Gifts, composer3, 0);
                        Modifier modifierM482paddingqDBjuR0$default3 = PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0O1, o0OoOoOo.f53813OooO0Oo), Dp.m3775constructorimpl(f3), 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 10, null);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged4 = composer3.changed(function8);
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new o0O000Oo(function8);
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        composer3.endReplaceableGroup();
                        o0.OooO0o0(o0Var2, constraintLayoutScope3, 2, i11, strStringResource3, modifierM482paddingqDBjuR0$default3, o0ooOooO0O1, o0ooOooO0O2, (Function1) objRememberedValue7, composer3, i9, 0);
                        com.code.android.util.OooOO0.OooO0OO(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0O3, o0O000o0.f53668OooO0Oo), 0.0f, o0OOo000.f48202o00000O0, composer3, 0, 1);
                    }
                    return Unit.INSTANCE;
                }
            }), measurePolicy2, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function3;
        } else {
            if (i6 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1590698677, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.PopTitleView (MomentCommentDialog.kt:182)");
            }
            float f3 = 24;
            Modifier modifierM511height3ABfNKs3 = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 12, null)), o0OOo000.f48135OooO0O0, null, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(48));
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new oO000O0();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO000O0 oo000o2 = (oO000O0) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair pairOooO0O2 = p644o0ooOOo.o0OOo000.OooO0O0(constraintLayoutScope3, (MutableState) objRememberedValue3, oo000o2, composerStartRestartGroup);
            MeasurePolicy measurePolicy3 = (MeasurePolicy) pairOooO0O2.component1();
            final Function0 function8 = (Function0) pairOooO0O2.component2();
            final Function1 function9 = function3;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM511height3ABfNKs3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog$PopTitleView$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    oO0o0o.OooO00o(semantics, oo000o2);
                    return Unit.INSTANCE;
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog$PopTitleView$$inlined$ConstraintLayout$2

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ int f28860OooO0Oo = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    Composer composer3 = composer2;
                    if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope3;
                        constraintLayoutScope4.getClass();
                        constraintLayoutScope4.OooO0Oo();
                        int i7 = ((this.f28860OooO0Oo >> 3) & 112) | 8;
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope4.OooO0OO();
                        o0OO o0ooOooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO o0ooOooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0OO o0ooOooO0OO = oooO00oOooO0OO.OooO0OO();
                        o0OO o0ooOooO0Oo = oooO00oOooO0OO.OooO0Oo();
                        ConstraintLayoutScope constraintLayoutScope5 = oooO00oOooO0OO.f4214OooO00o;
                        o0OO o0ooOooO0O1 = constraintLayoutScope5.OooO0O0();
                        o0OO o0ooOooO0O2 = constraintLayoutScope5.OooO0O0();
                        o0OO o0ooOooO0O3 = constraintLayoutScope5.OooO0O0();
                        o0 o0Var2 = o0.f53626OooO00o;
                        int i8 = i;
                        String strStringResource = StringResources_androidKt.stringResource(o000000.Comments, composer3, 0);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float f4 = 16;
                        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO00o, o0O00000.f53664OooO0Oo), Dp.m3775constructorimpl(f4), 0.0f, Dp.m3775constructorimpl(f4), 0.0f, 10, null);
                        composer3.startReplaceableGroup(1157296644);
                        Function1 function10 = function9;
                        boolean zChanged = composer3.changed(function10);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new o0O0000O(function10);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        int i9 = (i7 & 14) | 100663352 | ((i5 << 6) & 896);
                        o0.OooO0o0(o0Var2, constraintLayoutScope4, 0, i8, strStringResource, modifierM482paddingqDBjuR0$default, o0ooOooO00o, o0ooOooO0O0, (Function1) objRememberedValue4, composer3, i9, 0);
                        int i10 = i;
                        String strStringResource2 = StringResources_androidKt.stringResource(o000000.Likes, composer3, 0);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer3.changed(o0ooOooO00o);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new o0O000(o0ooOooO00o);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        float f5 = 8;
                        Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0OO, (Function1) objRememberedValue5), Dp.m3775constructorimpl(f5), 0.0f, Dp.m3775constructorimpl(f5), 0.0f, 10, null);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged3 = composer3.changed(function10);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new o0O000O(function10);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceableGroup();
                        o0.OooO0o0(o0Var2, constraintLayoutScope4, 1, i10, strStringResource2, modifierM482paddingqDBjuR0$default2, o0ooOooO0OO, o0ooOooO0Oo, (Function1) objRememberedValue6, composer3, i9, 0);
                        int i11 = i;
                        String strStringResource3 = StringResources_androidKt.stringResource(o000000.Gifts, composer3, 0);
                        Modifier modifierM482paddingqDBjuR0$default3 = PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0O1, o0OoOoOo.f53813OooO0Oo), Dp.m3775constructorimpl(f4), 0.0f, Dp.m3775constructorimpl(f4), 0.0f, 10, null);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged4 = composer3.changed(function10);
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new o0O000Oo(function10);
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        composer3.endReplaceableGroup();
                        o0.OooO0o0(o0Var2, constraintLayoutScope4, 2, i11, strStringResource3, modifierM482paddingqDBjuR0$default3, o0ooOooO0O1, o0ooOooO0O2, (Function1) objRememberedValue7, composer3, i9, 0);
                        com.code.android.util.OooOO0.OooO0OO(ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0O3, o0O000o0.f53668OooO0Oo), 0.0f, o0OOo000.f48202o00000O0, composer3, 0, 1);
                    }
                    return Unit.INSTANCE;
                }
            }), measurePolicy3, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O00(o0Var, i, function4, i2, i3));
    }

    public static final void OooO0Oo(o0 o0Var, Composer composer, int i) {
        o0Var.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(645981668);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(645981668, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.Show (MomentCommentDialog.kt:121)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(MomentCommentsVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentCommentsVM momentCommentsVM = (MomentCommentsVM) viewModel2;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, o0OoO00O.f53812OooO0Oo, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f = 24;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(boxScopeInstance.align(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(56), 7, null), companion2.getBottomCenter()), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 12, null)), o0OOo000.f48135OooO0O0, null, 2, null), Dp.m3775constructorimpl(YallaTeamMessage.JumpId.RoomList_Recommended)), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            f53626OooO00o.OooO00o(3, momentVideoVM.getShowMomentVideoContentPopInitialPage().getValue().intValue(), composerStartRestartGroup, 390, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            p519o0o0O0OO.o0O00000.OooO00o(false, false, null, boxScopeInstance.align(companion, companion2.getBottomCenter()), composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            OooOo.OooO00o(false, new o0O00O0o(momentCommentsVM, momentVideoVM), composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O00O(o0Var, i));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0114  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:107:0x016c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0174  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:120:0x022b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0236  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    public static final void OooO0o0(o0 o0Var, ConstraintLayoutScope constraintLayoutScope, int i, int i2, String str, Modifier modifier, o0OO o0oo, o0OO o0oo2, Function1 function1, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        int i9;
        int i10;
        Function1 function2;
        int i11;
        Modifier modifier3;
        Function1 function3;
        long j;
        Modifier.Companion companion;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        o0Var.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(585856357);
        if ((i4 & Integer.MIN_VALUE) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(constraintLayoutScope) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 1) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 2) != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i4 & 4) == 0) {
            if ((i3 & 7168) == 0) {
                i5 |= composerStartRestartGroup.changed(str) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((57344 & i3) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((i4 & 16) != 0) {
                    if ((458752 & i3) == 0) {
                        if (composerStartRestartGroup.changed(o0oo)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((i4 & 32) != 0) {
                        if ((3670016 & i3) == 0) {
                            if (composerStartRestartGroup.changed(o0oo2)) {
                                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i9 = 524288;
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            if ((29360128 & i3) == 0) {
                                function2 = function1;
                                if (composerStartRestartGroup.changedInstance(function2)) {
                                    i11 = 8388608;
                                } else {
                                    i11 = Configuration.BLOCK_SIZE;
                                }
                                i5 |= i11;
                            }
                            if ((23967451 & i5) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                if (i6 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i10 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                                }
                                long sp = TextUnitKt.getSp(16);
                                if (i2 == i) {
                                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                                }
                                long j2 = j;
                                composerStartRestartGroup.endReplaceableGroup();
                                companion = Modifier.INSTANCE;
                                Modifier modifierThen = companion.then(modifier3);
                                Integer numValueOf = Integer.valueOf(i);
                                composerStartRestartGroup.startReplaceableGroup(511388516);
                                zChanged = composerStartRestartGroup.changed(numValueOf) | composerStartRestartGroup.changed(function3);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o0O00OO(function3, i);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                int i12 = ((i5 >> 9) & 14) | 3072;
                                Function1 function4 = function3;
                                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j2, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i12, 0, 131056);
                                if (i2 == i) {
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new o0O00OOO(o0oo);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    constraintLayoutScope.getClass();
                                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function2 = function4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                        }
                        i5 |= 12582912;
                        function2 = function1;
                        if ((23967451 & i5) == 4793490) {
                            if (i6 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                            }
                            long sp2 = TextUnitKt.getSp(16);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(-76785675);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-76785660);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                            }
                            long j3 = j;
                            composerStartRestartGroup.endReplaceableGroup();
                            companion = Modifier.INSTANCE;
                            Modifier modifierThen2 = companion.then(modifier3);
                            Integer numValueOf2 = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(numValueOf2) | composerStartRestartGroup.changed(function3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i13 = ((i5 >> 9) & 14) | 3072;
                            Function1 function5 = function3;
                            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j3, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13, 0, 131056);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(o0oo);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                constraintLayoutScope.getClass();
                                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2 = function5;
                        } else {
                            if (i6 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                            }
                            long sp3 = TextUnitKt.getSp(16);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(-76785675);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-76785660);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                            }
                            long j4 = j;
                            composerStartRestartGroup.endReplaceableGroup();
                            companion = Modifier.INSTANCE;
                            Modifier modifierThen3 = companion.then(modifier3);
                            Integer numValueOf3 = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(numValueOf3) | composerStartRestartGroup.changed(function3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i14 = ((i5 >> 9) & 14) | 3072;
                            Function1 function6 = function3;
                            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j4, sp3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i14, 0, 131056);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(o0oo);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                constraintLayoutScope.getClass();
                                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2 = function6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                    }
                    i9 = 1572864;
                    i5 |= i9;
                    i10 = i4 & 64;
                    if (i10 != 0) {
                        if ((29360128 & i3) == 0) {
                            function2 = function1;
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i5 |= i11;
                        }
                        if ((23967451 & i5) == 4793490) {
                            if (i6 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                            }
                            long sp4 = TextUnitKt.getSp(16);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(-76785675);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-76785660);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                            }
                            long j5 = j;
                            composerStartRestartGroup.endReplaceableGroup();
                            companion = Modifier.INSTANCE;
                            Modifier modifierThen4 = companion.then(modifier3);
                            Integer numValueOf4 = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(numValueOf4) | composerStartRestartGroup.changed(function3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i15 = ((i5 >> 9) & 14) | 3072;
                            Function1 function7 = function3;
                            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen4, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j5, sp4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i15, 0, 131056);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(o0oo);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                constraintLayoutScope.getClass();
                                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2 = function7;
                        } else {
                            if (i6 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                            }
                            long sp5 = TextUnitKt.getSp(16);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(-76785675);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-76785660);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                            }
                            long j6 = j;
                            composerStartRestartGroup.endReplaceableGroup();
                            companion = Modifier.INSTANCE;
                            Modifier modifierThen5 = companion.then(modifier3);
                            Integer numValueOf5 = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(numValueOf5) | composerStartRestartGroup.changed(function3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i16 = ((i5 >> 9) & 14) | 3072;
                            Function1 function8 = function3;
                            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j6, sp5, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i16, 0, 131056);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(o0oo);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                constraintLayoutScope.getClass();
                                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2 = function8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                    }
                    i5 |= 12582912;
                    function2 = function1;
                    if ((23967451 & i5) == 4793490) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp6 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j7 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen6 = companion.then(modifier3);
                        Integer numValueOf6 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf6) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i17 = ((i5 >> 9) & 14) | 3072;
                        Function1 function9 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen6, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j7, sp6, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i17, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function9;
                    } else {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp7 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j8 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen7 = companion.then(modifier3);
                        Integer numValueOf7 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf7) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i18 = ((i5 >> 9) & 14) | 3072;
                        Function1 function10 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen7, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j8, sp7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i18, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function10;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                }
                i8 = 196608;
                i5 |= i8;
                if ((i4 & 32) != 0) {
                    if ((3670016 & i3) == 0) {
                        if (composerStartRestartGroup.changed(o0oo2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                        if ((29360128 & i3) == 0) {
                            function2 = function1;
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i5 |= i11;
                        }
                        if ((23967451 & i5) == 4793490) {
                            if (i6 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                            }
                            long sp8 = TextUnitKt.getSp(16);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(-76785675);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-76785660);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                            }
                            long j9 = j;
                            composerStartRestartGroup.endReplaceableGroup();
                            companion = Modifier.INSTANCE;
                            Modifier modifierThen8 = companion.then(modifier3);
                            Integer numValueOf8 = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(numValueOf8) | composerStartRestartGroup.changed(function3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i19 = ((i5 >> 9) & 14) | 3072;
                            Function1 function11 = function3;
                            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen8, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j9, sp8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i19, 0, 131056);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(o0oo);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                constraintLayoutScope.getClass();
                                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2 = function11;
                        } else {
                            if (i6 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                            }
                            long sp9 = TextUnitKt.getSp(16);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(-76785675);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-76785660);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                            }
                            long j10 = j;
                            composerStartRestartGroup.endReplaceableGroup();
                            companion = Modifier.INSTANCE;
                            Modifier modifierThen9 = companion.then(modifier3);
                            Integer numValueOf9 = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(numValueOf9) | composerStartRestartGroup.changed(function3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i110 = ((i5 >> 9) & 14) | 3072;
                            Function1 function12 = function3;
                            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen9, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j10, sp9, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i110, 0, 131056);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(o0oo);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                constraintLayoutScope.getClass();
                                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                    }
                    i5 |= 12582912;
                    function2 = function1;
                    if ((23967451 & i5) == 4793490) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp10 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j11 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen10 = companion.then(modifier3);
                        Integer numValueOf10 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf10) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i111 = ((i5 >> 9) & 14) | 3072;
                        Function1 function13 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen10, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11, sp10, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function13;
                    } else {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp11 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j12 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen11 = companion.then(modifier3);
                        Integer numValueOf11 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf11) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i112 = ((i5 >> 9) & 14) | 3072;
                        Function1 function14 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j12, sp11, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i112, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function14;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                }
                i9 = 1572864;
                i5 |= i9;
                i10 = i4 & 64;
                if (i10 != 0) {
                    if ((29360128 & i3) == 0) {
                        function2 = function1;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i11;
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp12 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j13 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen12 = companion.then(modifier3);
                        Integer numValueOf12 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf12) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i113 = ((i5 >> 9) & 14) | 3072;
                        Function1 function15 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen12, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j13, sp12, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i113, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function15;
                    } else {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp13 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j14 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen13 = companion.then(modifier3);
                        Integer numValueOf13 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf13) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i114 = ((i5 >> 9) & 14) | 3072;
                        Function1 function16 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen13, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j14, sp13, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i114, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function16;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                }
                i5 |= 12582912;
                function2 = function1;
                if ((23967451 & i5) == 4793490) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp14 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j15 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen14 = companion.then(modifier3);
                    Integer numValueOf14 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf14) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i115 = ((i5 >> 9) & 14) | 3072;
                    Function1 function17 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen14, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j15, sp14, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i115, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function17;
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp15 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j16 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen15 = companion.then(modifier3);
                    Integer numValueOf15 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf15) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i116 = ((i5 >> 9) & 14) | 3072;
                    Function1 function18 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen15, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j16, sp15, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i116, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function18;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
            }
            i5 |= 24576;
            modifier2 = modifier;
            if ((i4 & 16) != 0) {
                if ((458752 & i3) == 0) {
                    if (composerStartRestartGroup.changed(o0oo)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                if ((i4 & 32) != 0) {
                    if ((3670016 & i3) == 0) {
                        if (composerStartRestartGroup.changed(o0oo2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                        if ((29360128 & i3) == 0) {
                            function2 = function1;
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i5 |= i11;
                        }
                        if ((23967451 & i5) == 4793490) {
                            if (i6 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                            }
                            long sp16 = TextUnitKt.getSp(16);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(-76785675);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-76785660);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                            }
                            long j17 = j;
                            composerStartRestartGroup.endReplaceableGroup();
                            companion = Modifier.INSTANCE;
                            Modifier modifierThen16 = companion.then(modifier3);
                            Integer numValueOf16 = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(numValueOf16) | composerStartRestartGroup.changed(function3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i117 = ((i5 >> 9) & 14) | 3072;
                            Function1 function19 = function3;
                            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen16, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j17, sp16, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i117, 0, 131056);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(o0oo);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                constraintLayoutScope.getClass();
                                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2 = function19;
                        } else {
                            if (i6 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                            }
                            long sp17 = TextUnitKt.getSp(16);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(-76785675);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-76785660);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                            }
                            long j18 = j;
                            composerStartRestartGroup.endReplaceableGroup();
                            companion = Modifier.INSTANCE;
                            Modifier modifierThen17 = companion.then(modifier3);
                            Integer numValueOf17 = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(numValueOf17) | composerStartRestartGroup.changed(function3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i118 = ((i5 >> 9) & 14) | 3072;
                            Function1 function110 = function3;
                            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen17, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j18, sp17, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i118, 0, 131056);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(o0oo);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                constraintLayoutScope.getClass();
                                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2 = function110;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                    }
                    i5 |= 12582912;
                    function2 = function1;
                    if ((23967451 & i5) == 4793490) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp18 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j19 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen18 = companion.then(modifier3);
                        Integer numValueOf18 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf18) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i119 = ((i5 >> 9) & 14) | 3072;
                        Function1 function111 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen18, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j19, sp18, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i119, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function111;
                    } else {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp19 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j110 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen19 = companion.then(modifier3);
                        Integer numValueOf19 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf19) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i1110 = ((i5 >> 9) & 14) | 3072;
                        Function1 function112 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen19, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j110, sp19, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1110, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function112;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                }
                i9 = 1572864;
                i5 |= i9;
                i10 = i4 & 64;
                if (i10 != 0) {
                    if ((29360128 & i3) == 0) {
                        function2 = function1;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i11;
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp110 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j111 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen110 = companion.then(modifier3);
                        Integer numValueOf110 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf110) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i1111 = ((i5 >> 9) & 14) | 3072;
                        Function1 function113 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen110, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111, sp110, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function113;
                    } else {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp111 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j112 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen111 = companion.then(modifier3);
                        Integer numValueOf111 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf111) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i1112 = ((i5 >> 9) & 14) | 3072;
                        Function1 function114 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j112, sp111, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1112, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function114;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                }
                i5 |= 12582912;
                function2 = function1;
                if ((23967451 & i5) == 4793490) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp112 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j113 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen112 = companion.then(modifier3);
                    Integer numValueOf112 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf112) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1113 = ((i5 >> 9) & 14) | 3072;
                    Function1 function115 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen112, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j113, sp112, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1113, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function115;
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp113 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j114 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen113 = companion.then(modifier3);
                    Integer numValueOf113 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf113) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1114 = ((i5 >> 9) & 14) | 3072;
                    Function1 function116 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen113, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j114, sp113, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1114, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
            }
            i8 = 196608;
            i5 |= i8;
            if ((i4 & 32) != 0) {
                if ((3670016 & i3) == 0) {
                    if (composerStartRestartGroup.changed(o0oo2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                    if ((29360128 & i3) == 0) {
                        function2 = function1;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i11;
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp114 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j115 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen114 = companion.then(modifier3);
                        Integer numValueOf114 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf114) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i1115 = ((i5 >> 9) & 14) | 3072;
                        Function1 function117 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen114, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j115, sp114, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1115, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function117;
                    } else {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp115 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j116 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen115 = companion.then(modifier3);
                        Integer numValueOf115 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf115) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i1116 = ((i5 >> 9) & 14) | 3072;
                        Function1 function118 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen115, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j116, sp115, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1116, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function118;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                }
                i5 |= 12582912;
                function2 = function1;
                if ((23967451 & i5) == 4793490) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp116 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j117 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen116 = companion.then(modifier3);
                    Integer numValueOf116 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf116) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1117 = ((i5 >> 9) & 14) | 3072;
                    Function1 function119 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen116, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j117, sp116, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1117, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function119;
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp117 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j118 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen117 = companion.then(modifier3);
                    Integer numValueOf117 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf117) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1118 = ((i5 >> 9) & 14) | 3072;
                    Function1 function1110 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen117, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j118, sp117, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1118, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function1110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
            }
            i9 = 1572864;
            i5 |= i9;
            i10 = i4 & 64;
            if (i10 != 0) {
                if ((29360128 & i3) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i11;
                }
                if ((23967451 & i5) == 4793490) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp118 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j119 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen118 = companion.then(modifier3);
                    Integer numValueOf118 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf118) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1119 = ((i5 >> 9) & 14) | 3072;
                    Function1 function1111 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen118, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j119, sp118, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1119, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function1111;
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp119 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j1110 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen119 = companion.then(modifier3);
                    Integer numValueOf119 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf119) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i11110 = ((i5 >> 9) & 14) | 3072;
                    Function1 function1112 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen119, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1110, sp119, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11110, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function1112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
            }
            i5 |= 12582912;
            function2 = function1;
            if ((23967451 & i5) == 4793490) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                }
                long sp1110 = TextUnitKt.getSp(16);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                }
                long j1111 = j;
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Modifier modifierThen1110 = companion.then(modifier3);
                Integer numValueOf1110 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf1110) | composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i11111 = ((i5 >> 9) & 14) | 3072;
                Function1 function1113 = function3;
                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1110, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1111, sp1110, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11111, 0, 131056);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    constraintLayoutScope.getClass();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1113;
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                }
                long sp1111 = TextUnitKt.getSp(16);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                }
                long j1112 = j;
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Modifier modifierThen1111 = companion.then(modifier3);
                Integer numValueOf1111 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf1111) | composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i11112 = ((i5 >> 9) & 14) | 3072;
                Function1 function1114 = function3;
                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1111, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1112, sp1111, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11112, 0, 131056);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    constraintLayoutScope.getClass();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
        }
        i5 |= 3072;
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((57344 & i3) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((i4 & 16) != 0) {
                if ((458752 & i3) == 0) {
                    if (composerStartRestartGroup.changed(o0oo)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                if ((i4 & 32) != 0) {
                    if ((3670016 & i3) == 0) {
                        if (composerStartRestartGroup.changed(o0oo2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                        if ((29360128 & i3) == 0) {
                            function2 = function1;
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i5 |= i11;
                        }
                        if ((23967451 & i5) == 4793490) {
                            if (i6 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                            }
                            long sp1112 = TextUnitKt.getSp(16);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(-76785675);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-76785660);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                            }
                            long j1113 = j;
                            composerStartRestartGroup.endReplaceableGroup();
                            companion = Modifier.INSTANCE;
                            Modifier modifierThen1112 = companion.then(modifier3);
                            Integer numValueOf1112 = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(numValueOf1112) | composerStartRestartGroup.changed(function3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i11113 = ((i5 >> 9) & 14) | 3072;
                            Function1 function1115 = function3;
                            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1112, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1113, sp1112, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11113, 0, 131056);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(o0oo);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                constraintLayoutScope.getClass();
                                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2 = function1115;
                        } else {
                            if (i6 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                            }
                            long sp1113 = TextUnitKt.getSp(16);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(-76785675);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-76785660);
                                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                            }
                            long j1114 = j;
                            composerStartRestartGroup.endReplaceableGroup();
                            companion = Modifier.INSTANCE;
                            Modifier modifierThen1113 = companion.then(modifier3);
                            Integer numValueOf1113 = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(numValueOf1113) | composerStartRestartGroup.changed(function3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new o0O00OO(function3, i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i11114 = ((i5 >> 9) & 14) | 3072;
                            Function1 function1116 = function3;
                            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1113, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1114, sp1113, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11114, 0, 131056);
                            if (i2 == i) {
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(o0oo);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new o0O00OOO(o0oo);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                constraintLayoutScope.getClass();
                                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2 = function1116;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                    }
                    i5 |= 12582912;
                    function2 = function1;
                    if ((23967451 & i5) == 4793490) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp1114 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j1115 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen1114 = companion.then(modifier3);
                        Integer numValueOf1114 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf1114) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i11115 = ((i5 >> 9) & 14) | 3072;
                        Function1 function1117 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1114, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1115, sp1114, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11115, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function1117;
                    } else {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp1115 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j1116 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen1115 = companion.then(modifier3);
                        Integer numValueOf1115 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf1115) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i11116 = ((i5 >> 9) & 14) | 3072;
                        Function1 function1118 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1115, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1116, sp1115, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11116, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function1118;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                }
                i9 = 1572864;
                i5 |= i9;
                i10 = i4 & 64;
                if (i10 != 0) {
                    if ((29360128 & i3) == 0) {
                        function2 = function1;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i11;
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp1116 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j1117 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen1116 = companion.then(modifier3);
                        Integer numValueOf1116 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf1116) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i11117 = ((i5 >> 9) & 14) | 3072;
                        Function1 function1119 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1116, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1117, sp1116, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11117, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function1119;
                    } else {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp1117 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j1118 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen1117 = companion.then(modifier3);
                        Integer numValueOf1117 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf1117) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i11118 = ((i5 >> 9) & 14) | 3072;
                        Function1 function11110 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1117, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1118, sp1117, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11118, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function11110;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                }
                i5 |= 12582912;
                function2 = function1;
                if ((23967451 & i5) == 4793490) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp1118 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j1119 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen1118 = companion.then(modifier3);
                    Integer numValueOf1118 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf1118) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i11119 = ((i5 >> 9) & 14) | 3072;
                    Function1 function11111 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1118, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1119, sp1118, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11119, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function11111;
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp1119 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j11110 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen1119 = companion.then(modifier3);
                    Integer numValueOf1119 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf1119) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i111110 = ((i5 >> 9) & 14) | 3072;
                    Function1 function11112 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1119, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11110, sp1119, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111110, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function11112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
            }
            i8 = 196608;
            i5 |= i8;
            if ((i4 & 32) != 0) {
                if ((3670016 & i3) == 0) {
                    if (composerStartRestartGroup.changed(o0oo2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                    if ((29360128 & i3) == 0) {
                        function2 = function1;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i11;
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp11110 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j11111 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen11110 = companion.then(modifier3);
                        Integer numValueOf11110 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf11110) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i111111 = ((i5 >> 9) & 14) | 3072;
                        Function1 function11113 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11110, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11111, sp11110, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111111, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function11113;
                    } else {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp11111 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j11112 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen11111 = companion.then(modifier3);
                        Integer numValueOf11111 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf11111) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i111112 = ((i5 >> 9) & 14) | 3072;
                        Function1 function11114 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11111, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11112, sp11111, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111112, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function11114;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                }
                i5 |= 12582912;
                function2 = function1;
                if ((23967451 & i5) == 4793490) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp11112 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j11113 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen11112 = companion.then(modifier3);
                    Integer numValueOf11112 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf11112) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i111113 = ((i5 >> 9) & 14) | 3072;
                    Function1 function11115 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11112, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11113, sp11112, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111113, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function11115;
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp11113 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j11114 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen11113 = companion.then(modifier3);
                    Integer numValueOf11113 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf11113) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i111114 = ((i5 >> 9) & 14) | 3072;
                    Function1 function11116 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11113, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11114, sp11113, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111114, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function11116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
            }
            i9 = 1572864;
            i5 |= i9;
            i10 = i4 & 64;
            if (i10 != 0) {
                if ((29360128 & i3) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i11;
                }
                if ((23967451 & i5) == 4793490) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp11114 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j11115 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen11114 = companion.then(modifier3);
                    Integer numValueOf11114 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf11114) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i111115 = ((i5 >> 9) & 14) | 3072;
                    Function1 function11117 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11114, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11115, sp11114, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111115, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function11117;
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp11115 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j11116 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen11115 = companion.then(modifier3);
                    Integer numValueOf11115 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf11115) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i111116 = ((i5 >> 9) & 14) | 3072;
                    Function1 function11118 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11115, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11116, sp11115, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111116, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function11118;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
            }
            i5 |= 12582912;
            function2 = function1;
            if ((23967451 & i5) == 4793490) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                }
                long sp11116 = TextUnitKt.getSp(16);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                }
                long j11117 = j;
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Modifier modifierThen11116 = companion.then(modifier3);
                Integer numValueOf11116 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf11116) | composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i111117 = ((i5 >> 9) & 14) | 3072;
                Function1 function11119 = function3;
                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11116, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11117, sp11116, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111117, 0, 131056);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    constraintLayoutScope.getClass();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function11119;
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                }
                long sp11117 = TextUnitKt.getSp(16);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                }
                long j11118 = j;
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Modifier modifierThen11117 = companion.then(modifier3);
                Integer numValueOf11117 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf11117) | composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i111118 = ((i5 >> 9) & 14) | 3072;
                Function1 function111110 = function3;
                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11117, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11118, sp11117, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111118, 0, 131056);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    constraintLayoutScope.getClass();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function111110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
        }
        i5 |= 24576;
        modifier2 = modifier;
        if ((i4 & 16) != 0) {
            if ((458752 & i3) == 0) {
                if (composerStartRestartGroup.changed(o0oo)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
            }
            if ((i4 & 32) != 0) {
                if ((3670016 & i3) == 0) {
                    if (composerStartRestartGroup.changed(o0oo2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                    if ((29360128 & i3) == 0) {
                        function2 = function1;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i11;
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp11118 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j11119 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen11118 = companion.then(modifier3);
                        Integer numValueOf11118 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf11118) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i111119 = ((i5 >> 9) & 14) | 3072;
                        Function1 function111111 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11118, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j11119, sp11118, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i111119, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function111111;
                    } else {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                        }
                        long sp11119 = TextUnitKt.getSp(16);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(-76785675);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-76785660);
                            j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                        }
                        long j111110 = j;
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Modifier modifierThen11119 = companion.then(modifier3);
                        Integer numValueOf11119 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf11119) | composerStartRestartGroup.changed(function3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o0O00OO(function3, i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i1111110 = ((i5 >> 9) & 14) | 3072;
                        Function1 function111112 = function3;
                        TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen11119, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111110, sp11119, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111110, 0, 131056);
                        if (i2 == i) {
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o0oo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new o0O00OOO(o0oo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            constraintLayoutScope.getClass();
                            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function111112;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
                }
                i5 |= 12582912;
                function2 = function1;
                if ((23967451 & i5) == 4793490) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp111110 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j111111 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen111110 = companion.then(modifier3);
                    Integer numValueOf111110 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf111110) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1111111 = ((i5 >> 9) & 14) | 3072;
                    Function1 function111113 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111110, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111111, sp111110, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111111, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function111113;
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp111111 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j111112 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen111111 = companion.then(modifier3);
                    Integer numValueOf111111 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf111111) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1111112 = ((i5 >> 9) & 14) | 3072;
                    Function1 function111114 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111111, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111112, sp111111, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111112, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function111114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
            }
            i9 = 1572864;
            i5 |= i9;
            i10 = i4 & 64;
            if (i10 != 0) {
                if ((29360128 & i3) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i11;
                }
                if ((23967451 & i5) == 4793490) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp111112 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j111113 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen111112 = companion.then(modifier3);
                    Integer numValueOf111112 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf111112) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1111113 = ((i5 >> 9) & 14) | 3072;
                    Function1 function111115 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111112, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111113, sp111112, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111113, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function111115;
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp111113 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j111114 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen111113 = companion.then(modifier3);
                    Integer numValueOf111113 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf111113) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1111114 = ((i5 >> 9) & 14) | 3072;
                    Function1 function111116 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111113, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111114, sp111113, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111114, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function111116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
            }
            i5 |= 12582912;
            function2 = function1;
            if ((23967451 & i5) == 4793490) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                }
                long sp111114 = TextUnitKt.getSp(16);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                }
                long j111115 = j;
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Modifier modifierThen111114 = companion.then(modifier3);
                Integer numValueOf111114 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf111114) | composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1111115 = ((i5 >> 9) & 14) | 3072;
                Function1 function111117 = function3;
                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111114, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111115, sp111114, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111115, 0, 131056);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    constraintLayoutScope.getClass();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function111117;
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                }
                long sp111115 = TextUnitKt.getSp(16);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                }
                long j111116 = j;
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Modifier modifierThen111115 = companion.then(modifier3);
                Integer numValueOf111115 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf111115) | composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1111116 = ((i5 >> 9) & 14) | 3072;
                Function1 function111118 = function3;
                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111115, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111116, sp111115, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111116, 0, 131056);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    constraintLayoutScope.getClass();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function111118;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
        }
        i8 = 196608;
        i5 |= i8;
        if ((i4 & 32) != 0) {
            if ((3670016 & i3) == 0) {
                if (composerStartRestartGroup.changed(o0oo2)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
            }
            i10 = i4 & 64;
            if (i10 != 0) {
                if ((29360128 & i3) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i11;
                }
                if ((23967451 & i5) == 4793490) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp111116 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j111117 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen111116 = companion.then(modifier3);
                    Integer numValueOf111116 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf111116) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1111117 = ((i5 >> 9) & 14) | 3072;
                    Function1 function111119 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111116, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111117, sp111116, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111117, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function111119;
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                    }
                    long sp111117 = TextUnitKt.getSp(16);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(-76785675);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-76785660);
                        j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                    }
                    long j111118 = j;
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen111117 = companion.then(modifier3);
                    Integer numValueOf111117 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf111117) | composerStartRestartGroup.changed(function3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0O00OO(function3, i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1111118 = ((i5 >> 9) & 14) | 3072;
                    Function1 function1111110 = function3;
                    TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111117, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111118, sp111117, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111118, 0, 131056);
                    if (i2 == i) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o0oo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new o0O00OOO(o0oo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        constraintLayoutScope.getClass();
                        BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function1111110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
            }
            i5 |= 12582912;
            function2 = function1;
            if ((23967451 & i5) == 4793490) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                }
                long sp111118 = TextUnitKt.getSp(16);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                }
                long j111119 = j;
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Modifier modifierThen111118 = companion.then(modifier3);
                Integer numValueOf111118 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf111118) | composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1111119 = ((i5 >> 9) & 14) | 3072;
                Function1 function1111111 = function3;
                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111118, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j111119, sp111118, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i1111119, 0, 131056);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    constraintLayoutScope.getClass();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1111111;
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                }
                long sp111119 = TextUnitKt.getSp(16);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                }
                long j1111110 = j;
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Modifier modifierThen111119 = companion.then(modifier3);
                Integer numValueOf111119 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf111119) | composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i11111110 = ((i5 >> 9) & 14) | 3072;
                Function1 function1111112 = function3;
                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen111119, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1111110, sp111119, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11111110, 0, 131056);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    constraintLayoutScope.getClass();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1111112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
        }
        i9 = 1572864;
        i5 |= i9;
        i10 = i4 & 64;
        if (i10 != 0) {
            if ((29360128 & i3) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i5 |= i11;
            }
            if ((23967451 & i5) == 4793490) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                }
                long sp1111110 = TextUnitKt.getSp(16);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                }
                long j1111111 = j;
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Modifier modifierThen1111110 = companion.then(modifier3);
                Integer numValueOf1111110 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf1111110) | composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i11111111 = ((i5 >> 9) & 14) | 3072;
                Function1 function1111113 = function3;
                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1111110, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1111111, sp1111110, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11111111, 0, 131056);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    constraintLayoutScope.getClass();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1111113;
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
                }
                long sp1111111 = TextUnitKt.getSp(16);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(-76785675);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-76785660);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
                }
                long j1111112 = j;
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Modifier modifierThen1111111 = companion.then(modifier3);
                Integer numValueOf1111111 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf1111111) | composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0O00OO(function3, i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i11111112 = ((i5 >> 9) & 14) | 3072;
                Function1 function1111114 = function3;
                TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1111111, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1111112, sp1111111, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11111112, 0, 131056);
                if (i2 == i) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o0oo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o0O00OOO(o0oo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    constraintLayoutScope.getClass();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1111114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
        }
        i5 |= 12582912;
        function2 = function1;
        if ((23967451 & i5) == 4793490) {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i10 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
            }
            long sp1111112 = TextUnitKt.getSp(16);
            if (i2 == i) {
                composerStartRestartGroup.startReplaceableGroup(-76785675);
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-76785660);
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
            }
            long j1111113 = j;
            composerStartRestartGroup.endReplaceableGroup();
            companion = Modifier.INSTANCE;
            Modifier modifierThen1111112 = companion.then(modifier3);
            Integer numValueOf1111112 = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(numValueOf1111112) | composerStartRestartGroup.changed(function3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new o0O00OO(function3, i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new o0O00OO(function3, i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i11111113 = ((i5 >> 9) & 14) | 3072;
            Function1 function1111115 = function3;
            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1111112, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1111113, sp1111112, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11111113, 0, 131056);
            if (i2 == i) {
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(o0oo);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new o0O00OOO(o0oo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new o0O00OOO(o0oo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                constraintLayoutScope.getClass();
                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function1111115;
        } else {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i10 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585856357, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.TitleItemView (MomentCommentDialog.kt:265)");
            }
            long sp1111113 = TextUnitKt.getSp(16);
            if (i2 == i) {
                composerStartRestartGroup.startReplaceableGroup(-76785675);
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-76785660);
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O;
            }
            long j1111114 = j;
            composerStartRestartGroup.endReplaceableGroup();
            companion = Modifier.INSTANCE;
            Modifier modifierThen1111113 = companion.then(modifier3);
            Integer numValueOf1111113 = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(numValueOf1111113) | composerStartRestartGroup.changed(function3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new o0O00OO(function3, i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new o0O00OO(function3, i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i11111114 = ((i5 >> 9) & 14) | 3072;
            Function1 function1111116 = function3;
            TextKt.m1261Text4IGK_g(str, o0O0O00.OooO0O0(modifierThen1111113, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j1111114, sp1111113, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i11111114, 0, 131056);
            if (i2 == i) {
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(o0oo);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new o0O00OOO(o0oo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new o0O00OOO(o0oo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                constraintLayoutScope.getClass();
                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(ConstraintLayoutScope.OooO00o(companion, o0oo2, (Function1) objRememberedValue2), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 7, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function1111116;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0Ooo(o0Var, constraintLayoutScope, i, i2, str, modifier3, o0oo, o0oo2, function2, i3, i4));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(int i, int i2, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        boolean zChanged;
        Object objRememberedValue;
        Object objOooO00o;
        int i8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-174930084);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i5 = i3;
        }
        int i9 = i4 & 2;
        if (i9 == 0) {
            if ((i3 & 112) == 0) {
                i6 = i2;
                i5 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
            }
            if ((i5 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i9 != 0) {
                    i7 = 0;
                } else {
                    i7 = i6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-174930084, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.Content (MomentCommentDialog.kt:151)");
                }
                ScaffoldState scaffoldStateRememberScaffoldState = ScaffoldKt.rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                Integer numValueOf = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooO0o(i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(i7, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, (i5 >> 3) & 14, 2);
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                ScaffoldKt.m1172Scaffold27mzLpw(null, scaffoldStateRememberScaffoldState, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -649887967, true, new OooO00o(pagerStateRememberPagerState, coroutineScope)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 493484570, true, new OooO0O0(pagerStateRememberPagerState)), composerStartRestartGroup, 384, 12582912, 131065);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i8 = i7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i8 = i6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, i8, i3, i4));
        }
        i5 |= 48;
        i6 = i2;
        if ((i5 & 91) == 18) {
            if (i9 != 0) {
                i7 = 0;
            } else {
                i7 = i6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-174930084, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.Content (MomentCommentDialog.kt:151)");
            }
            ScaffoldState scaffoldStateRememberScaffoldState2 = ScaffoldKt.rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
            Integer numValueOf2 = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO0o(i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO0o(i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            PagerState pagerStateRememberPagerState2 = PagerStateKt.rememberPagerState(i7, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, (i5 >> 3) & 14, 2);
            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            ScaffoldKt.m1172Scaffold27mzLpw(null, scaffoldStateRememberScaffoldState2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -649887967, true, new OooO00o(pagerStateRememberPagerState2, coroutineScope2)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 493484570, true, new OooO0O0(pagerStateRememberPagerState2)), composerStartRestartGroup, 384, 12582912, 131065);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i8 = i7;
        } else {
            if (i9 != 0) {
                i7 = 0;
            } else {
                i7 = i6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-174930084, i5, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.Content (MomentCommentDialog.kt:151)");
            }
            ScaffoldState scaffoldStateRememberScaffoldState3 = ScaffoldKt.rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
            Integer numValueOf3 = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO0o(i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO0o(i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            PagerState pagerStateRememberPagerState3 = PagerStateKt.rememberPagerState(i7, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, (i5 >> 3) & 14, 2);
            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            ScaffoldKt.m1172Scaffold27mzLpw(null, scaffoldStateRememberScaffoldState3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -649887967, true, new OooO00o(pagerStateRememberPagerState3, coroutineScope3)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 493484570, true, new OooO0O0(pagerStateRememberPagerState3)), composerStartRestartGroup, 384, 12582912, 131065);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i8 = i7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, i8, i3, i4));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1983119286);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983119286, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialog.ShowAnimation (MomentCommentDialog.kt:91)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(MomentCommentsVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentCommentsVM momentCommentsVM = (MomentCommentsVM) viewModel2;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            com.code.android.util.OooOO0.OooO00o(o0OOo000.f48158OooOoO0, momentVideoVM.getShowDialogComment().getValue().booleanValue(), null, null, null, new OooO(momentCommentsVM, momentVideoVM), composerStartRestartGroup, 0, 28);
            AnimatedVisibilityKt.AnimatedVisibility(momentVideoVM.getShowDialogComment().getValue().booleanValue(), SemanticsModifierKt.semantics$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), false, OooOO0.f53638OooO0Oo, 1, null), EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(300, 0, null, 6, null), OooOO0O.f53639OooO0Oo), EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween$default(300, 0, null, 6, null), OooOOO0.f53642OooO0Oo), (String) null, o00Oo00.f53651OooO0OO, composerStartRestartGroup, 200064, 16);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i));
    }
}
