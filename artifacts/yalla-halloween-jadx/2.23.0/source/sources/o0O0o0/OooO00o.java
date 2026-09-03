package o0O0o0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42373OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f42374OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f42375OooO0OO;

    public OooO00o(String str, long j, long j2) {
        this.f42373OooO00o = str;
        this.f42374OooO0O0 = j;
        this.f42375OooO0OO = j2;
    }

    @Override // o0O0o0.OooOOO
    @NonNull
    public final String OooO00o() {
        return this.f42373OooO00o;
    }

    @Override // o0O0o0.OooOOO
    @NonNull
    public final long OooO0O0() {
        return this.f42375OooO0OO;
    }

    @Override // o0O0o0.OooOOO
    @NonNull
    public final long OooO0OO() {
        return this.f42374OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return this.f42373OooO00o.equals(oooOOO.OooO00o()) && this.f42374OooO0O0 == oooOOO.OooO0OO() && this.f42375OooO0OO == oooOOO.OooO0O0();
    }

    public final int hashCode() {
        int iHashCode = (this.f42373OooO00o.hashCode() ^ 1000003) * 1000003;
        long j = this.f42374OooO0O0;
        long j2 = this.f42375OooO0OO;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f42373OooO00o);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f42374OooO0O0);
        sb.append(", tokenCreationTimestamp=");
        return android.support.v4.media.session.OooO0o.OooO0O0(sb, this.f42375OooO0OO, "}");
    }
}
