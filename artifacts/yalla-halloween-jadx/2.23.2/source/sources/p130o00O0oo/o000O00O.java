package p130o00O0oo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f36769OooO00o;

    public o000O00O(@NotNull o000O0Oo o000o0oo2) {
        this.f36769OooO00o = o000o0oo2;
    }

    @Override // p130o00O0oo.o000OO0O
    @Nullable
    public final Object OooO0O0(@NotNull o0000 o0000Var) {
        return this.f36769OooO00o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000O00O) {
            if (Intrinsics.areEqual(this.f36769OooO00o, ((o000O00O) obj).f36769OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36769OooO00o.hashCode();
    }
}
