package p587o0oOooOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.gift.GifListJson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class q {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f56934OooO00o = 3;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final MutableLiveData<GifListJson> f56935OooO0O0;

    public q(@Nullable MutableLiveData mutableLiveData) {
        this.f56935OooO0O0 = mutableLiveData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f56934OooO00o == qVar.f56934OooO00o && Intrinsics.areEqual(this.f56935OooO0O0, qVar.f56935OooO0O0);
    }

    public final int hashCode() {
        int i = this.f56934OooO00o * 31;
        MutableLiveData<GifListJson> mutableLiveData = this.f56935OooO0O0;
        return i + (mutableLiveData == null ? 0 : mutableLiveData.hashCode());
    }

    @NotNull
    public final String toString() {
        return "FacePanelData(type=" + this.f56934OooO00o + ", gifFace=" + this.f56935OooO0O0 + ")";
    }
}
