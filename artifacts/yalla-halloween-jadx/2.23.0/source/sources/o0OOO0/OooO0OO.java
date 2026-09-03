package o0OOO0;

import com.ss.ugc.android.alpha_player.controller.PlayerController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO implements o0OOO0O.OooO0OO.InterfaceC0458OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PlayerController f43559OooO00o;

    public OooO0OO(PlayerController playerController) {
        this.f43559OooO00o = playerController;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, o0OOO0o0.OooO0OO] */
    @Override // o0OOO0O.OooO0OO.InterfaceC0458OooO0OO
    public final void OooO00o() {
        ?? r0 = this.f43559OooO00o.f21855OooO;
        if (r0 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        r0.OooO00o();
    }
}
