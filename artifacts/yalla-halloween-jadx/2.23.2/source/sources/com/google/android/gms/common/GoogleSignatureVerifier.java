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
import p254o00ooO0o.o00;
import p254o00ooO0o.o000O0O0;
import p254o00ooO0o.o00O00;
import p254o00ooO0o.o00O000;
import p254o00ooO0o.o00O0000;
import p254o00ooO0o.o00oOoo;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleSignatureVerifier {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static GoogleSignatureVerifier f14151OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f14152OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile String f14153OooO0O0;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.f14152OooO00o = context.getApplicationContext();
    }

    @Nullable
    public static final o00 OooO00o(PackageInfo packageInfo, o00... o00VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        o00O0000 o00o0001 = new o00O0000(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < o00VarArr.length; i++) {
            if (o00VarArr[i].equals(o00o0001)) {
                return o00VarArr[i];
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (f14151OooO0OO == null) {
                o00O000.OooO00o(context);
                f14151OooO0OO = new GoogleSignatureVerifier(context);
            }
        }
        return f14151OooO0OO;
    }

    public static final boolean zzb(@NonNull PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & Constants.ERR_WATERMARK_READ) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? OooO00o(packageInfo, o00oOoo.f40258OooO00o) : OooO00o(packageInfo, o00oOoo.f40258OooO00o[0])) != null) {
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
    public final o00O00 OooO0O0(String str) {
        boolean zZzi;
        o00O00 o00o00OooO0O0;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return o00O00.OooO0O0("null pkg");
        }
        if (str.equals(this.f14153OooO0O0)) {
            return o00O00.f40244OooO0o0;
        }
        o000O0O0 o000o0o1 = o00O000.f40249OooO00o;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                o00O000.OooO0Oo();
                zZzi = o00O000.f40254OooO0o0.zzi();
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
            o00o00OooO0O0 = o00O000.OooO0OO(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.f14152OooO00o), true);
        } else {
            try {
                PackageInfo packageInfo = this.f14152OooO00o.getPackageManager().getPackageInfo(str, 64);
                boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.f14152OooO00o);
                if (packageInfo == null) {
                    o00o00OooO0O0 = o00O00.OooO0O0("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        o00o00OooO0O0 = o00O00.OooO0O0("single cert required");
                    } else {
                        o00O0000 o00o0001 = new o00O0000(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            o00O00 o00o00OooO0O1 = o00O000.OooO0O0(str2, o00o0001, zHonorsDebugCertificates, false);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            if (!o00o00OooO0O1.f40245OooO00o || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                o00o00OooO0O0 = o00o00OooO0O1;
                            } else {
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                try {
                                    o00O00 o00o00OooO0O2 = o00O000.OooO0O0(str2, o00o0001, false, true);
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                    if (o00o00OooO0O2.f40245OooO00o) {
                                        o00o00OooO0O0 = o00O00.OooO0O0("debuggable release cert app rejected");
                                    } else {
                                        o00o00OooO0O0 = o00o00OooO0O1;
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
                return o00O00.OooO0OO("no pkg ".concat(str), e2);
            }
        }
        if (o00o00OooO0O0.f40245OooO00o) {
            this.f14153OooO0O0 = str;
        }
        return o00o00OooO0O0;
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
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.f14152OooO00o)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@NonNull String str) {
        o00O00 o00o00OooO0O0 = OooO0O0(str);
        o00o00OooO0O0.OooO0Oo();
        return o00o00OooO0O0.f40245OooO00o;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        o00O00 o00o00OooO0O0;
        String[] packagesForUid = this.f14152OooO00o.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            o00o00OooO0O0 = o00O00.OooO0O0("no pkgs");
        } else {
            o00o00OooO0O0 = null;
            for (String str : packagesForUid) {
                o00o00OooO0O0 = OooO0O0(str);
                if (!o00o00OooO0O0.f40245OooO00o) {
                }
            }
            Preconditions.checkNotNull(o00o00OooO0O0);
        }
        o00o00OooO0O0.OooO0Oo();
        return o00o00OooO0O0.f40245OooO00o;
    }
}
