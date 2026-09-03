package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1\n*L\n1#1,496:1\n94#2,2:497\n*E\n"})
public final class OooOOOO implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f10135OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f10136OooO0O0;

    public OooOOOO(NavBackStackEntry navBackStackEntry, LifecycleEventObserver lifecycleEventObserver) {
        this.f10135OooO00o = navBackStackEntry;
        this.f10136OooO0O0 = lifecycleEventObserver;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f10135OooO00o.getLifecycle().removeObserver(this.f10136OooO0O0);
    }
}
