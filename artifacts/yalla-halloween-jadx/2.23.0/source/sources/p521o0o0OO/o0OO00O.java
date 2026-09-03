package p521o0o0OO;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface o0OO00O {

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0o0OO.o0OO00O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0503OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0OO00O f53424OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ int f53425OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0503OooO00o(o0OO00O o0oo00o2, int i) {
                super(2);
                this.f53424OooO0Oo = o0oo00o2;
                this.f53425OooO0o0 = i;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Composer composer, Integer num) {
                num.intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53425OooO0o0 | 1);
                this.f53424OooO0Oo.OooO0O0(composer, iUpdateChangedFlags);
                return Unit.INSTANCE;
            }
        }

        @Composable
        public static void OooO00o(@NotNull o0OO00O o0oo00o2, @Nullable Composer composer, int i) {
            int i2;
            Composer composerStartRestartGroup = composer.startRestartGroup(1082469183);
            if ((i & 14) == 0) {
                i2 = (composerStartRestartGroup.changed(o0oo00o2) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1082469183, i2, -1, "com.yalla.yalla.ui.page.PageCompose.SetPage (PageCompose.kt:7)");
                }
                o0oo00o2.OooO00o("", composerStartRestartGroup, ((i2 << 3) & 112) | 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new C0503OooO00o(o0oo00o2, i));
        }
    }

    @Composable
    void OooO00o(@NotNull String str, @Nullable Composer composer, int i);

    @Composable
    void OooO0O0(@Nullable Composer composer, int i);
}
