package p285o0O0O0o;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f35411OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f35412OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ClientInfo f35413OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Integer f35414OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<o0OoOo0> f35415OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f35416OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final QosTier f35417OooO0oO;

    public Oooo000(long j, long j2, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier, OooO00o oooO00o) {
        this.f35411OooO00o = j;
        this.f35412OooO0O0 = j2;
        this.f35413OooO0OO = clientInfo;
        this.f35414OooO0Oo = num;
        this.f35416OooO0o0 = str;
        this.f35415OooO0o = list;
        this.f35417OooO0oO = qosTier;
    }

    @Override // p285o0O0O0o.o00O0O
    @Nullable
    public final ClientInfo OooO00o() {
        return this.f35413OooO0OO;
    }

    @Override // p285o0O0O0o.o00O0O
    @Nullable
    @Encodable.Field(name = "logEvent")
    public final List<o0OoOo0> OooO0O0() {
        return this.f35415OooO0o;
    }

    @Override // p285o0O0O0o.o00O0O
    @Nullable
    public final Integer OooO0OO() {
        return this.f35414OooO0Oo;
    }

    @Override // p285o0O0O0o.o00O0O
    @Nullable
    public final String OooO0Oo() {
        return this.f35416OooO0o0;
    }

    @Override // p285o0O0O0o.o00O0O
    public final long OooO0o() {
        return this.f35411OooO00o;
    }

    @Override // p285o0O0O0o.o00O0O
    @Nullable
    public final QosTier OooO0o0() {
        return this.f35417OooO0oO;
    }

    @Override // p285o0O0O0o.o00O0O
    public final long OooO0oO() {
        return this.f35412OooO0O0;
    }

    public final boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<o0OoOo0> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o2 = (o00O0O) obj;
        if (this.f35411OooO00o == o00o0o2.OooO0o() && this.f35412OooO0O0 == o00o0o2.OooO0oO() && ((clientInfo = this.f35413OooO0OO) != null ? clientInfo.equals(o00o0o2.OooO00o()) : o00o0o2.OooO00o() == null) && ((num = this.f35414OooO0Oo) != null ? num.equals(o00o0o2.OooO0OO()) : o00o0o2.OooO0OO() == null) && ((str = this.f35416OooO0o0) != null ? str.equals(o00o0o2.OooO0Oo()) : o00o0o2.OooO0Oo() == null) && ((list = this.f35415OooO0o) != null ? list.equals(o00o0o2.OooO0O0()) : o00o0o2.OooO0O0() == null)) {
            QosTier qosTier = this.f35417OooO0oO;
            if (qosTier == null) {
                if (o00o0o2.OooO0o0() == null) {
                    return true;
                }
            } else if (qosTier.equals(o00o0o2.OooO0o0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f35411OooO00o;
        long j2 = this.f35412OooO0O0;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f35413OooO0OO;
        int iHashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f35414OooO0Oo;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f35416OooO0o0;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<o0OoOo0> list = this.f35415OooO0o;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f35417OooO0oO;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LogRequest{requestTimeMs=");
        sbOooO0o0.append(this.f35411OooO00o);
        sbOooO0o0.append(", requestUptimeMs=");
        sbOooO0o0.append(this.f35412OooO0O0);
        sbOooO0o0.append(", clientInfo=");
        sbOooO0o0.append(this.f35413OooO0OO);
        sbOooO0o0.append(", logSource=");
        sbOooO0o0.append(this.f35414OooO0Oo);
        sbOooO0o0.append(", logSourceName=");
        sbOooO0o0.append(this.f35416OooO0o0);
        sbOooO0o0.append(", logEvents=");
        sbOooO0o0.append(this.f35415OooO0o);
        sbOooO0o0.append(", qosTier=");
        sbOooO0o0.append(this.f35417OooO0oO);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
