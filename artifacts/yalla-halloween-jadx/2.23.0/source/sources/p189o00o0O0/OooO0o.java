package p189o00o0O0;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooOOOO> f38846OooO00o;

    public OooO0o(ArrayList arrayList) {
        this.f38846OooO00o = arrayList;
    }

    @Override // p189o00o0O0.OooOOO0
    @NonNull
    @Encodable.Field(name = "logRequest")
    public final List<OooOOOO> OooO00o() {
        return this.f38846OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOOO0) {
            return this.f38846OooO00o.equals(((OooOOO0) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f38846OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f38846OooO00o + "}";
    }
}
