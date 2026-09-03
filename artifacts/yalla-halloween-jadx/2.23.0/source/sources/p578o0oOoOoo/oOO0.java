package p578o0oOoOoo;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p158o00OoOOO.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0 {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f56433OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56434OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f56433OooO0Oo = mutableState;
            this.f56434OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56434OooO0o0 | 1);
            oOO0.OooO00o(this.f56433OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull MutableState<Boolean> showMergingDialog, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(showMergingDialog, "showMergingDialog");
        Composer composerStartRestartGroup = composer.startRestartGroup(794003160);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(showMergingDialog) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(794003160, i2, -1, "com.yalla.yalla.module.media.dialog.CameraMergingLoadingDialog (CameraMergingLoadingDialog.kt:23)");
            }
            OooOOO0.OooO00o(showMergingDialog, false, false, null, null, 0, 0, 0.0f, oOO0O000.f56436OooO00o, composerStartRestartGroup, (i2 & 14) | 100663728, 248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(showMergingDialog, i));
    }
}
