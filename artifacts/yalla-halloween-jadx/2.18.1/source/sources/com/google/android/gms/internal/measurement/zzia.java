package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.core.content.PermissionChecker;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import p334o0OO00o.o00O00O;
import p334o0OO00o.o00O00OO;
import p334o0OO00o.oo00o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzia {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f15959OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public static volatile o00O00O f15960OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final AtomicInteger f15961OooO0oo;
    public static final /* synthetic */ int zzc = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzhx f15962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15963OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f15964OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile int f15965OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f15966OooO0o0;

    static {
        new AtomicReference();
        new zzic(zzhs.zza, null);
        f15961OooO0oo = new AtomicInteger();
    }

    public /* synthetic */ zzia(zzhx zzhxVar, String str, Object obj) {
        if (zzhxVar.f15954OooO00o == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f15962OooO00o = zzhxVar;
        this.f15963OooO0O0 = str;
        this.f15964OooO0OO = obj;
    }

    public static void zzd() {
        f15961OooO0oo.incrementAndGet();
    }

    public static void zze(final Context context) {
        Context context2;
        if (f15960OooO0oO == null) {
            Object obj = f15959OooO0o;
            synchronized (obj) {
                if (f15960OooO0oO == null) {
                    synchronized (obj) {
                        try {
                            o00O00O o00o00o2 = f15960OooO0oO;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (o00o00o2 == null || o00o00o2.f37314OooO00o != context) {
                                zzhe.OooO00o();
                                zzib.OooO0O0();
                                synchronized (oo00o.class) {
                                    oo00o oo00oVar = oo00o.f37455OooO0OO;
                                    if (oo00oVar != null && (context2 = oo00oVar.f37456OooO00o) != null && oo00oVar.f37457OooO0O0 != null) {
                                        context2.getContentResolver().unregisterContentObserver(oo00o.f37455OooO0OO.f37457OooO0O0);
                                    }
                                    oo00o.f37455OooO0OO = null;
                                }
                                f15960OooO0oO = new o00O00O(context, zzil.zza(new zzih() { // from class: com.google.android.gms.internal.measurement.zzhr
                                    @Override // com.google.android.gms.internal.measurement.zzih
                                    public final Object zza() {
                                        Context context3 = context;
                                        int i = zzia.zzc;
                                        return zzhn.zza(context3);
                                    }
                                }));
                                f15961OooO0oo.incrementAndGet();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public abstract Object OooO00o(Object obj);

    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    public final Object zzb() {
        o00O00OO o00o00ooOooO00o;
        oo00o oo00oVar;
        Object objZzb;
        int i = f15961OooO0oo.get();
        if (this.f15965OooO0Oo < i) {
            synchronized (this) {
                try {
                    if (this.f15965OooO0Oo < i) {
                        o00O00O o00o00o2 = f15960OooO0oO;
                        if (o00o00o2 == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        zzhx zzhxVar = this.f15962OooO00o;
                        Objects.requireNonNull(zzhxVar);
                        if (zzhxVar.f15954OooO00o == null) {
                            Objects.requireNonNull(this.f15962OooO00o);
                            o00o00ooOooO00o = zzib.OooO00o();
                        } else if (zzho.zza(o00o00o2.f37314OooO00o, this.f15962OooO00o.f15954OooO00o)) {
                            Objects.requireNonNull(this.f15962OooO00o);
                            o00o00ooOooO00o = zzhe.zza(o00o00o2.f37314OooO00o.getContentResolver(), this.f15962OooO00o.f15954OooO00o, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzia.zzd();
                                }
                            });
                        } else {
                            o00o00ooOooO00o = null;
                        }
                        Object objOooO00o = (o00o00ooOooO00o == null || (objZzb = o00o00ooOooO00o.zzb(zzc())) == null) ? null : OooO00o(objZzb);
                        if (objOooO00o == null) {
                            if (this.f15962OooO00o.f15957OooO0Oo) {
                                objOooO00o = null;
                            } else {
                                Context context = o00o00o2.f37314OooO00o;
                                synchronized (oo00o.class) {
                                    if (oo00o.f37455OooO0OO == null) {
                                        oo00o.f37455OooO0OO = PermissionChecker.OooO00o(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new oo00o(context) : new oo00o();
                                    }
                                    oo00oVar = oo00o.f37455OooO0OO;
                                }
                                String strOooO00o = oo00oVar.zzb(this.f15962OooO00o.f15957OooO0Oo ? null : this.f15963OooO0O0);
                                if (strOooO00o != null) {
                                    objOooO00o = OooO00o(strOooO00o);
                                } else {
                                    objOooO00o = null;
                                }
                            }
                            if (objOooO00o == null) {
                                objOooO00o = this.f15964OooO0OO;
                            }
                        }
                        zzif zzifVar = (zzif) o00o00o2.f37315OooO0O0.zza();
                        if (zzifVar.zzb()) {
                            zzhg zzhgVar = (zzhg) zzifVar.zza();
                            zzhx zzhxVar2 = this.f15962OooO00o;
                            String strZza = zzhgVar.zza(zzhxVar2.f15954OooO00o, null, zzhxVar2.f15956OooO0OO, this.f15963OooO0O0);
                            objOooO00o = strZza == null ? this.f15964OooO0OO : OooO00o(strZza);
                        }
                        this.f15966OooO0o0 = objOooO00o;
                        this.f15965OooO0Oo = i;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f15966OooO0o0;
    }

    public final String zzc() {
        String str = this.f15962OooO00o.f15956OooO0OO;
        return this.f15963OooO0O0;
    }
}
