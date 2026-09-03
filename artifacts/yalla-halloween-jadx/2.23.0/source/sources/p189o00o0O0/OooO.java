package p189o00o0O0;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f38820OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f38821OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f38822OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f38823OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f38824OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f38825OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final NetworkConnectionInfo f38826OooO0oO;

    public static final class OooO00o extends OooOOO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f38827OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f38828OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f38829OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f38830OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f38831OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f38832OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public NetworkConnectionInfo f38833OooO0oO;
    }

    public OooO(long j, Integer num, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo) {
        this.f38820OooO00o = j;
        this.f38821OooO0O0 = num;
        this.f38822OooO0OO = j2;
        this.f38823OooO0Oo = bArr;
        this.f38825OooO0o0 = str;
        this.f38824OooO0o = j3;
        this.f38826OooO0oO = networkConnectionInfo;
    }

    @Override // p189o00o0O0.OooOOO
    @Nullable
    public final Integer OooO00o() {
        return this.f38821OooO0O0;
    }

    @Override // p189o00o0O0.OooOOO
    public final long OooO0O0() {
        return this.f38820OooO00o;
    }

    @Override // p189o00o0O0.OooOOO
    public final long OooO0OO() {
        return this.f38822OooO0OO;
    }

    @Override // p189o00o0O0.OooOOO
    @Nullable
    public final NetworkConnectionInfo OooO0Oo() {
        return this.f38826OooO0oO;
    }

    @Override // p189o00o0O0.OooOOO
    @Nullable
    public final String OooO0o() {
        return this.f38825OooO0o0;
    }

    @Override // p189o00o0O0.OooOOO
    @Nullable
    public final byte[] OooO0o0() {
        return this.f38823OooO0Oo;
    }

    @Override // p189o00o0O0.OooOOO
    public final long OooO0oO() {
        return this.f38824OooO0o;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        if (this.f38820OooO00o == oooOOO.OooO0O0() && ((num = this.f38821OooO0O0) != null ? num.equals(oooOOO.OooO00o()) : oooOOO.OooO00o() == null) && this.f38822OooO0OO == oooOOO.OooO0OO()) {
            if (Arrays.equals(this.f38823OooO0Oo, oooOOO instanceof OooO ? ((OooO) oooOOO).f38823OooO0Oo : oooOOO.OooO0o0()) && ((str = this.f38825OooO0o0) != null ? str.equals(oooOOO.OooO0o()) : oooOOO.OooO0o() == null) && this.f38824OooO0o == oooOOO.OooO0oO()) {
                NetworkConnectionInfo networkConnectionInfo = this.f38826OooO0oO;
                if (networkConnectionInfo == null) {
                    if (oooOOO.OooO0Oo() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(oooOOO.OooO0Oo())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f38820OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f38821OooO0O0;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.f38822OooO0OO;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f38823OooO0Oo)) * 1000003;
        String str = this.f38825OooO0o0;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f38824OooO0o;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f38826OooO0oO;
        return i2 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f38820OooO00o + ", eventCode=" + this.f38821OooO0O0 + ", eventUptimeMs=" + this.f38822OooO0OO + ", sourceExtension=" + Arrays.toString(this.f38823OooO0Oo) + ", sourceExtensionJsonProto3=" + this.f38825OooO0o0 + ", timezoneOffsetSeconds=" + this.f38824OooO0o + ", networkConnectionInfo=" + this.f38826OooO0oO + "}";
    }
}
