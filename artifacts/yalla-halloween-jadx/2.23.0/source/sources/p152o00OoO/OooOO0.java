package p152o00OoO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public OooO f38118OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<OooOOO0> f38119OooO0O0 = new MutableLiveData<>();

    public final void OooO00o(@NotNull OooOOO0 videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        this.f38119OooO0O0.postValue(videoItem);
        OooO oooO = this.f38118OooO00o;
        if (oooO != null) {
            oooO.OooO00o(videoItem);
        }
    }

    public final void OooO0O0() {
        OooO oooO = this.f38118OooO00o;
        if (oooO != null) {
            oooO.stop();
        }
        this.f38119OooO0O0.postValue(null);
    }
}
