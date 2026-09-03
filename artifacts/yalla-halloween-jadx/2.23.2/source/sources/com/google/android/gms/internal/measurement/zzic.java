package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzic implements oo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("SharedPreferencesLoader.class")
    public static final p190o00o0O.OooO f15258OooO00o = new p190o00o0O.OooO();

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static zzic OooO00o() {
        zzic zzicVar;
        if (zzhb.zzb()) {
            throw null;
        }
        synchronized (zzic.class) {
            zzicVar = (zzic) f15258OooO00o.getOrDefault(null, null);
            if (zzicVar == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return zzicVar;
    }

    public static synchronized void OooO0O0() {
        p190o00o0O.OooO oooO = f15258OooO00o;
        Iterator it = ((p190o00o0O.OooO.C0432OooO) oooO.values()).iterator();
        if (it.hasNext()) {
            ((zzic) it.next()).getClass();
            throw null;
        }
        oooO.clear();
    }

    @Override // com.google.android.gms.internal.measurement.oo00o
    @Nullable
    public final Object zzb(String str) {
        throw null;
    }
}
