package o00O0000;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p109o000ooo.o00Oo0;
import p109o000ooo.o00oO0o;
import p109o000ooo.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0o f36269OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00oO0o f36270OooO0O0;

    public static final class OooO00o implements OooO0OO.OooO00o {
        @Override // o00O0000.OooO0OO.OooO00o
        @NotNull
        public final OooO0OO OooO00o(@NotNull OooO0o oooO0o, @NotNull o00oO0o o00oo0o2) {
            return new OooO0O0(oooO0o, o00oo0o2);
        }

        public final boolean equals(@Nullable Object obj) {
            return obj instanceof OooO00o;
        }

        public final int hashCode() {
            return OooO00o.class.hashCode();
        }
    }

    public OooO0O0(@NotNull OooO0o oooO0o, @NotNull o00oO0o o00oo0o2) {
        this.f36269OooO00o = oooO0o;
        this.f36270OooO0O0 = o00oo0o2;
    }

    @Override // o00O0000.OooO0OO
    public final void OooO00o() {
        o00oO0o o00oo0o2 = this.f36270OooO0O0;
        boolean z = o00oo0o2 instanceof o0O0O00;
        OooO0o oooO0o = this.f36269OooO00o;
        if (z) {
            oooO0o.OooO00o(((o0O0O00) o00oo0o2).f35849OooO00o);
        } else if (o00oo0o2 instanceof o00Oo0) {
            oooO0o.OooO0OO(o00oo0o2.OooO00o());
        }
    }
}
