package com.google.android.gms.internal.measurement;

import Oooo000.o00O0O;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaa {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f15878OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f15879OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f15880OooO0OO;

    public zzaa(String str, long j, Map map) {
        this.f15878OooO00o = str;
        this.f15879OooO0O0 = j;
        HashMap map2 = new HashMap();
        this.f15880OooO0OO = map2;
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
        if (this.f15879OooO0O0 == zzaaVar.f15879OooO0O0 && this.f15878OooO00o.equals(zzaaVar.f15878OooO00o)) {
            return this.f15880OooO0OO.equals(zzaaVar.f15880OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f15878OooO00o.hashCode();
        long j = this.f15879OooO0O0;
        return this.f15880OooO0OO.hashCode() + (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f15878OooO00o;
        long j = this.f15879OooO0O0;
        String string = this.f15880OooO0OO.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        return o00O0O.OooO0O0(sb, ", params=", string, "}");
    }

    public final long zza() {
        return this.f15879OooO0O0;
    }

    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.f15878OooO00o, this.f15879OooO0O0, new HashMap(this.f15880OooO0OO));
    }

    public final Object zzc(String str) {
        if (this.f15880OooO0OO.containsKey(str)) {
            return this.f15880OooO0OO.get(str);
        }
        return null;
    }

    public final String zzd() {
        return this.f15878OooO00o;
    }

    public final Map zze() {
        return this.f15880OooO0OO;
    }

    public final void zzf(String str) {
        this.f15878OooO00o = str;
    }

    public final void zzg(String str, Object obj) {
        if (obj == null) {
            this.f15880OooO0OO.remove(str);
        } else {
            this.f15880OooO0OO.put(str, obj);
        }
    }
}
