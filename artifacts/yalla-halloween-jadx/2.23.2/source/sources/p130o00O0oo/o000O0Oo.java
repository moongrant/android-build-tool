package p130o00O0oo;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o000O0Oo f36770OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000Oo0 f36771OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000Oo0 f36772OooO0O0;

    static {
        o000Oo0.OooO0O0 oooO0O0 = o000Oo0.OooO0O0.f36778OooO00o;
        f36770OooO0OO = new o000O0Oo(oooO0O0, oooO0O0);
    }

    public o000O0Oo(@NotNull o000Oo0 o000oo1, @NotNull o000Oo0 o000oo2) {
        this.f36771OooO00o = o000oo1;
        this.f36772OooO0O0 = o000oo2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O0Oo)) {
            return false;
        }
        o000O0Oo o000o0oo2 = (o000O0Oo) obj;
        return Intrinsics.areEqual(this.f36771OooO00o, o000o0oo2.f36771OooO00o) && Intrinsics.areEqual(this.f36772OooO0O0, o000o0oo2.f36772OooO0O0);
    }

    public final int hashCode() {
        return this.f36772OooO0O0.hashCode() + (this.f36771OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "Size(width=" + this.f36771OooO00o + ", height=" + this.f36772OooO0O0 + ')';
    }
}
