package p302o0O0o0OO;

import android.support.v4.media.session.OooO0OO;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo extends o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41748OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f41749OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f41750OooO0OO;

    public o0000Ooo(String str, long j, long j2) {
        this.f41748OooO00o = str;
        this.f41749OooO0O0 = j;
        this.f41750OooO0OO = j2;
    }

    @Override // p302o0O0o0OO.o000
    @NonNull
    public final String OooO00o() {
        return this.f41748OooO00o;
    }

    @Override // p302o0O0o0OO.o000
    @NonNull
    public final long OooO0O0() {
        return this.f41750OooO0OO;
    }

    @Override // p302o0O0o0OO.o000
    @NonNull
    public final long OooO0OO() {
        return this.f41749OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000)) {
            return false;
        }
        o000 o000Var = (o000) obj;
        return this.f41748OooO00o.equals(o000Var.OooO00o()) && this.f41749OooO0O0 == o000Var.OooO0OO() && this.f41750OooO0OO == o000Var.OooO0O0();
    }

    public final int hashCode() {
        int iHashCode = (this.f41748OooO00o.hashCode() ^ 1000003) * 1000003;
        long j = this.f41749OooO0O0;
        long j2 = this.f41750OooO0OO;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f41748OooO00o);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f41749OooO0O0);
        sb.append(", tokenCreationTimestamp=");
        return OooO0OO.OooO0O0(sb, this.f41750OooO0OO, "}");
    }
}
