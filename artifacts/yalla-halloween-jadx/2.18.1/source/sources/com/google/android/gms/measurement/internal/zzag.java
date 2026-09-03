package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import o0OO0OoO.OooO0o;
import o0OO0OoO.o000O0Oo;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p167o00Ooo.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzag extends o000O0Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Boolean f16075OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0o f16076OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Boolean f16077OooO0Oo;

    public zzag(zzfy zzfyVar) {
        super(zzfyVar);
        this.f16076OooO0OO = new OooO0o() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // o0OO0OoO.OooO0o
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzeb.zzC.zza(null)).longValue();
    }

    public static final long zzz() {
        return ((Long) zzeb.zzc.zza(null)).longValue();
    }

    public final String OooO00o(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            this.f37615OooO00o.zzay().zzd().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            this.f37615OooO00o.zzay().zzd().zzb("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            this.f37615OooO00o.zzay().zzd().zzb("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.f37615OooO00o.zzay().zzd().zzb("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final int OooO0O0(@Size(min = 1) String str) {
        return zzf(str, zzeb.zzG, 500, RecyclerView.MAX_SCROLL_DURATION);
    }

    @VisibleForTesting
    public final Bundle OooO0OO() {
        try {
            if (this.f37615OooO00o.zzau().getPackageManager() == null) {
                this.f37615OooO00o.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.f37615OooO00o.zzau()).getApplicationInfo(this.f37615OooO00o.zzau().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.f37615OooO00o.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f37615OooO00o.zzay().zzd().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean OooO0Oo(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleOooO0OO = OooO0OO();
        if (bundleOooO0OO == null) {
            OooOO0.OooO0O0(this.f37615OooO00o, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleOooO0OO.containsKey(str)) {
            return Boolean.valueOf(bundleOooO0OO.getBoolean(str));
        }
        return null;
    }

    @WorkerThread
    public final boolean OooO0o0() {
        if (this.f16075OooO0O0 == null) {
            Boolean boolOooO0Oo = OooO0Oo("app_measurement_lite");
            this.f16075OooO0O0 = boolOooO0Oo;
            if (boolOooO0Oo == null) {
                this.f16075OooO0O0 = Boolean.FALSE;
            }
        }
        return this.f16075OooO0O0.booleanValue() || !this.f37615OooO00o.zzN();
    }

    @WorkerThread
    public final double zza(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Double) zzeaVar.zza(null)).doubleValue();
        }
        String strZza = this.f16076OooO0OO.zza(str, zzeaVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Double) zzeaVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzeaVar.zza(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzeaVar.zza(null)).doubleValue();
        }
    }

    public final int zzc() {
        zzlh zzlhVarZzv = this.f37615OooO00o.zzv();
        Boolean bool = zzlhVarZzv.f37615OooO00o.zzt().f16270OooO0o0;
        if (zzlhVarZzv.zzm() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzf(str, zzeb.zzH, 25, 100);
    }

    @WorkerThread
    public final int zze(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Integer) zzeaVar.zza(null)).intValue();
        }
        String strZza = this.f16076OooO0OO.zza(str, zzeaVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Integer) zzeaVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzeaVar.zza(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzeaVar.zza(null)).intValue();
        }
    }

    @WorkerThread
    public final int zzf(String str, zzea zzeaVar, int i, int i2) {
        return Math.max(Math.min(zze(str, zzeaVar), i2), i);
    }

    public final long zzh() {
        this.f37615OooO00o.zzaw();
        return 73000L;
    }

    @WorkerThread
    public final long zzi(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Long) zzeaVar.zza(null)).longValue();
        }
        String strZza = this.f16076OooO0OO.zza(str, zzeaVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Long) zzeaVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzeaVar.zza(Long.valueOf(Long.parseLong(strZza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzeaVar.zza(null)).longValue();
        }
    }

    public final String zzl() {
        return OooO00o("debug.firebase.analytics.app");
    }

    public final String zzm() {
        return OooO00o("debug.deferred.deeplink");
    }

    @WorkerThread
    public final String zzo(String str, zzea zzeaVar) {
        return str == null ? (String) zzeaVar.zza(null) : (String) zzeaVar.zza(this.f16076OooO0OO.zza(str, zzeaVar.zzb()));
    }

    public final boolean zzr() {
        Boolean boolOooO0Oo = OooO0Oo("google_analytics_adid_collection_enabled");
        return boolOooO0Oo == null || boolOooO0Oo.booleanValue();
    }

    @WorkerThread
    public final boolean zzs(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Boolean) zzeaVar.zza(null)).booleanValue();
        }
        String strZza = this.f16076OooO0OO.zza(str, zzeaVar.zzb());
        return TextUtils.isEmpty(strZza) ? ((Boolean) zzeaVar.zza(null)).booleanValue() : ((Boolean) zzeaVar.zza(Boolean.valueOf("1".equals(strZza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.f16076OooO0OO.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean boolOooO0Oo = OooO0Oo("google_analytics_automatic_screen_reporting_enabled");
        return boolOooO0Oo == null || boolOooO0Oo.booleanValue();
    }

    public final boolean zzv() {
        this.f37615OooO00o.zzaw();
        Boolean boolOooO0Oo = OooO0Oo("firebase_analytics_collection_deactivated");
        return boolOooO0Oo != null && boolOooO0Oo.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.f16076OooO0OO.zza(str, "measurement.event_sampling_enabled"));
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.f16077OooO0Oo == null) {
            synchronized (this) {
                if (this.f16077OooO0Oo == null) {
                    ApplicationInfo applicationInfo = this.f37615OooO00o.zzau().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.f16077OooO0Oo = Boolean.valueOf(z);
                    }
                    if (this.f16077OooO0Oo == null) {
                        this.f16077OooO0Oo = Boolean.TRUE;
                        this.f37615OooO00o.zzay().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f16077OooO0Oo.booleanValue();
    }
}
