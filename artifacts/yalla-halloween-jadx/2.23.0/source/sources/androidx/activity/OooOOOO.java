package androidx.activity;

import android.view.KeyEvent;
import com.yalla.android.videoplayer.exoplayer.VideoPlayerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2187OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f2188OooO0o0;

    public /* synthetic */ OooOOOO(KeyEvent.Callback callback, int i) {
        this.f2187OooO0Oo = i;
        this.f2188OooO0o0 = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2187OooO0Oo;
        KeyEvent.Callback callback = this.f2188OooO0o0;
        switch (i) {
            case 0:
                OooOo00.onBackPressedDispatcher$lambda$1((OooOo00) callback);
                break;
            default:
                VideoPlayerView this$0 = (VideoPlayerView) callback;
                int i2 = VideoPlayerView.f22544OooO0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO00o();
                break;
        }
    }
}
