package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhb {
    public static final zzhb zza = new zzhb(null, null, 100);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumMap f15548OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f15549OooO0O0;

    public zzhb(Boolean bool, Boolean bool2, int i) {
        EnumMap enumMap = new EnumMap(zzha.class);
        this.f15548OooO00o = enumMap;
        enumMap.put(zzha.AD_STORAGE, bool);
        enumMap.put(zzha.ANALYTICS_STORAGE, bool2);
        this.f15549OooO0O0 = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public static zzhb zzb(Bundle bundle, int i) {
        Boolean bool;
        if (bundle == null) {
            return new zzhb(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            String string = bundle.getString(zzhaVar.zzd);
            if (string == null) {
                bool = null;
            } else if (string.equals("granted")) {
                bool = Boolean.TRUE;
            } else if (string.equals("denied")) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
            enumMap.put(zzhaVar, bool);
        }
        return new zzhb(enumMap, i);
    }

    public static zzhb zzc(String str, int i) {
        EnumMap enumMap = new EnumMap(zzha.class);
        if (str != null) {
            int i2 = 0;
            while (true) {
                zzha[] zzhaVarArr = zzha.zzc;
                int length = zzhaVarArr.length;
                if (i2 >= 2) {
                    break;
                }
                zzha zzhaVar = zzhaVarArr[i2];
                int i3 = i2 + 2;
                if (i3 < str.length()) {
                    char cCharAt = str.charAt(i3);
                    Boolean bool = null;
                    if (cCharAt != '-') {
                        if (cCharAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (cCharAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(zzhaVar, bool);
                }
                i2++;
            }
        }
        return new zzhb(enumMap, i);
    }

    public static String zzh(Bundle bundle) {
        String string;
        zzha[] zzhaVarArrValues = zzha.values();
        int length = zzhaVarArrValues.length;
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i >= length) {
                return null;
            }
            zzha zzhaVar = zzhaVarArrValues[i];
            if (bundle.containsKey(zzhaVar.zzd) && (string = bundle.getString(zzhaVar.zzd)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i++;
        }
    }

    public static boolean zzk(int i, int i2) {
        return i <= i2;
    }

    public final boolean equals(Object obj) {
        char c;
        if (!(obj instanceof zzhb)) {
            return false;
        }
        zzhb zzhbVar = (zzhb) obj;
        zzha[] zzhaVarArrValues = zzha.values();
        int length = zzhaVarArrValues.length;
        int i = 0;
        while (true) {
            char c2 = 1;
            if (i >= length) {
                return this.f15549OooO0O0 == zzhbVar.f15549OooO0O0;
            }
            zzha zzhaVar = zzhaVarArrValues[i];
            Boolean bool = (Boolean) this.f15548OooO00o.get(zzhaVar);
            if (bool == null) {
                c = 0;
            } else {
                c = bool.booleanValue() ? (char) 1 : (char) 2;
            }
            Boolean bool2 = (Boolean) zzhbVar.f15548OooO00o.get(zzhaVar);
            if (bool2 == null) {
                c2 = 0;
            } else if (!bool2.booleanValue()) {
                c2 = 2;
            }
            if (c != c2) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int i = this.f15549OooO0O0 * 17;
        for (Boolean bool : this.f15548OooO00o.values()) {
            i = (i * 31) + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: source=");
        sb.append(this.f15549OooO0O0);
        for (zzha zzhaVar : zzha.values()) {
            sb.append(", ");
            sb.append(zzhaVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f15548OooO00o.get(zzhaVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public final int zza() {
        return this.f15549OooO0O0;
    }

    public final zzhb zzd(zzhb zzhbVar) {
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean boolValueOf = (Boolean) this.f15548OooO00o.get(zzhaVar);
            Boolean bool = (Boolean) zzhbVar.f15548OooO00o.get(zzhaVar);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(zzhaVar, boolValueOf);
        }
        return new zzhb(enumMap, 100);
    }

    public final zzhb zze(zzhb zzhbVar) {
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean bool = (Boolean) this.f15548OooO00o.get(zzhaVar);
            if (bool == null) {
                bool = (Boolean) zzhbVar.f15548OooO00o.get(zzhaVar);
            }
            enumMap.put(zzhaVar, bool);
        }
        return new zzhb(enumMap, this.f15549OooO0O0);
    }

    public final Boolean zzf() {
        return (Boolean) this.f15548OooO00o.get(zzha.AD_STORAGE);
    }

    public final Boolean zzg() {
        return (Boolean) this.f15548OooO00o.get(zzha.ANALYTICS_STORAGE);
    }

    public final String zzi() {
        StringBuilder sb = new StringBuilder("G1");
        zzha[] zzhaVarArr = zzha.zzc;
        int length = zzhaVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f15548OooO00o.get(zzhaVarArr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean zzj(zzha zzhaVar) {
        Boolean bool = (Boolean) this.f15548OooO00o.get(zzhaVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean zzl() {
        Iterator it = this.f15548OooO00o.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzm(zzhb zzhbVar) {
        return zzn(zzhbVar, (zzha[]) this.f15548OooO00o.keySet().toArray(new zzha[0]));
    }

    public final boolean zzn(zzhb zzhbVar, zzha... zzhaVarArr) {
        for (zzha zzhaVar : zzhaVarArr) {
            Boolean bool = (Boolean) this.f15548OooO00o.get(zzhaVar);
            Boolean bool2 = (Boolean) zzhbVar.f15548OooO00o.get(zzhaVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public zzhb(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(zzha.class);
        this.f15548OooO00o = enumMap2;
        enumMap2.putAll(enumMap);
        this.f15549OooO0O0 = i;
    }
}
