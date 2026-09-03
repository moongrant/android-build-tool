package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import io.agora.rtc.Constants;
import javax.annotation.Nullable;
import p252o00ooO0o.o00;
import p252o00ooO0o.o000O;
import p252o00ooO0o.o000O0Oo;
import p252o00ooO0o.o000OO00;
import p252o00ooO0o.o000OO0O;
import p252o00ooO0o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleSignatureVerifier {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static GoogleSignatureVerifier f14627OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f14628OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile String f14629OooO0O0;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.f14628OooO00o = context.getApplicationContext();
    }

    @Nullable
    public static final o000O0Oo OooO00o(PackageInfo packageInfo, o000O0Oo... o000o0ooArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        o000OO0O o000oo0o2 = new o000OO0O(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < o000o0ooArr.length; i++) {
            if (o000o0ooArr[i].equals(o000oo0o2)) {
                return o000o0ooArr[i];
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (f14627OooO0OO == null) {
                o000OO00.OooO00o(context);
                f14627OooO0OO = new GoogleSignatureVerifier(context);
            }
        }
        return f14627OooO0OO;
    }

    public static final boolean zzb(@NonNull PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & Constants.ERR_WATERMARK_READ) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? OooO00o(packageInfo, o000O.f40918OooO00o) : OooO00o(packageInfo, o000O.f40918OooO00o[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @SuppressLint({"PackageManagerGetSignatures"})
    public final o00 OooO0O0(String str) {
        boolean zZzi;
        o00 o00VarOooO0O0;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return o00.OooO0O0("null pkg");
        }
        if (str.equals(this.f14629OooO0O0)) {
            return o00.f40911OooO0o0;
        }
        o000Oo0 o000oo1 = o000OO00.f40924OooO00o;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                o000OO00.OooO0Oo();
                zZzi = o000OO00.f40929OooO0o0.zzi();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            zZzi = false;
        }
        threadPolicyAllowThreadDiskReads = 1;
        if (zZzi) {
            o00VarOooO0O0 = o000OO00.OooO0OO(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.f14628OooO00o), true);
        } else {
            try {
                PackageInfo packageInfo = this.f14628OooO00o.getPackageManager().getPackageInfo(str, 64);
                boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.f14628OooO00o);
                if (packageInfo == null) {
                    o00VarOooO0O0 = o00.OooO0O0("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        o00VarOooO0O0 = o00.OooO0O0("single cert required");
                    } else {
                        o000OO0O o000oo0o2 = new o000OO0O(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            o00 o00VarOooO0O1 = o000OO00.OooO0O0(str2, o000oo0o2, zHonorsDebugCertificates, false);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            if (!o00VarOooO0O1.f40912OooO00o || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                o00VarOooO0O0 = o00VarOooO0O1;
                            } else {
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                try {
                                    o00 o00VarOooO0O2 = o000OO00.OooO0O0(str2, o000oo0o2, false, true);
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                    if (o00VarOooO0O2.f40912OooO00o) {
                                        o00VarOooO0O0 = o00.OooO0O0("debuggable release cert app rejected");
                                    } else {
                                        o00VarOooO0O0 = o00VarOooO0O1;
                                    }
                                } catch (Throwable th2) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            throw th3;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                return o00.OooO0OO("no pkg ".concat(str), e2);
            }
        }
        if (o00VarOooO0O0.f40912OooO00o) {
            this.f14629OooO0O0 = str;
        }
        return o00VarOooO0O0;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.f14628OooO00o)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@NonNull String str) {
        o00 o00VarOooO0O0 = OooO0O0(str);
        o00VarOooO0O0.OooO0Oo();
        return o00VarOooO0O0.f40912OooO00o;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        o00 o00VarOooO0O0;
        String[] packagesForUid = this.f14628OooO00o.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            o00VarOooO0O0 = o00.OooO0O0("no pkgs");
        } else {
            o00VarOooO0O0 = null;
            for (String str : packagesForUid) {
                o00VarOooO0O0 = OooO0O0(str);
                if (!o00VarOooO0O0.f40912OooO00o) {
                }
            }
            Preconditions.checkNotNull(o00VarOooO0O0);
        }
        o00VarOooO0O0.OooO0Oo();
        return o00VarOooO0O0.f40912OooO00o;
    }
}
