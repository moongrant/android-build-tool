package o0OOo000;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public OooO00o f43005OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<OooOO0> f43006OooO0O0 = new MutableLiveData<>();

    public final void OooO00o(@NotNull OooOO0 videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        this.f43006OooO0O0.postValue(videoItem);
        OooO00o oooO00o = this.f43005OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(videoItem);
        }
    }

    public final void OooO0O0() {
        OooO00o oooO00o = this.f43005OooO00o;
        if (oooO00o != null) {
            oooO00o.stop();
        }
        this.f43006OooO0O0.postValue(null);
    }
}
