package o0OOO0O0;

import com.ss.ugc.android.alpha_player.controller.PlayerController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements o0OOO0OO.OooO0OO.InterfaceC0448OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PlayerController f42761OooO00o;

    public OooO0OO(PlayerController playerController) {
        this.f42761OooO00o = playerController;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, o0OOO0oO.OooOO0] */
    @Override // o0OOO0OO.OooO0OO.InterfaceC0448OooO0OO
    public final void OooO00o() {
        ?? r0 = this.f42761OooO00o.f21382OooO;
        if (r0 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        r0.OooO00o();
    }
}
