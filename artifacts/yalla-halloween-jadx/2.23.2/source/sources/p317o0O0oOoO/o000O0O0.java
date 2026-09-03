package p317o0O0oOoO;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0O0 extends o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<String> f41943OooO00o;

    public o000O0O0(HashSet hashSet) {
        this.f41943OooO00o = hashSet;
    }

    @Override // p317o0O0oOoO.o000O
    @NonNull
    public final Set<String> OooO00o() {
        return this.f41943OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o000O) {
            return this.f41943OooO00o.equals(((o000O) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f41943OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f41943OooO00o + "}";
    }
}
