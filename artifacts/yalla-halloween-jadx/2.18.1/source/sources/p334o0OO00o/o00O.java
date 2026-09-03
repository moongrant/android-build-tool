package p334o0OO00o;

import OooO00o.OooO00o;
import com.google.android.gms.internal.measurement.zzih;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O implements Serializable, zzih {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Object f37310Oooo0o;

    public o00O(Object obj) {
        this.f37310Oooo0o = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof o00O)) {
            return false;
        }
        Object obj2 = this.f37310Oooo0o;
        Object obj3 = ((o00O) obj).f37310Oooo0o;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f37310Oooo0o});
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Suppliers.ofInstance(");
        sbOooO0o0.append(this.f37310Oooo0o);
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final Object zza() {
        return this.f37310Oooo0o;
    }
}
