package p453o0Ooo00o;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f46489OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f46490OooO0O0;

    public o00Oo0() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Oo0)) {
            return false;
        }
        o00Oo0 o00oo1 = (o00Oo0) obj;
        return this.f46489OooO00o == o00oo1.f46489OooO00o && this.f46490OooO0O0 == o00oo1.f46490OooO0O0;
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
        boolean z = this.f46489OooO00o;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f46490OooO0O0;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public final String toString() {
        return "FFmpegOperationModel(hasClipVideo=" + this.f46489OooO00o + ", hasClipAudio=" + this.f46490OooO0O0 + ")";
    }

    public o00Oo0(int i) {
        this.f46489OooO00o = false;
        this.f46490OooO0O0 = false;
    }
}
