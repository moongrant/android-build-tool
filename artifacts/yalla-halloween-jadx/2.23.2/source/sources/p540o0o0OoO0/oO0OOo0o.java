package p540o0o0OoO0;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LiveRoomMenuDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMenuDialogKt$ConveneMembersCalling$1$1\n*L\n1#1,496:1\n367#2,2:497\n*E\n"})
public final class oO0OOo0o implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO000Oo0 f54982OooO00o;

    public oO0OOo0o(oO000Oo0 oo000oo0) {
        this.f54982OooO00o = oo000oo0;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f54982OooO00o.cancel();
    }
}
