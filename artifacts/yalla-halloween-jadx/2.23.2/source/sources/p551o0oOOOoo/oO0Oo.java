package p551o0oOOOoo;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f56016OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f56017OooO0O0;

    public oO0Oo() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oO0Oo)) {
            return false;
        }
        oO0Oo oo0oo = (oO0Oo) obj;
        return this.f56016OooO00o == oo0oo.f56016OooO00o && this.f56017OooO0O0 == oo0oo.f56017OooO0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final int hashCode() {
        boolean z = this.f56016OooO00o;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f56017OooO0O0;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public final String toString() {
        return "FFmpegOperationModel(hasClipVideo=" + this.f56016OooO00o + ", hasClipAudio=" + this.f56017OooO0O0 + ")";
    }

    public oO0Oo(int i) {
        this.f56016OooO00o = false;
        this.f56017OooO0O0 = false;
    }
}
