package p105o000oo0o;

import coil.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103o000oo00.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0oOO0 extends o00O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000OO0 f35800OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f35801OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final DataSource f35802OooO0OO;

    public oo0oOO0(@NotNull o0000OO0 o0000oo1, @Nullable String str, @NotNull DataSource dataSource) {
        this.f35800OooO00o = o0000oo1;
        this.f35801OooO0O0 = str;
        this.f35802OooO0OO = dataSource;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oo0oOO0) {
            oo0oOO0 oo0ooo0 = (oo0oOO0) obj;
            if (Intrinsics.areEqual(this.f35800OooO00o, oo0ooo0.f35800OooO00o) && Intrinsics.areEqual(this.f35801OooO0O0, oo0ooo0.f35801OooO0O0) && this.f35802OooO0OO == oo0ooo0.f35802OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f35800OooO00o.hashCode() * 31;
        String str = this.f35801OooO0O0;
        return this.f35802OooO0OO.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
