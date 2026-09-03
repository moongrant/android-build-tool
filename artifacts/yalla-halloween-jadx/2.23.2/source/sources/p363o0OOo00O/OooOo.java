package p363o0OOo00O;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public String f43056OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f43057OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f43058OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f43059OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f43060OooO0o0;

    public OooOo() {
        this((String) null, false, 0L, 0L, 31);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return Intrinsics.areEqual(this.f43056OooO00o, oooOo.f43056OooO00o) && this.f43057OooO0O0 == oooOo.f43057OooO0O0 && this.f43058OooO0OO == oooOo.f43058OooO0OO && this.f43059OooO0Oo == oooOo.f43059OooO0Oo && this.f43060OooO0o0 == oooOo.f43060OooO0o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iHashCode = this.f43056OooO00o.hashCode() * 31;
        boolean z = this.f43057OooO0O0;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (((iHashCode + r1) * 31) + this.f43058OooO0OO) * 31;
        long j = this.f43059OooO0Oo;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f43060OooO0o0;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    @NotNull
    public final String toString() {
        return "VideoParams(url=" + this.f43056OooO00o + ", clipMode=" + this.f43057OooO0O0 + ", loopTimes=" + this.f43058OooO0OO + ", startPositionMs=" + this.f43059OooO0Oo + ", endPositionMs=" + this.f43060OooO0o0 + ")";
    }

    public OooOo(@NotNull String url, boolean z, int i, long j, long j2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f43056OooO00o = url;
        this.f43057OooO0O0 = z;
        this.f43058OooO0OO = i;
        this.f43059OooO0Oo = j;
        this.f43060OooO0o0 = j2;
        if (z) {
            if (!(j >= 0)) {
                throw new IllegalArgumentException("In clipMode,startPositionMs can't be -1".toString());
            }
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException("In clipMode,endPositionMs can't be -1".toString());
            }
        }
    }

    public /* synthetic */ OooOo(String str, boolean z, long j, long j2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? Integer.MAX_VALUE : 0, (i & 8) != 0 ? -1L : j, (i & 16) != 0 ? -1L : j2);
    }
}
