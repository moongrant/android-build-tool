package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$1$2$1\n*L\n1#1,496:1\n54#2,2:497\n*E\n"})
public final class OooOO0O implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f7024OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f7025OooO0O0;

    public OooOO0O(OooOo00 oooOo00, NavBackStackEntry navBackStackEntry) {
        this.f7024OooO00o = oooOo00;
        this.f7025OooO0O0 = navBackStackEntry;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f7024OooO00o.OooO0O0().OooO0O0(this.f7025OooO0O0);
    }
}
