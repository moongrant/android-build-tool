package o00OO000;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o00oO0o;
import p131o00O0oo0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0o f37069OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f37070OooO0O0;

    public static final class OooO00o implements OooO0OO.OooO00o {
        @Override // o00OO000.OooO0OO.OooO00o
        @NotNull
        public final OooO0OO OooO00o(@NotNull OooO0o oooO0o, @NotNull o0Oo0oo o0oo0oo2) {
            return new OooO0O0(oooO0o, o0oo0oo2);
        }

        public final boolean equals(@Nullable Object obj) {
            return obj instanceof OooO00o;
        }

        public final int hashCode() {
            return OooO00o.class.hashCode();
        }
    }

    public OooO0O0(@NotNull OooO0o oooO0o, @NotNull o0Oo0oo o0oo0oo2) {
        this.f37069OooO00o = oooO0o;
        this.f37070OooO0O0 = o0oo0oo2;
    }

    @Override // o00OO000.OooO0OO
    public final void OooO00o() {
        o0Oo0oo o0oo0oo2 = this.f37070OooO0O0;
        boolean z = o0oo0oo2 instanceof o000000O;
        OooO0o oooO0o = this.f37069OooO00o;
        if (z) {
            oooO0o.OooO00o(((o000000O) o0oo0oo2).f36784OooO00o);
        } else if (o0oo0oo2 instanceof o00oO0o) {
            oooO0o.OooO0OO(o0oo0oo2.OooO00o());
        }
    }
}
