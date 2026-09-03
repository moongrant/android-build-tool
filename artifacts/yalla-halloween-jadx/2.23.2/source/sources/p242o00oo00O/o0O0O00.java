package p242o00oo00O;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p238o00oOooo.o0O0oo00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 extends o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Iterable<o0O0oo00> f40076OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f40077OooO0O0;

    public o0O0O00(Iterable iterable, byte[] bArr) {
        this.f40076OooO00o = iterable;
        this.f40077OooO0O0 = bArr;
    }

    @Override // p242o00oo00O.o00000O0
    public final Iterable<o0O0oo00> OooO00o() {
        return this.f40076OooO00o;
    }

    @Override // p242o00oo00O.o00000O0
    @Nullable
    public final byte[] OooO0O0() {
        return this.f40077OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00000O0)) {
            return false;
        }
        o00000O0 o00000o1 = (o00000O0) obj;
        if (this.f40076OooO00o.equals(o00000o1.OooO00o())) {
            if (Arrays.equals(this.f40077OooO0O0, o00000o1 instanceof o0O0O00 ? ((o0O0O00) o00000o1).f40077OooO0O0 : o00000o1.OooO0O0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f40076OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f40077OooO0O0);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f40076OooO00o + ", extras=" + Arrays.toString(this.f40077OooO0O0) + "}";
    }
}
