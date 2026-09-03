package p191o00o0O0O;

import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo extends o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38892OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f38893OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O f38894OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f38895OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<String, String> f38896OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f38897OooO0o0;

    public static final class OooO00o extends o00Oo0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f38898OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f38899OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o00O0O f38900OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f38901OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Map<String, String> f38902OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f38903OooO0o0;

        public final OooOo OooO0O0() {
            String strOooO00o = this.f38898OooO00o == null ? " transportName" : "";
            if (this.f38900OooO0OO == null) {
                strOooO00o = strOooO00o.concat(" encodedPayload");
            }
            if (this.f38901OooO0Oo == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " eventMillis");
            }
            if (this.f38903OooO0o0 == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " uptimeMillis");
            }
            if (this.f38902OooO0o == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " autoMetadata");
            }
            if (strOooO00o.isEmpty()) {
                return new OooOo(this.f38898OooO00o, this.f38899OooO0O0, this.f38900OooO0OO, this.f38901OooO0Oo.longValue(), this.f38903OooO0o0.longValue(), this.f38902OooO0o);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }

        public final OooO00o OooO0OO(o00O0O o00o0o2) {
            if (o00o0o2 == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f38900OooO0OO = o00o0o2;
            return this;
        }

        public final OooO00o OooO0Oo(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f38898OooO00o = str;
            return this;
        }
    }

    public OooOo(String str, Integer num, o00O0O o00o0o2, long j, long j2, Map map) {
        this.f38892OooO00o = str;
        this.f38893OooO0O0 = num;
        this.f38894OooO0OO = o00o0o2;
        this.f38895OooO0Oo = j;
        this.f38897OooO0o0 = j2;
        this.f38896OooO0o = map;
    }

    @Override // p191o00o0O0O.o00Oo0
    public final Map<String, String> OooO0O0() {
        return this.f38896OooO0o;
    }

    @Override // p191o00o0O0O.o00Oo0
    @Nullable
    public final Integer OooO0OO() {
        return this.f38893OooO0O0;
    }

    @Override // p191o00o0O0O.o00Oo0
    public final o00O0O OooO0Oo() {
        return this.f38894OooO0OO;
    }

    @Override // p191o00o0O0O.o00Oo0
    public final long OooO0o0() {
        return this.f38895OooO0Oo;
    }

    @Override // p191o00o0O0O.o00Oo0
    public final String OooO0oO() {
        return this.f38892OooO00o;
    }

    @Override // p191o00o0O0O.o00Oo0
    public final long OooO0oo() {
        return this.f38897OooO0o0;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00Oo0)) {
            return false;
        }
        o00Oo0 o00oo1 = (o00Oo0) obj;
        return this.f38892OooO00o.equals(o00oo1.OooO0oO()) && ((num = this.f38893OooO0O0) != null ? num.equals(o00oo1.OooO0OO()) : o00oo1.OooO0OO() == null) && this.f38894OooO0OO.equals(o00oo1.OooO0Oo()) && this.f38895OooO0Oo == o00oo1.OooO0o0() && this.f38897OooO0o0 == o00oo1.OooO0oo() && this.f38896OooO0o.equals(o00oo1.OooO0O0());
    }

    public final int hashCode() {
        int iHashCode = (this.f38892OooO00o.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f38893OooO0O0;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f38894OooO0OO.hashCode()) * 1000003;
        long j = this.f38895OooO0Oo;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f38897OooO0o0;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f38896OooO0o.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f38892OooO00o + ", code=" + this.f38893OooO0O0 + ", encodedPayload=" + this.f38894OooO0OO + ", eventMillis=" + this.f38895OooO0Oo + ", uptimeMillis=" + this.f38897OooO0o0 + ", autoMetadata=" + this.f38896OooO0o + "}";
    }
}
