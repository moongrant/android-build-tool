package p519o0o0O0oO;

import com.code.android.util.o000OO00;
import com.code.android.videoplayer.PlayState;
import com.code.android.videoplayer.view.VideoView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p152o00OoO.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class z3 implements OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ x3 f53244OooO00o;

    public z3(x3 x3Var) {
        this.f53244OooO00o = x3Var;
    }

    @Override // p152o00OoO.OooOO0O
    public final void OooO00o(@NotNull PlayState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == PlayState.Playing) {
            VideoView videoView = this.f53244OooO00o.f53209OooOOO0.f57917OooOO0O;
            Intrinsics.checkNotNullExpressionValue(videoView, "binding.videoView");
            o000OO00.OooOOOO(videoView);
        }
    }
}
