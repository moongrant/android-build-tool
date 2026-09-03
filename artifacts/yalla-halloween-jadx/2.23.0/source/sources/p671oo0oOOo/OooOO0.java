package p671oo0oOOo;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<String> f60909OooO00o;

    public OooOO0(HashSet hashSet) {
        this.f60909OooO00o = hashSet;
    }

    @Override // p671oo0oOOo.OooOO0O
    @NonNull
    public final Set<String> OooO00o() {
        return this.f60909OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOO0O) {
            return this.f60909OooO00o.equals(((OooOO0O) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f60909OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f60909OooO00o + "}";
    }
}
