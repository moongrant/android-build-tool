package p551o0oOOOoo;

import androidx.compose.animation.o0OoOo0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0oo0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f56012OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f56013OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f56014OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f56015OooO0Oo;

    public o0oo0000(@NotNull String filePath, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f56012OooO00o = filePath;
        this.f56013OooO0O0 = f;
        this.f56014OooO0OO = f2;
        this.f56015OooO0Oo = f3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0oo0000)) {
            return false;
        }
        o0oo0000 o0oo0000Var = (o0oo0000) obj;
        return Intrinsics.areEqual(this.f56012OooO00o, o0oo0000Var.f56012OooO00o) && Float.compare(this.f56013OooO0O0, o0oo0000Var.f56013OooO0O0) == 0 && Float.compare(this.f56014OooO0OO, o0oo0000Var.f56014OooO0OO) == 0 && Float.compare(this.f56015OooO0Oo, o0oo0000Var.f56015OooO0Oo) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f56015OooO0Oo) + o0OoOo0.OooO00o(this.f56014OooO0OO, o0OoOo0.OooO00o(this.f56013OooO0O0, this.f56012OooO00o.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "MediaMergeModel(filePath=" + this.f56012OooO00o + ", start=" + this.f56013OooO0O0 + ", end=" + this.f56014OooO0OO + ", volume=" + this.f56015OooO0Oo + ")";
    }
}
