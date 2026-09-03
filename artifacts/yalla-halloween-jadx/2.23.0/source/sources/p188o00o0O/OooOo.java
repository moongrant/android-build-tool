package p188o00o0O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OooOo<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap<K, V> f38793OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f38794OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f38795OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38796OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f38797OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f38798OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f38799OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f38800OooO0oo;

    public OooOo(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f38795OooO0OO = i;
        this.f38793OooO00o = new LinkedHashMap<>(0, 0.75f, true);
    }

    @Nullable
    public V OooO00o(@NonNull K k) {
        return null;
    }

    public void OooO0O0(@NonNull Object obj, @NonNull Object obj2, @Nullable Object obj3) {
    }

    public final int OooO0OO(K k, V v) {
        int iOooO0Oo = OooO0Oo(k, v);
        if (iOooO0Oo >= 0) {
            return iOooO0Oo;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public int OooO0Oo(@NonNull K k, @NonNull V v) {
        return 1;
    }

    public final synchronized int createCount() {
        return this.f38798OooO0o0;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.f38797OooO0o;
    }

    @Nullable
    public final V get(@NonNull K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f38793OooO00o.get(k);
            if (v != null) {
                this.f38799OooO0oO++;
                return v;
            }
            this.f38800OooO0oo++;
            V vOooO00o = OooO00o(k);
            if (vOooO00o == null) {
                return null;
            }
            synchronized (this) {
                this.f38798OooO0o0++;
                vPut = this.f38793OooO00o.put(k, vOooO00o);
                if (vPut != null) {
                    this.f38793OooO00o.put(k, vPut);
                } else {
                    this.f38794OooO0O0 += OooO0OO(k, vOooO00o);
                }
            }
            if (vPut != null) {
                OooO0O0(k, vOooO00o, vPut);
                return vPut;
            }
            trimToSize(this.f38795OooO0OO);
            return vOooO00o;
        }
    }

    public final synchronized int hitCount() {
        return this.f38799OooO0oO;
    }

    public final synchronized int maxSize() {
        return this.f38795OooO0OO;
    }

    public final synchronized int missCount() {
        return this.f38800OooO0oo;
    }

    @Nullable
    public final V put(@NonNull K k, @NonNull V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f38796OooO0Oo++;
            this.f38794OooO0O0 += OooO0OO(k, v);
            vPut = this.f38793OooO00o.put(k, v);
            if (vPut != null) {
                this.f38794OooO0O0 -= OooO0OO(k, vPut);
            }
        }
        if (vPut != null) {
            OooO0O0(k, vPut, v);
        }
        trimToSize(this.f38795OooO0OO);
        return vPut;
    }

    public final synchronized int putCount() {
        return this.f38796OooO0Oo;
    }

    @Nullable
    public final V remove(@NonNull K k) {
        V vRemove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            vRemove = this.f38793OooO00o.remove(k);
            if (vRemove != null) {
                this.f38794OooO0O0 -= OooO0OO(k, vRemove);
            }
        }
        if (vRemove != null) {
            OooO0O0(k, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f38795OooO0OO = i;
        }
        trimToSize(i);
    }

    public final synchronized int size() {
        return this.f38794OooO0O0;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.f38793OooO00o);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f38799OooO0oO;
        i2 = this.f38800OooO0oo + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f38795OooO0OO), Integer.valueOf(this.f38799OooO0oO), Integer.valueOf(this.f38800OooO0oo), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public void trimToSize(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.f38794OooO0O0 < 0 || (this.f38793OooO00o.isEmpty() && this.f38794OooO0O0 != 0)) {
                    break;
                }
                if (this.f38794OooO0O0 > i && !this.f38793OooO00o.isEmpty()) {
                    Map.Entry<K, V> next = this.f38793OooO00o.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.f38793OooO00o.remove(key);
                    this.f38794OooO0O0 -= OooO0OO(key, value);
                    this.f38797OooO0o++;
                }
                return;
            }
            OooO0O0(key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
