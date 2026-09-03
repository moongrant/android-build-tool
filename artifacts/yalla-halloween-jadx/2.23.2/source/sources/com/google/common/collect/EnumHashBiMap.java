package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class EnumHashBiMap<K extends Enum<K>, V> extends OooO0O0<K, V> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public transient Class<K> f18636OooO;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18636OooO = (Class) objectInputStream.readObject();
        OooO0o0(new EnumMap(this.f18636OooO), new HashMap((this.f18636OooO.getEnumConstants().length * 3) / 2));
        o0O00oO0.OooO0O0(this, objectInputStream, objectInputStream.readInt());
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f18636OooO);
        o0O00oO0.OooO0o0(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooO0O0
    public final Object OooO0OO(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.OooO0O0, com.google.common.collect.o000, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public final Object put(Object obj, @ParametricNullness Object obj2) {
        return super.put((Enum) obj, obj2);
    }
}
