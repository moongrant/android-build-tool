package p236o00oOoo0;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO0O extends o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39963OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ClientInfo f39964OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Integer f39965OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<o000OO00> f39966OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f39967OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final QosTier f39968OooO0oO;

    public o000OO0O() {
        throw null;
    }

    public o000OO0O(long j, long j2, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f39962OooO00o = j;
        this.f39963OooO0O0 = j2;
        this.f39964OooO0OO = clientInfo;
        this.f39965OooO0Oo = num;
        this.f39967OooO0o0 = str;
        this.f39966OooO0o = list;
        this.f39968OooO0oO = qosTier;
    }

    @Override // p236o00oOoo0.o000OOo0
    @Nullable
    public final ClientInfo OooO00o() {
        return this.f39964OooO0OO;
    }

    @Override // p236o00oOoo0.o000OOo0
    @Nullable
    @Encodable.Field(name = "logEvent")
    public final List<o000OO00> OooO0O0() {
        return this.f39966OooO0o;
    }

    @Override // p236o00oOoo0.o000OOo0
    @Nullable
    public final Integer OooO0OO() {
        return this.f39965OooO0Oo;
    }

    @Override // p236o00oOoo0.o000OOo0
    @Nullable
    public final String OooO0Oo() {
        return this.f39967OooO0o0;
    }

    @Override // p236o00oOoo0.o000OOo0
    public final long OooO0o() {
        return this.f39962OooO00o;
    }

    @Override // p236o00oOoo0.o000OOo0
    @Nullable
    public final QosTier OooO0o0() {
        return this.f39968OooO0oO;
    }

    @Override // p236o00oOoo0.o000OOo0
    public final long OooO0oO() {
        return this.f39963OooO0O0;
    }

    public final boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<o000OO00> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000OOo0)) {
            return false;
        }
        o000OOo0 o000ooo1 = (o000OOo0) obj;
        if (this.f39962OooO00o == o000ooo1.OooO0o() && this.f39963OooO0O0 == o000ooo1.OooO0oO() && ((clientInfo = this.f39964OooO0OO) != null ? clientInfo.equals(o000ooo1.OooO00o()) : o000ooo1.OooO00o() == null) && ((num = this.f39965OooO0Oo) != null ? num.equals(o000ooo1.OooO0OO()) : o000ooo1.OooO0OO() == null) && ((str = this.f39967OooO0o0) != null ? str.equals(o000ooo1.OooO0Oo()) : o000ooo1.OooO0Oo() == null) && ((list = this.f39966OooO0o) != null ? list.equals(o000ooo1.OooO0O0()) : o000ooo1.OooO0O0() == null)) {
            QosTier qosTier = this.f39968OooO0oO;
            if (qosTier == null) {
                if (o000ooo1.OooO0o0() == null) {
                    return true;
                }
            } else if (qosTier.equals(o000ooo1.OooO0o0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f39962OooO00o;
        long j2 = this.f39963OooO0O0;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f39964OooO0OO;
        int iHashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f39965OooO0Oo;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f39967OooO0o0;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<o000OO00> list = this.f39966OooO0o;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f39968OooO0oO;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f39962OooO00o + ", requestUptimeMs=" + this.f39963OooO0O0 + ", clientInfo=" + this.f39964OooO0OO + ", logSource=" + this.f39965OooO0Oo + ", logSourceName=" + this.f39967OooO0o0 + ", logEvents=" + this.f39966OooO0o + ", qosTier=" + this.f39968OooO0oO + "}";
    }
}
