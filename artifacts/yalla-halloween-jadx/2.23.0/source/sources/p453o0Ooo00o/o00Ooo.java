package p453o0Ooo00o;

import androidx.compose.animation.Oooo0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f46491OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f46492OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f46493OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f46494OooO0Oo;

    public o00Ooo(@NotNull String filePath, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f46491OooO00o = filePath;
        this.f46492OooO0O0 = f;
        this.f46493OooO0OO = f2;
        this.f46494OooO0Oo = f3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return Intrinsics.areEqual(this.f46491OooO00o, o00ooo2.f46491OooO00o) && Float.compare(this.f46492OooO0O0, o00ooo2.f46492OooO0O0) == 0 && Float.compare(this.f46493OooO0OO, o00ooo2.f46493OooO0OO) == 0 && Float.compare(this.f46494OooO0Oo, o00ooo2.f46494OooO0Oo) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f46494OooO0Oo) + Oooo0.OooO00o(this.f46493OooO0OO, Oooo0.OooO00o(this.f46492OooO0O0, this.f46491OooO00o.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "MediaMergeModel(filePath=" + this.f46491OooO00o + ", start=" + this.f46492OooO0O0 + ", end=" + this.f46493OooO0OO + ", volume=" + this.f46494OooO0Oo + ")";
    }
}
