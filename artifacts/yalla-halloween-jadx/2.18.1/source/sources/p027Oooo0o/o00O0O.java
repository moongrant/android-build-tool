package p027Oooo0o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OOo<OooO00o> f1973OooO00o = new o000OOo<>(new OooO00o[16]);

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f1974OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f1975OooO0O0;

        public OooO00o(int i, int i2) {
            this.f1974OooO00o = i;
            this.f1975OooO0O0 = i2;
            if (!(i >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i2 >= i)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f1974OooO00o == oooO00o.f1974OooO00o && this.f1975OooO0O0 == oooO00o.f1975OooO0O0;
        }

        public final int hashCode() {
            return (this.f1974OooO00o * 31) + this.f1975OooO0O0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Interval(start=");
            sbOooO0o0.append(this.f1974OooO00o);
            sbOooO0o0.append(", end=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f1975OooO0O0, ')');
        }
    }

    @NotNull
    public final OooO00o OooO00o(int i, int i2) {
        OooO00o oooO00o = new OooO00o(i, i2);
        this.f1973OooO00o.OooO0O0(oooO00o);
        return oooO00o;
    }

    public final int OooO0O0() {
        o000OOo<OooO00o> o000ooo2 = this.f1973OooO00o;
        if (o000ooo2.OooO()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        int i = 0;
        int i2 = o000ooo2.f3662Oooo0o[0].f1975OooO0O0;
        o000OOo<OooO00o> o000ooo3 = this.f1973OooO00o;
        int i3 = o000ooo3.f3664Oooo0oo;
        if (i3 > 0) {
            OooO00o[] oooO00oArr = o000ooo3.f3662Oooo0o;
            do {
                int i4 = oooO00oArr[i].f1975OooO0O0;
                if (i4 > i2) {
                    i2 = i4;
                }
                i++;
            } while (i < i3);
        }
        return i2;
    }

    public final int OooO0OO() {
        o000OOo<OooO00o> o000ooo2 = this.f1973OooO00o;
        if (o000ooo2.OooO()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        int i = o000ooo2.f3662Oooo0o[0].f1974OooO00o;
        o000OOo<OooO00o> o000ooo3 = this.f1973OooO00o;
        int i2 = o000ooo3.f3664Oooo0oo;
        if (i2 > 0) {
            OooO00o[] oooO00oArr = o000ooo3.f3662Oooo0o;
            int i3 = 0;
            do {
                int i4 = oooO00oArr[i3].f1974OooO00o;
                if (i4 < i) {
                    i = i4;
                }
                i3++;
            } while (i3 < i2);
        }
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean OooO0Oo() {
        return this.f1973OooO00o.OooOO0();
    }

    public final void OooO0o0(@NotNull OooO00o interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f1973OooO00o.OooOO0O(interval);
    }
}
