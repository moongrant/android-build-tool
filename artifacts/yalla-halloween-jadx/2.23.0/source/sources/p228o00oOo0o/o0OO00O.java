package p228o00oOo0o;

import android.net.Uri;
import android.support.v4.media.session.OooO0o;
import androidx.annotation.Nullable;
import p245o00oo0o.o0O000O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39972OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39973OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f39974OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39975OooO0Oo;

    public o0OO00O(long j, long j2, @Nullable String str) {
        this.f39974OooO0OO = str == null ? "" : str;
        this.f39972OooO00o = j;
        this.f39973OooO0O0 = j2;
    }

    @Nullable
    public final o0OO00O OooO00o(@Nullable o0OO00O o0oo00o2, String str) {
        long j;
        String strOooO0OO = o0O000O.OooO0OO(str, this.f39974OooO0OO);
        if (o0oo00o2 == null || !strOooO0OO.equals(o0O000O.OooO0OO(str, o0oo00o2.f39974OooO0OO))) {
            return null;
        }
        long j2 = this.f39973OooO0O0;
        long j3 = o0oo00o2.f39973OooO0O0;
        if (j2 != -1) {
            long j4 = this.f39972OooO00o;
            j = j2;
            if (j4 + j2 == o0oo00o2.f39972OooO00o) {
                return new o0OO00O(j4, j3 == -1 ? -1L : j + j3, strOooO0OO);
            }
        } else {
            j = j2;
        }
        if (j3 == -1) {
            return null;
        }
        long j5 = o0oo00o2.f39972OooO00o;
        if (j5 + j3 == this.f39972OooO00o) {
            return new o0OO00O(j5, j2 == -1 ? -1L : j3 + j, strOooO0OO);
        }
        return null;
    }

    public final Uri OooO0O0(String str) {
        return Uri.parse(o0O000O.OooO0OO(str, this.f39974OooO0OO));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0OO00O.class != obj.getClass()) {
            return false;
        }
        o0OO00O o0oo00o2 = (o0OO00O) obj;
        return this.f39972OooO00o == o0oo00o2.f39972OooO00o && this.f39973OooO0O0 == o0oo00o2.f39973OooO0O0 && this.f39974OooO0OO.equals(o0oo00o2.f39974OooO0OO);
    }

    public final int hashCode() {
        if (this.f39975OooO0Oo == 0) {
            this.f39975OooO0Oo = this.f39974OooO0OO.hashCode() + ((((527 + ((int) this.f39972OooO00o)) * 31) + ((int) this.f39973OooO0O0)) * 31);
        }
        return this.f39975OooO0Oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f39974OooO0OO);
        sb.append(", start=");
        sb.append(this.f39972OooO00o);
        sb.append(", length=");
        return OooO0o.OooO0O0(sb, this.f39973OooO0O0, ")");
    }
}
