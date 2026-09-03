package p248o00oo0o0;

import p238o00oOooo.o0O0oo00;
import p238o00oOooo.o0OO00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 extends o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f40167OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO00OO f40168OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0oo00 f40169OooO0OO;

    public o0000(long j, o0OO00OO o0oo00oo2, o0O0oo00 o0o0oo00) {
        this.f40167OooO00o = j;
        if (o0oo00oo2 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f40168OooO0O0 = o0oo00oo2;
        if (o0o0oo00 == null) {
            throw new NullPointerException("Null event");
        }
        this.f40169OooO0OO = o0o0oo00;
    }

    @Override // p248o00oo0o0.o000O000
    public final o0O0oo00 OooO00o() {
        return this.f40169OooO0OO;
    }

    @Override // p248o00oo0o0.o000O000
    public final long OooO0O0() {
        return this.f40167OooO00o;
    }

    @Override // p248o00oo0o0.o000O000
    public final o0OO00OO OooO0OO() {
        return this.f40168OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000O000)) {
            return false;
        }
        o000O000 o000o001 = (o000O000) obj;
        return this.f40167OooO00o == o000o001.OooO0O0() && this.f40168OooO0O0.equals(o000o001.OooO0OO()) && this.f40169OooO0OO.equals(o000o001.OooO00o());
    }

    public final int hashCode() {
        long j = this.f40167OooO00o;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f40168OooO0O0.hashCode()) * 1000003) ^ this.f40169OooO0OO.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f40167OooO00o + ", transportContext=" + this.f40168OooO0O0 + ", event=" + this.f40169OooO0OO + "}";
    }
}
