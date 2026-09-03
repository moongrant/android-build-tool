package p440o0OoOo0o;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLinkedAccountsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$LinkedAccountScreenContent$6\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,284:1\n63#2,5:285\n*S KotlinDebug\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$LinkedAccountScreenContent$6\n*L\n163#1:285,5\n*E\n"})
public final class o000O extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f46128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f46129OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(ScreenNavigationActivity screenNavigationActivity, OpenAuthManager openAuthManager) {
        super(1);
        this.f46128OooO0Oo = screenNavigationActivity;
        this.f46129OooO0o0 = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        DisposableEffectScope DisposableEffect = disposableEffectScope;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        o000OO0O callback = new o000OO0O(this.f46129OooO0o0);
        ScreenNavigationActivity screenNavigationActivity = this.f46128OooO0Oo;
        screenNavigationActivity.getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        screenNavigationActivity.f29158OooO0oO.add(callback);
        return new o000O0O0(screenNavigationActivity, callback);
    }
}
