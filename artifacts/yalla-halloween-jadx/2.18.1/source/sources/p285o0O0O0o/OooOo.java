package p285o0O0O0o;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo extends o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f35395OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f35396OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35397OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f35398OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f35399OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f35400OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final NetworkConnectionInfo f35401OooO0oO;

    public static final class OooO00o extends o0OoOo0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f35402OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f35403OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f35404OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f35405OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f35406OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f35407OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public NetworkConnectionInfo f35408OooO0oO;
    }

    public OooOo(long j, Integer num, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo) {
        this.f35395OooO00o = j;
        this.f35396OooO0O0 = num;
        this.f35397OooO0OO = j2;
        this.f35398OooO0Oo = bArr;
        this.f35400OooO0o0 = str;
        this.f35399OooO0o = j3;
        this.f35401OooO0oO = networkConnectionInfo;
    }

    @Override // p285o0O0O0o.o0OoOo0
    @Nullable
    public final Integer OooO00o() {
        return this.f35396OooO0O0;
    }

    @Override // p285o0O0O0o.o0OoOo0
    public final long OooO0O0() {
        return this.f35395OooO00o;
    }

    @Override // p285o0O0O0o.o0OoOo0
    public final long OooO0OO() {
        return this.f35397OooO0OO;
    }

    @Override // p285o0O0O0o.o0OoOo0
    @Nullable
    public final NetworkConnectionInfo OooO0Oo() {
        return this.f35401OooO0oO;
    }

    @Override // p285o0O0O0o.o0OoOo0
    @Nullable
    public final String OooO0o() {
        return this.f35400OooO0o0;
    }

    @Override // p285o0O0O0o.o0OoOo0
    @Nullable
    public final byte[] OooO0o0() {
        return this.f35398OooO0Oo;
    }

    @Override // p285o0O0O0o.o0OoOo0
    public final long OooO0oO() {
        return this.f35399OooO0o;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0OoOo0)) {
            return false;
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) obj;
        if (this.f35395OooO00o == o0oooo1.OooO0O0() && ((num = this.f35396OooO0O0) != null ? num.equals(o0oooo1.OooO00o()) : o0oooo1.OooO00o() == null) && this.f35397OooO0OO == o0oooo1.OooO0OO()) {
            if (Arrays.equals(this.f35398OooO0Oo, o0oooo1 instanceof OooOo ? ((OooOo) o0oooo1).f35398OooO0Oo : o0oooo1.OooO0o0()) && ((str = this.f35400OooO0o0) != null ? str.equals(o0oooo1.OooO0o()) : o0oooo1.OooO0o() == null) && this.f35399OooO0o == o0oooo1.OooO0oO()) {
                NetworkConnectionInfo networkConnectionInfo = this.f35401OooO0oO;
                if (networkConnectionInfo == null) {
                    if (o0oooo1.OooO0Oo() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(o0oooo1.OooO0Oo())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f35395OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f35396OooO0O0;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f35397OooO0OO;
        int iHashCode2 = (((((i ^ iHashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f35398OooO0Oo)) * 1000003;
        String str = this.f35400OooO0o0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f35399OooO0o;
        int i2 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f35401OooO0oO;
        return i2 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LogEvent{eventTimeMs=");
        sbOooO0o0.append(this.f35395OooO00o);
        sbOooO0o0.append(", eventCode=");
        sbOooO0o0.append(this.f35396OooO0O0);
        sbOooO0o0.append(", eventUptimeMs=");
        sbOooO0o0.append(this.f35397OooO0OO);
        sbOooO0o0.append(", sourceExtension=");
        sbOooO0o0.append(Arrays.toString(this.f35398OooO0Oo));
        sbOooO0o0.append(", sourceExtensionJsonProto3=");
        sbOooO0o0.append(this.f35400OooO0o0);
        sbOooO0o0.append(", timezoneOffsetSeconds=");
        sbOooO0o0.append(this.f35399OooO0o);
        sbOooO0o0.append(", networkConnectionInfo=");
        sbOooO0o0.append(this.f35401OooO0oO);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
