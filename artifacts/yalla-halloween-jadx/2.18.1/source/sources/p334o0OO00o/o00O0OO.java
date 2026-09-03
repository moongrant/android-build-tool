package p334o0OO00o;

import OooO00o.OooO00o;
import com.google.android.gms.internal.measurement.zzif;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO extends zzif {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Object f37320Oooo0o;

    public o00O0OO(Object obj) {
        this.f37320Oooo0o = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof o00O0OO) {
            return this.f37320Oooo0o.equals(((o00O0OO) obj).f37320Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37320Oooo0o.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Optional.of(");
        sbOooO0o0.append(this.f37320Oooo0o);
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final Object zza() {
        return this.f37320Oooo0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final boolean zzb() {
        return true;
    }
}
