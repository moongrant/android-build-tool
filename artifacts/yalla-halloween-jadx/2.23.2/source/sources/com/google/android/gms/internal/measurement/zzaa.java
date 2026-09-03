package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaa {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f15169OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f15170OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f15171OooO0OO;

    public zzaa(String str, long j, Map map) {
        this.f15169OooO00o = str;
        this.f15170OooO0O0 = j;
        HashMap map2 = new HashMap();
        this.f15171OooO0OO = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.f15170OooO0O0 == zzaaVar.f15170OooO0O0 && this.f15169OooO00o.equals(zzaaVar.f15169OooO00o)) {
            return this.f15171OooO0OO.equals(zzaaVar.f15171OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f15169OooO00o.hashCode() * 31;
        long j = this.f15170OooO0O0;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f15171OooO0OO.hashCode();
    }

    public final String toString() {
        String str = this.f15169OooO00o;
        String string = this.f15171OooO0OO.toString();
        StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("Event{name='", str, "', timestamp=");
        sbOooO0O0.append(this.f15170OooO0O0);
        sbOooO0O0.append(", params=");
        sbOooO0O0.append(string);
        sbOooO0O0.append("}");
        return sbOooO0O0.toString();
    }

    public final long zza() {
        return this.f15170OooO0O0;
    }

    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.f15169OooO00o, this.f15170OooO0O0, new HashMap(this.f15171OooO0OO));
    }

    public final Object zzc(String str) {
        HashMap map = this.f15171OooO0OO;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final String zzd() {
        return this.f15169OooO00o;
    }

    public final Map zze() {
        return this.f15171OooO0OO;
    }

    public final void zzf(String str) {
        this.f15169OooO00o = str;
    }

    public final void zzg(String str, Object obj) {
        HashMap map = this.f15171OooO0OO;
        if (obj == null) {
            map.remove(str);
        } else {
            map.put(str, obj);
        }
    }
}
