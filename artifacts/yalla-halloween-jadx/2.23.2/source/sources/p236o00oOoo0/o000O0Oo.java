package p236o00oOoo0;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0Oo extends o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39948OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f39949OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39950OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f39951OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f39952OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f39953OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final NetworkConnectionInfo f39954OooO0oO;

    public static final class OooO00o extends o000OO00.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f39955OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f39956OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f39957OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f39958OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f39959OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f39960OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public NetworkConnectionInfo f39961OooO0oO;
    }

    public o000O0Oo(long j, Integer num, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo) {
        this.f39948OooO00o = j;
        this.f39949OooO0O0 = num;
        this.f39950OooO0OO = j2;
        this.f39951OooO0Oo = bArr;
        this.f39953OooO0o0 = str;
        this.f39952OooO0o = j3;
        this.f39954OooO0oO = networkConnectionInfo;
    }

    @Override // p236o00oOoo0.o000OO00
    @Nullable
    public final Integer OooO00o() {
        return this.f39949OooO0O0;
    }

    @Override // p236o00oOoo0.o000OO00
    public final long OooO0O0() {
        return this.f39948OooO00o;
    }

    @Override // p236o00oOoo0.o000OO00
    public final long OooO0OO() {
        return this.f39950OooO0OO;
    }

    @Override // p236o00oOoo0.o000OO00
    @Nullable
    public final NetworkConnectionInfo OooO0Oo() {
        return this.f39954OooO0oO;
    }

    @Override // p236o00oOoo0.o000OO00
    @Nullable
    public final String OooO0o() {
        return this.f39953OooO0o0;
    }

    @Override // p236o00oOoo0.o000OO00
    @Nullable
    public final byte[] OooO0o0() {
        return this.f39951OooO0Oo;
    }

    @Override // p236o00oOoo0.o000OO00
    public final long OooO0oO() {
        return this.f39952OooO0o;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000OO00)) {
            return false;
        }
        o000OO00 o000oo01 = (o000OO00) obj;
        if (this.f39948OooO00o == o000oo01.OooO0O0() && ((num = this.f39949OooO0O0) != null ? num.equals(o000oo01.OooO00o()) : o000oo01.OooO00o() == null) && this.f39950OooO0OO == o000oo01.OooO0OO()) {
            if (Arrays.equals(this.f39951OooO0Oo, o000oo01 instanceof o000O0Oo ? ((o000O0Oo) o000oo01).f39951OooO0Oo : o000oo01.OooO0o0()) && ((str = this.f39953OooO0o0) != null ? str.equals(o000oo01.OooO0o()) : o000oo01.OooO0o() == null) && this.f39952OooO0o == o000oo01.OooO0oO()) {
                NetworkConnectionInfo networkConnectionInfo = this.f39954OooO0oO;
                if (networkConnectionInfo == null) {
                    if (o000oo01.OooO0Oo() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(o000oo01.OooO0Oo())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f39948OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f39949OooO0O0;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.f39950OooO0OO;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f39951OooO0Oo)) * 1000003;
        String str = this.f39953OooO0o0;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f39952OooO0o;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f39954OooO0oO;
        return i2 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f39948OooO00o + ", eventCode=" + this.f39949OooO0O0 + ", eventUptimeMs=" + this.f39950OooO0OO + ", sourceExtension=" + Arrays.toString(this.f39951OooO0Oo) + ", sourceExtensionJsonProto3=" + this.f39953OooO0o0 + ", timezoneOffsetSeconds=" + this.f39952OooO0o + ", networkConnectionInfo=" + this.f39954OooO0oO + "}";
    }
}
