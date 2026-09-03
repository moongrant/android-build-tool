package p528o0o0OOOo;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import kotlin.jvm.internal.SourceDebugExtension;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$MainContent$7\n*L\n1#1,496:1\n321#2,3:497\n*E\n"})
public final class oOO0O00O implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f54142OooO00o;

    public oOO0O00O(ScreenNavigationActivity screenNavigationActivity) {
        this.f54142OooO00o = screenNavigationActivity;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ScreenNavigationActivity screenNavigationActivity = this.f54142OooO00o;
        if (screenNavigationActivity != null) {
            screenNavigationActivity.f29157OooO0o.setValue(Boolean.TRUE);
        }
        OooOOO0.OooO0O0("Compose onDispose because value");
    }
}
