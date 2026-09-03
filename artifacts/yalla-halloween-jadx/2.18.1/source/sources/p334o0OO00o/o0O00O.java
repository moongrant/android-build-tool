package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzlf;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O {
    public static final void OooO00o(Object obj, Object obj2) {
        zzlf zzlfVar = (zzlf) obj;
        if (zzlfVar.isEmpty()) {
            return;
        }
        Iterator it = zzlfVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final Object OooO0O0(Object obj, Object obj2) {
        zzlf zzlfVarZzb = (zzlf) obj;
        zzlf zzlfVar = (zzlf) obj2;
        if (!zzlfVar.isEmpty()) {
            if (!zzlfVarZzb.zze()) {
                zzlfVarZzb = zzlfVarZzb.zzb();
            }
            zzlfVarZzb.zzd(zzlfVar);
        }
        return zzlfVarZzb;
    }
}
