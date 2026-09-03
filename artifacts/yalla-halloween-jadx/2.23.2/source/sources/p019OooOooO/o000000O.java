package p019OooOooO;

import p008OooOOo.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f392OooO00o;

    public o000000O(OooO0O0 oooO0O0) {
        this.f392OooO00o = oooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o000000O) {
            return ((o000000O) obj).f392OooO00o.asBinder().equals(this.f392OooO00o.asBinder());
        }
        return false;
    }

    public final int hashCode() {
        return this.f392OooO00o.asBinder().hashCode();
    }
}
