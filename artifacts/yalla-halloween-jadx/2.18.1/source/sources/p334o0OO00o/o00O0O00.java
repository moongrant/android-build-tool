package p334o0OO00o;

import OooO0o.OooO0o;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzgz;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzia;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O00 extends zzia {
    public o00O0O00(zzhx zzhxVar, String str, Boolean bool) {
        super(zzhxVar, str, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzia
    @Nullable
    public final /* bridge */ /* synthetic */ Object OooO00o(Object obj) {
        if (zzgz.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzgz.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("Invalid boolean value for ", super.zzc(), ": ");
        sbOooO0OO.append((String) obj);
        Log.e("PhenotypeFlag", sbOooO0OO.toString());
        return null;
    }
}
