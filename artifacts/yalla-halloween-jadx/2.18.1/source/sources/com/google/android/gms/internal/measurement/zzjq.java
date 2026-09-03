package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p334o0OO00o.o0O00000;
import p334o0OO00o.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjq {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile zzjq f15973OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final zzjq f15974OooO0OO = new zzjq(true);
    public static final /* synthetic */ int zzb = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map f15975OooO00o;

    public zzjq() {
        this.f15975OooO00o = new HashMap();
    }

    public static zzjq zza() {
        zzjq zzjqVar = f15973OooO0O0;
        if (zzjqVar != null) {
            return zzjqVar;
        }
        synchronized (zzjq.class) {
            zzjq zzjqVar2 = f15973OooO0O0;
            if (zzjqVar2 != null) {
                return zzjqVar2;
            }
            zzjq zzjqVarOooO0O0 = o0O00000.OooO0O0();
            f15973OooO0O0 = zzjqVarOooO0O0;
            return zzjqVarOooO0O0;
        }
    }

    public final zzkc zzb(zzll zzllVar, int i) {
        return (zzkc) this.f15975OooO00o.get(new o0oOO(zzllVar, i));
    }

    public zzjq(boolean z) {
        this.f15975OooO00o = Collections.emptyMap();
    }
}
