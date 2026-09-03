package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmc extends LinkedHashMap {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final zzmc f15758OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15759OooO0Oo;

    static {
        zzmc zzmcVar = new zzmc();
        f15758OooO0o0 = zzmcVar;
        zzmcVar.f15759OooO0Oo = false;
    }

    private zzmc() {
        this.f15759OooO0Oo = true;
    }

    public static int OooO0O0(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zzld) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = zzlj.f15753OooO00o;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public static zzmc zza() {
        return f15758OooO0o0;
    }

    public final void OooO0Oo() {
        if (!this.f15759OooO0Oo) {
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
        int iOooO0O0 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iOooO0O0 += OooO0O0(entry.getValue()) ^ OooO0O0(entry.getKey());
        }
        return iOooO0O0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        OooO0Oo();
        Charset charset = zzlj.f15753OooO00o;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        OooO0Oo();
        for (Object obj : map.keySet()) {
            Charset charset = zzlj.f15753OooO00o;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        OooO0Oo();
        return super.remove(obj);
    }

    public final zzmc zzb() {
        return isEmpty() ? new zzmc() : new zzmc(this);
    }

    public final void zzc() {
        this.f15759OooO0Oo = false;
    }

    public final void zzd(zzmc zzmcVar) {
        OooO0Oo();
        if (zzmcVar.isEmpty()) {
            return;
        }
        putAll(zzmcVar);
    }

    public final boolean zze() {
        return this.f15759OooO0Oo;
    }

    public zzmc(Map map) {
        super(map);
        this.f15759OooO0Oo = true;
    }
}
