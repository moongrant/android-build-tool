package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzic implements o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("SharedPreferencesLoader.class")
    public static final p188o00o0O.OooOO0 f15734OooO00o = new p188o00o0O.OooOO0();

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static zzic OooO00o() {
        zzic zzicVar;
        if (zzhb.zzb()) {
            throw null;
        }
        synchronized (zzic.class) {
            zzicVar = (zzic) f15734OooO00o.getOrDefault(null, null);
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
        p188o00o0O.OooOO0 oooOO1 = f15734OooO00o;
        Iterator it = ((o00o0O.OooOO0.OooO) oooOO1.values()).iterator();
        if (it.hasNext()) {
            ((zzic) it.next()).getClass();
            throw null;
        }
        oooOO1.clear();
    }

    @Override // com.google.android.gms.internal.measurement.o00O00o0
    @Nullable
    public final Object zzb(String str) {
        throw null;
    }
}
