package o0O0OOOo;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f35639OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p286o0O0O0oO.o0OO00O f35640OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p286o0O0O0oO.oo000o f35641OooO0OO;

    public OooO0O0(long j, p286o0O0O0oO.o0OO00O o0oo00o2, p286o0O0O0oO.oo000o oo000oVar) {
        this.f35639OooO00o = j;
        Objects.requireNonNull(o0oo00o2, "Null transportContext");
        this.f35640OooO0O0 = o0oo00o2;
        Objects.requireNonNull(oo000oVar, "Null event");
        this.f35641OooO0OO = oo000oVar;
    }

    @Override // o0O0OOOo.OooOo00
    public final p286o0O0O0oO.oo000o OooO00o() {
        return this.f35641OooO0OO;
    }

    @Override // o0O0OOOo.OooOo00
    public final long OooO0O0() {
        return this.f35639OooO00o;
    }

    @Override // o0O0OOOo.OooOo00
    public final p286o0O0O0oO.o0OO00O OooO0OO() {
        return this.f35640OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOo00)) {
            return false;
        }
        OooOo00 oooOo00 = (OooOo00) obj;
        return this.f35639OooO00o == oooOo00.OooO0O0() && this.f35640OooO0O0.equals(oooOo00.OooO0OO()) && this.f35641OooO0OO.equals(oooOo00.OooO00o());
    }

    public final int hashCode() {
        long j = this.f35639OooO00o;
        return this.f35641OooO0OO.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f35640OooO0O0.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PersistedEvent{id=");
        sbOooO0o0.append(this.f35639OooO00o);
        sbOooO0o0.append(", transportContext=");
        sbOooO0o0.append(this.f35640OooO0O0);
        sbOooO0o0.append(", event=");
        sbOooO0o0.append(this.f35641OooO0OO);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
