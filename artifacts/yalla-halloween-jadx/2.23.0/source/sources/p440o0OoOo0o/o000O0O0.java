package p440o0OoOo0o;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$LinkedAccountScreenContent$6\n*L\n1#1,496:1\n164#2,2:497\n*E\n"})
public final class o000O0O0 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f46138OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000OO0O f46139OooO0O0;

    public o000O0O0(ScreenNavigationActivity screenNavigationActivity, o000OO0O o000oo0o2) {
        this.f46138OooO00o = screenNavigationActivity;
        this.f46139OooO0O0 = o000oo0o2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ScreenNavigationActivity screenNavigationActivity = this.f46138OooO00o;
        screenNavigationActivity.getClass();
        o000OO0O callback = this.f46139OooO0O0;
        Intrinsics.checkNotNullParameter(callback, "callback");
        screenNavigationActivity.f29158OooO0oO.remove(callback);
    }
}
