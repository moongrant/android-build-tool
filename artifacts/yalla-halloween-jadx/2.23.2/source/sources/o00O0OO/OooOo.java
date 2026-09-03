package o00O0OO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f36202OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36203OooO0O0;

    public OooOo(@NotNull String workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f36202OooO00o = workSpecId;
        this.f36203OooO0O0 = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return Intrinsics.areEqual(this.f36202OooO00o, oooOo.f36202OooO00o) && this.f36203OooO0O0 == oooOo.f36203OooO0O0;
    }

    public final int hashCode() {
        return (this.f36202OooO00o.hashCode() * 31) + this.f36203OooO0O0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f36202OooO00o);
        sb.append(", generation=");
        return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f36203OooO0O0, ')');
    }
}
