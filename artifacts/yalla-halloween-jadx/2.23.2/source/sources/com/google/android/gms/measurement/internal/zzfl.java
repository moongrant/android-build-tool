package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfl {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzgd f15489OooO00o;

    public zzfl(zzlh zzlhVar) {
        this.f15489OooO00o = zzlhVar.f15615OooOO0o;
    }

    @VisibleForTesting
    public final boolean OooO00o() {
        zzgd zzgdVar = this.f15489OooO00o;
        try {
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(zzgdVar.zzaw());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            zzgdVar.zzaA().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            zzgdVar.zzaA().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
