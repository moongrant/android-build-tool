package o0OOO0;

import com.ss.ugc.android.alpha_player.controller.PlayerController;
import com.ss.ugc.android.alpha_player.player.PlayerState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o implements o0OOO0O.OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PlayerController f43560OooO00o;

    public OooO0o(PlayerController playerController) {
        this.f43560OooO00o = playerController;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, o0OOO0o0.OooO0OO] */
    @Override // o0OOO0O.OooO0OO.OooO00o
    public final void OooO0O0() {
        PlayerController playerController = this.f43560OooO00o;
        ?? r1 = playerController.f21855OooO;
        if (r1 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        r1.OooO0O0();
        playerController.f21857OooO0o = PlayerState.PAUSED;
        playerController.OooO0OO();
    }
}
