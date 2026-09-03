package p334o0OO00o;

import OooO00o.OooO00o;
import com.google.android.gms.internal.measurement.zzih;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OOO implements Serializable, zzih {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final zzih f37321Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public volatile transient boolean f37322Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @CheckForNull
    public transient Object f37323Oooo0oo;

    public o00O0OOO(zzih zzihVar) {
        Objects.requireNonNull(zzihVar);
        this.f37321Oooo0o = zzihVar;
    }

    public final String toString() {
        Object string;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Suppliers.memoize(");
        if (this.f37322Oooo0oO) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("<supplier that returned ");
            sbOooO0o1.append(this.f37323Oooo0oo);
            sbOooO0o1.append(">");
            string = sbOooO0o1.toString();
        } else {
            string = this.f37321Oooo0o;
        }
        sbOooO0o0.append(string);
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final Object zza() {
        if (!this.f37322Oooo0oO) {
            synchronized (this) {
                if (!this.f37322Oooo0oO) {
                    Object objZza = this.f37321Oooo0o.zza();
                    this.f37323Oooo0oo = objZza;
                    this.f37322Oooo0oO = true;
                    return objZza;
                }
            }
        }
        return this.f37323Oooo0oo;
    }
}
