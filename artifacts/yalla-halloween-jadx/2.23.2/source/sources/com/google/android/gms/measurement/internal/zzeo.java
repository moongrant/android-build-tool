package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p004OooO0oO.o000oOoO;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final AtomicReference f15444OooO0O0 = new AtomicReference();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AtomicReference f15445OooO0OO = new AtomicReference();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final AtomicReference f15446OooO0Oo = new AtomicReference();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzen f15447OooO00o;

    public zzeo(zzen zzenVar) {
        this.f15447OooO00o = zzenVar;
    }

    public static final String OooO0oO(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            Object obj = strArr[i];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String OooO00o(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbOooO00o = o0o0Oo.OooO00o("[");
        for (Object obj : objArr) {
            String strOooO0O0 = obj instanceof Bundle ? OooO0O0((Bundle) obj) : String.valueOf(obj);
            if (strOooO0O0 != null) {
                if (sbOooO00o.length() != 1) {
                    sbOooO00o.append(", ");
                }
                sbOooO00o.append(strOooO0O0);
            }
        }
        sbOooO00o.append("]");
        return sbOooO00o.toString();
    }

    public final String OooO0O0(Bundle bundle) {
        String strOooO00o;
        if (bundle == null) {
            return null;
        }
        if (!this.f15447OooO00o.zza()) {
            return bundle.toString();
        }
        StringBuilder sbOooO00o = o0o0Oo.OooO00o("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbOooO00o.length() != 8) {
                sbOooO00o.append(", ");
            }
            sbOooO00o.append(OooO0o0(str));
            sbOooO00o.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strOooO00o = OooO00o(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strOooO00o = OooO00o((Object[]) obj);
            } else {
                strOooO00o = obj instanceof ArrayList ? OooO00o(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbOooO00o.append(strOooO00o);
        }
        sbOooO00o.append("}]");
        return sbOooO00o.toString();
    }

    public final String OooO0OO(zzau zzauVar) {
        String string;
        zzen zzenVar = this.f15447OooO00o;
        if (!zzenVar.zza()) {
            return zzauVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzauVar.zzc);
        sb.append(",name=");
        sb.append(OooO0Oo(zzauVar.zza));
        sb.append(",params=");
        zzas zzasVar = zzauVar.zzb;
        if (zzasVar == null) {
            string = null;
        } else {
            string = !zzenVar.zza() ? zzasVar.toString() : OooO0O0(zzasVar.zzc());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String OooO0Oo(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15447OooO00o.zza() ? str : OooO0oO(str, zzhc.zzc, zzhc.zza, f15444OooO0O0);
    }

    public final String OooO0o(String str) {
        if (str == null) {
            return null;
        }
        if (this.f15447OooO00o.zza()) {
            return str.startsWith("_exp_") ? o000oOoO.OooO0O0("experiment_id(", str, ")") : OooO0oO(str, zzhe.zzb, zzhe.zza, f15446OooO0Oo);
        }
        return str;
    }

    public final String OooO0o0(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15447OooO00o.zza() ? str : OooO0oO(str, zzhd.zzb, zzhd.zza, f15445OooO0OO);
    }
}
