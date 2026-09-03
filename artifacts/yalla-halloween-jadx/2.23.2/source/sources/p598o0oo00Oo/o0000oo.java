package p598o0oo00Oo;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLogerComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogerComp.kt\ncom/yalla/yalla/util/log/LogerComp\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,47:1\n25#2:48\n25#2:55\n25#2:62\n25#2:69\n25#2:76\n1097#3,6:49\n1097#3,6:56\n1097#3,6:63\n1097#3,6:70\n1097#3,6:77\n*S KotlinDebug\n*F\n+ 1 LogerComp.kt\ncom/yalla/yalla/util/log/LogerComp\n*L\n10#1:48\n18#1:55\n26#1:62\n34#1:69\n42#1:76\n10#1:49,6\n18#1:56,6\n26#1:63,6\n34#1:70,6\n42#1:77,6\n*E\n"})
public final class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000oo f57360OooO00o = new o0000oo();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f57362OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f57363OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, int i) {
            super(2);
            this.f57363OooO0o0 = str;
            this.f57362OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f57362OooO0o | 1);
            o0000oo.this.OooO00o(this.f57363OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f57365OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f57366OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, int i) {
            super(2);
            this.f57366OooO0o0 = str;
            this.f57365OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f57365OooO0o | 1);
            o0000oo.this.OooO0O0(this.f57366OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public final void OooO00o(@NotNull String message, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer composerStartRestartGroup = composer.startRestartGroup(961479506);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(message) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(961479506, i2, -1, "com.yalla.yalla.util.log.LogerComp.d (LogerComp.kt:8)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            if (composerStartRestartGroup.rememberedValue() == Composer.INSTANCE.getEmpty()) {
                o0000O00.OooO0O0(message);
                composerStartRestartGroup.updateRememberedValue("");
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(message, i));
    }

    @Composable
    public final void OooO0O0(@NotNull String message, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer composerStartRestartGroup = composer.startRestartGroup(554131807);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(message) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(554131807, i2, -1, "com.yalla.yalla.util.log.LogerComp.w (LogerComp.kt:40)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            if (composerStartRestartGroup.rememberedValue() == Composer.INSTANCE.getEmpty()) {
                o0000O00.OooO(message);
                composerStartRestartGroup.updateRememberedValue("");
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(message, i));
    }
}
