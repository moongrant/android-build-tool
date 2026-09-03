package p191o00o0O0O;

import androidx.annotation.NonNull;
import java.util.Arrays;
import p176o00o0.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo f38934OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f38935OooO0O0;

    public o00O0O(@NonNull OooOo oooOo, @NonNull byte[] bArr) {
        if (oooOo == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f38934OooO00o = oooOo;
        this.f38935OooO0O0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o2 = (o00O0O) obj;
        if (this.f38934OooO00o.equals(o00o0o2.f38934OooO00o)) {
            return Arrays.equals(this.f38935OooO0O0, o00o0o2.f38935OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f38934OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38935OooO0O0);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f38934OooO00o + ", bytes=[...]}";
    }
}
