package p519o0o0O0oO;

import android.widget.ImageView;
import com.code.android.util.o000OO00;
import com.code.android.videoplayer.PlayState;
import com.code.android.videoplayer.view.VideoView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p152o00OoO.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class t3 implements OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ImageView f53158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ VideoView f53159OooO0O0;

    public t3(ImageView imageView, VideoView videoView) {
        this.f53158OooO00o = imageView;
        this.f53159OooO0O0 = videoView;
    }

    @Override // p152o00OoO.OooOO0O
    public final void OooO00o(@NotNull PlayState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == PlayState.Playing) {
            ImageView imageView = this.f53158OooO00o;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            o000OO00.OooO0O0(imageView);
            VideoView videoView = this.f53159OooO0O0;
            Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
            o000OO00.OooOOOO(videoView);
        }
    }
}
