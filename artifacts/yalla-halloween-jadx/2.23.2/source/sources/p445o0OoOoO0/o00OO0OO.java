package p445o0OoOoO0;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLinkedAccountsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$LinkedAccountScreenContent$6\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,311:1\n63#2,5:312\n*S KotlinDebug\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$LinkedAccountScreenContent$6\n*L\n178#1:312,5\n*E\n"})
public final class o00OO0OO extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f47325OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f47326OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(ScreenNavigationActivity screenNavigationActivity, OpenAuthManager openAuthManager) {
        super(1);
        this.f47325OooO0Oo = screenNavigationActivity;
        this.f47326OooO0o0 = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        DisposableEffectScope DisposableEffect = disposableEffectScope;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        o00OO00O callback = new o00OO00O(this.f47326OooO0o0);
        ScreenNavigationActivity screenNavigationActivity = this.f47325OooO0Oo;
        screenNavigationActivity.getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        screenNavigationActivity.f28624OooO0oO.add(callback);
        return new o00OO0O0(screenNavigationActivity, callback);
    }
}
