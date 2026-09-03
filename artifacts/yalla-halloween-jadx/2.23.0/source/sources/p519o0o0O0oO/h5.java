package p519o0o0O0oO;

import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p158o00OoOOO.oo000o;
import p408o0Oo0o0O.o00Oo0;
import p517o0o0O0o.OooOOOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nVipAddedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipAddedDialog.kt\ncom/yalla/yalla/ui/dialog/VipAddedDialog\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,66:1\n81#2,11:67\n36#3:78\n1097#4,6:79\n*S KotlinDebug\n*F\n+ 1 VipAddedDialog.kt\ncom/yalla/yalla/ui/dialog/VipAddedDialog\n*L\n28#1:67,11\n37#1:78\n37#1:79,6\n*E\n"})
public final class h5 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final h5 f52341OooO00o = new h5();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<VipLevel, Unit> f52343OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f52344OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52345OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52346OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(MutableState<Boolean> mutableState, Function1<? super VipLevel, Unit> function1, int i, int i2) {
            super(2);
            this.f52344OooO0o0 = mutableState;
            this.f52343OooO0o = function1;
            this.f52345OooO0oO = i;
            this.f52346OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            h5.this.OooO00o(this.f52344OooO0o0, this.f52343OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52345OooO0oO | 1), this.f52346OooO0oo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.VipAddedDialog$OnAddVip6Dialog$1", f = "VipAddedDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipAddedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipAddedDialog.kt\ncom/yalla/yalla/ui/dialog/VipAddedDialog$OnAddVip6Dialog$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,66:1\n67#2,5:67\n72#2:100\n76#2:106\n78#3,11:72\n91#3:105\n456#4,8:83\n464#4,3:97\n467#4,3:102\n4144#5,6:91\n154#6:101\n*S KotlinDebug\n*F\n+ 1 VipAddedDialog.kt\ncom/yalla/yalla/ui/dialog/VipAddedDialog$OnAddVip6Dialog$2\n*L\n45#1:67,5\n45#1:100\n45#1:106\n45#1:72,11\n45#1:105\n45#1:83,8\n45#1:97,3\n45#1:102,3\n45#1:91,6\n51#1:101\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipLevel f52347OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(VipLevel vipLevel) {
            super(3);
            this.f52347OooO0Oo = vipLevel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            ColumnScope TextDialog = columnScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(114092823, iIntValue, -1, "com.yalla.yalla.ui.dialog.VipAddedDialog.OnAddVip6Dialog.<anonymous> (VipAddedDialog.kt:43)");
                }
                Alignment center = Alignment.INSTANCE.getCenter();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                OooOOOO oooOOOO = OooOOOO.f51970OooO00o;
                OooOOOO.OooOo0O(Integer.valueOf(VipState.Vip.getValue()), Integer.valueOf(this.f52347OooO0Oo.getValue()), Dp.m3765constructorimpl(100), null, composer2, 265264, 20);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f52348OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(VipVm vipVm) {
            super(0);
            this.f52348OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00Oo0.OooOO0O().OooOOO0(VipLevel.Vip6.level());
            this.f52348OooO0Oo.getAddVip6Dialog().setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<VipLevel, Unit> f52349OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function1<? super VipLevel, Unit> function1) {
            super(0);
            this.f52349OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<VipLevel, Unit> function1 = this.f52349OooO0Oo;
            if (function1 != null) {
                function1.invoke(VipLevel.Vip6);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0151  */
    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull MutableState<Boolean> isShow, @Nullable Function1<? super VipLevel, Unit> function1, @Nullable Composer composer, int i, int i2) {
        int i3;
        Function1<? super VipLevel, Unit> function2;
        int i4;
        Function1<? super VipLevel, Unit> function3;
        VipLevel vipLevel;
        ViewModelStoreOwner current;
        CreationExtras defaultViewModelCreationExtras;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(isShow, "isShow");
        Composer composerStartRestartGroup = composer.startRestartGroup(-850401182);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (composerStartRestartGroup.changed(isShow) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                function2 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850401182, i4, -1, "com.yalla.yalla.ui.dialog.VipAddedDialog.OnAddVip6Dialog (VipAddedDialog.kt:25)");
                }
                vipLevel = VipLevel.Vip6;
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel(VipVm.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO00o(null), composerStartRestartGroup, 70);
                String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.add_vip6_dialog_title, composerStartRestartGroup, 0);
                String strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.add_vip6_dialog_content_XXX, composerStartRestartGroup, 0), String.valueOf(vipLevel.level()));
                String strOooO00o2 = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.add_vip6_dialog_button_XXXX, composerStartRestartGroup, 0), String.valueOf(vipLevel.level()));
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 114092823, true, new OooO0O0(vipLevel));
                OooO0OO oooO0OO = new OooO0OO((VipVm) viewModel);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooO0o(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1<? super VipLevel, Unit> function4 = function3;
                composer2 = composerStartRestartGroup;
                oo000o.OooO0Oo(isShow, strStringResource, strOooO00o, composableLambda, true, false, null, oooO0OO, strOooO00o2, false, null, false, (Function0) objRememberedValue, null, false, false, null, null, null, null, composer2, (i4 & 14) | 27648, 0, 1044064);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(isShow, function2, i, i2));
        }
        i3 |= 48;
        function2 = function1;
        i4 = i3;
        if ((i4 & 91) == 18) {
            if (i5 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850401182, i4, -1, "com.yalla.yalla.ui.dialog.VipAddedDialog.OnAddVip6Dialog (VipAddedDialog.kt:25)");
            }
            vipLevel = VipLevel.Vip6;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(VipVm.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO00o(null), composerStartRestartGroup, 70);
            String strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.add_vip6_dialog_title, composerStartRestartGroup, 0);
            String strOooO00o3 = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.add_vip6_dialog_content_XXX, composerStartRestartGroup, 0), String.valueOf(vipLevel.level()));
            String strOooO00o4 = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.add_vip6_dialog_button_XXXX, composerStartRestartGroup, 0), String.valueOf(vipLevel.level()));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 114092823, true, new OooO0O0(vipLevel));
            OooO0OO oooO0OO2 = new OooO0OO((VipVm) viewModel2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO0o(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO0o(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1<? super VipLevel, Unit> function5 = function3;
            composer2 = composerStartRestartGroup;
            oo000o.OooO0Oo(isShow, strStringResource2, strOooO00o3, composableLambda2, true, false, null, oooO0OO2, strOooO00o4, false, null, false, (Function0) objRememberedValue, null, false, false, null, null, null, null, composer2, (i4 & 14) | 27648, 0, 1044064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function5;
        } else {
            if (i5 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850401182, i4, -1, "com.yalla.yalla.ui.dialog.VipAddedDialog.OnAddVip6Dialog (VipAddedDialog.kt:25)");
            }
            vipLevel = VipLevel.Vip6;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel3 = ViewModelKt.viewModel(VipVm.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO00o(null), composerStartRestartGroup, 70);
            String strStringResource3 = StringResources_androidKt.stringResource(oO00OOo0.add_vip6_dialog_title, composerStartRestartGroup, 0);
            String strOooO00o5 = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.add_vip6_dialog_content_XXX, composerStartRestartGroup, 0), String.valueOf(vipLevel.level()));
            String strOooO00o6 = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.add_vip6_dialog_button_XXXX, composerStartRestartGroup, 0), String.valueOf(vipLevel.level()));
            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 114092823, true, new OooO0O0(vipLevel));
            OooO0OO oooO0OO3 = new OooO0OO((VipVm) viewModel3);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO0o(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO0o(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1<? super VipLevel, Unit> function6 = function3;
            composer2 = composerStartRestartGroup;
            oo000o.OooO0Oo(isShow, strStringResource3, strOooO00o5, composableLambda3, true, false, null, oooO0OO3, strOooO00o6, false, null, false, (Function0) objRememberedValue, null, false, false, null, null, null, null, composer2, (i4 & 14) | 27648, 0, 1044064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function6;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(isShow, function2, i, i2));
    }
}
