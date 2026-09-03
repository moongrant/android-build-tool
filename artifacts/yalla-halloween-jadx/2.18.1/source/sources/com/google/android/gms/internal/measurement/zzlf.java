package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlf extends LinkedHashMap {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final zzlf f15986Oooo0oO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f15987Oooo0o;

    static {
        zzlf zzlfVar = new zzlf();
        f15986Oooo0oO = zzlfVar;
        zzlfVar.f15987Oooo0o = false;
    }

    private zzlf() {
        this.f15987Oooo0o = true;
    }

    public static int OooO0OO(Object obj) {
        if (obj instanceof byte[]) {
            return zzkm.zzb((byte[]) obj);
        }
        if (obj instanceof zzkg) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static zzlf zza() {
        return f15986Oooo0oO;
    }

    public final void OooO0Oo() {
        if (!this.f15987Oooo0o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0Oo();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iOooO0OO = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iOooO0OO += OooO0OO(entry.getValue()) ^ OooO0OO(entry.getKey());
        }
        return iOooO0OO;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        OooO0Oo();
        Charset charset = zzkm.f15980OooO00o;
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        OooO0Oo();
        for (Object obj : map.keySet()) {
            Charset charset = zzkm.f15980OooO00o;
            Objects.requireNonNull(obj);
            Objects.requireNonNull(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        OooO0Oo();
        return super.remove(obj);
    }

    public final zzlf zzb() {
        return isEmpty() ? new zzlf() : new zzlf(this);
    }

    public final void zzc() {
        this.f15987Oooo0o = false;
    }

    public final void zzd(zzlf zzlfVar) {
        OooO0Oo();
        if (zzlfVar.isEmpty()) {
            return;
        }
        putAll(zzlfVar);
    }

    public final boolean zze() {
        return this.f15987Oooo0o;
    }

    public zzlf(Map map) {
        super(map);
        this.f15987Oooo0o = true;
    }
}
