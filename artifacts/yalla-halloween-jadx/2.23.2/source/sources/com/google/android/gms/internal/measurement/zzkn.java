package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkn {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile zzkn f15271OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final zzkn f15272OooO0OO = new zzkn(0);
    public static final /* synthetic */ int zzb = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map f15273OooO00o;

    public zzkn() {
        this.f15273OooO00o = new HashMap();
    }

    public static zzkn zza() {
        zzkn zzknVar = f15271OooO0O0;
        if (zzknVar != null) {
            return zzknVar;
        }
        synchronized (zzkn.class) {
            zzkn zzknVar2 = f15271OooO0O0;
            if (zzknVar2 != null) {
                return zzknVar2;
            }
            zzkn zzknVarOooO0O0 = o0O00O0o.OooO0O0();
            f15271OooO0O0 = zzknVarOooO0O0;
            return zzknVarOooO0O0;
        }
    }

    public final zzkz zzb(zzmi zzmiVar, int i) {
        return (zzkz) this.f15273OooO00o.get(new o0O000O(zzmiVar, i));
    }

    public zzkn(int i) {
        this.f15273OooO00o = Collections.emptyMap();
    }
}
