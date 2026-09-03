package p236o00oOoo0;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0 extends o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o000OOo0> f39934OooO00o;

    public o000O0(ArrayList arrayList) {
        this.f39934OooO00o = arrayList;
    }

    @Override // p236o00oOoo0.o000O
    @NonNull
    @Encodable.Field(name = "logRequest")
    public final List<o000OOo0> OooO00o() {
        return this.f39934OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o000O) {
            return this.f39934OooO00o.equals(((o000O) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f39934OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f39934OooO00o + "}";
    }
}
