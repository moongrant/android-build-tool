package p039OoooOoo;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O extends o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f1631OooO00o;

    public o000OO0O(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f1631OooO00o = uri;
    }

    @Override // p039OoooOoo.o00O000
    @NonNull
    public final Uri OooO00o() {
        return this.f1631OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O000) {
            return this.f1631OooO00o.equals(((o00O000) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1631OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.f1631OooO00o + "}";
    }
}
