package p533o0o0Oo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p507o0o00ooo.v0;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54827OooO00o = ComposableLambdaKt.composableLambdaInstance(-173664581, false, OooO00o.f54829OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54828OooO0O0 = ComposableLambdaKt.composableLambdaInstance(-903125362, false, OooO0O0.f54830OooO0Oo);

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54829OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-173664581, iIntValue, -1, "com.yalla.yalla.ui.screen.room.live.ComposableSingletons$LiveRoomScreenKt.lambda-1.<anonymous> (LiveRoomScreen.kt:38)");
                }
                o00000O0.OooO00o(o00000O0.f54668OooO00o, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreen.kt\ncom/yalla/yalla/ui/screen/room/live/ComposableSingletons$LiveRoomScreenKt$lambda-2$1\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,91:1\n81#2,11:92\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreen.kt\ncom/yalla/yalla/ui/screen/room/live/ComposableSingletons$LiveRoomScreenKt$lambda-2$1\n*L\n47#1:92,11\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f54830OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-903125362, iIntValue, -1, "com.yalla.yalla.ui.screen.room.live.ComposableSingletons$LiveRoomScreenKt.lambda-2.<anonymous> (LiveRoomScreen.kt:45)");
                }
                composer2.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(o0O0OOO0.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
                composer2.endReplaceableGroup();
                o0O0OOO0 o0o0ooo0 = (o0O0OOO0) viewModel;
                v0.OooO00o(o0o0ooo0.f56243OooO00o, (String) o0o0ooo0.f56244OooO0O0.getValue(), false, composer2, 8, 4);
                o00000O0.OooO0O0(o00000O0.f54668OooO00o, composer2, 6);
                o0000O.f54670OooO00o.OooO00o(composer2, 6);
                o0000OO0.f54689OooO00o.OooO00o(composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
