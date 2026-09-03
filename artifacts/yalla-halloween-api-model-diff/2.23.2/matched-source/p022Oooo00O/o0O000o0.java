package p022Oooo00O;

import com.yalla.android.videoplayer.exoplayer.VideoPlayerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O000o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f704OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f705OooO0o0;

    public /* synthetic */ o0O000o0(Object obj, int i) {
        this.f704OooO0Oo = i;
        this.f705OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f704OooO0Oo;
        Object obj = this.f705OooO0o0;
        switch (i) {
            case 0:
                ((o0O00OO) obj).f713OooO00o.OooO0Oo();
                break;
            default:
                VideoPlayerView this$0 = (VideoPlayerView) obj;
                int i2 = VideoPlayerView.f22071OooO0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO00o();
                break;
        }
    }
}
