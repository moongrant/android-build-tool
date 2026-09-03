package p539o0o0OoOO;

import android.content.DialogInterface;
import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nBottomSheetDialogProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogPropertiesKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,594:1\n76#2:595\n76#2:596\n76#2:597\n50#3:598\n49#3:599\n456#3,8:617\n464#3,6:631\n1097#4,6:600\n78#5,11:606\n91#5:637\n4144#6,6:625\n81#7:638\n*S KotlinDebug\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogPropertiesKt\n*L\n267#1:595\n268#1:596\n269#1:597\n273#1:598\n273#1:599\n567#1:617,8\n567#1:631,6\n273#1:600,6\n567#1:606,11\n567#1:637\n567#1:625,6\n271#1:638\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f55509OooO00o = ColorKt.Color$default(0.0f, 0.0f, 0.0f, 0.3f, null, 16, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f55510OooO0O0 = OooO00o.f55512OooO0Oo;

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Function2<Composer, Integer, Unit>> f55511OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
            super(2);
            this.f55511OooO0Oo = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-965248797, iIntValue, -1, "com.yalla.yalla.ui.view.BottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (BottomSheetDialogProperties.kt:281)");
                }
                d0.OooO0O0(SemanticsModifierKt.semantics$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer2, 0, 1), null, 2, null), false, f0.f55536OooO0Oo, 1, null), ComposableLambdaKt.composableLambda(composer2, 434559869, true, new g0(this.f55511OooO0Oo)), composer2, 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Color, Color> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55512OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Color invoke(Color color) {
            return Color.m1660boximpl(ColorKt.m1715compositeOverOWjLjI(d0.f55509OooO00o, color.m1680unboximpl()));
        }
    }

    @SourceDebugExtension({"SMAP\nBottomSheetDialogProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogPropertiesKt$BottomSheetDialog$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,594:1\n63#2,5:595\n*S KotlinDebug\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogPropertiesKt$BottomSheetDialog$1\n*L\n301#1:595,5\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.view.OooO0O0 f55513OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(com.yalla.yalla.ui.view.OooO0O0 oooO0O0) {
            super(1);
            this.f55513OooO0Oo = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            com.yalla.yalla.ui.view.OooO0O0 oooO0O0 = this.f55513OooO0Oo;
            oooO0O0.show();
            return new e0(oooO0O0);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.view.OooO0O0 f55514OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.view.OooO00o f55515OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55516OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f55517OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(com.yalla.yalla.ui.view.OooO0O0 oooO0O0, Function0<Unit> function0, com.yalla.yalla.ui.view.OooO00o oooO00o, LayoutDirection layoutDirection) {
            super(0);
            this.f55514OooO0Oo = oooO0O0;
            this.f55516OooO0o0 = function0;
            this.f55515OooO0o = oooO00o;
            this.f55517OooO0oO = layoutDirection;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55514OooO0Oo.OooOO0(this.f55516OooO0o0, this.f55515OooO0o, this.f55517OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f55518OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55519OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.view.OooO00o f55520OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55521OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f55522OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f55523OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function0<Unit> function0, Function0<Unit> function1, com.yalla.yalla.ui.view.OooO00o oooO00o, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f55519OooO0Oo = function0;
            this.f55521OooO0o0 = function1;
            this.f55520OooO0o = oooO00o;
            this.f55522OooO0oO = function2;
            this.f55523OooO0oo = i;
            this.f55518OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            d0.OooO00o(this.f55519OooO0Oo, this.f55521OooO0o0, this.f55520OooO0o, this.f55522OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55523OooO0oo | 1), this.f55518OooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55524OooO0Oo;

        public OooOO0(Function0<Unit> function0) {
            this.f55524OooO0Oo = function0;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            Function0<Unit> function0 = this.f55524OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<UUID> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f55525OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public /* synthetic */ class OooOOO0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0118  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@NotNull Function0<Unit> onDismissRequest, @Nullable Function0<Unit> function0, @Nullable com.yalla.yalla.ui.view.OooO00o oooO00o, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2) {
        int i3;
        Function0<Unit> function1;
        int i4;
        com.yalla.yalla.ui.view.OooO00o oooO00o2;
        int i5;
        int i6;
        View view;
        Density density;
        LayoutDirection layoutDirection;
        CompositionContext parent;
        State stateRememberUpdatedState;
        UUID dialogId;
        boolean zChanged;
        Function0<Unit> function2;
        Object obj;
        Composer composer2;
        com.yalla.yalla.ui.view.OooO00o oooO00o3;
        Function0<Unit> function3;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1629576086);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                function1 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    oooO00o2 = oooO00o;
                    if (composerStartRestartGroup.changed(oooO00o2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i6;
                }
                if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        function1 = null;
                    }
                    if (i4 != 0) {
                        oooO00o2 = new com.yalla.yalla.ui.view.OooO00o(false, null, 127);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1629576086, i3, -1, "com.yalla.yalla.ui.view.BottomSheetDialog (BottomSheetDialogProperties.kt:260)");
                    }
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    parent = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i3 >> 9) & 14);
                    dialogId = (UUID) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOO0O.f55525OooO0Oo, composerStartRestartGroup, 3080, 6);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(view) | composerStartRestartGroup.changed(density);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                        function2 = function1;
                        Composer composer4 = composerStartRestartGroup;
                        com.yalla.yalla.ui.view.OooO0O0 oooO0O0 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                        ComposableLambda content2 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                        Intrinsics.checkNotNullParameter(parent, "parentComposition");
                        Intrinsics.checkNotNullParameter(content2, "children");
                        c0 c0Var = oooO0O0.f30523OooOo00;
                        c0Var.getClass();
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        Intrinsics.checkNotNullParameter(content2, "content");
                        c0Var.setParentCompositionContext(parent);
                        c0Var.f55471OooO0Oo.setValue(content2);
                        c0Var.f55472OooO0o0 = true;
                        c0Var.createComposition();
                        oooO0O0.setOnDismissListener(new OooOO0(function2));
                        composer4.updateRememberedValue(oooO0O0);
                        composer2 = composer4;
                        obj = oooO0O0;
                    } else {
                        function2 = function1;
                        composer2 = composerStartRestartGroup;
                        obj = objRememberedValue;
                    }
                    composer2.endReplaceableGroup();
                    com.yalla.yalla.ui.view.OooO0O0 oooO0O1 = (com.yalla.yalla.ui.view.OooO0O0) obj;
                    EffectsKt.DisposableEffect(oooO0O1, new OooO0O0(oooO0O1), composer2, 8);
                    EffectsKt.SideEffect(new OooO0OO(oooO0O1, onDismissRequest, oooO00o2, layoutDirection), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    oooO00o3 = oooO00o2;
                    function3 = function2;
                    composer3 = composer2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function3 = function1;
                    oooO00o3 = oooO00o2;
                    composer3 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(onDismissRequest, function3, oooO00o3, content, i, i2));
            }
            i3 |= 384;
            oooO00o2 = oooO00o;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    function1 = null;
                }
                if (i4 != 0) {
                    oooO00o2 = new com.yalla.yalla.ui.view.OooO00o(false, null, 127);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1629576086, i3, -1, "com.yalla.yalla.ui.view.BottomSheetDialog (BottomSheetDialogProperties.kt:260)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                parent = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i3 >> 9) & 14);
                dialogId = (UUID) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOO0O.f55525OooO0Oo, composerStartRestartGroup, 3080, 6);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(view) | composerStartRestartGroup.changed(density);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    function2 = function1;
                    Composer composer5 = composerStartRestartGroup;
                    com.yalla.yalla.ui.view.OooO0O0 oooO0O2 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                    ComposableLambda content3 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                    Intrinsics.checkNotNullParameter(parent, "parentComposition");
                    Intrinsics.checkNotNullParameter(content3, "children");
                    c0 c0Var2 = oooO0O2.f30523OooOo00;
                    c0Var2.getClass();
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(content3, "content");
                    c0Var2.setParentCompositionContext(parent);
                    c0Var2.f55471OooO0Oo.setValue(content3);
                    c0Var2.f55472OooO0o0 = true;
                    c0Var2.createComposition();
                    oooO0O2.setOnDismissListener(new OooOO0(function2));
                    composer5.updateRememberedValue(oooO0O2);
                    composer2 = composer5;
                    obj = oooO0O2;
                } else {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    function2 = function1;
                    Composer composer6 = composerStartRestartGroup;
                    com.yalla.yalla.ui.view.OooO0O0 oooO0O3 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                    ComposableLambda content4 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                    Intrinsics.checkNotNullParameter(parent, "parentComposition");
                    Intrinsics.checkNotNullParameter(content4, "children");
                    c0 c0Var3 = oooO0O3.f30523OooOo00;
                    c0Var3.getClass();
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(content4, "content");
                    c0Var3.setParentCompositionContext(parent);
                    c0Var3.f55471OooO0Oo.setValue(content4);
                    c0Var3.f55472OooO0o0 = true;
                    c0Var3.createComposition();
                    oooO0O3.setOnDismissListener(new OooOO0(function2));
                    composer6.updateRememberedValue(oooO0O3);
                    composer2 = composer6;
                    obj = oooO0O3;
                }
                composer2.endReplaceableGroup();
                com.yalla.yalla.ui.view.OooO0O0 oooO0O4 = (com.yalla.yalla.ui.view.OooO0O0) obj;
                EffectsKt.DisposableEffect(oooO0O4, new OooO0O0(oooO0O4), composer2, 8);
                EffectsKt.SideEffect(new OooO0OO(oooO0O4, onDismissRequest, oooO00o2, layoutDirection), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                oooO00o3 = oooO00o2;
                function3 = function2;
                composer3 = composer2;
            } else {
                if (i7 != 0) {
                    function1 = null;
                }
                if (i4 != 0) {
                    oooO00o2 = new com.yalla.yalla.ui.view.OooO00o(false, null, 127);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1629576086, i3, -1, "com.yalla.yalla.ui.view.BottomSheetDialog (BottomSheetDialogProperties.kt:260)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                parent = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i3 >> 9) & 14);
                dialogId = (UUID) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOO0O.f55525OooO0Oo, composerStartRestartGroup, 3080, 6);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(view) | composerStartRestartGroup.changed(density);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    function2 = function1;
                    Composer composer7 = composerStartRestartGroup;
                    com.yalla.yalla.ui.view.OooO0O0 oooO0O5 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                    ComposableLambda content5 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                    Intrinsics.checkNotNullParameter(parent, "parentComposition");
                    Intrinsics.checkNotNullParameter(content5, "children");
                    c0 c0Var4 = oooO0O5.f30523OooOo00;
                    c0Var4.getClass();
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(content5, "content");
                    c0Var4.setParentCompositionContext(parent);
                    c0Var4.f55471OooO0Oo.setValue(content5);
                    c0Var4.f55472OooO0o0 = true;
                    c0Var4.createComposition();
                    oooO0O5.setOnDismissListener(new OooOO0(function2));
                    composer7.updateRememberedValue(oooO0O5);
                    composer2 = composer7;
                    obj = oooO0O5;
                } else {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    function2 = function1;
                    Composer composer8 = composerStartRestartGroup;
                    com.yalla.yalla.ui.view.OooO0O0 oooO0O6 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                    ComposableLambda content6 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                    Intrinsics.checkNotNullParameter(parent, "parentComposition");
                    Intrinsics.checkNotNullParameter(content6, "children");
                    c0 c0Var5 = oooO0O6.f30523OooOo00;
                    c0Var5.getClass();
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(content6, "content");
                    c0Var5.setParentCompositionContext(parent);
                    c0Var5.f55471OooO0Oo.setValue(content6);
                    c0Var5.f55472OooO0o0 = true;
                    c0Var5.createComposition();
                    oooO0O6.setOnDismissListener(new OooOO0(function2));
                    composer8.updateRememberedValue(oooO0O6);
                    composer2 = composer8;
                    obj = oooO0O6;
                }
                composer2.endReplaceableGroup();
                com.yalla.yalla.ui.view.OooO0O0 oooO0O7 = (com.yalla.yalla.ui.view.OooO0O0) obj;
                EffectsKt.DisposableEffect(oooO0O7, new OooO0O0(oooO0O7), composer2, 8);
                EffectsKt.SideEffect(new OooO0OO(oooO0O7, onDismissRequest, oooO00o2, layoutDirection), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                oooO00o3 = oooO00o2;
                function3 = function2;
                composer3 = composer2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(onDismissRequest, function3, oooO00o3, content, i, i2));
        }
        i3 |= 48;
        function1 = function0;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                oooO00o2 = oooO00o;
                if (composerStartRestartGroup.changed(oooO00o2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    function1 = null;
                }
                if (i4 != 0) {
                    oooO00o2 = new com.yalla.yalla.ui.view.OooO00o(false, null, 127);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1629576086, i3, -1, "com.yalla.yalla.ui.view.BottomSheetDialog (BottomSheetDialogProperties.kt:260)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                parent = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i3 >> 9) & 14);
                dialogId = (UUID) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOO0O.f55525OooO0Oo, composerStartRestartGroup, 3080, 6);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(view) | composerStartRestartGroup.changed(density);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    function2 = function1;
                    Composer composer9 = composerStartRestartGroup;
                    com.yalla.yalla.ui.view.OooO0O0 oooO0O8 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                    ComposableLambda content7 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                    Intrinsics.checkNotNullParameter(parent, "parentComposition");
                    Intrinsics.checkNotNullParameter(content7, "children");
                    c0 c0Var6 = oooO0O8.f30523OooOo00;
                    c0Var6.getClass();
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(content7, "content");
                    c0Var6.setParentCompositionContext(parent);
                    c0Var6.f55471OooO0Oo.setValue(content7);
                    c0Var6.f55472OooO0o0 = true;
                    c0Var6.createComposition();
                    oooO0O8.setOnDismissListener(new OooOO0(function2));
                    composer9.updateRememberedValue(oooO0O8);
                    composer2 = composer9;
                    obj = oooO0O8;
                } else {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    function2 = function1;
                    Composer composer10 = composerStartRestartGroup;
                    com.yalla.yalla.ui.view.OooO0O0 oooO0O9 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                    ComposableLambda content8 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                    Intrinsics.checkNotNullParameter(parent, "parentComposition");
                    Intrinsics.checkNotNullParameter(content8, "children");
                    c0 c0Var7 = oooO0O9.f30523OooOo00;
                    c0Var7.getClass();
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(content8, "content");
                    c0Var7.setParentCompositionContext(parent);
                    c0Var7.f55471OooO0Oo.setValue(content8);
                    c0Var7.f55472OooO0o0 = true;
                    c0Var7.createComposition();
                    oooO0O9.setOnDismissListener(new OooOO0(function2));
                    composer10.updateRememberedValue(oooO0O9);
                    composer2 = composer10;
                    obj = oooO0O9;
                }
                composer2.endReplaceableGroup();
                com.yalla.yalla.ui.view.OooO0O0 oooO0O10 = (com.yalla.yalla.ui.view.OooO0O0) obj;
                EffectsKt.DisposableEffect(oooO0O10, new OooO0O0(oooO0O10), composer2, 8);
                EffectsKt.SideEffect(new OooO0OO(oooO0O10, onDismissRequest, oooO00o2, layoutDirection), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                oooO00o3 = oooO00o2;
                function3 = function2;
                composer3 = composer2;
            } else {
                if (i7 != 0) {
                    function1 = null;
                }
                if (i4 != 0) {
                    oooO00o2 = new com.yalla.yalla.ui.view.OooO00o(false, null, 127);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1629576086, i3, -1, "com.yalla.yalla.ui.view.BottomSheetDialog (BottomSheetDialogProperties.kt:260)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                parent = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i3 >> 9) & 14);
                dialogId = (UUID) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOO0O.f55525OooO0Oo, composerStartRestartGroup, 3080, 6);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(view) | composerStartRestartGroup.changed(density);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    function2 = function1;
                    Composer composer11 = composerStartRestartGroup;
                    com.yalla.yalla.ui.view.OooO0O0 oooO0O11 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                    ComposableLambda content9 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                    Intrinsics.checkNotNullParameter(parent, "parentComposition");
                    Intrinsics.checkNotNullParameter(content9, "children");
                    c0 c0Var8 = oooO0O11.f30523OooOo00;
                    c0Var8.getClass();
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(content9, "content");
                    c0Var8.setParentCompositionContext(parent);
                    c0Var8.f55471OooO0Oo.setValue(content9);
                    c0Var8.f55472OooO0o0 = true;
                    c0Var8.createComposition();
                    oooO0O11.setOnDismissListener(new OooOO0(function2));
                    composer11.updateRememberedValue(oooO0O11);
                    composer2 = composer11;
                    obj = oooO0O11;
                } else {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    function2 = function1;
                    Composer composer12 = composerStartRestartGroup;
                    com.yalla.yalla.ui.view.OooO0O0 oooO0O12 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                    ComposableLambda content10 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                    Intrinsics.checkNotNullParameter(parent, "parentComposition");
                    Intrinsics.checkNotNullParameter(content10, "children");
                    c0 c0Var9 = oooO0O12.f30523OooOo00;
                    c0Var9.getClass();
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(content10, "content");
                    c0Var9.setParentCompositionContext(parent);
                    c0Var9.f55471OooO0Oo.setValue(content10);
                    c0Var9.f55472OooO0o0 = true;
                    c0Var9.createComposition();
                    oooO0O12.setOnDismissListener(new OooOO0(function2));
                    composer12.updateRememberedValue(oooO0O12);
                    composer2 = composer12;
                    obj = oooO0O12;
                }
                composer2.endReplaceableGroup();
                com.yalla.yalla.ui.view.OooO0O0 oooO0O13 = (com.yalla.yalla.ui.view.OooO0O0) obj;
                EffectsKt.DisposableEffect(oooO0O13, new OooO0O0(oooO0O13), composer2, 8);
                EffectsKt.SideEffect(new OooO0OO(oooO0O13, onDismissRequest, oooO00o2, layoutDirection), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                oooO00o3 = oooO00o2;
                function3 = function2;
                composer3 = composer2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(onDismissRequest, function3, oooO00o3, content, i, i2));
        }
        i3 |= 384;
        oooO00o2 = oooO00o;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i6 = 2048;
            } else {
                i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) == 1170) {
            if (i7 != 0) {
                function1 = null;
            }
            if (i4 != 0) {
                oooO00o2 = new com.yalla.yalla.ui.view.OooO00o(false, null, 127);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1629576086, i3, -1, "com.yalla.yalla.ui.view.BottomSheetDialog (BottomSheetDialogProperties.kt:260)");
            }
            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            parent = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i3 >> 9) & 14);
            dialogId = (UUID) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOO0O.f55525OooO0Oo, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(view) | composerStartRestartGroup.changed(density);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                function2 = function1;
                Composer composer13 = composerStartRestartGroup;
                com.yalla.yalla.ui.view.OooO0O0 oooO0O14 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                ComposableLambda content11 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                Intrinsics.checkNotNullParameter(parent, "parentComposition");
                Intrinsics.checkNotNullParameter(content11, "children");
                c0 c0Var10 = oooO0O14.f30523OooOo00;
                c0Var10.getClass();
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(content11, "content");
                c0Var10.setParentCompositionContext(parent);
                c0Var10.f55471OooO0Oo.setValue(content11);
                c0Var10.f55472OooO0o0 = true;
                c0Var10.createComposition();
                oooO0O14.setOnDismissListener(new OooOO0(function2));
                composer13.updateRememberedValue(oooO0O14);
                composer2 = composer13;
                obj = oooO0O14;
            } else {
                Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                function2 = function1;
                Composer composer14 = composerStartRestartGroup;
                com.yalla.yalla.ui.view.OooO0O0 oooO0O15 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                ComposableLambda content12 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                Intrinsics.checkNotNullParameter(parent, "parentComposition");
                Intrinsics.checkNotNullParameter(content12, "children");
                c0 c0Var11 = oooO0O15.f30523OooOo00;
                c0Var11.getClass();
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(content12, "content");
                c0Var11.setParentCompositionContext(parent);
                c0Var11.f55471OooO0Oo.setValue(content12);
                c0Var11.f55472OooO0o0 = true;
                c0Var11.createComposition();
                oooO0O15.setOnDismissListener(new OooOO0(function2));
                composer14.updateRememberedValue(oooO0O15);
                composer2 = composer14;
                obj = oooO0O15;
            }
            composer2.endReplaceableGroup();
            com.yalla.yalla.ui.view.OooO0O0 oooO0O16 = (com.yalla.yalla.ui.view.OooO0O0) obj;
            EffectsKt.DisposableEffect(oooO0O16, new OooO0O0(oooO0O16), composer2, 8);
            EffectsKt.SideEffect(new OooO0OO(oooO0O16, onDismissRequest, oooO00o2, layoutDirection), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            oooO00o3 = oooO00o2;
            function3 = function2;
            composer3 = composer2;
        } else {
            if (i7 != 0) {
                function1 = null;
            }
            if (i4 != 0) {
                oooO00o2 = new com.yalla.yalla.ui.view.OooO00o(false, null, 127);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1629576086, i3, -1, "com.yalla.yalla.ui.view.BottomSheetDialog (BottomSheetDialogProperties.kt:260)");
            }
            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            parent = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i3 >> 9) & 14);
            dialogId = (UUID) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOO0O.f55525OooO0Oo, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(view) | composerStartRestartGroup.changed(density);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                function2 = function1;
                Composer composer15 = composerStartRestartGroup;
                com.yalla.yalla.ui.view.OooO0O0 oooO0O17 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                ComposableLambda content13 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                Intrinsics.checkNotNullParameter(parent, "parentComposition");
                Intrinsics.checkNotNullParameter(content13, "children");
                c0 c0Var12 = oooO0O17.f30523OooOo00;
                c0Var12.getClass();
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(content13, "content");
                c0Var12.setParentCompositionContext(parent);
                c0Var12.f55471OooO0Oo.setValue(content13);
                c0Var12.f55472OooO0o0 = true;
                c0Var12.createComposition();
                oooO0O17.setOnDismissListener(new OooOO0(function2));
                composer15.updateRememberedValue(oooO0O17);
                composer2 = composer15;
                obj = oooO0O17;
            } else {
                Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                function2 = function1;
                Composer composer16 = composerStartRestartGroup;
                com.yalla.yalla.ui.view.OooO0O0 oooO0O18 = new com.yalla.yalla.ui.view.OooO0O0(onDismissRequest, oooO00o2, view, layoutDirection, density, dialogId);
                ComposableLambda content14 = ComposableLambdaKt.composableLambdaInstance(-965248797, true, new OooO(stateRememberUpdatedState));
                Intrinsics.checkNotNullParameter(parent, "parentComposition");
                Intrinsics.checkNotNullParameter(content14, "children");
                c0 c0Var13 = oooO0O18.f30523OooOo00;
                c0Var13.getClass();
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(content14, "content");
                c0Var13.setParentCompositionContext(parent);
                c0Var13.f55471OooO0Oo.setValue(content14);
                c0Var13.f55472OooO0o0 = true;
                c0Var13.createComposition();
                oooO0O18.setOnDismissListener(new OooOO0(function2));
                composer16.updateRememberedValue(oooO0O18);
                composer2 = composer16;
                obj = oooO0O18;
            }
            composer2.endReplaceableGroup();
            com.yalla.yalla.ui.view.OooO0O0 oooO0O19 = (com.yalla.yalla.ui.view.OooO0O0) obj;
            EffectsKt.DisposableEffect(oooO0O19, new OooO0O0(oooO0O19), composer2, 8);
            EffectsKt.SideEffect(new OooO0OO(oooO0O19, onDismissRequest, oooO00o2, layoutDirection), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            oooO00o3 = oooO00o2;
            function3 = function2;
            composer3 = composer2;
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(onDismissRequest, function3, oooO00o3, content, i, i2));
    }

    public static final void OooO0O0(Modifier modifier, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-848385188);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-848385188, i3, -1, "com.yalla.yalla.ui.view.BottomSheetDialogLayout (BottomSheetDialogProperties.kt:562)");
            }
            h0 h0Var = h0.f55550OooO00o;
            int i5 = ((i3 >> 3) & 14) | ((i3 << 3) & 112);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i6 = ((i5 << 9) & 7168) | 6;
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
            Updater.m1316setimpl(composerM1309constructorimpl, h0Var, companion.getSetMeasurePolicy());
            Updater.m1316setimpl(composerM1309constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            androidx.compose.animation.OooOO0.OooO00o((i6 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new i0(modifier, function2, i, i2));
    }
}
