package p382o0OOoOo;

import OooO00o.OooO00o;
import java.util.Objects;
import javax.annotation.Nonnull;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo extends o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38847OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38848OooO0O0;

    public o0Oo0oo(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f38847OooO00o = str;
        Objects.requireNonNull(str2, "Null version");
        this.f38848OooO0O0 = str2;
    }

    @Override // p382o0OOoOo.o000OOo
    @Nonnull
    public final String OooO00o() {
        return this.f38847OooO00o;
    }

    @Override // p382o0OOoOo.o000OOo
    @Nonnull
    public final String OooO0O0() {
        return this.f38848OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000OOo)) {
            return false;
        }
        o000OOo o000ooo2 = (o000OOo) obj;
        return this.f38847OooO00o.equals(o000ooo2.OooO00o()) && this.f38848OooO0O0.equals(o000ooo2.OooO0O0());
    }

    public final int hashCode() {
        return ((this.f38847OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f38848OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("LibraryVersion{libraryName=");
        sbOooO0o0.append(this.f38847OooO00o);
        sbOooO0o0.append(", version=");
        return OooO.OooO00o(sbOooO0o0, this.f38848OooO0O0, "}");
    }
}
