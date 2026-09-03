package p411o0Oo0oO0;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.code.android.util.o000O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nComposePreview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposePreview.kt\ncom/yalla/yalla/developer/ComposePreview\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,169:1\n76#2:170\n76#2:171\n*S KotlinDebug\n*F\n+ 1 ComposePreview.kt\ncom/yalla/yalla/developer/ComposePreview\n*L\n34#1:170\n56#1:171\n*E\n"})
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo0o0Oo f45253OooO00o = new oo0o0Oo();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f45255OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f45255OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f45255OooO0o0 | 1);
            oo0o0Oo.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static boolean OooO0O0(@Nullable Composer composer) {
        composer.startReplaceableGroup(-1800107778);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1800107778, 6, -1, "com.yalla.yalla.developer.ComposePreview.isNotBridgeContext (ComposePreview.kt:54)");
        }
        if (Intrinsics.areEqual(o0OoOo0.OooO00o((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())), "BridgeContext")) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return true;
    }

    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1241468292);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1241468292, i, -1, "com.yalla.yalla.developer.ComposePreview.initBefore (ComposePreview.kt:32)");
            }
            Context context = o000O0.f10354OooO00o;
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNullParameter(context2, "<set-?>");
            o000O0.f10354OooO00o = context2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i));
    }
}
