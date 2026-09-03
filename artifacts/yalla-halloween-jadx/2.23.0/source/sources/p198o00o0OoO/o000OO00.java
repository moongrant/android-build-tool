package p198o00o0OoO;

import p191o00o0O0O.o00Oo0;
import p191o00o0O0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO00 extends o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39071OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0Oo0oo f39072OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo0 f39073OooO0OO;

    public o000OO00(long j, o0Oo0oo o0oo0oo2, o00Oo0 o00oo1) {
        this.f39071OooO00o = j;
        if (o0oo0oo2 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f39072OooO0O0 = o0oo0oo2;
        if (o00oo1 == null) {
            throw new NullPointerException("Null event");
        }
        this.f39073OooO0OO = o00oo1;
    }

    @Override // p198o00o0OoO.o00O00O
    public final o00Oo0 OooO00o() {
        return this.f39073OooO0OO;
    }

    @Override // p198o00o0OoO.o00O00O
    public final long OooO0O0() {
        return this.f39071OooO00o;
    }

    @Override // p198o00o0OoO.o00O00O
    public final o0Oo0oo OooO0OO() {
        return this.f39072OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O00O)) {
            return false;
        }
        o00O00O o00o00o2 = (o00O00O) obj;
        return this.f39071OooO00o == o00o00o2.OooO0O0() && this.f39072OooO0O0.equals(o00o00o2.OooO0OO()) && this.f39073OooO0OO.equals(o00o00o2.OooO00o());
    }

    public final int hashCode() {
        long j = this.f39071OooO00o;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f39072OooO0O0.hashCode()) * 1000003) ^ this.f39073OooO0OO.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f39071OooO00o + ", transportContext=" + this.f39072OooO0O0 + ", event=" + this.f39073OooO0OO + "}";
    }
}
