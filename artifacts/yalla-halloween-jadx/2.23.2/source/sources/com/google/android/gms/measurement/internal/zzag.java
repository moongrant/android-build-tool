package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.session.o00O00;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p271o00ooooo.oO000o00;
import p271o00ooooo.oOo00o00;

/* JADX INFO: loaded from: classes3.dex */
public final class zzag extends oOo00o00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Boolean f15396OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public oO000o00 f15397OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Boolean f15398OooO0Oo;

    public zzag(zzgd zzgdVar) {
        super(zzgdVar);
        this.f15397OooO0OO = new oO000o00() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // p271o00ooooo.oO000o00
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzeg.zzD.zza(null)).longValue();
    }

    public static final long zzz() {
        return ((Long) zzeg.zzd.zza(null)).longValue();
    }

    public final String OooO00o(String str) {
        zzgd zzgdVar = this.f40788OooO00o;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            zzgdVar.zzaA().zzd().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            zzgdVar.zzaA().zzd().zzb("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            zzgdVar.zzaA().zzd().zzb("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            zzgdVar.zzaA().zzd().zzb("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    @VisibleForTesting
    public final Bundle OooO0O0() {
        zzgd zzgdVar = this.f40788OooO00o;
        try {
            if (zzgdVar.zzaw().getPackageManager() == null) {
                zzgdVar.zzaA().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zzgdVar.zzaw()).getApplicationInfo(zzgdVar.zzaw().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzgdVar.zzaA().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            zzgdVar.zzaA().zzd().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean OooO0OO(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleOooO0O0 = OooO0O0();
        if (bundleOooO0O0 == null) {
            o00O00.OooO00o(this.f40788OooO00o, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleOooO0O0.containsKey(str)) {
            return Boolean.valueOf(bundleOooO0O0.getBoolean(str));
        }
        return null;
    }

    @WorkerThread
    public final boolean OooO0Oo() {
        if (this.f15396OooO0O0 == null) {
            Boolean boolOooO0OO = OooO0OO("app_measurement_lite");
            this.f15396OooO0O0 = boolOooO0OO;
            if (boolOooO0OO == null) {
                this.f15396OooO0O0 = Boolean.FALSE;
            }
        }
        return this.f15396OooO0O0.booleanValue() || !this.f40788OooO00o.zzN();
    }

    @WorkerThread
    public final double zza(String str, zzef zzefVar) {
        if (str == null) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
        String strZza = this.f15397OooO0OO.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzefVar.zza(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
    }

    public final int zzc() {
        return this.f40788OooO00o.zzv().zzai(201500000, true) ? 100 : 25;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzf(str, zzeg.zzI, 25, 100);
    }

    @WorkerThread
    public final int zze(String str, zzef zzefVar) {
        if (str == null) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
        String strZza = this.f15397OooO0OO.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzefVar.zza(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
    }

    @WorkerThread
    public final int zzf(String str, zzef zzefVar, int i, int i2) {
        return Math.max(Math.min(zze(str, zzefVar), i2), i);
    }

    public final long zzh() {
        this.f40788OooO00o.zzay();
        return 79000L;
    }

    @WorkerThread
    public final long zzi(String str, zzef zzefVar) {
        if (str == null) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
        String strZza = this.f15397OooO0OO.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzefVar.zza(Long.valueOf(Long.parseLong(strZza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
    }

    public final String zzl() {
        return OooO00o("debug.firebase.analytics.app");
    }

    public final String zzm() {
        return OooO00o("debug.deferred.deeplink");
    }

    @WorkerThread
    public final String zzo(String str, zzef zzefVar) {
        return str == null ? (String) zzefVar.zza(null) : (String) zzefVar.zza(this.f15397OooO0OO.zza(str, zzefVar.zzb()));
    }

    public final boolean zzr() {
        Boolean boolOooO0OO = OooO0OO("google_analytics_adid_collection_enabled");
        return boolOooO0OO == null || boolOooO0OO.booleanValue();
    }

    @WorkerThread
    public final boolean zzs(String str, zzef zzefVar) {
        if (str == null) {
            return ((Boolean) zzefVar.zza(null)).booleanValue();
        }
        String strZza = this.f15397OooO0OO.zza(str, zzefVar.zzb());
        return TextUtils.isEmpty(strZza) ? ((Boolean) zzefVar.zza(null)).booleanValue() : ((Boolean) zzefVar.zza(Boolean.valueOf("1".equals(strZza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.f15397OooO0OO.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean boolOooO0OO = OooO0OO("google_analytics_automatic_screen_reporting_enabled");
        return boolOooO0OO == null || boolOooO0OO.booleanValue();
    }

    public final boolean zzv() {
        this.f40788OooO00o.zzay();
        Boolean boolOooO0OO = OooO0OO("firebase_analytics_collection_deactivated");
        return boolOooO0OO != null && boolOooO0OO.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.f15397OooO0OO.zza(str, "measurement.event_sampling_enabled"));
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.f15398OooO0Oo == null) {
            synchronized (this) {
                if (this.f15398OooO0Oo == null) {
                    ApplicationInfo applicationInfo = this.f40788OooO00o.zzaw().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.f15398OooO0Oo = Boolean.valueOf(z);
                    }
                    if (this.f15398OooO0Oo == null) {
                        this.f15398OooO0Oo = Boolean.TRUE;
                        this.f40788OooO00o.zzaA().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f15398OooO0Oo.booleanValue();
    }
}
