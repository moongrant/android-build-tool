package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O0Oo {
    public static final void OooO00o(Object obj, Object obj2) {
        zzmc zzmcVar = (zzmc) obj;
        if (zzmcVar.isEmpty()) {
            return;
        }
        Iterator it = zzmcVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final zzmc OooO0O0(Object obj, Object obj2) {
        zzmc zzmcVarZzb = (zzmc) obj;
        zzmc zzmcVar = (zzmc) obj2;
        if (!zzmcVar.isEmpty()) {
            if (!zzmcVarZzb.zze()) {
                zzmcVarZzb = zzmcVarZzb.zzb();
            }
            zzmcVarZzb.zzd(zzmcVar);
        }
        return zzmcVarZzb;
    }
}
