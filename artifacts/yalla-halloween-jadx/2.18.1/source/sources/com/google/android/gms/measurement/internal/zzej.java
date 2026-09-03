package com.google.android.gms.measurement.internal;

import OooO00o.OooO00o;
import OooO0o.OooO0OO;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzej {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final AtomicReference f16124OooO0O0 = new AtomicReference();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AtomicReference f16125OooO0OO = new AtomicReference();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final AtomicReference f16126OooO0Oo = new AtomicReference();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzei f16127OooO00o;

    public zzej(zzei zzeiVar) {
        this.f16127OooO00o = zzeiVar;
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("[");
        for (Object obj : objArr) {
            String strOooO0O0 = obj instanceof Bundle ? OooO0O0((Bundle) obj) : String.valueOf(obj);
            if (strOooO0O0 != null) {
                if (sbOooO0o0.length() != 1) {
                    sbOooO0o0.append(", ");
                }
                sbOooO0o0.append(strOooO0O0);
            }
        }
        sbOooO0o0.append("]");
        return sbOooO0o0.toString();
    }

    public final String OooO0O0(Bundle bundle) {
        String strOooO00o;
        if (bundle == null) {
            return null;
        }
        if (!this.f16127OooO00o.zza()) {
            return bundle.toString();
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbOooO0o0.length() != 8) {
                sbOooO0o0.append(", ");
            }
            sbOooO0o0.append(OooO0o0(str));
            sbOooO0o0.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strOooO00o = OooO00o(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strOooO00o = OooO00o((Object[]) obj);
            } else {
                strOooO00o = obj instanceof ArrayList ? OooO00o(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbOooO0o0.append(strOooO00o);
        }
        sbOooO0o0.append("}]");
        return sbOooO0o0.toString();
    }

    public final String OooO0OO(zzaw zzawVar) {
        String string;
        if (!this.f16127OooO00o.zza()) {
            return zzawVar.toString();
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("origin=");
        sbOooO0o0.append(zzawVar.zzc);
        sbOooO0o0.append(",name=");
        sbOooO0o0.append(OooO0Oo(zzawVar.zza));
        sbOooO0o0.append(",params=");
        zzau zzauVar = zzawVar.zzb;
        if (zzauVar == null) {
            string = null;
        } else {
            string = !this.f16127OooO00o.zza() ? zzauVar.toString() : OooO0O0(zzauVar.zzc());
        }
        sbOooO0o0.append(string);
        return sbOooO0o0.toString();
    }

    public final String OooO0Oo(String str) {
        if (str == null) {
            return null;
        }
        return !this.f16127OooO00o.zza() ? str : OooO0oO(str, zzgv.zzc, zzgv.zza, f16124OooO0O0);
    }

    public final String OooO0o(String str) {
        if (str == null) {
            return null;
        }
        if (this.f16127OooO00o.zza()) {
            return str.startsWith("_exp_") ? OooO0OO.OooO00o("experiment_id(", str, ")") : OooO0oO(str, zzgx.zzb, zzgx.zza, f16126OooO0Oo);
        }
        return str;
    }

    public final String OooO0o0(String str) {
        if (str == null) {
            return null;
        }
        return !this.f16127OooO00o.zza() ? str : OooO0oO(str, zzgw.zzb, zzgw.zza, f16125OooO0OO);
    }
}
