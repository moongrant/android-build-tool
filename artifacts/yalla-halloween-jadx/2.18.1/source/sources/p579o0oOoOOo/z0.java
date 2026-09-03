package p579o0oOoOOo;

import android.widget.ImageView;
import com.common.videoplayer.PlayState;
import com.common.videoplayer.view.VideoView;
import kotlin.jvm.internal.Intrinsics;
import o0O00O0o.OooO0OO;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ImageView f46376OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ VideoView f46377OooO0O0;

    public z0(ImageView imageView, VideoView videoView) {
        this.f46376OooO00o = imageView;
        this.f46377OooO0O0 = videoView;
    }

    @Override // o0O00O0o.OooO0OO
    public final void onStateChanged(@NotNull PlayState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == PlayState.Playing) {
            ImageView imageView = this.f46376OooO00o;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            oOO00O.OooO00o(imageView);
            VideoView videoView = this.f46377OooO0O0;
            Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
            oOO00O.OooO(videoView);
        }
    }
}
