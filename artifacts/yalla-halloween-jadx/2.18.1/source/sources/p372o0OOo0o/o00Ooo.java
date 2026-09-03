package p372o0OOo0o;

import OooO00o.OooO00o;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38680OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<String> f38681OooO0O0;

    public o00Ooo(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f38680OooO00o = str;
        this.f38681OooO0O0 = list;
    }

    @Override // p372o0OOo0o.o000OOo
    public final List<String> OooO00o() {
        return this.f38681OooO0O0;
    }

    @Override // p372o0OOo0o.o000OOo
    public final String OooO0O0() {
        return this.f38680OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000OOo)) {
            return false;
        }
        o000OOo o000ooo2 = (o000OOo) obj;
        return this.f38680OooO00o.equals(o000ooo2.OooO0O0()) && this.f38681OooO0O0.equals(o000ooo2.OooO00o());
    }

    public final int hashCode() {
        return ((this.f38680OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f38681OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("HeartBeatResult{userAgent=");
        sbOooO0o0.append(this.f38680OooO00o);
        sbOooO0o0.append(", usedDates=");
        sbOooO0o0.append(this.f38681OooO0O0);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
