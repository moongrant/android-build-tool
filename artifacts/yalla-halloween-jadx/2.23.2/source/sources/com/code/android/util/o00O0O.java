package com.code.android.util;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifeCycleEffect.kt\ncom/code/android/util/LifeCycleEffectKt$LifecycleEffect$1$1\n*L\n1#1,496:1\n26#2,2:497\n*E\n"})
public final class o00O0O implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f13439OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f13440OooO0O0;

    public o00O0O(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        this.f13439OooO00o = lifecycle;
        this.f13440OooO0O0 = lifecycleEventObserver;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f13439OooO00o.removeObserver(this.f13440OooO0O0);
    }
}
