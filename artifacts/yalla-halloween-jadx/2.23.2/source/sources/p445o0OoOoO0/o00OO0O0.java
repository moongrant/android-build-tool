package p445o0OoOoO0;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$LinkedAccountScreenContent$6\n*L\n1#1,496:1\n179#2,2:497\n*E\n"})
public final class o00OO0O0 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f47323OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00OO00O f47324OooO0O0;

    public o00OO0O0(ScreenNavigationActivity screenNavigationActivity, o00OO00O o00oo00o) {
        this.f47323OooO00o = screenNavigationActivity;
        this.f47324OooO0O0 = o00oo00o;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ScreenNavigationActivity screenNavigationActivity = this.f47323OooO00o;
        screenNavigationActivity.getClass();
        o00OO00O callback = this.f47324OooO0O0;
        Intrinsics.checkNotNullParameter(callback, "callback");
        screenNavigationActivity.f28624OooO0oO.remove(callback);
    }
}
