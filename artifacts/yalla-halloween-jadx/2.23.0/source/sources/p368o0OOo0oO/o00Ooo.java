package p368o0OOo0oO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f43989OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f43990OooO0O0;

    public o00Ooo(@NotNull String ip, int i) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.f43989OooO00o = ip;
        this.f43990OooO0O0 = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o00Ooo)) {
            return super.equals(obj);
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return Intrinsics.areEqual(o00ooo2.f43989OooO00o, this.f43989OooO00o) && o00ooo2.f43990OooO0O0 == this.f43990OooO0O0;
    }

    public final int hashCode() {
        return (this.f43989OooO00o.hashCode() * 31) + this.f43990OooO0O0;
    }
}
