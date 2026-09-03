package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Objects;
import p021OooOooo.Oooo0;
import p334o0OO00o.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class zzib implements o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("SharedPreferencesLoader.class")
    public static final Oooo0 f15967OooO00o = new Oooo0();

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static zzib OooO00o() {
        zzib zzibVar;
        if (zzha.zzb()) {
            throw null;
        }
        synchronized (zzib.class) {
            zzibVar = (zzib) f15967OooO00o.getOrDefault(null, null);
            if (zzibVar == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return zzibVar;
    }

    public static synchronized void OooO0O0() {
        Oooo0 oooo0 = f15967OooO00o;
        Iterator it = ((Oooo0.OooO) oooo0.values()).iterator();
        if (it.hasNext()) {
            Objects.requireNonNull((zzib) it.next());
            throw null;
        }
        oooo0.clear();
    }

    @Override // p334o0OO00o.o00O00OO
    @Nullable
    public final Object zzb(String str) {
        throw null;
    }
}
