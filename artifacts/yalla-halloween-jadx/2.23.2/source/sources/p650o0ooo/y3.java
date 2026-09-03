package p650o0ooo;

import com.code.android.util.o000O;
import com.yalla.android.videoplayer.PlayState;
import com.yalla.android.videoplayer.view.VideoView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p204o00o0o0O.o0000O;

/* JADX INFO: loaded from: classes4.dex */
public final class y3 implements o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ w3 f59226OooO00o;

    public y3(w3 w3Var) {
        this.f59226OooO00o = w3Var;
    }

    @Override // p204o00o0o0O.o0000O
    public final void OooO00o(@NotNull PlayState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == PlayState.Playing) {
            VideoView videoView = this.f59226OooO00o.f59208OooOOO0.f44866OooOO0O;
            Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
            o000O.OooOOOO(videoView);
        }
    }
}
