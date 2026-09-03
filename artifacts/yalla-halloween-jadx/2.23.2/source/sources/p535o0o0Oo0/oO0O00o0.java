package p535o0o0Oo0;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.screen.moment.media.OooOO0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$InitObservers$4\n*L\n1#1,496:1\n877#2,2:497\n*E\n"})
public final class oO0O00o0 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f53980OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f53981OooO0O0;

    public oO0O00o0(ScreenNavigationActivity screenNavigationActivity, OooOO0 oooOO1) {
        this.f53980OooO00o = screenNavigationActivity;
        this.f53981OooO0O0 = oooOO1;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ScreenNavigationActivity screenNavigationActivity = this.f53980OooO00o;
        screenNavigationActivity.getClass();
        OooOO0 callback = this.f53981OooO0O0;
        Intrinsics.checkNotNullParameter(callback, "callback");
        screenNavigationActivity.f28624OooO0oO.remove(callback);
    }
}
