package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import p330o0O0ooo0.o00;
import p330o0O0ooo0.o000O00;
import p330o0O0ooo0.o000O00O;
import p330o0O0ooo0.o000Oo0;
import p330o0O0ooo0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class PackageSignatureVerifier {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static o000O00 f15131OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile o000Oo0 f15132OooO00o;

    public static o000O00 OooO00o() {
        o000O00 o000o01;
        synchronized (o000O00.class) {
            if (f15131OooO0O0 == null) {
                f15131OooO0O0 = new o000O00();
            }
            o000o01 = f15131OooO0O0;
        }
        return o000o01;
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context, @NonNull String str) {
        boolean zZzg;
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        OooO00o();
        o000O00O o000o00o2 = o00.f37047OooO00o;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                o00.OooO0OO();
                zZzg = o00.f37052OooO0o0.zzg();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            zZzg = false;
        }
        if (!zZzg) {
            throw new zzae();
        }
        String strConcat = String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : "-1");
        if (this.f15132OooO00o != null && this.f15132OooO00o.f37061OooO00o.equals(strConcat)) {
            return this.f15132OooO00o.f37062OooO0O0;
        }
        OooO00o();
        o0O0ooO o0o0oooOooO0O0 = o00.OooO0O0(str, zHonorsDebugCertificates, false);
        if (o0o0oooOooO0O0.f37065OooO00o) {
            this.f15132OooO00o = new o000Oo0(strConcat, PackageVerificationResult.zzd(str, o0o0oooOooO0O0.f37068OooO0Oo));
            return this.f15132OooO00o.f37062OooO0O0;
        }
        Preconditions.checkNotNull(o0o0oooOooO0O0.f37066OooO0O0);
        return PackageVerificationResult.zza(str, o0o0oooOooO0O0.f37066OooO0O0, o0o0oooOooO0O0.f37067OooO0OO);
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context, @NonNull String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzb();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException e) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (!packageVerificationResultQueryPackageSignatureVerified2.zzc()) {
                return packageVerificationResultQueryPackageSignatureVerified2;
            }
            Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e);
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
