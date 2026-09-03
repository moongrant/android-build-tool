package p587o0oOooOO;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o0O0ooO;
import p562o0oOo000.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFrameAnim.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameAnim.kt\ncom/yalla/yalla/ui/view/FrameAnimKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,22:1\n154#2:23\n*S KotlinDebug\n*F\n+ 1 FrameAnim.kt\ncom/yalla/yalla/ui/view/FrameAnimKt\n*L\n20#1:23\n*E\n"})
public final class x {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f57014OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f57015OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Modifier modifier, int i) {
            super(2);
            this.f57014OooO0Oo = modifier;
            this.f57015OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f57015OooO0o0 | 1);
            x.OooO00o(this.f57014OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(106580789);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(106580789, i2, -1, "com.yalla.yalla.ui.view.LoadingHorseGreen (FrameAnim.kt:14)");
            }
            o0O0ooO.OooO00o(o00oO0o.anim_loading_horse_green, 1000L, ContentScale.INSTANCE.getCrop(), 0, null, null, null, SizeKt.m527sizeVpY3zN4(Modifier.INSTANCE.then(modifier), Dp.m3775constructorimpl(90), Dp.m3775constructorimpl(55)), composerStartRestartGroup, 432, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier, i));
    }
}
