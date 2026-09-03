package o0OOo000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f43007OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f43008OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ScaleType f43009OooO0OO;

    public OooOO0(String filePath) {
        ScaleType scaleType = ScaleType.ScaleAspectFill;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f43007OooO00o = filePath;
        this.f43008OooO0O0 = Integer.MAX_VALUE;
        this.f43009OooO0OO = scaleType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0)) {
            return false;
        }
        OooOO0 oooOO1 = (OooOO0) obj;
        return Intrinsics.areEqual(this.f43007OooO00o, oooOO1.f43007OooO00o) && this.f43008OooO0O0 == oooOO1.f43008OooO0O0 && this.f43009OooO0OO == oooOO1.f43009OooO0OO;
    }

    public final int hashCode() {
        return this.f43009OooO0OO.hashCode() + (((this.f43007OooO00o.hashCode() * 31) + this.f43008OooO0O0) * 31);
    }

    @NotNull
    public final String toString() {
        return "VideoItem(filePath=" + this.f43007OooO00o + ", loopCount=" + this.f43008OooO0O0 + ", scaleType=" + this.f43009OooO0OO + ")";
    }
}
