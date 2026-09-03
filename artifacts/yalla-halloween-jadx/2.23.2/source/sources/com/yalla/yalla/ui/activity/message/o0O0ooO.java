package com.yalla.yalla.ui.activity.message;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatBottomCompKt$PrivateChatBottomLayoutLifecycleHelper$1\n*L\n1#1,496:1\n214#2,2:497\n*E\n"})
public final class o0O0ooO implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f25513OooO00o;

    public o0O0ooO(Oooo000 oooo000) {
        this.f25513OooO00o = oooo000;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f25513OooO00o.OooO00o().clearFocus();
    }
}
