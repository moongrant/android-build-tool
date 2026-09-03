package o0OOOO0o;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000<T> implements OooOo00<T>, Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooOo00<T> f38247Oooo0o;

    public Oooo000(OooOo00<T> oooOo00) {
        this.f38247Oooo0o = oooOo00;
    }

    @Override // o0OOOO0o.OooOo00
    public final boolean apply(@NullableDecl T t) {
        return !this.f38247Oooo0o.apply(t);
    }

    @Override // o0OOOO0o.OooOo00
    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Oooo000) {
            return this.f38247Oooo0o.equals(((Oooo000) obj).f38247Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.f38247Oooo0o.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Predicates.not(");
        sbOooO0o0.append(this.f38247Oooo0o);
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }
}
