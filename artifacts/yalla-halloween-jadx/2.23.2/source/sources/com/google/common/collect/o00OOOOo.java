package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOOOo<K, V> extends OooO<K, V> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient com.google.common.base.o000OOo<? extends List<V>> f19055OooOO0;

    public o00OOOOo(Map map, o00OOO0O.OooO00o oooO00o) {
        super(map);
        this.f19055OooOO0 = oooO00o;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f19055OooOO0 = (com.google.common.base.o000OOo) objectInputStream.readObject();
        OooOOo((Map) objectInputStream.readObject());
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f19055OooOO0);
        objectOutputStream.writeObject(this.f18831OooO0oo);
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    public final Map<K, Collection<V>> OooO0OO() {
        return OooOOO0();
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    public final Set<K> OooO0oO() {
        return OooOOO();
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooOO0O() {
        return this.f19055OooOO0.get();
    }
}
