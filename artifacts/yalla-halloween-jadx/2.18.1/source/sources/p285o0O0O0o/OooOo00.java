package p285o0O0O0o;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o00O0O> f35409OooO00o;

    public OooOo00(List<o00O0O> list) {
        this.f35409OooO00o = list;
    }

    @Override // p285o0O0O0o.o000oOoO
    @NonNull
    @Encodable.Field(name = "logRequest")
    public final List<o00O0O> OooO00o() {
        return this.f35409OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o000oOoO) {
            return this.f35409OooO00o.equals(((o000oOoO) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f35409OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("BatchedLogRequest{logRequests=");
        sbOooO0o0.append(this.f35409OooO00o);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
