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
import p252o00ooO0o.o00;
import p252o00ooO0o.o000O000;
import p252o00ooO0o.o000O0o;
import p252o00ooO0o.o000OO00;
import p252o00ooO0o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class PackageSignatureVerifier {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static o000O0o f14630OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile o000O000 f14631OooO00o;

    public static void OooO00o() {
        synchronized (o000O0o.class) {
            if (f14630OooO0O0 == null) {
                f14630OooO0O0 = new o000O0o();
            }
        }
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context, @NonNull String str) {
        boolean zZzg;
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        synchronized (o000O0o.class) {
            if (f14630OooO0O0 == null) {
                f14630OooO0O0 = new o000O0o();
            }
        }
        o000Oo0 o000oo1 = o000OO00.f40924OooO00o;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                o000OO00.OooO0Oo();
                zZzg = o000OO00.f40929OooO0o0.zzg();
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
        if (this.f14631OooO00o != null && this.f14631OooO00o.f40919OooO00o.equals(strConcat)) {
            return this.f14631OooO00o.f40920OooO0O0;
        }
        OooO00o();
        o00 o00VarOooO0OO = o000OO00.OooO0OO(str, zHonorsDebugCertificates, false);
        if (o00VarOooO0OO.f40912OooO00o) {
            this.f14631OooO00o = new o000O000(strConcat, PackageVerificationResult.zzd(str, o00VarOooO0OO.f40915OooO0Oo));
            return this.f14631OooO00o.f40920OooO0O0;
        }
        Preconditions.checkNotNull(o00VarOooO0OO.f40913OooO0O0);
        return PackageVerificationResult.zza(str, o00VarOooO0OO.f40913OooO0O0, o00VarOooO0OO.f40914OooO0OO);
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
