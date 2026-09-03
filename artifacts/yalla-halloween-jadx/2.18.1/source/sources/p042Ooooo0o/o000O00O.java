package p042Ooooo0o;

import OooO00o.OooO00o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f3773OooO00o = 0;

    public o000O00O() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o000O00O) && this.f3773OooO00o == ((o000O00O) obj).f3773OooO00o;
    }

    public final int hashCode() {
        return this.f3773OooO00o;
    }

    @NotNull
    public final String toString() {
        return o0O0ooO.OooO00o(OooO00o.OooO0o0("DeltaCounter(count="), this.f3773OooO00o, ')');
    }

    public o000O00O(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
