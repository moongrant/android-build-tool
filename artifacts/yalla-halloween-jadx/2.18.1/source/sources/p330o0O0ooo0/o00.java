package p330o0O0ooo0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.CheckReturnValue;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import org.conscrypt.EvpMdRef;
import p330o0O0ooo0.o00;
import p330o0O0ooo0.o000O00O;
import p330o0O0ooo0.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000O00O f37047OooO00o = new o000O00O(o000O0O0.OooOOo0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o000O0 f37048OooO0O0 = new o000O0(o000O0O0.OooOOo0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o000O0Oo f37049OooO0OO = new o000O0Oo(o000O0O0.OooOOo0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000OO0O f37050OooO0Oo = new o000OO0O(o000O0O0.OooOOo0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f37051OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile zzaf f37052OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static Context f37053OooO0oO;

    public static o0O0ooO OooO00o(final String str, final o000O0O0 o000o0o1, final boolean z, boolean z2) {
        try {
            OooO0OO();
            Preconditions.checkNotNull(f37053OooO0oO);
            try {
                return f37052OooO0o0.zzh(new zzs(str, o000o0o1, z, z2), ObjectWrapper.wrap(f37053OooO0oO.getPackageManager())) ? o0O0ooO.f37064OooO0o0 : new o00O0000(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = z;
                        String str2 = str;
                        o000O0O0 o000o0o2 = o000o0o1;
                        o000O00O o000o00o2 = o00.f37047OooO00o;
                        String str3 = true != (!z3 && o00.OooO00o(str2, o000o0o2, true, false).f37065OooO00o) ? "not allowed" : "debug cert rejected";
                        MessageDigest messageDigestZza = AndroidUtilsLight.zza(EvpMdRef.SHA256.JCA_NAME);
                        Preconditions.checkNotNull(messageDigestZza);
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str3, str2, Hex.bytesToStringLowercase(messageDigestZza.digest(o000o0o2.OooOOo())), Boolean.valueOf(z3), "12451000.false");
                    }
                });
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return o0O0ooO.OooO0OO("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return o0O0ooO.OooO0OO("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    public static o0O0ooO OooO0O0(String str, boolean z, boolean z2) {
        o0O0ooO o0o0oooOooO0OO;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(f37053OooO0oO);
            try {
                OooO0OO();
                zzo zzoVar = new zzo(str, z, false, ObjectWrapper.wrap(f37053OooO0oO), false);
                try {
                    zzq zzqVarZze = z2 ? f37052OooO0o0.zze(zzoVar) : f37052OooO0o0.zzf(zzoVar);
                    if (zzqVarZze.zzb()) {
                        o0o0oooOooO0OO = new o0O0ooO(true, zzqVarZze.zzc(), null, null);
                    } else {
                        String strZza = zzqVarZze.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = zzqVarZze.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        int iZzc = zzqVarZze.zzc();
                        zzqVarZze.zzd();
                        o0o0oooOooO0OO = new o0O0ooO(false, iZzc, strZza, nameNotFoundException);
                    }
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    o0o0oooOooO0OO = o0O0ooO.OooO0OO("module call", e);
                }
            } catch (DynamiteModule.LoadingException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                o0o0oooOooO0OO = o0O0ooO.OooO0OO("module init: ".concat(String.valueOf(e2.getMessage())), e2);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return o0o0oooOooO0OO;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    public static void OooO0OO() throws DynamiteModule.LoadingException {
        if (f37052OooO0o0 != null) {
            return;
        }
        Preconditions.checkNotNull(f37053OooO0oO);
        synchronized (f37051OooO0o) {
            if (f37052OooO0o0 == null) {
                f37052OooO0o0 = zzae.zzb(DynamiteModule.load(f37053OooO0oO, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
