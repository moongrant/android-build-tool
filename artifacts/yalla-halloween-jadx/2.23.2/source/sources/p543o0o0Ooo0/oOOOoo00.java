package p543o0o0Ooo0;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.screen.user.OooO;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen$InitObservers$2\n*L\n1#1,496:1\n221#2,2:497\n*E\n"})
public final class oOOOoo00 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f55537OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooO f55538OooO0O0;

    public oOOOoo00(ScreenNavigationActivity screenNavigationActivity, OooO oooO) {
        this.f55537OooO00o = screenNavigationActivity;
        this.f55538OooO0O0 = oooO;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ScreenNavigationActivity screenNavigationActivity = this.f55537OooO00o;
        screenNavigationActivity.getClass();
        OooO callback = this.f55538OooO0O0;
        Intrinsics.checkNotNullParameter(callback, "callback");
        screenNavigationActivity.f28624OooO0oO.remove(callback);
    }
}
