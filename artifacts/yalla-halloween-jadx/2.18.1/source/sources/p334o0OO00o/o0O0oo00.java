package p334o0OO00o;

import OooO0o.OooO0OO;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0oo00 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Comparable f37405Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object f37406Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0OO000o f37407Oooo0oo;

    public o0O0oo00(o0OO000o o0oo000o, Comparable comparable, Object obj) {
        this.f37407Oooo0oo = o0oo000o;
        this.f37405Oooo0o = comparable;
        this.f37406Oooo0oO = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f37405Oooo0o.compareTo(((o0O0oo00) obj).f37405Oooo0o);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f37405Oooo0o;
        Object key = entry.getKey();
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f37406Oooo0oO;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f37405Oooo0o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f37406Oooo0oO;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f37405Oooo0o;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f37406Oooo0oO;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        o0OO000o o0oo000o = this.f37407Oooo0oo;
        int i = o0OO000o.f37413OoooO0O;
        o0oo000o.OooO();
        Object obj2 = this.f37406Oooo0oO;
        this.f37406Oooo0oO = obj;
        return obj2;
    }

    public final String toString() {
        return OooO0OO.OooO00o(String.valueOf(this.f37405Oooo0o), "=", String.valueOf(this.f37406Oooo0oO));
    }
}
