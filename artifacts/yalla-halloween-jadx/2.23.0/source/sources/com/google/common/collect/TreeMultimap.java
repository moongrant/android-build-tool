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
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class TreeMultimap<K, V> extends o000oOoO<Object, Object> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient Comparator<? super K> f19370OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public transient Comparator<? super V> f19371OooOO0O;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator<? super K> comparator = (Comparator) objectInputStream.readObject();
        comparator.getClass();
        this.f19370OooOO0 = comparator;
        Comparator<? super V> comparator2 = (Comparator) objectInputStream.readObject();
        comparator2.getClass();
        this.f19371OooOO0O = comparator2;
        OooOOo(new TreeMap(this.f19370OooOO0));
        o0O00oO0.OooO0OO(this, objectInputStream, objectInputStream.readInt());
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f19370OooOO0);
        objectOutputStream.writeObject(this.f19371OooOO0O);
        o0O00oO0.OooO0o(this, objectOutputStream);
    }

    @Override // com.google.common.collect.o000oOoO, com.google.common.collect.OooOo, com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    public final Map OooO0O0() {
        return (NavigableMap) ((SortedMap) super.OooO0O0());
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    public final Map<K, Collection<V>> OooO0o0() {
        return OooOOO0();
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    public final Set<Object> OooO0oO() {
        return OooOOO();
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooOO0O() {
        return new TreeSet(this.f19371OooOO0O);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection<V> OooOO0o(@ParametricNullness K k) {
        if (k == null) {
            this.f19370OooOO0.compare(k, k);
        }
        return OooOO0O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.OooOo
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOo */
    public final Set get(@ParametricNullness Object obj) {
        return (NavigableSet) OooOoO(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.OooOo, com.google.common.collect.o00OO
    @GwtIncompatible
    public final Collection get(@ParametricNullness Object obj) {
        return (NavigableSet) OooOoO(obj);
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    public final Set keySet() {
        return (NavigableSet) ((SortedSet) super.keySet());
    }
}
