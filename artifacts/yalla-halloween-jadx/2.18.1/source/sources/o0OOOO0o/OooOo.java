package o0OOOO0o;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo<T> implements OooOo00<T>, Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final T f38245Oooo0o = Object.class;

    @Override // o0OOOO0o.OooOo00
    public final boolean apply(T t) {
        return this.f38245Oooo0o.equals(t);
    }

    @Override // o0OOOO0o.OooOo00
    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof OooOo) {
            return this.f38245Oooo0o.equals(((OooOo) obj).f38245Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38245Oooo0o.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Predicates.equalTo(");
        sbOooO0o0.append(this.f38245Oooo0o);
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }
}
