package p245o00oo0o;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O0<E> implements Iterable<E> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f40565OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("lock")
    public final HashMap f40567OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("lock")
    public Set<E> f40566OooO0o = Collections.emptySet();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("lock")
    public List<E> f40568OooO0oO = Collections.emptyList();

    public final void OooO00o(E e) {
        synchronized (this.f40565OooO0Oo) {
            Integer num = (Integer) this.f40567OooO0o0.get(e);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f40568OooO0oO);
            arrayList.remove(e);
            this.f40568OooO0oO = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f40567OooO0o0.remove(e);
                HashSet hashSet = new HashSet(this.f40566OooO0o);
                hashSet.remove(e);
                this.f40566OooO0o = Collections.unmodifiableSet(hashSet);
            } else {
                this.f40567OooO0o0.put(e, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f40565OooO0Oo) {
            it = this.f40568OooO0oO.iterator();
        }
        return it;
    }

    public final int o000OOo(E e) {
        int iIntValue;
        synchronized (this.f40565OooO0Oo) {
            iIntValue = this.f40567OooO0o0.containsKey(e) ? ((Integer) this.f40567OooO0o0.get(e)).intValue() : 0;
        }
        return iIntValue;
    }
}
