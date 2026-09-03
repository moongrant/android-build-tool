package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends OooO0O0<K, V> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public transient Class<K> f18634OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient Class<V> f18635OooOO0;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18634OooO = (Class) objectInputStream.readObject();
        this.f18635OooOO0 = (Class) objectInputStream.readObject();
        OooO0o0(new EnumMap(this.f18634OooO), new EnumMap(this.f18635OooOO0));
        o0O00oO0.OooO0O0(this, objectInputStream, objectInputStream.readInt());
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f18634OooO);
        objectOutputStream.writeObject(this.f18635OooOO0);
        o0O00oO0.OooO0o0(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooO0O0
    public final Object OooO0OO(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }

    @Override // com.google.common.collect.OooO0O0
    public final Object OooO0Oo(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }
}
