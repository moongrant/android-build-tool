package p334o0OO00o;

import OooO00o.OooO00o;
import com.google.android.gms.internal.measurement.zzih;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0oOO0 implements zzih {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @CheckForNull
    public volatile zzih f37467Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public volatile boolean f37468Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @CheckForNull
    public Object f37469Oooo0oo;

    public oo0oOO0(zzih zzihVar) {
        Objects.requireNonNull(zzihVar);
        this.f37467Oooo0o = zzihVar;
    }

    public final String toString() {
        Object string = this.f37467Oooo0o;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Suppliers.memoize(");
        if (string == null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("<supplier that returned ");
            sbOooO0o1.append(this.f37469Oooo0oo);
            sbOooO0o1.append(">");
            string = sbOooO0o1.toString();
        }
        sbOooO0o0.append(string);
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final Object zza() {
        if (!this.f37468Oooo0oO) {
            synchronized (this) {
                if (!this.f37468Oooo0oO) {
                    zzih zzihVar = this.f37467Oooo0o;
                    Objects.requireNonNull(zzihVar);
                    Object objZza = zzihVar.zza();
                    this.f37469Oooo0oo = objZza;
                    this.f37468Oooo0oO = true;
                    this.f37467Oooo0o = null;
                    return objZza;
                }
            }
        }
        return this.f37469Oooo0oo;
    }
}
