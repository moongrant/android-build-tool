package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends OooO0O0<K, V> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public transient Class<K> f18122OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public transient Class<V> f18123OoooO0O;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18122OoooO0 = (Class) objectInputStream.readObject();
        this.f18123OoooO0O = (Class) objectInputStream.readObject();
        OooO0oo(new EnumMap(this.f18122OoooO0), new EnumMap(this.f18123OoooO0O));
        o0O00.OooO0O0(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f18122OoooO0);
        objectOutputStream.writeObject(this.f18123OoooO0O);
        o0O00.OooO0o0(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooO0O0
    public final Object OooO0OO(Object obj) {
        Enum r1 = (Enum) obj;
        Objects.requireNonNull(r1);
        return r1;
    }

    @Override // com.google.common.collect.OooO0O0
    public final Object OooO0o0(Object obj) {
        Enum r1 = (Enum) obj;
        Objects.requireNonNull(r1);
        return r1;
    }
}
