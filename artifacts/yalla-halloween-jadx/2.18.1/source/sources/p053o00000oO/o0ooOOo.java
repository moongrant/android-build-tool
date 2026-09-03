package p053o00000oO;

import OooO00o.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo implements o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27155OooO00o;

    public o0ooOOo(int i) {
        this.f27155OooO00o = i;
    }

    @Override // p053o00000oO.o0000O
    public final o000OOo OooO00o(o000OOo o000ooo2) {
        return o000ooo2;
    }

    @Override // p053o00000oO.o0000O
    @NotNull
    public final o0000O00 OooO0O0(@NotNull o0000O00 fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int i = this.f27155OooO00o;
        return (i == 0 || i == Integer.MAX_VALUE) ? fontWeight : new o0000O00(RangesKt.coerceIn(fontWeight.f27133Oooo0o + i, 1, 1000));
    }

    @Override // p053o00000oO.o0000O
    public final int OooO0OO(int i) {
        return i;
    }

    @Override // p053o00000oO.o0000O
    public final int OooO0Oo(int i) {
        return i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0ooOOo) && this.f27155OooO00o == ((o0ooOOo) obj).f27155OooO00o;
    }

    public final int hashCode() {
        return this.f27155OooO00o;
    }

    @NotNull
    public final String toString() {
        return o0O0ooO.OooO00o(OooO00o.OooO0o0("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f27155OooO00o, ')');
    }
}
