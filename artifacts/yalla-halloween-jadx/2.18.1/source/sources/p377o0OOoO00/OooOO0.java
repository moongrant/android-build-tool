package p377o0OOoO00;

import OooO00o.OooO00o;
import android.support.v4.media.session.OooOOO0;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38689OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f38690OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f38691OooO0OO;

    public OooOO0(String str, long j, long j2) {
        this.f38689OooO00o = str;
        this.f38690OooO0O0 = j;
        this.f38691OooO0OO = j2;
    }

    @Override // p377o0OOoO00.Oooo000
    @NonNull
    public final String OooO00o() {
        return this.f38689OooO00o;
    }

    @Override // p377o0OOoO00.Oooo000
    @NonNull
    public final long OooO0O0() {
        return this.f38691OooO0OO;
    }

    @Override // p377o0OOoO00.Oooo000
    @NonNull
    public final long OooO0OO() {
        return this.f38690OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        return this.f38689OooO00o.equals(oooo000.OooO00o()) && this.f38690OooO0O0 == oooo000.OooO0OO() && this.f38691OooO0OO == oooo000.OooO0O0();
    }

    public final int hashCode() {
        int iHashCode = (this.f38689OooO00o.hashCode() ^ 1000003) * 1000003;
        long j = this.f38690OooO0O0;
        long j2 = this.f38691OooO0OO;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("InstallationTokenResult{token=");
        sbOooO0o0.append(this.f38689OooO00o);
        sbOooO0o0.append(", tokenExpirationTimestamp=");
        sbOooO0o0.append(this.f38690OooO0O0);
        sbOooO0o0.append(", tokenCreationTimestamp=");
        return OooOOO0.OooO00o(sbOooO0o0, this.f38691OooO0OO, "}");
    }
}
