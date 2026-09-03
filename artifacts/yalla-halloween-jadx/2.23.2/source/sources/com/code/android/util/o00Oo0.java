package com.code.android.util;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLifeCycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifeCycleEffect.kt\ncom/code/android/util/LifeCycleEffectKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,53:1\n76#2:54\n76#2:63\n50#3:55\n49#3:56\n67#3,3:64\n66#3:67\n1097#4,6:57\n1097#4,6:68\n81#5:74\n81#5:75\n81#5:76\n81#5:77\n*S KotlinDebug\n*F\n+ 1 LifeCycleEffect.kt\ncom/code/android/util/LifeCycleEffectKt\n*L\n18#1:54\n39#1:63\n19#1:55\n19#1:56\n40#1:64,3\n40#1:67\n19#1:57,6\n40#1:68,6\n17#1:74\n18#1:75\n38#1:76\n39#1:77\n*E\n"})
public final class o00Oo0 {

    @SourceDebugExtension({"SMAP\nLifeCycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifeCycleEffect.kt\ncom/code/android/util/LifeCycleEffectKt$LifecycleEffect$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,53:1\n63#2,5:54\n*S KotlinDebug\n*F\n+ 1 LifeCycleEffect.kt\ncom/code/android/util/LifeCycleEffectKt$LifecycleEffect$1$1\n*L\n25#1:54,5\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<LifecycleOwner> f13441OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Lifecycle.Event, Unit>> f13442OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(State<? extends LifecycleOwner> state, State<? extends Function1<? super Lifecycle.Event, Unit>> state2) {
            super(1);
            this.f13441OooO0Oo = state;
            this.f13442OooO0o0 = state2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            Lifecycle lifecycle = this.f13441OooO0Oo.getValue().getLifecycle();
            final State<Function1<Lifecycle.Event, Unit>> state = this.f13442OooO0o0;
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.code.android.util.LifeCycleEffectKt$LifecycleEffect$1$1$observer$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    state.getValue().invoke(event);
                }
            };
            lifecycle.addObserver(lifecycleEventObserver);
            return new o00O0O(lifecycle, lifecycleEventObserver);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Lifecycle.Event, Unit> f13443OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f13444OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super Lifecycle.Event, Unit> function1, int i) {
            super(2);
            this.f13443OooO0Oo = function1;
            this.f13444OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f13444OooO0o0 | 1);
            o00Oo0.OooO0O0(this.f13443OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLifeCycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifeCycleEffect.kt\ncom/code/android/util/LifeCycleEffectKt$LifecycleEffect$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,53:1\n63#2,5:54\n*S KotlinDebug\n*F\n+ 1 LifeCycleEffect.kt\ncom/code/android/util/LifeCycleEffectKt$LifecycleEffect$3$1\n*L\n48#1:54,5\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<LifecycleOwner> f13445OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ State<Function0<Unit>> f13446OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.Event f13447OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(State<? extends LifecycleOwner> state, Lifecycle.Event event, State<? extends Function0<Unit>> state2) {
            super(1);
            this.f13445OooO0Oo = state;
            this.f13447OooO0o0 = event;
            this.f13446OooO0o = state2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            Lifecycle lifecycle = this.f13445OooO0Oo.getValue().getLifecycle();
            final Lifecycle.Event event = this.f13447OooO0o0;
            final State<Function0<Unit>> state = this.f13446OooO0o;
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.code.android.util.LifeCycleEffectKt$LifecycleEffect$3$1$observer$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event innerEvent) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
                    if (event == innerEvent) {
                        state.getValue().invoke();
                    }
                }
            };
            lifecycle.addObserver(lifecycleEventObserver);
            return new o00Ooo(lifecycle, lifecycleEventObserver);
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.Event f13448OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f13449OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f13450OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Lifecycle.Event event, Function0<Unit> function0, int i) {
            super(2);
            this.f13448OooO0Oo = event;
            this.f13450OooO0o0 = function0;
            this.f13449OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f13449OooO0o | 1);
            o00Oo0.OooO00o(this.f13448OooO0Oo, this.f13450OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(@NotNull Lifecycle.Event event, @NotNull Function0<Unit> onEvent, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1936090789);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(event) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEvent) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1936090789, i2, -1, "com.code.android.util.LifecycleEffect (LifeCycleEffect.kt:36)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onEvent, composerStartRestartGroup, (i2 >> 3) & 14);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), composerStartRestartGroup, 8);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) stateRememberUpdatedState2.getValue();
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState2) | composerStartRestartGroup.changed(event) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO0OO(stateRememberUpdatedState2, event, stateRememberUpdatedState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(event, onEvent, i));
    }

    @Composable
    public static final void OooO0O0(@NotNull Function1<? super Lifecycle.Event, Unit> onEvent, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1786158290);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onEvent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1786158290, i2, -1, "com.code.android.util.LifecycleEffect (LifeCycleEffect.kt:15)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onEvent, composerStartRestartGroup, i2 & 14);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), composerStartRestartGroup, 8);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) stateRememberUpdatedState2.getValue();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState2) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO00o(stateRememberUpdatedState2, stateRememberUpdatedState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(onEvent, i));
    }
}
