package p125o00O0o0O;

import coil.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p124o00O0o00.o000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo extends o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OO f36632OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f36633OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final DataSource f36634OooO0OO;

    public oo0o0Oo(@NotNull o000OO o000oo2, @Nullable String str, @NotNull DataSource dataSource) {
        this.f36632OooO00o = o000oo2;
        this.f36633OooO0O0 = str;
        this.f36634OooO0OO = dataSource;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oo0o0Oo) {
            oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
            if (Intrinsics.areEqual(this.f36632OooO00o, oo0o0oo.f36632OooO00o) && Intrinsics.areEqual(this.f36633OooO0O0, oo0o0oo.f36633OooO0O0) && this.f36634OooO0OO == oo0o0oo.f36634OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f36632OooO00o.hashCode() * 31;
        String str = this.f36633OooO0O0;
        return this.f36634OooO0OO.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
