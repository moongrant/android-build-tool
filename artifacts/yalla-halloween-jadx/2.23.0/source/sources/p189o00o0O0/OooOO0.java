package p189o00o0O0;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f38847OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f38848OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ClientInfo f38849OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Integer f38850OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<OooOOO> f38851OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f38852OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final QosTier f38853OooO0oO;

    public OooOO0() {
        throw null;
    }

    public OooOO0(long j, long j2, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f38847OooO00o = j;
        this.f38848OooO0O0 = j2;
        this.f38849OooO0OO = clientInfo;
        this.f38850OooO0Oo = num;
        this.f38852OooO0o0 = str;
        this.f38851OooO0o = list;
        this.f38853OooO0oO = qosTier;
    }

    @Override // p189o00o0O0.OooOOOO
    @Nullable
    public final ClientInfo OooO00o() {
        return this.f38849OooO0OO;
    }

    @Override // p189o00o0O0.OooOOOO
    @Nullable
    @Encodable.Field(name = "logEvent")
    public final List<OooOOO> OooO0O0() {
        return this.f38851OooO0o;
    }

    @Override // p189o00o0O0.OooOOOO
    @Nullable
    public final Integer OooO0OO() {
        return this.f38850OooO0Oo;
    }

    @Override // p189o00o0O0.OooOOOO
    @Nullable
    public final String OooO0Oo() {
        return this.f38852OooO0o0;
    }

    @Override // p189o00o0O0.OooOOOO
    public final long OooO0o() {
        return this.f38847OooO00o;
    }

    @Override // p189o00o0O0.OooOOOO
    @Nullable
    public final QosTier OooO0o0() {
        return this.f38853OooO0oO;
    }

    @Override // p189o00o0O0.OooOOOO
    public final long OooO0oO() {
        return this.f38848OooO0O0;
    }

    public final boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<OooOOO> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        if (this.f38847OooO00o == oooOOOO.OooO0o() && this.f38848OooO0O0 == oooOOOO.OooO0oO() && ((clientInfo = this.f38849OooO0OO) != null ? clientInfo.equals(oooOOOO.OooO00o()) : oooOOOO.OooO00o() == null) && ((num = this.f38850OooO0Oo) != null ? num.equals(oooOOOO.OooO0OO()) : oooOOOO.OooO0OO() == null) && ((str = this.f38852OooO0o0) != null ? str.equals(oooOOOO.OooO0Oo()) : oooOOOO.OooO0Oo() == null) && ((list = this.f38851OooO0o) != null ? list.equals(oooOOOO.OooO0O0()) : oooOOOO.OooO0O0() == null)) {
            QosTier qosTier = this.f38853OooO0oO;
            if (qosTier == null) {
                if (oooOOOO.OooO0o0() == null) {
                    return true;
                }
            } else if (qosTier.equals(oooOOOO.OooO0o0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f38847OooO00o;
        long j2 = this.f38848OooO0O0;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f38849OooO0OO;
        int iHashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f38850OooO0Oo;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f38852OooO0o0;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<OooOOO> list = this.f38851OooO0o;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f38853OooO0oO;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f38847OooO00o + ", requestUptimeMs=" + this.f38848OooO0O0 + ", clientInfo=" + this.f38849OooO0OO + ", logSource=" + this.f38850OooO0Oo + ", logSourceName=" + this.f38852OooO0o0 + ", logEvents=" + this.f38851OooO0o + ", qosTier=" + this.f38853OooO0oO + "}";
    }
}
