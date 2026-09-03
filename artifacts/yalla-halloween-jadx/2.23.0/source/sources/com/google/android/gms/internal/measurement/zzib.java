package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzib {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f15726OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public static volatile oOO00O f15727OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final AtomicInteger f15728OooO0oo;
    public static final /* synthetic */ int zzc = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzhy f15729OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15730OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f15731OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile int f15732OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f15733OooO0o0;

    static {
        new AtomicReference();
        new zzid(zzht.zza);
        f15728OooO0oo = new AtomicInteger();
    }

    public /* synthetic */ zzib(zzhy zzhyVar, String str, Object obj) {
        if (zzhyVar.f15721OooO00o == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f15729OooO00o = zzhyVar;
        this.f15730OooO0O0 = str;
        this.f15731OooO0OO = obj;
    }

    public static void zzc() {
        f15728OooO0oo.incrementAndGet();
    }

    public static void zzd(final Context context) {
        if (f15727OooO0oO != null || context == null) {
            return;
        }
        Object obj = f15726OooO0o;
        synchronized (obj) {
            if (f15727OooO0oO == null) {
                synchronized (obj) {
                    oOO00O ooo00o = f15727OooO0oO;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (ooo00o == null || ooo00o.f15616OooO00o != context) {
                        zzhf.OooO00o();
                        zzic.OooO0O0();
                        o00O0.OooO0OO();
                        f15727OooO0oO = new oOO00O(context, zzir.zza(new zzim() { // from class: com.google.android.gms.internal.measurement.zzhs
                            @Override // com.google.android.gms.internal.measurement.zzim
                            public final Object zza() {
                                Context context2 = context;
                                Object obj2 = zzib.f15726OooO0o;
                                return zzho.zza(context2);
                            }
                        }));
                        f15728OooO0oo.incrementAndGet();
                    }
                }
            }
        }
    }

    public abstract Object OooO00o(Object obj);

    /* JADX WARN: Code duplicated, block: B:12:0x0039 A[PHI: r2
      0x0039: PHI (r2v1 com.google.android.gms.internal.measurement.zzii) = (r2v0 com.google.android.gms.internal.measurement.zzii), (r2v5 com.google.android.gms.internal.measurement.zzii) binds: [B:8:0x0016, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object zzb() {
        String strZza;
        o00O00o0 o00o00o0OooO00o;
        Object objZzb;
        int i = f15728OooO0oo.get();
        if (this.f15732OooO0Oo < i) {
            synchronized (this) {
                if (this.f15732OooO0Oo < i) {
                    oOO00O ooo00o = f15727OooO0oO;
                    zzii zziiVarZzc = zzii.zzc();
                    Object objOooO00o = null;
                    if (ooo00o != null) {
                        zziiVarZzc = (zzii) ooo00o.f15617OooO0O0.zza();
                        if (zziiVarZzc.zzb()) {
                            zzhh zzhhVar = (zzhh) zziiVarZzc.zza();
                            zzhy zzhyVar = this.f15729OooO00o;
                            strZza = zzhhVar.zza(zzhyVar.f15721OooO00o, null, zzhyVar.f15723OooO0OO, this.f15730OooO0O0);
                        } else {
                            strZza = null;
                        }
                    } else {
                        strZza = null;
                    }
                    if (ooo00o == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    Uri uri = this.f15729OooO00o.f15721OooO00o;
                    if (uri != null) {
                        o00o00o0OooO00o = zzhp.zza(ooo00o.f15616OooO00o, uri) ? zzhf.zza(ooo00o.f15616OooO00o.getContentResolver(), this.f15729OooO00o.f15721OooO00o, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhr
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzib.zzc();
                            }
                        }) : null;
                    } else {
                        zzhr zzhrVar = new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhr
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzib.zzc();
                            }
                        };
                        o00o00o0OooO00o = zzic.OooO00o();
                    }
                    Object objOooO00o2 = (o00o00o0OooO00o == null || (objZzb = o00o00o0OooO00o.zzb(this.f15730OooO0O0)) == null) ? null : OooO00o(objZzb);
                    if (objOooO00o2 == null) {
                        if (!this.f15729OooO00o.f15724OooO0Oo) {
                            String strOooO0O0 = o00O0.OooO00o(ooo00o.f15616OooO00o).zzb(this.f15729OooO00o.f15724OooO0Oo ? null : this.f15730OooO0O0);
                            if (strOooO0O0 != null) {
                                objOooO00o = OooO00o(strOooO0O0);
                            }
                        }
                        objOooO00o2 = objOooO00o == null ? this.f15731OooO0OO : objOooO00o;
                    }
                    if (zziiVarZzc.zzb()) {
                        objOooO00o2 = strZza == null ? this.f15731OooO0OO : OooO00o(strZza);
                    }
                    this.f15733OooO0o0 = objOooO00o2;
                    this.f15732OooO0Oo = i;
                }
            }
        }
        return this.f15733OooO0o0;
    }
}
