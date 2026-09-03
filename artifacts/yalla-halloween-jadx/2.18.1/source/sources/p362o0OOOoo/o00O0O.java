package p362o0OOOoo;

import OooO00o.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo.OooO00o f38522OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOOo.OooO0OO f38523OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0ooOOo.OooO0O0 f38524OooO0OO;

    public o00O0O(o0ooOOo.OooO00o oooO00o, o0ooOOo.OooO0OO oooO0OO, o0ooOOo.OooO0O0 oooO0O0) {
        this.f38522OooO00o = oooO00o;
        this.f38523OooO0O0 = oooO0OO;
        this.f38524OooO0OO = oooO0O0;
    }

    @Override // p362o0OOOoo.o0ooOOo
    public final o0ooOOo.OooO00o OooO00o() {
        return this.f38522OooO00o;
    }

    @Override // p362o0OOOoo.o0ooOOo
    public final o0ooOOo.OooO0O0 OooO0O0() {
        return this.f38524OooO0OO;
    }

    @Override // p362o0OOOoo.o0ooOOo
    public final o0ooOOo.OooO0OO OooO0OO() {
        return this.f38523OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0ooOOo)) {
            return false;
        }
        o0ooOOo o0ooooo2 = (o0ooOOo) obj;
        return this.f38522OooO00o.equals(o0ooooo2.OooO00o()) && this.f38523OooO0O0.equals(o0ooooo2.OooO0OO()) && this.f38524OooO0OO.equals(o0ooooo2.OooO0O0());
    }

    public final int hashCode() {
        return ((((this.f38522OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f38523OooO0O0.hashCode()) * 1000003) ^ this.f38524OooO0OO.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("StaticSessionData{appData=");
        sbOooO0o0.append(this.f38522OooO00o);
        sbOooO0o0.append(", osData=");
        sbOooO0o0.append(this.f38523OooO0O0);
        sbOooO0o0.append(", deviceData=");
        sbOooO0o0.append(this.f38524OooO0OO);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
