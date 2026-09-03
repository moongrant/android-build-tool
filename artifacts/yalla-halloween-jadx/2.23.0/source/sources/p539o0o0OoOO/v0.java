package p539o0o0OoOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.gift.GifListJson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class v0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f55719OooO00o = 3;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final MutableLiveData<GifListJson> f55720OooO0O0;

    public v0(@Nullable MutableLiveData mutableLiveData) {
        this.f55720OooO0O0 = mutableLiveData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f55719OooO00o == v0Var.f55719OooO00o && Intrinsics.areEqual(this.f55720OooO0O0, v0Var.f55720OooO0O0);
    }

    public final int hashCode() {
        int i = this.f55719OooO00o * 31;
        MutableLiveData<GifListJson> mutableLiveData = this.f55720OooO0O0;
        return i + (mutableLiveData == null ? 0 : mutableLiveData.hashCode());
    }

    @NotNull
    public final String toString() {
        return "FacePanelData(type=" + this.f55719OooO00o + ", gifFace=" + this.f55720OooO0O0 + ")";
    }
}
