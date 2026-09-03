package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import p265o00ooo00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzx implements Map, Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @CheckForNull
    public transient zzy f16060Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @CheckForNull
    public transient zzy f16061Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @CheckForNull
    public transient zzr f16062Oooo0oo;

    public abstract zzr OooO00o();

    public abstract zzy OooO0O0();

    public abstract zzy OooO0OO();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzag.OooO00o(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzy zzyVar = this.f16061Oooo0oO;
        if (zzyVar != null) {
            return zzyVar;
        }
        zzy zzyVarOooO0OO = OooO0OO();
        this.f16061Oooo0oO = zzyVarOooO0OO;
        return zzyVarOooO0OO;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(Oooo0.OooO00o(44, "size cannot be negative but was: ", size));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzr values() {
        zzr zzrVar = this.f16062Oooo0oo;
        if (zzrVar != null) {
            return zzrVar;
        }
        zzr zzrVarOooO00o = OooO00o();
        this.f16062Oooo0oo = zzrVarOooO00o;
        return zzrVarOooO00o;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzy entrySet() {
        zzy zzyVar = this.f16060Oooo0o;
        if (zzyVar != null) {
            return zzyVar;
        }
        zzy zzyVarOooO0O0 = OooO0O0();
        this.f16060Oooo0o = zzyVarOooO0O0;
        return zzyVarOooO0O0;
    }
}
