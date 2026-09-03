package com.yalla.yalla.ui.screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p532o0o0OOo0.o0000O;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o000O00;
import p532o0o0OOo0.o000O00O;
import p532o0o0OOo0.o00O00;
import p577o0oOoOo.o0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0003¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/screen/NetworkTestScreen;", "Lo0o0OOo0/o000O0;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "navigate", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkTestScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkTestScreen.kt\ncom/yalla/yalla/ui/screen/NetworkTestScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,266:1\n76#2:267\n*S KotlinDebug\n*F\n+ 1 NetworkTestScreen.kt\ncom/yalla/yalla/ui/screen/NetworkTestScreen\n*L\n64#1:267\n*E\n"})
public final class NetworkTestScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final NetworkTestScreen INSTANCE = new NetworkTestScreen();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28614OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f28615OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f28615OooO0o0 = columnScope;
            this.f28614OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28614OooO0o | 1);
            NetworkTestScreen.this.Content(this.f28615OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private NetworkTestScreen() {
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(416781684);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(416781684, i, -1, "com.yalla.yalla.ui.screen.NetworkTestScreen.Content (NetworkTestScreen.kt:61)");
            }
            o0O o0o = (o0O) ViewModelKt.viewModel(o0O.class, null, null, null, null, composerStartRestartGroup, 8, 30);
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            com.yalla.yalla.util.permission.OooO00o.OooO0OO((AppCompatActivity) objConsume, PermissionGroupReveal.f32337OooO0OO, o000O00.f53483OooO0Oo, new o000O00O(o0o));
            o0000O.OooO0oO(o0o, composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
    }

    public final void navigate() {
        o00O00.OooO0o0(INSTANCE, null, false, null, 14);
    }
}
