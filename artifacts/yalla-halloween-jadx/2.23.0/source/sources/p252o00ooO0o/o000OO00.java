package p252o00ooO0o;

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
import p252o00ooO0o.o000O0Oo;
import p252o00ooO0o.o000OO00;
import p252o00ooO0o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000Oo0 f40924OooO00o = new o000Oo0(o000O0Oo.OooOOoo("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o000O00 f40925OooO0O0 = new o000O00(o000O0Oo.OooOOoo("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o000O00O f40926OooO0OO = new o000O00O(o000O0Oo.OooOOoo("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000O0 f40927OooO0Oo = new o000O0(o000O0Oo.OooOOoo("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f40928OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile zzaf f40929OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static Context f40930OooO0oO;

    public static synchronized void OooO00o(Context context) {
        if (f40930OooO0oO != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f40930OooO0oO = context.getApplicationContext();
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.gms.common.zze] */
    public static o00 OooO0O0(final String str, final o000O0Oo o000o0oo2, final boolean z, boolean z2) {
        try {
            OooO0Oo();
            Preconditions.checkNotNull(f40930OooO0oO);
            try {
                return f40929OooO0o0.zzh(new zzs(str, o000o0oo2, z, z2), ObjectWrapper.wrap(f40930OooO0oO.getPackageManager())) ? o00.f40911OooO0o0 : new o000OOo0(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = z;
                        String str2 = str;
                        o000O0Oo o000o0oo3 = o000o0oo2;
                        o000Oo0 o000oo1 = o000OO00.f40924OooO00o;
                        String str3 = true != (!z3 && o000OO00.OooO0O0(str2, o000o0oo3, true, false).f40912OooO00o) ? "not allowed" : "debug cert rejected";
                        MessageDigest messageDigestZza = AndroidUtilsLight.zza("SHA-256");
                        Preconditions.checkNotNull(messageDigestZza);
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str3, str2, Hex.bytesToStringLowercase(messageDigestZza.digest(o000o0oo3.OooOo00())), Boolean.valueOf(z3), "12451000.false");
                    }
                });
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return o00.OooO0OO("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return o00.OooO0OO("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    public static o00 OooO0OO(String str, boolean z, boolean z2) {
        o00 o00VarOooO0OO;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(f40930OooO0oO);
            try {
                OooO0Oo();
                zzo zzoVar = new zzo(str, z, false, ObjectWrapper.wrap(f40930OooO0oO), false);
                try {
                    zzq zzqVarZze = z2 ? f40929OooO0o0.zze(zzoVar) : f40929OooO0o0.zzf(zzoVar);
                    if (zzqVarZze.zzb()) {
                        o00VarOooO0OO = new o00(true, zzqVarZze.zzc(), null, null);
                    } else {
                        String strZza = zzqVarZze.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = zzqVarZze.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        int iZzc = zzqVarZze.zzc();
                        zzqVarZze.zzd();
                        o00VarOooO0OO = new o00(false, iZzc, strZza, nameNotFoundException);
                    }
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    o00VarOooO0OO = o00.OooO0OO("module call", e);
                }
            } catch (DynamiteModule.LoadingException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                o00VarOooO0OO = o00.OooO0OO("module init: ".concat(String.valueOf(e2.getMessage())), e2);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return o00VarOooO0OO;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    public static void OooO0Oo() throws DynamiteModule.LoadingException {
        if (f40929OooO0o0 != null) {
            return;
        }
        Preconditions.checkNotNull(f40930OooO0oO);
        synchronized (f40928OooO0o) {
            if (f40929OooO0o0 == null) {
                f40929OooO0o0 = zzae.zzb(DynamiteModule.load(f40930OooO0oO, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
