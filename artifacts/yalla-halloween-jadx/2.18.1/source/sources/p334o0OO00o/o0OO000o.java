package p334o0OO00o;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class o0OO000o extends AbstractMap {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f37413OoooO0O = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f37414Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f37415Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List f37416Oooo0oO = Collections.emptyList();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Map f37417Oooo0oo = Collections.emptyMap();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Map f37418OoooO0 = Collections.emptyMap();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public volatile o0OO000 f37419OoooO00;

    public final void OooO() {
        if (this.f37414Oooo) {
            throw new UnsupportedOperationException();
        }
    }

    public void OooO00o() {
        if (this.f37414Oooo) {
            return;
        }
        this.f37417Oooo0oo = this.f37417Oooo0oo.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f37417Oooo0oo);
        this.f37418OoooO0 = this.f37418OoooO0.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f37418OoooO0);
        this.f37414Oooo = true;
    }

    public final int OooO0O0() {
        return this.f37416Oooo0oO.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        OooO();
        int iOooO0o0 = OooO0o0(comparable);
        if (iOooO0o0 >= 0) {
            return ((o0O0oo00) this.f37416Oooo0oO.get(iOooO0o0)).setValue(obj);
        }
        OooO();
        if (this.f37416Oooo0oO.isEmpty() && !(this.f37416Oooo0oO instanceof ArrayList)) {
            this.f37416Oooo0oO = new ArrayList(this.f37415Oooo0o);
        }
        int i = -(iOooO0o0 + 1);
        if (i >= this.f37415Oooo0o) {
            return OooO0oo().put(comparable, obj);
        }
        int size = this.f37416Oooo0oO.size();
        int i2 = this.f37415Oooo0o;
        if (size == i2) {
            o0O0oo00 o0o0oo00 = (o0O0oo00) this.f37416Oooo0oO.remove(i2 - 1);
            OooO0oo().put(o0o0oo00.f37405Oooo0o, o0o0oo00.f37406Oooo0oO);
        }
        this.f37416Oooo0oO.add(i, new o0O0oo00(this, comparable, obj));
        return null;
    }

    public final Map.Entry OooO0Oo(int i) {
        return (Map.Entry) this.f37416Oooo0oO.get(i);
    }

    public final int OooO0o0(Comparable comparable) {
        int size = this.f37416Oooo0oO.size() - 1;
        int i = 0;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((o0O0oo00) this.f37416Oooo0oO.get(size)).f37405Oooo0o);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = comparable.compareTo(((o0O0oo00) this.f37416Oooo0oO.get(i2)).f37405Oooo0o);
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

    public final Object OooO0oO(int i) {
        OooO();
        Object obj = ((o0O0oo00) this.f37416Oooo0oO.remove(i)).f37406Oooo0oO;
        if (!this.f37417Oooo0oo.isEmpty()) {
            Iterator it = OooO0oo().entrySet().iterator();
            List list = this.f37416Oooo0oO;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new o0O0oo00(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final SortedMap OooO0oo() {
        OooO();
        if (this.f37417Oooo0oo.isEmpty() && !(this.f37417Oooo0oo instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f37417Oooo0oo = treeMap;
            this.f37418OoooO0 = treeMap.descendingMap();
        }
        return (SortedMap) this.f37417Oooo0oo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO();
        if (!this.f37416Oooo0oO.isEmpty()) {
            this.f37416Oooo0oO.clear();
        }
        if (this.f37417Oooo0oo.isEmpty()) {
            return;
        }
        this.f37417Oooo0oo.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return OooO0o0(comparable) >= 0 || this.f37417Oooo0oo.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f37419OoooO00 == null) {
            this.f37419OoooO00 = new o0OO000(this);
        }
        return this.f37419OoooO00;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OO000o)) {
            return super.equals(obj);
        }
        o0OO000o o0oo000o = (o0OO000o) obj;
        int size = size();
        if (size != o0oo000o.size()) {
            return false;
        }
        int iOooO0O0 = OooO0O0();
        if (iOooO0O0 != o0oo000o.OooO0O0()) {
            return entrySet().equals(o0oo000o.entrySet());
        }
        for (int i = 0; i < iOooO0O0; i++) {
            if (!OooO0Oo(i).equals(o0oo000o.OooO0Oo(i))) {
                return false;
            }
        }
        if (iOooO0O0 != size) {
            return this.f37417Oooo0oo.equals(o0oo000o.f37417Oooo0oo);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iOooO0o0 = OooO0o0(comparable);
        return iOooO0o0 >= 0 ? ((o0O0oo00) this.f37416Oooo0oO.get(iOooO0o0)).f37406Oooo0oO : this.f37417Oooo0oo.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iOooO0O0 = OooO0O0();
        int iHashCode = 0;
        for (int i = 0; i < iOooO0O0; i++) {
            iHashCode += ((o0O0oo00) this.f37416Oooo0oO.get(i)).hashCode();
        }
        return this.f37417Oooo0oo.size() > 0 ? this.f37417Oooo0oo.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        OooO();
        Comparable comparable = (Comparable) obj;
        int iOooO0o0 = OooO0o0(comparable);
        if (iOooO0o0 >= 0) {
            return OooO0oO(iOooO0o0);
        }
        if (this.f37417Oooo0oo.isEmpty()) {
            return null;
        }
        return this.f37417Oooo0oo.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f37417Oooo0oo.size() + this.f37416Oooo0oO.size();
    }
}
