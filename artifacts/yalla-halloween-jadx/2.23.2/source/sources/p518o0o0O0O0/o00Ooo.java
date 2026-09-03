package p518o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f51898OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f51899OooO0O0;

    public o00Ooo(int i) {
        Intrinsics.checkNotNullParameter("", "url");
        this.f51898OooO00o = i;
        this.f51899OooO0O0 = "";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return this.f51898OooO00o == o00ooo2.f51898OooO00o && Intrinsics.areEqual(this.f51899OooO0O0, o00ooo2.f51899OooO0O0);
    }

    public final int hashCode() {
        return this.f51899OooO0O0.hashCode() + (this.f51898OooO00o * 31);
    }

    @NotNull
    public final String toString() {
        return "FaceType(id=" + this.f51898OooO00o + ", url=" + this.f51899OooO0O0 + ")";
    }
}
