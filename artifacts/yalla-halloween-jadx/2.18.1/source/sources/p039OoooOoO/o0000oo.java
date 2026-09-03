package p039OoooOoO;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0000oo<K, V, T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o000O<K, V, T>[] f3739Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f3740Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f3741Oooo0oo;

    public o0000oo(@NotNull o000O0O0<K, V> node, @NotNull o000O<K, V, T>[] path) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f3739Oooo0o = path;
        this.f3741Oooo0oo = true;
        path[0].OooO0OO(node.f3752OooO0Oo, node.OooO0oO() * 2);
        this.f3740Oooo0oO = 0;
        OooO0O0();
    }

    public final K OooO00o() {
        if (!this.f3741Oooo0oo) {
            throw new NoSuchElementException();
        }
        o000O<K, V, T> o000o = this.f3739Oooo0o[this.f3740Oooo0oO];
        return (K) o000o.f3742Oooo0o[o000o.f3744Oooo0oo];
    }

    public final void OooO0O0() {
        if (this.f3739Oooo0o[this.f3740Oooo0oO].OooO00o()) {
            return;
        }
        for (int i = this.f3740Oooo0oO; -1 < i; i--) {
            int iOooO0OO = OooO0OO(i);
            if (iOooO0OO == -1 && this.f3739Oooo0o[i].OooO0O0()) {
                o000O<K, V, T> o000o = this.f3739Oooo0o[i];
                o000o.OooO0O0();
                o000o.f3744Oooo0oo++;
                iOooO0OO = OooO0OO(i);
            }
            if (iOooO0OO != -1) {
                this.f3740Oooo0oO = iOooO0OO;
                return;
            }
            if (i > 0) {
                o000O<K, V, T> o000o2 = this.f3739Oooo0o[i - 1];
                o000o2.OooO0O0();
                o000o2.f3744Oooo0oo++;
            }
            o000O<K, V, T> o000o3 = this.f3739Oooo0o[i];
            o000O0O0.OooO00o oooO00o = o000O0O0.f3748OooO0o0;
            o000o3.OooO0OO(o000O0O0.f3747OooO0o.f3752OooO0Oo, 0);
        }
        this.f3741Oooo0oo = false;
    }

    public final int OooO0OO(int i) {
        if (this.f3739Oooo0o[i].OooO00o()) {
            return i;
        }
        if (!this.f3739Oooo0o[i].OooO0O0()) {
            return -1;
        }
        o000O<K, V, T> o000o = this.f3739Oooo0o[i];
        o000o.OooO0O0();
        Object obj = o000o.f3742Oooo0o[o000o.f3744Oooo0oo];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        o000O0O0 o000o0o1 = (o000O0O0) obj;
        if (i == 6) {
            o000O<K, V, T> o000o2 = this.f3739Oooo0o[i + 1];
            Object[] objArr = o000o0o1.f3752OooO0Oo;
            o000o2.OooO0OO(objArr, objArr.length);
        } else {
            this.f3739Oooo0o[i + 1].OooO0OO(o000o0o1.f3752OooO0Oo, o000o0o1.OooO0oO() * 2);
        }
        return OooO0OO(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3741Oooo0oo;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f3741Oooo0oo) {
            throw new NoSuchElementException();
        }
        T next = this.f3739Oooo0o[this.f3740Oooo0oO].next();
        OooO0O0();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
