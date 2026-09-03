package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzib {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f15250OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public static volatile o00O00OO f15251OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final AtomicInteger f15252OooO0oo;
    public static final /* synthetic */ int zzc = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzhy f15253OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15254OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f15255OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile int f15256OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f15257OooO0o0;

    static {
        new AtomicReference();
        new zzid(zzht.zza);
        f15252OooO0oo = new AtomicInteger();
    }

    public /* synthetic */ zzib(zzhy zzhyVar, String str, Object obj) {
        if (zzhyVar.f15245OooO00o == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f15253OooO00o = zzhyVar;
        this.f15254OooO0O0 = str;
        this.f15255OooO0OO = obj;
    }

    public static void zzc() {
        f15252OooO0oo.incrementAndGet();
    }

    public static void zzd(final Context context) {
        if (f15251OooO0oO != null || context == null) {
            return;
        }
        Object obj = f15250OooO0o;
        synchronized (obj) {
            if (f15251OooO0oO == null) {
                synchronized (obj) {
                    o00O00OO o00o00oo2 = f15251OooO0oO;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (o00o00oo2 == null || o00o00oo2.f15000OooO00o != context) {
                        zzhf.OooO00o();
                        zzic.OooO0O0();
                        o00O0O00.OooO0OO();
                        f15251OooO0oO = new o00O00OO(context, zzir.zza(new zzim() { // from class: com.google.android.gms.internal.measurement.zzhs
                            @Override // com.google.android.gms.internal.measurement.zzim
                            public final Object zza() {
                                Context context2 = context;
                                Object obj2 = zzib.f15250OooO0o;
                                return zzho.zza(context2);
                            }
                        }));
                        f15252OooO0oo.incrementAndGet();
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
        oo00o oo00oVarOooO00o;
        Object objZzb;
        int i = f15252OooO0oo.get();
        if (this.f15256OooO0Oo < i) {
            synchronized (this) {
                if (this.f15256OooO0Oo < i) {
                    o00O00OO o00o00oo2 = f15251OooO0oO;
                    zzii zziiVarZzc = zzii.zzc();
                    Object objOooO00o = null;
                    if (o00o00oo2 != null) {
                        zziiVarZzc = (zzii) o00o00oo2.f15001OooO0O0.zza();
                        if (zziiVarZzc.zzb()) {
                            zzhh zzhhVar = (zzhh) zziiVarZzc.zza();
                            zzhy zzhyVar = this.f15253OooO00o;
                            strZza = zzhhVar.zza(zzhyVar.f15245OooO00o, null, zzhyVar.f15247OooO0OO, this.f15254OooO0O0);
                        } else {
                            strZza = null;
                        }
                    } else {
                        strZza = null;
                    }
                    if (o00o00oo2 == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    Uri uri = this.f15253OooO00o.f15245OooO00o;
                    if (uri != null) {
                        oo00oVarOooO00o = zzhp.zza(o00o00oo2.f15000OooO00o, uri) ? zzhf.zza(o00o00oo2.f15000OooO00o.getContentResolver(), this.f15253OooO00o.f15245OooO00o, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhr
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
                        oo00oVarOooO00o = zzic.OooO00o();
                    }
                    Object objOooO00o2 = (oo00oVarOooO00o == null || (objZzb = oo00oVarOooO00o.zzb(this.f15254OooO0O0)) == null) ? null : OooO00o(objZzb);
                    if (objOooO00o2 == null) {
                        if (!this.f15253OooO00o.f15248OooO0Oo) {
                            String strOooO0O0 = o00O0O00.OooO00o(o00o00oo2.f15000OooO00o).zzb(this.f15253OooO00o.f15248OooO0Oo ? null : this.f15254OooO0O0);
                            if (strOooO0O0 != null) {
                                objOooO00o = OooO00o(strOooO0O0);
                            }
                        }
                        objOooO00o2 = objOooO00o == null ? this.f15255OooO0OO : objOooO00o;
                    }
                    if (zziiVarZzc.zzb()) {
                        objOooO00o2 = strZza == null ? this.f15255OooO0OO : OooO00o(strZza);
                    }
                    this.f15257OooO0o0 = objOooO00o2;
                    this.f15256OooO0Oo = i;
                }
            }
        }
        return this.f15257OooO0o0;
    }
}
