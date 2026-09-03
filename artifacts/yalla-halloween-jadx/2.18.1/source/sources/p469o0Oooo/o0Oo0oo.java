package p469o0Oooo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f40606OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f40607OooO0O0;

    public o0Oo0oo(@NotNull String ip, int i) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.f40606OooO00o = ip;
        this.f40607OooO0O0 = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o0Oo0oo)) {
            return super.equals(obj);
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        return Intrinsics.areEqual(o0oo0oo2.f40606OooO00o, this.f40606OooO00o) && o0oo0oo2.f40607OooO0O0 == this.f40607OooO0O0;
    }

    public final int hashCode() {
        return (this.f40606OooO00o.hashCode() * 31) + this.f40607OooO0O0;
    }
}
