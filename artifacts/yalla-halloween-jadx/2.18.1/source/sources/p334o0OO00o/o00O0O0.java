package p334o0OO00o;

import OooO0o.OooO0o;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzia;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0 extends zzia {
    public o00O0O0(zzhx zzhxVar, Double d) {
        super(zzhxVar, "measurement.test.double_flag", d);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    @Nullable
    public final /* bridge */ /* synthetic */ Object OooO00o(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("Invalid double value for ", super.zzc(), ": ");
            sbOooO0OO.append((String) obj);
            Log.e("PhenotypeFlag", sbOooO0OO.toString());
            return null;
        }
    }
}
