package p286o0O0O0oO;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;
import o0O0O0Oo.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f35495OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f35496OooO0O0;

    public o00Ooo(@NonNull OooO0O0 oooO0O0, @NonNull byte[] bArr) {
        Objects.requireNonNull(oooO0O0, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f35495OooO00o = oooO0O0;
        this.f35496OooO0O0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        if (this.f35495OooO00o.equals(o00ooo2.f35495OooO00o)) {
            return Arrays.equals(this.f35496OooO0O0, o00ooo2.f35496OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f35495OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f35496OooO0O0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("EncodedPayload{encoding=");
        sbOooO0o0.append(this.f35495OooO00o);
        sbOooO0o0.append(", bytes=[...]}");
        return sbOooO0o0.toString();
    }
}
