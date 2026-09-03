package p286o0O0O0oO;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO extends oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f35470OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f35471OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Ooo f35472OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f35473OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<String, String> f35474OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f35475OooO0o0;

    public static final class OooO0O0 extends oo000o.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f35476OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f35477OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o00Ooo f35478OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f35479OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Map<String, String> f35480OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f35481OooO0o0;

        @Override // o0O0O0oO.oo000o.OooO00o
        public final oo000o OooO0OO() {
            String strOooO0Oo = this.f35476OooO00o == null ? " transportName" : "";
            if (this.f35478OooO0OO == null) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " encodedPayload");
            }
            if (this.f35479OooO0Oo == null) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " eventMillis");
            }
            if (this.f35481OooO0o0 == null) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " uptimeMillis");
            }
            if (this.f35480OooO0o == null) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " autoMetadata");
            }
            if (strOooO0Oo.isEmpty()) {
                return new o000oOoO(this.f35476OooO00o, this.f35477OooO0O0, this.f35478OooO0OO, this.f35479OooO0Oo.longValue(), this.f35481OooO0o0.longValue(), this.f35480OooO0o, null);
            }
            throw new IllegalStateException(OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }

        @Override // o0O0O0oO.oo000o.OooO00o
        public final Map<String, String> OooO0Oo() {
            Map<String, String> map = this.f35480OooO0o;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // o0O0O0oO.oo000o.OooO00o
        public final oo000o.OooO00o OooO0o(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f35476OooO00o = str;
            return this;
        }

        @Override // o0O0O0oO.oo000o.OooO00o
        public final oo000o.OooO00o OooO0o0(long j) {
            this.f35479OooO0Oo = Long.valueOf(j);
            return this;
        }

        @Override // o0O0O0oO.oo000o.OooO00o
        public final oo000o.OooO00o OooO0oO(long j) {
            this.f35481OooO0o0 = Long.valueOf(j);
            return this;
        }

        public final oo000o.OooO00o OooO0oo(o00Ooo o00ooo2) {
            Objects.requireNonNull(o00ooo2, "Null encodedPayload");
            this.f35478OooO0OO = o00ooo2;
            return this;
        }
    }

    public o000oOoO(String str, Integer num, o00Ooo o00ooo2, long j, long j2, Map map, OooO00o oooO00o) {
        this.f35470OooO00o = str;
        this.f35471OooO0O0 = num;
        this.f35472OooO0OO = o00ooo2;
        this.f35473OooO0Oo = j;
        this.f35475OooO0o0 = j2;
        this.f35474OooO0o = map;
    }

    @Override // p286o0O0O0oO.oo000o
    public final long OooO() {
        return this.f35475OooO0o0;
    }

    @Override // p286o0O0O0oO.oo000o
    public final Map<String, String> OooO0OO() {
        return this.f35474OooO0o;
    }

    @Override // p286o0O0O0oO.oo000o
    @Nullable
    public final Integer OooO0Oo() {
        return this.f35471OooO0O0;
    }

    @Override // p286o0O0O0oO.oo000o
    public final long OooO0o() {
        return this.f35473OooO0Oo;
    }

    @Override // p286o0O0O0oO.oo000o
    public final o00Ooo OooO0o0() {
        return this.f35472OooO0OO;
    }

    @Override // p286o0O0O0oO.oo000o
    public final String OooO0oo() {
        return this.f35470OooO00o;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oo000o)) {
            return false;
        }
        oo000o oo000oVar = (oo000o) obj;
        return this.f35470OooO00o.equals(oo000oVar.OooO0oo()) && ((num = this.f35471OooO0O0) != null ? num.equals(oo000oVar.OooO0Oo()) : oo000oVar.OooO0Oo() == null) && this.f35472OooO0OO.equals(oo000oVar.OooO0o0()) && this.f35473OooO0Oo == oo000oVar.OooO0o() && this.f35475OooO0o0 == oo000oVar.OooO() && this.f35474OooO0o.equals(oo000oVar.OooO0OO());
    }

    public final int hashCode() {
        int iHashCode = (this.f35470OooO00o.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f35471OooO0O0;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f35472OooO0OO.hashCode()) * 1000003;
        long j = this.f35473OooO0Oo;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f35475OooO0o0;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f35474OooO0o.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("EventInternal{transportName=");
        sbOooO0o0.append(this.f35470OooO00o);
        sbOooO0o0.append(", code=");
        sbOooO0o0.append(this.f35471OooO0O0);
        sbOooO0o0.append(", encodedPayload=");
        sbOooO0o0.append(this.f35472OooO0OO);
        sbOooO0o0.append(", eventMillis=");
        sbOooO0o0.append(this.f35473OooO0Oo);
        sbOooO0o0.append(", uptimeMillis=");
        sbOooO0o0.append(this.f35475OooO0o0);
        sbOooO0o0.append(", autoMetadata=");
        sbOooO0o0.append(this.f35474OooO0o);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
