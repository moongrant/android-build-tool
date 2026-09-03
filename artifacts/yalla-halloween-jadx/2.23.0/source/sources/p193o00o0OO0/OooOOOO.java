package p193o00o0OO0;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p191o00o0O0O.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Iterable<o00Oo0> f38952OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f38953OooO0O0;

    public OooOOOO(Iterable iterable, byte[] bArr) {
        this.f38952OooO00o = iterable;
        this.f38953OooO0O0 = bArr;
    }

    @Override // p193o00o0OO0.o000oOoO
    public final Iterable<o00Oo0> OooO00o() {
        return this.f38952OooO00o;
    }

    @Override // p193o00o0OO0.o000oOoO
    @Nullable
    public final byte[] OooO0O0() {
        return this.f38953OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000oOoO)) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        if (this.f38952OooO00o.equals(o000oooo2.OooO00o())) {
            if (Arrays.equals(this.f38953OooO0O0, o000oooo2 instanceof OooOOOO ? ((OooOOOO) o000oooo2).f38953OooO0O0 : o000oooo2.OooO0O0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f38952OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38953OooO0O0);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f38952OooO00o + ", extras=" + Arrays.toString(this.f38953OooO0O0) + "}";
    }
}
