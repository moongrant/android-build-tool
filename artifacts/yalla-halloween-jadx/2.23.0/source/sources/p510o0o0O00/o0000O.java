package p510o0o0O00;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f51413OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f51414OooO0O0;

    public o0000O(int i) {
        Intrinsics.checkNotNullParameter("", "url");
        this.f51413OooO00o = i;
        this.f51414OooO0O0 = "";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000O)) {
            return false;
        }
        o0000O o0000o2 = (o0000O) obj;
        return this.f51413OooO00o == o0000o2.f51413OooO00o && Intrinsics.areEqual(this.f51414OooO0O0, o0000o2.f51414OooO0O0);
    }

    public final int hashCode() {
        return this.f51414OooO0O0.hashCode() + (this.f51413OooO00o * 31);
    }

    @NotNull
    public final String toString() {
        return "FaceType(id=" + this.f51413OooO00o + ", url=" + this.f51414OooO0O0 + ")";
    }
}
