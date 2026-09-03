package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.o000O000;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DebugKt;
import o0OO0OoO.Oooo000;
import o0OO0OoO.o00OO;
import o0OO0OoO.o00OO00O;
import o0OO0OoO.o00OO0O0;
import o0OO0OoO.o00OO0OO;
import o0OO0OoO.o0O00o0;
import o0OO0OoO.o0O0O0Oo;
import o0OO0OoO.oo0O;
import o0OO0OoO.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzis extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile zzik f16253OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile zzik f16254OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile zzik f16255OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ConcurrentHashMap f16256OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @VisibleForTesting
    public zzik f16257OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("activityLock")
    public Activity f16258OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("activityLock")
    public volatile boolean f16259OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public zzik f16260OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("activityLock")
    public boolean f16261OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Object f16262OooOO0o;

    public zzis(zzfy zzfyVar) {
        super(zzfyVar);
        this.f16262OooOO0o = new Object();
        this.f16256OooO0o = new ConcurrentHashMap();
    }

    @Override // o0OO0OoO.oo0o0Oo
    public final boolean OooO0O0() {
        return false;
    }

    @WorkerThread
    public final void OooO0OO(zzik zzikVar, zzik zzikVar2, long j, boolean z, Bundle bundle) {
        long j2;
        zzg();
        boolean z2 = false;
        boolean z3 = (zzikVar2 != null && zzikVar2.zzc == zzikVar.zzc && zzil.zza(zzikVar2.zzb, zzikVar.zzb) && zzil.zza(zzikVar2.zza, zzikVar.zza)) ? false : true;
        if (z && this.f16257OooO0o0 != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzlh.zzK(zzikVar, bundle2, true);
            if (zzikVar2 != null) {
                String str = zzikVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzikVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzikVar2.zzc);
            }
            if (z2) {
                o0O0O0Oo o0o0o0oo = this.f37615OooO00o.zzu().f16278OooO0o0;
                long j3 = j - o0o0o0oo.f37787OooO0O0;
                o0o0o0oo.f37787OooO0O0 = j;
                if (j3 > 0) {
                    this.f37615OooO00o.zzv().OooOO0(bundle2, j3);
                }
            }
            if (!this.f37615OooO00o.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzikVar.zze ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "app";
            long jCurrentTimeMillis = this.f37615OooO00o.zzav().currentTimeMillis();
            if (zzikVar.zze) {
                long j4 = zzikVar.zzf;
                if (j4 != 0) {
                    j2 = j4;
                }
                this.f37615OooO00o.zzq().OooO0Oo(str3, "_vs", j2, bundle2);
            }
            j2 = jCurrentTimeMillis;
            this.f37615OooO00o.zzq().OooO0Oo(str3, "_vs", j2, bundle2);
        }
        if (z2) {
            OooO0Oo(this.f16257OooO0o0, true, j);
        }
        this.f16257OooO0o0 = zzikVar;
        if (zzikVar.zze) {
            this.f16260OooOO0 = zzikVar;
        }
        zzjs zzjsVarZzt = this.f37615OooO00o.zzt();
        zzjsVarZzt.zzg();
        zzjsVarZzt.zza();
        zzjsVarZzt.OooOO0(new o0O00o0(zzjsVarZzt, zzikVar));
    }

    @WorkerThread
    public final void OooO0Oo(zzik zzikVar, boolean z, long j) {
        this.f37615OooO00o.zzd().zzf(this.f37615OooO00o.zzav().elapsedRealtime());
        if (!this.f37615OooO00o.zzu().f16278OooO0o0.OooO00o(zzikVar != null && zzikVar.f16252OooO00o, z, j) || zzikVar == null) {
            return;
        }
        zzikVar.f16252OooO00o = false;
    }

    @MainThread
    public final zzik OooO0o(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zzik zzikVar = (zzik) this.f16256OooO0o.get(activity);
        if (zzikVar == null) {
            zzik zzikVar2 = new zzik(null, OooO0o0(activity.getClass()), this.f37615OooO00o.zzv().zzq());
            this.f16256OooO0o.put(activity, zzikVar2);
            zzikVar = zzikVar2;
        }
        return this.f16253OooO != null ? this.f16253OooO : zzikVar;
    }

    @VisibleForTesting
    public final String OooO0o0(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str.length();
        this.f37615OooO00o.zzf();
        if (length2 <= 100) {
            return str;
        }
        this.f37615OooO00o.zzf();
        return str.substring(0, 100);
    }

    @MainThread
    public final void OooO0oO(Activity activity, zzik zzikVar, boolean z) {
        zzik zzikVar2;
        zzik zzikVar3 = this.f16254OooO0OO == null ? this.f16255OooO0Oo : this.f16254OooO0OO;
        if (zzikVar.zzb == null) {
            zzikVar2 = new zzik(zzikVar.zza, activity != null ? OooO0o0(activity.getClass()) : null, zzikVar.zzc, zzikVar.zze, zzikVar.zzf);
        } else {
            zzikVar2 = zzikVar;
        }
        this.f16255OooO0Oo = this.f16254OooO0OO;
        this.f16254OooO0OO = zzikVar2;
        this.f37615OooO00o.zzaz().zzp(new o00OO0O0(this, zzikVar2, zzikVar3, this.f37615OooO00o.zzav().elapsedRealtime(), z));
    }

    public final zzik zzi() {
        return this.f16254OooO0OO;
    }

    @WorkerThread
    public final zzik zzj(boolean z) {
        zza();
        zzg();
        if (!z) {
            return this.f16257OooO0o0;
        }
        zzik zzikVar = this.f16257OooO0o0;
        return zzikVar != null ? zzikVar : this.f16260OooOO0;
    }

    @MainThread
    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f37615OooO00o.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f16256OooO0o.put(activity, new zzik(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzs(Activity activity) {
        synchronized (this.f16262OooOO0o) {
            if (activity == this.f16258OooO0oO) {
                this.f16258OooO0oO = null;
            }
        }
        if (this.f37615OooO00o.zzf().zzu()) {
            this.f16256OooO0o.remove(activity);
        }
    }

    @MainThread
    public final void zzt(Activity activity) {
        synchronized (this.f16262OooOO0o) {
            this.f16261OooOO0O = false;
            this.f16259OooO0oo = true;
        }
        long jElapsedRealtime = this.f37615OooO00o.zzav().elapsedRealtime();
        if (!this.f37615OooO00o.zzf().zzu()) {
            this.f16254OooO0OO = null;
            this.f37615OooO00o.zzaz().zzp(new oo0O(this, jElapsedRealtime));
        } else {
            zzik zzikVarOooO0o = OooO0o(activity);
            this.f16255OooO0Oo = this.f16254OooO0OO;
            this.f16254OooO0OO = null;
            this.f37615OooO00o.zzaz().zzp(new o00OO(this, zzikVarOooO0o, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzu(Activity activity) {
        synchronized (this.f16262OooOO0o) {
            int i = 1;
            this.f16261OooOO0O = true;
            if (activity != this.f16258OooO0oO) {
                synchronized (this.f16262OooOO0o) {
                    this.f16258OooO0oO = activity;
                    this.f16259OooO0oo = false;
                }
                if (this.f37615OooO00o.zzf().zzu()) {
                    this.f16253OooO = null;
                    this.f37615OooO00o.zzaz().zzp(new o000O000(this, i));
                }
            }
        }
        if (!this.f37615OooO00o.zzf().zzu()) {
            this.f16254OooO0OO = this.f16253OooO;
            this.f37615OooO00o.zzaz().zzp(new o00OO0OO(this));
        } else {
            OooO0oO(activity, OooO0o(activity), false);
            zzd zzdVarZzd = this.f37615OooO00o.zzd();
            zzdVarZzd.f37615OooO00o.zzaz().zzp(new Oooo000(zzdVarZzd, zzdVarZzd.f37615OooO00o.zzav().elapsedRealtime()));
        }
    }

    @MainThread
    public final void zzv(Activity activity, Bundle bundle) {
        zzik zzikVar;
        if (!this.f37615OooO00o.zzf().zzu() || bundle == null || (zzikVar = (zzik) this.f16256OooO0o.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzikVar.zzc);
        bundle2.putString("name", zzikVar.zza);
        bundle2.putString("referrer_name", zzikVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r5.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r6.length() <= 100) goto L39;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzw(@NonNull Activity activity, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) {
        if (!this.f37615OooO00o.zzf().zzu()) {
            this.f37615OooO00o.zzay().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzik zzikVar = this.f16254OooO0OO;
        if (zzikVar == null) {
            this.f37615OooO00o.zzay().zzl().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f16256OooO0o.get(activity) == null) {
            this.f37615OooO00o.zzay().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = OooO0o0(activity.getClass());
        }
        boolean zZza = zzil.zza(zzikVar.zzb, str2);
        boolean zZza2 = zzil.zza(zzikVar.zza, str);
        if (zZza && zZza2) {
            this.f37615OooO00o.zzay().zzl().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                this.f37615OooO00o.zzf();
            }
            this.f37615OooO00o.zzay().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                this.f37615OooO00o.zzf();
            }
            this.f37615OooO00o.zzay().zzl().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        this.f37615OooO00o.zzay().zzj().zzc("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzik zzikVar2 = new zzik(str, str2, this.f37615OooO00o.zzv().zzq());
        this.f16256OooO0o.put(activity, zzikVar2);
        OooO0oO(activity, zzikVar2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r2 > 100) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r4 > 100) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzx(Bundle bundle, long j) {
        String strOooO0o0;
        synchronized (this.f16262OooOO0o) {
            if (!this.f16261OooOO0O) {
                this.f37615OooO00o.zzay().zzl().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle.getString("screen_name");
            if (string != null) {
                if (string.length() > 0) {
                    int length = string.length();
                    this.f37615OooO00o.zzf();
                }
                this.f37615OooO00o.zzay().zzl().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
            String string2 = bundle.getString("screen_class");
            if (string2 != null) {
                if (string2.length() > 0) {
                    int length2 = string2.length();
                    this.f37615OooO00o.zzf();
                }
                this.f37615OooO00o.zzay().zzl().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                return;
            }
            if (string2 == null) {
                Activity activity = this.f16258OooO0oO;
                strOooO0o0 = activity != null ? OooO0o0(activity.getClass()) : "Activity";
            } else {
                strOooO0o0 = string2;
            }
            zzik zzikVar = this.f16254OooO0OO;
            if (this.f16259OooO0oo && zzikVar != null) {
                this.f16259OooO0oo = false;
                boolean zZza = zzil.zza(zzikVar.zzb, strOooO0o0);
                boolean zZza2 = zzil.zza(zzikVar.zza, string);
                if (zZza && zZza2) {
                    this.f37615OooO00o.zzay().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            this.f37615OooO00o.zzay().zzj().zzc("Logging screen view with name, class", string == null ? "null" : string, strOooO0o0 == null ? "null" : strOooO0o0);
            zzik zzikVar2 = this.f16254OooO0OO == null ? this.f16255OooO0Oo : this.f16254OooO0OO;
            zzik zzikVar3 = new zzik(string, strOooO0o0, this.f37615OooO00o.zzv().zzq(), true, j);
            this.f16254OooO0OO = zzikVar3;
            this.f16255OooO0Oo = zzikVar2;
            this.f16253OooO = zzikVar3;
            this.f37615OooO00o.zzaz().zzp(new o00OO00O(this, bundle, zzikVar3, zzikVar2, this.f37615OooO00o.zzav().elapsedRealtime()));
        }
    }
}
