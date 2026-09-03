package p535o0o0Oo0;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import kotlin.jvm.internal.SourceDebugExtension;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$MainContent$7\n*L\n1#1,496:1\n322#2,3:497\n*E\n"})
public final class oO0O00oO implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f53982OooO00o;

    public oO0O00oO(ScreenNavigationActivity screenNavigationActivity) {
        this.f53982OooO00o = screenNavigationActivity;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ScreenNavigationActivity screenNavigationActivity = this.f53982OooO00o;
        if (screenNavigationActivity != null) {
            screenNavigationActivity.f28623OooO0o.setValue(Boolean.TRUE);
        }
        o0000O00.OooO0O0("Compose onDispose because value");
    }
}
