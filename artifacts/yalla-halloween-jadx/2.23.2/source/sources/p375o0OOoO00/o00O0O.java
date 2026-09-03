package p375o0OOoO00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f43221OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f43222OooO0O0;

    public o00O0O(@NotNull String ip, int i) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.f43221OooO00o = ip;
        this.f43222OooO0O0 = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o00O0O)) {
            return super.equals(obj);
        }
        o00O0O o00o0o2 = (o00O0O) obj;
        return Intrinsics.areEqual(o00o0o2.f43221OooO00o, this.f43221OooO00o) && o00o0o2.f43222OooO0O0 == this.f43222OooO0O0;
    }

    public final int hashCode() {
        return (this.f43221OooO00o.hashCode() * 31) + this.f43222OooO0O0;
    }
}
