package o0O00OO;

import com.common.videoplayer.PlayState;
import com.common.videoplayer.view.AlphaVideoView;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import kotlin.jvm.internal.Intrinsics;
import o0O00O0o.OooO0OO;
import org.jetbrains.annotations.NotNull;
import p421o0Oo0ooo.oOo00ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements oOo00ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AlphaVideoView f35131OooO00o;

    public OooO00o(AlphaVideoView alphaVideoView) {
        this.f35131OooO00o = alphaVideoView;
    }

    @Override // p421o0Oo0ooo.oOo00ooO
    public final void OooO00o() {
        OooO0OO oooO0OO = this.f35131OooO00o.f12660Oooo0o;
        if (oooO0OO == null) {
            return;
        }
        oooO0OO.onStateChanged(PlayState.Playing);
    }

    @Override // p421o0Oo0ooo.oOo00ooO
    public final void OooO0O0(@NotNull ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
    }

    @Override // p421o0Oo0ooo.oOo00ooO
    public final void OooO0OO() {
        OooO0OO oooO0OO = this.f35131OooO00o.f12660Oooo0o;
        if (oooO0OO == null) {
            return;
        }
        oooO0OO.onStateChanged(PlayState.Stop);
    }
}
