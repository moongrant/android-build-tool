package p533o0o0Oo0;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p571o0oOoOO.o0O0OOO0;
import p669oO0Oo.o000O00O;
import p669oO0Oo.o000O0Oo;
import p669oO0Oo.o0O00o0;
import p669oO0Oo.o0o0Oo;
import p669oO0Oo.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomScreenTopInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopInfo\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,335:1\n81#2,11:336\n81#2,11:347\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopInfo\n*L\n84#1:336,11\n85#1:347,11\n*E\n"})
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000O0O0 f54714OooO00o = new o000O0O0();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54716OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f54716OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54716OooO0o0 | 1);
            o000O0O0.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-744284395);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-744284395, i, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopInfo.Content (LiveRoomScreenTopInfo.kt:76)");
            }
            o000O00O.f60468OooO00o.OooO00o(composerStartRestartGroup, 6);
            o000O0Oo.f60478OooO00o.OooO00o(composerStartRestartGroup, 6);
            oo0o0O0.f60812OooO00o.OooO0O0(composerStartRestartGroup, 6);
            o0O00o0.f60622OooO00o.OooO(composerStartRestartGroup, 6);
            o0o0Oo.f60748OooO00o.OooO00o(composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(LiveRoomVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            LiveRoomVM liveRoomVM = (LiveRoomVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(o0O0OOO0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o00.OooO0Oo(liveRoomVM, (o0O0OOO0) viewModel2, composerStartRestartGroup, 64);
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
