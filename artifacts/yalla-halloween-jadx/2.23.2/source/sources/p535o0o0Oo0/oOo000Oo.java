package p535o0o0Oo0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414o0Oo0oO.oO00O0o0;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o00O000;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentRewardFirstTimePop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentRewardFirstTimePop.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentRewardFirstTimePop\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,81:1\n81#2,11:82\n76#3:93\n25#4:94\n25#4:101\n1097#5,6:95\n1097#5,6:102\n81#6:108\n107#6,2:109\n*S KotlinDebug\n*F\n+ 1 MomentRewardFirstTimePop.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentRewardFirstTimePop\n*L\n41#1:82,11\n46#1:93\n47#1:94\n48#1:101\n47#1:95,6\n48#1:102,6\n48#1:108\n48#1:109,2\n*E\n"})
public final class oOo000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOo000Oo f54225OooO00o = new oOo000Oo();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54227OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f54227OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54227OooO0o0 | 1);
            oOo000Oo.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54228OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentVideoVM momentVideoVM) {
            super(0);
            this.f54228OooO0Oo = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO00O0o0 oo00o0o0OooO = o00Ooo.OooO();
            oo00o0o0OooO.getClass();
            oo00o0o0OooO.OooO0o("momentCommentRewardHintView" + o0O00oO0.OooOOo0().getValue(), true);
            this.f54228OooO0Oo.setShowRewardFirstLayout(null);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentRewardFirstTimePop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentRewardFirstTimePop.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentRewardFirstTimePop$Show$2$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,81:1\n154#2:82\n164#2:83\n154#2:84\n164#2:92\n154#2:128\n154#2:129\n36#3:85\n456#3,8:110\n464#3,3:124\n467#3,3:130\n1097#4,6:86\n66#5,6:93\n72#5:127\n76#5:134\n78#6,11:99\n91#6:133\n4144#7,6:118\n*S KotlinDebug\n*F\n+ 1 MomentRewardFirstTimePop.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentRewardFirstTimePop$Show$2$2\n*L\n60#1:82\n62#1:83\n62#1:84\n66#1:92\n73#1:128\n74#1:129\n63#1:85\n58#1:110,8\n58#1:124,3\n58#1:130,3\n63#1:86,6\n58#1:93,6\n58#1:127\n58#1:134\n58#1:99,11\n58#1:133\n58#1:118,6\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Drawable f54229OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<IntSize> f54230OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Drawable drawable, MutableState<IntSize> mutableState) {
            super(2);
            this.f54229OooO0Oo = drawable;
            this.f54230OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-153390500, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.MomentRewardFirstTimePop.Show.<anonymous>.<anonymous> (MomentRewardFirstTimePop.kt:57)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM512heightInVpY3zN4 = SizeKt.m512heightInVpY3zN4(o00O000.OooO00o(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3775constructorimpl(32), 0.0f, 11, null), this.f54229OooO0Oo, composer2, 70), Dp.m3775constructorimpl((float) 78.5d), Dp.m3775constructorimpl(168));
                composer2.startReplaceableGroup(1157296644);
                MutableState<IntSize> mutableState = this.f54230OooO0o0;
                boolean zChanged = composer2.changed(mutableState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new oOo0000O(mutableState);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierM530width3ABfNKs = SizeKt.m530width3ABfNKs(OnRemeasuredModifierKt.onSizeChanged(modifierM512heightInVpY3zN4, (Function1) objRememberedValue), Dp.m3775constructorimpl((float) 170.5d));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM530width3ABfNKs);
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
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f = 16;
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.post_reward_first_time_content, composer2, 0), SizeKt.fillMaxWidth$default(PaddingKt.m478padding3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 7, null), Dp.m3775constructorimpl(f)), 0.0f, 1, null), o0OOo000.f48278o000oo0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54232OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f54232OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54232OooO0o0 | 1);
            oOo000Oo.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1017552036);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1017552036, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentRewardFirstTimePop.Show (MomentRewardFirstTimePop.kt:39)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
            if (o00Ooo.OooO().OooOO0O()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i));
                return;
            }
            LayoutCoordinates showRewardFirstLayout = momentVideoVM.getShowRewardFirstLayout();
            Rect rectBoundsInWindow = showRewardFirstLayout != null ? LayoutCoordinatesKt.boundsInWindow(showRewardFirstLayout) : null;
            if (rectBoundsInWindow != null) {
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    int i2 = o0Oo0oo.icon_bg_send_reward_first_time;
                    Object obj = ContextCompat.f5281OooO00o;
                    objRememberedValue = ContextCompat.OooO0OO.OooO0O0(context, i2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Drawable drawable = (Drawable) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3927boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue2;
                AndroidPopup_androidKt.m4014PopupK5zGePQ(Alignment.INSTANCE.getTopStart(), IntOffsetKt.IntOffset((int) Offset.m1447getXimpl(rectBoundsInWindow.m1481getTopCenterF1C5BW0()), ((int) Offset.m1448getYimpl(rectBoundsInWindow.m1481getTopCenterF1C5BW0())) - o0OoOo0.OooO0o0(0, Integer.valueOf(IntSize.m3934getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue())))), new OooO0O0(momentVideoVM), new PopupProperties(true, true, true, null, false, false, 56, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -153390500, true, new OooO0OO(drawable, mutableState)), composerStartRestartGroup, 27654, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0o(i));
    }
}
