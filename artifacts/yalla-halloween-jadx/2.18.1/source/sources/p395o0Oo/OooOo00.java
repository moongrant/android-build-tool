package p395o0Oo;

import com.ss.ugc.android.alpha_player.controller.PlayerController;
import kotlin.jvm.internal.Intrinsics;
import p423o0OoO000.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements OooOOO.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PlayerController f38940OooO00o;

    public OooOo00(PlayerController playerController) {
        this.f38940OooO00o = playerController;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    @Override // o0OoO000.OooOOO.OooO0OO
    public final void OooO00o() {
        ?? r0 = this.f38940OooO00o.f19837OoooO0O;
        if (r0 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        r0.OooO00o();
    }
}
