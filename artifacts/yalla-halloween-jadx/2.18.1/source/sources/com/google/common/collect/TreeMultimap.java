package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public class TreeMultimap<K, V> extends o000oOoO<Object, Object> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public transient Comparator<? super K> f18376OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public transient Comparator<? super V> f18377OoooO0O;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator<? super K> comparator = (Comparator) objectInputStream.readObject();
        Objects.requireNonNull(comparator);
        this.f18376OoooO0 = comparator;
        Comparator<? super V> comparator2 = (Comparator) objectInputStream.readObject();
        Objects.requireNonNull(comparator2);
        this.f18377OoooO0O = comparator2;
        OooOOO0(new TreeMap(this.f18376OoooO0));
        o0O00.OooO0OO(this, objectInputStream, objectInputStream.readInt());
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f18376OoooO0);
        objectOutputStream.writeObject(this.f18377OoooO0O);
        o0O00.OooO0o(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooO() {
        return new TreeSet(this.f18377OoooO0O);
    }

    @Override // com.google.common.collect.o000oOoO, com.google.common.collect.OooOo, com.google.common.collect.OooOOO, com.google.common.collect.o00OO0O0
    public final Map OooO0O0() {
        return (NavigableMap) ((SortedMap) super.OooO0O0());
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    public final Map<K, Collection<V>> OooO0Oo() {
        Map<K, Collection<V>> map = this.f18314Oooo;
        if (map instanceof NavigableMap) {
            return new OooOO0.OooO((NavigableMap) this.f18314Oooo);
        }
        return map instanceof SortedMap ? new OooOO0.OooOOO0((SortedMap) this.f18314Oooo) : new OooOO0.OooO0O0(this.f18314Oooo);
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    public final Set OooO0o0() {
        Map<K, Collection<V>> map = this.f18314Oooo;
        if (map instanceof NavigableMap) {
            return new OooOO0.C0122OooOO0((NavigableMap) this.f18314Oooo);
        }
        return map instanceof SortedMap ? new OooOO0.OooOOO((SortedMap) this.f18314Oooo) : new OooOO0.OooO0o(this.f18314Oooo);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection<V> OooOO0(@NullableDecl K k) {
        if (k == null) {
            this.f18376OoooO0.compare(k, k);
        }
        return OooO();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.OooOo
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOOo0 */
    public final Set get(@NullableDecl Object obj) {
        return (NavigableSet) OooOOoo(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.OooOo, com.google.common.collect.o00OO0O0
    @GwtIncompatible
    public final Collection get(@NullableDecl Object obj) {
        return (NavigableSet) OooOOoo(obj);
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO0O0
    public final Set keySet() {
        return (NavigableSet) ((SortedSet) super.keySet());
    }
}
