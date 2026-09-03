package p590o0oOooo0;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oo000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo000000 f57240OooO00o = new oo000000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f57241OooO0O0 = new MutableLiveData<>(Boolean.TRUE);

    public static final class OooO00o extends RecyclerView.o00O0O {
        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                oo000000 oo000000Var = oo000000.f57240OooO00o;
                oo000000.f57241OooO0O0.setValue(Boolean.TRUE);
            } else {
                if (i != 1) {
                    return;
                }
                oo000000 oo000000Var2 = oo000000.f57240OooO00o;
                oo000000.f57241OooO0O0.setValue(Boolean.FALSE);
            }
        }
    }

    @SourceDebugExtension({"SMAP\nLoginPopupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginPopupManager.kt\ncom/yalla/yalla/util/LoginPopupManager$register$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,45:1\n63#2,5:46\n*S KotlinDebug\n*F\n+ 1 LoginPopupManager.kt\ncom/yalla/yalla/util/LoginPopupManager$register$2\n*L\n37#1:46,5\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f57242OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            oo000000.f57241OooO0O0.setValue(Boolean.FALSE);
            return new oo00();
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f57244OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f57245OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(LazyListState lazyListState, int i) {
            super(2);
            this.f57245OooO0o0 = lazyListState;
            this.f57244OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f57244OooO0o | 1);
            oo000000.this.OooO00o(this.f57245OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static void OooO0O0(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.addOnScrollListener(new OooO00o());
    }

    @Composable
    public final void OooO00o(@Nullable LazyListState lazyListState, @Nullable Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-454553971);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454553971, i2, -1, "com.yalla.yalla.util.LoginPopupManager.register (LoginPopupManager.kt:31)");
            }
            boolean z = false;
            if (lazyListState != null && lazyListState.isScrollInProgress()) {
                z = true;
            }
            if (z) {
                EffectsKt.DisposableEffect(Unit.INSTANCE, OooO0O0.f57242OooO0Oo, composerStartRestartGroup, 54);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(lazyListState, i));
    }
}
