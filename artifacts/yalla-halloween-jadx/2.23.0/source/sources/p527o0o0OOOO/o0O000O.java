package p527o0o0OOOO;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 FriendRequestMessageScreen.kt\ncom/yalla/yalla/ui/screen/message/FriendRequestMessageScreenKt$FriendRequestMessageScreenContent$1$5\n*L\n1#1,496:1\n109#2:497\n*E\n"})
public final class o0O000O implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53630OooO00o;

    public o0O000O(FriendRequestMessageVM friendRequestMessageVM) {
        this.f53630OooO00o = friendRequestMessageVM;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f53630OooO00o.updateAllMessageStateRead();
    }
}
