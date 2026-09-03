package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class o0OO0oO0 extends AbstractMap {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f15114OooOO0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f15116OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f15119OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile o0OO0o f15120OooO0oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List f15118OooO0o0 = Collections.emptyList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Map f15117OooO0o = Collections.emptyMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Map f15115OooO = Collections.emptyMap();

    public void OooO00o() {
        if (this.f15119OooO0oO) {
            return;
        }
        this.f15117OooO0o = this.f15117OooO0o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15117OooO0o);
        this.f15115OooO = this.f15115OooO.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15115OooO);
        this.f15119OooO0oO = true;
    }

    public final int OooO0O0() {
        return this.f15118OooO0o0.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        OooO0oO();
        int iOooO0Oo = OooO0Oo(comparable);
        if (iOooO0Oo >= 0) {
            return ((o0OOooO0) this.f15118OooO0o0.get(iOooO0Oo)).setValue(obj);
        }
        OooO0oO();
        boolean zIsEmpty = this.f15118OooO0o0.isEmpty();
        int i = this.f15116OooO0Oo;
        if (zIsEmpty && !(this.f15118OooO0o0 instanceof ArrayList)) {
            this.f15118OooO0o0 = new ArrayList(i);
        }
        int i2 = -(iOooO0Oo + 1);
        if (i2 >= i) {
            return OooO0o().put(comparable, obj);
        }
        if (this.f15118OooO0o0.size() == i) {
            o0OOooO0 o0ooooo0 = (o0OOooO0) this.f15118OooO0o0.remove(i - 1);
            OooO0o().put(o0ooooo0.f15128OooO0Oo, o0ooooo0.f15130OooO0o0);
        }
        this.f15118OooO0o0.add(i2, new o0OOooO0(this, comparable, obj));
        return null;
    }

    public final int OooO0Oo(Comparable comparable) {
        int size = this.f15118OooO0o0.size() - 1;
        int i = 0;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((o0OOooO0) this.f15118OooO0o0.get(size)).f15128OooO0Oo);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = comparable.compareTo(((o0OOooO0) this.f15118OooO0o0.get(i2)).f15128OooO0Oo);
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public final SortedMap OooO0o() {
        OooO0oO();
        if (this.f15117OooO0o.isEmpty() && !(this.f15117OooO0o instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15117OooO0o = treeMap;
            this.f15115OooO = treeMap.descendingMap();
        }
        return (SortedMap) this.f15117OooO0o;
    }

    public final Object OooO0o0(int i) {
        OooO0oO();
        Object obj = ((o0OOooO0) this.f15118OooO0o0.remove(i)).f15130OooO0o0;
        if (!this.f15117OooO0o.isEmpty()) {
            Iterator it = OooO0o().entrySet().iterator();
            List list = this.f15118OooO0o0;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new o0OOooO0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final void OooO0oO() {
        if (this.f15119OooO0oO) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0oO();
        if (!this.f15118OooO0o0.isEmpty()) {
            this.f15118OooO0o0.clear();
        }
        if (this.f15117OooO0o.isEmpty()) {
            return;
        }
        this.f15117OooO0o.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return OooO0Oo(comparable) >= 0 || this.f15117OooO0o.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f15120OooO0oo == null) {
            this.f15120OooO0oo = new o0OO0o(this);
        }
        return this.f15120OooO0oo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OO0oO0)) {
            return super.equals(obj);
        }
        o0OO0oO0 o0oo0oo1 = (o0OO0oO0) obj;
        int size = size();
        if (size != o0oo0oo1.size()) {
            return false;
        }
        int iOooO0O0 = OooO0O0();
        if (iOooO0O0 != o0oo0oo1.OooO0O0()) {
            return entrySet().equals(o0oo0oo1.entrySet());
        }
        for (int i = 0; i < iOooO0O0; i++) {
            if (!((Map.Entry) this.f15118OooO0o0.get(i)).equals((Map.Entry) o0oo0oo1.f15118OooO0o0.get(i))) {
                return false;
            }
        }
        if (iOooO0O0 != size) {
            return this.f15117OooO0o.equals(o0oo0oo1.f15117OooO0o);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iOooO0Oo = OooO0Oo(comparable);
        return iOooO0Oo >= 0 ? ((o0OOooO0) this.f15118OooO0o0.get(iOooO0Oo)).f15130OooO0o0 : this.f15117OooO0o.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iOooO0O0 = OooO0O0();
        int iHashCode = 0;
        for (int i = 0; i < iOooO0O0; i++) {
            iHashCode += ((o0OOooO0) this.f15118OooO0o0.get(i)).hashCode();
        }
        return this.f15117OooO0o.size() > 0 ? this.f15117OooO0o.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        OooO0oO();
        Comparable comparable = (Comparable) obj;
        int iOooO0Oo = OooO0Oo(comparable);
        if (iOooO0Oo >= 0) {
            return OooO0o0(iOooO0Oo);
        }
        if (this.f15117OooO0o.isEmpty()) {
            return null;
        }
        return this.f15117OooO0o.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15117OooO0o.size() + this.f15118OooO0o0.size();
    }
}
