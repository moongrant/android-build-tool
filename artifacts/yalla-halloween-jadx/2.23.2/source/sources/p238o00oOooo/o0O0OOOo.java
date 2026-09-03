package p238o00oOooo;

import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0OOOo extends o0O0oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f39993OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f39994OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0oOo0O0 f39995OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39996OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<String, String> f39997OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39998OooO0o0;

    public static final class OooO00o extends o0O0oo00.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f39999OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f40000OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o0oOo0O0 f40001OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f40002OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Map<String, String> f40003OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f40004OooO0o0;

        public final o0O0OOOo OooO0O0() {
            String strOooO00o = this.f39999OooO00o == null ? " transportName" : "";
            if (this.f40001OooO0OO == null) {
                strOooO00o = strOooO00o.concat(" encodedPayload");
            }
            if (this.f40002OooO0Oo == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " eventMillis");
            }
            if (this.f40004OooO0o0 == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " uptimeMillis");
            }
            if (this.f40003OooO0o == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " autoMetadata");
            }
            if (strOooO00o.isEmpty()) {
                return new o0O0OOOo(this.f39999OooO00o, this.f40000OooO0O0, this.f40001OooO0OO, this.f40002OooO0Oo.longValue(), this.f40004OooO0o0.longValue(), this.f40003OooO0o);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }

        public final OooO00o OooO0OO(o0oOo0O0 o0ooo0o1) {
            if (o0ooo0o1 == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f40001OooO0OO = o0ooo0o1;
            return this;
        }

        public final OooO00o OooO0Oo(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f39999OooO00o = str;
            return this;
        }
    }

    public o0O0OOOo(String str, Integer num, o0oOo0O0 o0ooo0o1, long j, long j2, Map map) {
        this.f39993OooO00o = str;
        this.f39994OooO0O0 = num;
        this.f39995OooO0OO = o0ooo0o1;
        this.f39996OooO0Oo = j;
        this.f39998OooO0o0 = j2;
        this.f39997OooO0o = map;
    }

    @Override // p238o00oOooo.o0O0oo00
    public final Map<String, String> OooO0O0() {
        return this.f39997OooO0o;
    }

    @Override // p238o00oOooo.o0O0oo00
    @Nullable
    public final Integer OooO0OO() {
        return this.f39994OooO0O0;
    }

    @Override // p238o00oOooo.o0O0oo00
    public final o0oOo0O0 OooO0Oo() {
        return this.f39995OooO0OO;
    }

    @Override // p238o00oOooo.o0O0oo00
    public final long OooO0o0() {
        return this.f39996OooO0Oo;
    }

    @Override // p238o00oOooo.o0O0oo00
    public final String OooO0oO() {
        return this.f39993OooO00o;
    }

    @Override // p238o00oOooo.o0O0oo00
    public final long OooO0oo() {
        return this.f39998OooO0o0;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O0oo00)) {
            return false;
        }
        o0O0oo00 o0o0oo00 = (o0O0oo00) obj;
        return this.f39993OooO00o.equals(o0o0oo00.OooO0oO()) && ((num = this.f39994OooO0O0) != null ? num.equals(o0o0oo00.OooO0OO()) : o0o0oo00.OooO0OO() == null) && this.f39995OooO0OO.equals(o0o0oo00.OooO0Oo()) && this.f39996OooO0Oo == o0o0oo00.OooO0o0() && this.f39998OooO0o0 == o0o0oo00.OooO0oo() && this.f39997OooO0o.equals(o0o0oo00.OooO0O0());
    }

    public final int hashCode() {
        int iHashCode = (this.f39993OooO00o.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f39994OooO0O0;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f39995OooO0OO.hashCode()) * 1000003;
        long j = this.f39996OooO0Oo;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f39998OooO0o0;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f39997OooO0o.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f39993OooO00o + ", code=" + this.f39994OooO0O0 + ", encodedPayload=" + this.f39995OooO0OO + ", eventMillis=" + this.f39996OooO0Oo + ", uptimeMillis=" + this.f39998OooO0o0 + ", autoMetadata=" + this.f39997OooO0o + "}";
    }
}
