package p528o0o0OOOo;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.screen.moment.media.OooOO0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$InitObservers$4\n*L\n1#1,496:1\n871#2,2:497\n*E\n"})
public final class oOO0O000 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f54140OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f54141OooO0O0;

    public oOO0O000(ScreenNavigationActivity screenNavigationActivity, OooOO0 oooOO1) {
        this.f54140OooO00o = screenNavigationActivity;
        this.f54141OooO0O0 = oooOO1;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ScreenNavigationActivity screenNavigationActivity = this.f54140OooO00o;
        screenNavigationActivity.getClass();
        OooOO0 callback = this.f54141OooO0O0;
        Intrinsics.checkNotNullParameter(callback, "callback");
        screenNavigationActivity.f29158OooO0oO.remove(callback);
    }
}
