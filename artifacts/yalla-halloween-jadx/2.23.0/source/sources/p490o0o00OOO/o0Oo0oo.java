package p490o0o00OOO;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$RoomMessageBottomLayoutLifecycleHelper$1\n*L\n1#1,496:1\n292#2,2:497\n*E\n"})
public final class o0Oo0oo implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f48667OooO00o;

    public o0Oo0oo(OooOOOO oooOOOO) {
        this.f48667OooO00o = oooOOOO;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f48667OooO00o.OooO00o().clearFocus();
    }
}
