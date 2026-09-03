package p111o000oooO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000 implements o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O00 f35926OooO00o;

    public o00O000(@NotNull o00O00 o00o01) {
        this.f35926OooO00o = o00o01;
    }

    @Override // p111o000oooO.o00O00O
    @Nullable
    public final Object OooO00o(@NotNull o000O00 o000o01) {
        return this.f35926OooO00o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00O000) {
            if (Intrinsics.areEqual(this.f35926OooO00o, ((o00O000) obj).f35926OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35926OooO00o.hashCode();
    }
}
