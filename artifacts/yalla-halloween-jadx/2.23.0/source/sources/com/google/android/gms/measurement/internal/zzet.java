package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpe;
import o000Oo0.OooO0O0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p269o00ooooo.o0OO0;
import p269o00ooooo.o0OO0O0;
import p269o00ooooo.oO000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzet extends oO000Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final zzer f15928OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public char f15929OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f15930OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzer f15931OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("this")
    public String f15932OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zzer f15933OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final zzer f15934OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final zzer f15935OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final zzer f15936OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final zzer f15937OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final zzer f15938OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final zzer f15939OooOOO0;

    public zzet(zzgd zzgdVar) {
        super(zzgdVar);
        this.f15929OooO0OO = (char) 0;
        this.f15930OooO0Oo = -1L;
        this.f15931OooO0o = new zzer(this, 6, false, false);
        this.f15933OooO0oO = new zzer(this, 6, true, false);
        this.f15934OooO0oo = new zzer(this, 6, false, true);
        this.f15928OooO = new zzer(this, 5, false, false);
        this.f15935OooOO0 = new zzer(this, 5, true, false);
        this.f15936OooOO0O = new zzer(this, 5, false, true);
        this.f15937OooOO0o = new zzer(this, 4, false, false);
        this.f15939OooOOO0 = new zzer(this, 3, false, false);
        this.f15938OooOOO = new zzer(this, 2, false, false);
    }

    public static o0OO0O0 OooO0Oo(String str) {
        if (str == null) {
            return null;
        }
        return new o0OO0O0(str);
    }

    @VisibleForTesting
    public static String OooO0o(Object obj, boolean z) {
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
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            String str = cCharAt == '-' ? "-" : "";
            OooO0O0.OooO00o(sb, str, jRound, "...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof o0OO0O0) {
                return ((o0OO0O0) obj).f41193OooO00o;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strOooO0oO = OooO0oO(zzgd.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && OooO0oO(className).equals(strOooO0oO)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
        }
        return sb2.toString();
    }

    public static String OooO0o0(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strOooO0o = OooO0o(obj, z);
        String strOooO0o2 = OooO0o(obj2, z);
        String strOooO0o3 = OooO0o(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strOooO0o)) {
            sb.append(str2);
            sb.append(strOooO0o);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strOooO0o2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strOooO0o2);
        }
        if (!TextUtils.isEmpty(strOooO0o3)) {
            sb.append(str3);
            sb.append(strOooO0o3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    public static String OooO0oO(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return str.substring(0, iLastIndexOf);
        }
        zzpe.zzc();
        return ((Boolean) zzeg.zzay.zza(null)).booleanValue() ? "" : str;
    }

    @Override // p269o00ooooo.oO000Oo
    public final boolean OooO0O0() {
        return false;
    }

    public final void OooO0oo(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(zzr(), i)) {
            Log.println(i, zzr(), OooO0o0(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzga zzgaVar = this.f41276OooO00o.f15997OooOO0;
        if (zzgaVar == null) {
            Log.println(6, zzr(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzgaVar.f41275OooO0O0) {
                Log.println(6, zzr(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            zzgaVar.zzp(new o0OO0(this, i, str, obj, obj2, obj3));
        }
    }

    public final zzer zzc() {
        return this.f15939OooOOO0;
    }

    public final zzer zzd() {
        return this.f15931OooO0o;
    }

    public final zzer zze() {
        return this.f15934OooO0oo;
    }

    public final zzer zzh() {
        return this.f15933OooO0oO;
    }

    public final zzer zzi() {
        return this.f15937OooOO0o;
    }

    public final zzer zzj() {
        return this.f15938OooOOO;
    }

    public final zzer zzk() {
        return this.f15928OooO;
    }

    public final zzer zzl() {
        return this.f15936OooOO0O;
    }

    public final zzer zzm() {
        return this.f15935OooOO0;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @VisibleForTesting
    public final String zzr() {
        String str;
        synchronized (this) {
            try {
                if (this.f15932OooO0o0 == null) {
                    if (this.f41276OooO00o.zzy() != null) {
                        this.f15932OooO0o0 = this.f41276OooO00o.zzy();
                    } else {
                        this.f41276OooO00o.zzf().f41276OooO00o.zzay();
                        this.f15932OooO0o0 = "FA";
                    }
                }
                Preconditions.checkNotNull(this.f15932OooO0o0);
                str = this.f15932OooO0o0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
