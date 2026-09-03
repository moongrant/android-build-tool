package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DebugKt;
import p271o00ooooo.e;
import p271o00ooooo.e0;
import p271o00ooooo.oO00OOo0;
import p271o00ooooo.oOOOOo0O;
import p271o00ooooo.oOOo0000;
import p271o00ooooo.oOOo0O00;
import p271o00ooooo.oOo00o0o;
import p271o00ooooo.oOo0o00;
import p271o00ooooo.oo00;
import p271o00ooooo.oo000000;

/* JADX INFO: loaded from: classes3.dex */
public final class zziz extends oOo00o0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile zzir f15573OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile zzir f15574OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile zzir f15575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ConcurrentHashMap f15576OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @VisibleForTesting
    public zzir f15577OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("activityLock")
    public Activity f15578OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("activityLock")
    public volatile boolean f15579OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public zzir f15580OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("activityLock")
    public boolean f15581OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Object f15582OooOO0o;

    public zziz(zzgd zzgdVar) {
        super(zzgdVar);
        this.f15582OooOO0o = new Object();
        this.f15576OooO0o = new ConcurrentHashMap();
    }

    @Override // p271o00ooooo.oOo00o0o
    public final boolean OooO0O0() {
        return false;
    }

    @WorkerThread
    public final void OooO0OO(zzir zzirVar, zzir zzirVar2, long j, boolean z, Bundle bundle) {
        zzg();
        boolean z2 = false;
        boolean z3 = (zzirVar2 != null && zzirVar2.zzc == zzirVar.zzc && zzis.zza(zzirVar2.zzb, zzirVar.zzb) && zzis.zza(zzirVar2.zza, zzirVar.zza)) ? false : true;
        if (z && this.f15577OooO0o0 != null) {
            z2 = true;
        }
        zzgd zzgdVar = this.f40788OooO00o;
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzlp.zzK(zzirVar, bundle2, true);
            if (zzirVar2 != null) {
                String str = zzirVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzirVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzirVar2.zzc);
            }
            if (z2) {
                e0 e0Var = zzgdVar.zzu().f15597OooO0o;
                long j2 = j - e0Var.f40491OooO0O0;
                e0Var.f40491OooO0O0 = j;
                if (j2 > 0) {
                    zzgdVar.zzv().OooO(bundle2, j2);
                }
            }
            if (!zzgdVar.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzirVar.zze ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "app";
            long jCurrentTimeMillis = zzgdVar.zzax().currentTimeMillis();
            if (zzirVar.zze) {
                long j3 = zzirVar.zzf;
                if (j3 != 0) {
                    jCurrentTimeMillis = j3;
                }
            }
            zzgdVar.zzq().OooO0Oo(str3, "_vs", bundle2, jCurrentTimeMillis);
        }
        if (z2) {
            OooO0Oo(this.f15577OooO0o0, true, j);
        }
        this.f15577OooO0o0 = zzirVar;
        if (zzirVar.zze) {
            this.f15580OooOO0 = zzirVar;
        }
        zzjz zzjzVarZzt = zzgdVar.zzt();
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new e(zzjzVarZzt, zzirVar));
    }

    @WorkerThread
    public final void OooO0Oo(zzir zzirVar, boolean z, long j) {
        zzgd zzgdVar = this.f40788OooO00o;
        zzgdVar.zzd().zzf(zzgdVar.zzax().elapsedRealtime());
        if (!zzgdVar.zzu().f15597OooO0o.OooO00o(j, zzirVar != null && zzirVar.f15572OooO00o, z) || zzirVar == null) {
            return;
        }
        zzirVar.f15572OooO00o = false;
    }

    @MainThread
    public final zzir OooO0o(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zzir zzirVar = (zzir) this.f15576OooO0o.get(activity);
        if (zzirVar == null) {
            zzir zzirVar2 = new zzir(null, OooO0o0(activity.getClass()), this.f40788OooO00o.zzv().zzq());
            this.f15576OooO0o.put(activity, zzirVar2);
            zzirVar = zzirVar2;
        }
        return this.f15573OooO != null ? this.f15573OooO : zzirVar;
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
        zzgd zzgdVar = this.f40788OooO00o;
        zzgdVar.zzf();
        if (length2 <= 100) {
            return str;
        }
        zzgdVar.zzf();
        return str.substring(0, 100);
    }

    @MainThread
    public final void OooO0oO(Activity activity, zzir zzirVar, boolean z) {
        zzir zzirVar2;
        zzir zzirVar3 = this.f15574OooO0OO == null ? this.f15575OooO0Oo : this.f15574OooO0OO;
        if (zzirVar.zzb == null) {
            zzirVar2 = new zzir(zzirVar.zza, activity != null ? OooO0o0(activity.getClass()) : null, zzirVar.zzc, zzirVar.zze, zzirVar.zzf);
        } else {
            zzirVar2 = zzirVar;
        }
        this.f15575OooO0Oo = this.f15574OooO0OO;
        this.f15574OooO0OO = zzirVar2;
        this.f40788OooO00o.zzaB().zzp(new oOOo0000(this, zzirVar2, zzirVar3, this.f40788OooO00o.zzax().elapsedRealtime(), z));
    }

    public final zzir zzi() {
        return this.f15574OooO0OO;
    }

    @WorkerThread
    public final zzir zzj(boolean z) {
        zza();
        zzg();
        if (!z) {
            return this.f15577OooO0o0;
        }
        zzir zzirVar = this.f15577OooO0o0;
        return zzirVar != null ? zzirVar : this.f15580OooOO0;
    }

    @MainThread
    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f40788OooO00o.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f15576OooO0o.put(activity, new zzir(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzs(Activity activity) {
        synchronized (this.f15582OooOO0o) {
            if (activity == this.f15578OooO0oO) {
                this.f15578OooO0oO = null;
            }
        }
        if (this.f40788OooO00o.zzf().zzu()) {
            this.f15576OooO0o.remove(activity);
        }
    }

    @MainThread
    public final void zzt(Activity activity) {
        synchronized (this.f15582OooOO0o) {
            this.f15581OooOO0O = false;
            this.f15579OooO0oo = true;
        }
        long jElapsedRealtime = this.f40788OooO00o.zzax().elapsedRealtime();
        if (!this.f40788OooO00o.zzf().zzu()) {
            this.f15574OooO0OO = null;
            this.f40788OooO00o.zzaB().zzp(new oOo0o00(this, jElapsedRealtime));
        } else {
            zzir zzirVarOooO0o = OooO0o(activity);
            this.f15575OooO0Oo = this.f15574OooO0OO;
            this.f15574OooO0OO = null;
            this.f40788OooO00o.zzaB().zzp(new oo000000(this, zzirVarOooO0o, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzu(Activity activity) {
        synchronized (this.f15582OooOO0o) {
            this.f15581OooOO0O = true;
            if (activity != this.f15578OooO0oO) {
                synchronized (this.f15582OooOO0o) {
                    this.f15578OooO0oO = activity;
                    this.f15579OooO0oo = false;
                }
                if (this.f40788OooO00o.zzf().zzu()) {
                    this.f15573OooO = null;
                    this.f40788OooO00o.zzaB().zzp(new oo00(this));
                }
            }
        }
        if (!this.f40788OooO00o.zzf().zzu()) {
            this.f15574OooO0OO = this.f15573OooO;
            this.f40788OooO00o.zzaB().zzp(new oOOo0O00(this));
        } else {
            OooO0oO(activity, OooO0o(activity), false);
            zzd zzdVarZzd = this.f40788OooO00o.zzd();
            zzdVarZzd.f40788OooO00o.zzaB().zzp(new oO00OOo0(zzdVarZzd, zzdVarZzd.f40788OooO00o.zzax().elapsedRealtime()));
        }
    }

    @MainThread
    public final void zzv(Activity activity, Bundle bundle) {
        zzir zzirVar;
        if (!this.f40788OooO00o.zzf().zzu() || bundle == null || (zzirVar = (zzir) this.f15576OooO0o.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzirVar.zzc);
        bundle2.putString("name", zzirVar.zza);
        bundle2.putString("referrer_name", zzirVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r1 <= 100) goto L39;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzw(@NonNull Activity activity, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) {
        if (!this.f40788OooO00o.zzf().zzu()) {
            this.f40788OooO00o.zzaA().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzir zzirVar = this.f15574OooO0OO;
        if (zzirVar == null) {
            this.f40788OooO00o.zzaA().zzl().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f15576OooO0o.get(activity) == null) {
            this.f40788OooO00o.zzaA().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = OooO0o0(activity.getClass());
        }
        boolean zZza = zzis.zza(zzirVar.zzb, str2);
        boolean zZza2 = zzis.zza(zzirVar.zza, str);
        if (zZza && zZza2) {
            this.f40788OooO00o.zzaA().zzl().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                this.f40788OooO00o.zzf();
            }
            this.f40788OooO00o.zzaA().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                int length2 = str2.length();
                this.f40788OooO00o.zzf();
            }
            this.f40788OooO00o.zzaA().zzl().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        this.f40788OooO00o.zzaA().zzj().zzc("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzir zzirVar2 = new zzir(str, str2, this.f40788OooO00o.zzv().zzq());
        this.f15576OooO0o.put(activity, zzirVar2);
        OooO0oO(activity, zzirVar2, true);
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
        synchronized (this.f15582OooOO0o) {
            if (!this.f15581OooOO0O) {
                this.f40788OooO00o.zzaA().zzl().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle.getString("screen_name");
            if (string != null) {
                if (string.length() > 0) {
                    int length = string.length();
                    this.f40788OooO00o.zzf();
                }
                this.f40788OooO00o.zzaA().zzl().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
            String string2 = bundle.getString("screen_class");
            if (string2 != null) {
                if (string2.length() > 0) {
                    int length2 = string2.length();
                    this.f40788OooO00o.zzf();
                }
                this.f40788OooO00o.zzaA().zzl().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                return;
            }
            if (string2 == null) {
                Activity activity = this.f15578OooO0oO;
                strOooO0o0 = activity != null ? OooO0o0(activity.getClass()) : "Activity";
            } else {
                strOooO0o0 = string2;
            }
            zzir zzirVar = this.f15574OooO0OO;
            if (this.f15579OooO0oo && zzirVar != null) {
                this.f15579OooO0oo = false;
                boolean zZza = zzis.zza(zzirVar.zzb, strOooO0o0);
                boolean zZza2 = zzis.zza(zzirVar.zza, string);
                if (zZza && zZza2) {
                    this.f40788OooO00o.zzaA().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            this.f40788OooO00o.zzaA().zzj().zzc("Logging screen view with name, class", string == null ? "null" : string, strOooO0o0 == null ? "null" : strOooO0o0);
            zzir zzirVar2 = this.f15574OooO0OO == null ? this.f15575OooO0Oo : this.f15574OooO0OO;
            zzir zzirVar3 = new zzir(string, strOooO0o0, this.f40788OooO00o.zzv().zzq(), true, j);
            this.f15574OooO0OO = zzirVar3;
            this.f15575OooO0Oo = zzirVar2;
            this.f15573OooO = zzirVar3;
            this.f40788OooO00o.zzaB().zzp(new oOOOOo0O(this, bundle, zzirVar3, zzirVar2, this.f40788OooO00o.zzax().elapsedRealtime()));
        }
    }
}
