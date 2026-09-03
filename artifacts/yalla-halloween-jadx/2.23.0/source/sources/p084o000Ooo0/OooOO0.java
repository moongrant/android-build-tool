package p084o000Ooo0;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f35097OooO00o = new HashSet();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Uri f35098OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f35099OooO0O0;

        public OooO00o(boolean z, @NonNull Uri uri) {
            this.f35098OooO00o = uri;
            this.f35099OooO0O0 = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f35099OooO0O0 == oooO00o.f35099OooO0O0 && this.f35098OooO00o.equals(oooO00o.f35098OooO00o);
        }

        public final int hashCode() {
            return (this.f35098OooO00o.hashCode() * 31) + (this.f35099OooO0O0 ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooOO0.class != obj.getClass()) {
            return false;
        }
        return this.f35097OooO00o.equals(((OooOO0) obj).f35097OooO00o);
    }

    public final int hashCode() {
        return this.f35097OooO00o.hashCode();
    }
}
