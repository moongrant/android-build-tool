package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaa {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f15645OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f15646OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f15647OooO0OO;

    public zzaa(String str, long j, Map map) {
        this.f15645OooO00o = str;
        this.f15646OooO0O0 = j;
        HashMap map2 = new HashMap();
        this.f15647OooO0OO = map2;
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
        if (this.f15646OooO0O0 == zzaaVar.f15646OooO0O0 && this.f15645OooO00o.equals(zzaaVar.f15645OooO00o)) {
            return this.f15647OooO0OO.equals(zzaaVar.f15647OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f15645OooO00o.hashCode() * 31;
        long j = this.f15646OooO0O0;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f15647OooO0OO.hashCode();
    }

    public final String toString() {
        String str = this.f15645OooO00o;
        String string = this.f15647OooO0OO.toString();
        StringBuilder sbOooO00o = p004OooO0oO.o0OoOo0.OooO00o("Event{name='", str, "', timestamp=");
        sbOooO00o.append(this.f15646OooO0O0);
        sbOooO00o.append(", params=");
        sbOooO00o.append(string);
        sbOooO00o.append("}");
        return sbOooO00o.toString();
    }

    public final long zza() {
        return this.f15646OooO0O0;
    }

    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.f15645OooO00o, this.f15646OooO0O0, new HashMap(this.f15647OooO0OO));
    }

    public final Object zzc(String str) {
        HashMap map = this.f15647OooO0OO;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final String zzd() {
        return this.f15645OooO00o;
    }

    public final Map zze() {
        return this.f15647OooO0OO;
    }

    public final void zzf(String str) {
        this.f15645OooO00o = str;
    }

    public final void zzg(String str, Object obj) {
        HashMap map = this.f15647OooO0OO;
        if (obj == null) {
            map.remove(str);
        } else {
            map.put(str, obj);
        }
    }
}
