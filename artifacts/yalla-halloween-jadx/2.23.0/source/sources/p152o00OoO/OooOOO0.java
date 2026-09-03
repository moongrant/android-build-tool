package p152o00OoO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f38120OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38121OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ScaleType f38122OooO0OO;

    public OooOOO0(String filePath) {
        ScaleType scaleType = ScaleType.ScaleAspectFill;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f38120OooO00o = filePath;
        this.f38121OooO0O0 = Integer.MAX_VALUE;
        this.f38122OooO0OO = scaleType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return Intrinsics.areEqual(this.f38120OooO00o, oooOOO0.f38120OooO00o) && this.f38121OooO0O0 == oooOOO0.f38121OooO0O0 && this.f38122OooO0OO == oooOOO0.f38122OooO0OO;
    }

    public final int hashCode() {
        return this.f38122OooO0OO.hashCode() + (((this.f38120OooO00o.hashCode() * 31) + this.f38121OooO0O0) * 31);
    }

    @NotNull
    public final String toString() {
        return "VideoItem(filePath=" + this.f38120OooO00o + ", loopCount=" + this.f38121OooO0O0 + ", scaleType=" + this.f38122OooO0OO + ")";
    }
}
