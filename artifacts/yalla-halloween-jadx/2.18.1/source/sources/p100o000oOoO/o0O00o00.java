package p100o000oOoO;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f29540OooO00o;

    public o0O00o00(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f29540OooO00o = key;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0O00o00) && Intrinsics.areEqual(this.f29540OooO00o, ((o0O00o00) obj).f29540OooO00o);
    }

    public final int hashCode() {
        return this.f29540OooO00o.hashCode();
    }

    @NotNull
    public final String toString() {
        return o00oO0o.OooO0O0(OooO00o.OooO0o0("OpaqueKey(key="), this.f29540OooO00o, ')');
    }
}
