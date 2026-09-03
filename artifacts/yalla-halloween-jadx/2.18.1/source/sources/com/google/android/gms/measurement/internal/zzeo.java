package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import o0OO0OoO.o000OO0O;
import o0OO0OoO.o00Ooo;
import o0OO0OoO.oo000o;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeo extends o000OO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final zzem f16132OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public char f16133OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f16134OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzem f16135OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("this")
    public String f16136OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zzem f16137OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final zzem f16138OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final zzem f16139OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final zzem f16140OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final zzem f16141OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final zzem f16142OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final zzem f16143OooOOO0;

    public zzeo(zzfy zzfyVar) {
        super(zzfyVar);
        this.f16133OooO0OO = (char) 0;
        this.f16134OooO0Oo = -1L;
        this.f16135OooO0o = new zzem(this, 6, false, false);
        this.f16137OooO0oO = new zzem(this, 6, true, false);
        this.f16138OooO0oo = new zzem(this, 6, false, true);
        this.f16132OooO = new zzem(this, 5, false, false);
        this.f16139OooOO0 = new zzem(this, 5, true, false);
        this.f16140OooOO0O = new zzem(this, 5, false, true);
        this.f16141OooOO0o = new zzem(this, 4, false, false);
        this.f16143OooOOO0 = new zzem(this, 3, false, false);
        this.f16142OooOOO = new zzem(this, 2, false, false);
    }

    public static String OooO(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    public static String OooO0o(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strOooO0oO = OooO0oO(z, obj);
        String strOooO0oO2 = OooO0oO(z, obj2);
        String strOooO0oO3 = OooO0oO(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strOooO0oO)) {
            sb.append(str2);
            sb.append(strOooO0oO);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strOooO0oO2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strOooO0oO2);
        }
        if (!TextUtils.isEmpty(strOooO0oO3)) {
            sb.append(str3);
            sb.append(strOooO0oO3);
        }
        return sb.toString();
    }

    public static Object OooO0o0(String str) {
        if (str == null) {
            return null;
        }
        return new oo000o(str);
    }

    @VisibleForTesting
    public static String OooO0oO(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            String str = obj.toString().charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof oo000o) {
                return ((oo000o) obj).f37891OooO00o;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strOooO = OooO(zzfy.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && OooO(className).equals(strOooO)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
        }
        return sb.toString();
    }

    @Override // o0OO0OoO.o000OO0O
    public final boolean OooO0O0() {
        return false;
    }

    public final void OooO0oo(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(zzq(), i)) {
            Log.println(i, zzq(), OooO0o(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzfv zzfvVar = this.f37615OooO00o.f16201OooOO0;
        if (zzfvVar == null) {
            Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
        } else if (zzfvVar.OooO0Oo()) {
            zzfvVar.zzp(new o00Ooo(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        } else {
            Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
        }
    }

    public final zzem zzc() {
        return this.f16143OooOOO0;
    }

    public final zzem zzd() {
        return this.f16135OooO0o;
    }

    public final zzem zze() {
        return this.f16138OooO0oo;
    }

    public final zzem zzh() {
        return this.f16137OooO0oO;
    }

    public final zzem zzi() {
        return this.f16141OooOO0o;
    }

    public final zzem zzj() {
        return this.f16142OooOOO;
    }

    public final zzem zzk() {
        return this.f16132OooO;
    }

    public final zzem zzl() {
        return this.f16140OooOO0O;
    }

    public final zzem zzm() {
        return this.f16139OooOO0;
    }

    @VisibleForTesting
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String zzq() {
        String str;
        synchronized (this) {
            try {
                if (this.f16136OooO0o0 == null) {
                    if (this.f37615OooO00o.zzy() != null) {
                        this.f16136OooO0o0 = this.f37615OooO00o.zzy();
                    } else {
                        this.f37615OooO00o.zzf().f37615OooO00o.zzaw();
                        this.f16136OooO0o0 = "FA";
                    }
                }
                Preconditions.checkNotNull(this.f16136OooO0o0);
                str = this.f16136OooO0o0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
