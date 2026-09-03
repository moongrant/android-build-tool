package com.code.android.uikit.swiprefresh;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p201o00o0Ooo.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSwipeRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeRefresh.kt\ncom/code/android/uikit/swiprefresh/SwipeRefreshKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,63:1\n154#2:64\n154#2:65\n*S KotlinDebug\n*F\n+ 1 SwipeRefresh.kt\ncom/code/android/uikit/swiprefresh/SwipeRefreshKt\n*L\n32#1:64\n49#1:65\n*E\n"})
public final class OooO0o {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f13290OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f13291OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RefreshState.State f13292OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f13293OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BoxScope boxScope, RefreshState.State state, float f, int i) {
            super(2);
            this.f13290OooO0Oo = boxScope;
            this.f13292OooO0o0 = state;
            this.f13291OooO0o = f;
            this.f13293OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f13293OooO0oO | 1);
            RefreshState.State state = this.f13292OooO0o0;
            float f = this.f13291OooO0o;
            OooO0o.OooO00o(this.f13290OooO0Oo, state, f, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f13294OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f13295OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RefreshState.State f13296OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f13297OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, RefreshState.State state, float f, int i) {
            super(2);
            this.f13294OooO0Oo = boxScope;
            this.f13296OooO0o0 = state;
            this.f13295OooO0o = f;
            this.f13297OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f13297OooO0oO | 1);
            RefreshState.State state = this.f13296OooO0o0;
            float f = this.f13295OooO0o;
            OooO0o.OooO00o(this.f13294OooO0Oo, state, f, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f13298OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RefreshState f13299OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LazyListState f13300OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f13301OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f13302OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f13303OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f13304OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f13305OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(RefreshState refreshState, Function0<Unit> function0, LazyListState lazyListState, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f13299OooO0Oo = refreshState;
            this.f13301OooO0o0 = function0;
            this.f13300OooO0o = lazyListState;
            this.f13302OooO0oO = modifier;
            this.f13303OooO0oo = z;
            this.f13298OooO = function2;
            this.f13304OooOO0 = i;
            this.f13305OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0o.OooO0O0(this.f13299OooO0Oo, this.f13301OooO0o0, this.f13300OooO0o, this.f13302OooO0oO, this.f13303OooO0oo, this.f13298OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13304OooOO0 | 1), this.f13305OooOO0O);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull BoxScope RefreshIndicator, @NotNull RefreshState.State state, float f, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(RefreshIndicator, "$this$RefreshIndicator");
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1181610020);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(RefreshIndicator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 651) == 130 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1181610020, i2, -1, "com.code.android.uikit.swiprefresh.RefreshIndicator (SwipeRefresh.kt:44)");
            }
            if (f <= 0.0f) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(RefreshIndicator, state, f, i));
                return;
            }
            o0oOO.OooO00o(RefreshIndicator.align(SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(60)), 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter()), com.code.android.uikit.swiprefresh.OooO00o.f13236OooO0O0, composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(RefreshIndicator, state, f, i));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO0O0(@NotNull RefreshState refreshState, @NotNull Function0<Unit> onRefresh, @Nullable LazyListState lazyListState, @Nullable Modifier modifier, boolean z, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshState, "refreshState");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1674047613);
        LazyListState lazyListState2 = (i2 & 4) != 0 ? null : lazyListState;
        Modifier modifier2 = (i2 & 8) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 16) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1674047613, i, -1, "com.code.android.uikit.swiprefresh.SwipeRefresh (SwipeRefresh.kt:24)");
        }
        int i3 = i << 3;
        com.code.android.uikit.swiprefresh.OooO0O0.OooO0O0(refreshState, Dp.m3775constructorimpl(60), onRefresh, modifier2, lazyListState2, z2, false, 3.5f, 400L, 400L, com.code.android.uikit.swiprefresh.OooO00o.f13235OooO00o, content, composerStartRestartGroup, (i3 & 896) | 920125496 | (i & 7168) | ((i << 6) & 57344) | (i3 & 458752), ((i >> 12) & 112) | 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(refreshState, onRefresh, lazyListState2, modifier2, z2, content, i, i2));
    }
}
