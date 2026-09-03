package p239o00oOooo;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Objects;
import p100o000oOoO.o0;
import p217o00oO00o.o000000;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o000000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f34112OooO0O0;

    public b(@NonNull Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f34112OooO0O0 = obj;
    }

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f34112OooO0O0.toString().getBytes(o000000.f33631OooO00o));
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f34112OooO0O0.equals(((b) obj).f34112OooO0O0);
        }
        return false;
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        return this.f34112OooO0O0.hashCode();
    }

    public final String toString() {
        return o0.OooO00o(OooO00o.OooO0o0("ObjectKey{object="), this.f34112OooO0O0, '}');
    }
}
