package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfg {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzfy f16169OooO00o;

    public zzfg(zzkz zzkzVar) {
        this.f16169OooO00o = zzkzVar.f16294OooOO0o;
    }

    @VisibleForTesting
    public final boolean OooO00o() {
        try {
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(this.f16169OooO00o.zzau());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f16169OooO00o.zzay().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f16169OooO00o.zzay().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
