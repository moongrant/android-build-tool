package p395o0Oo;

import com.ss.ugc.android.alpha_player.controller.PlayerController;
import com.ss.ugc.android.alpha_player.player.PlayerState;
import kotlin.jvm.internal.Intrinsics;
import p423o0OoO000.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PlayerController f38939OooO00o;

    public OooOo(PlayerController playerController) {
        this.f38939OooO00o = playerController;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    @Override // o0OoO000.OooOOO.OooO00o
    public final void OooO0O0() {
        ?? r0 = this.f38939OooO00o.f19837OoooO0O;
        if (r0 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        r0.OooO0O0();
        PlayerController playerController = this.f38939OooO00o;
        playerController.f19832Oooo0oO = PlayerState.PAUSED;
        PlayerController.OooO0o0(playerController, true, "");
        this.f38939OooO00o.OooO00o();
    }
}
