package p102o000oo;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<OooO00o> f29804OooO00o = new HashSet();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Uri f29805OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f29806OooO0O0;

        public OooO00o(@NonNull Uri uri, boolean z) {
            this.f29805OooO00o = uri;
            this.f29806OooO0O0 = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f29806OooO0O0 == oooO00o.f29806OooO0O0 && this.f29805OooO00o.equals(oooO00o.f29805OooO00o);
        }

        public final int hashCode() {
            return (this.f29805OooO00o.hashCode() * 31) + (this.f29806OooO0O0 ? 1 : 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<o000oo.OooOOO0$OooO00o>] */
    public final int OooO00o() {
        return this.f29804OooO00o.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooOOO0.class != obj.getClass()) {
            return false;
        }
        return this.f29804OooO00o.equals(((OooOOO0) obj).f29804OooO00o);
    }

    public final int hashCode() {
        return this.f29804OooO00o.hashCode();
    }
}
