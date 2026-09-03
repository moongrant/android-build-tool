package p650o0ooo;

import android.widget.ImageView;
import com.code.android.util.o000O;
import com.yalla.android.videoplayer.PlayState;
import com.yalla.android.videoplayer.view.VideoView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p204o00o0o0O.o0000O;

/* JADX INFO: loaded from: classes4.dex */
public final class s3 implements o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ImageView f59155OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ VideoView f59156OooO0O0;

    public s3(ImageView imageView, VideoView videoView) {
        this.f59155OooO00o = imageView;
        this.f59156OooO0O0 = videoView;
    }

    @Override // p204o00o0o0O.o0000O
    public final void OooO00o(@NotNull PlayState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == PlayState.Playing) {
            ImageView imageView = this.f59155OooO00o;
            Intrinsics.checkNotNullExpressionValue(imageView, "$imageView");
            o000O.OooO0O0(imageView);
            VideoView videoView = this.f59156OooO0O0;
            Intrinsics.checkNotNullExpressionValue(videoView, "$videoView");
            o000O.OooOOOO(videoView);
        }
    }
}
