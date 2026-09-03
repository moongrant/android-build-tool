package p039OoooOoO;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO00<K, V> extends o000O<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3744Oooo0oo + 2;
        this.f3744Oooo0oo = i;
        Object[] objArr = this.f3742Oooo0o;
        return new o0000Ooo(objArr[i - 2], objArr[i - 1]);
    }
}
