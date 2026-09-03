package p318o0O0oOo;

import androidx.annotation.GuardedBy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000<E> implements Iterable<E> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Object f36665Oooo0o = new Object();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @GuardedBy("lock")
    public final Map<E, Integer> f36666Oooo0oO = new HashMap();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @GuardedBy("lock")
    public Set<E> f36667Oooo0oo = Collections.emptySet();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @GuardedBy("lock")
    public List<E> f36664Oooo = Collections.emptyList();

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f36665Oooo0o) {
            it = this.f36664Oooo.iterator();
        }
        return it;
    }
}
