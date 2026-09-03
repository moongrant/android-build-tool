package p287o0O0O0oo;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p286o0O0O0oO.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 extends o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Iterable<oo000o> f35519OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f35520OooO0O0;

    public o00000O0(Iterable iterable, byte[] bArr, OooO00o oooO00o) {
        this.f35519OooO00o = iterable;
        this.f35520OooO0O0 = bArr;
    }

    @Override // p287o0O0O0oo.o0000O00
    public final Iterable<oo000o> OooO00o() {
        return this.f35519OooO00o;
    }

    @Override // p287o0O0O0oo.o0000O00
    @Nullable
    public final byte[] OooO0O0() {
        return this.f35520OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0000O00)) {
            return false;
        }
        o0000O00 o0000o00 = (o0000O00) obj;
        if (this.f35519OooO00o.equals(o0000o00.OooO00o())) {
            if (Arrays.equals(this.f35520OooO0O0, o0000o00 instanceof o00000O0 ? ((o00000O0) o0000o00).f35520OooO0O0 : o0000o00.OooO0O0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f35519OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f35520OooO0O0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("BackendRequest{events=");
        sbOooO0o0.append(this.f35519OooO00o);
        sbOooO0o0.append(", extras=");
        sbOooO0o0.append(Arrays.toString(this.f35520OooO0O0));
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
