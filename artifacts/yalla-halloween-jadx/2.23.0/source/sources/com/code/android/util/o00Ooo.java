package com.code.android.util;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifeCycleEffect.kt\ncom/code/android/util/LifeCycleEffectKt$LifecycleEffect$3$1\n*L\n1#1,496:1\n49#2,2:497\n*E\n"})
public final class o00Ooo implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f10385OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f10386OooO0O0;

    public o00Ooo(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        this.f10385OooO00o = lifecycle;
        this.f10386OooO0O0 = lifecycleEventObserver;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f10385OooO00o.removeObserver(this.f10386OooO0O0);
    }
}
