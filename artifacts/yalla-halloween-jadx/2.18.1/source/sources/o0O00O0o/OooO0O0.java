package o0O00O0o;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public OooO00o f35126OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<OooO0o> f35127OooO0O0 = new MutableLiveData<>();

    public final void OooO00o() {
        OooO00o oooO00o = this.f35126OooO00o;
        if (oooO00o == null) {
            return;
        }
        oooO00o.OooO0O0();
    }

    public final void OooO0O0() {
        OooO00o oooO00o = this.f35126OooO00o;
        if (oooO00o != null) {
            oooO00o.release();
        }
        this.f35126OooO00o = null;
    }

    public final void OooO0OO(@NotNull OooO0o videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        this.f35127OooO0O0.postValue(videoItem);
        OooO00o oooO00o = this.f35126OooO00o;
        if (oooO00o == null) {
            return;
        }
        oooO00o.OooO00o(videoItem);
    }

    public final void OooO0Oo(@NotNull OooO00o videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        this.f35126OooO00o = videoPlayer;
    }

    public final void OooO0o0() {
        OooO00o oooO00o = this.f35126OooO00o;
        if (oooO00o != null) {
            oooO00o.stop();
        }
        this.f35127OooO0O0.postValue(null);
    }
}
