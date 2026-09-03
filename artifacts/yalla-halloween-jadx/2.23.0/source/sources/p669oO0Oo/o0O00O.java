package p669oO0Oo;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LiveRoomMenuDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMenuDialogKt$ConveneMembersCalling$1$1\n*L\n1#1,496:1\n367#2,2:497\n*E\n"})
public final class o0O00O implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f60601OooO00o;

    public o0O00O(o0O00OO o0o00oo2) {
        this.f60601OooO00o = o0o00oo2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f60601OooO00o.cancel();
    }
}
