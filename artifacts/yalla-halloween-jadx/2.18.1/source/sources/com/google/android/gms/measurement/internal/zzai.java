package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.efs.sdk.base.core.util.NetworkUtil;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzai {
    public static final zzai zza = new zzai(null, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumMap f16078OooO00o;

    public zzai(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.f16078OooO00o = enumMap;
        enumMap.put(zzah.AD_STORAGE, bool);
        enumMap.put(zzah.ANALYTICS_STORAGE, bool2);
    }

    public static final int OooO00o(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean OooO0O0(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals(NetworkUtil.NETWORK_CLASS_DENIED)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static zzai zza(Bundle bundle) {
        if (bundle == null) {
            return zza;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            enumMap.put(zzahVar, OooO0O0(bundle.getString(zzahVar.zzd)));
        }
        return new zzai(enumMap);
    }

    public static zzai zzb(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i = 0;
            while (true) {
                zzah[] zzahVarArr = zzah.zzc;
                int length = zzahVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzah zzahVar = zzahVarArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char cCharAt = str.charAt(i2);
                    Boolean bool = null;
                    if (cCharAt != '-') {
                        if (cCharAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (cCharAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(zzahVar, bool);
                }
                i++;
            }
        }
        return new zzai(enumMap);
    }

    public static String zzg(Bundle bundle) {
        String string;
        for (zzah zzahVar : zzah.values()) {
            if (bundle.containsKey(zzahVar.zzd) && (string = bundle.getString(zzahVar.zzd)) != null && OooO0O0(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean zzj(int i, int i2) {
        return i <= i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        for (zzah zzahVar : zzah.values()) {
            if (OooO00o((Boolean) this.f16078OooO00o.get(zzahVar)) != OooO00o((Boolean) zzaiVar.f16078OooO00o.get(zzahVar))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f16078OooO00o.values().iterator();
        int iOooO00o = 17;
        while (it.hasNext()) {
            iOooO00o = (iOooO00o * 31) + OooO00o((Boolean) it.next());
        }
        return iOooO00o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        zzah[] zzahVarArrValues = zzah.values();
        int length = zzahVarArrValues.length;
        for (int i = 0; i < length; i++) {
            zzah zzahVar = zzahVarArrValues[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(zzahVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f16078OooO00o.get(zzahVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? NetworkUtil.NETWORK_CLASS_DENIED : "granted");
            }
        }
        return sb.toString();
    }

    public final zzai zzc(zzai zzaiVar) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean boolValueOf = (Boolean) this.f16078OooO00o.get(zzahVar);
            Boolean bool = (Boolean) zzaiVar.f16078OooO00o.get(zzahVar);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(zzahVar, boolValueOf);
        }
        return new zzai(enumMap);
    }

    public final zzai zzd(zzai zzaiVar) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.f16078OooO00o.get(zzahVar);
            if (bool == null) {
                bool = (Boolean) zzaiVar.f16078OooO00o.get(zzahVar);
            }
            enumMap.put(zzahVar, bool);
        }
        return new zzai(enumMap);
    }

    public final Boolean zze() {
        return (Boolean) this.f16078OooO00o.get(zzah.AD_STORAGE);
    }

    public final Boolean zzf() {
        return (Boolean) this.f16078OooO00o.get(zzah.ANALYTICS_STORAGE);
    }

    public final String zzh() {
        StringBuilder sb = new StringBuilder("G1");
        zzah[] zzahVarArr = zzah.zzc;
        int length = zzahVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f16078OooO00o.get(zzahVarArr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean zzi(zzah zzahVar) {
        Boolean bool = (Boolean) this.f16078OooO00o.get(zzahVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean zzk(zzai zzaiVar) {
        return zzl(zzaiVar, (zzah[]) this.f16078OooO00o.keySet().toArray(new zzah[0]));
    }

    public final boolean zzl(zzai zzaiVar, zzah... zzahVarArr) {
        for (zzah zzahVar : zzahVarArr) {
            Boolean bool = (Boolean) this.f16078OooO00o.get(zzahVar);
            Boolean bool2 = (Boolean) zzaiVar.f16078OooO00o.get(zzahVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public zzai(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.f16078OooO00o = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
