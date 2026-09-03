package p357o0OOOo0O;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p375o0OOo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo<T> implements o0OOO0o<Set<T>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Set<T> f38349OooO0O0 = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Set<o0OOO0o<T>> f38348OooO00o = Collections.newSetFromMap(new ConcurrentHashMap());

    public o0000Ooo(Collection<o0OOO0o<T>> collection) {
        this.f38348OooO00o.addAll(collection);
    }

    @Override // p375o0OOo0oo.o0OOO0o
    public final Object get() {
        if (this.f38349OooO0O0 == null) {
            synchronized (this) {
                if (this.f38349OooO0O0 == null) {
                    this.f38349OooO0O0 = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        Iterator<o0OOO0o<T>> it = this.f38348OooO00o.iterator();
                        while (it.hasNext()) {
                            this.f38349OooO0O0.add(it.next().get());
                        }
                        this.f38348OooO00o = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f38349OooO0O0);
    }
}
