package o0OOOO0o;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Optional;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public final class Oooo0<T> extends Optional<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final T f38246Oooo0o;

    public Oooo0(T t) {
        this.f38246Oooo0o = t;
    }

    @Override // com.google.common.base.Optional
    public final T OooO00o(T t) {
        OooOOOO.OooOO0(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f38246Oooo0o;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Oooo0) {
            return this.f38246Oooo0o.equals(((Oooo0) obj).f38246Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38246Oooo0o.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Optional.of(");
        sbOooO0o0.append(this.f38246Oooo0o);
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }
}
