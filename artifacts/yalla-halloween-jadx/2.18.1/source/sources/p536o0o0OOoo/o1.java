package p536o0o0OOoo;

import com.common.videoplayer.PlayState;
import com.common.videoplayer.view.VideoView;
import com.yalla.support.common.util.o00O0O;
import kotlin.jvm.internal.Intrinsics;
import o0O00O0o.OooO0OO;
import org.jetbrains.annotations.NotNull;
import p649o0ooOOoo.sb;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ sb f43829OooO00o;

    public o1(sb sbVar) {
        this.f43829OooO00o = sbVar;
    }

    @Override // o0O00O0o.OooO0OO
    public final void onStateChanged(@NotNull PlayState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == PlayState.Playing) {
            VideoView videoView = this.f43829OooO00o.f50573OooOOO;
            Intrinsics.checkNotNullExpressionValue(videoView, "binding.videoView");
            o00O0O.OooO(videoView);
        }
    }
}
